package org.eclipse.modisco.kdm.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>StorableKind</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum StorableKind {

  /**
   * The enum: GLOBAL <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  GLOBAL(0, "global", "global") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isGlobal() {
      return true;
    }
  },
  /**
   * The enum: LOCAL <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  LOCAL(1, "local", "local") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isLocal() {
      return true;
    }
  },
  /**
   * The enum: STATIC <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  STATIC(2, "static", "static") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isStatic() {
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
   * The enum: REGISTER <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  REGISTER(4, "register", "register") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isRegister() {
      return true;
    }
  },
  /**
   * The enum: UNKNOWN <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  UNKNOWN(5, "unknown", "unknown") {

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
   * An array of all the '<em><b>StorableKind</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final StorableKind[] VALUES_ARRAY = new StorableKind[] { GLOBAL, LOCAL, STATIC, EXTERNAL, REGISTER,
      UNKNOWN };

  /**
   * A public read-only list of all the '<em><b>StorableKind</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<StorableKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>StorableKind</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the StorableKind, the literal enum class
   * @generated
   */
  public static StorableKind get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      StorableKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>StorableKind</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the StorableKind, the literal enum class
   * @generated
   */
  public static StorableKind getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      StorableKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>StorableKind</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the StorableKind, the literal enum
   * @generated
   */
  public static StorableKind get(int value) {
    for (StorableKind enumInstance : VALUES_ARRAY) {
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
  private StorableKind(int value, String name, String literal) {
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
  public boolean isGlobal() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isLocal() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isStatic() {
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
  public boolean isRegister() {
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
