package org.eclipse.modisco.kdm.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>MethodKind</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum MethodKind {

  /**
   * The enum: METHOD <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  METHOD(0, "method", "method") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isMethod() {
      return true;
    }
  },
  /**
   * The enum: CONSTRUCTOR <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  CONSTRUCTOR(1, "constructor", "constructor") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isConstructor() {
      return true;
    }
  },
  /**
   * The enum: DESTRUCTOR <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  DESTRUCTOR(2, "destructor", "destructor") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isDestructor() {
      return true;
    }
  },
  /**
   * The enum: OPERATOR <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  OPERATOR(3, "operator", "operator") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isOperator() {
      return true;
    }
  },
  /**
   * The enum: VIRTUAL <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  VIRTUAL(4, "virtual", "virtual") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isVirtual() {
      return true;
    }
  },
  /**
   * The enum: ABSTRACT <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  ABSTRACT(5, "abstract", "abstract") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isAbstract() {
      return true;
    }
  },
  /**
   * The enum: UNKNOWN <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  UNKNOWN(6, "unknown", "unknown") {

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
   * An array of all the '<em><b>MethodKind</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final MethodKind[] VALUES_ARRAY = new MethodKind[] { METHOD, CONSTRUCTOR, DESTRUCTOR, OPERATOR,
      VIRTUAL, ABSTRACT, UNKNOWN };

  /**
   * A public read-only list of all the '<em><b>MethodKind</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<MethodKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>MethodKind</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the MethodKind, the literal enum class
   * @generated
   */
  public static MethodKind get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      MethodKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>MethodKind</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the MethodKind, the literal enum class
   * @generated
   */
  public static MethodKind getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      MethodKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>MethodKind</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the MethodKind, the literal enum
   * @generated
   */
  public static MethodKind get(int value) {
    for (MethodKind enumInstance : VALUES_ARRAY) {
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
  private MethodKind(int value, String name, String literal) {
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
  public boolean isMethod() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isConstructor() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isDestructor() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isOperator() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isVirtual() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isAbstract() {
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
