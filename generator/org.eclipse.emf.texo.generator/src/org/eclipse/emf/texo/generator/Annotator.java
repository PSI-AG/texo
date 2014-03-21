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
 * $Id: Annotator.java,v 1.6 2011/08/25 12:34:30 mtaal Exp $
 */

package org.eclipse.emf.texo.generator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation;

/**
 * Defines the interface for a class responsible for annotating a certain modelelement in a certain annotation model.
 * The annotator must express which annotation EClass it can handle through the {@link #getAnnotationEClass()} method.
 * 
 * The annotation process has two steps. The first step will create annotations and set their basic information. In this
 * phase the {@link #setAnnotationFeatures(EModelElementAnnotation)} method is called. Then when all model elements have
 * an annotation the {@link #postAnnotating(EModelElementAnnotation)} method is called to allow building relations
 * between annotations.
 * 
 * The associations between annotations can be useful for templates.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public interface Annotator<E extends ENamedElementAnnotation> {

  void setAnnotationManager(AnnotationManager annotationManager);

  /**
   * The Annotator can set values in the annotation object. The Annotator should not overwrite already set features in
   * the annotation.
   * 
   * @param annotation
   *          the annotation to set values in.
   */
  void setAnnotationFeatures(E annotation);

  /**
   * Is called after all model elements have been annotated by all annotators. Can be used to for example set the
   * {@link EClassAnnotation#getEStructuralFeatureAnnotations()} feature. To build the associations/relations between
   * annotations.
   * 
   * @param annotation
   */
  void postAnnotating(E annotation);

  /**
   * The Annotation EClass which is handled by this Annotator. This is normally an EClass from the model supported by
   * the Annotator.
   * 
   * The annotation passed in the {@link #setAnnotationFeatures(EModelElementAnnotation)} must have this EClass or
   * extend the EClass.
   * 
   * @return the EClass handled by this annotator.
   */

  EClass getAnnotationEClass();
}
