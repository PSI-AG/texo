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
 * $Id: ByteDataGenerator.java,v 1.5 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator.attributegenerators;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.texo.datagenerator.EDataTypeDataGenerator;

/**
 * Generates a byte array value.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */

public class ByteArrayDataGenerator extends EDataTypeDataGenerator {

  @Override
  protected void initialize() {
    final List<Object> localValues = new ArrayList<Object>();
    for (int i = 0; i < 10; i++) {
      final byte[] bytes = new byte[Byte.MAX_VALUE];
      for (byte b = 0; b < Byte.MAX_VALUE; b++) {
        bytes[b] = b;
      }
      localValues.add(bytes);
    }
    setValues(localValues);
  }
}