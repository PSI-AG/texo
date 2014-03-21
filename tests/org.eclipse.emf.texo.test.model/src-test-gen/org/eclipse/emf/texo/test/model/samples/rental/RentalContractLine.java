package org.eclipse.emf.texo.test.model.samples.rental;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>RentalContractLine</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "rental_RentalContractLine")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class RentalContractLine extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn() })
  private RentalContract rentalContract = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private long number = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private RentalUnit rentalUnit = null;

  /**
   * Returns the value of '<em><b>rentalContract</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>rentalContract</b></em>' feature
   * @generated
   */
  public RentalContract getRentalContract() {
    return rentalContract;
  }

  /**
   * Sets the '{@link RentalContractLine#getRentalContract() <em>rentalContract</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newRentalContract
   *          the new value of the '{@link RentalContractLine#getRentalContract() rentalContract}' feature.
   * @generated
   */
  public void setRentalContract(RentalContract newRentalContract) {
    rentalContract = newRentalContract;
  }

  /**
   * Returns the value of '<em><b>number</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>number</b></em>' feature
   * @generated
   */
  public long getNumber() {
    return number;
  }

  /**
   * Sets the '{@link RentalContractLine#getNumber() <em>number</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNumber
   *          the new value of the '{@link RentalContractLine#getNumber() number}' feature.
   * @generated
   */
  public void setNumber(long newNumber) {
    number = newNumber;
  }

  /**
   * Returns the value of '<em><b>rentalUnit</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>rentalUnit</b></em>' feature
   * @generated
   */
  public RentalUnit getRentalUnit() {
    return rentalUnit;
  }

  /**
   * Sets the '{@link RentalContractLine#getRentalUnit() <em>rentalUnit</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newRentalUnit
   *          the new value of the '{@link RentalContractLine#getRentalUnit() rentalUnit}' feature.
   * @generated
   */
  public void setRentalUnit(RentalUnit newRentalUnit) {
    rentalUnit = newRentalUnit;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "RentalContractLine " + " [number: " + getNumber() + "]";
  }
}
