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
 * $Id: CombinedTestSuite.java,v 1.14 2011/08/26 06:59:07 mtaal Exp $
 */
package org.eclipse.emf.texo.test.all;

import org.eclipse.emf.texo.test.emfmodel.identifiable.IdentifiablePackage;
import org.eclipse.emf.texo.test.emfmodel.library.LibraryPackage;
import org.eclipse.emf.texo.test.emfmodel.schoollibrary.SchoollibraryPackage;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.schoollibrary.SchoollibraryModelPackage;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Makes sure that generated EMF EPackages are loaded before the generated Texo packages.
 * 
 * @author mtaal
 */
public class TestPluginActivator implements BundleActivator {

  public void start(BundleContext context) throws Exception {
    // first init EMF generated epackages
    IdentifiablePackage.eINSTANCE.getIdentifiable();
    LibraryPackage.eINSTANCE.getBook();
    SchoollibraryPackage.eINSTANCE.getSchoolBook();

    // now init Texo generated things
    LibraryModelPackage.initialize();
    SchoollibraryModelPackage.initialize();
  }

  public void stop(BundleContext context) throws Exception {
  }

}
