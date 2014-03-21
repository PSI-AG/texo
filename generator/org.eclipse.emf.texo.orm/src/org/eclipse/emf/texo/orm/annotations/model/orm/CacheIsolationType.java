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
 * A representation of the literals of the enumeration '<em><b>Cache Isolation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * 				/**
 * 				* Options for how Entity instances should be shared within an
 * 				EclipseLink Persistence Unit / ServerSession
 * 				* @see ClassDescriptor#setCacheIsolationType(CacheIsolationType)
 * 				* @author Gordon Yorke
 * 				* @since EclipseLink 2.2
 * 				**
 * 				public enum CacheIsolationType {
 * 
 * 				/**
 * 				* Entity instances will be cached within the
 * 				EntityManagerFactory/ServerSession level.
 * 				* Any user queries for shared cache instances (ie Read-Only query
 * 				hint) will return an Entity
 * 				* instance that may be shared by multiple clients.
 * 				*
 * 				* This setting is the default isolation level.
 * 				**
 * 				SHARED,
 * 
 * 				/**
 * 				* Entity state information will be cached in the shared cache but
 * 				Entity
 * 				* instances will not be shared. Any user queries for shared cache
 * 				instances
 * 				* (ie Read-Only query hint) will return a new Entity instance with
 * 				the cached state.
 * 				* This will ensure the instance is
 * 				<i>protected</i>
 * 				from any concurrent
 * 				* state change.
 * 				**
 * 				PROTECTED,
 * 
 * 				/**
 * 				* The Entity and its data is not stored in the shared cache but is
 * 				*
 * 				<i>isolated</i>
 * 				to the Persistence Context/UnitOfWork or
 * 				* IsolatedClientSession. This setting effectively disables second
 * 				level
 * 				* caching for this entity and should be used when users do not want
 * 				caching for
 * 				* a particular Entity.
 * 				**
 * 				ISOLATED;
 * 
 * 				}
 * 			
 * <!-- end-model-doc -->
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCacheIsolationType()
 * @model extendedMetaData="name='cache-isolation-type'"
 * @generated
 */
public enum CacheIsolationType implements Enumerator {
	/**
   * The '<em><b>SHARED</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SHARED_VALUE
   * @generated
   * @ordered
   */
	SHARED(0, "SHARED", "SHARED"),

	/**
   * The '<em><b>PROTECTED</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #PROTECTED_VALUE
   * @generated
   * @ordered
   */
	PROTECTED(1, "PROTECTED", "PROTECTED"),

	/**
   * The '<em><b>ISOLATED</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #ISOLATED_VALUE
   * @generated
   * @ordered
   */
	ISOLATED(2, "ISOLATED", "ISOLATED");

	/**
   * The '<em><b>SHARED</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHARED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #SHARED
   * @model
   * @generated
   * @ordered
   */
	public static final int SHARED_VALUE = 0;

	/**
   * The '<em><b>PROTECTED</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROTECTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #PROTECTED
   * @model
   * @generated
   * @ordered
   */
	public static final int PROTECTED_VALUE = 1;

	/**
   * The '<em><b>ISOLATED</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISOLATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #ISOLATED
   * @model
   * @generated
   * @ordered
   */
	public static final int ISOLATED_VALUE = 2;

	/**
   * An array of all the '<em><b>Cache Isolation Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final CacheIsolationType[] VALUES_ARRAY =
		new CacheIsolationType[] {
      SHARED,
      PROTECTED,
      ISOLATED,
    };

	/**
   * A public read-only list of all the '<em><b>Cache Isolation Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<CacheIsolationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Cache Isolation Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static CacheIsolationType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      CacheIsolationType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Cache Isolation Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static CacheIsolationType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      CacheIsolationType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Cache Isolation Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static CacheIsolationType get(int value) {
    switch (value) {
      case SHARED_VALUE: return SHARED;
      case PROTECTED_VALUE: return PROTECTED;
      case ISOLATED_VALUE: return ISOLATED;
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
	private CacheIsolationType(int value, String name, String literal) {
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
	
} //CacheIsolationType
