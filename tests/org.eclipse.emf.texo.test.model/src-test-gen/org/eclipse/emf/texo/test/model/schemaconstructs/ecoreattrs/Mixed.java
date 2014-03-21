package org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Mixed</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "ecoreattrs_Mixed")
@Table(name = "ecoreattrs_Mixed")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Mixed extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = MixedMixedFeatureGroup.class)
  @JoinTable(name = "ecoreattrs_Mixed_mixed_FM")
  private List<MixedMixedFeatureGroup> mixed = new ArrayList<MixedMixedFeatureGroup>();

  /**
   * Returns the value of '<em><b>mixed</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>mixed</b></em>' feature
   * @generated
   */
  public List<MixedMixedFeatureGroup> getMixed() {
    return mixed;
  }

  /**
   * Sets the '{@link Mixed#getMixed() <em>mixed</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMixed
   *          the new value of the '{@link Mixed#getMixed() mixed}' feature.
   * @generated
   */
  public void setMixed(List<MixedMixedFeatureGroup> newMixed) {
    mixed = newMixed;
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
    return MixedMixedFeatureGroup.getSingleFeatureMapValue(getMixed(), MixedMixedFeatureGroup.Feature.NAME);
  }

  /**
   * Sets the '{@link Mixed#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Mixed#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    MixedMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), MixedMixedFeatureGroup.Feature.NAME, newName);
  }

  /**
   * Returns the value of '<em><b>value</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>value</b></em>' feature
   * @generated
   */
  public double getValue_() {
    return MixedMixedFeatureGroup.getSingleFeatureMapValue(getMixed(), MixedMixedFeatureGroup.Feature.VALUE_);
  }

  /**
   * Sets the '{@link Mixed#getValue_() <em>value</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newValue_
   *          the new value of the '{@link Mixed#getValue_() value}' feature.
   * @generated
   */
  public void setValue_(double newValue_) {
    MixedMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), MixedMixedFeatureGroup.Feature.VALUE_, newValue_);
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Mixed " + " [name: " + getName() + "]" + " [value_: " + getValue_() + "]";
  }
}
