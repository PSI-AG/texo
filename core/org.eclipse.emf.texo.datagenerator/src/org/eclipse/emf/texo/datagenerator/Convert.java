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
 * $Id: Convert.java,v 1.5 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 * Utility class to convert data
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */

public class Convert {

  public static void main(final String[] args) throws Exception {
    final BufferedReader reader = new BufferedReader(new FileReader("/home/mtaal/mytmp/street.txt")); //$NON-NLS-1$
    try {
      String line;
      final Collection<String> strs = new HashSet<String>();
      while ((line = reader.readLine()) != null) {
        if (line.trim().length() == 0) {
          continue;
        }
        int fromIndex = 0;
        final String startStr = "</a><br>"; //$NON-NLS-1$
        final String endStr = "<a href=maps"; //$NON-NLS-1$
        while (line.indexOf(startStr, fromIndex) != -1) {
          final int startIndex = line.indexOf(startStr, fromIndex);
          final int endIndex = line.indexOf(endStr, startIndex);
          if (endIndex == -1) {
            break;
          }
          strs.add(line.substring(startIndex + startStr.length(), endIndex).trim());
          fromIndex = endIndex;
        }
      }
      sortAndPrint(strs);
    } finally {
      reader.close();
    }
  }

  public static void main2(final String[] args) throws Exception {
    final BufferedReader reader = new BufferedReader(new FileReader("/home/mtaal/mytmp/city_zip.txt")); //$NON-NLS-1$
    try {
      String line;
      final Collection<String> zips = new HashSet<String>();
      final Collection<String> cities = new HashSet<String>();
      while ((line = reader.readLine()) != null) {
        if (line.trim().length() == 0) {
          continue;
        }
        final String[] parts = line.split(" "); //$NON-NLS-1$
        final String zip = parts[0];
        final StringBuilder city = new StringBuilder();
        for (int i = 1; i < parts.length - 1; i++) {
          if (city.length() > 0) {
            city.append(" "); //$NON-NLS-1$
          }
          city.append(parts[i]);
        }
        zips.add(zip);
        cities.add(city.toString());
      }
      sortAndPrint(zips);
      sortAndPrint(cities);
    } finally {
      reader.close();
    }
  }

  private static void sortAndPrint(final Collection<String> values) {
    final List<String> list = new ArrayList<String>(values);
    Collections.sort(list, new StringComparator());
    for (final String value : values) {
      System.err.println(value);
    }
  }

  private static class StringComparator implements Comparator<String> {
    public int compare(final String o1, final String o2) {
      final int compareOn = Math.min(o1.length(), o2.length()) - 1;
      if (compareOn < 1) {
        return -1;
      }
      return o1.toCharArray()[compareOn] - o2.toCharArray()[compareOn];
    }
  }

}
