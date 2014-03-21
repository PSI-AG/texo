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
 * $Id: CombinedTestSuite.java,v 1.14 2011/08/26 06:59:07 mtaal Exp $
 */
package org.eclipse.emf.texo.test.all;

import java.util.List;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.texo.datagenerator.test.DataGenTest;
import org.eclipse.emf.texo.orm.test.AllJPATests;
import org.eclipse.emf.texo.test.TestDirectJavaAnnotations;
import org.eclipse.emf.texo.test.TestMerge;
import org.eclipse.emf.texo.test.TestModelAccess;
import org.eclipse.emf.texo.test.TestSubpackage;
import org.eclipse.emf.texo.xml.test.EMFConversionTest;
import org.junit.runner.RunWith;
import org.junit.runners.AllTests;

/**
 * Combines the tests which are run in junit 3 mode, to make it easier to add dynamic tests.
 * 
 * @author mtaal
 */
@RunWith(AllTests.class)
public class CombinedTestSuite {

  public static Test suite() {
    TestSuite suite = new TestSuite("Combined Texo Test Suite"); //$NON-NLS-1$

    // org.eclipse.emf.texo.test
    suite.addTestSuite(TestMerge.class);
    suite.addTestSuite(TestModelAccess.class);
    // suite.addTestSuite(TestTemplateOverride.class);
    suite.addTestSuite(TestDirectJavaAnnotations.class);
    suite.addTestSuite(TestSubpackage.class);

    // org.eclipse.emf.texo.datagenerator.test
    suite.addTestSuite(DataGenTest.class);

    // org.eclipse.emf.texo.orm.test
    suite.addTest(AllJPATests.suite());

    // add some extra emf conversion tests
    suite.addTestSuite(EMFConversionTest.class);

    // and get all the model-based test cases
    final TestConfiguration testConfiguration = new TestConfiguration();
    final List<Test> tests = testConfiguration.getTests();
    for (Test test : tests) {
      suite.addTest(test);
    }

    return suite;
  }
}
