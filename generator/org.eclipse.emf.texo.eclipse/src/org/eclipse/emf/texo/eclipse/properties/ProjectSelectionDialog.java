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
 * $Id: FolderSelectionDialog.java,v 1.4 2011/08/25 12:36:19 mtaal Exp $
 */
package org.eclipse.emf.texo.eclipse.properties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.texo.eclipse.TexoEclipsePlugin;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * Dialog for selecting projects.
 * 
 * @author mtaal
 * 
 */
public class ProjectSelectionDialog extends ElementTreeSelectionDialog {
  /**
   * Provides the IFolders from an IContainer structure.
   * 
   * @author Springsite B.V.
   */
  private static class ContainerContentProvider extends WorkbenchContentProvider {
    @Override
    public Object[] getElements(Object element) {
      return filter((IWorkspaceRoot) element);
    }

    @Override
    public Object[] getChildren(Object element) {
      if (element instanceof IWorkspaceRoot) {
        return filter((IWorkspaceRoot) element);
      }

      return new Object[0];
    }

    private Object[] filter(IWorkspaceRoot container) {
      try {
        final List<IResource> resources = new ArrayList<IResource>();
        for (IResource resource : container.members()) {
          if (resource instanceof IProject && ((IProject) resource).isOpen()) {
            final IJavaProject javaProject = JavaCore.create((IProject) resource);
            if (javaProject.exists()) {
              resources.add(resource);
            }
          }
        }
        return resources.toArray();
      } catch (CoreException e) {
        throw new RuntimeException(e);
      }
    }
  }

  /**
   * Ensures that the selection consists only of a single IFolder.
   * 
   * @author Springsite B.V.
   */
  private class SelectionValidator implements ISelectionStatusValidator {

    public IStatus validate(Object[] selection) {
      if (selection.length == 1 && selection[0] instanceof IProject) {
        return new Status(IStatus.OK, TexoEclipsePlugin.PLUGIN_ID, IStatus.OK, "", null); //$NON-NLS-1$
      }
      return new Status(IStatus.ERROR, TexoEclipsePlugin.PLUGIN_ID, IStatus.ERROR, "", null); //$NON-NLS-1$
    }
  }

  public ProjectSelectionDialog(Shell parent) {
    super(parent, new WorkbenchLabelProvider(), new ContainerContentProvider());
    setValidator(new SelectionValidator());
  }

  /**
   * Sets the input, ensuring that it is an IContainer.
   * 
   * @param input
   * @throws IllegalArgumentException
   *           If input is not of type IContainer.
   */
  @Override
  public void setInput(Object input) {
    if (!(input instanceof IWorkspaceRoot)) {
      throw new IllegalArgumentException("Input must be of type IWorkspaceRoot."); //$NON-NLS-1$
    }
    super.setInput(input);
  }
}
