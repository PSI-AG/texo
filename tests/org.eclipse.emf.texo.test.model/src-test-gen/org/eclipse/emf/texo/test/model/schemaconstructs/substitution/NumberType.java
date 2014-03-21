package org.eclipse.emf.texo.test.model.schemaconstructs.substitution;

import java.math.BigInteger;
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
 * A representation of the model object '<em><b>NumberType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "substitution_NumberType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class NumberType extends Identifiable {

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
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = NumberTypeMySimpleAbstractGroupFeatureGroup.class)
  @JoinTable()
  private List<NumberTypeMySimpleAbstractGroupFeatureGroup> mySimpleAbstractGroup = new ArrayList<NumberTypeMySimpleAbstractGroupFeatureGroup>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = NumberTypeMyComplexAbstractGroupFeatureGroup.class)
  @JoinTable()
  private List<NumberTypeMyComplexAbstractGroupFeatureGroup> myComplexAbstractGroup = new ArrayList<NumberTypeMyComplexAbstractGroupFeatureGroup>();

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
   * Sets the '{@link NumberType#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link NumberType#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>mySimpleAbstractGroup</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>mySimpleAbstractGroup</b></em>' feature
   * @generated
   */
  public List<NumberTypeMySimpleAbstractGroupFeatureGroup> getMySimpleAbstractGroup() {
    return mySimpleAbstractGroup;
  }

  /**
   * Sets the '{@link NumberType#getMySimpleAbstractGroup() <em>mySimpleAbstractGroup</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMySimpleAbstractGroup
   *          the new value of the '{@link NumberType#getMySimpleAbstractGroup() mySimpleAbstractGroup}' feature.
   * @generated
   */
  public void setMySimpleAbstractGroup(List<NumberTypeMySimpleAbstractGroupFeatureGroup> newMySimpleAbstractGroup) {
    mySimpleAbstractGroup = newMySimpleAbstractGroup;
  }

  /**
   * Returns the value of '<em><b>mySimpleAbstract</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>mySimpleAbstract</b></em>' feature
   * @generated
   */
  public BigInteger getMySimpleAbstract() {
    return NumberTypeMySimpleAbstractGroupFeatureGroup.getSingleFeatureMapValue(getMySimpleAbstractGroup(),
        NumberTypeMySimpleAbstractGroupFeatureGroup.Feature.MYSIMPLEABSTRACT);
  }

  /**
   * Returns the value of '<em><b>myComplexAbstractGroup</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>myComplexAbstractGroup</b></em>' feature
   * @generated
   */
  public List<NumberTypeMyComplexAbstractGroupFeatureGroup> getMyComplexAbstractGroup() {
    return myComplexAbstractGroup;
  }

  /**
   * Sets the '{@link NumberType#getMyComplexAbstractGroup() <em>myComplexAbstractGroup</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMyComplexAbstractGroup
   *          the new value of the '{@link NumberType#getMyComplexAbstractGroup() myComplexAbstractGroup}' feature.
   * @generated
   */
  public void setMyComplexAbstractGroup(List<NumberTypeMyComplexAbstractGroupFeatureGroup> newMyComplexAbstractGroup) {
    myComplexAbstractGroup = newMyComplexAbstractGroup;
  }

  /**
   * Returns the value of '<em><b>myComplexAbstract</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>myComplexAbstract</b></em>' feature
   * @generated
   */
  public ComplexNumber getMyComplexAbstract() {
    return NumberTypeMyComplexAbstractGroupFeatureGroup.getSingleFeatureMapValue(getMyComplexAbstractGroup(),
        NumberTypeMyComplexAbstractGroupFeatureGroup.Feature.MYCOMPLEXABSTRACT);
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "NumberType " + " [name: " + getName() + "]" + " [mySimpleAbstract: " + getMySimpleAbstract() + "]";
  }
}
