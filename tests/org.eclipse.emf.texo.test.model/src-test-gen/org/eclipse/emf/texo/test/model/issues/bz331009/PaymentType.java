package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>PaymentType</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum PaymentType {

  /**
   * The enum: REQUIRED <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Требуемый платеж <!--
   * end-model-doc -->
   * 
   * @generated
   */
  REQUIRED(0, "required", "required") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isRequired() {
      return true;
    }
  },
  /**
   * The enum: FACT <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Фактически совершенный платеж
   * <!-- end-model-doc -->
   * 
   * @generated
   */
  FACT(1, "fact", "fact") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isFact() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>PaymentType</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final PaymentType[] VALUES_ARRAY = new PaymentType[] { REQUIRED, FACT };

  /**
   * A public read-only list of all the '<em><b>PaymentType</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<PaymentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>PaymentType</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the PaymentType, the literal enum class
   * @generated
   */
  public static PaymentType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      PaymentType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>PaymentType</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the PaymentType, the literal enum class
   * @generated
   */
  public static PaymentType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      PaymentType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>PaymentType</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the PaymentType, the literal enum
   * @generated
   */
  public static PaymentType get(int value) {
    for (PaymentType enumInstance : VALUES_ARRAY) {
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
  private PaymentType(int value, String name, String literal) {
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
  public boolean isRequired() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isFact() {
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
