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
 * $Id: CodeGenAnnotatedModelGenerator.java,v 1.3 2011/08/25 12:36:19 mtaal Exp $
 */

package org.eclipse.emf.texo.eclipse.popup.actions;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.generator.ModelAnnotator;
import org.eclipse.emf.texo.generator.ModelAnnotatorRegistry;
import org.eclipse.emf.texo.modelgenerator.annotator.ModelGenAnnotator;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;

/**
 * Generates a fully annotated code gen model.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class CodeGenAnnotatedModelGenerator extends GenerateAnnotationModel {

  @Override
  protected List<ModelAnnotator> getModelAnnotators() {
    return Collections.singletonList(ModelAnnotatorRegistry.getInstance().getModelAnnotator(ModelGenAnnotator.class));
  }

  @Override
  protected boolean doOnlyInitialModel() {
    return false;
  }

  @Override
  protected String getModelAnnotatorSuffix() {
    return ModelGenAnnotator.ANNOTATION_MODEL_SUFFIX;
  }

  @Override
  protected EPackage getAnnotationEPackage() {
    return ModelcodegeneratorPackage.eINSTANCE;
  }
}