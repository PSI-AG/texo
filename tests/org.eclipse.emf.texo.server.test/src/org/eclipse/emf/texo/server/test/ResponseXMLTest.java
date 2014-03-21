/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010 Springsite BV (The Netherlands) and others
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
 * $Id: ResponseXMLTest.java,v 1.4 2011/08/27 05:40:29 mtaal Exp $
 */

package org.eclipse.emf.texo.server.test;

import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

import org.eclipse.emf.texo.server.model.response.ErrorType;
import org.eclipse.emf.texo.server.service.ServiceContext;
import org.eclipse.emf.texo.server.service.xml.XMLServiceContext;
import org.eclipse.emf.texo.xml.ModelXMLLoader;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test the usage of the Texo Data Response model, serialization to and from XML.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */

public class ResponseXMLTest extends BaseTest {

  public ResponseXMLTest() {
    super("library"); //$NON-NLS-1$
  }

  @Test
  public void testErrorResponse() {
    final ServiceContext serviceContext = new XMLServiceContext();
    serviceContext.setRequestURI("http://www.test.com/XMLService/Book"); //$NON-NLS-1$
    serviceContext.setServiceRequestURI("Book"); //$NON-NLS-1$
    serviceContext.setObjectStore(getObjectStore());
    final Throwable t2 = new IllegalArgumentException("testcause"); //$NON-NLS-1$
    final Throwable t = new IllegalArgumentException("test", t2); //$NON-NLS-1$
    serviceContext.createErrorResult(t);
    final String errorResult = serviceContext.getResponseContent();

    System.err.println(errorResult);

    final ModelXMLLoader xmlLoader = new ModelXMLLoader();
    xmlLoader.setReader(new StringReader(errorResult));
    final List<Object> result = xmlLoader.read();

    final ErrorType error = (ErrorType) result.get(0);
    Assert.assertTrue(result.size() == 1);
    Assert.assertEquals(t.getMessage(), error.getMessage());
    Assert.assertEquals(t.getClass().getName(), error.getErrorClass());

    final StringWriter sw = new StringWriter();
    final PrintWriter pw = new PrintWriter(sw);
    t.printStackTrace(pw);
    pw.close();
    Assert.assertEquals(sw.toString(), error.getStackTrace());

    Assert.assertTrue(error.getCause() != null);
  }
}