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

import org.eclipse.emf.texo.test.model.samples.library.Library;
import org.eclipse.emf.texo.test.model.samples.library.Writer;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.junit.Assert;

/**
 * Tests bugzilla 363802
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class TestBz363802 extends TestCase {

  public void testBugzilla() {

    final Library l = LibraryModelPackage.INSTANCE.getModelFactory().createLibrary();
    for (int i = 0; i < 10; i++) {
      final Writer w = LibraryModelPackage.INSTANCE.getModelFactory().createWriter();
      w.setName("" + i); //$NON-NLS-1$
      l.getWriters().add(w);
    }
    Assert.assertFalse(l.getWriters().isEmpty());
    // fails in the bugzilla
    l.clearWriters();
    Assert.assertTrue(l.getWriters().isEmpty());
  }
}