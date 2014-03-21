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
 * $Id: ModelAnnotatorRegistry.java,v 1.8 2011/08/25 12:34:30 mtaal Exp $
 */

package org.eclipse.emf.texo.generator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.texo.annotations.AnnotationModelSuffixHandler;

/**
 * Manages the available model annotators.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ModelAnnotatorRegistry {

  private static ModelAnnotatorRegistry instance = new ModelAnnotatorRegistry();

  public static ModelAnnotatorRegistry getInstance() {
    return instance;
  }

  public static void setInstance(ModelAnnotatorRegistry instance) {
    ModelAnnotatorRegistry.instance = instance;
  }

  private List<ModelAnnotator> modelAnnotators = new ArrayList<ModelAnnotator>();

  public void addModelAnnotator(ModelAnnotator modelAnnotator) {
    modelAnnotators.add(modelAnnotator);
    AnnotationModelSuffixHandler.getInstance().getSuffixes().add(modelAnnotator.getAnnotationModelSuffix());
  }

  public List<ModelAnnotator> getModelAnnotators() {
    if (modelAnnotators.isEmpty()) {
      modelAnnotators = new ArrayList<ModelAnnotator>();
      // initialize them
      ExtensionPointUtils.readModelAnnotatorsFromExtensions();
    }
    return modelAnnotators;
  }

  public ModelAnnotator getModelAnnotator(Class<?> modelAnnotatorClass) {
    for (ModelAnnotator modelAnnotator : getModelAnnotators()) {
      if (modelAnnotatorClass.isAssignableFrom(modelAnnotator.getClass())) {
        return modelAnnotator;
      }
    }
    throw new IllegalArgumentException("No model annotator for model annotator class: " //$NON-NLS-1$
        + modelAnnotatorClass);
  }

}
