package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>Periodicity</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum Periodicity {

  /**
   * The enum: DAILY <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Ежедневно <!-- end-model-doc
   * -->
   * 
   * @generated
   */
  DAILY(0, "daily", "daily") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isDaily() {
      return true;
    }
  },
  /**
   * The enum: WEAKLY <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Еженедельно <!--
   * end-model-doc -->
   * 
   * @generated
   */
  WEAKLY(1, "weakly", "weakly") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isWeakly() {
      return true;
    }
  },
  /**
   * The enum: MONTHLY <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Ежемесячно <!--
   * end-model-doc -->
   * 
   * @generated
   */
  MONTHLY(2, "monthly", "monthly") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isMonthly() {
      return true;
    }
  },
  /**
   * The enum: ANNUAL <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Ежегодно <!-- end-model-doc
   * -->
   * 
   * @generated
   */
  ANNUAL(3, "annual", "annual") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isAnnual() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>Periodicity</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final Periodicity[] VALUES_ARRAY = new Periodicity[] { DAILY, WEAKLY, MONTHLY, ANNUAL };

  /**
   * A public read-only list of all the '<em><b>Periodicity</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<Periodicity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Periodicity</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the Periodicity, the literal enum class
   * @generated
   */
  public static Periodicity get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Periodicity result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Periodicity</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the Periodicity, the literal enum class
   * @generated
   */
  public static Periodicity getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Periodicity result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Periodicity</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the Periodicity, the literal enum
   * @generated
   */
  public static Periodicity get(int value) {
    for (Periodicity enumInstance : VALUES_ARRAY) {
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
  private Periodicity(int value, String name, String literal) {
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
  public boolean isDaily() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isWeakly() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isMonthly() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isAnnual() {
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
