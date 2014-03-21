package org.eclipse.emf.texo.test.model.samples.sunbooks;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>BookType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "sunBooks_BookType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class BookType extends Identifiable {

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
  private long iSBN = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String price = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private AuthorsType authors = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String description = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private PromotionType promotion = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Temporal(TemporalType.DATE)
  private Date publicationDate = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Enumerated(EnumType.STRING)
  private BookCategoryType1 bookCategory = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String itemId = null;

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
   * Sets the '{@link BookType#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link BookType#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>iSBN</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>iSBN</b></em>' feature
   * @generated
   */
  public long getISBN() {
    return iSBN;
  }

  /**
   * Sets the '{@link BookType#getISBN() <em>iSBN</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newISBN
   *          the new value of the '{@link BookType#getISBN() iSBN}' feature.
   * @generated
   */
  public void setISBN(long newISBN) {
    iSBN = newISBN;
  }

  /**
   * Returns the value of '<em><b>price</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>price</b></em>' feature
   * @generated
   */
  public String getPrice() {
    return price;
  }

  /**
   * Sets the '{@link BookType#getPrice() <em>price</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPrice
   *          the new value of the '{@link BookType#getPrice() price}' feature.
   * @generated
   */
  public void setPrice(String newPrice) {
    price = newPrice;
  }

  /**
   * Returns the value of '<em><b>authors</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>authors</b></em>' feature
   * @generated
   */
  public AuthorsType getAuthors() {
    return authors;
  }

  /**
   * Sets the '{@link BookType#getAuthors() <em>authors</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAuthors
   *          the new value of the '{@link BookType#getAuthors() authors}' feature.
   * @generated
   */
  public void setAuthors(AuthorsType newAuthors) {
    authors = newAuthors;
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
   * Sets the '{@link BookType#getDescription() <em>description</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDescription
   *          the new value of the '{@link BookType#getDescription() description}' feature.
   * @generated
   */
  public void setDescription(String newDescription) {
    description = newDescription;
  }

  /**
   * Returns the value of '<em><b>promotion</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>promotion</b></em>' feature
   * @generated
   */
  public PromotionType getPromotion() {
    return promotion;
  }

  /**
   * Sets the '{@link BookType#getPromotion() <em>promotion</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPromotion
   *          the new value of the '{@link BookType#getPromotion() promotion}' feature.
   * @generated
   */
  public void setPromotion(PromotionType newPromotion) {
    promotion = newPromotion;
  }

  /**
   * Returns the value of '<em><b>publicationDate</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>publicationDate</b></em>' feature
   * @generated
   */
  public Date getPublicationDate() {
    return publicationDate;
  }

  /**
   * Sets the '{@link BookType#getPublicationDate() <em>publicationDate</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPublicationDate
   *          the new value of the '{@link BookType#getPublicationDate() publicationDate}' feature.
   * @generated
   */
  public void setPublicationDate(Date newPublicationDate) {
    publicationDate = newPublicationDate;
  }

  /**
   * Returns the value of '<em><b>bookCategory</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>bookCategory</b></em>' feature
   * @generated
   */
  public BookCategoryType1 getBookCategory() {
    return bookCategory;
  }

  /**
   * Sets the '{@link BookType#getBookCategory() <em>bookCategory</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBookCategory
   *          the new value of the '{@link BookType#getBookCategory() bookCategory}' feature.
   * @generated
   */
  public void setBookCategory(BookCategoryType1 newBookCategory) {
    bookCategory = newBookCategory;
  }

  /**
   * Returns the value of '<em><b>itemId</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>itemId</b></em>' feature
   * @generated
   */
  public String getItemId() {
    return itemId;
  }

  /**
   * Sets the '{@link BookType#getItemId() <em>itemId</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newItemId
   *          the new value of the '{@link BookType#getItemId() itemId}' feature.
   * @generated
   */
  public void setItemId(String newItemId) {
    itemId = newItemId;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "BookType " + " [name: " + getName() + "]" + " [iSBN: " + getISBN() + "]" + " [price: " + getPrice() + "]"
        + " [description: " + getDescription() + "]" + " [publicationDate: " + getPublicationDate() + "]"
        + " [bookCategory: " + getBookCategory() + "]" + " [itemId: " + getItemId() + "]";
  }
}
