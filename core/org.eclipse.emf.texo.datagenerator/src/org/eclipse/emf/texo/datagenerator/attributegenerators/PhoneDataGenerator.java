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
 * $Id: PhoneDataGenerator.java,v 1.6 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator.attributegenerators;

import org.eclipse.emf.texo.datagenerator.EDataTypeDataGenerator;

/**
 * Generates a Phone value using a pattern.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public class PhoneDataGenerator extends EDataTypeDataGenerator {

  private String pattern = "1-nnn-nnn-nnnn"; //$NON-NLS-1$

  @Override
  protected Object getNextValue() {
    final int[] data = getRandomNumbers();
    final StringBuilder sb = new StringBuilder();
    int i = 0;
    for (final char ch : pattern.toCharArray()) {
      if (ch == 'n') {
        sb.append(data[i++] + ""); //$NON-NLS-1$
      } else {
        sb.append(ch);
      }
    }
    return sb.toString();
  }

  private int[] getRandomNumbers() {
    final int[] data = new int[10];
    for (int i = 0; i < 10; i++) {
      data[i] = (int) Math.round((10 * Math.random()));
    }
    return data;
  }

  public String getPattern() {
    return pattern;
  }

  public void setPattern(final String pattern) {
    this.pattern = pattern;
  }
}