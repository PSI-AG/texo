/**
 * <copyright>
 *
 * Copyright (c) 2011 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 * </copyright>
 *
 * $Id: TestEntityManagerRequestFilter.java,v 1.3 2011/09/25 18:54:29 mtaal Exp $
 */

package org.eclipse.emf.texo.server.test.ws;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.eclipse.emf.texo.server.store.EntityManagerProvider;

/**
 * Checks that the entitymanager is indeed closed.
 * 
 * @author mtaal
 */

public class TestEntityManagerRequestFilter implements Filter {

  public void init(FilterConfig fConfig) throws ServletException {
  }

  public void destroy() {
  }

  public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
      throws IOException, ServletException {

    // do the work
    try {
      chain.doFilter(request, response);
    } finally {
      final EntityManager em = TestEntityManagerCleanUpServlet.getLocalEntityManager().get();
      TestEntityManagerCleanUpServlet.getLocalEntityManager().set(null);

      // and check
      if (EntityManagerProvider.getInstance().hasCurrentEntityManager()) {
        throw new ServletException("EntityManager not cleaned up"); //$NON-NLS-1$
      }
      if (em != null && em.isOpen()) {
        if (em.getTransaction().isActive()) {
          throw new ServletException("Transaction still active"); //$NON-NLS-1$
        }
        throw new ServletException("EM not closed"); //$NON-NLS-1$        
      }
    }
  }
}