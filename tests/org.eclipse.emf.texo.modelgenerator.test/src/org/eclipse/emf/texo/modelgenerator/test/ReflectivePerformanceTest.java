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
 * $Id: ReflectivePerformanceTest.java,v 1.3 2011/08/26 14:34:50 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.test;

import junit.framework.TestCase;

/**
 * Tests the performance difference between reflective and direct method calls and with method lookup.
 * 
 * See <a href="http://www.jguru.com/faq/view.jsp?EID=246569">here</a>.
 * 
 * Current result on a dual core 2.50Ghz laptop and server vm:
 * 
 * 100000 regular method calls:1 milliseconds.
 * 
 * 100000 reflective method calls without lookup:104 milliseconds.
 * 
 * 100000 reflective method calls with lookup:245 milliseconds.
 * 
 * 1000000 regular method calls:71 milliseconds.
 * 
 * 1000000 reflective method calls without lookup:1008 milliseconds.
 * 
 * 1000000 reflective method calls with lookup:2334 milliseconds.
 * 
 * 10000000 regular method calls:13 milliseconds.
 * 
 * 10000000 reflective method calls without lookup:10036 milliseconds.
 * 
 * 10000000 reflective method calls with lookup:23577 milliseconds.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class ReflectivePerformanceTest extends TestCase {

  public void testPerformance() throws Exception {
    doTestRun(100000, false);
    doTestRun(1000000, false);
    doTestRun(10000000, false);
    doTestRun(100000, false);
    doTestRun(1000000, false);
    doTestRun(10000000, false);
    doTestRun(100000, true);
    doTestRun(1000000, true);
    doTestRun(10000000, true);
  }

  private void doTestRun(final int loops, final boolean printResults) throws Exception {
    Class<?> c = TestClass.class;

    long start = System.currentTimeMillis();
    TestClass object = new TestClass();
    for (int i = 0; i < loops; i++) {
      object.setValue(i);
      object.getValue();
    }
    if (printResults) {
      System.out.println(loops + " regular method calls:" //$NON-NLS-1$
          + (System.currentTimeMillis() - start) + " milliseconds."); //$NON-NLS-1$
    }
    {
      object = new TestClass();
      java.lang.reflect.Method addMethod = c.getMethod("setValue", //$NON-NLS-1$
          long.class);
      java.lang.reflect.Method getMethod = c.getMethod("getValue"); //$NON-NLS-1$

      start = System.currentTimeMillis();
      for (int i = 0; i < loops; i++) {
        addMethod.invoke(object, i);
        getMethod.invoke(object);
      }
      if (printResults) {
        System.out.println(loops + " reflective method calls without lookup:" //$NON-NLS-1$
            + (System.currentTimeMillis() - start) + " milliseconds."); //$NON-NLS-1$
      }
    }
    {
      object = new TestClass();
      start = System.currentTimeMillis();
      for (int i = 0; i < loops; i++) {
        java.lang.reflect.Method addMethod = c.getMethod("setValue", //$NON-NLS-1$
            long.class);
        java.lang.reflect.Method getMethod = c.getMethod("getValue"); //$NON-NLS-1$
        addMethod.invoke(object, i);
        getMethod.invoke(object);
      }
      if (printResults) {
        System.out.println(loops + " reflective method calls with lookup:" //$NON-NLS-1$
            + (System.currentTimeMillis() - start) + " milliseconds."); //$NON-NLS-1$
      }
    }
    {
      object = new TestClass();
      java.lang.reflect.Field field = c.getDeclaredField("value"); //$NON-NLS-1$
      field.setAccessible(true);

      start = System.currentTimeMillis();
      for (int i = 0; i < loops; i++) {
        field.set(object, i);
        field.get(object);
      }
      if (printResults) {
        System.out.println(loops + " reflective field access without lookup:" //$NON-NLS-1$
            + (System.currentTimeMillis() - start) + " milliseconds."); //$NON-NLS-1$
      }
    }
  }

  private class TestClass {
    private long value;

    public void setValue(final long value) {
      this.value = value;
    }

    public long getValue() {
      return value;
    }
  }
}
