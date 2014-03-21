package org.eclipse.emf.texo.test.model.samples.rental;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>RentalCarSize</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum RentalCarSize {

  /**
   * The enum: SMALL <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  SMALL(0, "Small", "Small") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isSmall() {
      return true;
    }
  },
  /**
   * The enum: MEDIUM <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  MEDIUM(1, "Medium", "Medium") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isMedium() {
      return true;
    }
  },
  /**
   * The enum: FAMILY <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  FAMILY(2, "Family", "Family") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isFamily() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>RentalCarSize</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final RentalCarSize[] VALUES_ARRAY = new RentalCarSize[] { SMALL, MEDIUM, FAMILY };

  /**
   * A public read-only list of all the '<em><b>RentalCarSize</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<RentalCarSize> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>RentalCarSize</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the RentalCarSize, the literal enum class
   * @generated
   */
  public static RentalCarSize get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      RentalCarSize result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>RentalCarSize</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the RentalCarSize, the literal enum class
   * @generated
   */
  public static RentalCarSize getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      RentalCarSize result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>RentalCarSize</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the RentalCarSize, the literal enum
   * @generated
   */
  public static RentalCarSize get(int value) {
    for (RentalCarSize enumInstance : VALUES_ARRAY) {
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
  private RentalCarSize(int value, String name, String literal) {
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
  public boolean isSmall() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isMedium() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isFamily() {
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
