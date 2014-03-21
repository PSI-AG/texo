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
 * $Id: ModelEMFConverter.java,v 1.27 2011/09/14 15:35:53 mtaal Exp $
 */

package org.eclipse.emf.texo.json;


/**
 * Used in EMF <--> JSON conversion.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class JSONEMFValueConverter extends JSONValueConverter {

  /**
   * Returns false so that the XMLTypePackage is being used for conversion.
   */
  protected boolean usePlainDate() {
    return false;
  }

}