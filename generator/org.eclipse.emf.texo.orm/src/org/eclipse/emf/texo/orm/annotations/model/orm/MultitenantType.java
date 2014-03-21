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
 * A representation of the literals of the enumeration '<em><b>Multitenant Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * 
 * 				public enum MultitenantType {
 * 				/**
 * 				* Specifies that table(s) the entity maps to includes rows for
 * 				multiple
 * 				* tenants. The tenant discriminator column(s) are used with
 * 				application
 * 				* context values to limit what a persistence context can access.
 * 				**
 * 				SINGLE_TABLE,
 * 
 * 				/**
 * 				* Specifies that different tables are used for each tenant. The table
 * 				scan
 * 				* be uniquely identified by name, schema/tablespace.
 * 				**
 * 				TABLE_PER_TENANT
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getMultitenantType()
 * @model extendedMetaData="name='multitenant-type'"
 * @generated
 */
public enum MultitenantType implements Enumerator {
	/**
   * The '<em><b>SINGLETABLE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SINGLETABLE_VALUE
   * @generated
   * @ordered
   */
	SINGLETABLE(0, "SINGLETABLE", "SINGLE_TABLE"),

	/**
   * The '<em><b>TABLEPERTENANT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #TABLEPERTENANT_VALUE
   * @generated
   * @ordered
   */
	TABLEPERTENANT(1, "TABLEPERTENANT", "TABLE_PER_TENANT");

	/**
   * The '<em><b>SINGLETABLE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLETABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #SINGLETABLE
   * @model literal="SINGLE_TABLE"
   * @generated
   * @ordered
   */
	public static final int SINGLETABLE_VALUE = 0;

	/**
   * The '<em><b>TABLEPERTENANT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TABLEPERTENANT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #TABLEPERTENANT
   * @model literal="TABLE_PER_TENANT"
   * @generated
   * @ordered
   */
	public static final int TABLEPERTENANT_VALUE = 1;

	/**
   * An array of all the '<em><b>Multitenant Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final MultitenantType[] VALUES_ARRAY =
		new MultitenantType[] {
      SINGLETABLE,
      TABLEPERTENANT,
    };

	/**
   * A public read-only list of all the '<em><b>Multitenant Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<MultitenantType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Multitenant Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static MultitenantType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      MultitenantType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Multitenant Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static MultitenantType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      MultitenantType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Multitenant Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static MultitenantType get(int value) {
    switch (value) {
      case SINGLETABLE_VALUE: return SINGLETABLE;
      case TABLEPERTENANT_VALUE: return TABLEPERTENANT;
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
	private MultitenantType(int value, String name, String literal) {
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
	
} //MultitenantType
