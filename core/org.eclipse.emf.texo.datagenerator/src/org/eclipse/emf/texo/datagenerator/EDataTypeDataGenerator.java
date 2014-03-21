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
 * $Id: EDataTypeDataGenerator.java,v 1.3 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator;

import java.lang.reflect.Array;
import java.util.List;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.util.ExtendedMetaData;

/**
 * Generates a value for a specific EDataType.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public abstract class EDataTypeDataGenerator extends DataGenerator {

  private EDataType eDataType;

  private List<Object> values;
  private int currentIndex = 0;

  private int maxLength = -1;

  private boolean isArray = false;
  private Class<?> instanceClass = null;

  // is used for xml id's, not all edatatype generators are able to use this
  // but the most common ones (string, int, long) should support it
  private boolean mustBeGloballyUnique;

  @Override
  public String toString() {
    return eDataType.getName();
  }

  public Object createValue() {
    if (isArray) {
      final Object array = Array.newInstance(getInstanceClass(), getModelDataGenerator().getCollectionSize());
      for (int i = 0; i < getModelDataGenerator().getCollectionSize(); i++) {
        Array.set(array, i, correctLength(getNextValue()));
      }
      return array;
    }
    return correctLength(getNextValue());
  }

  private Object correctLength(final Object value) {
    if (value instanceof String && maxLength != -1 && ((String) value).length() > maxLength) {
      return ((String) value).substring(0, maxLength);
    }
    return value;
  }

  protected Object getNextValue() {
    if (currentIndex == values.size()) {
      currentIndex = 0;
    }
    return values.get(currentIndex++);
  }

  public List<Object> getValues() {
    return values;
  }

  public void setValues(final List<Object> values) {
    this.values = values;
  }

  public Class<?> getInstanceClass() {
    return instanceClass;
  }

  public void setInstanceClass(final Class<?> instanceClass) {
    this.instanceClass = instanceClass;
  }

  public EDataType getEDataType() {
    return eDataType;
  }

  public void setEDataType(EDataType eDataType) {
    this.eDataType = eDataType;
    maxLength = ExtendedMetaData.INSTANCE.getMaxLengthFacet(eDataType);
    final Class<?> localInstanceClass = DataGeneratorUtils.getInstanceClass(eDataType);
    if (localInstanceClass != null && localInstanceClass.isArray()) {
      isArray = true;
      setInstanceClass(localInstanceClass.getComponentType());
    } else {
      setInstanceClass(localInstanceClass);
    }
    initialize();
  }

  protected void initialize() {

  }

  public boolean isMustBeGloballyUnique() {
    return mustBeGloballyUnique;
  }

  public void setMustBeGloballyUnique(boolean mustBeGloballyUnique) {
    this.mustBeGloballyUnique = mustBeGloballyUnique;
  }

}