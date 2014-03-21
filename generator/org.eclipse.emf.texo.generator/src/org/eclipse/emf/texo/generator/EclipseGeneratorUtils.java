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
 * $Id: EclipseGeneratorUtils.java,v 1.9 2011/08/25 12:34:30 mtaal Exp $
 */

package org.eclipse.emf.texo.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;

/**
 * Several utility methods for the eclipse code generator.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EclipseGeneratorUtils {

  /** Returns the workspace path to the source directory */
  public static String getSourceDirectory(final IProject project) {
    try {
      final IJavaProject javaProject = JavaCore.create(project);
      final IPath sourcePath = javaProject.getPackageFragmentRoots()[0].getPath();
      return sourcePath.toString();
    } catch (final JavaModelException e) {
      throw new IllegalStateException(e);
    }
  }

  /**
   * @param projectName
   *          the name of the project to search for
   * @return the project present in the current workspace, throws IllegalStateException if the project can not be found
   */
  public static IProject getProject(String projectName) {
    final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
    if (project == null) {
      throw new IllegalStateException("Project " + projectName //$NON-NLS-1$
          + " does not exist in workspace"); //$NON-NLS-1$
    }
    return project;
  }

  /**
   * Returns the path to the project, is appended to the path of each outlet.
   */
  public static String getProjectFilePath(final String projectName) {
    final IProject project = getProject(projectName);
    if (project == null || project.getLocation() == null) {
      throw new IllegalStateException("Project " + projectName + " not found"); //$NON-NLS-1$ //$NON-NLS-2$
    }
    if (project.getRawLocation() == null) {
      return project.getLocation().toOSString();
    }
    return project.getRawLocation().toOSString();
  }

  /** Converts a classname to a java class file name */
  public static String getSourceFilePath(final String target) {
    final StringBuilder sb = new StringBuilder();

    // only the file extension should not be replaced by a dot
    final int lastDot = target.lastIndexOf("."); //$NON-NLS-1$
    // target can be set as a classname like pattern
    if (lastDot != -1) {
      for (final String segment : target.substring(0, lastDot).split("\\.")) { //$NON-NLS-1$
        sb.append("/" + segment); //$NON-NLS-1$
      }
      return sb.toString() + target.substring(lastDot);
    }
    for (final String segment : target.substring(0, lastDot).split("\\.")) { //$NON-NLS-1$
      sb.append("/" + segment); //$NON-NLS-1$
    }
    return sb.toString();
  }

  public static String getPathInWorkSpace(final String path) {
    final String wsRootPath = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toFile().getAbsolutePath();
    if (!path.startsWith(wsRootPath)) {
      throw new IllegalArgumentException("Path is not within current workspace: " + path //$NON-NLS-1$
          + " workspacepath " + wsRootPath); //$NON-NLS-1$
    }
    return path.substring(wsRootPath.length() + 1);
  }

  /** Create the workspacepath */
  public static void checkCreateWorkspacePath(final String wsPath) throws CoreException {
    final IPath path = new Path(wsPath);
    final IProgressMonitor monitor = new NullProgressMonitor();
    IContainer container = null;
    final IWorkspace workspace = ResourcesPlugin.getWorkspace();
    for (final String segment : path.segments()) {
      if (container == null) {
        // TODO first one is a project check if project exixts
        container = workspace.getRoot().getProject(path.segment(0));
      } else {
        final IFolder folder = container.getFolder(new Path(segment));
        if (!folder.exists()) {
          folder.create(true, true, monitor);
        }
        container = folder;
      }
    }
  }

  /** Checks if a certain file already exists in the workspace path */
  public static boolean exists(final String wsPath) {
    return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(wsPath)).exists();
  }

  /** Format the code using the code formatter */
  public static String formatSource(final String contents, final Object codeFormatter)
      throws org.eclipse.jface.text.BadLocationException {
    String localContents = contents;
    if (codeFormatter instanceof CodeFormatter) {
      final IDocument doc = new Document(contents);
      final TextEdit edit = ((CodeFormatter) codeFormatter).format(CodeFormatter.K_COMPILATION_UNIT
          | CodeFormatter.F_INCLUDE_COMMENTS, doc.get(), 0, doc.get().length(), 0, null);

      if (edit != null) {
        edit.apply(doc);
        localContents = doc.get();
      }
    }
    return localContents;
  }

  /**
   * @return the encoding of the file, if the file does not exist then null is returned
   */
  public static String getEncoding(final String wsPath) throws CoreException {
    final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(wsPath));
    if (!file.exists()) {
      return null;
    }
    return file.getCharset();
  }

  /** Read the properties from the property file */
  public static Properties readProperties(final IResource modelResource) {
    final File file = getPropertiesFile(modelResource);
    try {
      final Properties props = new Properties();
      final InputStream is = new FileInputStream(file);
      props.load(is);
      is.close();
      return props;
    } catch (final IOException e) {
      throw new IllegalStateException("IOException for file on path " //$NON-NLS-1$
          + file.getAbsolutePath(), e);
    }
  }

  /** Store the properties */
  public static void saveProperties(final IResource modelResource, final Properties props) {
    final File file = getPropertiesFile(modelResource);
    try {
      final OutputStream os = new FileOutputStream(file);
      props.store(os, null);
      os.close();

      // refresh
      modelResource.getParent().refreshLocal(IResource.DEPTH_INFINITE, null);
    } catch (final Exception e) {
      throw new IllegalStateException("Exception for file on path " //$NON-NLS-1$
          + file.getAbsolutePath(), e);
    }
  }

  /** get the properties files, creates a prop file if it does not exist yet */
  public static File getPropertiesFile(final IResource modelResource) {
    final String ecorePath = modelResource.getLocation().toOSString();
    if (!(ecorePath.endsWith(".ecore") //$NON-NLS-1$
        || ecorePath.endsWith(".xsd") //$NON-NLS-1$
    || ecorePath.endsWith(".genprops"))) { //$NON-NLS-1$
      throw new IllegalArgumentException("Path does not point to a real ecore file: " + ecorePath); //$NON-NLS-1$
    }
    final String genPropsPath = ecorePath.substring(0, ecorePath.lastIndexOf(".")) //$NON-NLS-1$
        + ".genprops"; //$NON-NLS-1$
    final File file = new File(genPropsPath);
    try {
      if (!file.exists()) {
        file.createNewFile();
      }
      return file;
    } catch (final IOException e) {
      throw new IllegalStateException("IOException for file on path " //$NON-NLS-1$
          + genPropsPath, e);
    }
  }

  /**
   * Creates the folder to store the generated sources on the basis of the java package name.
   */
  public static IContainer getOrCreateContainer(final IProject project, final String javaPackageName) {
    try {
      final ArrayList<String> pathSegments = new ArrayList<String>();

      pathSegments.add("src"); // default should be there anyway! //$NON-NLS-1$
      final String[] pathParts = javaPackageName.split("\\."); //$NON-NLS-1$
      for (final String pathSegment : pathParts) {
        pathSegments.add(pathSegment);
      }

      IContainer container = project;
      for (final String pathSegment : pathSegments) {
        final IFolder folder = container.getFolder(new Path(pathSegment));
        if (!folder.exists()) {
          folder.create(false, true, new NullProgressMonitor());
        }
        container = folder;
      }
      return container;
    } catch (final Exception e) {
      throw new IllegalStateException("Exception while creating folders for: " + javaPackageName); //$NON-NLS-1$
    }
  }

  /** A monitor used too display the progress */
  public static class CodeGenMonitor extends NullProgressMonitor {
    protected PrintStream printStream;

    /** Set the print stream to output to */
    public CodeGenMonitor(final PrintStream printStream) {
      this.printStream = printStream;
    }

    /** Begin the task, prints to the output stream */
    @Override
    public void beginTask(final String name, final int totalWork) {
      if (name != null && name.length() != 0) {
        // printStream.println(">>> " + name);
      }
      super.beginTask(name, totalWork);
    }

    /** Set the task name, prints to the outputstream */
    @Override
    public void setTaskName(final String name) {
      if (name != null && name.length() != 0) {
        // printStream.println("<>> " + name);
      }
      super.setTaskName(name);
    }

    /** A subtask */
    @Override
    public void subTask(final String name) {
      if (name != null && name.length() != 0) {
        // printStream.println(">> " + name);
      }
      super.subTask(name);
    }
  }

  /** Search for another file next to this URI */
  public static URI getSibling(final URI uri, final String siblingSuffix) {
    try {
      final String uriStr = uri.toString();
      // strip the last part
      if (uriStr.lastIndexOf(".") != -1) { //$NON-NLS-1$
        final String newUriStr = uriStr.substring(0, 1 + uriStr.lastIndexOf(".")) //$NON-NLS-1$
            + siblingSuffix;
        return new URI(newUriStr);
      }
      return new URI(uriStr + siblingSuffix);
    } catch (final Exception e) {
      throw new IllegalStateException("Exception while getting sibling uri " + siblingSuffix, e); //$NON-NLS-1$
    }
  }

  /** @return the project denoted by the projectName */
  public static IJavaProject getJavaProject(final String projectName) {
    final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
    return JavaCore.create(project);
  }
}
