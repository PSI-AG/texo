/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010, 2012 Springsite BV (The Netherlands) and others
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
 * $Id: DeleteModelOperation.java,v 1.8 2011/09/21 14:04:56 mtaal Exp $
 */
package org.eclipse.emf.texo.server.service;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.component.TexoComponent;
import org.eclipse.emf.texo.component.TexoStaticSingleton;
import org.eclipse.emf.texo.model.ModelPackage;

/**
 * Registry for all {@link ModelPackage} instances handled by this service layer.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ServiceModelPackageRegistry implements TexoStaticSingleton, TexoComponent {

  private static ServiceModelPackageRegistry instance = ComponentProvider.getInstance().newInstance(
      ServiceModelPackageRegistry.class);

  public static ServiceModelPackageRegistry getInstance() {
    return instance;
  }

  public static void setInstance(ServiceModelPackageRegistry instance) {
    ServiceModelPackageRegistry.instance = instance;
  }

  private List<ModelPackage> registry = new ArrayList<ModelPackage>();

  /**
   * Add a {@link ModelPackage} to the service package registry.
   * 
   * @param modelPackage
   */
  public void register(ModelPackage modelPackage) {
    if (registry.contains(modelPackage)) {
      // do nothing, be lenient...
      return;
    }
    registry.add(modelPackage);
  }

  /**
   * @return all {@link ModelPackage} instances handled by the service layer.
   */
  public List<ModelPackage> getRegisteredModelPackages() {
    return registry;
  }
}