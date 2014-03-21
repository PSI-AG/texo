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
 * $Id: StringFileDataGenerator.java,v 1.7 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator.attributegenerators;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.texo.datagenerator.EAttributeDataGenerator;
import org.eclipse.emf.texo.datagenerator.EDataTypeDataGenerator;

/**
 * Generates a String value on the basis of the content of a file passed in the {@link #setDataContent(String)} method.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */

public class StringFileDataGenerator extends EDataTypeDataGenerator {

  private int valuesPerEAttribute = 1;

  @Override
  protected Object getNextValue() {
    final StringBuilder sb = new StringBuilder();
    for (int i = 0; i < valuesPerEAttribute; i++) {
      if (sb.length() > 0) {
        sb.append(" "); //$NON-NLS-1$
      }
      sb.append(super.getNextValue());
    }
    return sb.toString();
  }

  /**
   * Reads the content of the passed file and sets it in the {@link EAttributeDataGenerator#setValues(List)} method.
   * 
   * @param fileResource
   *          the resource to read, should contain one string per line
   */
  public void setDataContent(final String fileResource) {
    try {
      final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.getClass()
          .getResourceAsStream(fileResource)));
      String line;
      final List<Object> localValues = new ArrayList<Object>();
      while ((line = bufferedReader.readLine()) != null) {
        localValues.add(line.trim());
      }
      setValues(localValues);
    } catch (final Exception e) {
      throw new IllegalStateException("Exception, reading resource " //$NON-NLS-1$
          + fileResource, e);
    }

  }

  public int getValuesPerEAttribute() {
    return valuesPerEAttribute;
  }

  public void setValuesPerEAttribute(final int valuesPerEAttribute) {
    this.valuesPerEAttribute = valuesPerEAttribute;
  }
}