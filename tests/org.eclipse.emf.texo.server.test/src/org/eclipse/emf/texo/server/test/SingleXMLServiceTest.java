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
 * $Id: SingleXMLServiceTest.java,v 1.4 2011/08/28 12:36:33 mtaal Exp $
 */
package org.eclipse.emf.texo.server.test;

import java.io.StringReader;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.server.service.RetrieveModelOperation;
import org.eclipse.emf.texo.server.service.xml.XMLServiceContext;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.eclipse.emf.texo.xml.ModelXMLLoader;
import org.junit.Assert;
import org.junit.Test;

/**
 * Single test for a service.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */

public class SingleXMLServiceTest extends ModelPackageBaseTest {

  public SingleXMLServiceTest() {
    super(LibraryModelPackage.INSTANCE);
  }

  @Test
  public void testPersist() {
    final List<Object> testSet = generateTestSet(10, 10, 10, 1000);
    {
      beginTransaction();
      for (Object o : testSet) {
        getObjectStore().insert(o);
      }
      commitTransaction();
    }

    // now use a retrieval operation to get some data
    {
      final XMLServiceContext serviceContext = new XMLServiceContext();
      for (EClass eClass : getEClasses()) {
        serviceContext.setRequestURI("http://www.test.com/XMLService/" + eClass.getName()); //$NON-NLS-1$
        serviceContext.setServiceRequestURI(eClass.getName());
        serviceContext.setObjectStore(getNewObjectStore());

        final RetrieveModelOperation retrieveModelOperation = new RetrieveModelOperation();
        retrieveModelOperation.setServiceContext(serviceContext);

        retrieveModelOperation.execute();
        final String result = serviceContext.getResponseContent();
        retrieveModelOperation.close();
        System.err.println(result);
        final List<EObject> objects = loadXMLData(result);
        Assert.assertTrue(objects.size() > 0);
      }
    }
  }

  private List<EObject> loadXMLData(String xml) {
    final ModelXMLLoader xmlLoader = new ModelXMLLoader();
    xmlLoader.setLoadAsXMI(false);
    xmlLoader.setReader(new StringReader(xml));
    xmlLoader.getEMFModelConverter().setUriResolver(getObjectStore());
    xmlLoader.read();
    return xmlLoader.getEMFModelConverter().getAllConvertedEObjects();
  }
}
