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
 * $Id: ModelGenAnnotator.java,v 1.7 2011/08/25 12:35:07 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.annotator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation;
import org.eclipse.emf.texo.generator.Annotator;
import org.eclipse.emf.texo.generator.ModelAnnotator;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;

/**
 * Is responsible for generating annotations for one or more models and their dependencies.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ModelGenAnnotator extends ModelAnnotator {

  public static final String ANNOTATION_MODEL_SUFFIX = "code-gen"; //$NON-NLS-1$

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.ModelAnnotator#getAnnotationModelSuffix()
   */
  @Override
  public String getAnnotationModelSuffix() {
    return ANNOTATION_MODEL_SUFFIX;
  }

  public ModelGenAnnotator() {
    ModelAnnotator.setCodeGenAnnotator(this);
  }

  @Override
  protected EClass getAnnotationEClass(ENamedElement eNamedElement) {
    if (eNamedElement instanceof EPackage) {
      return ModelcodegeneratorPackage.eINSTANCE.getEPackageModelGenAnnotation();
    } else if (eNamedElement instanceof EClass) {
      return ModelcodegeneratorPackage.eINSTANCE.getEClassModelGenAnnotation();
    } else if (eNamedElement instanceof EReference) {
      return ModelcodegeneratorPackage.eINSTANCE.getEReferenceModelGenAnnotation();
    } else if (eNamedElement instanceof EAttribute) {
      return ModelcodegeneratorPackage.eINSTANCE.getEAttributeModelGenAnnotation();
    } else if (eNamedElement instanceof EEnum) {
      return ModelcodegeneratorPackage.eINSTANCE.getEEnumModelGenAnnotation();
    } else if (eNamedElement instanceof EDataType) {
      return ModelcodegeneratorPackage.eINSTANCE.getEDataTypeModelGenAnnotation();
    }
    return null;
  }

  @Override
  protected List<Annotator<? extends ENamedElementAnnotation>> getAnnotators() {
    final List<Annotator<? extends ENamedElementAnnotation>> result = new ArrayList<Annotator<? extends ENamedElementAnnotation>>();
    result.add(new ModelEPackageAnnotator());
    result.add(new ModelEClassAnnotator());
    result.add(new ModelEDataTypeAnnotator());
    result.add(new ModelEEnumAnnotator());
    result.add(new ModelEReferenceAnnotator());
    result.add(new ModelEAttributeAnnotator());
    return result;
  }
}