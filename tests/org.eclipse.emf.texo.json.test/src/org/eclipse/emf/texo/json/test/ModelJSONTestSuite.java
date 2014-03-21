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
import org.eclipse.emf.texo.test.model.TestModelPackageProvider;

/**
 * Creates the {@link JSONEMFTest} for each {@link ModelPackage}.
 * 
 * @author mtaal
 */
public class ModelJSONTestSuite {

  public static Test suite() {
    TestSuite suite = new TestSuite("Model JSON Test Suite"); //$NON-NLS-1$

    final List<ModelPackage> modelPackages = TestModelPackageProvider.getModelPackages();

    // modelPackages.clear();
    // modelPackages.add(LibraryModelPackage.INSTANCE);
    // modelPackages.add(SocietyModelPackage.INSTANCE);
    // modelPackages.add(ClubModelPackage.INSTANCE);
    // modelPackages.add(CompetitionModelPackage.INSTANCE);
    // modelPackages.add(Bz391624ModelPackage.INSTANCE);
    // modelPackages.add(TypesModelPackage.INSTANCE);

    // anytype is not supported, result in Object as item/target entity
    // modelPackages.remove(AttributesModelPackage.INSTANCE);
    // modelPackages.remove(AnytypeModelPackage.INSTANCE);
    // union not supported, results in Object as item/target entity
    // modelPackages.remove(ListunionModelPackage.INSTANCE);
    // duration can't be persisted
    // modelPackages.remove(DurationModelPackage.INSTANCE);

    // extlibrary works with interfaces and multiple inheritance
    // this does not work nicely with JPA/ORM
    // modelPackages.add(ExtlibraryModelPackage.INSTANCE);

    for (ModelPackage modelPackage : modelPackages) {
      addTest(modelPackage, suite);
    }

    return suite;
  }

  private static void addTest(ModelPackage modelPackage, TestSuite suite) {
    final LocalJSONEMFTest jsonEMFTest = new LocalJSONEMFTest(modelPackage);
    suite.addTest(jsonEMFTest);
    final LocalJSONTest jsonTest = new LocalJSONTest(modelPackage);
    suite.addTest(jsonTest);
  }

  public static class LocalJSONEMFTest extends JSONEMFTest {

    public LocalJSONEMFTest(ModelPackage modelPackage) {
      super("EMF --> " + modelPackage.getNsURI());
      super.setEPackages(Collections.singletonList(modelPackage.getEPackage()));
    }

    @Override
    protected void runTest() throws Throwable {
      doRunTest();
    }
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
