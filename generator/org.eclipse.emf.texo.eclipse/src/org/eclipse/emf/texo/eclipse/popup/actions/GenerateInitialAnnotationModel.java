/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
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
 * $Id: GenerateInitialAnnotationModel.java,v 1.3 2011/08/25 12:36:19 mtaal Exp $
 */
package org.eclipse.emf.texo.eclipse.popup.actions;

/**
 * Generates an initial model with only the EPackage annotated model elements present.
 * 
 * @author mtaal
 */
public class GenerateInitialAnnotationModel extends GenerateAnnotationModel {

  @Override
  protected boolean doOnlyInitialModel() {
    return true;
  }
}
