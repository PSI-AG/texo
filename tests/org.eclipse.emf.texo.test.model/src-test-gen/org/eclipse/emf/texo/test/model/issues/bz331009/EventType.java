package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>EventType</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc --> <!-- begin-model-doc --> Тип события <!-- end-model-doc -->
 * 
 * @generated
 */
public enum EventType {

  /**
   * The enum: COORDINATES <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Сообщение с
   * координатами <!-- end-model-doc -->
   * 
   * @generated
   */
  COORDINATES(0, "coordinates", "coordinates") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isCoordinates() {
      return true;
    }
  },
  /**
   * The enum: SENSOR <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Сообщение о сработке
   * датчика <!-- end-model-doc -->
   * 
   * @generated
   */
  SENSOR(1, "sensor", "sensor") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isSensor() {
      return true;
    }
  },
  /**
   * The enum: ALARM <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Сообщение о нажатии
   * тревожной кнопки <!-- end-model-doc -->
   * 
   * @generated
   */
  ALARM(2, "alarm", "alarm") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isAlarm() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>EventType</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final EventType[] VALUES_ARRAY = new EventType[] { COORDINATES, SENSOR, ALARM };

  /**
   * A public read-only list of all the '<em><b>EventType</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<EventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>EventType</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the EventType, the literal enum class
   * @generated
   */
  public static EventType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      EventType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>EventType</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the EventType, the literal enum class
   * @generated
   */
  public static EventType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      EventType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>EventType</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the EventType, the literal enum
   * @generated
   */
  public static EventType get(int value) {
    for (EventType enumInstance : VALUES_ARRAY) {
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
  private EventType(int value, String name, String literal) {
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
  public boolean isCoordinates() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isSensor() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isAlarm() {
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
