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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.texo.component.TexoComponent;

/**
 * Defines options which control the behavior of the service layer.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ServiceOptions implements TexoComponent {
  /**
   * Controls if free format queries are allowed when retrieving, there is a small risk of sql-injection as many types
   * of queries can be passed.
   */
  public static final String OPTION_ALLOW_RETRIEVE_QUERIES = "allowQuerying"; //$NON-NLS-1$

  /**
   * Controls if free format queries are allowed when deleting, there is a small risk of sql-injection as many types of
   * queries can be passed.
   */
  public static final String OPTION_ALLOW_DELETE_QUERIES = "allowQuerying"; //$NON-NLS-1$

  private Map<String, Object> options = new HashMap<String, Object>();

  public ServiceOptions() {
    options.put(OPTION_ALLOW_RETRIEVE_QUERIES, true);
    options.put(OPTION_ALLOW_DELETE_QUERIES, true);
  }

  public void setOption(String option, Object value) {
    options.put(option, value);
  }

  public boolean getOptionValue(String option) {
    if (!options.containsKey(option)) {
      return false;
    }
    return (Boolean) options.get(option);
  }

  public void checkFalse(String option) {
    if (!getOptionValue(option)) {
      throw new RuntimeException("The option " + option + " is false, action not allowed"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }
}
