package org.eclipse.graphiti.mm.pictograms;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AnchorContainer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "pi_AnchorContainer")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class AnchorContainer extends PictogramElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "parent")
  private Set<Anchor> anchors = new HashSet<Anchor>();

  /**
   * Returns the value of '<em><b>anchors</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>anchors</b></em>' feature
   * @generated
   */
  public Set<Anchor> getAnchors() {
    return anchors;
  }

  /**
   * Adds to the <em>anchors</em> feature.
   * 
   * @param anchorsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToAnchors(Anchor anchorsValue) {
    if (!anchors.contains(anchorsValue)) {
      boolean result = anchors.add(anchorsValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>anchors</em> feature.
   * 
   * @param anchorsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromAnchors(Anchor anchorsValue) {
    if (anchors.contains(anchorsValue)) {
      boolean result = anchors.remove(anchorsValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>anchors</em> feature.
   * 
   * @generated
   */
  public void clearAnchors() {
    while (!anchors.isEmpty()) {
      removeFromAnchors(anchors.iterator().next());
    }
  }

  /**
   * Sets the '{@link AnchorContainer#getAnchors() <em>anchors</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAnchors
   *          the new value of the '{@link AnchorContainer#getAnchors() anchors}' feature.
   * @generated
   */
  public void setAnchors(Set<Anchor> newAnchors) {
    anchors = newAnchors;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AnchorContainer ";
  }
}
