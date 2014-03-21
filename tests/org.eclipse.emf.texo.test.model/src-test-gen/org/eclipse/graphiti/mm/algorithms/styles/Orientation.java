package org.eclipse.graphiti.mm.algorithms.styles;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>Orientation</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum Orientation {

  /**
   * The enum: ALIGNMENT_CENTER <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  ALIGNMENT_CENTER(0, "ALIGNMENT_CENTER", "ALIGNMENT_CENTER") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isALIGNMENT_CENTER() {
      return true;
    }
  },
  /**
   * The enum: ALIGNMENT_LEFT <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  ALIGNMENT_LEFT(1, "ALIGNMENT_LEFT", "ALIGNMENT_LEFT") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isALIGNMENT_LEFT() {
      return true;
    }
  },
  /**
   * The enum: ALIGNMENT_TOP <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  ALIGNMENT_TOP(2, "ALIGNMENT_TOP", "ALIGNMENT_TOP") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isALIGNMENT_TOP() {
      return true;
    }
  },
  /**
   * The enum: ALIGNMENT_RIGHT <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  ALIGNMENT_RIGHT(3, "ALIGNMENT_RIGHT", "ALIGNMENT_RIGHT") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isALIGNMENT_RIGHT() {
      return true;
    }
  },
  /**
   * The enum: ALIGNMENT_BOTTOM <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  ALIGNMENT_BOTTOM(4, "ALIGNMENT_BOTTOM", "ALIGNMENT_BOTTOM") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isALIGNMENT_BOTTOM() {
      return true;
    }
  },
  /**
   * The enum: ALIGNMENT_MIDDLE <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  ALIGNMENT_MIDDLE(5, "ALIGNMENT_MIDDLE", "ALIGNMENT_MIDDLE") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isALIGNMENT_MIDDLE() {
      return true;
    }
  },
  /**
   * The enum: UNSPECIFIED <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  UNSPECIFIED(6, "UNSPECIFIED", "UNSPECIFIED") {

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
   * An array of all the '<em><b>Orientation</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final Orientation[] VALUES_ARRAY = new Orientation[] { ALIGNMENT_CENTER, ALIGNMENT_LEFT,
      ALIGNMENT_TOP, ALIGNMENT_RIGHT, ALIGNMENT_BOTTOM, ALIGNMENT_MIDDLE, UNSPECIFIED };

  /**
   * A public read-only list of all the '<em><b>Orientation</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<Orientation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Orientation</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the Orientation, the literal enum class
   * @generated
   */
  public static Orientation get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Orientation result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Orientation</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the Orientation, the literal enum class
   * @generated
   */
  public static Orientation getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Orientation result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Orientation</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the Orientation, the literal enum
   * @generated
   */
  public static Orientation get(int value) {
    for (Orientation enumInstance : VALUES_ARRAY) {
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
  private Orientation(int value, String name, String literal) {
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
  public boolean isALIGNMENT_CENTER() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isALIGNMENT_LEFT() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isALIGNMENT_TOP() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isALIGNMENT_RIGHT() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isALIGNMENT_BOTTOM() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isALIGNMENT_MIDDLE() {
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
