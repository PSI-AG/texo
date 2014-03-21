package org.eclipse.modisco.kdm.kdm;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.core.ModelElement;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>KDMFramework</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "kdm_KDMFramework")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class KDMFramework extends ModelElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<Audit> audit = new HashSet<Audit>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<ExtensionFamily> extension = new HashSet<ExtensionFamily>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String name = null;

  /**
   * Returns the value of '<em><b>audit</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>audit</b></em>' feature
   * @generated
   */
  public Set<Audit> getAudit() {
    return audit;
  }

  /**
   * Adds to the <em>audit</em> feature.
   * 
   * @param auditValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToAudit(Audit auditValue) {
    if (!audit.contains(auditValue)) {
      boolean result = audit.add(auditValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>audit</em> feature.
   * 
   * @param auditValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromAudit(Audit auditValue) {
    if (audit.contains(auditValue)) {
      boolean result = audit.remove(auditValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>audit</em> feature.
   * 
   * @generated
   */
  public void clearAudit() {
    while (!audit.isEmpty()) {
      removeFromAudit(audit.iterator().next());
    }
  }

  /**
   * Sets the '{@link KDMFramework#getAudit() <em>audit</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAudit
   *          the new value of the '{@link KDMFramework#getAudit() audit}' feature.
   * @generated
   */
  public void setAudit(Set<Audit> newAudit) {
    audit = newAudit;
  }

  /**
   * Returns the value of '<em><b>extension</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>extension</b></em>' feature
   * @generated
   */
  public Set<ExtensionFamily> getExtension() {
    return extension;
  }

  /**
   * Adds to the <em>extension</em> feature.
   * 
   * @param extensionValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToExtension(ExtensionFamily extensionValue) {
    if (!extension.contains(extensionValue)) {
      boolean result = extension.add(extensionValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>extension</em> feature.
   * 
   * @param extensionValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromExtension(ExtensionFamily extensionValue) {
    if (extension.contains(extensionValue)) {
      boolean result = extension.remove(extensionValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>extension</em> feature.
   * 
   * @generated
   */
  public void clearExtension() {
    while (!extension.isEmpty()) {
      removeFromExtension(extension.iterator().next());
    }
  }

  /**
   * Sets the '{@link KDMFramework#getExtension() <em>extension</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newExtension
   *          the new value of the '{@link KDMFramework#getExtension() extension}' feature.
   * @generated
   */
  public void setExtension(Set<ExtensionFamily> newExtension) {
    extension = newExtension;
  }

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
   * Sets the '{@link KDMFramework#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link KDMFramework#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "KDMFramework " + " [name: " + getName() + "]";
  }
}
