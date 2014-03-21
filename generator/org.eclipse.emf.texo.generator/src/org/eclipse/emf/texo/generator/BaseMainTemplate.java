/**
 * <copyright>
 *
 * Copyright (c) 2012 Springsite BV (The Netherlands) and others
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

import org.eclipse.emf.ecore.EPackage;

/**
 * Base type for the main template callable from the generator.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public abstract class BaseMainTemplate extends BaseTemplate {

  public abstract void generate(EPackage ePackage, ModelController modelController, boolean doDao);
}
