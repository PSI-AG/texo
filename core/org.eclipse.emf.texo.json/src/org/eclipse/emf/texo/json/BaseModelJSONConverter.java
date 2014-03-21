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

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.component.TexoComponent;
import org.eclipse.emf.texo.converter.BaseModelConverter;
import org.eclipse.emf.texo.model.DynamicModelObject;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.provider.IdProvider;
import org.eclipse.emf.texo.provider.TitleProvider;
import org.eclipse.emf.texo.utils.Check;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Base class for converting {@link EObject} or {@link ModelObject} to a {@link JSONObject}.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @see ModelObject
 */
public abstract class BaseModelJSONConverter<T extends Object> extends BaseModelConverter<T> implements TexoComponent {

  private final HashSet<T> hasConverted = new HashSet<T>();

  private JSONValueConverter jsonValueConverter = (JSONValueConverter) ComponentProvider.getInstance().newInstance(
      getValueConversionClass());

  /**
   * Is a setting used during test cases where also unsorted values need to be comparable
   */
  private boolean preSortManyValues = false;
  private boolean serializeTitleProperty = true;

  /**
   * Converts an object to a json object.
   * 
   * @param the
   *          {@link ModelObject} to convert
   * @return the {@link JSONObject} or {@link JSONArray}
   */
  public Object convert(T object) {
    doBaseActions(Collections.singletonList(object));

    hasConverted.clear();

    return doConvert(object);
  }

  protected Class<?> getValueConversionClass() {
    return JSONValueConverter.class;
  }

  @SuppressWarnings("unchecked")
  protected Object doConvert(T object) {
    // handle a special case needed for supporting queries
    // with multiple select values
    if (object == null) {
      return null;
    }

    if (object.getClass().isArray()) {
      try {
        final JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < Array.getLength(object); i++) {
          final Object value = Array.get(object, i);
          if (isModelEnabled(value)) {
            jsonArray.put(i, doConvert((T) value));
          } else if (value instanceof Date) {
            jsonArray.put(i, jsonValueConverter.convertDateTimeToJSON(value));
          } else {
            jsonArray.put(i, value);
          }
        }
        return jsonArray;
      } catch (JSONException e) {
        throw new RuntimeException(e);
      }
    }

    if (object instanceof Collection) {
      try {
        final JSONArray jsonArray = new JSONArray();
        final Collection<Object> collection = (Collection<Object>) object;
        int i = 0;
        for (Object value : collection) {
          if (isModelEnabled(value)) {
            jsonArray.put(i, doConvert((T) value));
          } else if (value instanceof Date) {
            jsonArray.put(i, jsonValueConverter.convertDateTimeToJSON(value));
          } else {
            jsonArray.put(i, value);
          }
          i++;
        }
        return jsonArray;
      } catch (JSONException e) {
        throw new RuntimeException(e);
      }
    }

