package org.eclipse.emf.texo.test.model.samples.claim;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ClaimCompositeKey</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "claim_ClaimCompositeKey")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ClaimCompositeKey extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * The Unique Identifier for a Claim. <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String claimNumber = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * The Unique Identifier for a Claim. <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String claimExtensionNumber = null;

  /**
   * Returns the value of '<em><b>claimNumber</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * The Unique Identifier for a Claim. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>claimNumber</b></em>' feature
   * @generated
   */
  public String getClaimNumber() {
    return claimNumber;
  }

  /**
   * Sets the '{@link ClaimCompositeKey#getClaimNumber() <em>claimNumber</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * The Unique Identifier for a Claim. <!-- end-model-doc -->
   * 
   * @param newClaimNumber
   *          the new value of the '{@link ClaimCompositeKey#getClaimNumber() claimNumber}' feature.
   * @generated
   */
  public void setClaimNumber(String newClaimNumber) {
    claimNumber = newClaimNumber;
  }

  /**
   * Returns the value of '<em><b>claimExtensionNumber</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * The Unique Identifier for a Claim. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>claimExtensionNumber</b></em>' feature
   * @generated
   */
  public String getClaimExtensionNumber() {
    return claimExtensionNumber;
  }

  /**
   * Sets the '{@link ClaimCompositeKey#getClaimExtensionNumber() <em>claimExtensionNumber</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * The Unique Identifier for a Claim. <!-- end-model-doc -->
   * 
   * @param newClaimExtensionNumber
   *          the new value of the '{@link ClaimCompositeKey#getClaimExtensionNumber() claimExtensionNumber}' feature.
   * @generated
   */
  public void setClaimExtensionNumber(String newClaimExtensionNumber) {
    claimExtensionNumber = newClaimExtensionNumber;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ClaimCompositeKey " + " [claimNumber: " + getClaimNumber() + "]" + " [claimExtensionNumber: "
        + getClaimExtensionNumber() + "]";
  }
}
