/**
 * <copyright>
 * </copyright>
 *
 * $Id: TimeOfDay.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.math.BigInteger;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Time Of Day</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({})
 * 				@Retention(RUNTIME)
 * 				public @interface TimeOfDay {
 * 				/**
 * 				* (Optional) Hour of the day.
 * 				**
 * 				int hour() default 0;
 * 
 * 				/**
 * 				* (Optional) Minute of the day.
 * 				**
 * 				int minute() default 0;
 * 
 * 				/**
 * 				* (Optional) Second of the day.
 * 				**
 * 				int second() default 0;
 * 
 * 				/**
 * 				* (Optional) Millisecond of the day.
 * 				**
 * 				int millisecond() default 0;
 * 
 * 				/**
 * 				* Internal use. Do not modify.
 * 				**
 * 				boolean specified() default true;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getHour <em>Hour</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getMillisecond <em>Millisecond</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getMinute <em>Minute</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTimeOfDay()
 * @model extendedMetaData="name='time-of-day' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface TimeOfDay extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Hour</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hour</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hour</em>' attribute.
   * @see #setHour(BigInteger)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTimeOfDay_Hour()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='hour'"
   * @generated
   */
  BigInteger getHour();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getHour <em>Hour</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Hour</em>' attribute.
   * @see #getHour()
   * @generated
   */
  void setHour(BigInteger value);

  /**
   * Returns the value of the '<em><b>Millisecond</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Millisecond</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Millisecond</em>' attribute.
   * @see #setMillisecond(BigInteger)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTimeOfDay_Millisecond()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='millisecond'"
   * @generated
   */
  BigInteger getMillisecond();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getMillisecond <em>Millisecond</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Millisecond</em>' attribute.
   * @see #getMillisecond()
   * @generated
   */
  void setMillisecond(BigInteger value);

  /**
   * Returns the value of the '<em><b>Minute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minute</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minute</em>' attribute.
   * @see #setMinute(BigInteger)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTimeOfDay_Minute()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='minute'"
   * @generated
   */
  BigInteger getMinute();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getMinute <em>Minute</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Minute</em>' attribute.
   * @see #getMinute()
   * @generated
   */
  void setMinute(BigInteger value);

  /**
   * Returns the value of the '<em><b>Second</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second</em>' attribute.
   * @see #setSecond(BigInteger)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTimeOfDay_Second()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='second'"
   * @generated
   */
  BigInteger getSecond();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getSecond <em>Second</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Second</em>' attribute.
   * @see #getSecond()
   * @generated
   */
  void setSecond(BigInteger value);

} // TimeOfDay
