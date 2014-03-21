package org.eclipse.emf.texo.test.model.schemaconstructs.restriction;

import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>XMLDeviant</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "restriction_XMLDeviant")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class XMLDeviant extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private BigInteger numPosts = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String signature = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String email = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Temporal(TemporalType.DATE)
  private Date firstSubscribed = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String mailReader = null;

  /**
   * Returns the value of '<em><b>numPosts</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>numPosts</b></em>' feature
   * @generated
   */
  public BigInteger getNumPosts() {
    return numPosts;
  }

  /**
   * Sets the '{@link XMLDeviant#getNumPosts() <em>numPosts</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNumPosts
   *          the new value of the '{@link XMLDeviant#getNumPosts() numPosts}' feature.
   * @generated
   */
  public void setNumPosts(BigInteger newNumPosts) {
    numPosts = newNumPosts;
  }

  /**
   * Returns the value of '<em><b>signature</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>signature</b></em>' feature
   * @generated
   */
  public String getSignature() {
    return signature;
  }

  /**
   * Sets the '{@link XMLDeviant#getSignature() <em>signature</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSignature
   *          the new value of the '{@link XMLDeviant#getSignature() signature}' feature.
   * @generated
   */
  public void setSignature(String newSignature) {
    signature = newSignature;
  }

  /**
   * Returns the value of '<em><b>email</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>email</b></em>' feature
   * @generated
   */
  public String getEmail() {
    return email;
  }

  /**
   * Sets the '{@link XMLDeviant#getEmail() <em>email</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEmail
   *          the new value of the '{@link XMLDeviant#getEmail() email}' feature.
   * @generated
   */
  public void setEmail(String newEmail) {
    email = newEmail;
  }

  /**
   * Returns the value of '<em><b>firstSubscribed</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>firstSubscribed</b></em>' feature
   * @generated
   */
  public Date getFirstSubscribed() {
    return firstSubscribed;
  }

  /**
   * Sets the '{@link XMLDeviant#getFirstSubscribed() <em>firstSubscribed</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFirstSubscribed
   *          the new value of the '{@link XMLDeviant#getFirstSubscribed() firstSubscribed}' feature.
   * @generated
   */
  public void setFirstSubscribed(Date newFirstSubscribed) {
    firstSubscribed = newFirstSubscribed;
  }

  /**
   * Returns the value of '<em><b>mailReader</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>mailReader</b></em>' feature
   * @generated
   */
  public String getMailReader() {
    return mailReader;
  }

  /**
   * Sets the '{@link XMLDeviant#getMailReader() <em>mailReader</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMailReader
   *          the new value of the '{@link XMLDeviant#getMailReader() mailReader}' feature.
   * @generated
   */
  public void setMailReader(String newMailReader) {
    mailReader = newMailReader;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "XMLDeviant " + " [numPosts: " + getNumPosts() + "]" + " [signature: " + getSignature() + "]" + " [email: "
        + getEmail() + "]" + " [firstSubscribed: " + getFirstSubscribed() + "]" + " [mailReader: " + getMailReader()
        + "]";
  }
}
