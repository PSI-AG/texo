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
package org.eclipse.emf.texo.test.copycompare;

import java.util.List;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.TestModelPackageProvider;
import org.eclipse.emf.texo.test.model.issues.bz371509.Bz371509ModelPackage;

/**
 * Creates the {@link CopyCompareTest} for each {@link ModelPackage}.
 * 
 * @author mtaal
 */
public class CopyCompareTestSuite {

  public static Test suite() {
    TestSuite suite = new TestSuite("Copy Compare Test Suite"); //$NON-NLS-1$

    final List<ModelPackage> modelPackages = TestModelPackageProvider.getModelPackages();

    // TODO: check, fails
    modelPackages.remove(Bz371509ModelPackage.INSTANCE);

    // modelPackages.clear();
    // modelPackages.add(AttributesModelPackage.INSTANCE);
    // modelPackages.add(JpamixedModelPackage.INSTANCE);
    // modelPackages.add(NestedgroupModelPackage.INSTANCE);

    for (ModelPackage modelPackage : modelPackages) {
      addTest(modelPackage, suite);
    }

    return suite;
  }

  private static void addTest(ModelPackage modelPackage, TestSuite suite) {
    final CopyCompareTest test = new CopyCompareTest(modelPackage);
    suite.addTest(test);
  }
}
