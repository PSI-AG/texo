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
 * $Id: TexoTestObjectConverter.java,v 1.5 2011/09/02 07:12:14 mtaal Exp $
 */
package org.eclipse.emf.texo.test;

import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.json.JSONModelConverter;
import org.eclipse.emf.texo.json.ModelJSONConverter;
import org.eclipse.persistence.mappings.DatabaseMapping;
import org.eclipse.persistence.mappings.DirectCollectionMapping;
import org.eclipse.persistence.mappings.DirectToFieldMapping;
import org.eclipse.persistence.mappings.converters.Converter;
import org.eclipse.persistence.sessions.Session;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * A {@link Converter} implementation used during Texo testing.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class TexoTestObjectConverter implements Converter {

  private static final long serialVersionUID = 1L;

  public Object convertObjectValueToDataValue(Object objectValue, Session session) {
    if (objectValue == null) {
      return null;
    }
    final ModelJSONConverter jsonConverter = ComponentProvider.getInstance().newInstance(ModelJSONConverter.class);
    jsonConverter.setMaxChildLevelsToConvert(0);
    jsonConverter.setConvertNonContainedReferencedObjects(false);
    return jsonConverter.convert(objectValue).toString();
  }

  public Object convertDataValueToObjectValue(Object dataValue, Session session) {
    if (dataValue == null) {
      return null;
    }
    try {
      final JSONModelConverter modelJSONConverter = ComponentProvider.getInstance().newInstance(
          JSONModelConverter.class);
      return modelJSONConverter.convert(new JSONObject((String) dataValue));
    } catch (JSONException e) {
      throw new IllegalArgumentException("Argument " + dataValue, e);
    }
  }

  public boolean isMutable() {
    return false;
  }

  public void initialize(DatabaseMapping mapping, Session session) {
    if (mapping instanceof DirectCollectionMapping) {
      ((DirectCollectionMapping) mapping).setAttributeClassification(java.sql.Clob.class);
    } else {
      ((DirectToFieldMapping) mapping).setFieldClassification(java.sql.Clob.class);
    }
  }
}
