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
 * $Id: CollectionDataGenerator.java,v 1.4 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator.attributegenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.texo.datagenerator.DataGeneratorUtils;
import org.eclipse.emf.texo.datagenerator.EDataTypeDataGenerator;

/**
 * Generates a value for a specific EDataType.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */

public class CollectionDataGenerator extends EDataTypeDataGenerator {

  // itemDataGenerator is used for EDataType's which have a collection instance
  // class and a definition of the type of the elements in the collection
  private EDataTypeDataGenerator itemDataGenerator;
  private boolean itemDataGeneratorInitializationDone = false;

  @Override
  protected Object getNextValue() {
    if (itemDataGenerator == null) {
      initializeItemDataGenerator();
    }
    try {
      final Object collectionObject;
      if (List.class.isAssignableFrom(getInstanceClass())) {
        collectionObject = new ArrayList<Object>();
      } else if (Set.class.isAssignableFrom(getInstanceClass())) {
        collectionObject = new HashSet<Object>();
      } else {
        collectionObject = getInstanceClass().newInstance();
      }
      @SuppressWarnings("unchecked")
      final Collection<Object> collection = (Collection<Object>) collectionObject;
      if (itemDataGenerator != null) {
        for (int i = 0; i < getModelDataGenerator().getCollectionSize(); i++) {
          collection.add(itemDataGenerator.createValue());
        }
      }
      return collection;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  protected void initializeItemDataGenerator() {
    if (itemDataGeneratorInitializationDone) {
      return;
    }
    itemDataGeneratorInitializationDone = true;
    EDataType itemDataType = DataGeneratorUtils.getItemType(getEDataType());
    if (itemDataType != null) {
      itemDataGenerator = getModelDataGenerator().getEDataTypeDataGenerator(itemDataType, null);
    }
  }
}