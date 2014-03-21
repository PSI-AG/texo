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
 * $Id: QNameDataGenerator.java,v 1.3 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator.attributegenerators;

import javax.xml.namespace.QName;

import org.eclipse.emf.texo.datagenerator.EDataTypeDataGenerator;

/**
 * Generates a QName consisting of the EAttribute name with an index number and the texo url as the namespace.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public class QNameDataGenerator extends EDataTypeDataGenerator {

  private int index = 0;

  @Override
  protected synchronized Object getNextValue() {
    index++;
    return new QName("http://wiki.eclipse.org/Texo", getEDataType().getName() + index); //$NON-NLS-1$
  }
}