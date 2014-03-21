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
 * $Id: ModelXMIResourceImpl.java,v 1.13 2011/09/14 15:35:53 mtaal Exp $
 */

package org.eclipse.emf.texo.xml;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.impl.SAXXMIHandler;
import org.eclipse.emf.ecore.xmi.impl.XMILoadImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.component.TexoComponent;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.utils.Check;
import org.eclipse.emf.texo.xml.model.texoextensions.TexoExtensionsModelPackage;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Overrides the standard {@link XMIResourceImpl} to use another {@link XMLHelperImpl} instance. This redirects EMF to
 * use the generated {@link ModelFactory} to convert data types.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ModelXMIResourceImpl extends XMIResourceImpl implements TexoComponent {

  public ModelXMIResourceImpl() {
    super(URI.createURI("")); //$NON-NLS-1$
  }

  /**
   * Overridden to automatically create a resource set is one is not available. Note it is necessary to put the
   * resources in a resourceset cause EMF uses the resourceset to compute id's etc.
   * 
   * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#getResourceSet()
   */
  @Override
  public ResourceSet getResourceSet() {
    final ResourceSet superResourceSet = super.getResourceSet();
    if (superResourceSet == null) {
      final ResourceSet localResourceSet = ComponentProvider.getInstance().newInstance(ResourceSetImpl.class);
      localResourceSet.getResources().add(this);
      Check.isNotNull(super.getResourceSet(), "Resource set not set for " //$NON-NLS-1$
          + this);
    }
    return super.getResourceSet();
  }

  /**
   * Overridden to p@Override prevent error reporting on Texo extensions attributes.
   */
  @Override
  protected XMLLoad createXMLLoad() {
    return new XMILoadImpl(createXMLHelper()) {

      @Override
      protected DefaultHandler makeDefaultHandler() {
        return new SAXXMIHandler(resource, helper, options) {

          @Override
          protected void reportUnknownFeature(String prefix, String name, boolean isElement, EObject peekObject,
              String value) {
            final EStructuralFeature feature = getFeature(peekObject, prefix, name, true);
            if (feature != null
                && feature.getEContainingClass().getEPackage().getNsURI().equals(TexoExtensionsModelPackage.NS_URI)) {
              return;
            }
            // last resort, is it an extension feature, must be a xml attribute
            if (!isElement && TexoExtensionsModelPackage.INSTANCE.getEPackage().getNsPrefix().equals(prefix)) {
              for (EStructuralFeature eFeature : TexoExtensionsModelPackage.INSTANCE.getDocumentRootEClass()
                  .getEStructuralFeatures()) {
                if (eFeature.getName().equals(name)) {
                  return;
                }
              }
            }
            super.reportUnknownFeature(prefix, name, isElement, peekObject, value);
          }
        };
      }

    };
  }

  @Override
  protected XMLLoad createXMLLoad(Map<?, ?> options) {
    return createXMLLoad();
  }

}