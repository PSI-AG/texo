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
 * $Id: FileCleaner.java,v 1.8 2011/08/25 12:34:30 mtaal Exp $
 */

package org.eclipse.emf.texo.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.VetoStrategy;

/**
 * Responsible for removing files which are not regenerated. Uses a threadlocal to collect all generated files, finds
 * the directory in which generation takes place and then removes all non generated files.
 * 
 * TODO: Also remove directories which have become empty because of removal of non-generated files.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class FileCleaner {

  private List<String> fileLocations = new ArrayList<String>();

  public VetoStrategy getNewOutputLocationTracker() {
    return new OutputLocationTracker();
  }

  public void addFileLocation(final String fileLocation) {
    fileLocations.add(fileLocation);
  }

  public void clean() {
    try {
      final List<String> directoryDone = new ArrayList<String>();
      for (final String fileLocation : fileLocations) {
        final File file = new File(fileLocation);
        final File directory = file.getParentFile();
        if (directoryDone.contains(directory.getAbsolutePath())) {
          continue;
        }
        for (final File childFile : directory.listFiles()) {
          if (childFile.isDirectory()) {
            continue;
          }
          if (!fileLocations.contains(childFile.getAbsolutePath())) {
            childFile.delete();
          }
        }
      }
    } catch (final Exception e) {
      throw new IllegalStateException(e);
    }
  }

  /**
   * An instance of this class is added to each outlet, it keeps track of the file output locations and sets these in
   * the FileCleaner ({@link FileCleaner#addFileLocation(String)}]). This makes sure that these files/locations are not
   * overwritten.
   * 
   * @author mtaal
   */
  private class OutputLocationTracker implements VetoStrategy {

    public boolean hasVeto(FileHandle handle) {
      addFileLocation(handle.getAbsolutePath());
      return false;
    }

  }
}
