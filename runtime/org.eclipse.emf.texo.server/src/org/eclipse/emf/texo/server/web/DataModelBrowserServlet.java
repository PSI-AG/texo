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
 * $Id: DataModelBrowserServlet.java,v 1.4 2011/09/14 15:35:48 mtaal Exp $
 */
package org.eclipse.emf.texo.server.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.server.service.ServiceModelPackageRegistry;
import org.eclipse.emf.texo.server.web.WebServiceHandler.XSLTServiceContextResultProcessor;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The data model browser allows you to browse/navigate through the model using standard web service calls.
 * 
 * An extra function provided by the model browser is to make it possible to generate test data for a certain epackage.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class DataModelBrowserServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  private static final String ACTION_PARAMETER = "action"; //$NON-NLS-1$
  private static final String GENERATE_TEST_DATA_ACTION = "testData".toLowerCase(); //$NON-NLS-1$
  private static final String TEMPLATE_PARAMETER = "template"; //$NON-NLS-1$
  private static final String TYPE_PARAMETER = "type"; //$NON-NLS-1$
  private static final String TYPE_PARAMETER_XML = "xml"; //$NON-NLS-1$

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    final String pathInfo = req.getPathInfo();

    String result = ""; //$NON-NLS-1$
    // startswith also covers models
    if (pathInfo == null || pathInfo.trim().length() == 0) {
      result = getEPackageList(req);
      resp.setContentType("text/html;charset=UTF-8"); //$NON-NLS-1$
    } else {
      // get rid of the preceding /
      String name = pathInfo.substring(1);
      if (name.contains("/")) { //$NON-NLS-1$
        int segmentIndex = name.indexOf("/"); //$NON-NLS-1$
        name = name.substring(0, segmentIndex);
      }

      // must be an eclass then with an instance possibly
      if (pathInfo.contains(ModelUtils.QUALIFIERSEPARATOR)) {
        if (name.contains("/")) { //$NON-NLS-1$
          name = name.substring(0, name.indexOf("/")); //$NON-NLS-1$
        }
        final EClass eClass = ModelUtils.getEClassFromQualifiedName(name);
        doGetInstances(eClass, req, resp);
      } else {
        // try to be robust...
        name = name.toLowerCase();
        // an epackage
        for (ModelPackage modelPackage : ServiceModelPackageRegistry.getInstance().getRegisteredModelPackages()) {
          if (modelPackage.getEPackage().getName().toLowerCase().equals(name)) {

            if (req.getParameter(ACTION_PARAMETER) != null
                && req.getParameter(ACTION_PARAMETER).toLowerCase().equals(GENERATE_TEST_DATA_ACTION)) {
              // generate test data and report the results
              result = generatePersistTestData(modelPackage.getEPackage());
            } else {
              result = getTypes(req, modelPackage.getEPackage());
            }
            resp.setContentType("text/html;charset=UTF-8"); //$NON-NLS-1$
            break;
          }
        }
      }

    }

    if (result == null) {
      result = "No results found using this url"; //$NON-NLS-1$
    }

    // and return what we have...
    resp.getWriter().write(result);
  }

  /**
   * Can be overridden by example servlets to generate test data. Is not done here to prevent dependency of server
   * plugin on datagenerator.
   */
  protected String generatePersistTestData(EPackage ePackage) {
    return "The test data generation should be implemented in a subclass of this servlet"; //$NON-NLS-1$
  }

  /**
   * Return (as html) the current list of epackages registered in the {@link ServiceModelPackageRegistry}.
   */
  protected String getEPackageList(HttpServletRequest req) {
    final StringBuilder sb = new StringBuilder();
    sb.append("<html><body><h1>Registered Model Packages</h1>"); //$NON-NLS-1$
    sb.append("<table>"); //$NON-NLS-1$
    for (ModelPackage modelPackage : ServiceModelPackageRegistry.getInstance().getRegisteredModelPackages()) {
      sb.append("<tr><td><b>"); //$NON-NLS-1$
      sb.append(modelPackage.getEPackage().getName() + " --> "); //$NON-NLS-1$
      sb.append("</b></td><td>"); //$NON-NLS-1$
      sb.append("<a href='" + req.getContextPath() + req.getServletPath() + "/" + modelPackage.getEPackage().getName() + "'>Browse Types</a>"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
      sb.append("</td><td>"); //$NON-NLS-1$
      sb.append("<a href='" + req.getContextPath() + req.getServletPath() + "/" + modelPackage.getEPackage().getName() + "?" + ACTION_PARAMETER + "=" + GENERATE_TEST_DATA_ACTION + "'>Generate Test Data</a>"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
      sb.append("</td><tr>"); //$NON-NLS-1$
    }
    sb.append("</table></body></html>"); //$NON-NLS-1$
    return sb.toString();
  }

  /**
   * Return (in html) the current list of types of an epackage.
   */
  protected String getTypes(HttpServletRequest req, EPackage ePackage) {
    final StringBuilder sb = new StringBuilder();
    sb.append("<html><body><h1>Types list for EPackage " + ePackage.getName() + "</h1>"); //$NON-NLS-1$ //$NON-NLS-2$
    sb.append("<table>"); //$NON-NLS-1$
    for (EClassifier eClassifier : ePackage.getEClassifiers()) {
      if (eClassifier instanceof EClass) {
        final EClass eClass = (EClass) eClassifier;
        sb.append("<tr><td>"); //$NON-NLS-1$
        sb.append("<a href='" + req.getContextPath() + req.getServletPath() + "/" + ModelUtils.getQualifiedNameFromEClass(eClass) + "?" + TEMPLATE_PARAMETER + "=instances.xslt'>" + eClass.getName() + "</a> "); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        sb.append("<a href='" + req.getContextPath() + req.getServletPath() + "/" + ModelUtils.getQualifiedNameFromEClass(eClass) + "'>(xml)</a>"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        sb.append("</td><tr>"); //$NON-NLS-1$
      }
    }
    sb.append("</table></body></html>"); //$NON-NLS-1$
    return sb.toString();
  }

  /**
   * Return (in html) the list of records of a type
   */
  protected void doGetInstances(EClass eClass, HttpServletRequest req, HttpServletResponse resp) throws IOException {
    final String templateLocation = req.getParameter(TEMPLATE_PARAMETER);
    final String type = req.getParameter(TYPE_PARAMETER);

    final WebServiceHandler webServiceHandler = createWebServiceHandler(type == null
        || type.equalsIgnoreCase(TYPE_PARAMETER_XML));

    if (templateLocation != null) {
      final XSLTServiceContextResultProcessor serviceContextResultProcessor = ComponentProvider.getInstance()
          .newInstance(XSLTServiceContextResultProcessor.class);
      serviceContextResultProcessor.setTemplateClassPathLocation(templateLocation);
      webServiceHandler.setServiceContextResultProcessor(serviceContextResultProcessor);
      serviceContextResultProcessor.addParameter("eClassName", eClass.getName()); //$NON-NLS-1$
      serviceContextResultProcessor.addParameter("qualifiedEClassName", ModelUtils.getQualifiedNameFromEClass(eClass)); //$NON-NLS-1$
    }
    webServiceHandler.doGet(req, resp);
  }

  protected WebServiceHandler createWebServiceHandler(boolean xml) {
    if (xml) {
      return ComponentProvider.getInstance().newInstance(XMLRestWebServiceHandler.class);
    }
    throw new IllegalArgumentException("Unsupported type of web service handler"); //$NON-NLS-1$
  }

  /**
   * Return (in html) an instance
   */
  protected String getInstance(EClass eClass, Object id) {
    return null;
  }

  public String applyTemplate(String xml, InputStream template) {
    try {
      final TransformerFactory factory = TransformerFactory.newInstance();
      final Transformer transformer = factory.newTransformer(new StreamSource(template));
      final StreamSource source = new StreamSource(new StringReader(xml));
      final StringWriter sw = new StringWriter();
      final StreamResult response = new StreamResult(sw);
      transformer.transform(source, response);

      return sw.toString();
    } catch (final Exception e) {
      throw new IllegalStateException(e);
    }
  }

}
