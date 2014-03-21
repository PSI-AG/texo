/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryRedirectors.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Query Redirectors</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <!-- begin-model-doc -->
 * 
 * 
 * @Target({TYPE ) @Retention(RUNTIME) public @interface QueryRedirectors {
 * 
 *               * * This AllQueries Query Redirector will be applied to any executing object query * that does not have
 *               a more precise redirector (like the * ReadObjectQuery Redirector) or a redirector set directly on the
 *               query. * Query redirectors allow the user to intercept query execution preventing * it or alternately
 *               performing some side effect like auditing. * * Class allQueries() default void.class;
 * 
 *               * * A Default ReadAll Query Redirector will be applied to any executing * ReadAllQuery that does not
 *               have a redirector set directly on the query. * Query redirectors allow the user to intercept query
 *               execution preventing * it or alternately performing some side effect like auditing. * For users
 *               executing a JPA Query through the getResultList() API this is the redirector that will be invoked *
 *               Class readAll() default void.class;
 * 
 *               * * A Default ReadObject Query Redirector will be applied to any executing * ReadObjectQuery that does
 *               not have a redirector set directly on the query. * Query redirectors allow the user to intercept query
 *               execution preventing * it or alternately performing some side effect like auditing. * For users
 *               executing a JPA Query through the getSingleResult() API or EntityManager.find() this is the redirector
 *               that will be invoked * Class readObject() default void.class;
 * 
 *               * * A Default ReportQuery Redirector will be applied to any executing * ReportQuery that does not have
 *               a redirector set directly on the query. * Query redirectors allow the user to intercept query execution
 *               preventing * it or alternately performing some side effect like auditing. * For users executing a JPA
 *               Query that contains agregate functions or selects multiple entities this is the redirector that will be
 *               invoked * Class report() default void.class;
 * 
 *               * * A Default Update Query Redirector will be applied to any executing * UpdateObjectQuery or
 *               UpdateAllQuery that does not have a redirector set directly on the query. * In EclipseLink an
 *               UpdateObjectQuery is executed whenever flushing changes to the datasource. * Query redirectors allow
 *               the user to intercept query execution preventing * it or alternately performing some side effect like
 *               auditing. * Class update() default void.class;
 * 
 *               * * A Default Insert Query Redirector will be applied to any executing * InsertObjectQuery that does
 *               not have a redirector set directly on the query. * In EclipseLink an InsertObjectQuery is executed when
 *               persisting an object to the datasource. * Query redirectors allow the user to intercept query execution
 *               preventing * it or alternately performing some side effect like auditing. * Class insert() default
 *               void.class;
 * 
 *               * * A Default Delete Object Query Redirector will be applied to any executing * DeleteObjectQuery or
 *               DeleteAllQuery that does not have a redirector set directly on the query. * Query redirectors allow the
 *               user to intercept query execution preventing * it or alternately performing some side effect like
 *               auditing. * Class delete() default void.class;
 * 
 *               }
 * 
 *               <!-- end-model-doc -->
 * 
 *               <p>
 *               The following features are supported:
 *               <ul>
 *               <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getAllQueries <em>All
 *               Queries</em>}</li>
 *               <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getDelete <em>Delete</em>}</li>
 *               <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getInsert <em>Insert</em>}</li>
 *               <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getReadAll <em>Read All
 *               </em>}</li>
 *               <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getReadObject <em>Read
 *               Object</em>}</li>
 *               <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getReport <em>Report</em>}</li>
 *               <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getUpdate <em>Update</em>}</li>
 *               </ul>
 *               </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getQueryRedirectors()
 * @model extendedMetaData="name='query-redirectors' kind='empty'"
 * @generated
 */
public interface QueryRedirectors extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>All Queries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Queries</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Queries</em>' attribute.
   * @see #setAllQueries(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getQueryRedirectors_AllQueries()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='all-queries'"
   * @generated
   */
  String getAllQueries();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getAllQueries <em>All Queries</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>All Queries</em>' attribute.
   * @see #getAllQueries()
   * @generated
   */
  void setAllQueries(String value);

  /**
   * Returns the value of the '<em><b>Delete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delete</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delete</em>' attribute.
   * @see #setDelete(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getQueryRedirectors_Delete()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='delete'"
   * @generated
   */
  String getDelete();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getDelete <em>Delete</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete</em>' attribute.
   * @see #getDelete()
   * @generated
   */
  void setDelete(String value);

  /**
   * Returns the value of the '<em><b>Insert</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insert</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insert</em>' attribute.
   * @see #setInsert(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getQueryRedirectors_Insert()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='insert'"
   * @generated
   */
  String getInsert();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getInsert <em>Insert</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Insert</em>' attribute.
   * @see #getInsert()
   * @generated
   */
  void setInsert(String value);

  /**
   * Returns the value of the '<em><b>Read All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read All</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read All</em>' attribute.
   * @see #setReadAll(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getQueryRedirectors_ReadAll()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='read-all'"
   * @generated
   */
  String getReadAll();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getReadAll <em>Read All</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Read All</em>' attribute.
   * @see #getReadAll()
   * @generated
   */
  void setReadAll(String value);

  /**
   * Returns the value of the '<em><b>Read Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read Object</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read Object</em>' attribute.
   * @see #setReadObject(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getQueryRedirectors_ReadObject()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='read-object'"
   * @generated
   */
  String getReadObject();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getReadObject <em>Read Object</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Read Object</em>' attribute.
   * @see #getReadObject()
   * @generated
   */
  void setReadObject(String value);

  /**
   * Returns the value of the '<em><b>Report</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Report</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Report</em>' attribute.
   * @see #setReport(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getQueryRedirectors_Report()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='report'"
   * @generated
   */
  String getReport();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getReport <em>Report</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Report</em>' attribute.
   * @see #getReport()
   * @generated
   */
  void setReport(String value);

  /**
   * Returns the value of the '<em><b>Update</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update</em>' attribute.
   * @see #setUpdate(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getQueryRedirectors_Update()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='update'"
   * @generated
   */
  String getUpdate();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getUpdate <em>Update</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Update</em>' attribute.
   * @see #getUpdate()
   * @generated
   */
  void setUpdate(String value);

} // QueryRedirectors
