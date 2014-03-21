/**
 * <copyright>
 *
 * Copyright (c) 2013 Springsite BV (The Netherlands) and others
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
 * $Id: Bz391624Test.java,v 1.10 2011/09/24 04:46:48 mtaal Exp $
 */
package org.eclipse.emf.texo.test;

import junit.framework.TestSuite;

import org.eclipse.emf.texo.test.emfissues.TestXMIMixed;
import org.eclipse.emf.texo.test.emfissues.TestXMLMixed;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * All the server testcases which are run in the build.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.10 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ TestXMIMixed.class, TestXMLMixed.class, TestBz325427.class,
    TestBidirectionalAssociationSupport.class, TestBz363802.class, TestBz379796.class, TestBz380279.class,
    TestBz393240.class, TestBz411874.class, TestBz415716.class, TestDirectJavaAnnotations.class,
    TestIdTitleProvider.class, TestMerge.class, TestModelAccess.class, TestNotRequiredSerialization.class,
    TestSubpackage.class, TestTemplateOverride.class, TestWrongFeatureId.class })
public class AllTestsTests extends TestSuite {

  // these test cases pass fine when run individually:
  // Test305892.class
  // EClassInstanceClassSetTest.class

}
