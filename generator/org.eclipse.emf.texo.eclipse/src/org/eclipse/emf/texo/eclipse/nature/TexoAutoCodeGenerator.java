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
 * $Id: TexoProjectNature.java,v 1.4 2011/08/25 12:36:19 mtaal Exp $
 */
package org.eclipse.emf.texo.eclipse.nature;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.texo.eclipse.ProjectPropertyUtil;
import org.eclipse.emf.texo.eclipse.popup.actions.GenerateCode;

/**
 * Regenerate source code if a model file changes.
 * 
 * @author mtaal
 */
public class TexoAutoCodeGenerator extends IncrementalProjectBuilder {

  public static final String BUILDER_ID = "org.eclipse.emf.texo.eclipse.TexoAutoCodeGenerator";

  public static void addRemoveProjectBuilder(IProject project, boolean add) {
    try {
      final IProjectDescription desc = project.getDescription();
      final List<ICommand> commands = new ArrayList<ICommand>();
      ICommand currentCommand = null;
      for (ICommand command : desc.getBuildSpec()) {
        commands.add(command);
        if (command.getBuilderName().equals(BUILDER_ID)) {
          currentCommand = command;
        }
      }
      // not there and no add
      if (currentCommand != null) {
        if (add) {
          // already there go away
          return;
        } else {
          commands.remove(currentCommand);
        }
      } else {
        // add builder to project
        ICommand command = desc.newCommand();
        command.setBuilderName(BUILDER_ID);
        // Add it before other builders.
        // so that code is generated before the others are done
        commands.add(0, command);
      }
      desc.setBuildSpec(commands.toArray(new ICommand[commands.size()]));
      project.setDescription(desc, null);
    } catch (CoreException e) {
      throw new IllegalStateException(e);
    }
  }

  @SuppressWarnings("rawtypes")
  @Override
  protected IProject[] build(int kind, Map args, IProgressMonitor monitor) {
    if (kind != IncrementalProjectBuilder.FULL_BUILD) {
      IResourceDelta delta = getDelta(getProject());
      if (delta != null) {
        try {
          incrementalBuild(delta, monitor);
        } catch (IllegalStateException e) {
          // ignore, be robust if ecores/epackages are not valid
        }
      }
    }
    return null;
  }

  private void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) {
    final List<IFile> files = new ArrayList<IFile>();
    try {
      delta.accept(new IResourceDeltaVisitor() {
        public boolean visit(IResourceDelta delta) {
          if (delta.getKind() != IResourceDelta.ADDED && delta.getKind() != IResourceDelta.CHANGED) {
            return false;
          }
          final IResource resource = delta.getResource();
          if (resource instanceof IFile) {
            final String extension = resource.getRawLocation().getFileExtension();
            if (extension == null) {
              return true;
            }
            if (extension.endsWith("ecore")) {
              files.add((IFile) resource);
            } else if (extension.endsWith("xcore")) {
              files.add((IFile) resource);
            } else if (extension.endsWith("xsd")) {
              files.add((IFile) resource);
            } else if (extension.endsWith("annotationsmodel")) {
              final String name = resource.getName();
              int dashIndex = name.indexOf("-");
              if (dashIndex == -1) {
                dashIndex = name.indexOf(".");
              }
              if (dashIndex != -1) {
                IFile modelFile = null;
                // first try the xcore file
                {
                  final String modelFileName = name.substring(0, dashIndex) + ".xcore";
                  final IPath path = resource.getParent().getFullPath().append(modelFileName);
                  modelFile = resource.getParent().getFile(path.makeRelativeTo(resource.getParent().getFullPath()));
                }
                if (!modelFile.exists()) {
                  final String modelFileName = name.substring(0, dashIndex) + ".ecore";
                  final IPath path = resource.getParent().getFullPath().append(modelFileName);
                  modelFile = resource.getParent().getFile(path.makeRelativeTo(resource.getParent().getFullPath()));
                }
                if (modelFile.exists()) {
                  files.add(modelFile);
                }
              }
            }
          }
          return true; // visit children too
        }
      });

      final Properties props = ProjectPropertyUtil.getProjectProperties(getProject());
      if (props.containsKey(ProjectPropertyUtil.MODEL_LOCATION_PROPERTY)
          && props.getProperty(ProjectPropertyUtil.MODEL_LOCATION_PROPERTY).trim().length() > 0) {
        final String modelFilter = props.getProperty(ProjectPropertyUtil.MODEL_LOCATION_PROPERTY);
        final IPath modelPath = getProject().getFullPath().append(modelFilter);
        final List<IFile> toIgnore = new ArrayList<IFile>();
        for (IFile file : files) {
          if (modelPath != null && !modelPath.isPrefixOf(file.getFullPath())) {
            toIgnore.add(file);
          }
        }
        files.removeAll(toIgnore);
      } else {
        files.clear();
      }

      // now generate on the basis of the ecore files
      if (files.size() > 0) {
        final GenerateCode action = new GenerateCode();
        if (props.containsKey(ProjectPropertyUtil.ENABLE_DAO_PROPERTY)) {
          action.setDoDao(true);
        }
        if (props.containsKey(ProjectPropertyUtil.ENABLE_JPA_PROPERTY)) {
          action.setDoJpa(true);
        }
        action.setModelFiles(files);
        action.generate(monitor);
      }
    } catch (CoreException e) {
      e.printStackTrace();
    }
  }
}