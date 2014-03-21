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
 * $Id: EClassInstanceClassSetTest.java,v 1.4 2011/08/25 12:42:19 mtaal Exp $
 */
package org.eclipse.emf.texo.test;

import org.eclipse.emf.texo.test.model.issues.bz325427.Bz325427ModelPackage;
import org.junit.Assert;
import org.junit.Test;

public class TestBz325427 {

  @Test
  public void test() throws Exception {
    Assert.assertEquals(0, Bz325427ModelPackage.ECLASSB_CLASSIFIER_ID);
    Assert.assertEquals(1, Bz325427ModelPackage.ECLASSA_CLASSIFIER_ID);
    Assert.assertEquals(3, Bz325427ModelPackage.ENUMA_CLASSIFIER_ID);
    Assert.assertEquals(2, Bz325427ModelPackage.ENUMB_CLASSIFIER_ID);
  }
}
