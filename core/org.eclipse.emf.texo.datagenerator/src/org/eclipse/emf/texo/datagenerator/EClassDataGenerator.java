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
 * $Id: EClassDataGenerator.java,v 1.14 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Generates an instance for an EClass and sets the content of that object. Keeps a pool of created EObjects of the
 * {@link #getEClass()}. {@link EReferenceDataGenerator} calls this class to request for an instance of the EClass. This
 * class uses specific logic to determine if an existing EObject can be used or a new one needs to be created. In case
 * the EReference is a containment EReference then always a new EObject is created.
 * 
 * In case EReference is bidirectional then the system tries to find an existing EObject for which the
 * {@link EReference#getEOpposite()} has not yet been set. If it can't find one, then a new EObject is created.
 * 
 * In other cases an existing EObject is used (selected kind of randomly), if no EObjects yet exist then a new one is
 * created.
 * 
 * If the EClass is abstract or an interface then the system will select a random concrete sub EClass for the new
 * EObject.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.14 $
 */

public class EClassDataGenerator extends DataGenerator {

  private List<EObject> eObjects = new ArrayList<EObject>();
  private int selectedIndex = 0;
  private EClass eClass;
  private List<EStructuralFeatureDataGenerator> dataGenerators = new ArrayList<EStructuralFeatureDataGenerator>();

  private List<EClass> concreteEClasses = null;
  private List<EClass> subEClasses = null;
  private int eClassIndex = 0;

  public EClass getEClass() {
    return eClass;
  }

  /**
   * Gets an existing EObject or creates a new one, see the description in the top of this Class.
   * 
   * @param owner
   *          the owner for which the feature eReference requires an instance of thie {@link #getEClass()}
   * @param eReference
   *          the returned EObject will be added to/set to the value in this EReference (in owner)
   * @param depth
   *          is used when building the initial containment structure, if depth >
   *          {@link ModelDataGenerator#getMaxDepth()} then only mandatory containment EReferences are 'walked'
   * @return an existing or new instance of {@link #getEClass()}
   */
  public EObject getCreateEObject(final EObject owner, final EReference eReference) {
    if (!eReference.isContainment()) {
      final EObject eObject = findExistingObject(owner, eReference);
      if (eObject != null) {
        return eObject;
      }
    }

    return createEObject();
  }

  /**
   * Find an EObject from the internal list. Returns an EObject only if it is not used by other owners (considering the
   * passed in eReference). Returns null if no valid/free EObject can be found.
   * 
   * @param owner
   *          the owner who intends to use the EObject in the EReference
   * @param eReference
   *          the EReference in which the owner wants to set/add the EObject
   * @return a valid/free EObject or null if none found
   */
  protected EObject findExistingObject(final EObject owner, final EReference eReference) {
    final EReference eOpposite = eReference.getEOpposite();
    int tries = 0;
    while (tries < eObjects.size()) {
      final EObject eObject = getNextEObject();
      tries++;
      // prevent cycles in the container structure
      if ((eReference.isContainer() || eReference.isContainment())
          && (EcoreUtil.isAncestor(eObject, owner) || EcoreUtil.isAncestor(owner, eObject))) {
        continue;
      }

      // already contained, skip it
      if (eReference.isContainment() && eObject.eContainer() != null) {
        continue;
      }

      // feature not yet set return this one
      if (eOpposite == null) {
        return eObject;
      } else if (eOpposite.isMany() || eObject.eGet(eOpposite) == null) {
        return eObject;
      }
    }

    if (subEClasses == null) {
      subEClasses = getModelDataGenerator().getAllSubEClasses(eClass);
    }

    // try all subclasses to see if they have an object available
    for (final EClass eSubClass : subEClasses) {
      final EClassDataGenerator eClassDataGenerator = getModelDataGenerator().getEClassDataGenerator(eSubClass);
      final EObject eObject = eClassDataGenerator.findExistingObject(owner, eReference);
      if (eObject != null) {
        return eObject;
      }
    }
    for (final EClass eSubClass : subEClasses) {
      final EClassDataGenerator eClassDataGenerator = getModelDataGenerator().getEClassDataGenerator(eSubClass);
      final EObject eObject = eClassDataGenerator.getCreateEObject(owner, eReference);
      if (eObject != null) {
        return eObject;
      }
    }

    return null;
  }

  /**
   * Sets all EStructuralFeatures of the owner using {@link EStructuralFeatureDataGenerator}.
   * 
   * @param owner
   *          the EObject which data is to be set
   */
  public void setData(final EObject owner) {
    for (final EStructuralFeatureDataGenerator dataGenerator : dataGenerators) {
      if (dataGenerator.getEStructuralFeature() instanceof EReference) {
        // don't set the container of a root object
        final EReference eReference = (EReference) dataGenerator.getEStructuralFeature();
        if (eReference.isContainer() && getModelDataGenerator().isRootObject(owner)) {
          continue;
        }
      }
      dataGenerator.setData(owner);
    }

  }

  /**
   * Creates a new instance of the {@link #getEClass()} (or one of its concrete sub eclasses).
   * 
   * The new EObject is added to the relevant structures in the ModelGenerator {@link #getModelDataGenerator()}.
   * 
   * @return the newly create EObject
   */
  public EObject createEObject() {
    final EClass nextEClass = getNextConcreteEClass();
    final EObject eObject = EcoreUtil.create(nextEClass);
    eObjects.add(eObject);
    getModelDataGenerator().addToSetData(eObject);
    return eObject;
  }

  /**
   * This class keeps an internal list of created EObjects.
   * 
   * @return an EObject from the internal list, every call will return a different one from the list
   */
  protected EObject getNextEObject() {
    if (selectedIndex == eObjects.size()) {
      selectedIndex = 0;
    }
    return eObjects.get(selectedIndex++);
  }

  /**
   * Sets the EClass and builds the internal list of {@link EStructuralFeatureDataGenerator} instances.
   * 
   * @param eClass
   *          the EClass for which this data generator will operate
   */
  public void setEClass(final EClass eClass) {
    this.eClass = eClass;
    final DataGeneratorFactory factory = getModelDataGenerator().getDataGeneratorFactory();
    for (final EStructuralFeature eStructuralFeature : eClass.getEAllStructuralFeatures()) {

      if (eStructuralFeature.isVolatile() || !eStructuralFeature.isChangeable()) {
        continue;
      }
      if (getModelDataGenerator().getIgnoreEFeatures().contains(eStructuralFeature)) {
        continue;
      }

      dataGenerators.add(factory.createEStructuralFeatureDataGenerator(eClass, eStructuralFeature,
          getModelDataGenerator()));
    }
  }

  /**
   * Is used when the {@link #getEClass()} is abstract or an interface, then this data generator will try to create
   * instance of a concrete sub EClass. The system keeps a list of concrete sub EClasses and with every call returns a
   * different one from the list.
   * 
   * @return the concrete EClass which inherits from {@link #getEClass()}
   */
  protected EClass getNextConcreteEClass() {
    if (eClassIndex == getConcreteEClasses().size()) {
      eClassIndex = 0;
    }
    if (eClassIndex > getConcreteEClasses().size()) {
      throw new IllegalStateException("No concrete sub EClasses for the EClass " //$NON-NLS-1$
          + getEClass().getName() + ", did you set all required EPackages in the ModelDataGenerator"); //$NON-NLS-1$
    }
    return getConcreteEClasses().get(eClassIndex++);
  }

  protected List<EClass> getConcreteEClasses() {
    if (concreteEClasses == null) {
      concreteEClasses = getModelDataGenerator().getAllConcreteEClasses(eClass);
    }
    return concreteEClasses;
  }

  public List<EObject> getEObjects() {
    return eObjects;
  }

  public void setEObjects(final List<EObject> objects) {
    eObjects = objects;
  }
}