/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdValidation.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Id Validation</b></em>', and
 * utility methods for working with them. <!-- end-user-doc --> <!-- begin-model-doc -->
 * 
 * 
 * * * The IdValidation enum determines the type value that are valid for an Id. * By default null is not allowed, and 0
 * is not allow for singleton ids of long or int type. * The default value is ZERO for singleton ids, and NULL for
 * composite ids. * This can be set using the @PrimaryKey annotation, or ClassDescriptor API. * * @see PrimaryKey * @see
 * org.eclipse.persistence.descriptors.ClassDescriptor#setIdValidation(IdValidation) * @author James Sutherland * @since
 * EclipseLink 1.0 * public enum IdValidation { * * Only null is not allowed as an id value, 0 is allowed. * NULL,
 * 
 * * * null and 0 are not allowed, (only int and long). * ZERO,
 * 
 * * * No id validation is done. * NONE }
 * 
 * 
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getIdValidation()
 * @model extendedMetaData="name='id-validation'"
 * @generated
 */
public enum IdValidation implements Enumerator {
  /**
   * The '<em><b>NULL</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #NULL_VALUE
   * @generated
   * @ordered
   */
  NULL(0, "NULL", "NULL"),

  /**
   * The '<em><b>ZERO</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #ZERO_VALUE
   * @generated
   * @ordered
   */
  ZERO(1, "ZERO", "ZERO"),

  /**
   * The '<em><b>NONE</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #NONE_VALUE
   * @generated
   * @ordered
   */
  NONE(2, "NONE", "NONE");

  /**
   * The '<em><b>NULL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NULL</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NULL
   * @model
   * @generated
   * @ordered
   */
  public static final int NULL_VALUE = 0;

  /**
   * The '<em><b>ZERO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ZERO</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ZERO
   * @model
   * @generated
   * @ordered
   */
  public static final int ZERO_VALUE = 1;

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
  public static final int NONE_VALUE = 2;

  /**
   * An array of all the '<em><b>Id Validation</b></em>' enumerators.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static final IdValidation[] VALUES_ARRAY = new IdValidation[] {
      NULL,
      ZERO,
      NONE,
    };

  /**
   * A public read-only list of all the '<em><b>Id Validation</b></em>' enumerators.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static final List<IdValidation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Id Validation</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static IdValidation get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      IdValidation result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Id Validation</b></em>' literal with the specified name.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static IdValidation getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      IdValidation result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Id Validation</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static IdValidation get(int value) {
    switch (value) {
      case NULL_VALUE: return NULL;
      case ZERO_VALUE: return ZERO;
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
  private IdValidation(int value, String name, String literal) {
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

} // IdValidation
