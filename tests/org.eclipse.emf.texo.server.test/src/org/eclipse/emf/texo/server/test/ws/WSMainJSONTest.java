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
 * $Id: WSMainTest.java,v 1.1 2011/09/21 14:32:54 mtaal Exp $
 */

package org.eclipse.emf.texo.server.test.ws;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.json.JSONModelConverter;
import org.eclipse.emf.texo.json.JSONWebServiceObjectResolver;
import org.eclipse.emf.texo.json.ModelJSONConverter;
import org.eclipse.emf.texo.resolver.ObjectResolver;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Tests the XML web service.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class WSMainJSONTest extends WSMainTest {

  @Override
  protected String getURL() {
    return super.getBaseURL() + "/" + JSONWS; //$NON-NLS-1$ 
  }

  @Override
  protected List<Object> deserialize(String content) {
    try {
      final JSONModelConverter jsonModelConverter = ComponentProvider.getInstance().newInstance(
          JSONModelConverter.class);
      jsonModelConverter.setObjectResolver(getUriResolver());
      return Collections.singletonList(jsonModelConverter.convert(new JSONObject(content)));
    } catch (JSONException e) {
      throw new RuntimeException(content, e);
    }
  }

  @Override
  protected String serialize(Object object) {
    final ModelJSONConverter modelJSONConverter = ComponentProvider.getInstance().newInstance(ModelJSONConverter.class);
    modelJSONConverter.setObjectResolver(getUriResolver());
    return modelJSONConverter.convert(object).toString();
  }

  private ObjectResolver getUriResolver() {
    final JSONWebServiceObjectResolver objectResolver = ComponentProvider.getInstance().newInstance(
        JSONWebServiceObjectResolver.class);
    objectResolver.setUri(getURL());
    return objectResolver;
  }

  @Override
  protected boolean isXmlTest() {
    return false;
  }

}