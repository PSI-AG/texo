package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>MessageType</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc --> <!-- begin-model-doc --> Тип сообщения <!-- end-model-doc -->
 * 
 * @generated
 */
public enum MessageType {

  /**
   * The enum: SERVICE <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Служебное <!--
   * end-model-doc -->
   * 
   * @generated
   */
  SERVICE(0, "service", "service") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isService() {
      return true;
    }
  },
  /**
   * The enum: EVENT <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Событийное <!--
   * end-model-doc -->
   * 
   * @generated
   */
  EVENT(1, "event", "event") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isEvent() {
      return true;
    }
  },
  /**
   * The enum: COMMAND <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Командное <!--
   * end-model-doc -->
   * 
   * @generated
   */
  COMMAND(2, "command", "command") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isCommand() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>MessageType</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final MessageType[] VALUES_ARRAY = new MessageType[] { SERVICE, EVENT, COMMAND };

  /**
   * A public read-only list of all the '<em><b>MessageType</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<MessageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>MessageType</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the MessageType, the literal enum class
   * @generated
   */
  public static MessageType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      MessageType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>MessageType</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the MessageType, the literal enum class
   * @generated
   */
  public static MessageType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      MessageType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>MessageType</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the MessageType, the literal enum
   * @generated
   */
  public static MessageType get(int value) {
    for (MessageType enumInstance : VALUES_ARRAY) {
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
  private MessageType(int value, String name, String literal) {
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
  public boolean isService() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isEvent() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isCommand() {
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
