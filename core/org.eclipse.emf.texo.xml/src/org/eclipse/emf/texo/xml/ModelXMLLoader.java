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
 * $Id: ModelXMLLoader.java,v 1.19 2011/09/23 03:57:55 mtaal Exp $
 */

package org.eclipse.emf.texo.xml;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.ElementHandlerImpl;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.component.TexoComponent;
import org.eclipse.emf.texo.converter.EMFModelConverter;
import org.xml.sax.InputSource;

/**
 * Responsible for reading a set of model managed objects from an inputstream or reader.
 * 
 * The ModelXMLLoader makes use of the standard EMF {@link XMLResource} or {@link XMIResource} (if
 * {@link #isLoadAsXMI()} is true).
 * 
 * The following options are set as a default (override by calling {@link #setOptions(Map)} with your own options):
 * 
 * XMLResource.OPTION_ENCODING: "UTF-8"
 * 
 * XMLResource.OPTION_EXTENDED_META_DATA: true
 * 
 * XMLResource.OPTION_SCHEMA_LOCATION: true;
 * 
 * XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE: true
 * 
 * XMLResource.OPTION_USE_LEXICAL_HANDLER: true
 * 
 * This option setting ensure that the XML corresponds to the XML schema definition.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ModelXMLLoader implements TexoComponent {

  private Reader reader;
  private XMLResource xmlResource;
  private Map<String, Object> options = new HashMap<String, Object>();
  private List<Object> modelObjects;
  private EMFModelConverter emfModelConverter = ComponentProvider.getInstance().newInstance(EMFModelConverter.class);
  private boolean loadAsXMI = false;

  /**
   * Execute the read from the inputstream and return the list of objects.
   * 
   * @return the list of read objects, in case of XML/XMI the list contains the objects in the root of the XML/XMI.
   */
  public List<Object> read() {
    try {
      final XMLResource localXMLResource = getXmlResource();

      setDefaultOptions(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
      if (!isLoadAsXMI()) {
        setDefaultOptions(XMLResource.OPTION_EXTENDED_META_DATA, true);
        setDefaultOptions(XMLResource.OPTION_SUPPRESS_DOCUMENT_ROOT, true);
        setDefaultOptions(XMLResource.OPTION_SCHEMA_LOCATION, true);
        setDefaultOptions(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, true);
        setDefaultOptions(XMLResource.OPTION_ELEMENT_HANDLER, new ElementHandlerImpl(true));
        setDefaultOptions(XMLResource.OPTION_USE_LEXICAL_HANDLER, true);
      }
      setDefaultOptions(XMLResource.OPTION_SAVE_TYPE_INFORMATION, true);
      // if set then texo extensions won't work
      // setDefaultOptions(XMLResource.OPTION_LAX_FEATURE_PROCESSING, true);
      // setting this results in strange side effects in several xml testcases...
      // setDefaultOptions(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, true);
      setDefaultOptions(XMLResource.OPTION_RECORD_ANY_TYPE_NAMESPACE_DECLARATIONS, true);

      localXMLResource.load(new InputSource(getReader()), options);
      getEMFModelConverter().getUriResolver().setUseWebServiceUriFormat(true);
      return getEMFModelConverter().convert(localXMLResource.getContents());
    } catch (final IOException e) {
      throw new IllegalStateException(e);
    }
  }

  protected void setDefaultOptions(final String option, final Object value) {
    if (options.get(option) != null) {
      return;
    }
    options.put(option, value);
  }

  /**
   * Returns the {@link XMIResource} or the {@link XMLResource} which is being used. When no xml resource has been set
   * explicitly then one is created. The one created is either a {@link ModelXMIResourceImpl} or a
   * {@link ModelXMLResourceImpl}. This depends on the setting of the saveAsXMI ({@link #isLoadAsXMI()}) option.
   * 
   * @return the resource which is used to convert the model objects to a writer.
   */
  public XMLResource getXmlResource() {
    final ResourceSet resourceSet = ComponentProvider.getInstance().newInstance(ResourceSetImpl.class);
    if (xmlResource == null) {
      if (loadAsXMI) {
        xmlResource = ComponentProvider.getInstance().newInstance(ModelXMIResourceImpl.class);
      } else {
        xmlResource = ComponentProvider.getInstance().newInstance(ModelXMLResourceImpl.class);
      }
    }
    resourceSet.getResources().add(xmlResource);
    return xmlResource;
  }

  public void setXmlResource(final XMLResource xmlResource) {
    this.xmlResource = xmlResource;
  }

  public Map<String, Object> getOptions() {
    return options;
  }

  public void setOptions(final Map<String, Object> options) {
    this.options = options;
  }

  public List<Object> getModelObjects() {
    return modelObjects;
  }

  public void setModelObjects(final List<Object> modelObjects) {
    this.modelObjects = modelObjects;
  }

  public Reader getReader() {
    return reader;
  }

  public void setReader(final Reader reader) {
    this.reader = reader;
  }

  public EMFModelConverter getEMFModelConverter() {
    return emfModelConverter;
  }

  public void setEMFModelConverter(final EMFModelConverter emfModelConverter) {
    this.emfModelConverter = emfModelConverter;
  }

  public boolean isLoadAsXMI() {
    return loadAsXMI;
  }

  public void setLoadAsXMI(final boolean loadAsXMI) {
    this.loadAsXMI = loadAsXMI;
  }

}