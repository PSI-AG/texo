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
 * $Id: ModelAnnotator.java,v 1.10 2011/08/25 12:34:30 mtaal Exp $
 */

package org.eclipse.emf.texo.generator;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation;

/**
 * Each annotation model (jpa, jaxb, model) should implement a ModelAnnotator. The ModelAnnotator takes care of fully
 * annotating all model elements in a domain model.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public abstract class ModelAnnotator {

  private static ModelAnnotator codeGenAnnotator = null;

  public static ModelAnnotator getCodeGenAnnotator() {
    return codeGenAnnotator;
  }

  public static void setCodeGenAnnotator(ModelAnnotator codeGenAnnotator) {
    ModelAnnotator.codeGenAnnotator = codeGenAnnotator;
  }

  /**
   * The annotation model suffix is used to read additional annotations from files stored in the project. The annotation
   * suffix is for example orm or code-gen.
   * 
   * @return the annotation suffix for this annotator.
   */
  public abstract String getAnnotationModelSuffix();

  /**
   * Iterates over all model elements of the EPackages ({@link #getEPackages()}), including the EPackages themselves.
   * 
   * Calls {@link AnnotationManager#getAnnotation(ENamedElement, EClass)} for each model element. This ensures that an
   * annotation is created for each model element. The {@link #getAnnotationEClass(ENamedElement)} method is used to
   * determine which type of annotation to created for a model element.
   * 
   * The annotate method is the first step in the annotation process. The next method called is the
   * {@link #postAnnotate()} method.
   * 
   * @param ePackages
   *          the EPackage instances to annotate
   * @param annotationManager
   *          the annotationManager is responsible for managing manual and automatically created annotations
   * 
   * @see ModelController#annotate()
   * @see #postAnnotate()
   */
  public void annotate(List<EPackage> ePackages, AnnotationManager annotationManager) {

    ExtensionPointUtils.readAnnotationsModelsFromExtensions();

    for (EPackage ePackage : ePackages) {

      // annotate the epackage itself
      {
        final EClass annotationEClass = getAnnotationEClass(ePackage);
        if (annotationEClass != null) {
          annotationManager.getAnnotation(ePackage, annotationEClass);
        }
      }

      // and then its content
      final Iterator<EObject> iterator = ePackage.eAllContents();
      while (iterator.hasNext()) {
        final Object object = iterator.next();
        if (object instanceof ENamedElement) {
          final ENamedElement eNamedElement = (ENamedElement) object;
          final EClass annotationEClass = getAnnotationEClass(eNamedElement);

          if (annotationEClass != null) {
            annotationManager.getAnnotation(eNamedElement, annotationEClass);
          }
        }
      }
    }
  }

  /**
   * This method is called after all ModelAnnotators have created annotations and have fully annotated the model.
   * 
   * This method calls the {@link Annotator#postAnnotating(EModelElementAnnotation)} method for each model element
   * annotation.
   * 
   * @param ePackages
   *          the EPackage instances to annotate
   * @param annotationManager
   *          the annotationManager is responsible for managing manual and automatically created annotations
   */
  public void postAnnotate(List<EPackage> ePackages, AnnotationManager annotationManager) {
    // and then do the second step
    for (EPackage ePackage : ePackages) {

      // post annotate the epackage itself
      {
        final EClass annotationEClass = getAnnotationEClass(ePackage);
        if (annotationEClass != null) {
          final Annotator<ENamedElementAnnotation> annotator = annotationManager.getAnnotator(annotationEClass);
          final ENamedElementAnnotation annotation = annotationManager.getAnnotation(ePackage, annotationEClass);
          if (annotator != null) {
            annotator.postAnnotating(annotation);
          }
        }
      }

      // and then its content
      final Iterator<EObject> iterator = ePackage.eAllContents();
      while (iterator.hasNext()) {
        final Object object = iterator.next();
        if (object instanceof ENamedElement) {
          final ENamedElement eNamedElement = (ENamedElement) object;
          final EClass annotationEClass = getAnnotationEClass(eNamedElement);
          if (annotationEClass != null) {
            final Annotator<ENamedElementAnnotation> annotator = annotationManager.getAnnotator(annotationEClass);
            final ENamedElementAnnotation annotation = annotationManager.getAnnotation(eNamedElement, annotationEClass);
            if (annotator != null) {
              annotator.postAnnotating(annotation);
            }
          }
        }
      }
    }
  }

  /**
   * @param eNamedElement
   *          the model element from the domain model
   * @return the annotation EClass, instances of this EClass are used to annotate the model element. Note null may be
   *         returned, in which the model element is not annotated by this Model Annotator.
   */
  protected abstract EClass getAnnotationEClass(ENamedElement eNamedElement);

  /**
   * Returns the list of Annotator instances which take care of annotating the domain model. Normally there will be one
   * annotator for the EPackages, one for the EClasses, one for the EDataTypes, etc.
   * 
   * @return the list of Annotators
   */
  protected abstract List<Annotator<? extends ENamedElementAnnotation>> getAnnotators();
}
