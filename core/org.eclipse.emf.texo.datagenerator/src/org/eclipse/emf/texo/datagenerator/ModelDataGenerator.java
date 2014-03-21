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
 * $Id: ModelDataGenerator.java,v 1.19 2011/09/14 15:40:11 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;

/**
 * Generates test data for a set of EClasses.
 * 
 * The basic procedure creates dataSize instances of each EClass in startEClasses. For each instance the containment
 * structure is created, until the maxDepth has been reached.
 * 
 * Then for all created objects the data is set. This is the primitive data (EAttribute) as well as the referenced data
 * (EReference).
 * 
 * Setting of EReferences is a bit special ({@link EReferenceDataGenerator}). To set an EReference the system tries to
 * find an existing object in the pool of EObjects of the correct type. If the eReference does not have an eOpposite
 * then it picks an arbitrary object. However, if the eReference has an eOpposite then it will only pick an eObject for
 * which this eOpposite has not yet been set. If no eObject can be found then a new one is created.
 * 
 * At the end the system checks if new EObjects have been created. If so it sets their data and starts over again. Until
 * no new EObjects are created. This process is repeated until no new objects have been created. This is the
 * breadth-creation step, if more than maxBreadth steps have been taken then the system stops setting non-mandatory
 * features.
 * 
 * If more than maxObjects have been created then the system stops setting mandatory features. This should result in
 * less new eObjects as non-mandatory eReferences are ignored.
 * 
 * However there is always a danger of infinite looping therefore the system throws an exception if more than
 * objectLimit objects have been created. The default value of objectLimit = 2 * maxObjects.
 * 
 * Primitive values are set using the {@link EAttributeDataGenerator} and its subclasses.
 * 
 * NOTE/BEWARE: the setting of the collectionSize and maxDepth have a great influence on the number of Objects created.
 * Just small numbers for these settings already result in a large number of objects, for example for the standard
 * ExtLibrary example of EMF, a collectionSize of 5, maxDepth of 5 and a dataSize of 3 results in 70000 objects.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.19 $
 */

public class ModelDataGenerator {

  private List<EObject> toSetData = new ArrayList<EObject>();

  private List<EObject> allEObjects = new ArrayList<EObject>();

  private List<EObject> rootObjects = new ArrayList<EObject>();

  private DataGeneratorFactory dataGeneratorFactory = new DataGeneratorFactory();

  private List<EClass> startEClasses = null;

  private List<EPackage> ePackages = null;

  private Map<EClass, EClassDataGenerator> eClassDataGenerators = new HashMap<EClass, EClassDataGenerator>();

  private Map<EDataType, EDataTypeDataGenerator> eDataTypeGenerators = new HashMap<EDataType, EDataTypeDataGenerator>();

  private List<EStructuralFeature> ignoreEFeatures = new ArrayList<EStructuralFeature>();

  private int dataSize = 1;
  private int collectionSize = 5;
  private int maxObjects = 1000;
  private int maxObjectLimit = 10000;
  private int maxDepth = 3;
  private int maxBreadth = 3;

  private boolean preventDanglingObjects = true;

  private boolean considerOnlyMandatoryFeatures = false;

  private boolean useDataFiles = true;

  // if true then no generated enum values are used,
  // if the epackage contains generated EMF epackages then
  // it is needed to set this to false.
  private boolean useDynamicEnums = false;

