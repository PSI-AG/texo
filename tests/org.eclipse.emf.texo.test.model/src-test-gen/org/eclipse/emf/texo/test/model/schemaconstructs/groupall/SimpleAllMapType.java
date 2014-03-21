package org.eclipse.emf.texo.test.model.schemaconstructs.groupall;

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
 * A representation of the model object '<em><b>SimpleAllMapType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "groupall_SimpleAllMapType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class SimpleAllMapType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = SimpleAllMapTypeAllMapFeatureGroup.class)
  @JoinTable()
  private List<SimpleAllMapTypeAllMapFeatureGroup> allMap = new ArrayList<SimpleAllMapTypeAllMapFeatureGroup>();

  /**
   * Returns the value of '<em><b>allMap</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>allMap</b></em>' feature
   * @generated
   */
  public List<SimpleAllMapTypeAllMapFeatureGroup> getAllMap() {
    return allMap;
  }

  /**
   * Sets the '{@link SimpleAllMapType#getAllMap() <em>allMap</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAllMap
   *          the new value of the '{@link SimpleAllMapType#getAllMap() allMap}' feature.
   * @generated
   */
  public void setAllMap(List<SimpleAllMapTypeAllMapFeatureGroup> newAllMap) {
    allMap = newAllMap;
  }

  /**
   * Returns the value of '<em><b>aaa</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>aaa</b></em>' feature
   * @generated
   */
  public String getAaa() {
    return SimpleAllMapTypeAllMapFeatureGroup.getSingleFeatureMapValue(getAllMap(),
        SimpleAllMapTypeAllMapFeatureGroup.Feature.AAA);
  }

  /**
   * Sets the '{@link SimpleAllMapType#getAaa() <em>aaa</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAaa
   *          the new value of the '{@link SimpleAllMapType#getAaa() aaa}' feature.
   * @generated
   */
  public void setAaa(String newAaa) {
    SimpleAllMapTypeAllMapFeatureGroup.setSingleFeatureMapValue(getAllMap(),
        SimpleAllMapTypeAllMapFeatureGroup.Feature.AAA, newAaa);
  }

  /**
   * Returns the value of '<em><b>bbb</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>bbb</b></em>' feature
   * @generated
   */
  public String getBbb() {
    return SimpleAllMapTypeAllMapFeatureGroup.getSingleFeatureMapValue(getAllMap(),
        SimpleAllMapTypeAllMapFeatureGroup.Feature.BBB);
  }

  /**
   * Sets the '{@link SimpleAllMapType#getBbb() <em>bbb</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBbb
   *          the new value of the '{@link SimpleAllMapType#getBbb() bbb}' feature.
   * @generated
   */
  public void setBbb(String newBbb) {
    SimpleAllMapTypeAllMapFeatureGroup.setSingleFeatureMapValue(getAllMap(),
        SimpleAllMapTypeAllMapFeatureGroup.Feature.BBB, newBbb);
  }

  /**
   * Returns the value of '<em><b>ccc</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>ccc</b></em>' feature
   * @generated
   */
  public String getCcc() {
    return SimpleAllMapTypeAllMapFeatureGroup.getSingleFeatureMapValue(getAllMap(),
        SimpleAllMapTypeAllMapFeatureGroup.Feature.CCC);
  }

  /**
   * Sets the '{@link SimpleAllMapType#getCcc() <em>ccc</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCcc
   *          the new value of the '{@link SimpleAllMapType#getCcc() ccc}' feature.
   * @generated
   */
  public void setCcc(String newCcc) {
    SimpleAllMapTypeAllMapFeatureGroup.setSingleFeatureMapValue(getAllMap(),
        SimpleAllMapTypeAllMapFeatureGroup.Feature.CCC, newCcc);
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SimpleAllMapType " + " [aaa: " + getAaa() + "]" + " [bbb: " + getBbb() + "]" + " [ccc: " + getCcc() + "]";
  }
}
