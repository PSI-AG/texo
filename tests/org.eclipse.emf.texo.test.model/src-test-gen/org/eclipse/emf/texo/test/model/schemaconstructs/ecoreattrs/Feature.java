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
 * A representation of the model object '<em><b>Feature</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "ecoreattrs_Feature")
@Table(name = "ecoreattrs_Feature")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Feature extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = FeatureAMapFeatureGroup.class)
  @JoinTable(name = "ecoreattrs_Feature_aMap_FM")
  private List<FeatureAMapFeatureGroup> aMap = new ArrayList<FeatureAMapFeatureGroup>();

  /**
   * Returns the value of '<em><b>aMap</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>aMap</b></em>' feature
   * @generated
   */
  public List<FeatureAMapFeatureGroup> getAMap() {
    return aMap;
  }

  /**
   * Sets the '{@link Feature#getAMap() <em>aMap</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAMap
   *          the new value of the '{@link Feature#getAMap() aMap}' feature.
   * @generated
   */
  public void setAMap(List<FeatureAMapFeatureGroup> newAMap) {
    aMap = newAMap;
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
    return FeatureAMapFeatureGroup.getSingleFeatureMapValue(getAMap(), FeatureAMapFeatureGroup.Feature.NAME);
  }

  /**
   * Sets the '{@link Feature#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Feature#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    FeatureAMapFeatureGroup.setSingleFeatureMapValue(getAMap(), FeatureAMapFeatureGroup.Feature.NAME, newName);
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
    return FeatureAMapFeatureGroup.getSingleFeatureMapValue(getAMap(), FeatureAMapFeatureGroup.Feature.VALUE_);
  }

  /**
   * Sets the '{@link Feature#getValue_() <em>value</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newValue_
   *          the new value of the '{@link Feature#getValue_() value}' feature.
   * @generated
   */
  public void setValue_(double newValue_) {
    FeatureAMapFeatureGroup.setSingleFeatureMapValue(getAMap(), FeatureAMapFeatureGroup.Feature.VALUE_, newValue_);
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Feature " + " [name: " + getName() + "]" + " [value_: " + getValue_() + "]";
  }
}
