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
 * $Id: SingleXMLTest.java,v 1.9 2011/08/25 12:42:34 mtaal Exp $
 */

package org.eclipse.emf.texo.json.test;

import java.util.Collections;

import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.rental.RentalModelPackage;

/**
 * Tests json conversion with several models.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */

public class JSONTests extends JSONTest {

  public void testLibraryJSONConversion() throws Exception {
    super.setModelPackages(Collections.singletonList((ModelPackage) LibraryModelPackage.INSTANCE));
    doRunTest();
  }

  public void testRentalModelPackage() throws Exception {
    super.setModelPackages(Collections.singletonList((ModelPackage) RentalModelPackage.INSTANCE));
    doRunTest();
  }

}