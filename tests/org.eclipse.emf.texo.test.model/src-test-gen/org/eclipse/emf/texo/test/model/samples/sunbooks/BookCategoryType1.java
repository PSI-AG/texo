package org.eclipse.emf.texo.test.model.samples.sunbooks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>BookCategoryType1</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public enum BookCategoryType1 {

  /**
   * The enum: MAGAZINE <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  MAGAZINE(0, "magazine", "magazine") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isMagazine() {
      return true;
    }
  },
  /**
   * The enum: NOVEL <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  NOVEL(1, "novel", "novel") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isNovel() {
      return true;
    }
  },
  /**
   * The enum: FICTION <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  FICTION(2, "fiction", "fiction") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isFiction() {
      return true;
    }
  },
  /**
   * The enum: OTHER <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  OTHER(3, "other", "other") {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isOther() {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>BookCategoryType1</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final BookCategoryType1[] VALUES_ARRAY = new BookCategoryType1[] { MAGAZINE, NOVEL, FICTION, OTHER };

  /**
   * A public read-only list of all the '<em><b>BookCategoryType1</b></em>' enumerators. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static final List<BookCategoryType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>BookCategoryType1</b></em>' literal with the specified literal value. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @param literal
   *          the literal to use to get the enum instance
   * @return the BookCategoryType1, the literal enum class
   * @generated
   */
  public static BookCategoryType1 get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      BookCategoryType1 result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>BookCategoryType1</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param name
   *          the name to use to get the enum instance
   * @return the BookCategoryType1, the literal enum class
   * @generated
   */
  public static BookCategoryType1 getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      BookCategoryType1 result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>BookCategoryType1</b></em>' literal with the specified integer value. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @param value
   *          the value to use to get the enum instance
   * @return the BookCategoryType1, the literal enum
   * @generated
   */
  public static BookCategoryType1 get(int value) {
    for (BookCategoryType1 enumInstance : VALUES_ARRAY) {
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
  private BookCategoryType1(int value, String name, String literal) {
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
  public boolean isMagazine() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isNovel() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isFiction() {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isOther() {
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
