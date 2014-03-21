package org.eclipse.emf.texo.server.model.response;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ErrorType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "response_ErrorType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ErrorType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String errorClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String message = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String stackTrace = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private ErrorType cause = null;

  /**
   * Returns the value of '<em><b>errorClass</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>errorClass</b></em>' feature
   * @generated
   */
  public String getErrorClass() {
    return errorClass;
  }

  /**
   * Sets the '{@link ErrorType#getErrorClass() <em>errorClass</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newErrorClass
   *          the new value of the '{@link ErrorType#getErrorClass() errorClass}' feature.
   * @generated
   */
  public void setErrorClass(String newErrorClass) {
    errorClass = newErrorClass;
  }

  /**
   * Returns the value of '<em><b>message</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>message</b></em>' feature
   * @generated
   */
  public String getMessage() {
    return message;
  }

  /**
   * Sets the '{@link ErrorType#getMessage() <em>message</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMessage
   *          the new value of the '{@link ErrorType#getMessage() message}' feature.
   * @generated
   */
  public void setMessage(String newMessage) {
    message = newMessage;
  }

  /**
   * Returns the value of '<em><b>stackTrace</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>stackTrace</b></em>' feature
   * @generated
   */
  public String getStackTrace() {
    return stackTrace;
  }

  /**
   * Sets the '{@link ErrorType#getStackTrace() <em>stackTrace</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStackTrace
   *          the new value of the '{@link ErrorType#getStackTrace() stackTrace}' feature.
   * @generated
   */
  public void setStackTrace(String newStackTrace) {
    stackTrace = newStackTrace;
  }

  /**
   * Returns the value of '<em><b>cause</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>cause</b></em>' feature
   * @generated
   */
  public ErrorType getCause() {
    return cause;
  }

  /**
   * Sets the '{@link ErrorType#getCause() <em>cause</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCause
   *          the new value of the '{@link ErrorType#getCause() cause}' feature.
   * @generated
   */
  public void setCause(ErrorType newCause) {
    cause = newCause;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ErrorType " + " [errorClass: " + getErrorClass() + "]" + " [message: " + getMessage() + "]"
        + " [stackTrace: " + getStackTrace() + "]";
  }
}
