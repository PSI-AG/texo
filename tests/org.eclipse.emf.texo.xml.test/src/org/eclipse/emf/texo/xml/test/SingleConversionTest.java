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
 * $Id: SingleConversionTest.java,v 1.6 2011/08/25 12:42:34 mtaal Exp $
 */

package org.eclipse.emf.texo.xml.test;

import java.util.Collections;

import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;

/**
 * Tests a single model.
 * 
 * @see TestModel
 * @see XMLBaseTest
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public class SingleConversionTest extends ConversionTest {

  public SingleConversionTest() {
    super.setModelPackages(Collections.singletonList((ModelPackage) AccountingModelPackage.INSTANCE));
    // super.setModelPackages(Collections.singletonList((ModelPackage)DatetimeModelPackage.INSTANCE));
  }

  public void testRun() throws Exception {
    super.runTest();
  }
}