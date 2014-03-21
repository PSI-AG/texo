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
 * $Id: TestTemplateOverride.java,v 1.5 2011/08/25 12:42:19 mtaal Exp $
 */

package org.eclipse.emf.texo.test;

import junit.framework.TestCase;

import org.eclipse.emf.texo.test.model.samples.employee.Department;
import org.eclipse.emf.texo.test.model.samples.employee.Employee;
import org.eclipse.emf.texo.test.model.samples.employee.EmployeeOverrideTest;
import org.junit.Assert;

/**
 * Tests that the entity.xpt template is overridden.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */

public class TestTemplateOverride extends TestCase {

  public void testTemplateOverride() {
    System.err.println(new EmployeeOverrideTest().hello());
    System.err.println(new Employee().helloWorld());
    Assert.assertTrue(new Employee().templateIsOverridden());
    Assert.assertTrue(new Department().templateIsOverridden());
  }
}