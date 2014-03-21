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
 * $Id: DateDataGenerator.java,v 1.6 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator.attributegenerators;

import java.util.Calendar;

import org.eclipse.emf.texo.datagenerator.EDataTypeDataGenerator;

/**
 * Generates a Date value.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public class DateDataGenerator extends EDataTypeDataGenerator {

  private Calendar calendar = Calendar.getInstance();

  @Override
  protected Object getNextValue() {
    calendar.add(Calendar.DATE, 1 + calendar.get(Calendar.DATE));
    if (calendar.get(Calendar.DATE) > 28) {
      calendar.set(Calendar.DATE, 1);
    }
    return calendar.getTime();
  }
}