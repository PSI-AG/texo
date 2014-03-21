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
 * $Id: XMLTest.java,v 1.16 2011/08/25 12:42:34 mtaal Exp $
 */

package org.eclipse.emf.texo.xml.test;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.texo.converter.EMFModelConverter;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.test.TestUtils;
import org.eclipse.emf.texo.utils.Check;

/**
 * Test the conversion to and from EMF/XMI. For each test the following steps are done:
 * <ol>
 * <li>Generate test data set</li>
 * <li>Convert the test data set to xml (xml1)</li>
 * <li>Convert the xml back to a list of {@link ModelObject} instances</li>
 * <li>Convert this list back to xml (xml2)</li>
 * <li>then the following should be true: xm11.equals(xml2)</li>
 * </ol>
 * 
 * Tests:
 * <ul>
 * <li>Conversion from and to EMF and XML</li>
 * <li>Tests that merging in code generation works (as XML conversion would not have worked otherwise)</li>
 * </ul>
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.16 $
 */
public class XMLTest extends XMLBaseTest {

  private boolean doXMLCompare = true;

  public XMLTest() {
  }

  public XMLTest(String name) {
    super(name);
  }

  /**
   * Generates test set, converts to xml (xml1), converts back to model objects, converts this last set back to xml
   * (xml2), this should then be true xml1.equals(xml2)
   * 
   * @throws Exception
   */
  @Override
  public void runTest() throws Exception {

    final int startCount;
    if (getEClasses().size() == 1 && ExtendedMetaData.INSTANCE.isDocumentRoot(getEClasses().get(0))) {
      startCount = 1;
    } else if (!isDoXMI()) {
      // XML only supports one root object anyway
      startCount = 1;
      Check.isTrue(getEClasses().size() == 1, "XML serialization only supports one root EClass"); //$NON-NLS-1$
    } else {
      startCount = 3;
    }

    final List<EObject> eObjects = TestUtils.generateTestSet(startCount, 3, 3, 10000, getEPackages(), getEClasses());
    final EMFModelConverter emfModelConverter = new EMFModelConverter();
    final List<Object> m1 = emfModelConverter.convert(eObjects);
    assertFalse(m1.isEmpty());

    final String xml1 = TestUtils.writeXML(m1, isDoXMI());

    final List<Object> m2 = TestUtils.readXML(xml1, isDoXMI());
    final String xml2 = TestUtils.writeXML(m2, isDoXMI());

    if (isDoXMLCompare()) {
      assertEquals(xml1, xml2);
    }

    final List<Object> m3 = TestUtils.readXML(xml2, isDoXMI());
    final String xml3 = TestUtils.writeXML(m3, isDoXMI());

    // test again
    if (isDoXMLCompare()) {
      assertEquals(xml2, xml3);
      //
      // // and compare result m3 with result m1
      // compareObjects(m1, m3);
    }

    // and compare result m3 with result m2
    TestUtils.compareObjects(m2, m3);
  }

  public boolean isDoXMLCompare() {
    return doXMLCompare;
  }

  public void setDoXMLCompare(boolean doXMLCompare) {
    this.doXMLCompare = doXMLCompare;
  }
}