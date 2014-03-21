package org.eclipse.emf.texo.test.model.samples.jpamixed;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>LetterBodyType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "jpamixed_LetterBodyType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class LetterBodyType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = LetterBodyTypeMixedFeatureGroup.class)
  @JoinTable()
  private List<LetterBodyTypeMixedFeatureGroup> mixed = new ArrayList<LetterBodyTypeMixedFeatureGroup>();

  /**
   * Returns the value of '<em><b>mixed</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>mixed</b></em>' feature
   * @generated
   */
  public List<LetterBodyTypeMixedFeatureGroup> getMixed() {
    return mixed;
  }

  /**
   * Sets the '{@link LetterBodyType#getMixed() <em>mixed</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMixed
   *          the new value of the '{@link LetterBodyType#getMixed() mixed}' feature.
   * @generated
   */
  public void setMixed(List<LetterBodyTypeMixedFeatureGroup> newMixed) {
    mixed = newMixed;
  }

  /**
   * Returns the value of '<em><b>salutation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>salutation</b></em>' feature
   * @generated
   */
  public SalutationType getSalutation() {
    return LetterBodyTypeMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        LetterBodyTypeMixedFeatureGroup.Feature.SALUTATION);
  }

  /**
   * Sets the '{@link LetterBodyType#getSalutation() <em>salutation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSalutation
   *          the new value of the '{@link LetterBodyType#getSalutation() salutation}' feature.
   * @generated
   */
  public void setSalutation(SalutationType newSalutation) {
    LetterBodyTypeMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        LetterBodyTypeMixedFeatureGroup.Feature.SALUTATION, newSalutation);
  }

  /**
   * Returns the value of '<em><b>quantity</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>quantity</b></em>' feature
   * @generated
   */
  public BigInteger getQuantity() {
    return LetterBodyTypeMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        LetterBodyTypeMixedFeatureGroup.Feature.QUANTITY);
  }

  /**
   * Sets the '{@link LetterBodyType#getQuantity() <em>quantity</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newQuantity
   *          the new value of the '{@link LetterBodyType#getQuantity() quantity}' feature.
   * @generated
   */
  public void setQuantity(BigInteger newQuantity) {
    LetterBodyTypeMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        LetterBodyTypeMixedFeatureGroup.Feature.QUANTITY, newQuantity);
  }

  /**
   * Returns the value of '<em><b>productName</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>productName</b></em>' feature
   * @generated
   */
  public String getProductName() {
    return LetterBodyTypeMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        LetterBodyTypeMixedFeatureGroup.Feature.PRODUCTNAME);
  }

  /**
   * Sets the '{@link LetterBodyType#getProductName() <em>productName</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newProductName
   *          the new value of the '{@link LetterBodyType#getProductName() productName}' feature.
   * @generated
   */
  public void setProductName(String newProductName) {
    LetterBodyTypeMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        LetterBodyTypeMixedFeatureGroup.Feature.PRODUCTNAME, newProductName);
  }

  /**
   * Returns the value of '<em><b>shipDate</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>shipDate</b></em>' feature
   * @generated
   */
  public Date getShipDate() {
    return LetterBodyTypeMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        LetterBodyTypeMixedFeatureGroup.Feature.SHIPDATE);
  }

  /**
   * Sets the '{@link LetterBodyType#getShipDate() <em>shipDate</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newShipDate
   *          the new value of the '{@link LetterBodyType#getShipDate() shipDate}' feature.
   * @generated
   */
  public void setShipDate(Date newShipDate) {
    LetterBodyTypeMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        LetterBodyTypeMixedFeatureGroup.Feature.SHIPDATE, newShipDate);
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "LetterBodyType " + " [quantity: " + getQuantity() + "]" + " [productName: " + getProductName() + "]"
        + " [shipDate: " + getShipDate() + "]";
  }
}
