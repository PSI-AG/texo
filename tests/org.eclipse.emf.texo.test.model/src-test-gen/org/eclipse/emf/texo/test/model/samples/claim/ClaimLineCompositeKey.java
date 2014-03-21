package org.eclipse.emf.texo.test.model.samples.claim;

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
 * A representation of the model object '<em><b>ClaimLineCompositeKey</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "claim_ClaimLineCompositeKey")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ClaimLineCompositeKey extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A generated key to uniquely the parent <!--
   * end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  private Claim claim = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * The Unique Identifier for a Claim. <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String claimLineNumber = null;

  /**
   * Returns the value of '<em><b>claim</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A generated key to uniquely the parent <!--
   * end-model-doc -->
   * 
   * @return the value of '<em><b>claim</b></em>' feature
   * @generated
   */
  public Claim getClaim() {
    return claim;
  }

  /**
   * Sets the '{@link ClaimLineCompositeKey#getClaim() <em>claim</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A generated key to uniquely the parent <!--
   * end-model-doc -->
   * 
   * @param newClaim
   *          the new value of the '{@link ClaimLineCompositeKey#getClaim() claim}' feature.
   * @generated
   */
  public void setClaim(Claim newClaim) {
    claim = newClaim;
  }

  /**
   * Returns the value of '<em><b>claimLineNumber</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * The Unique Identifier for a Claim. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>claimLineNumber</b></em>' feature
   * @generated
   */
  public String getClaimLineNumber() {
    return claimLineNumber;
  }

  /**
   * Sets the '{@link ClaimLineCompositeKey#getClaimLineNumber() <em>claimLineNumber</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * The Unique Identifier for a Claim. <!-- end-model-doc -->
   * 
   * @param newClaimLineNumber
   *          the new value of the '{@link ClaimLineCompositeKey#getClaimLineNumber() claimLineNumber}' feature.
   * @generated
   */
  public void setClaimLineNumber(String newClaimLineNumber) {
    claimLineNumber = newClaimLineNumber;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ClaimLineCompositeKey " + " [claimLineNumber: " + getClaimLineNumber() + "]";
  }
}
