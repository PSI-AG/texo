package org.eclipse.emf.texo.test.model.samples.catalog;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ProductType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> My producttype documentation <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "catalog_ProductType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ProductType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String code = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> My description documentation <!--
   * end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String description = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<StringType> remark = new ArrayList<StringType>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private PriceType price = null;

  /**
   * Returns the value of '<em><b>code</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>code</b></em>' feature
   * @generated
   */
  public String getCode() {
    return code;
  }

  /**
   * Sets the '{@link ProductType#getCode() <em>code</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCode
   *          the new value of the '{@link ProductType#getCode() code}' feature.
   * @generated
   */
  public void setCode(String newCode) {
    code = newCode;
  }

  /**
   * Returns the value of '<em><b>description</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> My description documentation <!--
   * end-model-doc -->
   * 
   * @return the value of '<em><b>description</b></em>' feature
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the '{@link ProductType#getDescription() <em>description</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> My description documentation <!--
   * end-model-doc -->
   * 
   * @param newDescription
   *          the new value of the '{@link ProductType#getDescription() description}' feature.
   * @generated
   */
  public void setDescription(String newDescription) {
    description = newDescription;
  }

  /**
   * Returns the value of '<em><b>remark</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>remark</b></em>' feature
   * @generated
   */
  public List<StringType> getRemark() {
    return remark;
  }

  /**
   * Adds to the <em>remark</em> feature.
   * 
   * @param remarkValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToRemark(StringType remarkValue) {
    if (!remark.contains(remarkValue)) {
      boolean result = remark.add(remarkValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>remark</em> feature.
   * 
   * @param remarkValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromRemark(StringType remarkValue) {
    if (remark.contains(remarkValue)) {
      boolean result = remark.remove(remarkValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>remark</em> feature.
   * 
   * @generated
   */
  public void clearRemark() {
    while (!remark.isEmpty()) {
      removeFromRemark(remark.iterator().next());
    }
  }

  /**
   * Sets the '{@link ProductType#getRemark() <em>remark</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newRemark
   *          the new value of the '{@link ProductType#getRemark() remark}' feature.
   * @generated
   */
  public void setRemark(List<StringType> newRemark) {
    remark = newRemark;
  }

  /**
   * Returns the value of '<em><b>price</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>price</b></em>' feature
   * @generated
   */
  public PriceType getPrice() {
    return price;
  }

  /**
   * Sets the '{@link ProductType#getPrice() <em>price</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPrice
   *          the new value of the '{@link ProductType#getPrice() price}' feature.
   * @generated
   */
  public void setPrice(PriceType newPrice) {
    price = newPrice;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ProductType " + " [code: " + getCode() + "]" + " [description: " + getDescription() + "]";
  }
}
