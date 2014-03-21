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
 * $Id: ORMNamingStrategy.java,v 1.9 2011/08/26 05:34:12 mtaal Exp $
 */

package org.eclipse.emf.texo.orm.annotator;

import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation;

/**
 * Creates new instances of the {@link ORMNamingStrategy}. Can be overridden/set to create your own instances of the
 * {@link ORMNamingStrategy}.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ORMNamingStrategyProvider {
  private static ORMNamingStrategyProvider instance = new ORMNamingStrategyProvider();

  public static ORMNamingStrategyProvider getInstance() {
    return instance;
  }

  public static void setInstance(ORMNamingStrategyProvider instance) {
    ORMNamingStrategyProvider.instance = instance;
  }

  public ORMNamingStrategy createORMNamingStrategy(EPackageORMAnnotation ormAnnotation) {
    final ORMNamingStrategy namingStrategy = ComponentProvider.getInstance().newInstance(ORMNamingStrategy.class);
    namingStrategy.setePackageORMAnnotation(ormAnnotation);
    return namingStrategy;
  }
}