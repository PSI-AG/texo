package org.eclipse.emf.texo.test.model.schemaconstructs.substitution;

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
 * A representation of the model object '<em><b>MultiNumberType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "substitution_MultiNumberType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class MultiNumberType extends Identifiable {

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
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = MultiNumberTypeMyComplexAbstractGroupFeatureGroup.class)
  @JoinTable()
  private List<MultiNumberTypeMyComplexAbstractGroupFeatureGroup> myComplexAbstractGroup = new ArrayList<MultiNumberTypeMyComplexAbstractGroupFeatureGroup>();

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
   * Sets the '{@link MultiNumberType#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link MultiNumberType#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>myComplexAbstractGroup</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>myComplexAbstractGroup</b></em>' feature
   * @generated
   */
  public List<MultiNumberTypeMyComplexAbstractGroupFeatureGroup> getMyComplexAbstractGroup() {
    return myComplexAbstractGroup;
  }

  /**
   * Sets the '{@link MultiNumberType#getMyComplexAbstractGroup() <em>myComplexAbstractGroup</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMyComplexAbstractGroup
   *          the new value of the '{@link MultiNumberType#getMyComplexAbstractGroup() myComplexAbstractGroup}' feature.
   * @generated
   */
  public void setMyComplexAbstractGroup(
      List<MultiNumberTypeMyComplexAbstractGroupFeatureGroup> newMyComplexAbstractGroup) {
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
  public List<ComplexNumber> getMyComplexAbstract() {
    return MultiNumberTypeMyComplexAbstractGroupFeatureGroup.createUnmodifiableValueList(getMyComplexAbstractGroup(),
        MultiNumberTypeMyComplexAbstractGroupFeatureGroup.Feature.MYCOMPLEXABSTRACT);
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "MultiNumberType " + " [name: " + getName() + "]";
  }
}
