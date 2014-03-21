/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010, 2012 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *   Dzmitry [zmicer] Harachka - implementation
 * </copyright>
 *
 * $Id: DeleteModelOperation.java,v 1.8 2011/09/21 14:04:56 mtaal Exp $
 */
package org.eclipse.emf.texo.server.service;

import org.eclipse.emf.texo.component.TexoComponent;

/**
 * Is used to check that a query string does not contain any non-allowed characters: ', " or ;.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class QueryChecker implements TexoComponent {

  private char[] disallowed = new char[] { '\'', '"', ';' };

  public void checkQuery(String qry) {
    for (char chr : qry.toCharArray()) {
      for (char checkChr : disallowed) {
        if (checkChr == chr) {
          throw new IllegalArgumentException("Query contains an illegal character '" + chr + "': " + qry); //$NON-NLS-1$ //$NON-NLS-2$
        }
      }
    }
  }

}
