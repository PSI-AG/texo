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
 * $Id: ConversionTest.java,v 1.6 2011/08/25 12:42:34 mtaal Exp $
 */

package org.eclipse.emf.texo.xml.test;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.converter.EMFModelConverter;
import org.eclipse.emf.texo.converter.ModelEMFConverter;
import org.eclipse.emf.texo.test.TestUtils;

/**
 * Test the conversion from and to EMF objects.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public class ConversionTest extends XMLBaseTest {

  public ConversionTest() {
  }

  public ConversionTest(String name) {
    super(name);
  }

  @Override
  public void runTest() throws Exception {

    final EMFModelConverter emfModelConverter = new EMFModelConverter();
    final ModelEMFConverter modelEMFConverter = new ModelEMFConverter();

    final List<EObject> eObjects1 = TestUtils.generateTestSet(3, 3, 3, 10000, getEPackages(), getEClasses());
    final List<Object> modelObjects = emfModelConverter.convert(eObjects1);
    final List<EObject> eObjects2 = modelEMFConverter.convert(modelObjects);
    TestUtils.compareEObjects(eObjects1, eObjects2);
  }
}