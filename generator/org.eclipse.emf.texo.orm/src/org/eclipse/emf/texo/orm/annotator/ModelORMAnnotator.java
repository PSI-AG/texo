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
 * $Id: ModelORMAnnotator.java,v 1.6 2011/08/26 05:34:12 mtaal Exp $
 */

package org.eclipse.emf.texo.orm.annotator;

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
import org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage;

/**
 * Is responsible for generating annotations for one or more models and their dependencies.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ModelORMAnnotator extends ModelAnnotator {

  public static final String ANNOTATION_MODEL_SUFFIX = "orm"; //$NON-NLS-1$

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.ModelAnnotator#getAnnotationModelSuffix()
   */
  @Override
  public String getAnnotationModelSuffix() {
    return ANNOTATION_MODEL_SUFFIX;
  }

  @Override
  protected EClass getAnnotationEClass(ENamedElement eNamedElement) {
    if (eNamedElement instanceof EPackage) {
      return OrmannotationsPackage.eINSTANCE.getEPackageORMAnnotation();
    } else if (eNamedElement instanceof EClass) {
      return OrmannotationsPackage.eINSTANCE.getEClassORMAnnotation();
    } else if (eNamedElement instanceof EReference) {
      return OrmannotationsPackage.eINSTANCE.getEReferenceORMAnnotation();
    } else if (eNamedElement instanceof EAttribute) {
      return OrmannotationsPackage.eINSTANCE.getEAttributeORMAnnotation();
    } else if (eNamedElement instanceof EEnum) {
      return OrmannotationsPackage.eINSTANCE.getEEnumORMAnnotation();
    } else if (eNamedElement instanceof EDataType) {
      return OrmannotationsPackage.eINSTANCE.getEDataTypeORMAnnotation();
    }
    return null;
  }

  @Override
  protected List<Annotator<? extends ENamedElementAnnotation>> getAnnotators() {
    final List<Annotator<? extends ENamedElementAnnotation>> result = new ArrayList<Annotator<? extends ENamedElementAnnotation>>();
    result.add(new EPackageORMAnnotator());
    result.add(new EClassORMAnnotator());
    result.add(new EDataTypeORMAnnotator());
    result.add(new EEnumORMAnnotator());
    result.add(new EReferenceORMAnnotator());
    result.add(new EAttributeORMAnnotator());
    return result;
  }
}