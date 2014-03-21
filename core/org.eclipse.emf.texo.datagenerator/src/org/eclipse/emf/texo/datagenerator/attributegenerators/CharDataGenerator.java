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
 * $Id: CharDataGenerator.java,v 1.5 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator.attributegenerators;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.texo.datagenerator.EDataTypeDataGenerator;

/**
 * Generates a Byte value.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */

public class CharDataGenerator extends EDataTypeDataGenerator {

  @Override
  protected void initialize() {
    final List<Object> localValues = new ArrayList<Object>();
    for (char c : "THISISATESTSTRING".toCharArray()) { //$NON-NLS-1$
      localValues.add(c);
    }
    setValues(localValues);
  }
}