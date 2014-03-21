package org.eclipse.modisco.kdm.data;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ContentItem</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "data_ContentItem")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ContentItem extends AbstractContentElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private ComplexContentType type = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractContentElement> contentElement = new HashSet<AbstractContentElement>();

  /**
   * Returns the value of '<em><b>type</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>type</b></em>' feature
   * @generated
   */
  public ComplexContentType getType() {
    return type;
  }

  /**
   * Sets the '{@link ContentItem#getType() <em>type</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newType
   *          the new value of the '{@link ContentItem#getType() type}' feature.
   * @generated
   */
  public void setType(ComplexContentType newType) {
    type = newType;
  }

  /**
   * Returns the value of '<em><b>contentElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>contentElement</b></em>' feature
   * @generated
   */
  public Set<AbstractContentElement> getContentElement() {
    return contentElement;
  }

  /**
   * Adds to the <em>contentElement</em> feature.
   * 
   * @param contentElementValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToContentElement(AbstractContentElement contentElementValue) {
    if (!contentElement.contains(contentElementValue)) {
      boolean result = contentElement.add(contentElementValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>contentElement</em> feature.
   * 
   * @param contentElementValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromContentElement(AbstractContentElement contentElementValue) {
    if (contentElement.contains(contentElementValue)) {
      boolean result = contentElement.remove(contentElementValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>contentElement</em> feature.
   * 
   * @generated
   */
  public void clearContentElement() {
    while (!contentElement.isEmpty()) {
      removeFromContentElement(contentElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link ContentItem#getContentElement() <em>contentElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newContentElement
   *          the new value of the '{@link ContentItem#getContentElement() contentElement}' feature.
   * @generated
   */
  public void setContentElement(Set<AbstractContentElement> newContentElement) {
    contentElement = newContentElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ContentItem ";
  }
}
