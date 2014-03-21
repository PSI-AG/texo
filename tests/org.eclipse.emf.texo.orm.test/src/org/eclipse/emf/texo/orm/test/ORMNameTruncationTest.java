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
 * $Id: AllJPATests.java,v 1.5 2011/09/02 07:12:14 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.test;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.eclipse.emf.texo.orm.annotator.ORMNamingStrategy;
import org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.OrmannotationsFactory;
import org.junit.Test;

/**
 * Tests ORM name truncation.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class ORMNameTruncationTest extends TestCase {

  @Test
  public void testNameTrunctation() {
    final LocalORMNamingStrategy namingStrategy = new LocalORMNamingStrategy();
    final EPackageORMAnnotation annotation = OrmannotationsFactory.eINSTANCE.createEPackageORMAnnotation();
    annotation.setMaximumSqlNameLength(10);
    namingStrategy.setePackageORMAnnotation(annotation);

    {
      final String in = "ABCDEFGHIJOOI";
      final String expected = "ABCDEFGHIJ";
      Assert.assertEquals(expected, namingStrategy.processName(in, ""));
    }

    {
      final String in = "KLED_FAGHAMN";
      final String expected = "KLED_FGHMN";
      Assert.assertEquals(expected, namingStrategy.processName(in, ""));
    }

  }

  private static class LocalORMNamingStrategy extends ORMNamingStrategy {
    public LocalORMNamingStrategy() {

    }

    @Override
    public String processName(String name, String prefix) {
      return super.processName(name, prefix);
    }

  }
}