  /**
   * Generate the test objects, see the description in the top of the class. After this call the top-objects (with
   * eContainer == null) can be retrieved through the {@link #getResult()} method. The total number of created objects
   * can be retrieved through a call to {@link #getTotalObjectCount()}.
   */
  public void generateTestData() {
    dataGeneratorFactory.setUseDataFiles(useDataFiles);

    if (ePackages == null) {
      throw new IllegalStateException("The EPackages property must be set"); //$NON-NLS-1$
    }
    if (startEClasses == null) {
      throw new IllegalStateException("The StartEClasses property must be set"); //$NON-NLS-1$
    }

    // step 1: create the eobjects of the root
    for (final EClass eClass : startEClasses) {
      // don't generate for these eclasses
      // if (eClass.getInstanceClass() != null && !DataGeneratorUtils.isEMap(eClass)) {
      // continue;
      // }
      if (eClass.isAbstract() || eClass.isInterface()) {
        continue;
      }
      final EClassDataGenerator eClassDataGenerator = getEClassDataGenerator(eClass);
      for (int i = 0; i < dataSize; i++) {
        rootObjects.add(eClassDataGenerator.createEObject());
      }
    }

    // step 2: use the depth to create a tree
    for (EObject eObject : rootObjects) {
      buildTree(eObject, 0);
    }

    // step 3: set all the data
    int breadthSteps = 0;
    while (toSetData.size() > 0) {
      if (allEObjects.size() > getMaxObjectLimit()) {
        throw new IllegalStateException("The system generated more than the maximum allowed objects, exiting"); //$NON-NLS-1$
      }
      final List<EObject> dataToProcess = new ArrayList<EObject>(toSetData);
      toSetData.clear();
      breadthSteps++;
      setConsiderOnlyMandatoryFeatures(isConsiderOnlyMandatoryFeatures() || breadthSteps > getMaxBreadth());
      for (final EObject eObject : dataToProcess) {
        final EClassDataGenerator eClassDataGenerator = getEClassDataGenerator(eObject.eClass());
        setConsiderOnlyMandatoryFeatures(isConsiderOnlyMandatoryFeatures() || allEObjects.size() > getMaxObjects());
        eClassDataGenerator.setData(eObject);
      }
    }

    // step 3: solve dangling objects if present
    if (preventDanglingObjects) {
      solveDanglingObjects();
    }

    solveEMapDoublures();
  }

  private void buildTree(EObject eObject, int depth) {
    // already put in the tree
    if (eObject.eContainer() != null) {
      return;
    }
    final List<EObject> children = new ArrayList<EObject>();
    for (EReference eReference : eObject.eClass().getEAllReferences()) {
      if (eReference.isVolatile() || !eReference.isChangeable() || !eReference.isContainment()) {
        continue;
      }
      final EClassDataGenerator eClassDataGenerator = getEClassDataGenerator(eReference.getEReferenceType());
      if (eReference.isMany()) {
        for (int i = 0; i < getCollectionSize(); i++) {
          final EObject child = eClassDataGenerator.getCreateEObject(eObject, eReference);
          @SuppressWarnings("unchecked")
          final EList<EObject> values = (EList<EObject>) eObject.eGet(eReference);
          values.add(child);
          children.add(child);
        }
      } else {
        final EObject child = eClassDataGenerator.getCreateEObject(eObject, eReference);
        eObject.eSet(eReference, child);
        children.add(child);
      }
    }
    if (depth < getMaxDepth()) {
      for (EObject child : children) {
        buildTree(child, depth + 1);
      }
    }
  }

  private void solveEMapDoublures() {
    // when building the initial tree, emap entries are created with a null
    // value for the key, then when the key is later set the owning emap
    // can contain doublures, this should now be repaired.
    final List<Object> toRemoveFromAllEObjects = new ArrayList<Object>();
    for (EObject eObject : allEObjects) {
      for (EReference eReference : eObject.eClass().getEAllReferences()) {
        if (DataGeneratorUtils.isEMap(eReference.getEReferenceType())) {
          // an emap
          final Map<Object, Object> checkMap = new HashMap<Object, Object>();
          final EList<?> values = (EList<?>) eObject.eGet(eReference);
          final ListIterator<?> iterator = values.listIterator();
          while (iterator.hasNext()) {
            final Map.Entry<?, ?> entry = (Map.Entry<?, ?>) iterator.next();
            if (checkMap.containsKey(entry.getKey())) {
              iterator.remove();
              toRemoveFromAllEObjects.add(entry);
            } else {
              checkMap.put(entry.getKey(), entry.getValue());
            }
          }
        }
      }
    }
    // the removed emap entries are also in allEObjects
    // get rid of them
    allEObjects.removeAll(toRemoveFromAllEObjects);
  }

