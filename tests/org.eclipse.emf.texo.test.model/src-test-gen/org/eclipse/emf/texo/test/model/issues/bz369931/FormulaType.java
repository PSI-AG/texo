package org.eclipse.emf.texo.test.model.issues.bz369931;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>FormulaType</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum FormulaType {

  /**
   * The enum: SIMPLE <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  SIMPLE(0, "SIMPLE", "SIMPLE") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isSIMPLE() {
      return true;
    }
  },
  /**
   * The enum: ADVANCED <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  ADVANCED(1, "ADVANCED", "ADVANCED") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isADVANCED() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>FormulaType</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final FormulaType[] VALUES_ARRAY = new FormulaType[] { SIMPLE, ADVANCED };

  /**
   * A public read-only list of all the '<em><b>FormulaType</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<FormulaType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>FormulaType</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the FormulaType, the literal enum class
   * @generated
   */
  public static FormulaType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      FormulaType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>FormulaType</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the FormulaType, the literal enum class
   * @generated
   */
  public static FormulaType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      FormulaType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>FormulaType</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the FormulaType, the literal enum
   * @generated
   */
  public static FormulaType get(int value) {
    for (FormulaType enumInstance : VALUES_ARRAY) {
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
  private FormulaType(int value, String name, String literal) {
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
  public boolean isSIMPLE() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isADVANCED() {
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
