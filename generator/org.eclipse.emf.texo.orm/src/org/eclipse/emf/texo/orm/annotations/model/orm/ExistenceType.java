/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExistenceType.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Existence Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc --> <!-- begin-model-doc -->
 * 
 * * * The ExistenceChecking annotation is used to specify the type of * checking EclipseLink should use when updating
 * entities. * * An existence-checking specification is supported on an Entity or * MappedSuperclass annotation. *
 * public @interface ExistenceChecking {
 * 
 * * * (Optional) Set the existence check for determining * if an insert or update should occur for an object. *
 * ExistenceType value() default CHECK_CACHE; }
 * 
 * * * Assume that if the objects primary key does not include null and * it is in the cache, then it must exist. *
 * CHECK_CACHE,
 * 
 * * * Perform does exist check on the database. * CHECK_DATABASE,
 * 
 * * * Assume that if the objects primary key does not include null then * it must exist. This may be used if the
 * application guarantees or * does not care about the existence check. * ASSUME_EXISTENCE,
 * 
 * * * Assume that the object does not exist. This may be used if the * application guarantees or does not care about
 * the existence check. * This will always force an insert to be called. * ASSUME_NON_EXISTENCE
 * 
 * 
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getExistenceType()
 * @model extendedMetaData="name='existence-type'"
 * @generated
 */
public enum ExistenceType implements Enumerator {
  /**
   * The '<em><b>CHECKCACHE</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #CHECKCACHE_VALUE
   * @generated
   * @ordered
   */
  CHECKCACHE(0, "CHECKCACHE", "CHECK_CACHE"),

  /**
   * The '<em><b>CHECKDATABASE</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #CHECKDATABASE_VALUE
   * @generated
   * @ordered
   */
  CHECKDATABASE(1, "CHECKDATABASE", "CHECK_DATABASE"),

  /**
   * The '<em><b>ASSUMEEXISTENCE</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #ASSUMEEXISTENCE_VALUE
   * @generated
   * @ordered
   */
  ASSUMEEXISTENCE(2, "ASSUMEEXISTENCE", "ASSUME_EXISTENCE"),

  /**
   * The '<em><b>ASSUMENONEXISTENCE</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #ASSUMENONEXISTENCE_VALUE
   * @generated
   * @ordered
   */
  ASSUMENONEXISTENCE(3, "ASSUMENONEXISTENCE", "ASSUME_NON_EXISTENCE");

  /**
   * The '<em><b>CHECKCACHE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CHECKCACHE</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHECKCACHE
   * @model literal="CHECK_CACHE"
   * @generated
   * @ordered
   */
  public static final int CHECKCACHE_VALUE = 0;

  /**
   * The '<em><b>CHECKDATABASE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CHECKDATABASE</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHECKDATABASE
   * @model literal="CHECK_DATABASE"
   * @generated
   * @ordered
   */
  public static final int CHECKDATABASE_VALUE = 1;

  /**
   * The '<em><b>ASSUMEEXISTENCE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ASSUMEEXISTENCE</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASSUMEEXISTENCE
   * @model literal="ASSUME_EXISTENCE"
   * @generated
   * @ordered
   */
  public static final int ASSUMEEXISTENCE_VALUE = 2;

  /**
   * The '<em><b>ASSUMENONEXISTENCE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ASSUMENONEXISTENCE</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASSUMENONEXISTENCE
   * @model literal="ASSUME_NON_EXISTENCE"
   * @generated
   * @ordered
   */
  public static final int ASSUMENONEXISTENCE_VALUE = 3;

  /**
   * An array of all the '<em><b>Existence Type</b></em>' enumerators.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static final ExistenceType[] VALUES_ARRAY = new ExistenceType[] {
      CHECKCACHE,
      CHECKDATABASE,
      ASSUMEEXISTENCE,
      ASSUMENONEXISTENCE,
    };

  /**
   * A public read-only list of all the '<em><b>Existence Type</b></em>' enumerators.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static final List<ExistenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Existence Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static ExistenceType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ExistenceType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Existence Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static ExistenceType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ExistenceType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Existence Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static ExistenceType get(int value) {
    switch (value) {
      case CHECKCACHE_VALUE: return CHECKCACHE;
      case CHECKDATABASE_VALUE: return CHECKDATABASE;
      case ASSUMEEXISTENCE_VALUE: return ASSUMEEXISTENCE;
      case ASSUMENONEXISTENCE_VALUE: return ASSUMENONEXISTENCE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private ExistenceType(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public int getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral() {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return literal;
  }

} // ExistenceType
