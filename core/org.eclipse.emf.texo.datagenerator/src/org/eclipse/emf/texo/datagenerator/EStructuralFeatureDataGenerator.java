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
 * $Id: EStructuralFeatureDataGenerator.java,v 1.6 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Generates a value for a specific EStructuralFeature..
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public abstract class EStructuralFeatureDataGenerator extends DataGenerator {

  private EStructuralFeature eStructuralFeature;

  public abstract void setData(EObject owner);

  public EStructuralFeature getEStructuralFeature() {
    return eStructuralFeature;
  }

  public void setEStructuralFeature(final EStructuralFeature structuralFeature) {
    eStructuralFeature = structuralFeature;
  }

  @Override
  public String toString() {
    return eStructuralFeature.getName();
  }

  public abstract Object createValue(EObject eObject);

}