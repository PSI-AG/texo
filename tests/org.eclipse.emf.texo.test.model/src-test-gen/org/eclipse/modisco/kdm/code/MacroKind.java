package org.eclipse.modisco.kdm.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>MacroKind</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum MacroKind {

  /**
   * The enum: REGULAR <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  REGULAR(0, "regular", "regular") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isRegular() {
      return true;
    }
  },
  /**
   * The enum: OPTION <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  OPTION(1, "option", "option") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isOption() {
      return true;
    }
  },
  /**
   * The enum: UNDEFINED <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  UNDEFINED(2, "undefined", "undefined") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isUndefined() {
      return true;
    }
  },
  /**
   * The enum: EXTERNAL <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  EXTERNAL(3, "external", "external") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isExternal() {
      return true;
    }
  },
  /**
   * The enum: UNKNOWN <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  UNKNOWN(4, "unknown", "unknown") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isUnknown() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>MacroKind</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final MacroKind[] VALUES_ARRAY = new MacroKind[] { REGULAR, OPTION, UNDEFINED, EXTERNAL, UNKNOWN };

  /**
   * A public read-only list of all the '<em><b>MacroKind</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<MacroKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>MacroKind</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the MacroKind, the literal enum class
   * @generated
   */
  public static MacroKind get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      MacroKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>MacroKind</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the MacroKind, the literal enum class
   * @generated
   */
  public static MacroKind getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      MacroKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>MacroKind</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the MacroKind, the literal enum
   * @generated
   */
  public static MacroKind get(int value) {
    for (MacroKind enumInstance : VALUES_ARRAY) {
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
  private MacroKind(int value, String name, String literal) {
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
  public boolean isRegular() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isOption() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isUndefined() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isExternal() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isUnknown() {
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
