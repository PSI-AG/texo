/**
 * <copyright>
 * </copyright>
 *
 * $Id: CloneCopyPolicy.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Clone Copy Policy</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <!-- begin-model-doc -->
 * 
 * * * A CloneCopyPolicy is used to set an * org.eclipse.persistence.descriptors.copying.CloneCopyPolicy on an * Entity.
 * A CloneCopyPolicy must specify at one or both of the "method" * or "workingCopyMethod". "workingCopyMethod" is used
 * to clone objects * that will be returned to the user as they are registered in * EclipseLink's transactional
 * mechanism, the UnitOfWork. "method" will * be used for the clone that is used for comparison in conjunction with *
 * EclipseLink's DeferredChangeDetectionPolicy * * A CloneCopyPolicy should be specified on an Entity, MappedSuperclass
 * * or Embeddable. * * Example: * @Entity * @CloneCopyPolicy(method="myCloneMethod") * * or: * * @Entity *
 * 
 * @CloneCopyPolicy(method="myCloneMethod", workingCopyMethod="myWorkingCopyCloneMethod") * * or: * * @Entity *
 * @CloneCopyPolicy(workingCopyMethodName="myWorkingCopyClone") * public @interface CloneCopyPolicy {
 * 
 *                                                              * * (Optional) * Either method or workingCopyMethod must
 *                                                              be specified this defines * a method that will be used
 *                                                              to create a clone that will be used * for comparison by
 *                                                              * EclipseLink's DeferredChangeDetectionPolicy * String
 *                                                              method();
 * 
 *                                                              * * (Optional) * Either method or workingCopyMethod must
 *                                                              be specified * this defines a method that will be used
 *                                                              to create a clone that * will be used to create the
 *                                                              object returned when registering an * Object in an
 *                                                              EclipseLink UnitOfWork * String workingCopyMethod();
 * 
 *                                                              }
 * 
 *                                                              <!-- end-model-doc -->
 * 
 *                                                              <p>
 *                                                              The following features are supported:
 *                                                              <ul>
 *                                                              <li>
 *                                                              {@link org.eclipse.emf.texo.orm.annotations.model.orm.CloneCopyPolicy#getMethod
 *                                                              <em>Method</em>}</li>
 *                                                              <li>
 *                                                              {@link org.eclipse.emf.texo.orm.annotations.model.orm.CloneCopyPolicy#getWorkingCopyMethod
 *                                                              <em>Working Copy Method</em>}</li>
 *                                                              </ul>
 *                                                              </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCloneCopyPolicy()
 * @model extendedMetaData="name='clone-copy-policy' kind='empty'"
 * @generated
 */
public interface CloneCopyPolicy extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see #setMethod(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCloneCopyPolicy_Method()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='method'"
   * @generated
   */
  String getMethod();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CloneCopyPolicy#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
  void setMethod(String value);

  /**
   * Returns the value of the '<em><b>Working Copy Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Working Copy Method</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Working Copy Method</em>' attribute.
   * @see #setWorkingCopyMethod(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCloneCopyPolicy_WorkingCopyMethod()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='working-copy-method'"
   * @generated
   */
  String getWorkingCopyMethod();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CloneCopyPolicy#getWorkingCopyMethod <em>Working Copy Method</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Working Copy Method</em>' attribute.
   * @see #getWorkingCopyMethod()
   * @generated
   */
  void setWorkingCopyMethod(String value);

} // CloneCopyPolicy
