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
 * $Id: DurationDataGenerator.java,v 1.4 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator.attributegenerators;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.xml.type.internal.XMLDuration;
import org.eclipse.emf.texo.datagenerator.EDataTypeDataGenerator;

/**
 * Generates a Duration value.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */

public class DurationDataGenerator extends EDataTypeDataGenerator {

  @Override
  protected void initialize() {
    final List<Object> durations = new ArrayList<Object>();
    durations.add(new XMLDuration("P5Y2M10DT15H")); //$NON-NLS-1$
    durations.add(new XMLDuration("P5Y2M10D")); //$NON-NLS-1$
    durations.add(new XMLDuration("PT15H")); //$NON-NLS-1$
    durations.add(new XMLDuration("P10Y2M")); //$NON-NLS-1$
    setValues(durations);
  }
}