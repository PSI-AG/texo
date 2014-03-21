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
 * $Id: XMLRestWebServiceHandler.java,v 1.3 2011/09/04 20:04:19 mtaal Exp $
 */
package org.eclipse.emf.texo.server.web;

import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.server.service.ServiceContext;
import org.eclipse.emf.texo.server.service.xml.XMLServiceContext;

/**
 * The XML implementation of the {@link WebServiceHandler}.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class XMLRestWebServiceHandler extends WebServiceHandler {

  @Override
  protected ServiceContext createServiceContext() {
    return ComponentProvider.getInstance().newInstance(XMLServiceContext.class);
  }
}
