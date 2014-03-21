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
 * </copyright>
 *
 * $Id: TestEntityManagerCleanUpServlet.java,v 1.1 2011/09/24 04:46:48 mtaal Exp $
 */

package org.eclipse.emf.texo.server.test.ws;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.server.store.EntityManagerProvider;
import org.eclipse.emf.texo.test.model.samples.library.Book;
import org.eclipse.emf.texo.test.model.samples.library.BookCategory;
import org.eclipse.emf.texo.test.model.samples.library.dao.BookDao;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.junit.Assert;

/**
 * Servlet to test entity manager clean up.
 * 
 * @author mtaal
 */

public class TestEntityManagerCleanUpServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;
  private static ThreadLocal<EntityManager> localEntityManager = new ThreadLocal<EntityManager>();

  public static ThreadLocal<EntityManager> getLocalEntityManager() {
    return localEntityManager;
  }

  public static void setLocalEntityManager(ThreadLocal<EntityManager> localEntityManager) {
    TestEntityManagerCleanUpServlet.localEntityManager = localEntityManager;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    Assert.assertNull(localEntityManager.get());
    Assert.assertFalse(EntityManagerProvider.getInstance().hasCurrentEntityManager());

    final EntityManager em = EntityManagerProvider.getInstance().getEntityManager();

    // will be checked later in the testrequest filter
    localEntityManager.set(em);

    // there is an em
    Assert.assertTrue(EntityManagerProvider.getInstance().hasCurrentEntityManager());
    // transaction has started
    Assert.assertTrue(em.getTransaction().isActive());

    final BookDao bookDao = DaoRegistry.getInstance().getDao(BookDao.class);
    Assert.assertSame(em, bookDao.getEntityManager());

    if (req.getParameter("insert") != null) { //$NON-NLS-1$
      final Book book = LibraryModelPackage.MODELFACTORY.createBook();
      book.setTitle("title"); //$NON-NLS-1$
      book.setCategory(BookCategory.BIOGRAPHY);
      book.setPages(100);
      bookDao.insert(book);
    } else if (req.getParameter("find") != null) { //$NON-NLS-1$
      final List<Book> books = bookDao.findBy("pages", 100); //$NON-NLS-1$
      Assert.assertTrue(books.size() == 1);
    }

    // force an exception
    if (req.getParameter("error") != null) { //$NON-NLS-1$
      throw new IllegalStateException("An error!"); //$NON-NLS-1$
    }

    resp.getWriter().write("done"); //$NON-NLS-1$
    resp.setStatus(HttpServletResponse.SC_OK);
  }

}