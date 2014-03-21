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
 * $Id: TestIdTitleProvider.java,v 1.2 2011/08/25 12:42:19 mtaal Exp $
 */

package org.eclipse.emf.texo.test;

import java.util.Collections;

import junit.framework.TestCase;

import org.eclipse.emf.texo.converter.ModelEMFConverter;
import org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid.BzWrongFeatureIdModelPackage;
import org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid.ConcreteClass;

/**
 * Tests http://www.eclipse.org/forums/index.php/mv/msg/485686/1052507/
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class TestWrongFeatureId extends TestCase {

  public void testWrongFeatureId() {
    final ConcreteClass cc = BzWrongFeatureIdModelPackage.INSTANCE.getModelFactory().createConcreteClass();
    cc.setConcreteName("1"); //$NON-NLS-1$
    cc.setInterfaceName("2"); //$NON-NLS-1$
    cc.setName("3"); //$NON-NLS-1$
    final ModelEMFConverter m2eConverter = new ModelEMFConverter();
    m2eConverter.convert(Collections.singletonList((Object) cc));
  }
}