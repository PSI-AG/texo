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
 *   Dzmitry [zmicer] Harachka - implementation
 * </copyright>
 *
 * $Id: XMLServiceContext.java,v 1.6 2011/08/27 05:40:32 mtaal Exp $
 */
package org.eclipse.emf.texo.json;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.resolver.ObjectResolver;
import org.eclipse.emf.texo.resolver.WebServiceObjectResolver;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * An {@link ObjectResolver} which reads referenced objects using the url, through a webservice.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class JSONWebServiceObjectResolver extends WebServiceObjectResolver {
  public static final String JSON_CONTENT_TYPE = "application/json;charset=UTF-8"; //$NON-NLS-1$

  @Override
  protected Object deserialize(String urlStr, String content) {
    try {
      final JSONModelConverter converter = ComponentProvider.getInstance().newInstance(JSONModelConverter.class);
      converter.setObjectResolver(this);

      // prevent loops by already setting the resolved object
      final ModelUtils.TypeIdTuple tuple = ModelUtils.getTypeAndIdFromUri(isUseWebServiceUriFormat(),
          URI.createURI(urlStr));
      final Object result = ModelResolver.getInstance().create(tuple.getEClass());
      getObjectCache().put(urlStr, result);
      converter.getResolvedObjects().put(urlStr, result);
      
      return converter.convert(new JSONObject(content));
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }
}
