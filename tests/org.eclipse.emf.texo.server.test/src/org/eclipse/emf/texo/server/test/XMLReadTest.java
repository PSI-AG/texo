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
 * $Id: XMLReadTest.java,v 1.8 2011/09/04 20:04:15 mtaal Exp $
 */
package org.eclipse.emf.texo.server.test;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.model.response.ResponseType;
import org.eclipse.emf.texo.server.service.RetrieveModelOperation;
import org.eclipse.emf.texo.server.service.ServiceContext;
import org.eclipse.emf.texo.server.service.xml.XMLServiceContext;
import org.eclipse.emf.texo.test.emfmodel.library.impl.LibraryPackageImpl;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.rental.RentalModelPackage;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.eclipse.emf.texo.xml.ModelXMLLoader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Simple xml persist and read test.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */
@RunWith(Parameterized.class)
public class XMLReadTest extends ModelPackageBaseTest {

  @Parameters
  public static Collection<Object[]> configs() {
    // this is to prevent clashes in epackage loading
    // of the library epackage
    LibraryPackageImpl.init();

    return Arrays.asList(new Object[][] { { LibraryModelPackage.INSTANCE, new XMLServiceContext() },
        { RentalModelPackage.INSTANCE, new XMLServiceContext() } });
  }

  private ServiceContext serviceContext;

  public XMLReadTest(ModelPackage modelPackage, ServiceContext serviceContext) {
    super(modelPackage);
    this.serviceContext = serviceContext;
  }

  @Test
  public void persistAndRead() {
    final List<Object> testSet = generateTestSet(5, 5, 5, 2000);
    {
      beginTransaction();
      for (Object o : testSet) {
        getObjectStore().insert(o);
      }
      commitTransaction();
    }

    {
      for (EClass eClass : getEClasses()) {
        serviceContext.setRequestURI("http://www.test.com/XMLService/" + ModelUtils.getQualifiedNameFromEClass(eClass)); //$NON-NLS-1$
        serviceContext.setServiceRequestURI(ModelUtils.getQualifiedNameFromEClass(eClass));
        serviceContext.setObjectStore(getNewObjectStore());

        final RetrieveModelOperation retrieveModelOperation = new RetrieveModelOperation();
        retrieveModelOperation.setServiceContext(serviceContext);

        retrieveModelOperation.execute();
        final String result = serviceContext.getResponseContent();
        retrieveModelOperation.close();
        final List<Object> objects = loadXMLData(result);
        Assert.assertTrue(objects.size() == 1);
        final ResponseType response = (ResponseType) objects.get(0);
        // the objects should also be present in the original set
        for (Object object : response.getData()) {
          final ModelObject<?> modelObject = ModelResolver.getInstance().getModelObject(object);
          Assert.assertTrue(modelObject.eClass() == eClass);
          final List<Object> referees = getObjectStore().getReferingObjects(object, 3, true);
          Assert.assertTrue(referees.size() < 4);
        }
      }
    }
  }

  private List<Object> loadXMLData(String xml) {
    final ModelXMLLoader xmlLoader = new ModelXMLLoader();
    xmlLoader.setLoadAsXMI(false);
    xmlLoader.setReader(new StringReader(xml));
    xmlLoader.getEMFModelConverter().setUriResolver(getObjectStore());
    return xmlLoader.read();
  }
}
