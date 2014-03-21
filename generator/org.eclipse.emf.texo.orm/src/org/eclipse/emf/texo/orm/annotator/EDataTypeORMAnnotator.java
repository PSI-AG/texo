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
 * $Id: EDataTypeORMAnnotator.java,v 1.3 2011/08/26 05:34:12 mtaal Exp $
 */

package org.eclipse.emf.texo.orm.annotator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.generator.Annotator;
import org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage;

/**
 * Responsible for creating the {@link EDataTypeORMAnnotation}.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public class EDataTypeORMAnnotator extends ETypeElementORMAnnotator implements Annotator<EDataTypeORMAnnotation> {

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#annotate(org.eclipse.emf.texo.annotations.annotationsmodel
   * .ENamedElementAnnotation)
   */
  public void setAnnotationFeatures(EDataTypeORMAnnotation annotation) {
  }

  /*
   * (non-Javadoc)
   * 
   * @seeorg.eclipse.emf.texo.generator.Annotator#postAnnotating(org.eclipse.emf.texo.annotations.
   * annotationsmodel.ENamedElementAnnotation)
   */
  public void postAnnotating(EDataTypeORMAnnotation annotation) {
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#getAnnotationEClass()
   */
  public EClass getAnnotationEClass() {
    return OrmannotationsPackage.eINSTANCE.getEDataTypeORMAnnotation();
  }
}