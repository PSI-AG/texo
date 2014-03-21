package org.eclipse.emf.texo.test.model.issues.bz379796;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>ComparisonType</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum ComparisonType {

  /**
   * The enum: LESS <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  LESS(0, "less", "less") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isLess() {
      return true;
    }
  },
  /**
   * The enum: LESSOREQUAL <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  LESSOREQUAL(1, "lessOrEqual", "less-or-equal") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isLessOrEqual() {
      return true;
    }
  },
  /**
   * The enum: EQUAL <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  EQUAL(2, "equal", "equal") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isEqual() {
      return true;
    }
  },
  /**
   * The enum: GREATEROREQUAL <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  GREATEROREQUAL(3, "greaterOrEqual", "greater-or-equal") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isGreaterOrEqual() {
      return true;
    }
  },
  /**
   * The enum: GREATER <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  GREATER(4, "greater", "greater") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isGreater() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>ComparisonType</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final ComparisonType[] VALUES_ARRAY = new ComparisonType[] { LESS, LESSOREQUAL, EQUAL, GREATEROREQUAL,
      GREATER };

  /**
   * A public read-only list of all the '<em><b>ComparisonType</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<ComparisonType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>ComparisonType</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the ComparisonType, the literal enum class
   * @generated
   */
  public static ComparisonType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ComparisonType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>ComparisonType</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the ComparisonType, the literal enum class
   * @generated
   */
  public static ComparisonType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ComparisonType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>ComparisonType</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the ComparisonType, the literal enum
   * @generated
   */
  public static ComparisonType get(int value) {
    for (ComparisonType enumInstance : VALUES_ARRAY) {
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
  private ComparisonType(int value, String name, String literal) {
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
  public boolean isLess() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isLessOrEqual() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isEqual() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isGreaterOrEqual() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isGreater() {
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
