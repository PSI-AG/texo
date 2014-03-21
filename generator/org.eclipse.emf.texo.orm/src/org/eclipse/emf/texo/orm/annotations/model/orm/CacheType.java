/**
 * <copyright>
 * </copyright>
 *
 * $Id: CacheType.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Cache Type</b></em>', and utility
 * methods for working with them. <!-- end-user-doc --> <!-- begin-model-doc -->
 * 
 * 
 * * * The CacheType enum is used with the Cache annotation for a * persistent class. It defines the type of
 * IdentityMap/Cache used for * the class. By default the SOFT_WEAK cache type is used. * * @see
 * org.eclipse.persistence.annotations.Cache * public enum CacheType { * * Provides full caching and guaranteed
 * identity. Caches all objects * and does not remove them. * WARNING: This method may be memory intensive when many
 * objects are * read. * FULL,
 * 
 * * * Similar to the FULL identity map except that the map holds the * objects using weak references. This method
 * allows full garbage * collection and provides full caching and guaranteed identity. * WEAK,
 * 
 * * * Similar to the FULL identity map except that the map holds the * objects using soft references. This method
 * allows full garbage * collection when memory is low and provides full caching and * guaranteed identity. * SOFT,
 * 
 * * * Similar to the WEAK identity map except that it maintains a * most-frequently-used sub-cache. The size of the
 * sub-cache is * proportional to the size of the identity map as specified by * descriptor's setIdentityMapSize()
 * method. The sub-cache * uses soft references to ensure that these objects are * garbage-collected only if the system
 * is low on memory. * SOFT_WEAK,
 * 
 * * * Identical to the soft cache weak (SOFT_WEAK) identity map except * that it uses hard references in the sub-cache.
 * Use this identity * map if soft references do not behave properly on your platform. * HARD_WEAK,
 * 
 * * * A cache identity map maintains a fixed number of objects * specified by the application. Objects are removed from
 * the cache * on a least-recently-used basis. This method allows object * identity for the most commonly used objects.
 * * WARNING: Furnishes caching and identity, but does not guarantee * identity. * CACHE,
 * 
 * * * WARNING: Does not preserve object identity and does not cache * objects. * NONE }
 * 
 * 
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCacheType()
 * @model extendedMetaData="name='cache-type'"
 * @generated
 */
public enum CacheType implements Enumerator {
  /**
   * The '<em><b>FULL</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #FULL_VALUE
   * @generated
   * @ordered
   */
  FULL(0, "FULL", "FULL"),

  /**
   * The '<em><b>WEAK</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #WEAK_VALUE
   * @generated
   * @ordered
   */
  WEAK(1, "WEAK", "WEAK"),

  /**
   * The '<em><b>SOFT</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #SOFT_VALUE
   * @generated
   * @ordered
   */
  SOFT(2, "SOFT", "SOFT"),

  /**
   * The '<em><b>SOFTWEAK</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #SOFTWEAK_VALUE
   * @generated
   * @ordered
   */
  SOFTWEAK(3, "SOFTWEAK", "SOFT_WEAK"),

  /**
   * The '<em><b>HARDWEAK</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #HARDWEAK_VALUE
   * @generated
   * @ordered
   */
  HARDWEAK(4, "HARDWEAK", "HARD_WEAK"),

  /**
   * The '<em><b>CACHE</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #CACHE_VALUE
   * @generated
   * @ordered
   */
  CACHE(5, "CACHE", "CACHE"),

  /**
   * The '<em><b>NONE</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #NONE_VALUE
   * @generated
   * @ordered
   */
  NONE(6, "NONE", "NONE");

  /**
   * The '<em><b>FULL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FULL</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FULL
   * @model
   * @generated
   * @ordered
   */
  public static final int FULL_VALUE = 0;

  /**
   * The '<em><b>WEAK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WEAK</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WEAK
   * @model
   * @generated
   * @ordered
   */
  public static final int WEAK_VALUE = 1;

  /**
   * The '<em><b>SOFT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SOFT</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SOFT
   * @model
   * @generated
   * @ordered
   */
  public static final int SOFT_VALUE = 2;

  /**
   * The '<em><b>SOFTWEAK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SOFTWEAK</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SOFTWEAK
   * @model literal="SOFT_WEAK"
   * @generated
   * @ordered
   */
  public static final int SOFTWEAK_VALUE = 3;

  /**
   * The '<em><b>HARDWEAK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HARDWEAK</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HARDWEAK
   * @model literal="HARD_WEAK"
   * @generated
   * @ordered
   */
  public static final int HARDWEAK_VALUE = 4;

  /**
   * The '<em><b>CACHE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CACHE</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CACHE
   * @model
   * @generated
   * @ordered
   */
  public static final int CACHE_VALUE = 5;

  /**
   * The '<em><b>NONE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NONE
   * @model
   * @generated
   * @ordered
   */
  public static final int NONE_VALUE = 6;

  /**
   * An array of all the '<em><b>Cache Type</b></em>' enumerators.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static final CacheType[] VALUES_ARRAY = new CacheType[] {
      FULL,
      WEAK,
      SOFT,
      SOFTWEAK,
      HARDWEAK,
      CACHE,
      NONE,
    };

  /**
   * A public read-only list of all the '<em><b>Cache Type</b></em>' enumerators.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static final List<CacheType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Cache Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static CacheType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      CacheType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Cache Type</b></em>' literal with the specified name. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  public static CacheType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      CacheType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Cache Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static CacheType get(int value) {
    switch (value) {
      case FULL_VALUE: return FULL;
      case WEAK_VALUE: return WEAK;
      case SOFT_VALUE: return SOFT;
      case SOFTWEAK_VALUE: return SOFTWEAK;
      case HARDWEAK_VALUE: return HARDWEAK;
      case CACHE_VALUE: return CACHE;
      case NONE_VALUE: return NONE;
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
  private CacheType(int value, String name, String literal) {
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

} // CacheType
