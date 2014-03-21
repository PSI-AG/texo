package org.eclipse.graphiti.mm.algorithms.styles;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>LineStyle</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum LineStyle {

  /**
   * The enum: SOLID <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  SOLID(0, "SOLID", "SOLID") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isSOLID() {
      return true;
    }
  },
  /**
   * The enum: DASH <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  DASH(1, "DASH", "DASH") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isDASH() {
      return true;
    }
  },
  /**
   * The enum: DASHDOT <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  DASHDOT(2, "DASHDOT", "DASHDOT") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isDASHDOT() {
      return true;
    }
  },
  /**
   * The enum: DASHDOTDOT <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  DASHDOTDOT(3, "DASHDOTDOT", "DASHDOTDOT") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isDASHDOTDOT() {
      return true;
    }
  },
  /**
   * The enum: DOT <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  DOT(4, "DOT", "DOT") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isDOT() {
      return true;
    }
  },
  /**
   * The enum: UNSPECIFIED <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  UNSPECIFIED(5, "UNSPECIFIED", "UNSPECIFIED") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isUNSPECIFIED() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>LineStyle</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final LineStyle[] VALUES_ARRAY = new LineStyle[] { SOLID, DASH, DASHDOT, DASHDOTDOT, DOT, UNSPECIFIED };

  /**
   * A public read-only list of all the '<em><b>LineStyle</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<LineStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>LineStyle</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the LineStyle, the literal enum class
   * @generated
   */
  public static LineStyle get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      LineStyle result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>LineStyle</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the LineStyle, the literal enum class
   * @generated
   */
  public static LineStyle getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      LineStyle result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>LineStyle</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the LineStyle, the literal enum
   * @generated
   */
  public static LineStyle get(int value) {
    for (LineStyle enumInstance : VALUES_ARRAY) {
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
  private LineStyle(int value, String name, String literal) {
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
  public boolean isSOLID() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isDASH() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isDASHDOT() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isDASHDOTDOT() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isDOT() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isUNSPECIFIED() {
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
