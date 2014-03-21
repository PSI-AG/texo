/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChangeTrackingType.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Change Tracking Type</b></em>',
 * and utility methods for working with them. <!-- end-user-doc --> <!-- begin-model-doc -->
 * 
 * 
 * * * An enum that is used within the ChangeTracking annotation. * public enum ChangeTrackingType { * * An ATTRIBUTE
 * change tracking type allows change tracking at the * attribute level of an object. Objects with changed attributes
 * will * be processed in the commit process to include any changes in the * results of the commit. Unchanged objects
 * will be ignored. * ATTRIBUTE,
 * 
 * * * An OBJECT change tracking policy allows an object to calculate for * itself whether it has changed. Changed
 * objects will be processed in * the commit process to include any changes in the results of the * commit. Unchanged
 * objects will be ignored. * OBJECT,
 * 
 * * * A DEFERRED change tracking policy defers all change detection to * the UnitOfWork's change detection process.
 * Essentially, the * calculateChanges() method will run for all objects in a UnitOfWork. * This is the default
 * ObjectChangePolicy * DEFERRED,
 * 
 * * * Will not set any change tracking policy. * AUTO }
 * 
 * 
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getChangeTrackingType()
 * @model extendedMetaData="name='change-tracking-type'"
 * @generated
 */
public enum ChangeTrackingType implements Enumerator {
  /**
   * The '<em><b>ATTRIBUTE</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #ATTRIBUTE_VALUE
   * @generated
   * @ordered
   */
  ATTRIBUTE(0, "ATTRIBUTE", "ATTRIBUTE"),

  /**
   * The '<em><b>OBJECT</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #OBJECT_VALUE
   * @generated
   * @ordered
   */
  OBJECT(1, "OBJECT", "OBJECT"),

  /**
   * The '<em><b>DEFERRED</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #DEFERRED_VALUE
   * @generated
   * @ordered
   */
  DEFERRED(2, "DEFERRED", "DEFERRED"),

  /**
   * The '<em><b>AUTO</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #AUTO_VALUE
   * @generated
   * @ordered
   */
  AUTO(3, "AUTO", "AUTO");

  /**
   * The '<em><b>ATTRIBUTE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ATTRIBUTE</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ATTRIBUTE
   * @model
   * @generated
   * @ordered
   */
  public static final int ATTRIBUTE_VALUE = 0;

  /**
   * The '<em><b>OBJECT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OBJECT</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OBJECT
   * @model
   * @generated
   * @ordered
   */
  public static final int OBJECT_VALUE = 1;

  /**
   * The '<em><b>DEFERRED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DEFERRED</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEFERRED
   * @model
   * @generated
   * @ordered
   */
  public static final int DEFERRED_VALUE = 2;

  /**
   * The '<em><b>AUTO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AUTO</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AUTO
   * @model
   * @generated
   * @ordered
   */
  public static final int AUTO_VALUE = 3;

  /**
   * An array of all the '<em><b>Change Tracking Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  private static final ChangeTrackingType[] VALUES_ARRAY = new ChangeTrackingType[] {
      ATTRIBUTE,
      OBJECT,
      DEFERRED,
      AUTO,
    };

  /**
   * A public read-only list of all the '<em><b>Change Tracking Type</b></em>' enumerators.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static final List<ChangeTrackingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Change Tracking Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   */
  public static ChangeTrackingType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ChangeTrackingType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Change Tracking Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static ChangeTrackingType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ChangeTrackingType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Change Tracking Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   */
  public static ChangeTrackingType get(int value) {
    switch (value) {
      case ATTRIBUTE_VALUE: return ATTRIBUTE;
      case OBJECT_VALUE: return OBJECT;
      case DEFERRED_VALUE: return DEFERRED;
      case AUTO_VALUE: return AUTO;
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
  private ChangeTrackingType(int value, String name, String literal) {
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

} // ChangeTrackingType
