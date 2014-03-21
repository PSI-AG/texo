package org.eclipse.modisco.kdm.platform;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>PlatformAction</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "platform_PlatformAction")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class PlatformAction extends AbstractPlatformElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String kind = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<PlatformEvent> platformElement = new HashSet<PlatformEvent>();

  /**
   * Returns the value of '<em><b>kind</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>kind</b></em>' feature
   * @generated
   */
  public String getKind() {
    return kind;
  }

  /**
   * Sets the '{@link PlatformAction#getKind() <em>kind</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newKind
   *          the new value of the '{@link PlatformAction#getKind() kind}' feature.
   * @generated
   */
  public void setKind(String newKind) {
    kind = newKind;
  }

  /**
   * Returns the value of '<em><b>platformElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>platformElement</b></em>' feature
   * @generated
   */
  public Set<PlatformEvent> getPlatformElement() {
    return platformElement;
  }

  /**
   * Adds to the <em>platformElement</em> feature.
   * 
   * @param platformElementValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToPlatformElement(PlatformEvent platformElementValue) {
    if (!platformElement.contains(platformElementValue)) {
      boolean result = platformElement.add(platformElementValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>platformElement</em> feature.
   * 
   * @param platformElementValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromPlatformElement(PlatformEvent platformElementValue) {
    if (platformElement.contains(platformElementValue)) {
      boolean result = platformElement.remove(platformElementValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>platformElement</em> feature.
   * 
   * @generated
   */
  public void clearPlatformElement() {
    while (!platformElement.isEmpty()) {
      removeFromPlatformElement(platformElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link PlatformAction#getPlatformElement() <em>platformElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPlatformElement
   *          the new value of the '{@link PlatformAction#getPlatformElement() platformElement}' feature.
   * @generated
   */
  public void setPlatformElement(Set<PlatformEvent> newPlatformElement) {
    platformElement = newPlatformElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PlatformAction " + " [kind: " + getKind() + "]";
  }
}