    // if there are cycles then use proxies
    // to stop cycling
    if (hasConverted.contains(object)) {
      if (!getProxyObjects().contains(object)) {
        getProxyObjects().add(object);
        getNonProxiedObjects().remove(object);
      }
      // just continue
    } else {
      hasConverted.add(object);
    }
    final JSONObject target = createJSONObject(object);
    convertContent(object, target);
    return target;
  }

  protected JSONObject createJSONObject(T source) {
    final JSONObject jsonObject = new JSONObject();
    setObjectProperties(source, jsonObject);
    setProxyProperties(source, jsonObject);
    return jsonObject;
  }

  protected void convertContent(T source, JSONObject target) {

    if (getProxyObjects().contains(source)) {
      return;
    }

    for (final EStructuralFeature eStructuralFeature : eClass(source).getEAllStructuralFeatures()) {
      if (isSkipVolatileEFeatures() && eStructuralFeature.isVolatile()) {
        continue;
      }
      if (FeatureMapUtil.isFeatureMap(eStructuralFeature)) {
        convertFeatureMap(source, target, eStructuralFeature);
      } else if (eStructuralFeature.isMany()) {
        if (eStructuralFeature instanceof EAttribute) {
          final EAttribute eAttribute = (EAttribute) eStructuralFeature;
          convertManyEAttribute(source, target, eAttribute);
        } else {
          final EReference eReference = (EReference) eStructuralFeature;
          convertManyEReference(source, target, eReference);
        }
      } else {
        if (eStructuralFeature instanceof EAttribute) {
          final EAttribute eAttribute = (EAttribute) eStructuralFeature;
          convertSingleEAttribute(source, target, eAttribute);
        } else {
          final EReference eReference = (EReference) eStructuralFeature;
          convertSingleEReference(source, target, eReference);
        }
      }
    }
  }

  protected void setProxyProperties(T object, JSONObject jsonObject) {
    try {
      if (!isModelEnabled(object)) {
        return;
      }
      final org.eclipse.emf.common.util.URI uri = getProxyId(object);
      if (uri != null) {
        if (getProxyObjects().contains(object)) {
          jsonObject.put(ModelJSONConstants.PROXY_PROPERTY, true);
        }
        jsonObject.put(ModelJSONConstants.URI_PROPERTY, uri.toString());
      }
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  protected void setObjectProperties(T object, JSONObject jsonObject) {
    try {
      if (!isModelEnabled(object) && object.getClass() != DynamicModelObject.class) {
        return;
      }
      if (IdProvider.getInstance().hasIdEAttribute(eClass(object))) {
        final String idAsString = IdProvider.getInstance().getIdAsString(object);
        if (idAsString != null && idAsString.trim().length() > 0) {
          final EAttribute idEAttribute = IdProvider.getInstance().getIdEAttribute(eClass(object));
          jsonObject.put(ModelJSONConstants.ID_PROPERTY, idAsString);
          jsonObject.put(getJSONPropertyName(idEAttribute),
              jsonValueConverter.toJSON(object, eGet(object, idEAttribute), idEAttribute.getEAttributeType()));
        }
      }
      if (isSerializeTitleProperty()) {
        jsonObject.put(ModelJSONConstants.TITLE_PROPERTY, TitleProvider.getInstance().getTitle(object));
      }
      jsonObject.put(ModelJSONConstants.ECLASS_PROPERTY, ModelUtils.getQualifiedNameFromEClass(eClass(object)));
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Converts the values of an FeatureMap, the values of the collection are converted to and added to the list in the
   * correct feature in the modelObject.
   * 
   * @param source
   *          the source from which the value is read
   * @param target
   *          the {@link JSONObject} in which the value is to be set
   * @param eFeature
   *          the eFeature which is converted
   */
  @SuppressWarnings("unchecked")
  protected void convertFeatureMap(T source, final JSONObject target, final EStructuralFeature eFeature) {
    try {
      final Collection<?> mValues = (Collection<?>) eGet(source, eFeature);

      final List<JSONObject> values = new ArrayList<JSONObject>();
      for (final Object mValue : mValues) {
        final EStructuralFeature entryFeature = getFeatureMapFeature(eFeature, mValue);
        final Object entryValue = getFeatureMapValue(eFeature, mValue);

        final Object convertedValue;
        if (entryFeature instanceof EAttribute) {
          convertedValue = jsonValueConverter.toJSON(source, entryValue,
              ((EAttribute) entryFeature).getEAttributeType());
        } else {
          convertedValue = doConvert((T) entryValue);
        }
        final JSONObject featureMapJSON = new JSONObject();
        featureMapJSON.put(ModelJSONConstants.VALUE_PROPERTY, convertedValue);
        featureMapJSON.put(ModelJSONConstants.EFEATURE_PROPERTY,
            ModelUtils.getQualifiedNameFromEStructuralFeature(entryFeature));
        featureMapJSON.put(ModelJSONConstants.KEY_PROPERTY, entryFeature.getName());
        values.add(featureMapJSON);
      }
      target.put(getJSONPropertyName(eFeature), new JSONArray(values));
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  protected abstract EStructuralFeature getFeatureMapFeature(EStructuralFeature eFeature, Object fmEntry);

  protected abstract Object getFeatureMapValue(EStructuralFeature eFeature, Object fmEntry);

  /**
   * Converts the value of an EReference with isMany==false
   * 
   * @param source
   *          the source from which the value is retrieved.
   * @param target
   *          the JSONObject in which the value is set (after it has been converted)
   * @param eReference
   *          the eReference which is converted
   */
  protected void convertSingleEReference(T source, final JSONObject target, final EReference eReference) {
    try {

      final String jsonPropName = getJSONPropertyName(eReference);

      if (target.has(jsonPropName)) {
        return;
      }

      @SuppressWarnings("unchecked")
      final T value = (T) eGet(source, eReference);
      if (value == null) {
        target.put(jsonPropName, JSONObject.NULL);
      } else {
        final Object object = doConvert(value);
        target.put(jsonPropName, object);
      }
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  protected String getJSONPropertyName(EStructuralFeature eFeature) {
    return eFeature.getName();
  }

  /**
   * Converts the value of an EReference with isMany==true
   * 
   * @param source
   *          the object from which the value is retrieved.
   * @param eObject
   *          the eObject in which the value is set (after it has been converted)
   * @param eReference
   *          the eReference which is converted
   */
  @SuppressWarnings("unchecked")
  protected void convertManyEReference(T source, final JSONObject target, final EReference eReference) {

    try {
      final String jsonPropName = getJSONPropertyName(eReference);

      if (target.has(jsonPropName)) {
        return;
      }

      final Object manyValue = eGet(source, eReference);
      if (Map.class.isAssignableFrom(manyValue.getClass())) {
        Check.isTrue(ModelUtils.isEMap(eReference), "Expected emap EReference, but the case for EReference " //$NON-NLS-1$
            + eReference);
        final List<JSONObject> values = new ArrayList<JSONObject>();
        final Map<?, ?> map = (Map<?, ?>) manyValue;

        final EObject mapEntryEObject = EcoreUtil.create(eReference.getEReferenceType());
        final EStructuralFeature valueFeature = mapEntryEObject.eClass().getEStructuralFeature("value"); //$NON-NLS-1$
        final EStructuralFeature keyFeature = mapEntryEObject.eClass().getEStructuralFeature("key"); //$NON-NLS-1$

        for (final Object key : map.keySet()) {
          final Object value = map.get(key);
          final JSONObject entry = new JSONObject();

          // key and value maybe primitive types but can also be
          // references to model objects.
          if (isModelEnabled(value)) {
            entry.put(ModelJSONConstants.VALUE_PROPERTY, doConvert((T) value));
          } else {
            entry.put(ModelJSONConstants.VALUE_PROPERTY,
                jsonValueConverter.toJSON(source, value, ((EAttribute) valueFeature).getEAttributeType()));
          }
          if (isModelEnabled(key)) {
            entry.put(ModelJSONConstants.KEY_PROPERTY, doConvert((T) key));
          } else {
            entry.put(ModelJSONConstants.KEY_PROPERTY,
                jsonValueConverter.toJSON(source, key, ((EAttribute) keyFeature).getEAttributeType()));
          }
          values.add(entry);
        }
        target.put(getJSONPropertyName(eReference), values);
      } else if (ModelUtils.isEMap(eReference)) {
        final List<JSONObject> values = new ArrayList<JSONObject>();
        final Collection<?> eMap = (Collection<?>) manyValue;

        final EObject mapEntryEObject = EcoreUtil.create(eReference.getEReferenceType());
        final EStructuralFeature valueFeature = mapEntryEObject.eClass().getEStructuralFeature("value"); //$NON-NLS-1$
        final EStructuralFeature keyFeature = mapEntryEObject.eClass().getEStructuralFeature("key"); //$NON-NLS-1$

        for (final Object e : eMap) {
          final Map.Entry<?, ?> mEntry = (Map.Entry<?, ?>) e;
          final Object key = mEntry.getKey();
          final Object value = mEntry.getValue();
          final JSONObject entry = new JSONObject();

          // key and value maybe primitive types but can also be
          // references to model objects.
          if (isModelEnabled(value)) {
            entry.put(ModelJSONConstants.VALUE_PROPERTY, doConvert((T) value));
          } else {
            entry.put(ModelJSONConstants.VALUE_PROPERTY,
                jsonValueConverter.toJSON(source, value, ((EAttribute) valueFeature).getEAttributeType()));
          }
          if (isModelEnabled(key)) {
            entry.put(ModelJSONConstants.KEY_PROPERTY, doConvert((T) key));
          } else {
            entry.put(ModelJSONConstants.KEY_PROPERTY,
                jsonValueConverter.toJSON(source, key, ((EAttribute) keyFeature).getEAttributeType()));
          }
          values.add(entry);
        }
        target.put(getJSONPropertyName(eReference), values);
      } else {

        final Collection<T> sourceValues = (Collection<T>) manyValue;
        final List<Object> targetValues = new ArrayList<Object>();

        for (final T value : sortedValues(sourceValues)) {
          if (value == null) {
            targetValues.add(JSONObject.NULL);
          } else {
            targetValues.add(doConvert(value));
          }
        }
        target.put(getJSONPropertyName(eReference), targetValues);
      }
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  // sorting is important for testcases which assume a fixed
  // ordering, some java examples use Set instead of List
  private Collection<T> sortedValues(Collection<T> values) {
    if (!preSortManyValues || (!(values instanceof EList) && values instanceof List)) {
      return values;
    }
    final List<T> sortedValues = new ArrayList<T>(values);
    Collections.sort(sortedValues, new Comparator<Object>() {
      public int compare(Object o1, Object o2) {
        try {
          if (IdProvider.getInstance().hasIdEAttribute(o1) && IdProvider.getInstance().hasIdEAttribute(o2)) {
            final Object id1 = IdProvider.getInstance().getId(o1);
            final Object id2 = IdProvider.getInstance().getId(o2);
            if (id1 != null && id2 != null) {
              return id1.toString().compareTo(id2.toString());
            }
          }
          return o1.toString().compareTo(o2.toString());
        } catch (UnsupportedOperationException e) {
          // sometimes volatile efeatures are part of the toString
          return o1.hashCode() - o2.hashCode();
        }
      }
    });
    return sortedValues;
  }

  private Collection<?> sortedEAttributeValues(Collection<?> values) {
    if (!preSortManyValues || (!(values instanceof EList) && values instanceof List)) {
      return values;
    }
    final List<Object> sortedValues = new ArrayList<Object>(values);
    Collections.sort(sortedValues, new Comparator<Object>() {
      public int compare(Object o1, Object o2) {
        if (o1 instanceof Date) {
          final long t1 = ((Date) o1).getTime();
          final long t2 = ((Date) o2).getTime();
          if (t1 < t2) {
            return -1;
          } else if (t1 > t2) {
            return 1;
          } else {
            return 0;
          }
        }
        return o1.toString().compareTo(o2.toString());
      }
    });
    return sortedValues;
  }

  /**
   * Converts the value of an EAttribute with isMany==false, the value is converted (
   * {@link #convertPrimitiveValue(Object, EDataType)}).
   * 
   * @param source
   *          the object from which the value is retrieved.
   * @param target
   *          the JSONObject in which the value is set (after it has been converted)
   * @param eAttribute
   *          the EAttribute which is converted
   * @see #convertPrimitiveValue(Object, EDataType)
   */
  protected void convertSingleEAttribute(T source, final JSONObject target, final EAttribute eAttribute) {
    try {
      final Object value = eGet(source, eAttribute);
      final String propName = getJSONPropertyName(eAttribute);
      target.put(propName, jsonValueConverter.toJSON(source, value, eAttribute.getEAttributeType()));

      // also add the textual value of the bigdecimal for precision reasons
      if (value instanceof BigDecimal) {
        target.put(propName + "_text", value.toString());
      }
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Converts the value of an EAttribute with isMany==true, the values of the collection are converted and set in the
   * json object.
   * 
   * @param source
   *          the object from which the value is retrieved.
   * @param target
   *          the JSONObject in which the value is set (after it has been converted)
   * @param eAttribute
   *          the EAttribute which is converted
   * @see #convertPrimitiveValue(Object, EDataType)
   */
  protected void convertManyEAttribute(T source, final JSONObject target, final EAttribute eAttribute) {
    try {
      final Collection<?> values = (Collection<?>) eGet(source, eAttribute);
      final EDataType eDataType = eAttribute.getEAttributeType();

      final List<Object> targetValues = new ArrayList<Object>();

      boolean bigDecimalsPresent = false;
      for (final Object value : sortedEAttributeValues(values)) {
        bigDecimalsPresent |= value instanceof BigDecimal;
        targetValues.add(jsonValueConverter.toJSON(source, value, eDataType));
      }
      target.put(getJSONPropertyName(eAttribute), targetValues);
      if (bigDecimalsPresent) {
        final List<Object> bdValues = new ArrayList<Object>();
        for (final Object value : sortedEAttributeValues(values)) {
          bigDecimalsPresent |= value instanceof BigDecimal;
          if (value == null) {
            bdValues.add("");
          } else {
            bdValues.add(value.toString());
          }
        }
        target.put(getJSONPropertyName(eAttribute) + "_text", bdValues);
      }
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * @see #preSortManyValues
   */
  public boolean isPreSortManyValues() {
    return preSortManyValues;
  }

  /**
   * @see #preSortManyValues
   */
  public void setPreSortManyValues(boolean preSortManyValues) {
    this.preSortManyValues = preSortManyValues;
  }

  public boolean isSerializeTitleProperty() {
    return serializeTitleProperty;
  }

  public void setSerializeTitleProperty(boolean serializeTitleProperty) {
    this.serializeTitleProperty = serializeTitleProperty;
  }
}