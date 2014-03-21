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
 * $Id: Bz391624Test.java,v 1.10 2011/09/24 04:46:48 mtaal Exp $
 */
package org.eclipse.emf.texo.server.test;

import junit.framework.TestSuite;

import org.eclipse.emf.texo.server.test.dao.LibraryDaoTest;
import org.eclipse.emf.texo.server.test.issues.Bz391624EPersistenceResourceTest;
import org.eclipse.emf.texo.server.test.issues.Bz391624JSONResourceTest;
import org.eclipse.emf.texo.server.test.issues.Bz399086Test;
import org.eclipse.emf.texo.server.test.issues.Bz401968JSONResourceTest;
import org.eclipse.emf.texo.server.test.issues.Bz401982Test;
import org.eclipse.emf.texo.server.test.issues.Bz403743JSONResourceTest;
import org.eclipse.emf.texo.server.test.store.EPersistenceServiceTest;
import org.eclipse.emf.texo.server.test.store.EPersistenceTexoResourceTest;
import org.eclipse.emf.texo.server.test.store.JSONEObjectStoreTest;
import org.eclipse.emf.texo.server.test.store.JSONProxyTest;
import org.eclipse.emf.texo.server.test.store.JSONTexoResourceTest;
import org.eclipse.emf.texo.server.test.ws.CurrentEMFilterTest;
import org.eclipse.emf.texo.server.test.ws.WSMainJSONTest;
import org.eclipse.emf.texo.server.test.ws.WSMainTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * All the server testcases which are run in the build.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.10 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ Bz391624EPersistenceResourceTest.class, Bz391624JSONResourceTest.class,
    Bz401968JSONResourceTest.class, Bz403743JSONResourceTest.class, Bz401982Test.class, Bz399086Test.class,
    JSONEObjectStoreTest.class, JSONProxyTest.class, JSONTexoResourceTest.class, EPersistenceTexoResourceTest.class,
    EPersistenceServiceTest.class, CurrentEMFilterTest.class, LibraryDaoTest.class, WSMainJSONTest.class,
    WSMainTest.class, ResponseXMLTest.class, XMLReadTest.class, ReferersTest.class })
// @Suite.SuiteClasses({ Bz391624EPersistenceResourceTest.class, Bz391624JSONResourceTest.class })
public class AllServerTests extends TestSuite {
}
