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
 * $Id: TexoTestObjectConverter.java,v 1.5 2011/09/02 07:12:14 mtaal Exp $
 */
package org.eclipse.emf.texo.test;

import org.eclipse.persistence.config.DescriptorCustomizer;
import org.eclipse.persistence.config.SessionCustomizer;
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.sessions.Session;

/**
 * A {@link SessionCustomizer} implementation used during Texo testing.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class TexoSessionCustomizer implements SessionCustomizer, DescriptorCustomizer {

  // do not check instantiation:
  // http://www.eclipse.org/forums/index.php/m/663886/
  public void customize(Session session) throws Exception {
    session.getIntegrityChecker().setShouldCheckInstantiationPolicy(false);
  }

  public void customize(ClassDescriptor descriptor) throws Exception {

  }

}
