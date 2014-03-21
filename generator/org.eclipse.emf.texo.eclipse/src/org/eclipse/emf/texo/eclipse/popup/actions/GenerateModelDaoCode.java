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
 * $Id: GenerateModelDaoCode.java,v 1.1 2011/09/21 14:03:52 mtaal Exp $
 */
package org.eclipse.emf.texo.eclipse.popup.actions;

/**
 * Generates model and dao code.
 * 
 * @author mtaal
 */
public class GenerateModelDaoCode extends GenerateCode {

  @Override
  protected boolean isDoDao() {
    return true;
  }
}
