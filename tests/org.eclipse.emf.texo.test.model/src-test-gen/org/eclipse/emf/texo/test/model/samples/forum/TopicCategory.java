package org.eclipse.emf.texo.test.model.samples.forum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>TopicCategory</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum TopicCategory {

  /**
   * The enum: ANNOUNCEMENT <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Announcement <!--
   * end-model-doc -->
   * 
   * @generated
   */
  ANNOUNCEMENT(0, "Announcement", "Announcement") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isAnnouncement() {
      return true;
    }
  },
  /**
   * The enum: GUESTBOOK <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  GUESTBOOK(1, "GuestBook", "GuestBook") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isGuestBook() {
      return true;
    }
  },
  /**
   * The enum: DISCUSSION <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  DISCUSSION(2, "Discussion", "Discussion") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isDiscussion() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>TopicCategory</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final TopicCategory[] VALUES_ARRAY = new TopicCategory[] { ANNOUNCEMENT, GUESTBOOK, DISCUSSION };

  /**
   * A public read-only list of all the '<em><b>TopicCategory</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<TopicCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>TopicCategory</b></em>' literal with the specified literal value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the TopicCategory, the literal enum class
   * @generated
   */
  public static TopicCategory get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TopicCategory result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TopicCategory</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the TopicCategory, the literal enum class
   * @generated
   */
  public static TopicCategory getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TopicCategory result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TopicCategory</b></em>' literal with the specified integer value. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the TopicCategory, the literal enum
   * @generated
   */
  public static TopicCategory get(int value) {
    for (TopicCategory enumInstance : VALUES_ARRAY) {
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
  private TopicCategory(int value, String name, String literal) {
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
  public boolean isAnnouncement() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isGuestBook() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isDiscussion() {
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
