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
 * $Id: ReferersTest.java,v 1.4 2011/08/26 07:58:32 mtaal Exp $
 */
package org.eclipse.emf.texo.server.test.issues;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.server.store.EPersistenceTexoResource;
import org.eclipse.emf.texo.store.TexoResource;

/**
 * Test case for issue: https://bugs.eclipse.org/bugs/show_bug.cgi?id=391624
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class Bz391624EPersistenceResourceTest extends Bz391624Test {

  @Override
  protected TexoResource createResource(String uriString) {
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
        .put("http", new EPersistenceTexoResourceFactory());
    return (TexoResource) resourceSet.createResource(URI.createURI(uriString));
  }

  private static class EPersistenceTexoResourceFactory implements Resource.Factory {

    public Resource createResource(URI uri) {
      final EPersistenceTexoResource resource = ComponentProvider.getInstance().newInstance(
          EPersistenceTexoResource.class);
      resource.setURI(uri);
      return resource;
    }

  }
}