  // find a root object for each object
  private void solveDanglingObjects() {
    final List<EObject> notContainedEObjects = new ArrayList<EObject>();

    for (EObject eObject : allEObjects) {
      if (eObject.eContainer() == null && !rootObjects.contains(eObject)) {
        notContainedEObjects.add(eObject);
      }
    }

    while (!notContainedEObjects.isEmpty()) {
      final List<EObject> repairedEObjects = new ArrayList<EObject>();
      for (EObject container : allEObjects) {
        final boolean hasMixedFeature = null != DataGeneratorUtils.getMixedEStructuralFeature(container.eClass());
        for (EReference eReference : container.eClass().getEAllReferences()) {
          boolean partOfGroup = null != ExtendedMetaData.INSTANCE.getGroup(eReference);
          partOfGroup |= hasMixedFeature && !DataGeneratorUtils.isAttribute(eReference) && eReference.isVolatile();
          if (!partOfGroup && eReference.isVolatile() || !eReference.isChangeable() || !eReference.isContainment()) {
            continue;
          }
          // containment feature already set
          if (!eReference.isMany() && container.eGet(eReference) != null) {
            continue;
          }
          for (EObject notContained : notContainedEObjects) {
            if (eReference.getEReferenceType().isSuperTypeOf(notContained.eClass())) {
              if (eReference.isMany()) {
                @SuppressWarnings("unchecked")
                final EList<EObject> values = (EList<EObject>) container.eGet(eReference);
                values.add(notContained);
              } else {
                container.eSet(eReference, notContained);
              }
              repairedEObjects.add(notContained);
            }
          }
          notContainedEObjects.removeAll(repairedEObjects);
        }
      }
      if (repairedEObjects.isEmpty()) {
        break;
      }
    }
  }

  public boolean isRootObject(EObject eObject) {
    return rootObjects.contains(eObject);
  }

  /**
   * @return the result of the {@link #generateTestData()} call. This list contains the EObjects with eContainer() ==
   *         null, all other objects should be contained in this set.
   */
  public List<EObject> getResult() {
    final List<EObject> result = new ArrayList<EObject>();
    for (final EObject eObject : allEObjects) {
      if (eObject.eContainer() == null) {
        result.add(eObject);
      }
    }
    return result;
  }

  /**
   * Add a new EObject to the set of EObjects for which the data needs to be set.
   * 
   * @param eObject
   *          a new (empty) EObject
   */
  protected void addToSetData(final EObject eObject) {
    toSetData.add(eObject);
    allEObjects.add(eObject);
    if (toSetData.size() + getTotalObjectCount() > getMaxObjectLimit()) {
      throw new IllegalStateException("The system generated more (" //$NON-NLS-1$
          + (toSetData.size() + getTotalObjectCount()) + ") than the maximum allowed objects (" //$NON-NLS-1$
          + getMaxObjectLimit() + "), exiting"); //$NON-NLS-1$
    }
  }

  /**
   * @param eClass
   *          the EClass for which an EClassDataGenerator needs to be returned. If there is EClassDataGenerator for this
   *          EClass then a new one is created.
   * @return an instance of EClassDataGenerator
   */
  protected EClassDataGenerator getEClassDataGenerator(final EClass eClass) {
    EClassDataGenerator eClassDataGenerator = eClassDataGenerators.get(eClass);
    if (eClassDataGenerator == null) {
      eClassDataGenerator = getDataGeneratorFactory().createEClassDataGenerator(eClass, this);
      eClassDataGenerators.put(eClass, eClassDataGenerator);
    }
    return eClassDataGenerator;
  }

  /**
   * Search for an EDataTypeDataGenerator in the internal map, if not found creates a new one.
   * 
   * @param eDataType
   *          the EDataType for which to create a generator.
   * @param eAttribute
   *          the EAttribute for which the data type generator is created, may be null, is used for reading files with
   *          example data (if set).
   * @return the new or existing EDataTypeDataGenerator
   */
  public EDataTypeDataGenerator getEDataTypeDataGenerator(final EDataType eDataType, EAttribute eAttribute) {
    EDataTypeDataGenerator eDataTypeGenerator = eDataTypeGenerators.get(eDataType);
    if (eDataTypeGenerator == null) {
      eDataTypeGenerator = getDataGeneratorFactory().createEDataTypeDataGenerator(eDataType, this, eAttribute);
      eDataTypeGenerators.put(eDataType, eDataTypeGenerator);
    }
    return eDataTypeGenerator;
  }

