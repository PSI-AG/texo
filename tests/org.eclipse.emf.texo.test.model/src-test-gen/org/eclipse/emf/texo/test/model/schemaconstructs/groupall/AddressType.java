package org.eclipse.emf.texo.test.model.schemaconstructs.groupall;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AddressType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "groupall_AddressType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class AddressType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = AddressTypeGroupFeatureGroup.class)
  @JoinTable()
  private List<AddressTypeGroupFeatureGroup> group = new ArrayList<AddressTypeGroupFeatureGroup>();

  /**
   * Returns the value of '<em><b>group</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>group</b></em>' feature
   * @generated
   */
  public List<AddressTypeGroupFeatureGroup> getGroup() {
    return group;
  }

  /**
   * Sets the '{@link AddressType#getGroup() <em>group</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGroup
   *          the new value of the '{@link AddressType#getGroup() group}' feature.
   * @generated
   */
  public void setGroup(List<AddressTypeGroupFeatureGroup> newGroup) {
    group = newGroup;
  }

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public List<String> getName() {
    return AddressTypeGroupFeatureGroup.createUnmodifiableValueList(getGroup(),
        AddressTypeGroupFeatureGroup.Feature.NAME);
  }

  /**
   * Sets the '{@link AddressType#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link AddressType#getName() name}' feature.
   * @generated
   */
  public void setName(List<String> newName) {
    setGroup(AddressTypeGroupFeatureGroup.createFeatureGroupList(AddressTypeGroupFeatureGroup.Feature.NAME, newName));
  }

  /**
   * Returns the value of '<em><b>longName</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>longName</b></em>' feature
   * @generated
   */
  public List<String> getLongName() {
    return AddressTypeGroupFeatureGroup.createUnmodifiableValueList(getGroup(),
        AddressTypeGroupFeatureGroup.Feature.LONGNAME);
  }

  /**
   * Sets the '{@link AddressType#getLongName() <em>longName</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLongName
   *          the new value of the '{@link AddressType#getLongName() longName}' feature.
   * @generated
   */
  public void setLongName(List<String> newLongName) {
    setGroup(AddressTypeGroupFeatureGroup.createFeatureGroupList(AddressTypeGroupFeatureGroup.Feature.LONGNAME,
        newLongName));
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AddressType ";
  }
}
