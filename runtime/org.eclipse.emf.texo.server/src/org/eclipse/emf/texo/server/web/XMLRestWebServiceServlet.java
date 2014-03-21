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
 * $Id: XMLRestWebServiceServlet.java,v 1.3 2011/09/04 20:04:19 mtaal Exp $
 */
package org.eclipse.emf.texo.server.web;

import org.eclipse.emf.texo.component.ComponentProvider;

/**
 * The XML implementation of the
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class XMLRestWebServiceServlet extends WebServiceServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected WebServiceHandler createWebServiceHandler() {
    return ComponentProvider.getInstance().newInstance(XMLRestWebServiceHandler.class);
  }

}
