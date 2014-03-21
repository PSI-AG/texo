package org.eclipse.graphiti.mm;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>StyleContainer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "mm_StyleContainer")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class StyleContainer extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "styleContainer")
  private Set<Style> styles = new HashSet<Style>();

  /**
   * Returns the value of '<em><b>styles</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>styles</b></em>' feature
   * @generated
   */
  public Set<Style> getStyles() {
    return styles;
  }

  /**
   * Adds to the <em>styles</em> feature.
   * 
   * @param stylesValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToStyles(Style stylesValue) {
    if (!styles.contains(stylesValue)) {
      boolean result = styles.add(stylesValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>styles</em> feature.
   * 
   * @param stylesValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromStyles(Style stylesValue) {
    if (styles.contains(stylesValue)) {
      boolean result = styles.remove(stylesValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>styles</em> feature.
   * 
   * @generated
   */
  public void clearStyles() {
    while (!styles.isEmpty()) {
      removeFromStyles(styles.iterator().next());
    }
  }

  /**
   * Sets the '{@link StyleContainer#getStyles() <em>styles</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStyles
   *          the new value of the '{@link StyleContainer#getStyles() styles}' feature.
   * @generated
   */
  public void setStyles(Set<Style> newStyles) {
    styles = newStyles;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "StyleContainer ";
  }
}
