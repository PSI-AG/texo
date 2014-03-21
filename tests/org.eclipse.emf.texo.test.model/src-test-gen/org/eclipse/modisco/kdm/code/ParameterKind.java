package org.eclipse.modisco.kdm.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>ParameterKind</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum ParameterKind {

  /**
   * The enum: BYVALUE <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  BYVALUE(0, "byValue", "byValue") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isByValue() {
      return true;
    }
  },
  /**
   * The enum: BYNAME <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  BYNAME(1, "byName", "byName") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isByName() {
      return true;
    }
  },
  /**
   * The enum: BYREFERENCE <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  BYREFERENCE(2, "byReference", "byReference") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isByReference() {
      return true;
    }
  },
  /**
   * The enum: VARIADIC <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  VARIADIC(3, "variadic", "variadic") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isVariadic() {
      return true;
    }
  },
  /**
   * The enum: RETURN <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  RETURN(4, "return", "return") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isReturn() {
      return true;
    }
  },
  /**
   * The enum: THROWS <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  THROWS(5, "throws", "throws") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isThrows() {
      return true;
    }
  },
  /**
   * The enum: EXCEPTION <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  EXCEPTION(6, "exception", "exception") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isException() {
      return true;
    }
  },
  /**
   * The enum: CATCHALL <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  CATCHALL(7, "catchall", "catchall") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isCatchall() {
      return true;
    }
  },
  /**
   * The enum: UNKNOWN <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  UNKNOWN(8, "unknown", "unknown") {

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
   * An array of all the '<em><b>ParameterKind</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final ParameterKind[] VALUES_ARRAY = new ParameterKind[] { BYVALUE, BYNAME, BYREFERENCE, VARIADIC,
      RETURN, THROWS, EXCEPTION, CATCHALL, UNKNOWN };

  /**
   * A public read-only list of all the '<em><b>ParameterKind</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<ParameterKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>ParameterKind</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the ParameterKind, the literal enum class
   * @generated
   */
  public static ParameterKind get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ParameterKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>ParameterKind</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the ParameterKind, the literal enum class
   * @generated
   */
  public static ParameterKind getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ParameterKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>ParameterKind</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the ParameterKind, the literal enum
   * @generated
   */
  public static ParameterKind get(int value) {
    for (ParameterKind enumInstance : VALUES_ARRAY) {
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
  private ParameterKind(int value, String name, String literal) {
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
  public boolean isByValue() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isByName() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isByReference() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isVariadic() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isReturn() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isThrows() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isException() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isCatchall() {
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
