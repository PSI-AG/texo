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
 * $Id: ModelXMLSaver.java,v 1.15 2011/09/14 15:35:53 mtaal Exp $
 */

package org.eclipse.emf.texo.xml;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.ElementHandlerImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.component.TexoComponent;
import org.eclipse.emf.texo.converter.ModelEMFConverter;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.provider.IdProvider;
import org.eclipse.emf.texo.provider.TitleProvider;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.eclipse.emf.texo.xml.model.texoextensions.TexoExtensionsModelPackage;

/**
 * Responsible for writing a set of modelObjects to an outputstream or writer.
 * 
 * The ModelXMLSaver makes use of the standard EMF {@link XMLResource} or {@link XMIResource} (if {@link #isSaveAsXMI}
 * is true).
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
 * XMLResource.OPTION_KEEP_DEFAULT_CONTENT: true
 * 
 * This option settings ensure that the XML corresponds to the XML schema definition.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ModelXMLSaver implements TexoComponent {

  private Writer writer;
  private XMLResource xmlResource;
  private Map<String, Object> options = new HashMap<String, Object>();
  private List<Object> objects;
  private ModelEMFConverter modelEMFConverter = ComponentProvider.getInstance().newInstance(ModelEMFConverter.class);
  private boolean saveAsXMI = false;

  /**
   * Makes this class also capable of supporting serializing {@link EObject} instances.
   */
  private boolean objectsAreAlreadyEObjects = false;

  // output id and title attributes for each entity
  private boolean outputExtensionAttributes = false;

  /**
   * Writes the model objects ({@link #getModelObjects()}) to the writer ( {@link #getWriter()}) using the
   * XML/XMIResource ( {@link #getXmlResource()}).
   */
  public void write() {
    try {
      final XMLResource localXMLResource = getXmlResource();
      final List<EObject> eObjects;
      if (isObjectsAreAlreadyEObjects()) {
        eObjects = new ArrayList<EObject>();
        for (Object o : getObjects()) {
          eObjects.add((EObject) o);
        }
      } else {
        eObjects = getModelEMFConverter().convert(getObjects());
      }

      // now do a special method to find all objects without container
      // which are not
      // in the root, they should be added to the root, otherwise they get
      // lost
      addObjectsToRoot(eObjects);

      localXMLResource.getContents().addAll(eObjects);

      if (isOutputExtensionAttributes()) {
        addExtensionAttributes();
      }

      if (!isSaveAsXMI()) {
        // set default options which ensure that XML
        setDefaultOptions(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
        setDefaultOptions(XMLResource.OPTION_SUPPRESS_DOCUMENT_ROOT, true);
        setDefaultOptions(XMLResource.OPTION_EXTENDED_META_DATA, true);
        setDefaultOptions(XMLResource.OPTION_SCHEMA_LOCATION, true);
        setDefaultOptions(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, true);
        setDefaultOptions(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, true);
        setDefaultOptions(
            XMLResource.OPTION_ELEMENT_HANDLER,
            ComponentProvider.getInstance().newInstance(ElementHandlerImpl.class, new Class[] { boolean.class },
                new Object[] { false }));
      }
      setDefaultOptions(XMLResource.OPTION_SAVE_TYPE_INFORMATION, true);

      localXMLResource.save(writer, getOptions());
    } catch (final IOException e) {
      throw new IllegalStateException(e);
    }
  }

  private void addExtensionAttributes() {
    for (Object object : modelEMFConverter.getObjectMapping().keySet()) {
      if (!ModelResolver.getInstance().isModelEnabled(object)) {
        continue;
      }
      final ModelObject<?> modelObject = ModelResolver.getInstance().getModelObject(object);
      final AnyType anyType = XMLTypeFactory.eINSTANCE.createAnyType();
      if (IdProvider.getInstance().hasIdEAttribute(object)) {
        anyType.getAnyAttribute().add(TexoExtensionsModelPackage.INSTANCE.getDocumentRoot_Id(),
            IdProvider.getInstance().getIdAsString(object));
      }
      final String title = TitleProvider.getInstance().getTitle(object);
      anyType.getAnyAttribute().add(TexoExtensionsModelPackage.INSTANCE.getDocumentRoot_Title(), title);

      final String type = ModelUtils.getQualifiedNameFromEClass(modelObject.eClass());
      anyType.getAnyAttribute().add(TexoExtensionsModelPackage.INSTANCE.getDocumentRoot_Type(), type);

      final EObject eObject = modelEMFConverter.getObjectMapping().get(object);
      xmlResource.getEObjectToExtensionMap().put(eObject, anyType);
    }
  }

  private void addObjectsToRoot(final List<EObject> rootObjects) {
    final HashMap<EObject, EObject> visited = new HashMap<EObject, EObject>();
    for (final EObject eObject : new ArrayList<EObject>(rootObjects)) {
      visit(eObject, visited, rootObjects);
    }
  }

  private void visit(final EObject eObject, final HashMap<EObject, EObject> visited, final List<EObject> rootObjects) {
    if (visited.containsKey(eObject)) {
      return;
    }
    visited.put(eObject, eObject);
    if (eObject.eIsProxy()) {
      return;
    }
    if (eObject.eContainer() == null && !rootObjects.contains(eObject)) {
      rootObjects.add(eObject);
    }
    for (final EReference eReference : eObject.eClass().getEAllReferences()) {
      if (eReference.isMany()) {
        @SuppressWarnings("unchecked")
        final List<EObject> list = (List<EObject>) eObject.eGet(eReference);
        for (final EObject refEObject : list) {
          visit(refEObject, visited, rootObjects);
        }
      } else {
        final EObject refEObject = (EObject) eObject.eGet(eReference);
        if (refEObject != null) {
          visit(refEObject, visited, rootObjects);
        }
      }
    }
  }

  protected void setDefaultOptions(final String option, final Object value) {
    if (getOptions().get(option) != null) {
      return;
    }
    getOptions().put(option, value);
  }

  public Writer getWriter() {
    return writer;
  }

  public void setWriter(final Writer writer) {
    this.writer = writer;
  }

  /**
   * Returns the {@link XMIResource} or the {@link XMLResource} which is being used. When no xml resource has been set
   * explicitly then one is created. The one created is either a {@link ModelXMIResourceImpl} or a
   * {@link ModelXMLResourceImpl}. This depends on the setting of the saveAsXMI ({@link #isSaveAsXMI()}) option.
   * 
   * @return the resource which is used to convert the model objects to a writer.
   */
  public XMLResource getXmlResource() {
    if (xmlResource == null) {
      if (saveAsXMI) {
        xmlResource = ComponentProvider.getInstance().newInstance(ModelXMIResourceImpl.class);
      } else {
        xmlResource = ComponentProvider.getInstance().newInstance(ModelXMLResourceImpl.class);
      }
    }
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

  public List<Object> getObjects() {
    return objects;
  }

  public void setObjects(final List<Object> objects) {
    this.objects = objects;
  }

  public ModelEMFConverter getModelEMFConverter() {
    return modelEMFConverter;
  }

  public void setModelEMFConverter(final ModelEMFConverter modelEMFConverter) {
    this.modelEMFConverter = modelEMFConverter;
  }

  public boolean isSaveAsXMI() {
    return saveAsXMI;
  }

  public void setSaveAsXMI(final boolean saveAsXMI) {
    this.saveAsXMI = saveAsXMI;
  }

  public boolean isOutputExtensionAttributes() {
    return outputExtensionAttributes;
  }

  public void setOutputExtensionAttributes(boolean outputExtensionAttributes) {
    this.outputExtensionAttributes = outputExtensionAttributes;
  }

  protected boolean isObjectsAreAlreadyEObjects() {
    return objectsAreAlreadyEObjects;
  }

  public void setObjectsAreAlreadyEObjects(boolean objectsAreAlreadyEObjects) {
    this.objectsAreAlreadyEObjects = objectsAreAlreadyEObjects;
  }

}