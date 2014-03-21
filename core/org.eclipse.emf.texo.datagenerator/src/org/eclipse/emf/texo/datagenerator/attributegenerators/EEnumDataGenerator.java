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
 * $Id: EEnumDataGenerator.java,v 1.11 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator.attributegenerators;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.texo.datagenerator.DataGeneratorUtils;
import org.eclipse.emf.texo.datagenerator.EDataTypeDataGenerator;

/**
 * Generates a value for a EEnum.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.11 $
 */

public class EEnumDataGenerator extends EDataTypeDataGenerator {

  @SuppressWarnings("unchecked")
  @Override
  protected void initialize() {
    // determine the enum values, get one and get an instance and its class
    final EDataType eDataType = getEDataType();

    final EEnum eeNum;
    if (null != DataGeneratorUtils.getEnumBaseDataTypeIfObject(eDataType)) {
      eeNum = DataGeneratorUtils.getEnumBaseDataTypeIfObject(eDataType);
    } else {
      eeNum = (EEnum) getEDataType();
    }

    final List<Object> values = new ArrayList<Object>();
    if (eDataType.getInstanceClass() != null && !getModelDataGenerator().isUseDynamicEnums()) {
      @SuppressWarnings("rawtypes")
      final Class<? extends Enum> enumClz = (Class<? extends Enum>) eDataType.getInstanceClass();
      try {
        final Object[] enums = (Object[]) enumClz.getMethod("values").invoke(null); //$NON-NLS-1$
        for (Object enumValue : enums) {
          values.add(enumValue);
        }
      } catch (Exception e) {
        values.addAll(eeNum.getELiterals());
      }
    } else {
      values.addAll(eeNum.getELiterals());
    }

    setValues(values);
  }
}