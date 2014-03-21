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
 * $Id: TestSubpackage.java,v 1.2 2011/08/25 12:42:19 mtaal Exp $
 */

package org.eclipse.emf.texo.test;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.test.model.issues.subpackage.MainModelPackage;
import org.eclipse.emf.texo.test.model.issues.subpackage.sub1.Sub1ModelPackage;
import org.eclipse.emf.texo.test.model.issues.subpackage.sub2.Sub2ModelPackage;

/**
 * Tests that sub and parent packages are registered correctly.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class TestSubpackage extends TestCase {

  public void testSameEModelElementInstances() {
    final Sub1ModelPackage sub1ModelPackage = Sub1ModelPackage.INSTANCE;
    final Sub2ModelPackage sub2ModelPackage = Sub2ModelPackage.INSTANCE;
    final MainModelPackage mainModelPackage = MainModelPackage.INSTANCE;

    // test same epackage
    final EPackage sub1EPackage = mainModelPackage.getEPackage().getESubpackages().get(0);
    final EPackage sub2EPackage = mainModelPackage.getEPackage().getESubpackages().get(1);
    assertSame(sub1ModelPackage.getEPackage(), sub1EPackage);
    assertSame(sub2ModelPackage.getEPackage(), sub2EPackage);

    // test same eclass
    assertSame(sub1ModelPackage.getSub1TypeEClass(), sub1EPackage.getEClassifiers().get(0));
    assertSame(sub2ModelPackage.getSub2TypeEClass(), sub2EPackage.getEClassifiers().get(0));
    assertSame(mainModelPackage.getEPackage().getEClassifiers().get(0), mainModelPackage.getMainTypeEClass());

    // test same eattribute
    // note that the model generation adds the Identifiable super EClass which adds
    // 2 eattributes, therefore name is the third
    assertSame(sub1ModelPackage.getSub1Type_Name(), ((EClass) sub1EPackage.getEClassifiers().get(0))
        .getEAllAttributes().get(2));
  }
}