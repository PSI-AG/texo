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
 * $Id: LibraryDaoTest.java,v 1.9 2011/09/24 04:58:02 mtaal Exp $
 */
package org.eclipse.emf.texo.server.test.dao;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.server.store.EntityManagerProvider;
import org.eclipse.emf.texo.server.test.BaseTest;
import org.eclipse.emf.texo.test.model.samples.library.Book;
import org.eclipse.emf.texo.test.model.samples.library.BookCategory;
import org.eclipse.emf.texo.test.model.samples.library.GenericLibraryDao;
import org.eclipse.emf.texo.test.model.samples.library.Writer;
import org.eclipse.emf.texo.test.model.samples.library.dao.BookDao;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.junit.Assert;
import org.junit.Test;

/**
 * Single test for a service.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */

public class LibraryDaoTest extends BaseTest {

  public LibraryDaoTest() {
    super(LibraryModelPackage.INSTANCE.getEPackage().getName().toLowerCase());
  }

  @Test
  public void doTest() {
    EntityManager entityManager = EntityManagerProvider.getInstance().getCurrentEntityManager();

    Object bookId = null;
    Object writerId = null;
    {
      final Writer writer = LibraryModelPackage.MODELFACTORY.createWriter();
      writer.setName("test"); //$NON-NLS-1$

      final Book book = LibraryModelPackage.MODELFACTORY.createBook();
      book.setAuthor(writer);
      book.setTitle("title"); //$NON-NLS-1$
      book.setPages(100);

      writer.getBooks().add(book);

      final BaseDao<Writer> writerDao = DaoRegistry.getInstance().getDaoForEntity(Writer.class);
      writerDao.insert(writer);

      final BookDao bookDao = DaoRegistry.getInstance().getDao(BookDao.class);
      bookDao.insert(book);

      entityManager.flush();

      entityManager.getTransaction().commit();

      bookId = book.getDb_Id();
      writerId = writer.getDb_Id();
      Assert.assertTrue(bookDao.isReferenced(book, false));
      Assert.assertTrue(bookDao.getReferingObjects(book, 10, true).contains(writer));
    }

    EntityManagerProvider.getInstance().clearCurrentEntityManager();
    {
      entityManager = EntityManagerProvider.getInstance().getCurrentEntityManager();

      final Writer writer = LibraryModelPackage.MODELFACTORY.createWriter();
      writer.setName("test2"); //$NON-NLS-1$

      final BaseDao<Writer> writerDao = DaoRegistry.getInstance().getDaoForEntity(Writer.class);
      writerDao.insert(writer);
      entityManager.flush();
      Assert.assertTrue(writerDao.countAll() == 2);
      Assert.assertTrue(writerDao.getAll().size() == 2);
      Assert.assertTrue(writerDao.getAll().contains(writer));

      writerDao.remove(Collections.singletonList(writer));
      entityManager.flush();

      entityManager.getTransaction().commit();
    }

    EntityManagerProvider.getInstance().clearCurrentEntityManager();
    {
      entityManager = EntityManagerProvider.getInstance().getCurrentEntityManager();

      final BaseDao<Writer> writerDao = DaoRegistry.getInstance().getDaoForEntity(Writer.class);
      Assert.assertTrue(writerDao.get(writerId) != null);

      final BaseDao<Book> bookDao = DaoRegistry.getInstance().getDaoForEntity(Book.class);
      final List<Book> books = bookDao.findBy("title", "title"); //$NON-NLS-1$ //$NON-NLS-2$
      Assert.assertEquals(1, books.size());
      Assert.assertTrue(books.get(0).getAuthor() == writerDao.get(writerId));

      entityManager.getTransaction().commit();
    }

    // now test remove
    EntityManagerProvider.getInstance().clearCurrentEntityManager();
    {
      entityManager = EntityManagerProvider.getInstance().getCurrentEntityManager();

      final BaseDao<Book> bookDao = DaoRegistry.getInstance().getDaoForEntity(Book.class);

      final Book book = bookDao.get(bookId);
      Assert.assertTrue(book != null);

      // fake the model to test cascade deletes of containment references..
      LibraryModelPackage.INSTANCE.getBook_Author().setContainment(true);
      bookDao.remove(book);
      entityManager.getTransaction().commit();
    }

    EntityManagerProvider.getInstance().clearCurrentEntityManager();
    {
      entityManager = EntityManagerProvider.getInstance().getCurrentEntityManager();

      final BaseDao<Book> bookDao = DaoRegistry.getInstance().getDaoForEntity(Book.class);

      final Book book = bookDao.get(bookId);
      Assert.assertTrue(book == null);

      final BaseDao<Writer> writerDao = DaoRegistry.getInstance().getDaoForEntity(Writer.class);
      Assert.assertTrue(writerDao.get(writerId) == null);

      entityManager.getTransaction().commit();
    }
    EntityManagerProvider.getInstance().clearCurrentEntityManager();

    // and restore
    LibraryModelPackage.INSTANCE.getBook_Author().setContainment(false);
  }

