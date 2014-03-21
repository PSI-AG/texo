package org.eclipse.emf.texo.test.model.samples.inventory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>PType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "inv_PType")
@Table(name = "inv_PType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class PType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "id")
  private long id = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "name")
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinTable(joinColumns = { @JoinColumn(name = "inv_PType_base") }, inverseJoinColumns = { @JoinColumn(name = "base_inv_PType") }, name = "inv_PType_base")
  private PType base = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, mappedBy = "base")
  private Set<PType> subTypes = new HashSet<PType>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinTable(joinColumns = { @JoinColumn(name = "inv_PType_subNOTypes") }, inverseJoinColumns = { @JoinColumn(name = "subNOTypes_inv_PType") }, name = "inv_PType_subNOTypes")
  private Set<PType> subNOTypes = new HashSet<PType>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn(name = "inv_PType_infoReferences_ind")
  @JoinTable(joinColumns = { @JoinColumn(name = "inv_PType_infoReferences") }, inverseJoinColumns = { @JoinColumn(name = "infoReferences_inv_PDeclaration") }, name = "inv_PType_infoReferences")
  private List<PDeclaration> infoReferences = new ArrayList<PDeclaration>();

  /**
   * Returns the value of '<em><b>id</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>id</b></em>' feature
   * @generated
   */
  public long getId() {
    return id;
  }

  /**
   * Sets the '{@link PType#getId() <em>id</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newId
   *          the new value of the '{@link PType#getId() id}' feature.
   * @generated
   */
  public void setId(long newId) {
    id = newId;
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
   * Sets the '{@link PType#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link PType#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>base</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>base</b></em>' feature
   * @generated
   */
  public PType getBase() {
    return base;
  }

  /**
   * Sets the '{@link PType#getBase() <em>base</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBase
   *          the new value of the '{@link PType#getBase() base}' feature.
   * @generated
   */
  public void setBase(PType newBase) {
    base = newBase;
  }

  /**
   * Returns the value of '<em><b>subTypes</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>subTypes</b></em>' feature
   * @generated
   */
  public Set<PType> getSubTypes() {
    return subTypes;
  }

  /**
   * Adds to the <em>subTypes</em> feature.
   * 
   * @param subTypesValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToSubTypes(PType subTypesValue) {
    if (!subTypes.contains(subTypesValue)) {
      boolean result = subTypes.add(subTypesValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>subTypes</em> feature.
   * 
   * @param subTypesValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromSubTypes(PType subTypesValue) {
    if (subTypes.contains(subTypesValue)) {
      boolean result = subTypes.remove(subTypesValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>subTypes</em> feature.
   * 
   * @generated
   */
  public void clearSubTypes() {
    while (!subTypes.isEmpty()) {
      removeFromSubTypes(subTypes.iterator().next());
    }
  }

  /**
   * Sets the '{@link PType#getSubTypes() <em>subTypes</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSubTypes
   *          the new value of the '{@link PType#getSubTypes() subTypes}' feature.
   * @generated
   */
  public void setSubTypes(Set<PType> newSubTypes) {
    subTypes = newSubTypes;
  }

  /**
   * Returns the value of '<em><b>subNOTypes</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>subNOTypes</b></em>' feature
   * @generated
   */
  public Set<PType> getSubNOTypes() {
    return subNOTypes;
  }

  /**
   * Adds to the <em>subNOTypes</em> feature.
   * 
   * @param subNOTypesValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToSubNOTypes(PType subNOTypesValue) {
    boolean result = subNOTypes.add(subNOTypesValue);
    return result;
  }

  /**
   * Removes from the <em>subNOTypes</em> feature.
   * 
   * @param subNOTypesValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromSubNOTypes(PType subNOTypesValue) {
    if (subNOTypes.contains(subNOTypesValue)) {
      boolean result = subNOTypes.remove(subNOTypesValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>subNOTypes</em> feature.
   * 
   * @generated
   */
  public void clearSubNOTypes() {
    while (!subNOTypes.isEmpty()) {
      removeFromSubNOTypes(subNOTypes.iterator().next());
    }
  }

  /**
   * Sets the '{@link PType#getSubNOTypes() <em>subNOTypes</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSubNOTypes
   *          the new value of the '{@link PType#getSubNOTypes() subNOTypes}' feature.
   * @generated
   */
  public void setSubNOTypes(Set<PType> newSubNOTypes) {
    subNOTypes = newSubNOTypes;
  }

  /**
   * Returns the value of '<em><b>infoReferences</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>infoReferences</b></em>' feature
   * @generated
   */
  public List<PDeclaration> getInfoReferences() {
    return infoReferences;
  }

  /**
   * Adds to the <em>infoReferences</em> feature.
   * 
   * @param infoReferencesValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToInfoReferences(PDeclaration infoReferencesValue) {
    boolean result = infoReferences.add(infoReferencesValue);
    return result;
  }

  /**
   * Removes from the <em>infoReferences</em> feature.
   * 
   * @param infoReferencesValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromInfoReferences(PDeclaration infoReferencesValue) {
    if (infoReferences.contains(infoReferencesValue)) {
      boolean result = infoReferences.remove(infoReferencesValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>infoReferences</em> feature.
   * 
   * @generated
   */
  public void clearInfoReferences() {
    while (!infoReferences.isEmpty()) {
      removeFromInfoReferences(infoReferences.iterator().next());
    }
  }

  /**
   * Sets the '{@link PType#getInfoReferences() <em>infoReferences</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newInfoReferences
   *          the new value of the '{@link PType#getInfoReferences() infoReferences}' feature.
   * @generated
   */
  public void setInfoReferences(List<PDeclaration> newInfoReferences) {
    infoReferences = newInfoReferences;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PType " + " [id: " + getId() + "]" + " [name: " + getName() + "]";
  }
}
