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
 * $Id: EClassInstanceClassSetTest.java,v 1.4 2011/08/25 12:42:19 mtaal Exp $
 */
package org.eclipse.emf.texo.test;

import java.io.StringWriter;
import java.util.Collections;

import org.eclipse.emf.texo.test.model.issues.bz393240.Application;
import org.eclipse.emf.texo.test.model.issues.bz393240.Bz393240ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz393240.DocumentRoot;
import org.eclipse.emf.texo.xml.ModelXMLSaver;
import org.junit.Assert;
import org.junit.Test;

public class TestBz393240 {

  @Test
  public void test() throws Exception {
    Bz393240ModelPackage.initialize();

    {
      final DocumentRoot dr = Bz393240ModelPackage.INSTANCE.getModelFactory().createDocumentRoot();
      final Application appl = Bz393240ModelPackage.INSTANCE.getModelFactory().createApplication();
      appl.setName("test"); //$NON-NLS-1$
      dr.setApplicationResponse(appl);
      final ModelXMLSaver xmlSaver = new ModelXMLSaver();
      xmlSaver.setObjects(Collections.singletonList((Object) dr));
      final StringWriter sw = new StringWriter();
      xmlSaver.setWriter(sw);
      xmlSaver.write();
      Assert.assertTrue(sw.toString().contains("applicationResponse")); //$NON-NLS-1$
    }
    {
      final DocumentRoot dr = Bz393240ModelPackage.INSTANCE.getModelFactory().createDocumentRoot();
      final Application appl = Bz393240ModelPackage.INSTANCE.getModelFactory().createApplication();
      appl.setName("test"); //$NON-NLS-1$
      dr.setApplicationRequest(appl);
      final ModelXMLSaver xmlSaver = new ModelXMLSaver();
      xmlSaver.setObjects(Collections.singletonList((Object) dr));
      final StringWriter sw = new StringWriter();
      xmlSaver.setWriter(sw);
      xmlSaver.write();
      Assert.assertTrue(sw.toString().contains("applicationRequest")); //$NON-NLS-1$
    }

    // System.err.println(sw.toString());
  }
}
