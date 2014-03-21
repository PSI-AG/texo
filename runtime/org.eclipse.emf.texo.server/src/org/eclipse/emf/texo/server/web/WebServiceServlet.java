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
 * $Id: WebServiceServlet.java,v 1.2 2011/09/04 20:04:19 mtaal Exp $
 */
package org.eclipse.emf.texo.server.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.texo.server.service.ServiceConstants;

/**
 * The base implementation of a CRUD Rest WS Servlet. It is the basis of the XML and JSON CRUD REST servlets.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public abstract class WebServiceServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  private WebServiceHandler webServiceHandler;

  protected abstract WebServiceHandler createWebServiceHandler();

  @Override
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    if (webServiceHandler == null) {
      webServiceHandler = createWebServiceHandler();
    }
  }

  @Override
  protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    webServiceHandler.doDelete(req, resp);
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    webServiceHandler.doGet(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    if (req.getParameter(ServiceConstants.PARAM_RETRIEVAL) != null) {
      webServiceHandler.doGet(req, resp);
    }
    webServiceHandler.doPost(req, resp);
  }

  @Override
  protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    if (req.getParameter(ServiceConstants.PARAM_RETRIEVAL) != null) {
      webServiceHandler.doGet(req, resp);
    }
    webServiceHandler.doPut(req, resp);
  }

  public WebServiceHandler getWebServiceHandler() {
    if (webServiceHandler == null) {
      webServiceHandler = createWebServiceHandler();
    }
    return webServiceHandler;
  }

  public void setWebServiceHandler(WebServiceHandler webServiceHandler) {
    this.webServiceHandler = webServiceHandler;
  }
}
