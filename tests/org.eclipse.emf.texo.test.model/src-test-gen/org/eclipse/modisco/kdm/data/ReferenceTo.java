package org.eclipse.modisco.kdm.data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ReferenceTo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "data_ReferenceTo")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ReferenceTo extends AbstractDataRelationship {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private ContentItem to = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private ContentItem from = null;

  /**
   * Returns the value of '<em><b>to</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>to</b></em>' feature
   * @generated
   */
  public ContentItem getTo() {
    return to;
  }

  /**
   * Sets the '{@link ReferenceTo#getTo() <em>to</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTo
   *          the new value of the '{@link ReferenceTo#getTo() to}' feature.
   * @generated
   */
  public void setTo(ContentItem newTo) {
    to = newTo;
  }

  /**
   * Returns the value of '<em><b>from</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>from</b></em>' feature
   * @generated
   */
  public ContentItem getFrom() {
    return from;
  }

  /**
   * Sets the '{@link ReferenceTo#getFrom() <em>from</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFrom
   *          the new value of the '{@link ReferenceTo#getFrom() from}' feature.
   * @generated
   */
  public void setFrom(ContentItem newFrom) {
    from = newFrom;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ReferenceTo ";
  }
}
