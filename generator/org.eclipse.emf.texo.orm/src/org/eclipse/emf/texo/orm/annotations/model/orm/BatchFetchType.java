/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Batch Fetch Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * 				public enum BatchFetchType {
 * 				/**
 * 				* This is the default form of batch reading.
 * 				* The original query's selection criteria is joined with the batch
 * 				query.
 * 				**
 * 				JOIN,
 * 
 * 				/**
 * 				* This uses an SQL EXISTS and a sub-select in the batch query instead
 * 				of a join.
 * 				* This has the advantage of not requiring an SQL DISTINCT which can
 * 				have issues
 * 				* with LOBs, or may be more efficient for some types of queries or on
 * 				some databases.
 * 				**
 * 				EXISTS,
 * 
 * 				/**
 * 				* This uses an SQL IN clause in the batch query passing in the source
 * 				object Ids.
 * 				* This has the advantage of only selecting the objects not already
 * 				contained in the cache,
 * 				* and can work better with cursors, or if joins cannot be used.
 * 				* This may only work for singleton Ids on some databases.
 * 				**
 * 				IN
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getBatchFetchType()
 * @model extendedMetaData="name='batch-fetch-type'"
 * @generated
 */
public enum BatchFetchType implements Enumerator {
	/**
   * The '<em><b>JOIN</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #JOIN_VALUE
   * @generated
   * @ordered
   */
	JOIN(0, "JOIN", "JOIN"),

	/**
   * The '<em><b>EXISTS</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #EXISTS_VALUE
   * @generated
   * @ordered
   */
	EXISTS(1, "EXISTS", "EXISTS"),

	/**
   * The '<em><b>IN</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #IN_VALUE
   * @generated
   * @ordered
   */
	IN(2, "IN", "IN");

	/**
   * The '<em><b>JOIN</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #JOIN
   * @model
   * @generated
   * @ordered
   */
	public static final int JOIN_VALUE = 0;

	/**
   * The '<em><b>EXISTS</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXISTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #EXISTS
   * @model
   * @generated
   * @ordered
   */
	public static final int EXISTS_VALUE = 1;

	/**
   * The '<em><b>IN</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #IN
   * @model
   * @generated
   * @ordered
   */
	public static final int IN_VALUE = 2;

	/**
   * An array of all the '<em><b>Batch Fetch Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final BatchFetchType[] VALUES_ARRAY =
		new BatchFetchType[] {
      JOIN,
      EXISTS,
      IN,
    };

	/**
   * A public read-only list of all the '<em><b>Batch Fetch Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<BatchFetchType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Batch Fetch Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static BatchFetchType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      BatchFetchType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Batch Fetch Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static BatchFetchType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      BatchFetchType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Batch Fetch Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static BatchFetchType get(int value) {
    switch (value) {
      case JOIN_VALUE: return JOIN;
      case EXISTS_VALUE: return EXISTS;
      case IN_VALUE: return IN;
    }
    return null;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final int value;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final String name;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final String literal;

	/**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private BatchFetchType(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getLiteral() {
    return literal;
  }

	/**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    return literal;
  }
	
} //BatchFetchType
