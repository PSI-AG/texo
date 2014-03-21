/**
 * <copyright>
 *
 * Copyright (c) 2012 Springsite BV (The Netherlands) and others
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
 * $Id: ModelEMFConverter.java,v 1.27 2011/09/14 15:35:53 mtaal Exp $
 */

package org.eclipse.emf.texo.json;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Converts a Texo object to a JSON object.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @see ModelObject
 */
public class ModelJSONConverter extends BaseModelJSONConverter<Object> {

  private Object lastObject = null;
  private ModelObject<?> lastModelObject = null;

  private ModelObject<?> getModelObject(Object target) {
    if (target == lastObject) {
      return lastModelObject;
    }
    lastObject = target;
    lastModelObject = ModelResolver.getInstance().getModelObject(target);
    return lastModelObject;
  }

  @Override
  protected EClass eClass(Object target) {
    return getModelObject(target).eClass();
  }

  @Override
  protected Object eGet(Object target, EStructuralFeature eFeature) {
    return getModelObject(target).eGet(eFeature);
  }

  @Override
  protected boolean isModelEnabled(Object target) {
    return ModelResolver.getInstance().isModelEnabled(target);
  }

  @Override
  protected EStructuralFeature getFeatureMapFeature(EStructuralFeature eFeature, Object fmEntry) {
    final ModelFeatureMapEntry<?> mEntry = ModelResolver.getInstance().getModelFeatureMapEntry(eFeature, fmEntry);
    EStructuralFeature entryFeature = mEntry.getEStructuralFeature();
    Object entryValue = mEntry.getValue();

    // flatten the tree of feature map entries, feature maps maybe nested
    // EMF uses a flattened api, while Texo builds this actual tree of
    // featuremaps, the findFeature and findValue find the deepest featureMap entry
    if (FeatureMapUtil.isFeatureMap(entryFeature)) {
      final ModelFeatureMapEntry<?> modelFeatureMapEntry = ModelResolver.getInstance().getModelFeatureMapEntry(
          entryFeature, entryValue);
      entryFeature = ModelUtils.findFeature(modelFeatureMapEntry);
      entryValue = ModelUtils.findValue(modelFeatureMapEntry);
    }
    return entryFeature;
  }

  @Override
  protected Object getFeatureMapValue(EStructuralFeature eFeature, Object fmEntry) {
    final ModelFeatureMapEntry<?> mEntry = ModelResolver.getInstance().getModelFeatureMapEntry(eFeature, fmEntry);
    EStructuralFeature entryFeature = mEntry.getEStructuralFeature();
    Object entryValue = mEntry.getValue();

    // flatten the tree of feature map entries, feature maps maybe nested
    // EMF uses a flattened api, while Texo builds this actual tree of
    // featuremaps, the findFeature and findValue find the deepest featureMap entry
    if (FeatureMapUtil.isFeatureMap(entryFeature)) {
      final ModelFeatureMapEntry<?> modelFeatureMapEntry = ModelResolver.getInstance().getModelFeatureMapEntry(
          entryFeature, entryValue);
      entryFeature = ModelUtils.findFeature(modelFeatureMapEntry);
      entryValue = ModelUtils.findValue(modelFeatureMapEntry);
    }
    return entryValue;
  }

}