/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
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
 * $Id: TexoProjectNature.java,v 1.4 2011/08/25 12:36:19 mtaal Exp $
 */
package org.eclipse.emf.texo.eclipse.nature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.texo.eclipse.TexoEclipsePlugin;

/**
 * Texo project nature
 * 
 * @author mtaal
 */
public class TexoProjectNature implements IProjectNature {

  public static final String NATURE_ID = TexoEclipsePlugin.PLUGIN_ID + ".nature"; //$NON-NLS-1$

  private IProject project;

  public void configure() throws CoreException {
  }

  public void deconfigure() throws CoreException {
    // Remove the nature-specific information here.
  }

  public IProject getProject() {
    return project;
  }

  public void setProject(IProject value) {
    project = value;
  }
}