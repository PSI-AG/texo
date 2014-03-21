package org.eclipse.modisco.kdm.source;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>SourceFile</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "source_SourceFile")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class SourceFile extends InventoryItem {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String language = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String encoding = null;

  /**
   * Returns the value of '<em><b>language</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>language</b></em>' feature
   * @generated
   */
  public String getLanguage() {
    return language;
  }

  /**
   * Sets the '{@link SourceFile#getLanguage() <em>language</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLanguage
   *          the new value of the '{@link SourceFile#getLanguage() language}' feature.
   * @generated
   */
  public void setLanguage(String newLanguage) {
    language = newLanguage;
  }

  /**
   * Returns the value of '<em><b>encoding</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>encoding</b></em>' feature
   * @generated
   */
  public String getEncoding() {
    return encoding;
  }

  /**
   * Sets the '{@link SourceFile#getEncoding() <em>encoding</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEncoding
   *          the new value of the '{@link SourceFile#getEncoding() encoding}' feature.
   * @generated
   */
  public void setEncoding(String newEncoding) {
    encoding = newEncoding;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SourceFile " + " [language: " + getLanguage() + "]" + " [encoding: " + getEncoding() + "]";
  }
}
