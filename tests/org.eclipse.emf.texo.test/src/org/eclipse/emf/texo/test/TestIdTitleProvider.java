/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
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
 * $Id: TestIdTitleProvider.java,v 1.2 2011/08/25 12:42:19 mtaal Exp $
 */

package org.eclipse.emf.texo.test;

import junit.framework.TestCase;

import org.eclipse.emf.texo.provider.IdProvider;
import org.eclipse.emf.texo.provider.TitleProvider;
import org.eclipse.emf.texo.test.model.samples.library.Book;
import org.eclipse.emf.texo.test.model.samples.library.BookCategory;
import org.eclipse.emf.texo.test.model.samples.library.Writer;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;

/**
 * Tests the {@link IdProvider}.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class TestIdTitleProvider extends TestCase {

  public void testIdProvider() {
    final String title = "It's a beautifull day"; //$NON-NLS-1$
    final String name = "martin"; //$NON-NLS-1$

    final Book bk = LibraryModelPackage.INSTANCE.getModelFactory().createBook();
    bk.setCategory(BookCategory.MYSTERY);
    bk.setPages(452);
    bk.setTitle(title);

    // assertEquals(title, IdProvider.getInstance().getId(bk));
    // assertEquals(title, IdProvider.getInstance().getIdAsString(bk));
    // assertEquals(title, IdProvider.getInstance().getIdAsString(ModelResolver.getInstance().getModelObject(bk)));
    assertEquals("It's a beautifull day (452) - Mystery", TitleProvider.getInstance().getTitle(bk)); //$NON-NLS-1$

    final Writer w = LibraryModelPackage.INSTANCE.getModelFactory().createWriter();
    w.setName(name);
    // assertEquals(name, IdProvider.getInstance().getId(w));
    // assertEquals(name, IdProvider.getInstance().getIdAsString(w));
    assertEquals(name, TitleProvider.getInstance().getTitle(w));
  }
}