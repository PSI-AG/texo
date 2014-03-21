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
 * $Id: TestMerge.java,v 1.7 2011/08/25 12:42:19 mtaal Exp $
 */

package org.eclipse.emf.texo.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import junit.framework.TestCase;

import org.eclipse.emf.texo.test.model.samples.employee.Employee;
import org.eclipse.emf.texo.test.model.samples.types.SingleTypes;
import org.eclipse.emf.texo.test.model.samples.types.TypesModelPackage;
import org.eclipse.emf.texo.test.models.annotations.MergeAnnotationOne;
import org.eclipse.emf.texo.test.models.annotations.MergeAnnotationTwo;

/**
 * Tests merging of standard java code.
 * 
 * The cases which are tested:
 * <ul>
 * <li>Annotation should be removed on a generated method</li>
 * <li>Annotation should be removed on a generated field</li>
 * <li>Annotation remains on generateNot methods and fields</li>
 * <li>Inner class with generatenot is not overwritten</li>
 * <li>Inner class with generate is removed</li>
 * <li>Method with generate is overwritten</li>
 * <li>Method with generate is removed when not re-generated</li>
 * <li>Method with generateNot should not be overwritten</li>
 * </ul>
 * 
 * The test cases uses the samples/employee.xsd model and the samples/types.ecore models. There are also various other
 * cases where a method has been set to generateNot to implement string conversion.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */

public class TestMerge extends TestCase {

  public void testGenerateNotMethodRemains() {
    final SingleTypes singleTypes = TypesModelPackage.INSTANCE.getModelFactory().createSingleTypes();
    assertEquals(2, singleTypes.getStringArray().length);
    assertEquals("abc", singleTypes.getStringArray()[0]); //$NON-NLS-1$
    assertEquals("def", singleTypes.getStringArray()[1]); //$NON-NLS-1$
    final String stringified = TypesModelPackage.INSTANCE.getModelFactory().convertStringArrayToString(
        singleTypes.getStringArray());
    assertEquals("abc::def", stringified); //$NON-NLS-1$
    final String[] stringArray = TypesModelPackage.INSTANCE.getModelFactory().createStringArrayFromString(stringified);
    assertEquals(stringArray.length, singleTypes.getStringArray().length);
    assertEquals(stringArray[0], singleTypes.getStringArray()[0]);
    assertEquals(stringArray[1], singleTypes.getStringArray()[1]);
  }

  public void testMergeResult() throws Exception {
    final Class<?> innerClass = Employee.NotRemoved.class;

    final Employee employee = new Employee();

    // test: inner class not removed
    final Employee.NotRemoved notRemoved = new Employee.NotRemoved();

    // test: method not removed
    notRemoved.setName("test2"); //$NON-NLS-1$

    // test: method is removed
    try {
      innerClass.getMethod("getName"); //$NON-NLS-1$
      fail("getName method should not be there"); //$NON-NLS-1$
    } catch (NoSuchMethodException e) {
      // method should have gone
    }

    // test: inner present
    final Class<?> notRemovedClz = this.getClass().getClassLoader().loadClass(Employee.class.getName() + "$NotRemoved"); //$NON-NLS-1$
    assertTrue(notRemovedClz == innerClass);

    // test: inner class removed
    try {
      this.getClass().getClassLoader().loadClass(Employee.class.getName() + "$Removed"); //$NON-NLS-1$
      fail("Class not removed in re-generation"); //$NON-NLS-1$
    } catch (ClassNotFoundException e) {
      // no problem
    }

    // test: innerclass has annotation
    final MergeAnnotationTwo annotation = innerClass.getAnnotation(MergeAnnotationTwo.class);
    assertNotNull(annotation);

    // test: inner class fields have annotations
    for (Field field : innerClass.getDeclaredFields()) {
      assertNotNull(field.getAnnotation(MergeAnnotationTwo.class));
    }

    // test: global class should not have an annotation
    assertNull(Employee.class.getAnnotation(MergeAnnotationOne.class));
    // test: method is still there and has annotation
    employee.methodRemains();
    final Method methodRemains = Employee.class.getMethod("methodRemains"); //$NON-NLS-1$
    assertNotNull(methodRemains.getAnnotation(MergeAnnotationOne.class));
    assertEquals("should-not-be-removed", methodRemains.getAnnotation(MergeAnnotationOne.class) //$NON-NLS-1$
        .value());

    // test: removed method should go away
    try {
      Employee.class.getMethod("methodRemoved"); //$NON-NLS-1$
      fail("methodRemoved method should not be there"); //$NON-NLS-1$
    } catch (NoSuchMethodException e) {
      // method should have gone
    }

    // test: annotations on generatedNot method should remain
    final Method getHireDateMethod = Employee.class.getMethod("getHireDate"); //$NON-NLS-1$
    assertNotNull(getHireDateMethod.getAnnotation(MergeAnnotationOne.class));
    assertNotNull(getHireDateMethod.getAnnotation(MergeAnnotationTwo.class));
    assertEquals("should-not-be-removed", getHireDateMethod.getAnnotation(MergeAnnotationOne.class) //$NON-NLS-1$
        .value());

    // test: annotations on generated method should be removed
    final Method getNameMethod = Employee.class.getMethod("getName"); //$NON-NLS-1$
    assertNull(getNameMethod.getAnnotation(MergeAnnotationOne.class));
    assertNull(getNameMethod.getAnnotation(MergeAnnotationTwo.class));
  }
}