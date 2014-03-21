/**
 * <copyright>
 * </copyright>
 *
 * $Id: Temporal.java,v 1.3 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Temporal</b></em>', and utility
 * methods for working with them. <!-- end-user-doc --> <!-- begin-model-doc -->
 * 
 * 
 * @Target({METHOD, FIELD}) @Retention(RUNTIME) public @interface Temporal { TemporalType value(); }
 * 
 * 
 *                  <!-- end-model-doc -->
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTemporal()
 * @model extendedMetaData="name='temporal'"
 * @generated
 */
public enum Temporal implements Enumerator {
  /**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
  DATE(0, "DATE", "DATE"),

  /**
	 * The '<em><b>TIME</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
  TIME(1, "TIME", "TIME"),

  /**
	 * The '<em><b>TIMESTAMP</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #TIMESTAMP_VALUE
	 * @generated
	 * @ordered
	 */
  TIMESTAMP(2, "TIMESTAMP", "TIMESTAMP");

  /**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DATE</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #DATE
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int DATE_VALUE = 0;

  /**
	 * The '<em><b>TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TIME</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #TIME
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int TIME_VALUE = 1;

  /**
	 * The '<em><b>TIMESTAMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TIMESTAMP</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #TIMESTAMP
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int TIMESTAMP_VALUE = 2;

  /**
	 * An array of all the '<em><b>Temporal</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  private static final Temporal[] VALUES_ARRAY = new Temporal[] {
			DATE,
			TIME,
			TIMESTAMP,
		};

  /**
	 * A public read-only list of all the '<em><b>Temporal</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 */
  public static final List<Temporal> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Temporal</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 */
  public static Temporal get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Temporal result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
   * Returns the '<em><b>Temporal</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  public static Temporal getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Temporal result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Temporal</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 */
  public static Temporal get(int value) {
		switch (value) {
			case DATE_VALUE: return DATE;
			case TIME_VALUE: return TIME;
			case TIMESTAMP_VALUE: return TIMESTAMP;
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
  private Temporal(int value, String name, String literal) {
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

} // Temporal
