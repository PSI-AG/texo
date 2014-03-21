package org.eclipse.emf.texo.datagenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;

/**
 * Model/Ecore related convenience methods to for example read ecore and xsd's.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class DataGeneratorUtils {

  /**
   * Adds a value to an {@link EList} or {@link EMap} if it is not already in it. Handles the case that the value is a
   * {@link Map.Entry}, in that case the check for contains is done using containsKey of the map entry.
   * 
   * @param eList
   *          the EList or EMap to add to
   * @param value
   *          the value to add
   * @return true if the add happened, false if the value was already in the EList or the key of the value was already
   *         set in the EMap
   */
  @SuppressWarnings("rawtypes")
  public static boolean addToEList(EList<EObject> eList, EObject value) {
    final boolean isEMap = eList instanceof EMap;
    if (isEMap) {
      final EStructuralFeature eKeyFeature = value.eClass().getEStructuralFeature("key"); //$NON-NLS-1$
      final Object key = value.eGet(eKeyFeature);
      if (!((EMap) eList).containsKey(key)) {
        eList.add(value);
        return true;
      }
    } else if (!eList.contains(value)) {
      eList.add(value);
      return true;
    }
    return false;
  }

  /**
   * Utility method to compute a set of root {@link EClass} instances based on one or more {@link EPackage} instances.
   * Abstract, interface and {@link EMap} eClasses are not valid starting points for generating data.
   * 
   * @param ePackages
   *          the EPackages used as input
   * @return a list of EClasses which can be used for generating data
   * @see ModelDataGenerator#setStartEClasses(List)
   */
  public static List<EClass> getRootEClasses(List<EPackage> ePackages) {
    final List<EClass> eClasses = new ArrayList<EClass>();
    for (final EPackage ePackage : ePackages) {
      for (final EClassifier eClassifier : ePackage.getEClassifiers()) {
        if (eClassifier instanceof EClass && !isEMap((EClass) eClassifier)) {
          final EClass eClass = (EClass) eClassifier;
          if (!eClass.isAbstract() && !eClass.isInterface() && !isEMap(eClass)) {
            eClasses.add((EClass) eClassifier);
          }
        }
      }
    }
    return eClasses;
  }

  /**
   * Searches the item type of the edatatype by using the {@link ExtendedMetaData#getItemType(EDataType)}. If no item
   * type can be determined directly then the base type is tried ({@link ExtendedMetaData#getBaseType(EDataType)}).
   * 
   * This method is typically called for EDataType which have a java.util.Collection as the instanceClass, the type of
   * the elements (items) is defined by another EDataType.
   * 
   * @param eDataType
   *          the eDataType to get the item type for
   * @return the item type EDataType
   */
  public static EDataType getItemType(EDataType eDataType) {
    if (eDataType == null) {
      return null;
    }
    EDataType itemDataType = ExtendedMetaData.INSTANCE.getItemType(eDataType);
    if (itemDataType != null) {
      return itemDataType;
    }
    final List<EDataType> memberTypes = ExtendedMetaData.INSTANCE.getMemberTypes(eDataType);
    if (memberTypes != null && memberTypes.size() > 0) {
      itemDataType = memberTypes.get(0);
    }
    if (itemDataType != null) {
      return itemDataType;
    }

    // get the itemType of the basetype
    final EDataType eBaseType = ExtendedMetaData.INSTANCE.getBaseType(eDataType);
    if (eBaseType == null) {
      return null;
    }
    return getItemType(eBaseType);
  }

  /** @return true if the eClass represents a Map.Entry */
  // Note method is copied in ModelUtils, but also present here to prevent
  // dependency on Texo
  public static boolean isEMap(final EClass eClass) {
    return eClass != null && eClass.getInstanceClass() != null
        && Map.Entry.class.isAssignableFrom(eClass.getInstanceClass()) && eClass.getEStructuralFeature("key") != null //$NON-NLS-1$ 
        && eClass.getEStructuralFeature("value") != null; //$NON-NLS-1$
  }

  /**
   * See the {@link #isObjectTypeWithEnumBaseType(EDataType)} for information.
   * 
   * @param eDataType
   * @return
   */
  public static EEnum getEnumBaseDataTypeIfObject(EDataType eDataType) {
    if (eDataType instanceof EEnum) {
      return null;
    }
    final ExtendedMetaData extendedMetaData = ExtendedMetaData.INSTANCE;
    for (EDataType baseDataType = eDataType; baseDataType != null; baseDataType = extendedMetaData
        .getBaseType(baseDataType)) {
      if (baseDataType instanceof EEnum) {
        return (EEnum) baseDataType;
      }
    }
    return null;
  }

  /**
   * Returns the instanceclass of the EDataType. If no instance class is set then the base EDataType is used (if
   * present).
   * 
   * @param eDataType
   *          the EDataType for which the instance class is determined.
   * @return the instance class of the EDataType
   * @see ExtendedMetaData#getBaseType(EDataType)
   */
  public static Class<?> getInstanceClass(EDataType eDataType) {
    final Class<?> clz = eDataType.getInstanceClass();
    if (clz != null && clz != Object.class) {
      return eDataType.getInstanceClass();
    }
    if (clz == Object.class) {
      final List<EDataType> memberTypes = ExtendedMetaData.INSTANCE.getMemberTypes(eDataType);
      if (memberTypes != null && memberTypes.size() > 0) {
        return getInstanceClass(memberTypes.get(0));
      }
    }
    final EDataType baseType = ExtendedMetaData.INSTANCE.getBaseType(eDataType);
    if (baseType != null) {
      return getInstanceClass(baseType);
    }
    // default to a string
    return String.class;
  }

  /** Returns true if the passed feature is a wildcard mixed feature */
  public static boolean isMixed(EStructuralFeature feature) {
    EAnnotation eAnnotation = feature.getEAnnotation("http:///org/eclipse/emf/ecore/util/ExtendedMetaData"); //$NON-NLS-1$
    if (eAnnotation == null) {
      return false;
    }
    final String kind = eAnnotation.getDetails().get("kind"); //$NON-NLS-1$
    final String name = eAnnotation.getDetails().get("name"); //$NON-NLS-1$
    return kind != null && kind.compareTo("elementWildcard") == 0 && name != null //$NON-NLS-1$
        && name.compareTo(":mixed") == 0; //$NON-NLS-1$
  }

  /**
   * @param eClass
   *          the EStructuralFeatures of this EClass are searched for a mixed EStructuralFeature
   * @return the EStructuralFeature of the EClass which is mixed (see {@link #isMixed(EStructuralFeature)}).
   * @see EClass#getEAllStructuralFeatures()
   */
  public static EStructuralFeature getMixedEStructuralFeature(EClass eClass) {
    for (EStructuralFeature eStructuralFeature : eClass.getEAllStructuralFeatures()) {
      if (isMixed(eStructuralFeature)) {
        return eStructuralFeature;
      }
    }
    return null;
  }

  /**
   * @param feature
   *          the EStructuralFeature to check if it is an attribute
   * @return true if the passed feature is an attribute
   */
  public static boolean isAttribute(EStructuralFeature feature) {
    return isKind(feature, "attribute"); //$NON-NLS-1$
  }

  private static boolean isKind(EStructuralFeature feature, String kindValue) {
    EAnnotation eAnnotation = feature.getEAnnotation(ExtendedMetaData.ANNOTATION_URI);
    if (eAnnotation == null) {
      return false;
    }
    final String kind = eAnnotation.getDetails().get("kind"); //$NON-NLS-1$
    return kind != null && kind.compareTo(kindValue) == 0;
  }

}