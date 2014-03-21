package org.eclipse.emf.texo.test.model.schemaconstructs.mixed;

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
 * A representation of the model object '<em><b>SalutationType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "mixed_SalutationType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class SalutationType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = SalutationTypeMixedFeatureGroup.class)
  @JoinTable()
  private List<SalutationTypeMixedFeatureGroup> mixed = new ArrayList<SalutationTypeMixedFeatureGroup>();

  /**
   * Returns the value of '<em><b>mixed</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>mixed</b></em>' feature
   * @generated
   */
  public List<SalutationTypeMixedFeatureGroup> getMixed() {
    return mixed;
  }

  /**
   * Sets the '{@link SalutationType#getMixed() <em>mixed</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMixed
   *          the new value of the '{@link SalutationType#getMixed() mixed}' feature.
   * @generated
   */
  public void setMixed(List<SalutationTypeMixedFeatureGroup> newMixed) {
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
    return SalutationTypeMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        SalutationTypeMixedFeatureGroup.Feature.NAME);
  }

  /**
   * Sets the '{@link SalutationType#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link SalutationType#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    SalutationTypeMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), SalutationTypeMixedFeatureGroup.Feature.NAME,
        newName);
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SalutationType " + " [name: " + getName() + "]";
  }
}
