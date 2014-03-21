package org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon;

import java.math.BigInteger;
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
 * A representation of the model object '<em><b>RootType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "substitutionzvon_RootType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class RootType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = RootTypeMyAbstractGroupFeatureGroup.class)
  @JoinTable()
  private List<RootTypeMyAbstractGroupFeatureGroup> myAbstractGroup = new ArrayList<RootTypeMyAbstractGroupFeatureGroup>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = RootTypeMyComplexAbstractGroupFeatureGroup.class)
  @JoinTable()
  private List<RootTypeMyComplexAbstractGroupFeatureGroup> myComplexAbstractGroup = new ArrayList<RootTypeMyComplexAbstractGroupFeatureGroup>();

  /**
   * Returns the value of '<em><b>myAbstractGroup</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>myAbstractGroup</b></em>' feature
   * @generated
   */
  public List<RootTypeMyAbstractGroupFeatureGroup> getMyAbstractGroup() {
    return myAbstractGroup;
  }

  /**
   * Sets the '{@link RootType#getMyAbstractGroup() <em>myAbstractGroup</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMyAbstractGroup
   *          the new value of the '{@link RootType#getMyAbstractGroup() myAbstractGroup}' feature.
   * @generated
   */
  public void setMyAbstractGroup(List<RootTypeMyAbstractGroupFeatureGroup> newMyAbstractGroup) {
    myAbstractGroup = newMyAbstractGroup;
  }

  /**
   * Returns the value of '<em><b>myAbstract</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>myAbstract</b></em>' feature
   * @generated
   */
  public BigInteger getMyAbstract() {
    return RootTypeMyAbstractGroupFeatureGroup.getSingleFeatureMapValue(getMyAbstractGroup(),
        RootTypeMyAbstractGroupFeatureGroup.Feature.MYABSTRACT);
  }

  /**
   * Returns the value of '<em><b>myComplexAbstractGroup</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>myComplexAbstractGroup</b></em>' feature
   * @generated
   */
  public List<RootTypeMyComplexAbstractGroupFeatureGroup> getMyComplexAbstractGroup() {
    return myComplexAbstractGroup;
  }

  /**
   * Sets the '{@link RootType#getMyComplexAbstractGroup() <em>myComplexAbstractGroup</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMyComplexAbstractGroup
   *          the new value of the '{@link RootType#getMyComplexAbstractGroup() myComplexAbstractGroup}' feature.
   * @generated
   */
  public void setMyComplexAbstractGroup(List<RootTypeMyComplexAbstractGroupFeatureGroup> newMyComplexAbstractGroup) {
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
  public ComplexAAA getMyComplexAbstract() {
    return RootTypeMyComplexAbstractGroupFeatureGroup.getSingleFeatureMapValue(getMyComplexAbstractGroup(),
        RootTypeMyComplexAbstractGroupFeatureGroup.Feature.MYCOMPLEXABSTRACT);
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "RootType " + " [myAbstract: " + getMyAbstract() + "]";
  }
}
