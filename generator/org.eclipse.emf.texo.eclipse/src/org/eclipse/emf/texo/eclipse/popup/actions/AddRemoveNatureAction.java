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
 *   Springsite B.V. - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: AddRemoveNatureAction.java,v 1.4 2011/08/25 12:36:19 mtaal Exp $
 */
package org.eclipse.emf.texo.eclipse.popup.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.texo.eclipse.Messages;
import org.eclipse.emf.texo.eclipse.ProjectPropertyUtil;
import org.eclipse.emf.texo.eclipse.TexoEclipsePlugin;
import org.eclipse.emf.texo.eclipse.nature.TexoProjectNature;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Adds or removes the Elver UI nature to/from the selected Project.
 * 
 * @author Springsite B.V.
 * 
 */
public class AddRemoveNatureAction implements IObjectActionDelegate {

  private Shell shell;

  // The selected Project.
  private IProject project;

  /**
   * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
   */
  public void setActivePart(IAction action, IWorkbenchPart targetPart) {
    shell = targetPart.getSite().getShell();
  }

  public void selectionChanged(IAction action, ISelection selection) {
    if (selection == null) {
      project = null;
    } else {
      final Object element = ((IStructuredSelection) selection).getFirstElement();
      if (element == null) {
        project = null;
      } else {
        project = ProjectPropertyUtil.getProject(element);
      }
    }
    action.setEnabled(project != null && project.isOpen());
  }

  public void run(IAction action) {
    if (project == null || !project.isOpen()) {
      return;
    }
    try {
      final IProjectDescription description = project.getDescription();
      final List<String> natureIds = new ArrayList<String>();
      natureIds.addAll(Arrays.asList(description.getNatureIds()));
      final String key;
      if (natureIds.contains(TexoProjectNature.NATURE_ID)) {
        natureIds.remove(TexoProjectNature.NATURE_ID);
        key = "removedNature"; //$NON-NLS-1$
      } else {
        natureIds.add(TexoProjectNature.NATURE_ID);
        key = "addedNature"; //$NON-NLS-1$
      }
      description.setNatureIds(natureIds.toArray(new String[natureIds.size()]));
      project.setDescription(description, null);

      final String title = Messages.getString(key + ".title"); //$NON-NLS-1$
      final String message = Messages.formatMessage(key + ".message", project.getName()); //$NON-NLS-1$
      MessageDialog.openInformation(shell, title, message);

    } catch (CoreException e) {
      MessageDialog.openError(shell, Messages.getString("error"), Messages //$NON-NLS-1$
          .getString("addRemoveNatureError.message")); //$NON-NLS-1$
      TexoEclipsePlugin.getInstance().logException("Error adding/removing Elver UI project nature.", e);//$NON-NLS-1$
    }
  }

  public void dispose() {
  }
}
