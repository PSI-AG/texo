package org.eclipse.emf.texo.test.model.samples.catalog;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>CatalogType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "catalog_CatalogType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class CatalogType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  private List<CatalogType> subCatalog = new ArrayList<CatalogType>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> My product documentation <!-- end-model-doc
   * -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  private List<ProductType> product = new ArrayList<ProductType>();

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link CatalogType#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link CatalogType#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>description</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>description</b></em>' feature
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the '{@link CatalogType#getDescription() <em>description</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDescription
   *          the new value of the '{@link CatalogType#getDescription() description}' feature.
   * @generated
   */
  public void setDescription(String newDescription) {
    description = newDescription;
  }

  /**
   * Returns the value of '<em><b>subCatalog</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>subCatalog</b></em>' feature
   * @generated
   */
  public List<CatalogType> getSubCatalog() {
    return subCatalog;
  }

  /**
   * Adds to the <em>subCatalog</em> feature.
   * 
   * @param subCatalogValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToSubCatalog(CatalogType subCatalogValue) {
    if (!subCatalog.contains(subCatalogValue)) {
      boolean result = subCatalog.add(subCatalogValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>subCatalog</em> feature.
   * 
   * @param subCatalogValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromSubCatalog(CatalogType subCatalogValue) {
    if (subCatalog.contains(subCatalogValue)) {
      boolean result = subCatalog.remove(subCatalogValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>subCatalog</em> feature.
   * 
   * @generated
   */
  public void clearSubCatalog() {
    while (!subCatalog.isEmpty()) {
      removeFromSubCatalog(subCatalog.iterator().next());
    }
  }

  /**
   * Sets the '{@link CatalogType#getSubCatalog() <em>subCatalog</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSubCatalog
   *          the new value of the '{@link CatalogType#getSubCatalog() subCatalog}' feature.
   * @generated
   */
  public void setSubCatalog(List<CatalogType> newSubCatalog) {
    subCatalog = newSubCatalog;
  }

  /**
   * Returns the value of '<em><b>product</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> My product documentation <!-- end-model-doc
   * -->
   * 
   * @return the value of '<em><b>product</b></em>' feature
   * @generated
   */
  public List<ProductType> getProduct() {
    return product;
  }

  /**
   * Adds to the <em>product</em> feature.
   * 
   * @param productValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToProduct(ProductType productValue) {
    if (!product.contains(productValue)) {
      boolean result = product.add(productValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>product</em> feature.
   * 
   * @param productValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromProduct(ProductType productValue) {
    if (product.contains(productValue)) {
      boolean result = product.remove(productValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>product</em> feature.
   * 
   * @generated
   */
  public void clearProduct() {
    while (!product.isEmpty()) {
      removeFromProduct(product.iterator().next());
    }
  }

  /**
   * Sets the '{@link CatalogType#getProduct() <em>product</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> My product documentation <!-- end-model-doc
   * -->
   * 
   * @param newProduct
   *          the new value of the '{@link CatalogType#getProduct() product}' feature.
   * @generated
   */
  public void setProduct(List<ProductType> newProduct) {
    product = newProduct;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "CatalogType " + " [name: " + getName() + "]" + " [description: " + getDescription() + "]";
  }
}
