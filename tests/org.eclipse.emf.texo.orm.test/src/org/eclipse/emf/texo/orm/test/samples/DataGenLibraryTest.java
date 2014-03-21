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
 * $Id: DataGenLibraryTest.java,v 1.3 2011/08/25 12:42:40 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.test.samples;

import java.util.List;

import org.eclipse.emf.texo.modelgenerator.test.models.TestModel;
import org.eclipse.emf.texo.orm.test.JPATest;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;

/**
 * Tests persistence of library testcase
 * 
 * @see TestModel
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class DataGenLibraryTest extends JPATest {
  public DataGenLibraryTest() {
    super(LibraryModelPackage.INSTANCE, "-hsqldb");
  }

  public void testPersist() {
    final List<Object> testSet = generateTestSet(10, 10, 10, 1000);
    {
      beginTransaction();
      for (Object o : testSet) {
        getEntityManager().persist(o);
      }
      commitTransaction();
    }
  }

}
