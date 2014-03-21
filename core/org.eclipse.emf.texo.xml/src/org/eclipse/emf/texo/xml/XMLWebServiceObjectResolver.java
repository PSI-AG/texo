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
package org.eclipse.emf.texo.xml;

import java.io.StringReader;

import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.resolver.ObjectResolver;
import org.eclipse.emf.texo.resolver.WebServiceObjectResolver;

/**
 * An {@link ObjectResolver} which reads referenced objects using the url, through a webservice.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class XMLWebServiceObjectResolver extends WebServiceObjectResolver {
  public static final String XML_CONTENT_TYPE = "text/html;charset=UTF-8"; //$NON-NLS-1$

  @Override
  protected Object deserialize(String urlStr, String content) {
    final ModelXMLLoader xmlLoader = ComponentProvider.getInstance().newInstance(ModelXMLLoader.class);
    xmlLoader.setLoadAsXMI(urlStr.contains("xmi=true")); //$NON-NLS-1$
    xmlLoader.setReader(new StringReader(content));
    xmlLoader.getEMFModelConverter().setUriResolver(this);
    return xmlLoader.read().get(0);
  }
}
