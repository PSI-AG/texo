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
 * $Id: ReferersTest.java,v 1.4 2011/08/26 07:58:32 mtaal Exp $
 */
package org.eclipse.emf.texo.server.test.issues;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.texo.server.test.store.TexoResourceTest;
import org.eclipse.emf.texo.store.TexoResource;
import org.eclipse.emf.texo.test.emfmodel.bz391624.Author;
import org.eclipse.emf.texo.test.emfmodel.bz391624.Book;
import org.eclipse.emf.texo.test.emfmodel.bz391624.Bz391624Factory;
import org.eclipse.emf.texo.test.emfmodel.bz391624.impl.Bz391624PackageImpl;
import org.eclipse.emf.texo.test.model.issues.bz391624.Bz391624ModelPackage;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for issue: https://bugs.eclipse.org/bugs/show_bug.cgi?id=391624
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public abstract class Bz391624Test extends TexoResourceTest {

  public Bz391624Test() {
    super("bz391624");
    Bz391624PackageImpl.init();
    Bz391624ModelPackage.initialize();
  }

  @Test
  public void testResource() {
    final Bz391624Factory factory = Bz391624Factory.eINSTANCE;

    // Persist
    {
      final Book bk = factory.createBook();
      final Author a1 = factory.createAuthor();
      a1.setName("a1");
      final Author a2 = factory.createAuthor();
      a2.setName("a2");
      bk.getAuthors().add(a1);
      bk.getAuthors().add(a2);

      final TexoResource resource = createResource();
      resource.getContents().add(bk);
      try {
        resource.save(Collections.emptyMap());
      } catch (IOException e) {
        throw new IllegalStateException(e);
      }
    }

    try {
      final TexoResource resource = createResource(getBaseURL() + "?types=bz391624_Book&childLevels=10");
      resource.load(Collections.emptyMap());
      Assert.assertEquals(1, resource.getContents().size());
      final Book bk = (Book) resource.getContents().get(0);
      Assert.assertEquals(2, bk.getAuthors().size());
      Assert.assertEquals("a1", bk.getAuthors().get(0).getName());
      Assert.assertEquals("a2", bk.getAuthors().get(1).getName());
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }
}
