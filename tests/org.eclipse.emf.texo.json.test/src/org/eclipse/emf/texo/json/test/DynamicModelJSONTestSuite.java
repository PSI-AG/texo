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
 * $Id: TestModelPackageProvider.java,v 1.7 2011/08/25 12:42:40 mtaal Exp $
 */
package org.eclipse.emf.texo.json.test;

import java.util.Collections;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.test.model.TestModelPackageProvider;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;
import org.eclipse.emf.texo.test.model.samples.claim.ClaimModelPackage;
import org.eclipse.emf.texo.test.model.samples.forum.ForumModelPackage;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.music.MusicModelPackage;

/**
 * Creates the {@link JSONEMFTest} for each {@link ModelPackage} but using the dynamic model concept.
 * 
 * @author mtaal
 */
public class DynamicModelJSONTestSuite {

  public static Test suite() {
    TestSuite suite = new TestSuite("Model JSON Test Suite"); //$NON-NLS-1$

    final List<ModelPackage> modelPackages = TestModelPackageProvider.getModelPackages();

    // add some focused testcases
    modelPackages.clear();
    modelPackages.add(LibraryModelPackage.INSTANCE);
    modelPackages.add(AccountingModelPackage.INSTANCE);
    modelPackages.add(ClaimModelPackage.INSTANCE);
    modelPackages.add(ForumModelPackage.INSTANCE);
    modelPackages.add(MusicModelPackage.INSTANCE);

    // extlibrary works with interfaces and multiple inheritance
    // this does not work nicely with JPA/ORM
    // modelPackages.remove(ExtlibraryModelPackage.INSTANCE);

    for (ModelPackage modelPackage : modelPackages) {
      addTest(modelPackage, suite);
    }

    // start with a fresh model resolver
    ModelResolver.setThreadInstance(new ModelResolver());

    return suite;
  }

  private static void addTest(ModelPackage modelPackage, TestSuite suite) {
    final LocalJSONTest jsonTest = new LocalJSONTest(modelPackage);
    suite.addTest(jsonTest);
  }

  public static class LocalJSONTest extends JSONTest {

    public LocalJSONTest(ModelPackage modelPackage) {
      super(modelPackage.getNsURI());
      super.setModelPackages(Collections.singletonList(modelPackage));
    }

    @Override
    protected void runTest() throws Throwable {
      doRunTest();
    }

  }
}
