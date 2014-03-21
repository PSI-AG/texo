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
 * $Id: FeatureMapDataGenerator.java,v 1.7 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * Generates a feature map entry.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */

public class FeatureMapDataGenerator extends EStructuralFeatureDataGenerator {

  private List<EStructuralFeatureDataGenerator> dataGenerators = new ArrayList<EStructuralFeatureDataGenerator>();
  private int currentIndex = 0;

  @Override
  public void setEStructuralFeature(final EStructuralFeature structuralFeature) {
    super.setEStructuralFeature(structuralFeature);
  }

  /**
   * Collects all the EStructuralFeatures which are part of the group denoted by the EStructuralFeature of this data
   * generator ({@link #getEStructuralFeature()}).
   * 
   * @param eClass
   *          the EClass to get all the efeatures of this group from
   * @see ExtendedMetaData#getGroup(EStructuralFeature)
   * @see EClass#getEAllStructuralFeatures()
   */
  public void setFeatures(EClass eClass) {
    final DataGeneratorFactory factory = getModelDataGenerator().getDataGeneratorFactory();
    final boolean isMixed = DataGeneratorUtils.isMixed(getEStructuralFeature());
    for (EStructuralFeature eFeature : eClass.getEAllStructuralFeatures()) {
      if (!eFeature.isChangeable()) {
        continue;
      }

      if (isMixed && eFeature.isVolatile()) {
        dataGenerators.add(factory.createEStructuralFeatureDataGenerator(eClass, eFeature, getModelDataGenerator()));
      } else if (getEStructuralFeature() == ExtendedMetaData.INSTANCE.getGroup(eFeature)) {
        dataGenerators.add(factory.createEStructuralFeatureDataGenerator(eClass, eFeature, getModelDataGenerator()));
      }
    }
    if (isMixed) {
      dataGenerators.add(factory.createEStructuralFeatureDataGenerator(eClass,
          XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text(), getModelDataGenerator()));
      dataGenerators.add(factory.createEStructuralFeatureDataGenerator(eClass,
          XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA(), getModelDataGenerator()));
      dataGenerators.add(factory.createEStructuralFeatureDataGenerator(eClass,
          XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment(), getModelDataGenerator()));
    }
  }

  /**
   * Fills the FeatureMap EAttribute with values.
   * 
   * @param owner
   *          the EObject for which the value will be set
   * @param depth
   *          is used when building the containment structure, if depth > {@link ModelDataGenerator#getMaxDepth()} then
   *          only non-mandatory EReferences are set.
   */
  @Override
  public void setData(final EObject owner) {
    if (owner.eIsSet(getEStructuralFeature())) {
      return;
    }
    if (!getEStructuralFeature().isRequired() && getModelDataGenerator().isConsiderOnlyMandatoryFeatures()) {
      return;
    }

    if (dataGenerators.isEmpty()) {
      return;
    }

    final boolean maxDepthReached = getModelDataGenerator().getMaxDepth() < computeDepth(owner);
    if (maxDepthReached) {
      return;
    }

    final FeatureMap featureMap = (FeatureMap) owner.eGet(getEStructuralFeature());
    for (int i = 0; i < getModelDataGenerator().getCollectionSize(); i++) {
      final FeatureMap.Entry entry = (FeatureMap.Entry) createValue(owner);
      featureMap.add(entry.getEStructuralFeature(), entry.getValue());
    }
  }

  @Override
  public Object createValue(EObject owner) {
    if (currentIndex >= dataGenerators.size()) {
      currentIndex = 0;
    }
    final EStructuralFeatureDataGenerator dataGenerator = dataGenerators.get(currentIndex++);
    final EStructuralFeature eFeature = dataGenerator.getEStructuralFeature();
    final Object value = dataGenerator.createValue(owner);
    final FeatureMap.Entry entry = FeatureMapUtil.createEntry(eFeature, value);
    return entry;
  }

  private int computeDepth(EObject owner) {
    if (owner.eContainer() == null) {
      return 0;
    }
    return 1 + computeDepth(owner.eContainer());
  }

}