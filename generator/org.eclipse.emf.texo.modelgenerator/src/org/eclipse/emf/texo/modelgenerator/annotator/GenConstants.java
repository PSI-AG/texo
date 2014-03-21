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
 * $Id: GenConstants.java,v 1.10 2011/08/25 12:35:07 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.annotator;

/**
 * Generation constants.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class GenConstants {
  public static final String ANNOTATION_SOURCE_METADATA = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData"; //$NON-NLS-1$

  // constants used by the internal code generation
  public static final String SAFE_NAME_POSTFIX = "_"; //$NON-NLS-1$
  public static final String MODELFACTORY_CONSTANT = "MODELFACTORY"; //$NON-NLS-1$

  public static final String DOT_EINSTANCE = ".eINSTANCE"; //$NON-NLS-1$
  public static final String NULL = "null"; //$NON-NLS-1$
  public static final String DOT = "."; //$NON-NLS-1$
  public static final String DOLLAR = "$"; //$NON-NLS-1$
  public static final String EMPTY = ""; //$NON-NLS-1$
}
