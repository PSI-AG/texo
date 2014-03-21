package org.eclipse.emf.texo.test.model.samples.emap;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Book</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "emapsample_Book")
@Table(name = "EMAP_BOOK")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Book extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String title = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @MapKeyColumn(table = "emapsample_Book_writers")
  @JoinTable(name = "emapsample_Book_writers")
  private Map<String, Writer> writers = new LinkedHashMap<String, Writer>();

  /**
   * Returns the value of '<em><b>title</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>title</b></em>' feature
   * @generated
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the '{@link Book#getTitle() <em>title</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTitle
   *          the new value of the '{@link Book#getTitle() title}' feature.
   * @generated
   */
  public void setTitle(String newTitle) {
    title = newTitle;
  }

  /**
   * Returns the value of '<em><b>writers</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>writers</b></em>' feature
   * @generated
   */
  public Map<String, Writer> getWriters() {
    return writers;
  }

  /**
   * Sets the '{@link Book#getWriters() <em>writers</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newWriters
   *          the new value of the '{@link Book#getWriters() writers}' feature.
   * @generated
   */
  public void setWriters(Map<String, Writer> newWriters) {
    writers = newWriters;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Book " + " [title: " + getTitle() + "]";
  }
}
