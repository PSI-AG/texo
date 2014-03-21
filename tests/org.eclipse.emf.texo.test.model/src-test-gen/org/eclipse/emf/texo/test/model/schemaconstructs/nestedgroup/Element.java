package org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup;

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
 * A representation of the model object '<em><b>Element</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "nestedgroup_Element")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Element extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = ElementMixedFeatureGroup.class)
  @JoinTable()
  private List<ElementMixedFeatureGroup> mixed = new ArrayList<ElementMixedFeatureGroup>();

  /**
   * Returns the value of '<em><b>mixed</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>mixed</b></em>' feature
   * @generated
   */
  public List<ElementMixedFeatureGroup> getMixed() {
    return mixed;
  }

  /**
   * Sets the '{@link Element#getMixed() <em>mixed</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMixed
   *          the new value of the '{@link Element#getMixed() mixed}' feature.
   * @generated
   */
  public void setMixed(List<ElementMixedFeatureGroup> newMixed) {
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
    return ElementMixedFeatureGroup.getSingleFeatureMapValue(getMixed(), ElementMixedFeatureGroup.Feature.NAME);
  }

  /**
   * Sets the '{@link Element#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Element#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    ElementMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), ElementMixedFeatureGroup.Feature.NAME, newName);
  }

  /**
   * Returns the value of '<em><b>true</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>true</b></em>' feature
   * @generated
   */
  public List<ElementTrue_FeatureGroup> getTrue_() {
    return ElementMixedFeatureGroup.createUnmodifiableValueList(getMixed(), ElementMixedFeatureGroup.Feature.TRUE_);
  }

  /**
   * Sets the '{@link Element#getTrue_() <em>true</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTrue_
   *          the new value of the '{@link Element#getTrue_() true}' feature.
   * @generated
   */
  public void setTrue_(List<ElementTrue_FeatureGroup> newTrue_) {
    setMixed(ElementMixedFeatureGroup.createFeatureGroupList(ElementMixedFeatureGroup.Feature.TRUE_, newTrue_));
  }

  /**
   * Returns the value of '<em><b>c</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>c</b></em>' feature
   * @generated
   */
  public List<CType> getC() {
    return ElementTrue_FeatureGroup.createUnmodifiableValueList(getTrue_(), ElementTrue_FeatureGroup.Feature.C);
  }

  /**
   * Sets the '{@link Element#getC() <em>c</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newC
   *          the new value of the '{@link Element#getC() c}' feature.
   * @generated
   */
  public void setC(List<CType> newC) {
    setTrue_(ElementTrue_FeatureGroup.createFeatureGroupList(ElementTrue_FeatureGroup.Feature.C, newC));
  }

  /**
   * Returns the value of '<em><b>recursive</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>recursive</b></em>' feature
   * @generated
   */
  public Element getRecursive() {
    return ElementMixedFeatureGroup.getSingleFeatureMapValue(getMixed(), ElementMixedFeatureGroup.Feature.RECURSIVE);
  }

  /**
   * Sets the '{@link Element#getRecursive() <em>recursive</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newRecursive
   *          the new value of the '{@link Element#getRecursive() recursive}' feature.
   * @generated
   */
  public void setRecursive(Element newRecursive) {
    ElementMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), ElementMixedFeatureGroup.Feature.RECURSIVE,
        newRecursive);
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Element " + " [name: " + getName() + "]";
  }
}
