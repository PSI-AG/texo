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
 * $Id: ModelEPackageAnnotator.java,v 1.26 2011/09/24 04:00:45 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.annotator;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EClassifierImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xcore.resource.XcoreResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.generator.Annotator;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;
import org.eclipse.emf.texo.utils.Check;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Responsible for setting the values in a {@link EPackageModelGenAnnotation}.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.26 $
 */

public class ModelEPackageAnnotator extends ModelENamedElementAnnotator implements
    Annotator<EPackageModelGenAnnotation> {

  private static String XCORE_SOURCE = "texo.xcore"; //$NON-NLS-1$
  private static String XCORE_KEY_VALUE = "true"; //$NON-NLS-1$

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#getAnnotationEClass()
   */
  @Override
  public EClass getAnnotationEClass() {
    return ModelcodegeneratorPackage.eINSTANCE.getEPackageModelGenAnnotation();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#annotate(org.eclipse.emf.texo.annotations.annotationsmodel
   * .ENamedElementAnnotation)
   */
  public void setAnnotationFeatures(EPackageModelGenAnnotation annotation) {

    final EPackage ePackage = annotation.getEPackage();

    // reorder the classifiers so that they follow the same order as the
    // standard EMF genmodel one, eclasses are registered before enums
    reorderEClassifiers(ePackage);

    super.annotate(annotation);

    Check.isNotNull(annotation.getEPackage(), "ePackage must be set");//$NON-NLS-1$

    final String packagePath;
    if (GeneratorUtils.isEmptyOrNull(annotation.getPackagePath())) {
      if (GeneratorUtils.isNotEmptyAndNotNull(annotation.getQualifiedClassName())) {
        final int lastIndex = annotation.getQualifiedClassName().lastIndexOf(GenConstants.DOT);
        packagePath = annotation.getQualifiedClassName().substring(0, lastIndex);
      } else {

        // in case of xcore the package is a real package
        // the normal texo behavior will remove the last part
        // therefore add a dummy part
        String nsUri = ePackage.getNsURI();
        if (ePackage.getEAnnotation(XCORE_SOURCE) != null) {
          nsUri += ".xcore"; //$NON-NLS-1$
        } else if (ePackage.eResource() != null) {
          final URI uri = URI.createURI(nsUri);
          final String resourceUri = ePackage.eResource().getURI().toString();
          if (resourceUri.endsWith("xcore")) { //$NON-NLS-1$
            if (uri.scheme() == null && uri.host() == null) {
              // add arbitrary extension
              nsUri += ".xcore"; //$NON-NLS-1$
            }
          }
        }

        packagePath = GenUtils.createJavaPackagePath(nsUri);
      }
      annotation.setPackagePath(packagePath);
    } else {
      packagePath = annotation.getPackagePath();
    }

    if (GeneratorUtils.isEmptyOrNull(annotation.getDaoClassesPackagePath())) {
      String patternName = "dao"; //$NON-NLS-1$
      if (!GeneratorUtils.isEmptyOrNull(annotation.getDaoPatternName())) {
        patternName = annotation.getDaoPatternName();
      }

      final String daoPackagePath = packagePath + GenConstants.DOT + patternName;
      annotation.setDaoClassesPackagePath(daoPackagePath);
    }

    if (ePackage.getESuperPackage() != null) {
      annotation.setHandleEcoreFile(false);
    }

    if (GeneratorUtils.isEmptyOrNull(annotation.getDaoRootClass())) {
      annotation.setDaoRootClass("org.eclipse.emf.texo.server.store.BaseDao"); //$NON-NLS-1$
    }

    if (GeneratorUtils.isEmptyOrNull(annotation.getModelClassesPackagePath())) {
      annotation.setModelClassesPackagePath(packagePath);
    }

    if (!GeneratorUtils.isEmptyOrNull(annotation.getSimpleClassName())) {
      annotation.setQualifiedClassName(annotation.getModelClassesPackagePath() + GenConstants.DOT
          + annotation.getSimpleClassName());
    } else if (GeneratorUtils.isEmptyOrNull(annotation.getQualifiedClassName())) {
      final String simpleName;
      if (GeneratorUtils.isEmptyOrNull(annotation.getSimpleClassName())) {
        simpleName = getSimpleClassName(ePackage);
      } else {
        simpleName = annotation.getSimpleClassName();
      }
      annotation.setQualifiedClassName(annotation.getModelClassesPackagePath() + GenConstants.DOT + simpleName
          + annotation.getModelPackageClassNamePostFix());
    }

    if (GeneratorUtils.isEmptyOrNull(annotation.getSimpleClassName())) {
      final int lastIndex = annotation.getQualifiedClassName().lastIndexOf(GenConstants.DOT);
      annotation.setSimpleClassName(annotation.getQualifiedClassName().substring(1 + lastIndex));
    }
    if (GeneratorUtils.isEmptyOrNull(annotation.getSimpleModelFactoryClassName())) {
      annotation.setSimpleModelFactoryClassName(getSimpleClassName(ePackage)
          + annotation.getModelFactoryClassNamePostFix());
    }
    if (GeneratorUtils.isEmptyOrNull(annotation.getEcoreFileName())) {
      annotation.setEcoreFileName(ePackage.getName() + ".ecore"); //$NON-NLS-1$
    }
    final List<EPackageModelGenAnnotation> dependsOn = getDependsOn(ePackage);
    if (annotation.getDependsOn().isEmpty()) {
      annotation.getDependsOn().addAll(dependsOn);
    }

    // force initialization of the subpackages
    final List<EPackage> subEPackages = new ArrayList<EPackage>();
    collectAllSubEPackages(ePackage, subEPackages);
    for (EPackage subEPackage : subEPackages) {
      final EPackageModelGenAnnotation genAnnotation = getEPackageModelGenAnnotation(subEPackage, false);
      annotation.getSubPackageModelGens().add(genAnnotation);
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @seeorg.eclipse.emf.texo.generator.Annotator#postAnnotating(org.eclipse.emf.texo.annotations.
   * annotationsmodel.ENamedElementAnnotation)
   */
  public void postAnnotating(EPackageModelGenAnnotation annotation) {
    final EPackage ePackage = annotation.getEPackage();

    if (annotation.getEClassifierModelGenAnnotations().isEmpty()) {
      for (EClassifier eClassifier : ePackage.getEClassifiers()) {
        if (eClassifier instanceof EClass) {
          final EClassModelGenAnnotation eClassifierAnnotation = (EClassModelGenAnnotation) getAnnotationManager()
              .getAnnotation(eClassifier, ModelcodegeneratorPackage.eINSTANCE.getEClassModelGenAnnotation());
          annotation.getEClassifierModelGenAnnotations().add(eClassifierAnnotation);
        } else if (eClassifier instanceof EEnum) {
          final EEnumModelGenAnnotation eClassifierAnnotation = (EEnumModelGenAnnotation) getAnnotationManager()
              .getAnnotation(eClassifier, ModelcodegeneratorPackage.eINSTANCE.getEEnumModelGenAnnotation());
          annotation.getEClassifierModelGenAnnotations().add(eClassifierAnnotation);
        } else if (eClassifier instanceof EDataType) {
          final EDataTypeModelGenAnnotation eClassifierAnnotation = (EDataTypeModelGenAnnotation) getAnnotationManager()
              .getAnnotation(eClassifier, ModelcodegeneratorPackage.eINSTANCE.getEDataTypeModelGenAnnotation());
          annotation.getEClassifierModelGenAnnotations().add(eClassifierAnnotation);
        } else {
          throw new IllegalStateException("Not supported here " + eClassifier); //$NON-NLS-1$
        }
      }
    }
    annotation.setEcoreFileContent(getEcoreFileContent(ePackage, getAllDependsOn(annotation)));
  }

  private String getSimpleClassName(EPackage ePackage) {
    return ModelUtils.upCaseFirst(getName(ePackage));
  }

  // See issue:
  // https://bugs.eclipse.org/bugs/show_bug.cgi?id=325427
  private void reorderEClassifiers(EPackage ePackage) {
    boolean reorderNeeded = false;
    boolean encounteredEDataType = false;

    for (EClassifier eClassifier : ePackage.getEClassifiers()) {
      if (eClassifier instanceof EDataType) {
        encounteredEDataType = true;
      } else if (encounteredEDataType) {
        reorderNeeded = true;
        break;
      }
    }
    if (!reorderNeeded) {
      return;
    }

    final List<EClass> eClasses = new ArrayList<EClass>();

    for (EClassifier eClassifier : ePackage.getEClassifiers()) {
      ((EClassifierImpl) eClassifier).setClassifierID(-1);
      if (eClassifier instanceof EClass) {
        eClasses.add((EClass) eClassifier);
      }
    }

    for (EPackage eSubPackage : ePackage.getESubpackages()) {
      reorderEClassifiers(eSubPackage);
    }

    ePackage.getEClassifiers().removeAll(eClasses);
    ePackage.getEClassifiers().addAll(0, eClasses);
  }

  /**
   * Compute the depends on and returns it. The depends on packages are all the packages which are refered from this
   * package.
   * 
   * @return the list of {@link ModelEPackageAnnotator} on which this one depends.
   */
  private List<EPackageModelGenAnnotation> getDependsOn(EPackage ePackage) {
    final List<EPackage> epacks = new ArrayList<EPackage>();

    // initialize the main package first
    if (ePackage.getESuperPackage() != null && !epacks.contains(ePackage.getESuperPackage())) {
      epacks.add(ePackage.getESuperPackage());
    }

    // get the epackage of the supertypes of each eclass
    for (final EClassifier eClassifier : ePackage.getEClassifiers()) {
      if (eClassifier instanceof EClass) {
        final EClass eClass = (EClass) eClassifier;
        for (final EClass superEClass : eClass.getESuperTypes()) {
          if (superEClass.getEPackage() != ePackage && !epacks.contains(superEClass.getEPackage())) {
            Check.isNotNull(superEClass.getEPackage(), "The epackage of the eclass " //$NON-NLS-1$
                + superEClass + " is not set, it is the superEClass of " //$NON-NLS-1$
                + eClass + ". This indicates that the super EClass is " //$NON-NLS-1$
                + "not loaded correctly, for example the file with " //$NON-NLS-1$
                + "the EPackage can not be found"); //$NON-NLS-1$
            epacks.add(superEClass.getEPackage());
          }
        }

        // now handle the efeatures
        for (final EReference eref : eClass.getEReferences()) {
          final EPackage refEPackage = eref.getEReferenceType().getEPackage();
          if (refEPackage != ePackage && !epacks.contains(refEPackage)) {
            epacks.add(refEPackage);
          }
        }
        for (final EAttribute eattr : eClass.getEAttributes()) {
          // incomplete model not caught by model validation
          if (eattr.getEType() == null) {
            continue;
          }
          final EPackage refEPackage = eattr.getEType().getEPackage();
          if (refEPackage != ePackage && !epacks.contains(refEPackage)) {
            epacks.add(refEPackage);
          }
        }
      }
    }

    // now the set of dependent epackages is found, get the CodeGenEPackage
    final List<EPackageModelGenAnnotation> dependsOn = new ArrayList<EPackageModelGenAnnotation>();
    for (final EPackage depEPackage : epacks) {
      if (depEPackage.getNsURI().equals(EcorePackage.eNS_URI) || depEPackage.getNsURI().equals(XMLTypePackage.eNS_URI)) {
        continue;
      }
      dependsOn.add(getEPackageModelGenAnnotation(depEPackage, false));
    }

    return dependsOn;
  }

  protected boolean isDescendant(EPackage currentEPackage, EPackage descendantPackage) {
    if (currentEPackage == descendantPackage) {
      return true;
    }
    if (descendantPackage.getESuperPackage() != null) {
      return isDescendant(currentEPackage, descendantPackage.getESuperPackage());
    }
    return false;
  }

  protected void collectAllSubEPackages(EPackage ePackage, List<EPackage> subEPackages) {
    for (EPackage eSubPackage : ePackage.getESubpackages()) {
      subEPackages.add(eSubPackage);
      collectAllSubEPackages(eSubPackage, subEPackages);
    }
  }

  // collects all depends on of subpackages
  private List<EPackageModelGenAnnotation> getAllDependsOn(EPackageModelGenAnnotation annotation) {
    final List<EPackageModelGenAnnotation> dependsOn = getDependsOn(annotation.getEPackage());
    final List<EPackage> subPackages = new ArrayList<EPackage>();
    collectAllSubEPackages(annotation.getEPackage(), subPackages);
    for (EPackage ePackage : subPackages) {
      final List<EPackageModelGenAnnotation> subDependsOns = getDependsOn(ePackage);
      for (EPackageModelGenAnnotation subDepends : subDependsOns) {
        if (!dependsOn.contains(subDepends) && !isDescendant(annotation.getEPackage(), subDepends.getEPackage())) {
          dependsOn.add(subDepends);
        }
      }
    }
    return dependsOn;
  }

  public String getEcoreFileContent(EPackage ePackage, List<EPackageModelGenAnnotation> dependsOn) {

    // final URI uri = URI.createURI(ePackage.getNsURI());
    final HashMap<Resource, URI> previousURI = new HashMap<Resource, URI>();
    try {
      if (ePackage.eResource() != null && ePackage.eResource().getResourceSet() != null) {
        ePackage.eResource().getResourceSet().getURIConverter().getURIMap()
            .putAll(EcorePlugin.computePlatformURIMap(true));
      }

      // store the epackage in a class readable file
      // in every package java impl package so that they can be
      // loaded. to ensure that references between packages use nsuri's
      // first the
      // uri of all other resources (containing the other epackages) has
      // to be
      // set to the nsuri of the other packages
      boolean dependsOnEcorePackage = false;
      boolean dependsOnXMLTypePackage = false;
      for (final EPackageModelGenAnnotation dependsOnAnnotation : dependsOn) {
        if (dependsOnAnnotation.getEPackage() == ePackage) { // skip this one
          continue;
        }
        final EPackage localEPackage = dependsOnAnnotation.getEPackage();

        dependsOnEcorePackage |= localEPackage == EcorePackage.eINSTANCE;
        dependsOnXMLTypePackage |= localEPackage == XMLTypePackage.eINSTANCE;
        final Resource res = setEPackageResource(localEPackage);
        previousURI.put(res, res.getURI());
        res.setURI(URI.createURI(localEPackage.getNsURI()));
      }

      if (!dependsOnEcorePackage) {
        final Resource res = setEPackageResource(EcorePackage.eINSTANCE);
        previousURI.put(res, res.getURI());
      }
      if (!dependsOnXMLTypePackage) {
        final Resource res = setEPackageResource(XMLTypePackage.eINSTANCE);
        previousURI.put(res, res.getURI());
      }

      final EcoreResourceFactoryImpl ecoreResourceFactory = new EcoreResourceFactoryImpl();
      // note the uri of the resource is the same as the one used to read
      // it again in
      // ModelUtils.readEPackagesFromFile
      final XMLResource outputRes = (XMLResource) ecoreResourceFactory
          .createResource(URI.createURI(GenConstants.EMPTY));
      previousURI.put(outputRes, URI.createURI(ePackage.getNsURI()));
      outputRes.getContents().add(EcoreUtil.copy(ePackage));

      final StringWriter sw = new StringWriter();
      outputRes.save(sw, Collections.EMPTY_MAP);
      return sw.toString();
      // set the uris back
    } catch (final IOException e) {
      throw new IllegalStateException(e);
    } finally {
      for (final Resource res : previousURI.keySet()) {
        res.setURI(previousURI.get(res));
      }
    }
  }

  private Resource setEPackageResource(EPackage ePackage) {
    Resource res = ePackage.eResource();
    // also move the epackages from an xcoreresource to a standard XMIresource
    if (res == null || res instanceof XcoreResource) {
      // flag the epackage as from an xcore source
      if (res instanceof XcoreResource) {
        final EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
        eAnnotation.setSource(XCORE_SOURCE);
        eAnnotation.getDetails().put(XCORE_KEY_VALUE, XCORE_KEY_VALUE);
        ePackage.getEAnnotations().add(eAnnotation);
      }
      res = new XMIResourceImpl();
      res.getContents().add(ePackage);
      res.setURI(URI.createURI(ePackage.getNsURI()));
    }
    return res;
  }

  @Override
  public String getName(ENamedElement namedElement) {
    final String name = super.getName(namedElement);
    if (name.indexOf(GenConstants.DOT) != -1) {
      return name.substring(1 + name.lastIndexOf(GenConstants.DOT));
    }
    return name;
  }
}