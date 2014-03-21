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

import javax.xml.namespace.QName;

import org.eclipse.persistence.mappings.DatabaseMapping;
import org.eclipse.persistence.mappings.DirectCollectionMapping;
import org.eclipse.persistence.mappings.DirectToFieldMapping;
import org.eclipse.persistence.mappings.converters.Converter;
import org.eclipse.persistence.sessions.Session;

/**
 * A {@link Converter} implementation used during Texo testing for QNames.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class TexoTestQNameConverter implements Converter {

  private static final String SEPARATOR = "__;__";

  private static final long serialVersionUID = 1L;

  public Object convertObjectValueToDataValue(Object objectValue, Session session) {
    if (objectValue == null) {
      return null;
    }
    final QName qName = (QName) objectValue;
    return qName.getNamespaceURI() + SEPARATOR + qName.getLocalPart();
  }

  public Object convertDataValueToObjectValue(Object dataValue, Session session) {
    if (dataValue == null) {
      return null;
    }
    final String[] strValues = ((String) dataValue).split(SEPARATOR);
    return new QName(strValues[0], strValues[1]);
  }

  public boolean isMutable() {
    return false;
  }

  public void initialize(DatabaseMapping mapping, Session session) {
    if (mapping instanceof DirectCollectionMapping) {
      ((DirectCollectionMapping) mapping).setAttributeClassification(String.class);
    } else {
      ((DirectToFieldMapping) mapping).setFieldClassification(String.class);
    }
  }
}
