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
 * $Id: WSMainTest.java,v 1.1 2011/09/21 14:32:54 mtaal Exp $
 */

package org.eclipse.emf.texo.server.test.ws;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.texo.model.DynamicModelObject;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.model.request.Parameter;
import org.eclipse.emf.texo.server.model.request.QueryType;
import org.eclipse.emf.texo.server.model.request.RequestModelPackage;
import org.eclipse.emf.texo.server.model.response.ErrorType;
import org.eclipse.emf.texo.server.model.response.ResponseType;
import org.eclipse.emf.texo.server.model.response.ResultType;
import org.eclipse.emf.texo.server.service.ServiceConstants;
import org.eclipse.emf.texo.server.service.ServiceModelPackageRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.emf.texo.test.model.samples.library.Book;
import org.eclipse.emf.texo.test.model.samples.library.Library;
import org.eclipse.emf.texo.test.model.samples.library.Writer;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelFactory;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.eclipse.jetty.http.HttpMethods;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the web service retrieve calls.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class WSMainTest extends BaseWSWebTest {

  public WSMainTest() {
    super("library"); //$NON-NLS-1$
    ServiceModelPackageRegistry.getInstance().register(LibraryModelPackage.INSTANCE);
  }

  @Test
  public void testRetrievalAndDelete() {
    final Library lib = createTestData();

    // children
    final Writer w = lib.getWriters().get(0);
    final Book bk = lib.getBooks().get(0);

    // get model information
    if (!isXmlTest()) {
      {
        final String content = doGetRequest("model/epackage?id=library", null, HttpServletResponse.SC_OK);
        final List<Object> objects = deserialize(content);
        Assert.assertEquals(1, objects.size());
        Assert.assertTrue(objects.get(0) instanceof DynamicModelObject);
        final DynamicModelObject dmo = (DynamicModelObject) objects.get(0);
        Assert.assertTrue(dmo.eClass() == EcorePackage.eINSTANCE.getEPackage());
        Assert.assertEquals("library", dmo.eGet(EcorePackage.eINSTANCE.getENamedElement_Name()));
        Assert.assertEquals(LibraryModelPackage.NS_URI, dmo.eGet(EcorePackage.eINSTANCE.getEPackage_NsURI()));
      }

      {
        final String content = doGetRequest("model/epackage?id=" + LibraryModelPackage.NS_URI, null,
            HttpServletResponse.SC_OK);
        final List<Object> objects = deserialize(content);
        Assert.assertEquals(1, objects.size());
        Assert.assertTrue(objects.get(0) instanceof DynamicModelObject);
        final DynamicModelObject dmo = (DynamicModelObject) objects.get(0);
        Assert.assertTrue(dmo.eClass() == EcorePackage.eINSTANCE.getEPackage());
        Assert.assertEquals("library", dmo.eGet(EcorePackage.eINSTANCE.getENamedElement_Name()));
        Assert.assertEquals(LibraryModelPackage.NS_URI, dmo.eGet(EcorePackage.eINSTANCE.getEPackage_NsURI()));
      }

      {
        final String content = doGetRequest("model/eclass?name=Book&epackage=" + LibraryModelPackage.NS_URI, null,
            HttpServletResponse.SC_OK);
        final List<Object> objects = deserialize(content);
        Assert.assertEquals(1, objects.size());
        Assert.assertTrue(objects.get(0) instanceof DynamicModelObject);
        final DynamicModelObject dmo = (DynamicModelObject) objects.get(0);
        Assert.assertTrue(dmo.eClass() == EcorePackage.eINSTANCE.getEClass());
        Assert.assertEquals("Book", dmo.eGet(EcorePackage.eINSTANCE.getENamedElement_Name()));
      }

      {
        final String content = doGetRequest("model/eclassifier?name=BookCategory&epackage="
            + LibraryModelPackage.NS_URI, null, HttpServletResponse.SC_OK);
        final List<Object> objects = deserialize(content);
        Assert.assertEquals(1, objects.size());
        Assert.assertTrue(objects.get(0) instanceof DynamicModelObject);
        final DynamicModelObject dmo = (DynamicModelObject) objects.get(0);
        Assert.assertTrue(dmo.eClass() == EcorePackage.eINSTANCE.getEEnum());
        Assert.assertEquals("BookCategory", dmo.eGet(EcorePackage.eINSTANCE.getENamedElement_Name()));
      }
    }
    // get all libraries
    {
      final String content = doGetRequest(LibraryModelPackage.INSTANCE.getLibraryEClass().getName(), null,
          HttpServletResponse.SC_OK);
      final List<Object> objects = deserialize(content);
      Assert.assertEquals(1, objects.size());
      final ResponseType responseType = (ResponseType) objects.get(0);
      final Library libResult = (Library) responseType.getData().get(0);
      Assert.assertNotSame(lib, libResult);
      Assert.assertEquals(lib.getDb_Id(), libResult.getDb_Id());
    }

    // get one library, and call its content
    {
      String content = getOneObject(lib);
      getValidateOneObject(lib);

      System.err.println(content);
      // and all its content
      final ModelObject<?> modelObject = ModelResolver.getInstance().getModelObject(lib);
      for (EReference eReference : modelObject.eClass().getEAllReferences()) {
        final Object value = modelObject.eGet(eReference);
        if (value == null) {
          continue;
        }
        if (eReference.isMany()) {
          for (Object element : (List<?>) value) {
            if (element instanceof Identifiable) {
              getValidateOneObject(element);
            }
          }
        } else {
          if (value instanceof Identifiable) {
            getValidateOneObject(value);
          }
        }
      }
    }

    // now delete the library
    doDeleteRequest(
        LibraryModelPackage.INSTANCE.getLibraryEClass().getName() + "/" + lib.getDb_Id(), HttpServletResponse.SC_OK); //$NON-NLS-1$
    // this should fail
    {
      final String content = doGetRequest(
          LibraryModelPackage.INSTANCE.getLibraryEClass().getName() + "/" + lib.getDb_Id(), null, HttpServletResponse.SC_NOT_FOUND); //$NON-NLS-1$
      final List<Object> objects = deserialize(content);
      Assert.assertEquals(1, objects.size());
      final ErrorType errorType = (ErrorType) objects.get(0);
      Assert.assertTrue(errorType.getMessage().contains("Resource not found")); //$NON-NLS-1$
    }

    // children are removed
    checkExists(w, false);
    checkExists(bk, false);
  }

  @Test
  public void testUpdateAndDeleteOfChildren() {
    final Library lib = createTestData();
    {
      String content = doGetRequest(LibraryModelPackage.INSTANCE.getLibraryEClass().getName(), null,
          HttpServletResponse.SC_OK);
      final List<Object> objects = deserialize(content);
      Assert.assertEquals(1, objects.size());
      final ResponseType responseType = (ResponseType) objects.get(0);
      final Library libResult = (Library) responseType.getData().get(0);
      Assert.assertNotSame(lib, libResult);
      Assert.assertEquals(lib.getDb_Id(), libResult.getDb_Id());

      // now remove parts from the library
      Writer w = libResult.getWriters().get(0);
      libResult.getBooks().removeAll(w.getBooks());
      libResult.getWriters().remove(w);
      libResult.setName("updated"); //$NON-NLS-1$
      content = serialize(libResult);
      doContentRequest(getObjectUrlPart(libResult), content, HttpServletResponse.SC_OK, null, HttpMethods.PUT);
      checkExists(w, false);
      for (Book bk : w.getBooks()) {
        checkExists(bk, false);
      }
    }

    // check that the name of the library got updated
    {
      String content = doGetRequest(LibraryModelPackage.INSTANCE.getLibraryEClass().getName(), null,
          HttpServletResponse.SC_OK);
      final List<Object> objects = deserialize(content);
      Assert.assertEquals(1, objects.size());
      final ResponseType responseType = (ResponseType) objects.get(0);
      final Library resultLib = (Library) responseType.getData().get(0);
      Assert.assertEquals("updated", resultLib.getName()); //$NON-NLS-1$
    }
  }

  @Test
  public void createAndPageTest() {
    final int COUNT = 35;
    final List<Writer> insertedWs = new ArrayList<Writer>();
    for (int i = 0; i < COUNT; i++) {
      final Writer w = LibraryModelPackage.MODELFACTORY.createWriter();
      w.setName("name" + i); //$NON-NLS-1$
      final String content = serialize(w);
      final String resultStr = doContentRequest(LibraryModelPackage.INSTANCE.getWriterEClass().getName(), content,
          HttpServletResponse.SC_OK, null, HttpMethods.POST);
      final ResultType result = (ResultType) deserialize(resultStr).get(0);
      Assert.assertEquals(1, result.getInserted().size());
      Assert.assertEquals(0, result.getUpdated().size());
      Assert.assertEquals(0, result.getDeleted().size());
      final Writer insertedW = (Writer) result.getInserted().get(0);
      Assert.assertEquals(w.getName(), insertedW.getName());
      checkExists(insertedW, true);
      insertedWs.add(insertedW);
    }

    final int[] expectedCount = new int[] { 10, 10, 10, 5, 0 };
    int startRow = 0;
    final List<Writer> checkedWs = new ArrayList<Writer>(insertedWs);
    for (int i = 0; i < expectedCount.length; i++) {
      final String wsPartUrl = ModelUtils.getQualifiedNameFromEClass(LibraryModelPackage.INSTANCE.getWriterEClass())
          + "?firstResult=" + startRow //$NON-NLS-1$
          + "&maxResults=10"; //$NON-NLS-1$
      final String content = doGetRequest(wsPartUrl, null, HttpServletResponse.SC_OK);

      final ResponseType result = (ResponseType) deserialize(content).get(0);
      Assert.assertEquals(COUNT, result.getTotalRows());
      Assert.assertEquals(expectedCount[i], result.getData().size());
      if (result.getData().size() > 0) {
        Assert.assertEquals(startRow, result.getStartRow());
        Assert.assertEquals(startRow + expectedCount[i] - 1, result.getEndRow());
      }

      // check that the data exists
      for (Object o : result.getData()) {
        final Writer w = (Writer) o;
        boolean found = false;
        for (Writer insertedW : insertedWs) {
          if (w.getDb_Id() == insertedW.getDb_Id()) {
            checkedWs.remove(insertedW);
            found = true;
            break;
          }
        }
        Assert.assertTrue(found);
      }
      startRow += expectedCount[i];
    }
    Assert.assertTrue(checkedWs.isEmpty());
  }

  @Test
  public void createAndQueryPageTest() throws Exception {
    final int COUNT = 35;
    for (int i = 0; i < COUNT; i++) {
      final Writer w = LibraryModelPackage.MODELFACTORY.createWriter();
      w.setName("name" + i); //$NON-NLS-1$
      final String content = serialize(w);
      doContentRequest(ModelUtils.getQualifiedNameFromEClass(LibraryModelPackage.INSTANCE.getWriterEClass()), content,
          HttpServletResponse.SC_OK, null, HttpMethods.POST);
    }

    // get all the writers which start with a 2, in total there are 11 (the ones 20-29 and 2)
    {
      final String wsPartUrl = ModelUtils.getQualifiedNameFromEClass(LibraryModelPackage.INSTANCE.getWriterEClass())
          + "?query=" //$NON-NLS-1$
          + URLEncoder.encode("select e from library_Writer e where e.name like :name", "UTF-8") + "&firstResult=0" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
          + "&maxResults=5&childLevels=3&qp.name=" + URLEncoder.encode("name2%", "UTF-8"); //$NON-NLS-1$
      final String content = doGetRequest(wsPartUrl, null, HttpServletResponse.SC_OK);
      final ResponseType result = (ResponseType) deserialize(content).get(0);
      Assert.assertEquals(11, result.getTotalRows());
      Assert.assertEquals(5, result.getData().size());
      Assert.assertEquals(4, result.getEndRow());
      for (Object o : result.getData()) {
        Writer w = (Writer) o;
        Assert.assertTrue(w.getName().startsWith("name2")); //$NON-NLS-1$
      }
    }

    // query for an array of results, writer, name
    if (!isXmlTest()) {
      final String wsPartUrl = ModelUtils.getQualifiedNameFromEClass(LibraryModelPackage.INSTANCE.getWriterEClass())
          + "?query=" //$NON-NLS-1$
          + URLEncoder.encode("select e, e.name from library_Writer e where e.name like :name", "UTF-8") + "&firstResult=0" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
          + "&maxResults=5&childLevels=3&qp.name=" + URLEncoder.encode("name2%", "UTF-8"); //$NON-NLS-1$
      final String content = doGetRequest(wsPartUrl, null, HttpServletResponse.SC_OK);
      final ResponseType result = (ResponseType) deserialize(content).get(0);
      for (Object o : result.getData()) {
        Object[] os = (Object[]) o;

        Writer w = (Writer) os[0];
        String name = (String) os[1];

        Assert.assertTrue(w.getName().startsWith("name2")); //$NON-NLS-1$
        Assert.assertEquals(name, w.getName());
      }
    }

    // test querytype
    if (!isXmlTest()) {
      final QueryType queryType = RequestModelPackage.INSTANCE.getModelFactory().createQueryType();
      queryType.setQuery("select e, e.name from library_Writer e where e.name like :name");
      // test named query, add this snippet to library-orm.xml:
      // <orm:named-query name="testWriter">
      // <orm:query>select e, e.name from Writer e where e.name like :name</orm:query>
      // </orm:named-query>
      // queryType.setNamedQuery("testWriter");
      final Parameter parameter = RequestModelPackage.INSTANCE.getModelFactory().createParameter();
      parameter.setName("name");
      parameter.setValue("name2%");
      queryType.getParameters().add(parameter);

      final String content = serialize(queryType);
      final String resultStr = doContentRequest("?" + ServiceConstants.PARAM_RETRIEVAL + "=true", content,
          HttpServletResponse.SC_OK, null, HttpMethods.POST);
      final ResponseType result = (ResponseType) deserialize(resultStr).get(0);
      Assert.assertEquals(11, result.getTotalRows());
      Assert.assertEquals(11, result.getData().size());
      for (Object o : result.getData()) {
        final Object[] os = (Object[]) o;
        Writer w = (Writer) os[0];
        String n = (String) os[1];
        Assert.assertTrue(w.getName().startsWith("name2")); //$NON-NLS-1$
        Assert.assertEquals(n, w.getName());
      }
    }

    // named query with post
    if (!isXmlTest()) {
      final QueryType queryType = RequestModelPackage.INSTANCE.getModelFactory().createQueryType();
      queryType.setNamedQuery("testWriter");
      final Parameter parameter = RequestModelPackage.INSTANCE.getModelFactory().createParameter();
      parameter.setName("name");
      parameter.setValue("name2%");
      queryType.getParameters().add(parameter);

      final String content = serialize(queryType);
      final String resultStr = doContentRequest("?" + ServiceConstants.PARAM_RETRIEVAL + "=true", content,
          HttpServletResponse.SC_OK, null, HttpMethods.POST);
      final ResponseType result = (ResponseType) deserialize(resultStr).get(0);
      Assert.assertEquals(11, result.getTotalRows());
      Assert.assertEquals(11, result.getData().size());
      for (Object o : result.getData()) {
        final Object[] os = (Object[]) o;
        Writer w = (Writer) os[0];
        String n = (String) os[1];
        Assert.assertTrue(w.getName().startsWith("name2")); //$NON-NLS-1$
        Assert.assertEquals(n, w.getName());
      }
    }

    // named query with get
    if (!isXmlTest()) {
      final String wsPartUrl = LibraryModelPackage.INSTANCE.getWriterEClass().getName()
          + "?namedQuery=testWriter&firstResult=0" //$NON-NLS-1$ 
          + "&maxResults=5&noCount=true&qp.name=" + URLEncoder.encode("name3%", "UTF-8"); //$NON-NLS-1$
      final String content = doGetRequest(wsPartUrl, null, HttpServletResponse.SC_OK);
      final ResponseType result = (ResponseType) deserialize(content).get(0);
      // as there are more than 5 writers, the result is one more than the maxResults
      Assert.assertEquals(6, result.getTotalRows());
      Assert.assertEquals(5, result.getData().size());
      for (Object o : result.getData()) {
        final Object[] os = (Object[]) o;
        Writer w = (Writer) os[0];
        Assert.assertEquals(os[1], w.getName());
        Assert.assertTrue(w.getName().startsWith("name3")); //$NON-NLS-1$
      }
    }

    // get all the writers which start with name2, in total there are 11
    // do not do the count, so the total rows should be equal to the maxResults
    {
      final String wsPartUrl = LibraryModelPackage.INSTANCE.getWriterEClass().getName()
          + "?query=" + URLEncoder.encode("select e from library_Writer e where e.name like :name", "UTF-8") + "&firstResult=0" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
          + "&maxResults=5&noCount=true&qp.name=" + URLEncoder.encode("name3%", "UTF-8"); //$NON-NLS-1$
      final String content = doGetRequest(wsPartUrl, null, HttpServletResponse.SC_OK);
      final ResponseType result = (ResponseType) deserialize(content).get(0);
      // as there are more than 5 writers, the result is one more than the maxResults
      Assert.assertEquals(6, result.getTotalRows());
      Assert.assertEquals(5, result.getData().size());
      for (Object o : result.getData()) {
        Writer w = (Writer) o;
        Assert.assertTrue(w.getName().startsWith("name3")); //$NON-NLS-1$
      }
    }
  }

  @Test
  public void insertComplexStructureTest() throws Exception {
    Library lib = null;
    {
      final String content = serialize(createTestDataInstance());
      final String resultStr = doContentRequest(
          ModelUtils.getQualifiedNameFromEClass(LibraryModelPackage.INSTANCE.getWriterEClass()), content,
          HttpServletResponse.SC_OK, null, HttpMethods.POST);
      final ResultType result = (ResultType) deserialize(resultStr).get(0);
      lib = (Library) result.getInserted().get(0);
      Assert.assertTrue(lib.getDb_Id() != null);
      for (Book bk : lib.getBooks()) {
        Assert.assertTrue(bk.getDb_Id() != null);
        checkExists(bk, true);
      }
      for (Writer w : lib.getWriters()) {
        Assert.assertTrue(w.getDb_Id() != null);
        checkExists(w, true);
      }
    }

    // remove all books
    Writer w = lib.getWriters().get(0);
    final String newName = "" + System.currentTimeMillis(); //$NON-NLS-1$
    w.setName(newName);
    final Book bk = w.getBooks().get(0);
    w.getBooks().clear();

    {
      final String content = serialize(w);
      final String resultStr = doContentRequest(
          ModelUtils.getQualifiedNameFromEClass(LibraryModelPackage.INSTANCE.getWriterEClass()), content,
          HttpServletResponse.SC_OK, null, HttpMethods.POST);
      final ResultType resultType = (ResultType) deserialize(resultStr).get(0);
      final Writer wResult = (Writer) resultType.getUpdated().get(0);
      Assert.assertNotSame(w, wResult);
      Assert.assertEquals(w.getDb_Id(), wResult.getDb_Id());
      Assert.assertEquals(0, wResult.getBooks().size());

      // use the new writer as the version may have changed
      w = wResult;
      checkExists(w, true);
    }

    {
      final String content = doGetRequest(
          ModelUtils.getQualifiedNameFromEClass(LibraryModelPackage.INSTANCE.getWriterEClass()), null,
          HttpServletResponse.SC_OK);
      final List<Object> objects = deserialize(content);
      System.err.println(objects.size());
    }

    // and add one book again
    {
      w.getBooks().add(bk);
      bk.setAuthor(w);
      final String content = serialize(w);
      final String resultStr = doContentRequest(
          ModelUtils.getQualifiedNameFromEClass(LibraryModelPackage.INSTANCE.getWriterEClass()), content,
          HttpServletResponse.SC_OK, null, HttpMethods.POST);
      final ResultType resultType = (ResultType) deserialize(resultStr).get(0);
      final Writer wResult = (Writer) resultType.getUpdated().get(0);
      Assert.assertNotSame(w, wResult);
      Assert.assertEquals(w.getDb_Id(), wResult.getDb_Id());
      Assert.assertEquals(1, wResult.getBooks().size());
      // disabled test as books of a writer are proxied
      // Assert.assertEquals(wResult.getBooks().get(0).getAuthor(), wResult);
    }

    {
      final Writer w2 = (Writer) deserialize(getOneObject(w)).get(0);
      Assert.assertNotSame(w, w2);
      Assert.assertEquals(newName, w2.getName());
      Assert.assertEquals(w.getDb_Id(), w2.getDb_Id());
      Assert.assertEquals(1, w2.getBooks().size());
      Assert.assertEquals(bk.getDb_Id(), w2.getBooks().get(0).getDb_Id());
    }

  }

  private Library createTestData() {
    final Library lib = createTestDataInstance();
    getObjectStore().begin();
    getObjectStore().insert(lib);
    getObjectStore().commit();
    return lib;
  }

  private Library createTestDataInstance() {
    final LibraryModelFactory factory = LibraryModelPackage.MODELFACTORY;
    final int COUNT = 5;

    // create testdata
    final Library lib = factory.createLibrary();
    lib.setName("name"); //$NON-NLS-1$

    for (int w = 0; w < COUNT; w++) {
      final Writer writer = factory.createWriter();
      lib.getWriters().add(writer);

      for (int b = 0; b < COUNT; b++) {
        final Book bk = factory.createBook();
        bk.setAuthor(writer);
        writer.getBooks().add(bk);
        lib.getBooks().add(bk);
      }
    }
    return lib;
  }

  @Override
  protected String getURL() {
    return super.getBaseURL() + "/" + XMLWS; //$NON-NLS-1$ 
  }

  protected boolean isXmlTest() {
    return true;
  }

}