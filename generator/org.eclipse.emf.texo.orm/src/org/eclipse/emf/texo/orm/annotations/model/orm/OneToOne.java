/**
 * <copyright>
 * </copyright>
 *
 * $Id: OneToOne.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>One To One</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({METHOD, FIELD}) @Retention(RUNTIME)
 * 				public @interface OneToOne {
 * 				Class targetEntity() default void.class;
 * 				CascadeType[] cascade() default {};
 * 				FetchType fetch() default EAGER;
 * 				boolean optional() default true;
 * 				String mappedBy() default "";
 * 				boolean orphanRemoval() default false;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinColumn <em>Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isCascadeOnDelete <em>Cascade On Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPrivateOwned <em>Private Owned</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinFetch <em>Join Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getBatchFetch <em>Batch Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getNoncacheable <em>Noncacheable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPartitioning <em>Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getReplicationPartitioning <em>Replication Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getRoundRobinPartitioning <em>Round Robin Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPinnedPartitioning <em>Pinned Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getRangePartitioning <em>Range Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getValuePartitioning <em>Value Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getHashPartitioning <em>Hash Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getUnionPartitioning <em>Union Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPartitioned <em>Partitioned</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getMapsId <em>Maps Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOrphanRemoval <em>Orphan Removal</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne()
 * @model extendedMetaData="name='one-to-one' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface OneToOne extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Primary Key Join Column</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Key Join Column</em>' containment reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Key Join Column</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_PrimaryKeyJoinColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='primary-key-join-column' namespace='##targetNamespace'"
   * @generated
   */
  EList<PrimaryKeyJoinColumn> getPrimaryKeyJoinColumn();

  /**
   * Returns the value of the '<em><b>Join Column</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Column</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Column</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_JoinColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='join-column' namespace='##targetNamespace'"
   * @generated
   */
  EList<JoinColumn> getJoinColumn();

  /**
   * Returns the value of the '<em><b>Join Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Table</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Table</em>' containment reference.
   * @see #setJoinTable(JoinTable)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_JoinTable()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='join-table' namespace='##targetNamespace'"
   * @generated
   */
  JoinTable getJoinTable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinTable <em>Join Table</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Table</em>' containment reference.
   * @see #getJoinTable()
   * @generated
   */
  void setJoinTable(JoinTable value);

  /**
   * Returns the value of the '<em><b>Cascade</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cascade</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cascade</em>' containment reference.
   * @see #setCascade(CascadeType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Cascade()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='cascade' namespace='##targetNamespace'"
   * @generated
   */
  CascadeType getCascade();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getCascade <em>Cascade</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Cascade</em>' containment reference.
   * @see #getCascade()
   * @generated
   */
  void setCascade(CascadeType value);

  /**
   * Returns the value of the '<em><b>Cascade On Delete</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascade On Delete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Cascade On Delete</em>' attribute.
   * @see #isSetCascadeOnDelete()
   * @see #unsetCascadeOnDelete()
   * @see #setCascadeOnDelete(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_CascadeOnDelete()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='element' name='cascade-on-delete' namespace='##targetNamespace'"
   * @generated
   */
	boolean isCascadeOnDelete();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isCascadeOnDelete <em>Cascade On Delete</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cascade On Delete</em>' attribute.
   * @see #isSetCascadeOnDelete()
   * @see #unsetCascadeOnDelete()
   * @see #isCascadeOnDelete()
   * @generated
   */
	void setCascadeOnDelete(boolean value);

		/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isCascadeOnDelete <em>Cascade On Delete</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetCascadeOnDelete()
   * @see #isCascadeOnDelete()
   * @see #setCascadeOnDelete(boolean)
   * @generated
   */
	void unsetCascadeOnDelete();

		/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isCascadeOnDelete <em>Cascade On Delete</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Cascade On Delete</em>' attribute is set.
   * @see #unsetCascadeOnDelete()
   * @see #isCascadeOnDelete()
   * @see #setCascadeOnDelete(boolean)
   * @generated
   */
	boolean isSetCascadeOnDelete();

		/**
   * Returns the value of the '<em><b>Private Owned</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Private Owned</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Private Owned</em>' containment reference.
   * @see #setPrivateOwned(EmptyType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_PrivateOwned()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='private-owned' namespace='##targetNamespace'"
   * @generated
   */
  EmptyType getPrivateOwned();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPrivateOwned <em>Private Owned</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Private Owned</em>' containment reference.
   * @see #getPrivateOwned()
   * @generated
   */
  void setPrivateOwned(EmptyType value);

  /**
   * Returns the value of the '<em><b>Join Fetch</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Fetch</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType
   * @see #isSetJoinFetch()
   * @see #unsetJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_JoinFetch()
   * @model unsettable="true"
   *        extendedMetaData="kind='element' name='join-fetch' namespace='##targetNamespace'"
   * @generated
   */
  JoinFetchType getJoinFetch();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinFetch <em>Join Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType
   * @see #isSetJoinFetch()
   * @see #unsetJoinFetch()
   * @see #getJoinFetch()
   * @generated
   */
  void setJoinFetch(JoinFetchType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinFetch <em>Join Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetJoinFetch()
   * @see #getJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @generated
   */
  void unsetJoinFetch();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinFetch <em>Join Fetch</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Join Fetch</em>' attribute is set.
   * @see #unsetJoinFetch()
   * @see #getJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @generated
   */
  boolean isSetJoinFetch();

  /**
   * Returns the value of the '<em><b>Batch Fetch</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batch Fetch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Batch Fetch</em>' containment reference.
   * @see #setBatchFetch(BatchFetch)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_BatchFetch()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='batch-fetch' namespace='##targetNamespace'"
   * @generated
   */
	BatchFetch getBatchFetch();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getBatchFetch <em>Batch Fetch</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Batch Fetch</em>' containment reference.
   * @see #getBatchFetch()
   * @generated
   */
	void setBatchFetch(BatchFetch value);

		/**
   * Returns the value of the '<em><b>Property</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Property()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
   * @generated
   */
  EList<Property> getProperty();

  /**
   * Returns the value of the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access Methods</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access Methods</em>' containment reference.
   * @see #setAccessMethods(AccessMethods)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_AccessMethods()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
  AccessMethods getAccessMethods();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccessMethods <em>Access Methods</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Methods</em>' containment reference.
   * @see #getAccessMethods()
   * @generated
   */
  void setAccessMethods(AccessMethods value);

  /**
   * Returns the value of the '<em><b>Noncacheable</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noncacheable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Noncacheable</em>' containment reference.
   * @see #setNoncacheable(EmptyType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Noncacheable()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='noncacheable' namespace='##targetNamespace'"
   * @generated
   */
	EmptyType getNoncacheable();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getNoncacheable <em>Noncacheable</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Noncacheable</em>' containment reference.
   * @see #getNoncacheable()
   * @generated
   */
	void setNoncacheable(EmptyType value);

		/**
   * Returns the value of the '<em><b>Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Partitioning</em>' containment reference.
   * @see #setPartitioning(Partitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Partitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='partitioning' namespace='##targetNamespace'"
   * @generated
   */
	Partitioning getPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPartitioning <em>Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partitioning</em>' containment reference.
   * @see #getPartitioning()
   * @generated
   */
	void setPartitioning(Partitioning value);

		/**
   * Returns the value of the '<em><b>Replication Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replication Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Replication Partitioning</em>' containment reference.
   * @see #setReplicationPartitioning(ReplicationPartitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_ReplicationPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='replication-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	ReplicationPartitioning getReplicationPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getReplicationPartitioning <em>Replication Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replication Partitioning</em>' containment reference.
   * @see #getReplicationPartitioning()
   * @generated
   */
	void setReplicationPartitioning(ReplicationPartitioning value);

		/**
   * Returns the value of the '<em><b>Round Robin Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Round Robin Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Round Robin Partitioning</em>' containment reference.
   * @see #setRoundRobinPartitioning(RoundRobinPartitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_RoundRobinPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='round-robin-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	RoundRobinPartitioning getRoundRobinPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getRoundRobinPartitioning <em>Round Robin Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Round Robin Partitioning</em>' containment reference.
   * @see #getRoundRobinPartitioning()
   * @generated
   */
	void setRoundRobinPartitioning(RoundRobinPartitioning value);

		/**
   * Returns the value of the '<em><b>Pinned Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pinned Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Pinned Partitioning</em>' containment reference.
   * @see #setPinnedPartitioning(PinnedPartitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_PinnedPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='pinned-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	PinnedPartitioning getPinnedPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPinnedPartitioning <em>Pinned Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pinned Partitioning</em>' containment reference.
   * @see #getPinnedPartitioning()
   * @generated
   */
	void setPinnedPartitioning(PinnedPartitioning value);

		/**
   * Returns the value of the '<em><b>Range Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Range Partitioning</em>' containment reference.
   * @see #setRangePartitioning(RangePartitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_RangePartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='range-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	RangePartitioning getRangePartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getRangePartitioning <em>Range Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range Partitioning</em>' containment reference.
   * @see #getRangePartitioning()
   * @generated
   */
	void setRangePartitioning(RangePartitioning value);

		/**
   * Returns the value of the '<em><b>Value Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Value Partitioning</em>' containment reference.
   * @see #setValuePartitioning(ValuePartitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_ValuePartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='value-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	ValuePartitioning getValuePartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getValuePartitioning <em>Value Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Partitioning</em>' containment reference.
   * @see #getValuePartitioning()
   * @generated
   */
	void setValuePartitioning(ValuePartitioning value);

		/**
   * Returns the value of the '<em><b>Hash Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Hash Partitioning</em>' containment reference.
   * @see #setHashPartitioning(HashPartitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_HashPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='hash-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	HashPartitioning getHashPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getHashPartitioning <em>Hash Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hash Partitioning</em>' containment reference.
   * @see #getHashPartitioning()
   * @generated
   */
	void setHashPartitioning(HashPartitioning value);

		/**
   * Returns the value of the '<em><b>Union Partitioning</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Partitioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Union Partitioning</em>' containment reference.
   * @see #setUnionPartitioning(UnionPartitioning)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_UnionPartitioning()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='union-partitioning' namespace='##targetNamespace'"
   * @generated
   */
	UnionPartitioning getUnionPartitioning();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getUnionPartitioning <em>Union Partitioning</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Union Partitioning</em>' containment reference.
   * @see #getUnionPartitioning()
   * @generated
   */
	void setUnionPartitioning(UnionPartitioning value);

		/**
   * Returns the value of the '<em><b>Partitioned</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partitioned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Partitioned</em>' attribute.
   * @see #setPartitioned(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Partitioned()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='partitioned' namespace='##targetNamespace'"
   * @generated
   */
	String getPartitioned();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPartitioned <em>Partitioned</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partitioned</em>' attribute.
   * @see #getPartitioned()
   * @generated
   */
	void setPartitioned(String value);

		/**
   * Returns the value of the '<em><b>Access</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.AccessType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #setAccess(AccessType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Access()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='access'"
   * @generated
   */
  AccessType getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #getAccess()
   * @generated
   */
  void setAccess(AccessType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccess <em>Access</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Access</em>' attribute is set.
   * @see #unsetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  boolean isSetAccess();

  /**
   * Returns the value of the '<em><b>Fetch</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fetch</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FetchType
   * @see #isSetFetch()
   * @see #unsetFetch()
   * @see #setFetch(FetchType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Fetch()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='fetch'"
   * @generated
   */
  FetchType getFetch();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getFetch <em>Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FetchType
   * @see #isSetFetch()
   * @see #unsetFetch()
   * @see #getFetch()
   * @generated
   */
  void setFetch(FetchType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getFetch <em>Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  void unsetFetch();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getFetch <em>Fetch</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Fetch</em>' attribute is set.
   * @see #unsetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  boolean isSetFetch();

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #isSetId()
   * @see #unsetId()
   * @see #setId(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Id()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
  boolean isId();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isId <em>Id</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #isSetId()
   * @see #unsetId()
   * @see #isId()
   * @generated
   */
  void setId(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isId <em>Id</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetId()
   * @see #isId()
   * @see #setId(boolean)
   * @generated
   */
  void unsetId();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isId <em>Id</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Id</em>' attribute is set.
   * @see #unsetId()
   * @see #isId()
   * @see #setId(boolean)
   * @generated
   */
  boolean isSetId();

  /**
   * Returns the value of the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped By</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped By</em>' attribute.
   * @see #setMappedBy(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_MappedBy()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='mapped-by'"
   * @generated
   */
  String getMappedBy();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getMappedBy <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped By</em>' attribute.
   * @see #getMappedBy()
   * @generated
   */
  void setMappedBy(String value);

  /**
   * Returns the value of the '<em><b>Maps Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maps Id</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maps Id</em>' attribute.
   * @see #setMapsId(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_MapsId()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='maps-id'"
   * @generated
   */
  String getMapsId();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getMapsId <em>Maps Id</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Maps Id</em>' attribute.
   * @see #getMapsId()
   * @generated
   */
  void setMapsId(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #isSetOptional()
   * @see #unsetOptional()
   * @see #setOptional(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Optional()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='optional'"
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isSetOptional()
   * @see #unsetOptional()
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOptional()
   * @see #isOptional()
   * @see #setOptional(boolean)
   * @generated
   */
  void unsetOptional();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOptional <em>Optional</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Optional</em>' attribute is set.
   * @see #unsetOptional()
   * @see #isOptional()
   * @see #setOptional(boolean)
   * @generated
   */
  boolean isSetOptional();

  /**
   * Returns the value of the '<em><b>Orphan Removal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orphan Removal</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orphan Removal</em>' attribute.
   * @see #isSetOrphanRemoval()
   * @see #unsetOrphanRemoval()
   * @see #setOrphanRemoval(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_OrphanRemoval()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='orphan-removal'"
   * @generated
   */
  boolean isOrphanRemoval();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOrphanRemoval <em>Orphan Removal</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Orphan Removal</em>' attribute.
   * @see #isSetOrphanRemoval()
   * @see #unsetOrphanRemoval()
   * @see #isOrphanRemoval()
   * @generated
   */
  void setOrphanRemoval(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOrphanRemoval <em>Orphan Removal</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOrphanRemoval()
   * @see #isOrphanRemoval()
   * @see #setOrphanRemoval(boolean)
   * @generated
   */
  void unsetOrphanRemoval();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOrphanRemoval <em>Orphan Removal</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Orphan Removal</em>' attribute is set.
   * @see #unsetOrphanRemoval()
   * @see #isOrphanRemoval()
   * @see #setOrphanRemoval(boolean)
   * @generated
   */
  boolean isSetOrphanRemoval();

  /**
   * Returns the value of the '<em><b>Target Entity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Entity</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Entity</em>' attribute.
   * @see #setTargetEntity(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_TargetEntity()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='target-entity'"
   * @generated
   */
  String getTargetEntity();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getTargetEntity <em>Target Entity</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Entity</em>' attribute.
   * @see #getTargetEntity()
   * @generated
   */
  void setTargetEntity(String value);

} // OneToOne
