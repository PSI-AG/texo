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
 * $Id: XMLBaseTest.java,v 1.13 2011/08/25 12:42:35 mtaal Exp $
 */

package org.eclipse.emf.texo.json.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.datagenerator.DataGeneratorUtils;
import org.eclipse.emf.texo.model.ModelPackage;

/**
 * Base class for test classes in this package.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.13 $
 */

public abstract class BaseJSONTest extends TestCase {

  private List<EPackage> ePackages;
  private List<EClass> eClasses;

  public BaseJSONTest(String name) {
    super(name);
  }

  public void setModelPackages(List<ModelPackage> modelPackages) {
    ePackages = new ArrayList<EPackage>();
    for (ModelPackage modelPackage : modelPackages) {
      ePackages.add(modelPackage.getEPackage());
    }
  }

  public List<EClass> getEClasses() {
    if (eClasses == null) {
      setAllEClasses();
    }
    return eClasses;
  }

  public void setEClasses(List<EClass> eClasses) {
    this.eClasses = eClasses;
  }

  protected void setAllEClasses() {
    eClasses = DataGeneratorUtils.getRootEClasses(ePackages);
  }

  public List<EPackage> getEPackages() {
    return ePackages;
  }

  public void setEPackages(List<EPackage> ePackages) {
    this.ePackages = ePackages;
  }
}