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
 * $Id: SimpleTest.java,v 1.5 2011/09/02 07:12:37 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.test;

import junit.framework.TestCase;

import org.eclipse.emf.texo.orm.annotations.model.orm.Column;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;

/**
 * Placeholder for simple tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class SimpleTest extends TestCase {

  public void testColumnDefaults() {
    final Column column = OrmFactory.eINSTANCE.createColumn();
    assertTrue(column.isNullable());
    assertTrue(column.isUpdatable());
    assertTrue(column.isInsertable());
  }
}
