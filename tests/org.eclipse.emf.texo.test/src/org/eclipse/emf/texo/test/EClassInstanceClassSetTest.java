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
 * $Id: EClassInstanceClassSetTest.java,v 1.4 2011/08/25 12:42:19 mtaal Exp $
 */

package org.eclipse.emf.texo.test;

import java.io.Serializable;

import junit.framework.TestCase;

import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.test.model.instanceclassset.NonEMF;
import org.eclipse.emf.texo.test.model.issues.instanceclassset.Bz306546ModelPackage;
import org.eclipse.emf.texo.test.model.issues.instanceclassset.MySerializableClass;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingClass;

/**
 * Tests that if an EClass has the instanceclass set that that class is used by the system.
 * 
 * See this issue: https://bugs.eclipse.org/bugs/show_bug.cgi?id=306546
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class EClassInstanceClassSetTest extends TestCase {

  public void testClassNotGenerated() throws Exception {
    try {
      this.getClass().getClassLoader().loadClass("org.eclipse.emf.texo.test.model.issues.instanceclassset.NonEMF"); //$NON-NLS-1$
      fail();
    } catch (ClassNotFoundException e) {
      // correct
    }
  }

  @SuppressWarnings("cast")
  public void testClassIntegratedWithModelLayer() throws Exception {
    final NonEMF nonEMF = new NonEMF();
    try {
      ModelResolver.getInstance().getModelObject(nonEMF);
      fail();
    } catch (IllegalStateException e) {
      // okay there should not be a modelobject
    }

    final MySerializableClass test = Bz306546ModelPackage.INSTANCE.getModelFactory().createMySerializableClass();
    test.setNonEMF(nonEMF);
    test.getNonEMFs().add(nonEMF);

    // accounting inherits from a serializable type
    assertTrue(test instanceof Serializable);

    // and test a complete other type
    assertTrue(Serializable.class.isAssignableFrom(AccountingClass.class));
  }
}
