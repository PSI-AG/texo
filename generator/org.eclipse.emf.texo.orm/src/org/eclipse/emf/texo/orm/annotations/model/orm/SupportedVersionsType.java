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
 * A representation of the literals of the enumeration '<em><b>Supported Versions Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getSupportedVersionsType()
 * @model extendedMetaData="name='supported-versions-type'"
 * @generated
 */
public enum SupportedVersionsType implements Enumerator {
	/**
   * The '<em><b>20</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #_20_VALUE
   * @generated
   * @ordered
   */
	_20(0, "_20", "2.0"),

	/**
   * The '<em><b>21</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #_21_VALUE
   * @generated
   * @ordered
   */
	_21(1, "_21", "2.1"),

	/**
   * The '<em><b>22</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #_22_VALUE
   * @generated
   * @ordered
   */
	_22(2, "_22", "2.2"),

	/**
   * The '<em><b>23</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #_23_VALUE
   * @generated
   * @ordered
   */
	_23(3, "_23", "2.3");

	/**
   * The '<em><b>20</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>20</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #_20
   * @model literal="2.0"
   * @generated
   * @ordered
   */
	public static final int _20_VALUE = 0;

	/**
   * The '<em><b>21</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>21</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #_21
   * @model literal="2.1"
   * @generated
   * @ordered
   */
	public static final int _21_VALUE = 1;

	/**
   * The '<em><b>22</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>22</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #_22
   * @model literal="2.2"
   * @generated
   * @ordered
   */
	public static final int _22_VALUE = 2;

	/**
   * The '<em><b>23</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>23</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #_23
   * @model literal="2.3"
   * @generated
   * @ordered
   */
	public static final int _23_VALUE = 3;

	/**
   * An array of all the '<em><b>Supported Versions Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final SupportedVersionsType[] VALUES_ARRAY =
		new SupportedVersionsType[] {
      _20,
      _21,
      _22,
      _23,
    };

	/**
   * A public read-only list of all the '<em><b>Supported Versions Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<SupportedVersionsType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Supported Versions Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static SupportedVersionsType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      SupportedVersionsType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Supported Versions Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static SupportedVersionsType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      SupportedVersionsType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Supported Versions Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static SupportedVersionsType get(int value) {
    switch (value) {
      case _20_VALUE: return _20;
      case _21_VALUE: return _21;
      case _22_VALUE: return _22;
      case _23_VALUE: return _23;
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
	private SupportedVersionsType(int value, String name, String literal) {
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
	
} //SupportedVersionsType
