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
 * $Id: ModelEClassifierAnnotator.java,v 1.12 2011/08/25 12:35:07 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.annotator;

import java.util.Locale;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Contains number of convenience methods for subclasses.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public abstract class ModelEClassifierAnnotator extends ModelENamedElementAnnotator {

  /**
   * @return the fully qualified implementation class name for the EClassifier. Is constructed from the package path of
   *         the EPackage and the simple class name.
   * @see EPackageModelGenAnnotation#getPackagePath()
   * @see #getSimpleClassName(EClassifier)
   */
  protected String getQualifiedClassName(EClassifier eClassifier, String simpleClassName) {
    String localSimpleClassName = simpleClassName;
    if (GeneratorUtils.isEmptyOrNull(localSimpleClassName)) {
      localSimpleClassName = getSimpleClassName(eClassifier);
    }
    final String qualifiedClassName = getEPackageModelGenAnnotation(eClassifier.getEPackage()).getPackagePath()
        .toLowerCase(Locale.ENGLISH) + GenConstants.DOT + localSimpleClassName;
    return qualifiedClassName;
  }

  /**
   * @return the name of the EClassifier with the first character upper-cased.
   * @see EClassifier#getName()
   */
  protected String getSimpleClassName(EClassifier eClassifier) {
    return ModelUtils.upCaseFirst(getName(eClassifier));
  }
}