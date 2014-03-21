/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
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
 * $Id: GenerateEcoreFromXSD.java,v 1.4 2011/08/25 12:36:19 mtaal Exp $
 */
package org.eclipse.emf.texo.eclipse.popup.actions;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;

/**
 * Generates an ecore file from a XSD.
 * 
 * @author mtaal
 */
public class GenerateEcoreFromXSD extends BaseGenerateAction {

  @Override
  protected void generateFromModelFiles(IProgressMonitor monitor, IProject project, List<IFile> modelFiles) {

    try {
      final ResourceSet resourceSet = new ResourceSetImpl();
      resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl()); //$NON-NLS-1$
      resourceSet.setPackageRegistry(EPackage.Registry.INSTANCE);
      resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));

      final XSDEcoreBuilder ecoreBuilder = new XSDEcoreBuilder(new BasicExtendedMetaData(EPackage.Registry.INSTANCE));
      final List<Resource> resourcesToSave = new ArrayList<Resource>();
      for (IFile modelFile : modelFiles) {
        final URI uri = new URI(modelFile.getFullPath().toString());

        if (uri.toString().endsWith("xsd")) { //$NON-NLS-1$
          final org.eclipse.emf.common.util.URI emfURI = org.eclipse.emf.common.util.URI.createURI(uri.toString());
          final Collection<EObject> eObjects = ecoreBuilder.generate(emfURI);
          final boolean multipleFiles = eObjects.size() > 1;
          for (final EObject eObject : eObjects) {
            final EPackage ePackage = (EPackage) eObject;

            // create the new URI
            org.eclipse.emf.common.util.URI ecoreURI = emfURI.trimFileExtension().appendFileExtension("ecore"); //$NON-NLS-1$
            if (multipleFiles) {
              String strUri = ecoreURI.toString();
              final int lastDot = strUri.lastIndexOf(".");
              strUri = strUri.substring(0, lastDot) + "_" + ePackage.getName() + strUri.substring(lastDot);
              ecoreURI = org.eclipse.emf.common.util.URI.createURI(strUri);
            }

            // save the EPackage in the file
            final Resource resource = resourceSet.createResource(ecoreURI);
            resource.getContents().clear();
            resource.getContents().add(ePackage);
            resourcesToSave.add(resource);
          }
        }

        for (Resource resource : resourcesToSave) {
          resource.save(Collections.emptyMap());
        }
      }
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }
}
