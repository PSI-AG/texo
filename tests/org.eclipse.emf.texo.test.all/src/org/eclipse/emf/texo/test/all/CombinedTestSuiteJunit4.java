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
 * $Id: CombinedTestSuiteJunit4.java,v 1.3 2011/08/27 05:40:42 mtaal Exp $
 */
package org.eclipse.emf.texo.test.all;

import org.eclipse.emf.texo.json.test.ModelJSONTestSuite;
import org.eclipse.emf.texo.server.test.AllServerTests;
import org.eclipse.emf.texo.test.AllTestsTests;
import org.eclipse.emf.texo.test.TestBz325427;
import org.eclipse.emf.texo.test.copycompare.CopyCompareTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Combines all junit4 testcases.
 * 
 * >>>>NOTE<<<<: Bz391624Test needs to be done first to ensure proper initialization of package.
 * 
 * @author mtaal
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ AllServerTests.class, AllTestsTests.class, CopyCompareTestSuite.class, ModelJSONTestSuite.class,
    TestBz325427.class, CombinedTestSuite.class })
public class CombinedTestSuiteJunit4 {
}
