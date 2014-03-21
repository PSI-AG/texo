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
 * $Id: TestBidirectionalAssociationSupport.java,v 1.2 2011/08/25 12:42:19 mtaal Exp $
 */

package org.eclipse.emf.texo.test;

import junit.framework.TestCase;

import org.eclipse.emf.texo.test.model.issues.bz371509.Bz371509ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz371509.EClass0;
import org.eclipse.emf.texo.test.model.issues.bz371509.EClass1;

/**
 * Tests support of bi-directional associations.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class TestBidirectionalAssociationSupport extends TestCase {

  public void testManyBidirectionalAssociations() {
    final EClass0 c0_0 = Bz371509ModelPackage.INSTANCE.getModelFactory().createEClass0();
    final EClass1 c1_0 = Bz371509ModelPackage.INSTANCE.getModelFactory().createEClass1();
    final EClass0 c0_1 = Bz371509ModelPackage.INSTANCE.getModelFactory().createEClass0();
    final EClass1 c1_1 = Bz371509ModelPackage.INSTANCE.getModelFactory().createEClass1();
    final EClass0 c0_2 = Bz371509ModelPackage.INSTANCE.getModelFactory().createEClass0();
    final EClass1 c1_2 = Bz371509ModelPackage.INSTANCE.getModelFactory().createEClass1();

    // set one, check many
    c0_0.setToClass1(c1_0);
    assertTrue(c1_0.getToClass0().contains(c0_0));

    // add to many, check one
    c1_0.addToToClass0(c0_1);
    assertTrue(c0_1.getToClass1() == c1_0);

    // clear one, check many
    c0_0.setToClass1(null);
    assertFalse(c1_0.getToClass0().contains(c0_0));
    assertTrue(c1_0.getToClass0().size() == 1);

    // replace one, check many
    assertTrue(c1_0.getToClass0().contains(c0_1));
    c0_1.setToClass1(c1_1);
    assertFalse(c1_0.getToClass0().contains(c0_1));
    assertTrue(c1_1.getToClass0().contains(c0_1));

    // and back
    c1_0.addToToClass0(c0_1);
    assertTrue(c1_0.getToClass0().contains(c0_1));
    assertFalse(c1_1.getToClass0().contains(c0_1));

    // many-to-many
    c0_2.addToMany(c1_2);
    c0_1.addToMany(c1_2);
    assertTrue(c1_2.getMany().contains(c0_2));
    assertTrue(c1_2.getMany().contains(c0_1));
    c0_1.removeFromMany(c1_2);
    assertFalse(c1_2.getMany().contains(c0_1));

  }
}