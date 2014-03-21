package org.eclipse.emf.texo.test.model.issues.bz379815;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>TypeType</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum TypeType {

  /**
   * The enum: EROSION <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  EROSION(0, "erosion", "erosion") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isErosion() {
      return true;
    }
  },
  /**
   * The enum: CHARGE <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  CHARGE(1, "charge", "charge") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isCharge() {
      return true;
    }
  },
  /**
   * The enum: CREDIT <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  CREDIT(2, "credit", "credit") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isCredit() {
      return true;
    }
  },
  /**
   * The enum: CREDITING <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  CREDITING(3, "crediting", "crediting") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isCrediting() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>TypeType</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final TypeType[] VALUES_ARRAY = new TypeType[] { EROSION, CHARGE, CREDIT, CREDITING };

  /**
   * A public read-only list of all the '<em><b>TypeType</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<TypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>TypeType</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the TypeType, the literal enum class
   * @generated
   */
  public static TypeType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TypeType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TypeType</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the TypeType, the literal enum class
   * @generated
   */
  public static TypeType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TypeType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TypeType</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the TypeType, the literal enum
   * @generated
   */
  public static TypeType get(int value) {
    for (TypeType enumInstance : VALUES_ARRAY) {
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
  private TypeType(int value, String name, String literal) {
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
  public boolean isErosion() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isCharge() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isCredit() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isCrediting() {
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
