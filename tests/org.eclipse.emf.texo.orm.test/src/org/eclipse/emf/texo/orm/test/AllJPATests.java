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
 * $Id: AllJPATests.java,v 1.5 2011/09/02 07:12:14 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.test;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.texo.orm.test.samples.DataGenLibraryTest;
import org.eclipse.emf.texo.orm.test.samples.FeatureGroupJPATest;
import org.eclipse.emf.texo.orm.test.samples.SimpleLibraryTest;

/**
 * All the JPA testcases which are run in the build.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class AllJPATests {

  public static Test suite() {
    TestSuite suite = new TestSuite(AllJPATests.class.getName());
    // $JUnit-BEGIN$

    // sample test cases
    suite.addTest(ModelJPATestSuite.suite());
    suite.addTestSuite(FeatureGroupJPATest.class);
    suite.addTestSuite(SimpleLibraryTest.class);
    suite.addTestSuite(DataGenLibraryTest.class);
    suite.addTestSuite(ORMNameTruncationTest.class);
    suite.addTestSuite(SimpleTest.class);

    // $JUnit-END$
    return suite;
  }
}
