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

import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.test.model.issues.bz380279.BZ380279;
import org.eclipse.emf.texo.test.model.issues.bz380279.Bz380279ModelPackage;
import org.junit.Assert;
import org.junit.Test;

public class TestBz380279 {

  @Test
  public void test() throws Exception {
    Bz380279ModelPackage.initialize();

    Assert.assertNotNull(ModelResolver.getInstance().getImplementationClass(
        Bz380279ModelPackage.INSTANCE.getBZ380279EClass()));
    Assert.assertNotNull(ModelResolver.getInstance().getModelDescriptor(BZ380279.class, false));
    Assert.assertNotNull(ModelResolver.getInstance().getModelPackage(Bz380279ModelPackage.NS_URI));
    Assert.assertNotNull(ModelResolver.getInstance().getEPackageRegistry().get(Bz380279ModelPackage.NS_URI));

    ModelResolver.getInstance().deregister(Bz380279ModelPackage.INSTANCE);

    try {
      ModelResolver.getInstance().getImplementationClass(Bz380279ModelPackage.INSTANCE.getBZ380279EClass());
      Assert.fail();
    } catch (IllegalArgumentException e) {
    }
    Assert.assertNull(ModelResolver.getInstance().getModelDescriptor(BZ380279.class, false));
    Assert.assertNull(ModelResolver.getInstance().getModelPackage(Bz380279ModelPackage.NS_URI));
    Assert.assertNull(ModelResolver.getInstance().getEPackageRegistry().get(Bz380279ModelPackage.NS_URI));
  }
}
