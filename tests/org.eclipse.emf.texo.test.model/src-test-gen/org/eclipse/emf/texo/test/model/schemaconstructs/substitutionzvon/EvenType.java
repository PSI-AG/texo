package org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>EvenType</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum EvenType {

  /**
   * The enum: _2 <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  _2(0, "_2", "2") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean is_2() {
      return true;
    }
  },
  /**
   * The enum: _4 <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  _4(1, "_4", "4") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean is_4() {
      return true;
    }
  },
  /**
   * The enum: _6 <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  _6(2, "_6", "6") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean is_6() {
      return true;
    }
  },
  /**
   * The enum: _8 <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  _8(3, "_8", "8") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean is_8() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>EvenType</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final EvenType[] VALUES_ARRAY = new EvenType[] { _2, _4, _6, _8 };

  /**
   * A public read-only list of all the '<em><b>EvenType</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<EvenType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>EvenType</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the EvenType, the literal enum class
   * @generated
   */
  public static EvenType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      EvenType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>EvenType</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the EvenType, the literal enum class
   * @generated
   */
  public static EvenType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      EvenType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>EvenType</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the EvenType, the literal enum
   * @generated
   */
  public static EvenType get(int value) {
    for (EvenType enumInstance : VALUES_ARRAY) {
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
  private EvenType(int value, String name, String literal) {
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
  public boolean is_2() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean is_4() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean is_6() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean is_8() {
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
