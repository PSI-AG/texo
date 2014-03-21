package org.eclipse.emf.texo.test.model.samples.extlibrary;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>BookOnTape</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "extlib_BookOnTape")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class BookOnTape extends AudioVisualItem {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private Person reader = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private Writer author = null;

  /**
   * Returns the value of '<em><b>reader</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>reader</b></em>' feature
   * @generated
   */
  public Person getReader() {
    return reader;
  }

  /**
   * Sets the '{@link BookOnTape#getReader() <em>reader</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newReader
   *          the new value of the '{@link BookOnTape#getReader() reader}' feature.
   * @generated
   */
  public void setReader(Person newReader) {
    reader = newReader;
  }

  /**
   * Returns the value of '<em><b>author</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>author</b></em>' feature
   * @generated
   */
  public Writer getAuthor() {
    return author;
  }

  /**
   * Sets the '{@link BookOnTape#getAuthor() <em>author</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAuthor
   *          the new value of the '{@link BookOnTape#getAuthor() author}' feature.
   * @generated
   */
  public void setAuthor(Writer newAuthor) {
    author = newAuthor;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "BookOnTape ";
  }
}
