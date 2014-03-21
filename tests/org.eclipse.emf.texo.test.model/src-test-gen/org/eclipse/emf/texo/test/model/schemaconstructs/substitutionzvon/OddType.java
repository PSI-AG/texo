package org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>OddType</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum OddType {

  /**
   * The enum: _1 <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  _1(0, "_1", "1") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean is_1() {
      return true;
    }
  },
  /**
   * The enum: _3 <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  _3(1, "_3", "3") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean is_3() {
      return true;
    }
  },
  /**
   * The enum: _5 <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  _5(2, "_5", "5") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean is_5() {
      return true;
    }
  },
  /**
   * The enum: _7 <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  _7(3, "_7", "7") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean is_7() {
      return true;
    }
  },
  /**
   * The enum: _9 <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  _9(4, "_9", "9") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean is_9() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>OddType</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final OddType[] VALUES_ARRAY = new OddType[] { _1, _3, _5, _7, _9 };

  /**
   * A public read-only list of all the '<em><b>OddType</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  public static final List<OddType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>OddType</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the OddType, the literal enum class
   * @generated
   */
  public static OddType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      OddType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>OddType</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the OddType, the literal enum class
   * @generated
   */
  public static OddType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      OddType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>OddType</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the OddType, the literal enum
   * @generated
   */
  public static OddType get(int value) {
    for (OddType enumInstance : VALUES_ARRAY) {
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
  private OddType(int value, String name, String literal) {
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
  public boolean is_1() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean is_3() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean is_5() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean is_7() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean is_9() {
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
