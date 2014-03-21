package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>Currency</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc --> <!-- begin-model-doc --> Виды валют <!-- end-model-doc -->
 * 
 * @generated
 */
public enum Currency {

  /**
   * The enum: ROUBLES <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Рубли <!-- end-model-doc
   * -->
   * 
   * @generated
   */
  ROUBLES(0, "roubles", "roubles") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isRoubles() {
      return true;
    }
  },
  /**
   * The enum: EUROS <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Евро <!-- end-model-doc -->
   * 
   * @generated
   */
  EUROS(1, "euros", "euros") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isEuros() {
      return true;
    }
  },
  /**
   * The enum: DOLLARS <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Доллары США <!--
   * end-model-doc -->
   * 
   * @generated
   */
  DOLLARS(2, "dollars", "dollars") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isDollars() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>Currency</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final Currency[] VALUES_ARRAY = new Currency[] { ROUBLES, EUROS, DOLLARS };

  /**
   * A public read-only list of all the '<em><b>Currency</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<Currency> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Currency</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the Currency, the literal enum class
   * @generated
   */
  public static Currency get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Currency result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Currency</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the Currency, the literal enum class
   * @generated
   */
  public static Currency getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Currency result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Currency</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the Currency, the literal enum
   * @generated
   */
  public static Currency get(int value) {
    for (Currency enumInstance : VALUES_ARRAY) {
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
  private Currency(int value, String name, String literal) {
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
  public boolean isRoubles() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isEuros() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isDollars() {
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
