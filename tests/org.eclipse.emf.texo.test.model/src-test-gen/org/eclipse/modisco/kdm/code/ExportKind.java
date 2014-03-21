package org.eclipse.modisco.kdm.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>ExportKind</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum ExportKind {

  /**
   * The enum: PUBLIC <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  PUBLIC(0, "public", "public") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isPublic() {
      return true;
    }
  },
  /**
   * The enum: PRIVATE <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  PRIVATE(1, "private", "private") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isPrivate() {
      return true;
    }
  },
  /**
   * The enum: PROTECTED <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  PROTECTED(2, "protected", "protected") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isProtected() {
      return true;
    }
  },
  /**
   * The enum: FINAL <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  FINAL(3, "final", "final") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isFinal() {
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
   * An array of all the '<em><b>ExportKind</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final ExportKind[] VALUES_ARRAY = new ExportKind[] { PUBLIC, PRIVATE, PROTECTED, FINAL, UNKNOWN };

  /**
   * A public read-only list of all the '<em><b>ExportKind</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<ExportKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>ExportKind</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the ExportKind, the literal enum class
   * @generated
   */
  public static ExportKind get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ExportKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>ExportKind</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the ExportKind, the literal enum class
   * @generated
   */
  public static ExportKind getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ExportKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>ExportKind</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the ExportKind, the literal enum
   * @generated
   */
  public static ExportKind get(int value) {
    for (ExportKind enumInstance : VALUES_ARRAY) {
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
  private ExportKind(int value, String name, String literal) {
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
  public boolean isPublic() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isPrivate() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isProtected() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isFinal() {
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
