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
 * $Id: EReferenceDataGenerator.java,v 1.11 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Generates/sets a value for a specific EReference. Calls the {@link EClassDataGenerator} of the
 * {@link EReference#getEReferenceType()} to get an existing object or create a new one.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.11 $
 */

public class EReferenceDataGenerator extends EStructuralFeatureDataGenerator {

  private EReference eReference;
  private EClassDataGenerator eClassDataGenerator;

  public EReference getEReference() {
    return eReference;
  }

  public void setEReference(final EReference reference) {
    eReference = reference;
    super.setEStructuralFeature(reference);
  };

  /**
   * Sets the value of the {@link #getEReference()} in the owner. Only if the EReference has not been set yet.
   * 
   * @param owner
   *          the EObject for which the value will be set
   */
  @Override
  public void setData(final EObject owner) {
    if (owner.eIsSet(getEReference())) {
      return;
    }
    boolean isRequired = !getEReference().isMany() && getEReference().isRequired();

    if (!isRequired && getModelDataGenerator().isConsiderOnlyMandatoryFeatures()) {
      return;
    }

    // be modest with objects at the maximum depth for containment features
    if (getEReference().isContainment() && !isRequired && computeDepth(owner) >= getModelDataGenerator().getMaxDepth()) {
      return;
    }

    if (eReference.isMany()) {
      @SuppressWarnings("unchecked")
      final EList<EObject> values = (EList<EObject>) owner.eGet(eReference);
      int added = 0;
      for (int i = 0; i < getModelDataGenerator().getCollectionSize(); i++) {
        final EObject value = createValue(owner);
        // note addToEList actually adds to the list
        if (value != null && DataGeneratorUtils.addToEList(values, value)) {
          added++;
        }
      }
      // if there where not enough existing ones, then add new objects
      for (int i = 0; i < getModelDataGenerator().getCollectionSize() - added; i++) {
        if (eClassDataGenerator == null) {
          eClassDataGenerator = getModelDataGenerator().getEClassDataGenerator(eReference.getEReferenceType());
        }
        final EObject eObject = eClassDataGenerator.createEObject();
        // note addToEList actually adds to the list
        if (eObject != null && DataGeneratorUtils.addToEList(values, eObject)) {
          added++;
        }
      }
    } else {
      owner.eSet(eReference, createValue(owner));
    }
  }

  private int computeDepth(EObject owner) {
    if (owner.eContainer() == null) {
      return 0;
    }
    return 1 + computeDepth(owner.eContainer());
  }

  @Override
  public EObject createValue(final EObject owner) {
    if (eClassDataGenerator == null) {
      eClassDataGenerator = getModelDataGenerator().getEClassDataGenerator(eReference.getEReferenceType());
    }
    final EClass eClass = eClassDataGenerator.getNextConcreteEClass();
    if (eClass.eIsProxy()) {
      EcoreUtil.resolve(eClass, eReference.getEContainingClass().getEPackage().eResource().getResourceSet());
    }

    return eClassDataGenerator.getCreateEObject(owner, eReference);
  }
}