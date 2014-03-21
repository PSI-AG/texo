package org.eclipse.emf.texo.test.model.samples.extlibrary.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.Employee;
import org.eclipse.emf.texo.test.model.samples.extlibrary.ExtlibraryModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Employee</b></em>'.
 * 
 * @generated
 */
public class EmployeeDao extends BaseDao<Employee> {

  /**
   * @generated
   */
  @Override
  public Class<Employee> getEntityClass() {
    return Employee.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ExtlibraryModelPackage.INSTANCE.getEmployeeEClass();
  }
}
