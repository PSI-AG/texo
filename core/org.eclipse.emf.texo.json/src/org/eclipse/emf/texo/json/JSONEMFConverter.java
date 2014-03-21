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

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.resolver.DefaultObjectResolver;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Converts a JSONObject to an {@link EObject}.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @see ModelObject
 */
public class JSONEMFConverter extends BaseJSONModelConverter<EObject> {

  // if an object is not proxied then keep it like that even if later
  // a proxy reference is encountered
  private Set<EObject> nonProxiedObjects = new HashSet<EObject>();
  
  protected void doClearInternalDataStructures() {
    nonProxiedObjects.clear();
  }

  protected void convertContent(JSONObject source, EObject target) {
    final boolean deliver = target.eDeliver();
    ((InternalEObject) target).eSetDeliver(false);
    try {
      if (source.has(ModelJSONConstants.PROXY_PROPERTY) && source.getBoolean(ModelJSONConstants.PROXY_PROPERTY)
          && !nonProxiedObjects.contains(target)) {
        final String proxyUri = source.getString(ModelJSONConstants.URI_PROPERTY);
        // only set the uri if it is was not cached before, if it was cached
        // before then the proxy uri is already cleared, so we should not set it
        // again.
        if (isNewObject(proxyUri)) {
          final URI uri = ModelUtils.convertToEMFURI(URI.createURI(proxyUri));
          ((InternalEObject) target).eSetProxyURI(uri);
        }
      } else {
        nonProxiedObjects.add(target);
        ((InternalEObject) target).eSetProxyURI(null);
      }
      super.convertContent(source, target);
    } catch (JSONException e) {
      throw new RuntimeException(e);
    } finally {
      ((InternalEObject) target).eSetDeliver(deliver);
    }
  }

  @Override
  protected Class<?> getValueConversionClass() {
    return JSONEMFValueConverter.class;
  }

  @Override
  protected EObject fromUri(String uriString) {
    return getObjectResolver().getEObject(URI.createURI(uriString));
  }

  @Override
  protected EObject create(EClass eClass, String uriString) {
    final DefaultObjectResolver resolver = (DefaultObjectResolver) getObjectResolver();
    final EObject eObject = EcoreUtil.create(eClass);
    resolver.addToCache(uriString, eObject);
    return eObject;
  }

  @Override
  protected EClass eClass(EObject target) {
    return target.eClass();
  }

  @Override
  protected void eSet(EObject target, EStructuralFeature eFeature, Object value) {
    if (isControlledByOtherSideOfBidirectionalAssociation(eFeature)) {
      return;
    }

    final boolean deliver = target.eDeliver();
    ((InternalEObject) target).eSetDeliver(false);
    boolean deliverValue = false;
    if (value instanceof InternalEObject) {
      deliverValue = ((InternalEObject) value).eDeliver();
      ((InternalEObject) value).eSetDeliver(false);
    }
    try {
      target.eSet(eFeature, value);
    } finally {
      ((InternalEObject) target).eSetDeliver(deliver);
      if (value instanceof InternalEObject) {
        ((InternalEObject) value).eSetDeliver(deliverValue);
      }
    }
  }

  protected boolean isControlledByOtherSideOfBidirectionalAssociation(EStructuralFeature eFeature) {
    if (eFeature instanceof EAttribute) {
      return false;
    }
    final EReference eReference = (EReference) eFeature;
    if (eReference.getEOpposite() == null) {
      return false;
    }
    final EReference eOpposite = eReference.getEOpposite();
    if (eOpposite.isMany() && !eReference.isMany()) {
      return true;
    }
    if (eReference.isMany() && !eOpposite.isMany()) {
      return false;
    }

    // use name comparison
    final String thisName = eReference.getEContainingClass().getEPackage().getNsURI() + "_"
        + eReference.getEContainingClass().getName() + "_" + eReference.getName();
    final String thatName = eOpposite.getEContainingClass().getEPackage().getNsURI() + "_"
        + eOpposite.getEContainingClass().getName() + "_" + eOpposite.getName();
    return thisName.compareTo(thatName) > 0;
  }

  @Override
  protected Object eGet(EObject target, EStructuralFeature eFeature) {
    return target.eGet(eFeature);
  }

  @Override
  protected Object createFeatureMapEntry(EObject target, EStructuralFeature eFeature, JSONObject jValue) {
    try {
      final EStructuralFeature entryFeature = ModelUtils.getEStructuralFeatureFromQualifiedName(jValue
          .getString(ModelJSONConstants.EFEATURE_PROPERTY));
      final Object convertedValue;
      if (entryFeature instanceof EAttribute) {
        convertedValue = getJSONValueConverter().fromJSON(target, jValue.get(ModelJSONConstants.VALUE_PROPERTY),
            ((EAttribute) entryFeature).getEAttributeType());
      } else {
        convertedValue = doConvert(jValue.getJSONObject(ModelJSONConstants.VALUE_PROPERTY));
      }
      return FeatureMapUtil.createEntry(entryFeature, convertedValue);
    } catch (JSONException e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  protected void eRemoveFrom(EObject target, EStructuralFeature eFeature, Object value) {
    final boolean deliver = target.eDeliver();
    ((InternalEObject) target).eSetDeliver(false);
    boolean deliverValue = false;
    if (value instanceof InternalEObject) {
      deliverValue = ((InternalEObject) value).eDeliver();
      ((InternalEObject) value).eSetDeliver(false);
    }
    try {
      ((Collection<?>) target.eGet(eFeature)).remove(value);
    } finally {
      ((InternalEObject) target).eSetDeliver(deliver);
      if (value instanceof InternalEObject) {
        ((InternalEObject) value).eSetDeliver(deliverValue);
      }
    }
  }

  @SuppressWarnings("unchecked")
  @Override
  protected void eAddTo(EObject target, EStructuralFeature eFeature, Object value) {
    final boolean deliver = target.eDeliver();
    ((InternalEObject) target).eSetDeliver(false);
    boolean deliverValue = false;
    if (value instanceof InternalEObject) {
      deliverValue = ((InternalEObject) value).eDeliver();
      ((InternalEObject) value).eSetDeliver(false);
    }
    try {
      ((Collection<Object>) target.eGet(eFeature)).add(value);
    } finally {
      ((InternalEObject) target).eSetDeliver(deliver);
      if (value instanceof InternalEObject) {
        ((InternalEObject) value).eSetDeliver(deliverValue);
      }
    }
  }

}