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
 * $Id: MergingOutputHandler.java,v 1.14 2011/08/25 12:34:30 mtaal Exp $
 */
package org.eclipse.emf.texo.generator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.PostProcessor;

/**
 * Receives the output of a generate action and the target location. Reads the current source from there and merges the
 * generation output and the current content.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public abstract class MergingOutputHandler implements PostProcessor {

  private String projectName;
  private IProgressMonitor monitor;
  private int totalCount = 100;

  public void afterClose(final FileHandle impl) {
  }

  /**
   * Merges the generated source and new source and if changed saves the new source.
   * 
   * @param fileHandle
   *          the file to save to
   */
  public void beforeWriteAndClose(final FileHandle fileHandle) {
    // final String targetLocation = fileHandle.getAbsolutePath();
    final String targetLocation = fileHandle.getAbsolutePath();

    if (monitor != null) {
      monitor.worked(1);
      monitor.subTask(targetLocation);
    }
    try {

      // TODO: get project specific options
      boolean doMerge = false;
      for (final String extension : getSupportedExtensions()) {
        if (targetLocation.endsWith(extension)) {
          doMerge = true;
          break;
        }
      }
      if (doMerge) {
        merge(fileHandle);
      }
    } catch (final IllegalStateException ex) {
      throw ex;
    } catch (final Exception e) {
      // catch them all
      throw new IllegalStateException("Exception while merging and saving source file in merging output handler " //$NON-NLS-1$
          + targetLocation + " " + e.getMessage() + " " + e, e); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * Does the merge operation and sets the new content in the fileHandle.
   * 
   * Note: changes the content of the fileHandler
   */
  protected abstract void merge(FileHandle fileHandle);

  /**
   * @return the projectName
   */
  public String getProjectName() {
    return projectName;
  }

  /**
   * @param projectName
   *          the projectName to set
   */
  public void setProjectName(final String projectName) {
    this.projectName = projectName;
  }

  protected String[] getSupportedExtensions() {
    return new String[] {};
  }

  public IProgressMonitor getMonitor() {
    return monitor;
  }

  public void setMonitor(IProgressMonitor monitor) {
    this.monitor = monitor;
  }

  public int getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }
}