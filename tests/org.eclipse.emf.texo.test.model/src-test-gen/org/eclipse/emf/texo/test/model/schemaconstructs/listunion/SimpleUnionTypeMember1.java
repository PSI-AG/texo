package org.eclipse.emf.texo.test.model.schemaconstructs.listunion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>SimpleUnionTypeMember1</b></em>'. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public enum SimpleUnionTypeMember1 {

  /**
   * The enum: NA <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  NA(0, "NA", "N/A") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isNA() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>SimpleUnionTypeMember1</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  private static final SimpleUnionTypeMember1[] VALUES_ARRAY = new SimpleUnionTypeMember1[] { NA };

  /**
   * A public read-only list of all the '<em><b>SimpleUnionTypeMember1</b></em>' enumerators. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final List<SimpleUnionTypeMember1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>SimpleUnionTypeMember1</b></em>' literal with the specified literal value. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the SimpleUnionTypeMember1, the literal enum class
   * @generated
   */
  public static SimpleUnionTypeMember1 get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      SimpleUnionTypeMember1 result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>SimpleUnionTypeMember1</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the SimpleUnionTypeMember1, the literal enum class
   * @generated
   */
  public static SimpleUnionTypeMember1 getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      SimpleUnionTypeMember1 result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>SimpleUnionTypeMember1</b></em>' literal with the specified integer value. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the SimpleUnionTypeMember1, the literal enum
   * @generated
   */
  public static SimpleUnionTypeMember1 get(int value) {
    for (SimpleUnionTypeMember1 enumInstance : VALUES_ARRAY) {
      if (enumInstance.getValue() == value) {
        return enumInstance;
      }
    }
    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private SimpleUnionTypeMember1(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isNA() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value
   * @generated
   */
  public int getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the name
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the literal of this enum instance
   * @generated
   */
  public String getLiteral() {
    return literal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the literal value of the enumerator, which is its string representation.
   * @generated
   */
  @Override
  public String toString() {
    return literal;
  }
}
