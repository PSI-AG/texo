/**
 * <copyright>
 * </copyright>
 *
 * $Id: OptimisticLockingType.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Optimistic Locking Type</b></em>
 * ', and utility methods for working with them. <!-- end-user-doc --> <!-- begin-model-doc -->
 * 
 * 
 * * * A simple type that is used within an optimistic-locking * specification to specify the type of optimistic-locking
 * that * EclipseLink should use when updating or deleting entities. * public enum OptimisticLockingType { * * Using
 * this type of locking policy compares every field in the table * in the WHERE clause when doing an update or a delete.
 * If any field * has been changed, an optimistic locking exception will be thrown. * ALL_COLUMNS,
 * 
 * * * Using this type of locking policy compares only the changed fields * in the WHERE clause when doing an update. If
 * any field has been * changed, an optimistic locking exception will be thrown. A delete * will only compare the
 * primary key. * CHANGED_COLUMNS,
 * 
 * * * Using this type of locking compares selected fields in the WHERE * clause when doing an update or a delete. If
 * any field has been * changed, an optimistic locking exception will be thrown. Note that * the fields specified must
 * be mapped and not be primary keys. * SELECTED_COLUMNS,
 * 
 * * * Using this type of locking policy compares a single version number * in the where clause when doing an update.
 * The version field must be * mapped and not be the primary key. * VERSION_COLUMN }
 * 
 * 
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOptimisticLockingType()
 * @model extendedMetaData="name='optimistic-locking-type'"
 * @generated
 */
public enum OptimisticLockingType implements Enumerator {
  /**
   * The '<em><b>ALLCOLUMNS</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #ALLCOLUMNS_VALUE
   * @generated
   * @ordered
   */
  ALLCOLUMNS(0, "ALLCOLUMNS", "ALL_COLUMNS"),

  /**
   * The '<em><b>CHANGEDCOLUMNS</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #CHANGEDCOLUMNS_VALUE
   * @generated
   * @ordered
   */
  CHANGEDCOLUMNS(1, "CHANGEDCOLUMNS", "CHANGED_COLUMNS"),

  /**
   * The '<em><b>SELECTEDCOLUMNS</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #SELECTEDCOLUMNS_VALUE
   * @generated
   * @ordered
   */
  SELECTEDCOLUMNS(2, "SELECTEDCOLUMNS", "SELECTED_COLUMNS"),

  /**
   * The '<em><b>VERSIONCOLUMN</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #VERSIONCOLUMN_VALUE
   * @generated
   * @ordered
   */
  VERSIONCOLUMN(3, "VERSIONCOLUMN", "VERSION_COLUMN");

  /**
   * The '<em><b>ALLCOLUMNS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALLCOLUMNS</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALLCOLUMNS
   * @model literal="ALL_COLUMNS"
   * @generated
   * @ordered
   */
  public static final int ALLCOLUMNS_VALUE = 0;

  /**
   * The '<em><b>CHANGEDCOLUMNS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CHANGEDCOLUMNS</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHANGEDCOLUMNS
   * @model literal="CHANGED_COLUMNS"
   * @generated
   * @ordered
   */
  public static final int CHANGEDCOLUMNS_VALUE = 1;

  /**
   * The '<em><b>SELECTEDCOLUMNS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SELECTEDCOLUMNS</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SELECTEDCOLUMNS
   * @model literal="SELECTED_COLUMNS"
   * @generated
   * @ordered
   */
  public static final int SELECTEDCOLUMNS_VALUE = 2;

  /**
   * The '<em><b>VERSIONCOLUMN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VERSIONCOLUMN</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERSIONCOLUMN
   * @model literal="VERSION_COLUMN"
   * @generated
   * @ordered
   */
  public static final int VERSIONCOLUMN_VALUE = 3;

  /**
   * An array of all the '<em><b>Optimistic Locking Type</b></em>' enumerators.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  private static final OptimisticLockingType[] VALUES_ARRAY = new OptimisticLockingType[] {
      ALLCOLUMNS,
      CHANGEDCOLUMNS,
      SELECTEDCOLUMNS,
      VERSIONCOLUMN,
    };

  /**
   * A public read-only list of all the '<em><b>Optimistic Locking Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OptimisticLockingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Optimistic Locking Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   */
  public static OptimisticLockingType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      OptimisticLockingType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Optimistic Locking Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static OptimisticLockingType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      OptimisticLockingType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Optimistic Locking Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   */
  public static OptimisticLockingType get(int value) {
    switch (value) {
      case ALLCOLUMNS_VALUE: return ALLCOLUMNS;
      case CHANGEDCOLUMNS_VALUE: return CHANGEDCOLUMNS;
      case SELECTEDCOLUMNS_VALUE: return SELECTEDCOLUMNS;
      case VERSIONCOLUMN_VALUE: return VERSIONCOLUMN;
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
  private OptimisticLockingType(int value, String name, String literal) {
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

} // OptimisticLockingType
