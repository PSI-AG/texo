package org.eclipse.graphiti.mm.algorithms.styles;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>UnderlineStyle</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum UnderlineStyle {

  /**
   * The enum: UNDERLINE_SINGLE <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  UNDERLINE_SINGLE(0, "UNDERLINE_SINGLE", "UNDERLINE_SINGLE") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isUNDERLINE_SINGLE() {
      return true;
    }
  },
  /**
   * The enum: UNDERLINE_DOUBLE <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  UNDERLINE_DOUBLE(1, "UNDERLINE_DOUBLE", "UNDERLINE_DOUBLE") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isUNDERLINE_DOUBLE() {
      return true;
    }
  },
  /**
   * The enum: UNDERLINE_ERROR <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  UNDERLINE_ERROR(2, "UNDERLINE_ERROR", "UNDERLINE_ERROR") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isUNDERLINE_ERROR() {
      return true;
    }
  },
  /**
   * The enum: UNDERLINE_SQUIGGLE <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  UNDERLINE_SQUIGGLE(3, "UNDERLINE_SQUIGGLE", "UNDERLINE_SQUIGGLE") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isUNDERLINE_SQUIGGLE() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>UnderlineStyle</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final UnderlineStyle[] VALUES_ARRAY = new UnderlineStyle[] { UNDERLINE_SINGLE, UNDERLINE_DOUBLE,
      UNDERLINE_ERROR, UNDERLINE_SQUIGGLE };

  /**
   * A public read-only list of all the '<em><b>UnderlineStyle</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<UnderlineStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>UnderlineStyle</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the UnderlineStyle, the literal enum class
   * @generated
   */
  public static UnderlineStyle get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      UnderlineStyle result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>UnderlineStyle</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the UnderlineStyle, the literal enum class
   * @generated
   */
  public static UnderlineStyle getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      UnderlineStyle result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>UnderlineStyle</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the UnderlineStyle, the literal enum
   * @generated
   */
  public static UnderlineStyle get(int value) {
    for (UnderlineStyle enumInstance : VALUES_ARRAY) {
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
  private UnderlineStyle(int value, String name, String literal) {
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
  public boolean isUNDERLINE_SINGLE() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isUNDERLINE_DOUBLE() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isUNDERLINE_ERROR() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isUNDERLINE_SQUIGGLE() {
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
