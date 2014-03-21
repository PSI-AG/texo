package org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>SimpleEnum</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum SimpleEnum {

  /**
   * The enum: ENUM1 <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  ENUM1(0, "Enum1", "Enum1") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isEnum1() {
      return true;
    }
  },
  /**
   * The enum: ENUM2 <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  ENUM2(1, "Enum2", "Enum2") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isEnum2() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>SimpleEnum</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final SimpleEnum[] VALUES_ARRAY = new SimpleEnum[] { ENUM1, ENUM2 };

  /**
   * A public read-only list of all the '<em><b>SimpleEnum</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<SimpleEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>SimpleEnum</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the SimpleEnum, the literal enum class
   * @generated
   */
  public static SimpleEnum get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      SimpleEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>SimpleEnum</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the SimpleEnum, the literal enum class
   * @generated
   */
  public static SimpleEnum getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      SimpleEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>SimpleEnum</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the SimpleEnum, the literal enum
   * @generated
   */
  public static SimpleEnum get(int value) {
    for (SimpleEnum enumInstance : VALUES_ARRAY) {
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
  private SimpleEnum(int value, String name, String literal) {
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
  public boolean isEnum1() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isEnum2() {
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
