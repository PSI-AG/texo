/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrderColumnCorrectionType.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Order Column Correction Type</b></em>', and utility methods for working with them. <!-- end-user-doc --> <!--
 * begin-model-doc -->
 * 
 * 
 * public enum OrderCorrectionType { READ, READ_WRITE, EXCEPTION }
 * 
 * 
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOrderColumnCorrectionType()
 * @model extendedMetaData="name='order-column-correction-type'"
 * @generated
 */
public enum OrderColumnCorrectionType implements Enumerator {
  /**
   * The '<em><b>READ</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #READ_VALUE
   * @generated
   * @ordered
   */
  READ(0, "READ", "READ"),

  /**
   * The '<em><b>READWRITE</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #READWRITE_VALUE
   * @generated
   * @ordered
   */
  READWRITE(1, "READWRITE", "READ_WRITE"),

  /**
   * The '<em><b>EXCEPTION</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #EXCEPTION_VALUE
   * @generated
   * @ordered
   */
  EXCEPTION(2, "EXCEPTION", "EXCEPTION");

  /**
   * The '<em><b>READ</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>READ</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #READ
   * @model
   * @generated
   * @ordered
   */
  public static final int READ_VALUE = 0;

  /**
   * The '<em><b>READWRITE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>READWRITE</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #READWRITE
   * @model literal="READ_WRITE"
   * @generated
   * @ordered
   */
  public static final int READWRITE_VALUE = 1;

  /**
   * The '<em><b>EXCEPTION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EXCEPTION</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EXCEPTION
   * @model
   * @generated
   * @ordered
   */
  public static final int EXCEPTION_VALUE = 2;

  /**
   * An array of all the '<em><b>Order Column Correction Type</b></em>' enumerators.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  private static final OrderColumnCorrectionType[] VALUES_ARRAY = new OrderColumnCorrectionType[] {
      READ,
      READWRITE,
      EXCEPTION,
    };

  /**
   * A public read-only list of all the '<em><b>Order Column Correction Type</b></em>' enumerators.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   */
  public static final List<OrderColumnCorrectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Order Column Correction Type</b></em>' literal with the specified literal value. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static OrderColumnCorrectionType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      OrderColumnCorrectionType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Order Column Correction Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OrderColumnCorrectionType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      OrderColumnCorrectionType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Order Column Correction Type</b></em>' literal with the specified integer value. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static OrderColumnCorrectionType get(int value) {
    switch (value) {
      case READ_VALUE: return READ;
      case READWRITE_VALUE: return READWRITE;
      case EXCEPTION_VALUE: return EXCEPTION;
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
  private OrderColumnCorrectionType(int value, String name, String literal) {
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

} // OrderColumnCorrectionType
