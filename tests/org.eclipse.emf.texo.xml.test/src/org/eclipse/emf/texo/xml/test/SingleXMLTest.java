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
 * $Id: SingleXMLTest.java,v 1.9 2011/08/25 12:42:34 mtaal Exp $
 */

package org.eclipse.emf.texo.xml.test;

import java.util.Collections;

import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.samples.schoollibrary.SchoollibraryModelPackage;

/**
 * Tests a single model.
 * 
 * @see TestModel
 * @see XMLBaseTest
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */

public class SingleXMLTest extends XMLTest {

  public SingleXMLTest() {
    // super.setModelPackages(Collections.singletonList((ModelPackage) ListunionModelPackage.INSTANCE));
    super.setModelPackages(Collections.singletonList((ModelPackage) SchoollibraryModelPackage.INSTANCE));
    // super.setModelPackages(Collections.singletonList((ModelPackage) ListModelPackage.INSTANCE));
    // super.setEClasses(Collections.singletonList(MixedModelPackage.INSTANCE
    // .getLetterBodyTypeEClass()));
    // super.setModelPackages(Collections.singletonList((ModelPackage)DatetimeModelPackage.INSTANCE));
    setDoXMI(true);
  }

  public void testRun() throws Exception {
    super.runTest();
  }

}