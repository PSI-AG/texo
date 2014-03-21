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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Converts an {@link EObject} to a JSON object.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @see ModelObject
 */
public class EMFJSONConverter extends BaseModelJSONConverter<EObject> {

  @Override
  protected Class<?> getValueConversionClass() {
    return JSONEMFValueConverter.class;
  }

  @Override
  protected EClass eClass(EObject target) {
    return target.eClass();
  }

  protected boolean isProxy(EObject o) {
    // if explicitly said to be not proxied
    if (o instanceof InternalEObject) {
      final InternalEObject internalEObject = (InternalEObject)o;
      if (internalEObject.eProxyURI() == null) {
        return false;
      }
      if (ModelUtils.isTempURI(internalEObject.eProxyURI().toString())) {
        return false;
      }
    }
    return o.eIsProxy();
  }

  @Override
  protected Object eGet(EObject target, EStructuralFeature eFeature) {
    return target.eGet(eFeature);
  }

  @Override
  protected boolean isModelEnabled(Object target) {
    return target instanceof EObject;
  }

  protected EStructuralFeature getFeatureMapFeature(EStructuralFeature eFeature, Object fmEntry) {
    return ((FeatureMap.Entry) fmEntry).getEStructuralFeature();
  }

  @Override
  protected Object getFeatureMapValue(EStructuralFeature eFeature, Object fmEntry) {
    return ((FeatureMap.Entry) fmEntry).getValue();
  }
}