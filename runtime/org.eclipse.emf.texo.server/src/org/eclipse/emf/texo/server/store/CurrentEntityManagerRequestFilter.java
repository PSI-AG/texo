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
 * $Id: CurrentEntityManagerRequestFilter.java,v 1.2 2011/09/24 04:47:21 mtaal Exp $
 */

package org.eclipse.emf.texo.server.store;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Takes care of committing or rolling back the current transaction as controlled by the {@link EntityManagerProvider}.
 * Supports the current Entity Manager approach as explained on the Texo wiki.
 * 
 * See also the Texo Wiki for more discussions on open session in view.
 * 
 * This {@link Filter} is enabled by setting it in the web.xml file:
 * 
 * <filter> <filter-name>emFilter</filter-name>
 * <filter-class>org.eclipse.emf.texo.server.store.CurrentEntityManagerRequestFilter</filter-class> </filter>
 * 
 * <filter-mapping>
 * 
 * <filter-name>emFilter</filter-name> <url-pattern>/*</url-pattern>
 * 
 * </filter-mapping>
 * 
 * Note the url-pattern can be defined more strictly if it is possible to identify the pages which require a
 * session/transaction.
 * 
 * @author mtaal
 */

public class CurrentEntityManagerRequestFilter implements Filter {

  public void init(FilterConfig fConfig) throws ServletException {
  }

  public void destroy() {
  }

  public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
      throws IOException, ServletException {
    boolean errorOccurred = true;
    try {
      // do the work
      chain.doFilter(request, response);

      // no error, commit
      errorOccurred = false;
    } finally {

      // is there something to check
      if (!EntityManagerProvider.getInstance().hasCurrentEntityManager()) {
        // no entityManager
        return;
      }

      // check if there is an active transaction
      final EntityManager entityManager = EntityManagerProvider.getInstance().getCurrentEntityManager();
      boolean errorWhileClosing = true;
      try {
        if (entityManager.isOpen() && entityManager.getTransaction().isActive()) {
          if (errorOccurred) {
            try {
              entityManager.getTransaction().rollback();
            } catch (Throwable t) {
              // don't hide the original exception
              return;
            }
          } else {
            entityManager.getTransaction().commit();
          }
        }
        errorWhileClosing = false;
      } finally {
        try {
          EntityManagerProvider.getInstance().clearCurrentEntityManager();
        } catch (Throwable t) {
          if (errorOccurred || errorWhileClosing) {
            // ignore, don't hide the original exception
            return;
          }
          // show it, somehow...
          throw new ServletException(t);
        }
      }
    }
  }
}