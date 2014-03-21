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
 * A representation of the model object '<em><b>Element</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "ecoreattrs_Element")
@Table(name = "ecoreattrs_Element")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Element extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = ElementNameMapFeatureGroup.class)
  @JoinTable(name = "ecoreattrs_Element_nameMap_FM")
  private List<ElementNameMapFeatureGroup> nameMap = new ArrayList<ElementNameMapFeatureGroup>();

  /**
   * Returns the value of '<em><b>nameMap</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>nameMap</b></em>' feature
   * @generated
   */
  public List<ElementNameMapFeatureGroup> getNameMap() {
    return nameMap;
  }

  /**
   * Sets the '{@link Element#getNameMap() <em>nameMap</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNameMap
   *          the new value of the '{@link Element#getNameMap() nameMap}' feature.
   * @generated
   */
  public void setNameMap(List<ElementNameMapFeatureGroup> newNameMap) {
    nameMap = newNameMap;
  }

  /**
   * Returns the value of '<em><b>names</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>names</b></em>' feature
   * @generated
   */
  public NameList getNames() {
    return ElementNameMapFeatureGroup.getSingleFeatureMapValue(getNameMap(), ElementNameMapFeatureGroup.Feature.NAMES);
  }

  /**
   * Sets the '{@link Element#getNames() <em>names</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNames
   *          the new value of the '{@link Element#getNames() names}' feature.
   * @generated
   */
  public void setNames(NameList newNames) {
    ElementNameMapFeatureGroup.setSingleFeatureMapValue(getNameMap(), ElementNameMapFeatureGroup.Feature.NAMES,
        newNames);
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Element ";
  }
}
