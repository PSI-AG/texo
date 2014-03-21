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
 * $Id: XMLDateTimeDataGenerator.java,v 1.9 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator.attributegenerators;

import java.util.Calendar;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.datagenerator.EDataTypeDataGenerator;

/**
 * Generates a XMLGregorianCalendar DateTime value.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */

public class XMLDateTimeDataGenerator extends EDataTypeDataGenerator {

  private Calendar calendar = Calendar.getInstance();

  @Override
  protected Object getNextValue() {
    calendar.add(Calendar.DATE, 1 + calendar.get(Calendar.DATE));
    if (calendar.get(Calendar.DATE) > 28) {
      calendar.set(Calendar.DATE, 1);
    }

    final XMLTypeFactory factory = XMLTypePackage.eINSTANCE.getXMLTypeFactory();
    final XMLGregorianCalendar xmlCalendar = factory.createDate("2010-02-04T17:17:17+01:00"); //$NON-NLS-1$
    xmlCalendar.setYear(calendar.get(Calendar.YEAR));
    xmlCalendar.setMonth(1 + calendar.get(Calendar.MONTH));
    xmlCalendar.setDay(calendar.get(Calendar.DATE));
    return xmlCalendar;
  }
}