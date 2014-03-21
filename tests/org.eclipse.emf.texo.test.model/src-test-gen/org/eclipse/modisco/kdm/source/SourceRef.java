package org.eclipse.modisco.kdm.source;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.core.Element;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>SourceRef</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "source_SourceRef")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class SourceRef extends Element {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<SourceRegion> region = new ArrayList<SourceRegion>();

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
  private String snippet = null;

  /**
   * Returns the value of '<em><b>region</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>region</b></em>' feature
   * @generated
   */
  public List<SourceRegion> getRegion() {
    return region;
  }

  /**
   * Adds to the <em>region</em> feature.
   * 
   * @param regionValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToRegion(SourceRegion regionValue) {
    if (!region.contains(regionValue)) {
      boolean result = region.add(regionValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>region</em> feature.
   * 
   * @param regionValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromRegion(SourceRegion regionValue) {
    if (region.contains(regionValue)) {
      boolean result = region.remove(regionValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>region</em> feature.
   * 
   * @generated
   */
  public void clearRegion() {
    while (!region.isEmpty()) {
      removeFromRegion(region.iterator().next());
    }
  }

  /**
   * Sets the '{@link SourceRef#getRegion() <em>region</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newRegion
   *          the new value of the '{@link SourceRef#getRegion() region}' feature.
   * @generated
   */
  public void setRegion(List<SourceRegion> newRegion) {
    region = newRegion;
  }

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
   * Sets the '{@link SourceRef#getLanguage() <em>language</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLanguage
   *          the new value of the '{@link SourceRef#getLanguage() language}' feature.
   * @generated
   */
  public void setLanguage(String newLanguage) {
    language = newLanguage;
  }

  /**
   * Returns the value of '<em><b>snippet</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>snippet</b></em>' feature
   * @generated
   */
  public String getSnippet() {
    return snippet;
  }

  /**
   * Sets the '{@link SourceRef#getSnippet() <em>snippet</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSnippet
   *          the new value of the '{@link SourceRef#getSnippet() snippet}' feature.
   * @generated
   */
  public void setSnippet(String newSnippet) {
    snippet = newSnippet;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SourceRef " + " [language: " + getLanguage() + "]" + " [snippet: " + getSnippet() + "]";
  }
}
