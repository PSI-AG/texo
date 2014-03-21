package org.eclipse.emf.texo.test.model.schemaconstructs.simplechoice;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
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
 * A representation of the model object '<em><b>Person</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "simplechoice_Person")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Person extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = PersonGroupFeatureGroup.class)
  @JoinTable()
  private List<PersonGroupFeatureGroup> group = new ArrayList<PersonGroupFeatureGroup>();

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
   * Sets the '{@link Person#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Person#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>group</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>group</b></em>' feature
   * @generated
   */
  public List<PersonGroupFeatureGroup> getGroup() {
    return group;
  }

  /**
   * Sets the '{@link Person#getGroup() <em>group</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGroup
   *          the new value of the '{@link Person#getGroup() group}' feature.
   * @generated
   */
  public void setGroup(List<PersonGroupFeatureGroup> newGroup) {
    group = newGroup;
  }

  /**
   * Returns the value of '<em><b>age</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>age</b></em>' feature
   * @generated
   */
  public List<Integer> getAge() {
    return PersonGroupFeatureGroup.createUnmodifiableValueList(getGroup(), PersonGroupFeatureGroup.Feature.AGE);
  }

  /**
   * Sets the '{@link Person#getAge() <em>age</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAge
   *          the new value of the '{@link Person#getAge() age}' feature.
   * @generated
   */
  public void setAge(List<Integer> newAge) {
    setGroup(PersonGroupFeatureGroup.createFeatureGroupList(PersonGroupFeatureGroup.Feature.AGE, newAge));
  }

  /**
   * Returns the value of '<em><b>length</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>length</b></em>' feature
   * @generated
   */
  public List<Integer> getLength() {
    return PersonGroupFeatureGroup.createUnmodifiableValueList(getGroup(), PersonGroupFeatureGroup.Feature.LENGTH);
  }

  /**
   * Sets the '{@link Person#getLength() <em>length</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLength
   *          the new value of the '{@link Person#getLength() length}' feature.
   * @generated
   */
  public void setLength(List<Integer> newLength) {
    setGroup(PersonGroupFeatureGroup.createFeatureGroupList(PersonGroupFeatureGroup.Feature.LENGTH, newLength));
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Person " + " [name: " + getName() + "]";
  }
}
