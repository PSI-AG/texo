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
 * $Id: EMFModelConverter.java,v 1.23 2011/08/29 05:16:04 mtaal Exp $
 */

package org.eclipse.emf.texo.json;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.model.DynamicModelObject;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Converts a JSONObject to a model object managed by a {@link ModelPackage} instance.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @see ModelObject
 */
public class JSONModelConverter extends BaseJSONModelConverter<Object> {

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

  protected boolean setBidirectionalReferences() {
    return true;
  }

  @Override
  protected Object fromUri(String uriString) {
    return getObjectResolver().fromUri(URI.createURI(uriString));
  }

  @Override
  protected Object create(EClass eClass, String uriString) {
    if (ModelResolver.getInstance().isModeledEClassifier(eClass)) {
      return ModelResolver.getInstance().create(eClass);
    } else {
      final DynamicModelObject dmo = ComponentProvider.getInstance().newInstance(DynamicModelObject.class);
      dmo.setEClass(eClass);
      return dmo;
    }
  }

  @Override
  protected EClass eClass(Object target) {
    return getModelObject(target).eClass();
  }

  @Override
  protected void eSet(Object target, EStructuralFeature eFeature, Object value) {
    getModelObject(target).eSet(eFeature, value);
  }

  @Override
  protected Object eGet(Object target, EStructuralFeature eFeature) {
    return getModelObject(target).eGet(eFeature);
  }

  @Override
  protected Object createFeatureMapEntry(Object target, EStructuralFeature eFeature, JSONObject jValue) {
    try {
      final Object featureMapEntry = ModelResolver.getInstance().createFeatureMapEntry(eFeature);
      final ModelFeatureMapEntry<?> mEntry = ModelResolver.getInstance().getModelFeatureMapEntry(eFeature,
          featureMapEntry);
      final EStructuralFeature entryFeature = ModelUtils.getEStructuralFeatureFromQualifiedName(jValue
          .getString(ModelJSONConstants.EFEATURE_PROPERTY));

      mEntry.setEStructuralFeature(entryFeature);

      final Object convertedValue;
      if (mEntry.getEStructuralFeature() instanceof EAttribute) {
        convertedValue = getJSONValueConverter().fromJSON(target, jValue.get(ModelJSONConstants.VALUE_PROPERTY),
            ((EAttribute) entryFeature).getEAttributeType());
      } else {
        convertedValue = doConvert(jValue.getJSONObject(ModelJSONConstants.VALUE_PROPERTY));
      }

      mEntry.setValue(convertedValue);
      return mEntry.getTarget();
    } catch (JSONException e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  protected void eRemoveFrom(Object target, EStructuralFeature eFeature, Object value) {
    getModelObject(target).eRemoveFrom(eFeature, value);
  }

  @Override
  protected void eAddTo(Object target, EStructuralFeature eFeature, Object value) {
    getModelObject(target).eAddTo(eFeature, value);
  }

}