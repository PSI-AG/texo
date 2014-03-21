/**
 * <copyright>
 * </copyright>
 *
 * $Id: CacheCoordinationType.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Cache Coordination Type</b></em>
 * ', and utility methods for working with them. <!-- end-user-doc --> <!-- begin-model-doc -->
 * 
 * 
 * * * An enum that is used within the Cache annotation. * * @see org.eclipse.persistence.annotations.Cache * public
 * enum CacheCoordinationType { * * Sends a list of changed objects including data about the changes. * This data is
 * merged into the receiving cache. * SEND_OBJECT_CHANGES,
 * 
 * * * Sends a list of the identities of the objects that have changed. * The receiving cache invalidates the objects
 * (rather than changing * any of the data) * INVALIDATE_CHANGED_OBJECTS,
 * 
 * * * Same as SEND_OBJECT_CHANGES except it also includes any newly * created objects from the transaction. *
 * SEND_NEW_OBJECTS_WITH_CHANGES,
 * 
 * * * Does no cache coordination. * NONE }
 * 
 * 
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCacheCoordinationType()
 * @model extendedMetaData="name='cache-coordination-type'"
 * @generated
 */
public enum CacheCoordinationType implements Enumerator {
  /**
   * The '<em><b>SENDOBJECTCHANGES</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #SENDOBJECTCHANGES_VALUE
   * @generated
   * @ordered
   */
  SENDOBJECTCHANGES(0, "SENDOBJECTCHANGES", "SEND_OBJECT_CHANGES"),

  /**
   * The '<em><b>INVALIDATECHANGEDOBJECTS</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #INVALIDATECHANGEDOBJECTS_VALUE
   * @generated
   * @ordered
   */
  INVALIDATECHANGEDOBJECTS(1, "INVALIDATECHANGEDOBJECTS", "INVALIDATE_CHANGED_OBJECTS"),

  /**
   * The '<em><b>SENDNEWOBJECTSWITHCHANGES</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #SENDNEWOBJECTSWITHCHANGES_VALUE
   * @generated
   * @ordered
   */
  SENDNEWOBJECTSWITHCHANGES(2, "SENDNEWOBJECTSWITHCHANGES", "SEND_NEW_OBJECTS_WITH_CHANGES"),

  /**
   * The '<em><b>NONE</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #NONE_VALUE
   * @generated
   * @ordered
   */
  NONE(3, "NONE", "NONE");

  /**
   * The '<em><b>SENDOBJECTCHANGES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SENDOBJECTCHANGES</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SENDOBJECTCHANGES
   * @model literal="SEND_OBJECT_CHANGES"
   * @generated
   * @ordered
   */
  public static final int SENDOBJECTCHANGES_VALUE = 0;

  /**
   * The '<em><b>INVALIDATECHANGEDOBJECTS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INVALIDATECHANGEDOBJECTS</b></em>' literal object isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INVALIDATECHANGEDOBJECTS
   * @model literal="INVALIDATE_CHANGED_OBJECTS"
   * @generated
   * @ordered
   */
  public static final int INVALIDATECHANGEDOBJECTS_VALUE = 1;

  /**
   * The '<em><b>SENDNEWOBJECTSWITHCHANGES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SENDNEWOBJECTSWITHCHANGES</b></em>' literal object isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SENDNEWOBJECTSWITHCHANGES
   * @model literal="SEND_NEW_OBJECTS_WITH_CHANGES"
   * @generated
   * @ordered
   */
  public static final int SENDNEWOBJECTSWITHCHANGES_VALUE = 2;

  /**
   * The '<em><b>NONE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NONE
   * @model
   * @generated
   * @ordered
   */
  public static final int NONE_VALUE = 3;

  /**
   * An array of all the '<em><b>Cache Coordination Type</b></em>' enumerators.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  private static final CacheCoordinationType[] VALUES_ARRAY = new CacheCoordinationType[] {
      SENDOBJECTCHANGES,
      INVALIDATECHANGEDOBJECTS,
      SENDNEWOBJECTSWITHCHANGES,
      NONE,
    };

  /**
   * A public read-only list of all the '<em><b>Cache Coordination Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<CacheCoordinationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Cache Coordination Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   */
  public static CacheCoordinationType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      CacheCoordinationType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Cache Coordination Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static CacheCoordinationType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      CacheCoordinationType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Cache Coordination Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   */
  public static CacheCoordinationType get(int value) {
    switch (value) {
      case SENDOBJECTCHANGES_VALUE: return SENDOBJECTCHANGES;
      case INVALIDATECHANGEDOBJECTS_VALUE: return INVALIDATECHANGEDOBJECTS;
      case SENDNEWOBJECTSWITHCHANGES_VALUE: return SENDNEWOBJECTSWITHCHANGES;
      case NONE_VALUE: return NONE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private CacheCoordinationType(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public int getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral() {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return literal;
  }

} // CacheCoordinationType
