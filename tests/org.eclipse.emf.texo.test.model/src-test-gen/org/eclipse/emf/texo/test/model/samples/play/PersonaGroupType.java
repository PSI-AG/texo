package org.eclipse.emf.texo.test.model.samples.play;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>PersonaGroupType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "play_PersonaGroupType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class PersonaGroupType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<String> persona = new ArrayList<String>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String groupDescription = null;

  /**
   * Returns the value of '<em><b>persona</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>persona</b></em>' feature
   * @generated
   */
  public List<String> getPersona() {
    return persona;
  }

  /**
   * Sets the '{@link PersonaGroupType#getPersona() <em>persona</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPersona
   *          the new value of the '{@link PersonaGroupType#getPersona() persona}' feature.
   * @generated
   */
  public void setPersona(List<String> newPersona) {
    persona = newPersona;
  }

  /**
   * Returns the value of '<em><b>groupDescription</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>groupDescription</b></em>' feature
   * @generated
   */
  public String getGroupDescription() {
    return groupDescription;
  }

  /**
   * Sets the '{@link PersonaGroupType#getGroupDescription() <em>groupDescription</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGroupDescription
   *          the new value of the '{@link PersonaGroupType#getGroupDescription() groupDescription}' feature.
   * @generated
   */
  public void setGroupDescription(String newGroupDescription) {
    groupDescription = newGroupDescription;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PersonaGroupType " + " [groupDescription: " + getGroupDescription() + "]";
  }
}
