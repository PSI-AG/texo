/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimaryKey.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Primary Key</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* The PrimaryKey annotation allows advanced configuration of the Id.
 * 				* A validation policy can be given that allows specifying if zero is
 * 				a valid id value.
 * 				* The set of primary key columns can also be specified precisely.
 * 				*
 * 				* @author James Sutherland
 * 				* @since EclipseLink 1.1
 * 				**
 * 				@Target({TYPE})
 * 				@Retention(RUNTIME)
 * 				public @interface PrimaryKey {
 * 				/**
 * 				* (Optional) Configures what id validation is done.
 * 				* By default 0 is not a valid id value, this can be used to allow 0
 * 				id values.
 * 				**
 * 				IdValidation validation() default IdValidation.ZERO;
 * 
 * 				/**
 * 				* (Optional) Configures what cache key type is used to store the
 * 				object in the cache.
 * 				* By default the type is determined by what type is optimal for the
 * 				class.
 * 				**
 * 				CacheKeyType cacheKeyType() default CacheKeyType.AUTO;
 * 
 * 				/**
 * 				* (Optional) Used to specify the primary key columns directly.
 * 				* This can be used instead of @Id if the primary key includes a non
 * 				basic field,
 * 				* such as a foreign key, or a inheritance discriminator, embedded, or
 * 				transformation mapped field.
 * 				**
 * 				Column[] columns() default {};
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey#getCacheKeyType <em>Cache Key Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey#getValidation <em>Validation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPrimaryKey()
 * @model extendedMetaData="name='primary-key' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface PrimaryKey extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Column</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPrimaryKey_Column()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
   * @generated
   */
  EList<Column> getColumn();

  /**
   * Returns the value of the '<em><b>Cache Key Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.CacheKeyType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Key Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Cache Key Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheKeyType
   * @see #isSetCacheKeyType()
   * @see #unsetCacheKeyType()
   * @see #setCacheKeyType(CacheKeyType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPrimaryKey_CacheKeyType()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='cache-key-type'"
   * @generated
   */
	CacheKeyType getCacheKeyType();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey#getCacheKeyType <em>Cache Key Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cache Key Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheKeyType
   * @see #isSetCacheKeyType()
   * @see #unsetCacheKeyType()
   * @see #getCacheKeyType()
   * @generated
   */
	void setCacheKeyType(CacheKeyType value);

		/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey#getCacheKeyType <em>Cache Key Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetCacheKeyType()
   * @see #getCacheKeyType()
   * @see #setCacheKeyType(CacheKeyType)
   * @generated
   */
	void unsetCacheKeyType();

		/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey#getCacheKeyType <em>Cache Key Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Cache Key Type</em>' attribute is set.
   * @see #unsetCacheKeyType()
   * @see #getCacheKeyType()
   * @see #setCacheKeyType(CacheKeyType)
   * @generated
   */
	boolean isSetCacheKeyType();

		/**
   * Returns the value of the '<em><b>Validation</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.IdValidation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validation</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validation</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.IdValidation
   * @see #isSetValidation()
   * @see #unsetValidation()
   * @see #setValidation(IdValidation)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPrimaryKey_Validation()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='validation'"
   * @generated
   */
  IdValidation getValidation();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey#getValidation <em>Validation</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Validation</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.IdValidation
   * @see #isSetValidation()
   * @see #unsetValidation()
   * @see #getValidation()
   * @generated
   */
  void setValidation(IdValidation value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey#getValidation <em>Validation</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetValidation()
   * @see #getValidation()
   * @see #setValidation(IdValidation)
   * @generated
   */
  void unsetValidation();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey#getValidation <em>Validation</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Validation</em>' attribute is set.
   * @see #unsetValidation()
   * @see #getValidation()
   * @see #setValidation(IdValidation)
   * @generated
   */
  boolean isSetValidation();

} // PrimaryKey
