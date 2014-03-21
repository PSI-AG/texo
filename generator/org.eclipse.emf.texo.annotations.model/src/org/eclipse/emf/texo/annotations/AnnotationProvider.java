/**
 * <copyright>
 *
 * Copyright (c) 2011 Springsite BV (The Netherlands) and others
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
 * $Id: AnnotationProvider.java,v 1.1 2011/10/25 13:19:44 mtaal Exp $
 */

package org.eclipse.emf.texo.annotations;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation;

/**
 * Defines an interface for a class which can be used to get an annotation from the context build up during a generation
 * run.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public interface AnnotationProvider {

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
  public boolean isAnnotated(final ENamedElement eNamedElement, final String nsPrefix);

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
  public ENamedElementAnnotation getAnnotation(final ENamedElement eNamedElement, final String nsURI);
}