  /**
   * @param eClass
   *          the EClass to get the concrete subtypes for
   * @return all concrete (!abstract && !interface) of eClass are returned. This is multi-level, so through the complete
   *         inheritance structure (of the EPackages: {@link #getEPackages()})
   */
  protected List<EClass> getAllConcreteEClasses(final EClass eClass) {
    final List<EClass> result = new ArrayList<EClass>();
    if (!eClass.isAbstract() && !eClass.isInterface()) {
      result.add(eClass);
    }

    for (final EPackage ePackage : getEPackages()) {
      for (final EClassifier eClassifier : ePackage.getEClassifiers()) {
        if (eClassifier instanceof EClass) {
          final EClass checkEClass = (EClass) eClassifier;
          if (checkEClass.getEAllSuperTypes().contains(eClass) && !checkEClass.isAbstract()
              && !checkEClass.isInterface()) {
            result.add(checkEClass);
          }
        }
      }
    }
    return result;
  }

  /**
   * @param eClass
   *          the EClass for which the subtypes must be returned
   * @return the direct subtypes of eClass
   */
  public List<EClass> getAllSubEClasses(final EClass eClass) {
    final List<EClass> result = new ArrayList<EClass>();

    for (final EPackage ePackage : getEPackages()) {
      for (final EClassifier eClassifier : ePackage.getEClassifiers()) {
        if (eClassifier instanceof EClass) {
          final EClass checkEClass = (EClass) eClassifier;
          if (checkEClass.getESuperTypes().contains(eClass)) {
            result.add(checkEClass);
          }
        }
      }
    }
    return result;
  }

  public int getCollectionSize() {
    return collectionSize;
  }

  public void setCollectionSize(final int collectionSize) {
    this.collectionSize = collectionSize;
  }

  public DataGeneratorFactory getDataGeneratorFactory() {
    return dataGeneratorFactory;
  }

  public void setDataGeneratorFactory(final DataGeneratorFactory dataGeneratorFactory) {
    this.dataGeneratorFactory = dataGeneratorFactory;
  }

  public List<EClass> getStartEClasses() {
    return startEClasses;
  }

  public void setStartEClasses(final List<EClass> startEClasses) {
    this.startEClasses = startEClasses;
  }

  public int getDataSize() {
    return dataSize;
  }

  public void setDataSize(final int dataSize) {
    this.dataSize = dataSize;
  }

  public int getMaxObjects() {
    return maxObjects;
  }

  public void setMaxObjects(final int maxObjects) {
    this.maxObjects = maxObjects;
    setMaxObjectLimit(2 * maxObjects);
  }

  public int getMaxObjectLimit() {
    return maxObjectLimit;
  }

  public void setMaxObjectLimit(final int maxObjectLimit) {
    this.maxObjectLimit = maxObjectLimit;
  }

  public int getMaxDepth() {
    return maxDepth;
  }

  public void setMaxDepth(final int maxDepth) {
    this.maxDepth = maxDepth;
  }

  public List<EPackage> getEPackages() {
    return ePackages;
  }

  public void setEPackages(final List<EPackage> packages) {
    ePackages = packages;
  }

  public int getTotalObjectCount() {
    return allEObjects.size();
  }

  public boolean isPreventDanglingObjects() {
    return preventDanglingObjects;
  }

  public void setPreventDanglingObjects(boolean preventDanglingObjects) {
    this.preventDanglingObjects = preventDanglingObjects;
  }

  public boolean isConsiderOnlyMandatoryFeatures() {
    return considerOnlyMandatoryFeatures;
  }

  public void setConsiderOnlyMandatoryFeatures(boolean considerOnlyMandatoryFeatures) {
    this.considerOnlyMandatoryFeatures = considerOnlyMandatoryFeatures;
  }

  public int getMaxBreadth() {
    return maxBreadth;
  }

  public void setMaxBreadth(int maxBreadth) {
    this.maxBreadth = maxBreadth;
  }

  public boolean isUseDataFiles() {
    return useDataFiles;
  }

  public void setUseDataFiles(boolean useDataFiles) {
    this.useDataFiles = useDataFiles;
  }

  public boolean isUseDynamicEnums() {
    return useDynamicEnums;
  }

  public void setUseDynamicEnums(boolean useDynamicEnums) {
    this.useDynamicEnums = useDynamicEnums;
  }

  public List<EStructuralFeature> getIgnoreEFeatures() {
    return ignoreEFeatures;
  }

  public void setIgnoreEFeatures(List<EStructuralFeature> ignoreEFeatures) {
    this.ignoreEFeatures = ignoreEFeatures;
  }

  public List<EObject> getAllEObjects() {
    return allEObjects;
  }
}