/**
 * <copyright>
 *
 * Copyright (c) 2012 Springsite BV (The Netherlands) and others
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
 * $Id: TestBidirectionalAssociationSupport.java,v 1.2 2011/08/25 12:42:19 mtaal Exp $
 */

package org.eclipse.emf.texo.test.emfissues;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.ElementHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

public class TestXMLMixed extends TestCase {

  public void test305892() throws Exception {
    final EPackage ePackage = readRegisterEPackage();
    assertNotNull(ePackage);

    final Map<Object, Object> options = new HashMap<Object, Object>();
    options.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
    options.put(XMLResource.OPTION_EXTENDED_META_DATA, true);
    options.put(XMLResource.OPTION_SUPPRESS_DOCUMENT_ROOT, true);
    options.put(XMLResource.OPTION_SCHEMA_LOCATION, true);
    options.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, true);
    options.put(XMLResource.OPTION_USE_LEXICAL_HANDLER, true);
    options.put(XMLResource.OPTION_ELEMENT_HANDLER, new ElementHandlerImpl(true));

    final XMLResource res = new XMLResourceImpl(URI.createURI("mixed.xml")); //$NON-NLS-1$

    res.load(this.getClass().getResourceAsStream("mixed.xml"), options); //$NON-NLS-1$
    res.save(new FileOutputStream("/tmp/mixed_output.xml"), options); //$NON-NLS-1$
  }

  private EPackage readRegisterEPackage() {
    final String ecoreFileName = "mixed.ecore"; //$NON-NLS-1$
    try {

      // note the resource uri is the same as by which it is saved in the
      // GenEPackage.getECoreFileContent
      final Resource res = new EcoreResourceFactoryImpl().createResource(URI.createURI(ecoreFileName));
      final InputStream is = this.getClass().getResourceAsStream(ecoreFileName);
      res.load(is, Collections.EMPTY_MAP);
      is.close();

      final Iterator<?> it = res.getAllContents();
      while (it.hasNext()) {
        final Object obj = it.next();
        if (obj instanceof EPackage) {
          final EPackage epack = (EPackage) obj;
          return registerEPackage(epack);
        }
      }
    } catch (final IOException e) {
      throw new IllegalStateException("Exception while loading models from ecorefile " + ecoreFileName);//$NON-NLS-1$
    }
    return null;
  }

  private EPackage registerEPackage(EPackage ePackage) {
    final Registry registry = EPackage.Registry.INSTANCE;
    if (registry.containsKey(ePackage.getNsURI())) {
      //      log.warn("EPackage with this \"" + ePackage.getNsURI() //$NON-NLS-1$
      //          + "\" already registered. Returning the registered one if it is an epackage");//$NON-NLS-1$
      final Object packageObject = registry.get(ePackage.getNsURI());
      if (packageObject instanceof EPackage) {
        return (EPackage) packageObject;
      }
    }

    registry.put(ePackage.getNsURI(), ePackage);
    return ePackage;
  }
}
