/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryRedirectorsImpl.java,v 1.5 2011/10/25 13:25:24 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Query Redirectors</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.QueryRedirectorsImpl#getAllQueries <em>All Queries
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.QueryRedirectorsImpl#getDelete <em>Delete</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.QueryRedirectorsImpl#getInsert <em>Insert</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.QueryRedirectorsImpl#getReadAll <em>Read All</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.QueryRedirectorsImpl#getReadObject <em>Read Object
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.QueryRedirectorsImpl#getReport <em>Report</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.QueryRedirectorsImpl#getUpdate <em>Update</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class QueryRedirectorsImpl extends BaseOrmAnnotationImpl implements QueryRedirectors {
  /**
   * The default value of the '{@link #getAllQueries() <em>All Queries</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getAllQueries()
   * @generated
   * @ordered
   */
  protected static final String ALL_QUERIES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAllQueries() <em>All Queries</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getAllQueries()
   * @generated
   * @ordered
   */
  protected String allQueries = ALL_QUERIES_EDEFAULT;

  /**
   * The default value of the '{@link #getDelete() <em>Delete</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDelete()
   * @generated
   * @ordered
   */
  protected static final String DELETE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDelete() <em>Delete</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getDelete()
   * @generated
   * @ordered
   */
  protected String delete = DELETE_EDEFAULT;

  /**
   * The default value of the '{@link #getInsert() <em>Insert</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getInsert()
   * @generated
   * @ordered
   */
  protected static final String INSERT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInsert() <em>Insert</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getInsert()
   * @generated
   * @ordered
   */
  protected String insert = INSERT_EDEFAULT;

  /**
   * The default value of the '{@link #getReadAll() <em>Read All</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getReadAll()
   * @generated
   * @ordered
   */
  protected static final String READ_ALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReadAll() <em>Read All</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getReadAll()
   * @generated
   * @ordered
   */
  protected String readAll = READ_ALL_EDEFAULT;

  /**
   * The default value of the '{@link #getReadObject() <em>Read Object</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getReadObject()
   * @generated
   * @ordered
   */
  protected static final String READ_OBJECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReadObject() <em>Read Object</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getReadObject()
   * @generated
   * @ordered
   */
  protected String readObject = READ_OBJECT_EDEFAULT;

  /**
   * The default value of the '{@link #getReport() <em>Report</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getReport()
   * @generated
   * @ordered
   */
  protected static final String REPORT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReport() <em>Report</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getReport()
   * @generated
   * @ordered
   */
  protected String report = REPORT_EDEFAULT;

  /**
   * The default value of the '{@link #getUpdate() <em>Update</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getUpdate()
   * @generated
   * @ordered
   */
  protected static final String UPDATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUpdate() <em>Update</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getUpdate()
   * @generated
   * @ordered
   */
  protected String update = UPDATE_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected QueryRedirectorsImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getQueryRedirectors();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getAllQueries() {
    return allQueries;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAllQueries(String newAllQueries) {
    String oldAllQueries = allQueries;
    allQueries = newAllQueries;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.QUERY_REDIRECTORS__ALL_QUERIES, oldAllQueries, allQueries));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getDelete() {
    return delete;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDelete(String newDelete) {
    String oldDelete = delete;
    delete = newDelete;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.QUERY_REDIRECTORS__DELETE, oldDelete, delete));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getInsert() {
    return insert;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInsert(String newInsert) {
    String oldInsert = insert;
    insert = newInsert;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.QUERY_REDIRECTORS__INSERT, oldInsert, insert));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getReadAll() {
    return readAll;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setReadAll(String newReadAll) {
    String oldReadAll = readAll;
    readAll = newReadAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.QUERY_REDIRECTORS__READ_ALL, oldReadAll, readAll));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getReadObject() {
    return readObject;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setReadObject(String newReadObject) {
    String oldReadObject = readObject;
    readObject = newReadObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.QUERY_REDIRECTORS__READ_OBJECT, oldReadObject, readObject));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getReport() {
    return report;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setReport(String newReport) {
    String oldReport = report;
    report = newReport;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.QUERY_REDIRECTORS__REPORT, oldReport, report));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getUpdate() {
    return update;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setUpdate(String newUpdate) {
    String oldUpdate = update;
    update = newUpdate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.QUERY_REDIRECTORS__UPDATE, oldUpdate, update));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.QUERY_REDIRECTORS__ALL_QUERIES:
        return getAllQueries();
      case OrmPackage.QUERY_REDIRECTORS__DELETE:
        return getDelete();
      case OrmPackage.QUERY_REDIRECTORS__INSERT:
        return getInsert();
      case OrmPackage.QUERY_REDIRECTORS__READ_ALL:
        return getReadAll();
      case OrmPackage.QUERY_REDIRECTORS__READ_OBJECT:
        return getReadObject();
      case OrmPackage.QUERY_REDIRECTORS__REPORT:
        return getReport();
      case OrmPackage.QUERY_REDIRECTORS__UPDATE:
        return getUpdate();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmPackage.QUERY_REDIRECTORS__ALL_QUERIES:
        setAllQueries((String)newValue);
        return;
      case OrmPackage.QUERY_REDIRECTORS__DELETE:
        setDelete((String)newValue);
        return;
      case OrmPackage.QUERY_REDIRECTORS__INSERT:
        setInsert((String)newValue);
        return;
      case OrmPackage.QUERY_REDIRECTORS__READ_ALL:
        setReadAll((String)newValue);
        return;
      case OrmPackage.QUERY_REDIRECTORS__READ_OBJECT:
        setReadObject((String)newValue);
        return;
      case OrmPackage.QUERY_REDIRECTORS__REPORT:
        setReport((String)newValue);
        return;
      case OrmPackage.QUERY_REDIRECTORS__UPDATE:
        setUpdate((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case OrmPackage.QUERY_REDIRECTORS__ALL_QUERIES:
        setAllQueries(ALL_QUERIES_EDEFAULT);
        return;
      case OrmPackage.QUERY_REDIRECTORS__DELETE:
        setDelete(DELETE_EDEFAULT);
        return;
      case OrmPackage.QUERY_REDIRECTORS__INSERT:
        setInsert(INSERT_EDEFAULT);
        return;
      case OrmPackage.QUERY_REDIRECTORS__READ_ALL:
        setReadAll(READ_ALL_EDEFAULT);
        return;
      case OrmPackage.QUERY_REDIRECTORS__READ_OBJECT:
        setReadObject(READ_OBJECT_EDEFAULT);
        return;
      case OrmPackage.QUERY_REDIRECTORS__REPORT:
        setReport(REPORT_EDEFAULT);
        return;
      case OrmPackage.QUERY_REDIRECTORS__UPDATE:
        setUpdate(UPDATE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case OrmPackage.QUERY_REDIRECTORS__ALL_QUERIES:
        return ALL_QUERIES_EDEFAULT == null ? allQueries != null : !ALL_QUERIES_EDEFAULT.equals(allQueries);
      case OrmPackage.QUERY_REDIRECTORS__DELETE:
        return DELETE_EDEFAULT == null ? delete != null : !DELETE_EDEFAULT.equals(delete);
      case OrmPackage.QUERY_REDIRECTORS__INSERT:
        return INSERT_EDEFAULT == null ? insert != null : !INSERT_EDEFAULT.equals(insert);
      case OrmPackage.QUERY_REDIRECTORS__READ_ALL:
        return READ_ALL_EDEFAULT == null ? readAll != null : !READ_ALL_EDEFAULT.equals(readAll);
      case OrmPackage.QUERY_REDIRECTORS__READ_OBJECT:
        return READ_OBJECT_EDEFAULT == null ? readObject != null : !READ_OBJECT_EDEFAULT.equals(readObject);
      case OrmPackage.QUERY_REDIRECTORS__REPORT:
        return REPORT_EDEFAULT == null ? report != null : !REPORT_EDEFAULT.equals(report);
      case OrmPackage.QUERY_REDIRECTORS__UPDATE:
        return UPDATE_EDEFAULT == null ? update != null : !UPDATE_EDEFAULT.equals(update);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (allQueries: "); //$NON-NLS-1$
    result.append(allQueries);
    result.append(", delete: "); //$NON-NLS-1$
    result.append(delete);
    result.append(", insert: "); //$NON-NLS-1$
    result.append(insert);
    result.append(", readAll: "); //$NON-NLS-1$
    result.append(readAll);
    result.append(", readObject: "); //$NON-NLS-1$
    result.append(readObject);
    result.append(", report: "); //$NON-NLS-1$
    result.append(report);
    result.append(", update: "); //$NON-NLS-1$
    result.append(update);
    result.append(')');
    return result.toString();
  }

} // QueryRedirectorsImpl
