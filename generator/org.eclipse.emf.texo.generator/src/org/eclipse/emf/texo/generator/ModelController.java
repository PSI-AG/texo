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
 * $Id: ModelController.java,v 1.14 2011/10/25 13:19:41 mtaal Exp $
 */

package org.eclipse.emf.texo.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.annotations.AnnotationProvider;
import org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation;

/**
 * Is the main controller for annotating the models with the available annotators. Controls which EPackage instances are
 * annotated, calls annotators in a specific order and manages the single instance of the annotation manager.
 * 
 * An instance of this class is available in the templates as the modelController slot ( (
 * {@link ArtifactGenerator#setModelController(ModelController)}).
 * 
 * @see ModelAnnotator
 * @see Annotator
 * @see AnnotationManager
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ModelController implements AnnotationProvider {

  private List<EPackage> ePackages = new ArrayList<EPackage>();

  private AnnotationManager annotationManager = new AnnotationManager();

  /**
   * Annotates the model, first the code gen model annotator is called and then the other annotators are called in order
   * of their occurence in the list.
   * 
   * @param modelAnnotators
   *          the annotators to call in addition to the code gen annotator, it is valid to pass in an empty list
   * @see ModelAnnotator#getCodeGenAnnotator()
   */
  public void annotate(List<ModelAnnotator> modelAnnotators) {

    final List<EPackage> allEPackages = collectEPackages();

    ExtensionPointUtils.readModelAnnotatorsFromExtensions();

    final ModelAnnotator codeGenAnnotator = ModelAnnotator.getCodeGenAnnotator();
    annotationManager.addAnnotators(codeGenAnnotator);
    // annotate with the code generation annotations
    doAnnotate(codeGenAnnotator, allEPackages);

    // register all annotators so they can call each other
    for (ModelAnnotator modelAnnotator : ModelAnnotatorRegistry.getInstance().getModelAnnotators()) {
      if (modelAnnotator == codeGenAnnotator) {
        continue;
      }

      annotationManager.addAnnotators(modelAnnotator);
    }

    for (ModelAnnotator modelAnnotator : ModelAnnotatorRegistry.getInstance().getModelAnnotators()) {
      if (modelAnnotator == codeGenAnnotator) {
        continue;
      }

      doAnnotate(modelAnnotator, allEPackages);
    }
  }

  private List<EPackage> collectEPackages() {
    final List<EPackage> collectedEPackages = new ArrayList<EPackage>(ePackages);
    final List<EPackage> toCheckEPackages = new ArrayList<EPackage>(ePackages);
    final List<EPackage> newFoundEPackages = new ArrayList<EPackage>();
    int cnt = 0;
    do {
      cnt++;
      if (!newFoundEPackages.isEmpty()) {
        toCheckEPackages.clear();
        toCheckEPackages.addAll(newFoundEPackages);
        newFoundEPackages.clear();
      }
      for (EPackage ePackage : toCheckEPackages) {
        final List<EPackage> newDependsOn = getNewDependsOn(ePackage, collectedEPackages);
        newFoundEPackages.addAll(newDependsOn);
      }
      collectedEPackages.addAll(newFoundEPackages);
      if (cnt > 1000) {
        throw new IllegalStateException("More than a 1000 iterations, infinite cycle, illegal case, report on forum"); //$NON-NLS-1$
      }
    } while (!newFoundEPackages.isEmpty());

    // remove ecore and xmltype epackages
    for (EPackage toCheckEPackage : new ArrayList<EPackage>(collectedEPackages)) {
      if (toCheckEPackage.getNsURI().equals(EcorePackage.eNS_URI)
          || toCheckEPackage.getNsURI().equals(XMLTypePackage.eNS_URI)) {
        collectedEPackages.remove(toCheckEPackage);
      }
    }
    return collectedEPackages;
  }

  private List<EPackage> getNewDependsOn(EPackage ePackage, List<EPackage> collectedEPackages) {
    final List<EPackage> epacks = new ArrayList<EPackage>();

    // initialize the main package first
    if (ePackage.getESuperPackage() != null && !collectedEPackages.contains(ePackage.getESuperPackage())) {
      epacks.add(ePackage.getESuperPackage());
    }

    // get the epackage of the supertypes of each eclass
    for (final EClassifier eClassifier : ePackage.getEClassifiers()) {
      if (eClassifier instanceof EClass) {
        final EClass eClass = (EClass) eClassifier;
        for (final EClass superEClass : eClass.getESuperTypes()) {
          if (superEClass.getEPackage() != ePackage && !epacks.contains(superEClass.getEPackage())) {
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
    epacks.removeAll(collectedEPackages);
    return epacks;
  }

  private void doAnnotate(ModelAnnotator modelAnnotator, List<EPackage> toHandleEPackages) {
    modelAnnotator.annotate(toHandleEPackages, annotationManager);
    modelAnnotator.postAnnotate(toHandleEPackages, annotationManager);
  }

  public List<EPackage> getEPackages() {
    return ePackages;
  }

  public void setEPackages(final List<EPackage> ePackages) {
    this.ePackages = ePackages;
  }

  /**
   * Checks if there is annotation provided by the {@link EPackage} denoted by the prefix.
   * 
   * @param eNamedElement
   *          the model element to check for an annotation.
   * @param nsPrefix
   *          the identifier of the annotation {@link EPackage}
   * @return true if there is an annotation, false otherwise
   * @see #getAnnotation(ENamedElement, String)
   */
  public boolean isAnnotated(final ENamedElement eNamedElement, final String nsPrefix) {
    return null != getAnnotation(eNamedElement, nsPrefix);
  }

  /**
   * Convenience method for a template. Searches for the {@link ModelAnnotation} instances for the passed
   * {@link ENamedElement} and returns the first one belonging to an {@link EPackage} with the specified name space
   * prefix. The first annotation found is returned.
   * 
   * Returns null if no annotation can be found.
   * 
   * @param eNamedElement
   *          the named element to search annotations.
   * @param nsURI
   *          the name space uri used to select the epackage and filter the correct {@link EModelElementAnnotation}
   * @return the found annotation or null if none is found.
   */
  public ENamedElementAnnotation getAnnotation(final ENamedElement eNamedElement, final String nsURI) {
    final List<ENamedElementAnnotation> annotations = getAnnotationManager().getAnnotations(eNamedElement);
    for (final ENamedElementAnnotation annotation : annotations) {
      if (annotation.getENamedElement() == eNamedElement && annotation.eClass().getEPackage().getNsURI().equals(nsURI)) {
        return annotation;
      }
    }

    ENamedElement localElement = eNamedElement;
    while (!(localElement instanceof EPackage)) {
      localElement = (ENamedElement) localElement.eContainer();
    }

    for (ModelAnnotator modelAnnotator : ModelAnnotatorRegistry.getInstance().getModelAnnotators()) {
      modelAnnotator.annotate(Collections.singletonList((EPackage) localElement), annotationManager);
      modelAnnotator.postAnnotate(Collections.singletonList((EPackage) localElement), annotationManager);
    }

    return getAnnotation(eNamedElement, nsURI);
  }

  /**
   * Method is used to add java annotations to a generated class.
   * 
   * @param eNamedElement
   *          the element for which to create java annotations.
   * @param identifier
   *          identifies how the java annotations is used, examples of values: type, field, method
   * @return java annotations to add
   */
  public String getJavaAnnotations(final ENamedElement eNamedElement, final String identifier) {
    return getJavaAnnotations(eNamedElement, identifier, null);
  }

  /**
   * Method is used to add java annotations to a generated class.
   * 
   * @param eNamedElement
   *          the element for which to create java annotations.
   * @param identifier
   *          identifies how the java annotations is used, examples of values: type, field, method
   * @return java annotations to add
   */
  public String getJavaAnnotations(final ENamedElement eNamedElement, final String identifier, ENamedElement context) {

    if (eNamedElement instanceof EEnumLiteral) {
      return getEEnumLiteralAnnotations(eNamedElement);
    }

    final List<ENamedElementAnnotation> annotations = getAnnotationManager().getAnnotations(eNamedElement);
    final StringBuilder sb = new StringBuilder();
    for (final ENamedElementAnnotation annotation : annotations) {
      if (context != null && !annotation.isValidForContext(context)) {
        continue;
      }

      if (annotation.getENamedElement() == eNamedElement) {
        if (annotation.getLastIdentifier() != null) {
          // do some checking
          if (annotation.getLastIdentifier().equals(GeneratorConstants.FIELD)
              && (identifier.equals(GeneratorConstants.GETTER) || identifier.equals(GeneratorConstants.SETTER))) {
            // already set on a field, continue
            continue;
          }
          if (annotation.getLastIdentifier().equals(GeneratorConstants.FEATUREMAP_FIELD)
              && (identifier.equals(GeneratorConstants.FEATUREMAP_GETTER) || identifier
                  .equals(GeneratorConstants.FEATUREMAP_SETTER))) {
            // already set on a field, continue
            continue;
          }
        }
        final String javaAnnotation = annotation.getJavaAnnotation(this, identifier);
        if (javaAnnotation != null && javaAnnotation.trim().length() > 0) {
          if (sb.length() > 0) {
            sb.append("\n"); //$NON-NLS-1$
          }
          sb.append(javaAnnotation);
          annotation.setLastIdentifier(identifier);
        }
      }
    }

    return sb.toString();
  }

  private String getEEnumLiteralAnnotations(ENamedElement eNamedElement) {
    final String identifier = "type"; //$NON-NLS-1$
    final StringBuilder sb = new StringBuilder();
    for (EAnnotation eAnnotation : eNamedElement.getEAnnotations()) {
      if (!ENamedElementAnnotation.TEXO_JAVA_ANNOTATION.equals(eAnnotation.getSource())) {
        continue;
      }
      if (eAnnotation.getDetails().get(ENamedElementAnnotation.TEXO_JAVA_ANNOTATION_DETAIL_KEY) != null) {
        if (sb.length() > 0) {
          sb.append("\n"); //$NON-NLS-1$
        }
        sb.append(eAnnotation.getDetails().get(ENamedElementAnnotation.TEXO_JAVA_ANNOTATION_DETAIL_KEY));
      }
      if (eAnnotation.getDetails().get(identifier) != null) {
        if (sb.length() > 0) {
          sb.append("\n"); //$NON-NLS-1$
        }
        sb.append(eAnnotation.getDetails().get(identifier));
      }
    }
    return sb.toString();
  }

  public AnnotationManager getAnnotationManager() {
    return annotationManager;
  }

  public void setAnnotationManager(AnnotationManager annotationManager) {
    this.annotationManager = annotationManager;
  }
}
