package org.eclipse.emf.texo.test.model.samples.play;

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
 * A representation of the model object '<em><b>PersonaeType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "play_PersonaeType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class PersonaeType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = PersonaeTypeGroupFeatureGroup.class)
  @JoinTable()
  private List<PersonaeTypeGroupFeatureGroup> group = new ArrayList<PersonaeTypeGroupFeatureGroup>();

  /**
   * Returns the value of '<em><b>group</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>group</b></em>' feature
   * @generated
   */
  public List<PersonaeTypeGroupFeatureGroup> getGroup() {
    return group;
  }

  /**
   * Sets the '{@link PersonaeType#getGroup() <em>group</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGroup
   *          the new value of the '{@link PersonaeType#getGroup() group}' feature.
   * @generated
   */
  public void setGroup(List<PersonaeTypeGroupFeatureGroup> newGroup) {
    group = newGroup;
  }

  /**
   * Returns the value of '<em><b>title</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>title</b></em>' feature
   * @generated
   */
  public List<String> getTitle() {
    return PersonaeTypeGroupFeatureGroup.createUnmodifiableValueList(getGroup(),
        PersonaeTypeGroupFeatureGroup.Feature.TITLE);
  }

  /**
   * Sets the '{@link PersonaeType#getTitle() <em>title</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTitle
   *          the new value of the '{@link PersonaeType#getTitle() title}' feature.
   * @generated
   */
  public void setTitle(List<String> newTitle) {
    setGroup(PersonaeTypeGroupFeatureGroup
        .createFeatureGroupList(PersonaeTypeGroupFeatureGroup.Feature.TITLE, newTitle));
  }

  /**
   * Returns the value of '<em><b>persona</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>persona</b></em>' feature
   * @generated
   */
  public List<String> getPersona() {
    return PersonaeTypeGroupFeatureGroup.createUnmodifiableValueList(getGroup(),
        PersonaeTypeGroupFeatureGroup.Feature.PERSONA);
  }

  /**
   * Sets the '{@link PersonaeType#getPersona() <em>persona</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPersona
   *          the new value of the '{@link PersonaeType#getPersona() persona}' feature.
   * @generated
   */
  public void setPersona(List<String> newPersona) {
    setGroup(PersonaeTypeGroupFeatureGroup.createFeatureGroupList(PersonaeTypeGroupFeatureGroup.Feature.PERSONA,
        newPersona));
  }

  /**
   * Returns the value of '<em><b>personaGroup</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>personaGroup</b></em>' feature
   * @generated
   */
  public List<PersonaGroupType> getPersonaGroup() {
    return PersonaeTypeGroupFeatureGroup.createUnmodifiableValueList(getGroup(),
        PersonaeTypeGroupFeatureGroup.Feature.PERSONAGROUP);
  }

  /**
   * Sets the '{@link PersonaeType#getPersonaGroup() <em>personaGroup</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPersonaGroup
   *          the new value of the '{@link PersonaeType#getPersonaGroup() personaGroup}' feature.
   * @generated
   */
  public void setPersonaGroup(List<PersonaGroupType> newPersonaGroup) {
    setGroup(PersonaeTypeGroupFeatureGroup.createFeatureGroupList(PersonaeTypeGroupFeatureGroup.Feature.PERSONAGROUP,
        newPersonaGroup));
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PersonaeType ";
  }
}
