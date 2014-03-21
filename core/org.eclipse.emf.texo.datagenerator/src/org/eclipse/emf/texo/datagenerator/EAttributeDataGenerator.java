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
 * $Id: EAttributeDataGenerator.java,v 1.10 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * Generates a value for a specific EAttribute and sets it in an EObject. Uses an {@link EDataTypeDataGenerator}
 * internally to create the data.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.10 $
 */

public class EAttributeDataGenerator extends EStructuralFeatureDataGenerator {

  private EAttribute eAttribute;
  private EDataTypeDataGenerator eDataTypeDataGenerator;

  /**
   * Creates the data for one {@link EAttribute) and sets it in the passed {@link EObject}.
   * 
   * @param eObject
   *          the EObject in which a value is set
   * @param depth
   *          is ignored, only relevant for EReferences
   */
  @Override
  public void setData(final EObject eObject) {
    if (eAttribute.isMany()) {
      @SuppressWarnings("unchecked")
      final List<Object> localValues = (List<Object>) eObject.eGet(eAttribute);
      for (int i = 0; i < getModelDataGenerator().getCollectionSize(); i++) {
        final Object value = eDataTypeDataGenerator.createValue();
        if (value != null) {
          localValues.add(value);
        }
      }
    } else {
      eObject.eSet(eAttribute, eDataTypeDataGenerator.createValue());
    }
  }

  @Override
  public Object createValue(EObject eObject) {
    return eDataTypeDataGenerator.createValue();
  }

  public EAttribute getEAttribute() {
    return eAttribute;
  }

  public void setEAttribute(final EAttribute attribute) {
    eAttribute = attribute;
    eDataTypeDataGenerator = getModelDataGenerator().getEDataTypeDataGenerator(eAttribute.getEAttributeType(),
        attribute);
    super.setEStructuralFeature(attribute);
  }
}