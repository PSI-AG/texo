package org.eclipse.emf.texo.test.model.samples.rental;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>RentalContract</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "rental_RentalContract")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class RentalContract extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String rentToBusinessPartner = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Temporal(TemporalType.DATE)
  private Date startDate = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Temporal(TemporalType.DATE)
  private Date endDate = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private float cost = 0.0f;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<RentalContractLine> rentalContractLines = new ArrayList<RentalContractLine>();

  /**
   * Returns the value of '<em><b>rentToBusinessPartner</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>rentToBusinessPartner</b></em>' feature
   * @generated
   */
  public String getRentToBusinessPartner() {
    return rentToBusinessPartner;
  }

  /**
   * Sets the '{@link RentalContract#getRentToBusinessPartner() <em>rentToBusinessPartner</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newRentToBusinessPartner
   *          the new value of the '{@link RentalContract#getRentToBusinessPartner() rentToBusinessPartner}' feature.
   * @generated
   */
  public void setRentToBusinessPartner(String newRentToBusinessPartner) {
    rentToBusinessPartner = newRentToBusinessPartner;
  }

  /**
   * Returns the value of '<em><b>startDate</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>startDate</b></em>' feature
   * @generated
   */
  public Date getStartDate() {
    return startDate;
  }

  /**
   * Sets the '{@link RentalContract#getStartDate() <em>startDate</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStartDate
   *          the new value of the '{@link RentalContract#getStartDate() startDate}' feature.
   * @generated
   */
  public void setStartDate(Date newStartDate) {
    startDate = newStartDate;
  }

  /**
   * Returns the value of '<em><b>endDate</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>endDate</b></em>' feature
   * @generated
   */
  public Date getEndDate() {
    return endDate;
  }

  /**
   * Sets the '{@link RentalContract#getEndDate() <em>endDate</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEndDate
   *          the new value of the '{@link RentalContract#getEndDate() endDate}' feature.
   * @generated
   */
  public void setEndDate(Date newEndDate) {
    endDate = newEndDate;
  }

  /**
   * Returns the value of '<em><b>cost</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>cost</b></em>' feature
   * @generated
   */
  public float getCost() {
    return cost;
  }

  /**
   * Sets the '{@link RentalContract#getCost() <em>cost</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCost
   *          the new value of the '{@link RentalContract#getCost() cost}' feature.
   * @generated
   */
  public void setCost(float newCost) {
    cost = newCost;
  }

  /**
   * Returns the value of '<em><b>rentalContractLines</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>rentalContractLines</b></em>' feature
   * @generated
   */
  public List<RentalContractLine> getRentalContractLines() {
    return rentalContractLines;
  }

  /**
   * Adds to the <em>rentalContractLines</em> feature.
   * 
   * @param rentalContractLinesValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToRentalContractLines(RentalContractLine rentalContractLinesValue) {
    if (!rentalContractLines.contains(rentalContractLinesValue)) {
      boolean result = rentalContractLines.add(rentalContractLinesValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>rentalContractLines</em> feature.
   * 
   * @param rentalContractLinesValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromRentalContractLines(RentalContractLine rentalContractLinesValue) {
    if (rentalContractLines.contains(rentalContractLinesValue)) {
      boolean result = rentalContractLines.remove(rentalContractLinesValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>rentalContractLines</em> feature.
   * 
   * @generated
   */
  public void clearRentalContractLines() {
    while (!rentalContractLines.isEmpty()) {
      removeFromRentalContractLines(rentalContractLines.iterator().next());
    }
  }

  /**
   * Sets the '{@link RentalContract#getRentalContractLines() <em>rentalContractLines</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newRentalContractLines
   *          the new value of the '{@link RentalContract#getRentalContractLines() rentalContractLines}' feature.
   * @generated
   */
  public void setRentalContractLines(List<RentalContractLine> newRentalContractLines) {
    rentalContractLines = newRentalContractLines;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "RentalContract " + " [rentToBusinessPartner: " + getRentToBusinessPartner() + "]" + " [startDate: "
        + getStartDate() + "]" + " [endDate: " + getEndDate() + "]" + " [cost: " + getCost() + "]";
  }
}
