/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ORMGenerator.java,v 1.14 2011/10/25 22:49:04 mtaal Exp $
 */

package org.eclipse.emf.texo.orm.annotator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelFactory;
import org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation;
import org.eclipse.emf.texo.eclipse.popup.actions.BaseGenerateAction;
import org.eclipse.emf.texo.generator.AnnotationManager;
import org.eclipse.emf.texo.generator.GeneratorConstants;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.generator.ModelAnnotatorRegistry;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.annotator.GenUtils;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Attributes;
import org.eclipse.emf.texo.orm.annotations.model.orm.Basic;
import org.eclipse.emf.texo.orm.annotations.model.orm.DocumentRoot;
import org.eclipse.emf.texo.orm.annotations.model.orm.Entity;
import org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType;
import org.eclipse.emf.texo.orm.annotations.model.orm.EnumType;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults;
import org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitMetadata;
import org.eclipse.emf.texo.orm.annotations.model.orm.SupportedVersionsType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Transient;
import org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage;
import org.eclipse.emf.texo.orm.ormannotations.util.OrmannotationsResourceFactoryImpl;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Generates an ORM model on the basis of an annotated model
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ORMGenerator extends BaseGenerateAction {

  private static final ThreadLocal<Boolean> inStandardsCompliantMode = new ThreadLocal<Boolean>();

  private static final String ORM_FILE_NAME = "orm.xml"; //$NON-NLS-1$

  public static boolean areInStandardsCompliantMode() {
    return inStandardsCompliantMode.get() != null && inStandardsCompliantMode.get();
  }

  public static void setInStandardsCompliantMode(Boolean complianceMode) {
    inStandardsCompliantMode.set(complianceMode);
  }

  /**
   * Generate java annotations for a set of annotations of the annotationOwner.
   * 
   * The annotationOwner is an instance of the {@link OrmannotationsPackage} eclasses.
   * 
   * @param annotationOwner
   * @return
   */
  public static String generateJavaAnnotations(EObject annotationOwner, List<EReference> includes,
      List<EReference> excludes, String identifier) {
    if (!isValidIdentifier(annotationOwner, identifier)) {
      return "";
    }
    final StringBuilder sb = new StringBuilder();
    for (EReference eReference : annotationOwner.eClass().getEAllReferences()) {
      if (includes != null && !includes.contains(eReference)) {
        continue;
      }
      if (excludes != null && excludes.contains(eReference)) {
        continue;
      }

      final Object value = annotationOwner.eGet(eReference);
      if (value instanceof BaseOrmAnnotation) {
        if (sb.length() > 0) {
          sb.append("\n"); //$NON-NLS-1$
        }
        sb.append(((BaseOrmAnnotation) value).getJavaAnnotation(identifier));
      }
    }

    return sb.toString();
  }

  // if the type has an accesstype set then generate the javaannotation
  // on the correct location
  private static boolean isValidIdentifier(EObject annotation, String identifier) {
    if (identifier.equals(GeneratorConstants.TYPE) || identifier.equals(GeneratorConstants.FEATUREMAP_TYPE)) {
      return true;
    }
    AccessType accessType = getAccessType(annotation, new ArrayList<EObject>());
    if (accessType == null) {
      accessType = AccessType.FIELD;
    }
    if (accessType == AccessType.FIELD
        && (identifier.equals(GeneratorConstants.FEATUREMAP_FIELD) || identifier.equals(GeneratorConstants.FIELD))) {
      return true;
    }
    if (accessType == AccessType.PROPERTY
        && (identifier.equals(GeneratorConstants.FEATUREMAP_GETTER) || identifier.equals(GeneratorConstants.GETTER))) {
      return true;
    }
    return false;
  }

  private static AccessType getAccessType(EObject annotation, List<EObject> visitedObjects) {
    visitedObjects.add(annotation);
    for (EStructuralFeature eFeature : annotation.eClass().getEAllStructuralFeatures()) {
      if (eFeature.isMany()) {
        continue;
      }
      if (eFeature.getEType() == OrmPackage.eINSTANCE.getAccessType() && annotation.eIsSet(eFeature)) {
        return (AccessType) annotation.eGet(eFeature);
      } else if (eFeature instanceof EReference && annotation.eIsSet(eFeature)
          && !visitedObjects.contains(annotation.eGet(eFeature))) {
        final AccessType at = getAccessType((EObject) annotation.eGet(eFeature), visitedObjects);
        if (at != null) {
          return at;
        }
      }
    }
    return null;
  }

  @Override
  protected void generateFromModelFiles(IProgressMonitor monitor, IProject project, List<IFile> modelFiles) {
    for (IFile modelFile : modelFiles) {
      generateFromModelFile(monitor, project, modelFile);
    }
  }

  protected void generateFromModelFile(IProgressMonitor monitor, IProject project, IFile modelFile) {

    ORMUtils.setORMMappingOptionsFromProjectProperties(project);

    try {
      // always start with a fresh epackage registry
      final java.net.URI uri = new java.net.URI(modelFile.getFullPath().toString());
      final List<EPackage> ePackages = GeneratorUtils.readEPackages(Collections.singletonList(uri),
          GeneratorUtils.createEPackageRegistry(), true);

      final URI parentUri = URI.createFileURI(modelFile.getLocation().toString()).trimSegments(1);
      final URI ormUri = parentUri.appendSegment(ORM_FILE_NAME);
      generateStoreORM(ePackages, ormUri);
    } catch (Exception e) {
      throw new IllegalStateException(e);
    } finally {
      ORMMappingOptions.setDefaultOptions(null);
    }
  }

  public ModelController generateStoreORM(List<EPackage> ePackages, URI ormUri) {
    final AnnotatedModel aModel = AnnotationsmodelFactory.eINSTANCE.createAnnotatedModel();
    final ModelController modelController = new ModelController();
    modelController.setEPackages(ePackages);
    modelController.getAnnotationManager().setAnnotatedModel(aModel);
    modelController.annotate(Collections.singletonList(ModelAnnotatorRegistry.getInstance().getModelAnnotator(
        ModelORMAnnotator.class)));

    final EntityMappingsType entityMappings = createEntityMappings(ePackages, aModel,
        modelController.getAnnotationManager());
    storeORM(ormUri, aModel, modelController.getAnnotationManager(), entityMappings);
    return modelController;
  }

  protected void storeORM(URI fileUri, AnnotatedModel annotatedModel, AnnotationManager annotationManager,
      EntityMappingsType entityMappings) {

    final Resource ormResource = new OrmannotationsResourceFactoryImpl().createResource(fileUri);
    FileOutputStream fos = null;
    try {
      final File file = new File(fileUri.toFileString());
      if (file.exists()) {
        file.delete();
      }
      file.createNewFile();
      fos = new FileOutputStream(file);
      ormResource.getContents().clear();
      final DocumentRoot docRoot = OrmFactory.eINSTANCE.createDocumentRoot();
      docRoot.setEntityMappings(entityMappings);
      ormResource.getContents().add(docRoot);
      ormResource.save(fos, Collections.emptyMap());
    } catch (IOException e) {
      throw new IllegalStateException(e);
    } finally {
      if (fos != null) {
        try {
          fos.close();
        } catch (Exception ignore) {

        }
      }
    }
  }

  protected void setPersistenceUnitMetaData(EntityMappingsType entityMappingsType) {
    final PersistenceUnitMetadata metadata = OrmFactory.eINSTANCE.createPersistenceUnitMetadata();
    final PersistenceUnitDefaults defaults = OrmFactory.eINSTANCE.createPersistenceUnitDefaults();

    defaults.setDelimitedIdentifiers(OrmFactory.eINSTANCE.createEmptyType());

    metadata.setPersistenceUnitDefaults(defaults);
    entityMappingsType.setPersistenceUnitMetadata(metadata);
  }

  protected EntityMappingsType createEntityMappings(List<EPackage> ePackages, AnnotatedModel annotatedModel,
      AnnotationManager annotationManager) {
    // create a new EntityMappings and copy the values over from the
    // entity mappings defined in the EPackages.
    final EntityMappingsType entityMappings = OrmFactory.eINSTANCE.createEntityMappingsType();
    for (EPackage ePackage : ePackages) {
      final EPackageORMAnnotation ePackageORMAnnotation = (EPackageORMAnnotation) annotationManager.getAnnotation(
          ePackage, OrmannotationsPackage.eINSTANCE.getEPackageORMAnnotation());
      if (ePackageORMAnnotation.getEntityMappings() != null) {
        mergeManyFeatures(entityMappings, ePackageORMAnnotation.getEntityMappings());
      }
    }

    if (ORMGenerator.areInStandardsCompliantMode()) {
      entityMappings.setVersion(SupportedVersionsType._20);
    } else {
      entityMappings.setVersion(SupportedVersionsType._23);
    }

    entityMappings.setAccess(AccessType.FIELD);

    boolean addDelimitedIdentifierTag = false;

    // used for testruns
    boolean isLibraryExample = false;
    for (EPackage ePackage : ePackages) {
      isLibraryExample |= ePackage.getName().equals("library");
      final AnnotatedEPackage aPackage = annotatedModel.getAnnotatedEPackage(ePackage, false);

      for (EPackageAnnotation ePackageAnnotation : aPackage.getEPackageAnnotations()) {
        if (ePackageAnnotation instanceof EPackageORMAnnotation) {
          final EPackageORMAnnotation ormAnnotation = (EPackageORMAnnotation) ePackageAnnotation;
          addDelimitedIdentifierTag |= ormAnnotation.isSetDelimitedIdentifierTagInORM();
        }
      }

      for (AnnotatedEClassifier aClassifier : aPackage.getAnnotatedEClassifiers()) {
        if (aClassifier instanceof AnnotatedEClass) {
          final AnnotatedEClass aClass = (AnnotatedEClass) aClassifier;
          for (EClassAnnotation eClassAnnotation : aClass.getEClassAnnotations()) {
            if (eClassAnnotation instanceof EClassORMAnnotation) {
              final EClassORMAnnotation eClassORMAnnotation = (EClassORMAnnotation) eClassAnnotation;
              if (eClassORMAnnotation.getTransient() != null) {
                continue;
              }

              if (aClass.getEClass().isInterface()) {
                continue;
              }

              if (GenUtils.isDocumentRoot(aClass.getEClass())) {
                continue;
              }

              if (ModelUtils.isEMap(aClass.getEClass())) {
                continue;
              }

              if (eClassORMAnnotation.getMappedSuperclass() != null) {
                eClassORMAnnotation.getMappedSuperclass().setAttributes(
                    collectAttributes(entityMappings, annotationManager, aClass.getEClass()));
                entityMappings.getMappedSuperclass().add(EcoreUtil.copy(eClassORMAnnotation.getMappedSuperclass()));
              } else if (eClassORMAnnotation.getEmbeddable() != null) {
                eClassORMAnnotation.getEmbeddable().setAttributes(
                    collectAttributes(entityMappings, annotationManager, aClass.getEClass()));
                entityMappings.getEmbeddable().add(EcoreUtil.copy(eClassORMAnnotation.getEmbeddable()));
              } else if (eClassORMAnnotation.getEntity() != null) {
                eClassORMAnnotation.getEntity().setAttributes(
                    collectAttributes(entityMappings, annotationManager, aClass.getEClass()));
                entityMappings.getEntity().add(EcoreUtil.copy(eClassORMAnnotation.getEntity()));
              }
            }
          }
        }
      }
    }

    if (addDelimitedIdentifierTag) {
      setPersistenceUnitMetaData(entityMappings);
    }

    if (isLibraryExample && ORMMappingOptions.getDefaultOptions().isTestRun()) {
      addNamedQuery(entityMappings);
    }

    return entityMappings;
  }

  private void addNamedQuery(EntityMappingsType entityMappingsType) {
    final NamedQuery namedQuery = OrmFactory.eINSTANCE.createNamedQuery();
    namedQuery.setName("testWriter");
    namedQuery.setQuery("select e, e.name from library_Writer e where e.name like :name");
    entityMappingsType.getNamedQuery().add(namedQuery);
  }

  private Attributes collectAttributes(EntityMappingsType entityMappings, AnnotationManager annotationManager,
      EClass eClass) {
    final Attributes attributes = OrmFactory.eINSTANCE.createAttributes();
    collectAttributes(entityMappings, annotationManager, eClass, attributes);
    return attributes;
  }

  private void collectAttributes(EntityMappingsType entityMappings, AnnotationManager annotationManager, EClass eClass,
      Attributes attributes) {
    for (EClass eSuperType : eClass.getESuperTypes()) {
      if (eSuperType.isInterface()) {
        collectAttributes(entityMappings, annotationManager, eSuperType, attributes);
      }
    }
    collectAttributes(entityMappings, annotationManager, eClass.getEReferences(), eClass.getEAttributes(), false,
        attributes);
  }

  private void collectAttributes(EntityMappingsType entityMappings, AnnotationManager annotationManager,
      List<EReference> eReferences, List<EAttribute> eAttributes, boolean mapFeatureMapFeatures, Attributes attributes) {
    for (EAttribute eAttribute : eAttributes) {

      // ignore volatile features
      if (!mapFeatureMapFeatures && eAttribute.isVolatile()) {
        continue;
      }

      if (FeatureMapUtil.isFeatureMap(eAttribute)) {
        mapFeatureMap(entityMappings, annotationManager, eAttribute);
      }

      final EAttributeORMAnnotation ormAnnotation = (EAttributeORMAnnotation) annotationManager.getAnnotation(
          eAttribute, OrmannotationsPackage.eINSTANCE.getEAttributeORMAnnotation());

      final EAttributeModelGenAnnotation genAnnotation = (EAttributeModelGenAnnotation) annotationManager
          .getAnnotation(eAttribute, ModelcodegeneratorPackage.eINSTANCE.getEAttributeModelGenAnnotation());

      // map features which are part of a featureMap as Transient
      // these are mapped later again see the mapFeatureMap method
      if (!mapFeatureMapFeatures && genAnnotation.getFeatureMapFeature() != null) {
        final Transient trsnt = OrmFactory.eINSTANCE.createTransient();
        trsnt.setName(genAnnotation.getValidJavaMemberName());
        attributes.getTransient().add(trsnt);
        continue;
      }

      copyFeatures(ormAnnotation, attributes);
    }

    for (EReference eReference : eReferences) {

      // ignore volatile features
      if (!mapFeatureMapFeatures && eReference.isVolatile()) {
        continue;
      }

      final EReferenceORMAnnotation ormAnnotation = (EReferenceORMAnnotation) annotationManager.getAnnotation(
          eReference, OrmannotationsPackage.eINSTANCE.getEReferenceORMAnnotation());

      final EReferenceModelGenAnnotation genAnnotation = (EReferenceModelGenAnnotation) annotationManager
          .getAnnotation(eReference, ModelcodegeneratorPackage.eINSTANCE.getEReferenceModelGenAnnotation());

      // map features which are part of a featureMap as Transient
      // these are mapped later again see the mapFeatureMap method
      if (!mapFeatureMapFeatures && genAnnotation.getFeatureMapFeature() != null) {
        final Transient trsnt = OrmFactory.eINSTANCE.createTransient();
        trsnt.setName(genAnnotation.getValidJavaMemberName());
        attributes.getTransient().add(trsnt);
        continue;
      }

      copyFeatures(ormAnnotation, attributes);
    }
  }

  private void copyFeatures(EObject sourceEObject, EObject targetEObject) {
    for (EReference eSourceReference : sourceEObject.eClass().getEAllReferences()) {
      if (eSourceReference.isContainment() && sourceEObject.eIsSet(eSourceReference)) {
        final EReference targetFeature = getTargetFeature(eSourceReference);
        if (targetFeature == null) {
          continue;
        }
        if (targetFeature.isMany()) {
          if (eSourceReference.isMany()) {
            @SuppressWarnings("unchecked")
            final Collection<EObject> values = (Collection<EObject>) sourceEObject.eGet(eSourceReference);
            @SuppressWarnings("unchecked")
            final Collection<Object> targetCollection = (Collection<Object>) targetEObject.eGet(targetFeature);
            targetCollection.addAll(EcoreUtil.copyAll(values));
          } else {
            final Object value = sourceEObject.eGet(eSourceReference);
            @SuppressWarnings("unchecked")
            final Collection<Object> targetCollection = (Collection<Object>) targetEObject.eGet(targetFeature);
            targetCollection.add(EcoreUtil.copy((EObject) value));
          }
        } else {
          final Object value = sourceEObject.eGet(eSourceReference);
          targetEObject.eSet(targetFeature, EcoreUtil.copy((EObject) value));
        }
      }
    }
  }

  private EReference getTargetFeature(EReference sourceFeature) {
    for (EReference eTargetFeature : OrmPackage.eINSTANCE.getAttributes().getEAllReferences()) {
      if (eTargetFeature.getEReferenceType() == sourceFeature.getEReferenceType()) {
        return eTargetFeature;
      }
    }
    return null;
  }

  private void mapFeatureMap(EntityMappingsType entityMappings, AnnotationManager annotationManager,
      EAttribute eAttribute) {
    final EAttributeModelGenAnnotation genAnnotation = (EAttributeModelGenAnnotation) annotationManager.getAnnotation(
        eAttribute, ModelcodegeneratorPackage.eINSTANCE.getEAttributeModelGenAnnotation());

    final EAttributeORMAnnotation ormAnnotation = (EAttributeORMAnnotation) annotationManager.getAnnotation(eAttribute,
        OrmannotationsPackage.eINSTANCE.getEAttributeORMAnnotation());

    final List<EStructuralFeatureModelGenAnnotation> modelGenFeatures = genAnnotation.getAllMemberFeatureMapFeatures();
    final List<EAttribute> eAttributes = new ArrayList<EAttribute>();
    final List<EReference> eReferences = new ArrayList<EReference>();
    for (EStructuralFeatureModelGenAnnotation modelGenFeature : modelGenFeatures) {
      // only ORM map the features which are directly part this efeature
      if (modelGenFeature.getFeatureMapFeature() != null
          && modelGenFeature.getFeatureMapFeature().getEStructuralFeature() != eAttribute) {
        continue;
      }
      if (modelGenFeature.getEStructuralFeature() instanceof EAttribute) {
        eAttributes.add((EAttribute) modelGenFeature.getEStructuralFeature());
      } else {
        eReferences.add((EReference) modelGenFeature.getEStructuralFeature());
      }
    }

    final Entity entity = ormAnnotation.getFeatureMapEntity();

    final Attributes attributes = OrmFactory.eINSTANCE.createAttributes();
    collectAttributes(entityMappings, annotationManager, eReferences, eAttributes, true, attributes);

    if (ModelUtils.isMixed(eAttribute)) {
      attributes.getBasic().add(createBasic("text"));
      attributes.getBasic().add(createBasic("cDATA"));
      attributes.getBasic().add(createBasic("comment"));
    }

    {
      final Basic featureBasic = OrmFactory.eINSTANCE.createBasic();
      featureBasic.setEnumerated(EnumType.STRING);
      featureBasic.setName("feature");
      featureBasic.setOptional(false);
      attributes.getBasic().add(featureBasic);
    }

    entity.setAttributes(attributes);

    entityMappings.getEntity().add(EcoreUtil.copy(entity));
  }

  private Basic createBasic(String name) {
    final Basic basic = OrmFactory.eINSTANCE.createBasic();
    basic.setLob(OrmFactory.eINSTANCE.createLob());
    basic.setName(name);
    basic.setOptional(true);
    return basic;
  }

  private void mergeManyFeatures(EObject o1, EObject o2) {
    for (EStructuralFeature eFeature : o1.eClass().getEAllStructuralFeatures()) {
      if (eFeature.isMany()) {
        if (eFeature instanceof EAttribute) {
          final EAttribute eAttribute = (EAttribute) eFeature;
          @SuppressWarnings("unchecked")
          final List<Object> o1Values = (List<Object>) o1.eGet(eAttribute);
          final List<?> o2Values = (List<?>) o2.eGet(eAttribute);
          o1Values.addAll(o2Values);
        } else {
          final EReference eReference = (EReference) eFeature;
          @SuppressWarnings("unchecked")
          final List<EObject> o1Values = (List<EObject>) o1.eGet(eReference);
          @SuppressWarnings("unchecked")
          final List<EObject> o2Values = (List<EObject>) o2.eGet(eReference);
          for (EObject o2Value : o2Values) {
            o1Values.add(EcoreUtil.copy(o2Value));
          }
        }
      }
    }
  }
}