  @Test
  public void doTestDaoRoot() {
    final BaseDao<Writer> writerDao = DaoRegistry.getInstance().getDaoForEntity(Writer.class);
    Assert.assertTrue(writerDao instanceof GenericLibraryDao);
  }

  @Test
  public void doTestEClass() {
    final BookDao bookDao = DaoRegistry.getInstance().getDao(BookDao.class);
    Assert.assertSame(bookDao.getEClass(), LibraryModelPackage.INSTANCE.getBookEClass());
  }

  @Test
  public void doTestFindBy() {
    EntityManager em = EntityManagerProvider.getInstance().getEntityManager();
    {
      Assert.assertTrue(EntityManagerProvider.getInstance().hasCurrentEntityManager());
      final Book book = LibraryModelPackage.MODELFACTORY.createBook();
      final BookDao bookDao = DaoRegistry.getInstance().getDao(BookDao.class);
      book.setTitle("t1"); //$NON-NLS-1$
      book.setCategory(BookCategory.BIOGRAPHY);
      book.setPages(100);
      bookDao.insert(book);
      em.getTransaction().commit();
    }
    EntityManagerProvider.getInstance().clearCurrentEntityManager();

    em = EntityManagerProvider.getInstance().getEntityManager();
    {
      final BookDao bookDao = DaoRegistry.getInstance().getDao(BookDao.class);

      final Map<String, Object> filter = new HashMap<String, Object>();
      filter.put("pages", 100); //$NON-NLS-1$
      filter.put("title", "t1"); //$NON-NLS-1$ //$NON-NLS-2$
      Assert.assertTrue(bookDao.findByProperties(filter).size() == 1);

      Assert.assertNotNull(bookDao.findBy("pages", 100)); //$NON-NLS-1$

      filter.put("pages", 101); //$NON-NLS-1$
      Assert.assertTrue(bookDao.findByProperties(filter).size() == 0);

      final Map<EStructuralFeature, Object> filterByFeature = new HashMap<EStructuralFeature, Object>();
      filterByFeature.put(LibraryModelPackage.INSTANCE.getBook_Pages(), 100);
      filterByFeature.put(LibraryModelPackage.INSTANCE.getBook_Category(), BookCategory.BIOGRAPHY);
      Assert.assertTrue(bookDao.findByFeatures(filterByFeature).size() == 1);

      Assert.assertNotNull(bookDao.findBy(LibraryModelPackage.INSTANCE.getBook_Pages(), 100));

      filterByFeature.put(LibraryModelPackage.INSTANCE.getBook_Pages(), 101);
      Assert.assertTrue(bookDao.findByFeatures(filterByFeature).size() == 0);
      em.getTransaction().commit();
    }
    EntityManagerProvider.getInstance().clearCurrentEntityManager();
  }
}
