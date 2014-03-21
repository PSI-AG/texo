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
 * A representation of the literals of the enumeration '<em><b>Cache Key Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* Configures what type of Id value is used to store the object in the
 * 				cache.
 * 				* This can either be the basic Id value for simple singleton Ids,
 * 				* or an optimized CacheKey type.
 * 				*
 * 				* @see PrimaryKey#cacheKeyType()
 * 				* @see ClassDescriptor#setCacheKeyType(CacheKeyType)
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.1
 * 				**
 * 				public enum CacheKeyType {
 * 				/**
 * 				* This can only be used for simple singleton Ids, such as
 * 				long/int/String.
 * 				* This is the default for simple singleton Ids.
 * 				**
 * 				ID_VALUE,
 * 
 * 				/**
 * 				* Optimized cache key type that allows composite and complex values.
 * 				* This is the default for composite or complex Ids.
 * 				**
 * 				CACHE_KEY,
 * 
 * 				/**
 * 				* The cache key type is automatically configured depending on what is
 * 				optimal for the class.
 * 				**
 * 				AUTO
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCacheKeyType()
 * @model extendedMetaData="name='cache-key-type'"
 * @generated
 */
public enum CacheKeyType implements Enumerator {
	/**
   * The '<em><b>IDVALUE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #IDVALUE_VALUE
   * @generated
   * @ordered
   */
	IDVALUE(0, "IDVALUE", "ID_VALUE"),

	/**
   * The '<em><b>CACHEKEY</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #CACHEKEY_VALUE
   * @generated
   * @ordered
   */
	CACHEKEY(1, "CACHEKEY", "CACHE_KEY"),

	/**
   * The '<em><b>AUTO</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #AUTO_VALUE
   * @generated
   * @ordered
   */
	AUTO(2, "AUTO", "AUTO");

	/**
   * The '<em><b>IDVALUE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IDVALUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #IDVALUE
   * @model literal="ID_VALUE"
   * @generated
   * @ordered
   */
	public static final int IDVALUE_VALUE = 0;

	/**
   * The '<em><b>CACHEKEY</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CACHEKEY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #CACHEKEY
   * @model literal="CACHE_KEY"
   * @generated
   * @ordered
   */
	public static final int CACHEKEY_VALUE = 1;

	/**
   * The '<em><b>AUTO</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #AUTO
   * @model
   * @generated
   * @ordered
   */
	public static final int AUTO_VALUE = 2;

	/**
   * An array of all the '<em><b>Cache Key Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final CacheKeyType[] VALUES_ARRAY =
		new CacheKeyType[] {
      IDVALUE,
      CACHEKEY,
      AUTO,
    };

	/**
   * A public read-only list of all the '<em><b>Cache Key Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<CacheKeyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Cache Key Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static CacheKeyType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      CacheKeyType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Cache Key Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static CacheKeyType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      CacheKeyType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Cache Key Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static CacheKeyType get(int value) {
    switch (value) {
      case IDVALUE_VALUE: return IDVALUE;
      case CACHEKEY_VALUE: return CACHEKEY;
      case AUTO_VALUE: return AUTO;
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
	private CacheKeyType(int value, String name, String literal) {
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
	
} //CacheKeyType
