/**
 * <copyright>
 *
 * Copyright (c) 2012 Springsite BV (The Netherlands) and others
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
 * $Id: SimpleTest.java,v 1.5 2011/09/02 07:12:37 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.test.samples;

import org.eclipse.emf.texo.orm.test.DataGenCompareModelJPATest;
import org.eclipse.emf.texo.test.model.issues.bz379815.Bz379815ModelPackage;

/**
 * Full persistence test for a single model
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class SingleDataGenCompareModelJPATest extends DataGenCompareModelJPATest {
  public SingleDataGenCompareModelJPATest() {
    super(Bz379815ModelPackage.INSTANCE, "-class-hsqldb");
  }

  public void test() {
    super.runTest();
  }
}
