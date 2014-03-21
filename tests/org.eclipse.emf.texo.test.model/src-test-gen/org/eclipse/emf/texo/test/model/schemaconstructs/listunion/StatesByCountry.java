package org.eclipse.emf.texo.test.model.schemaconstructs.listunion;

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
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>statesByCountry</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "listunion_statesByCountry")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class StatesByCountry extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String country = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private List<String> allStates = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private List<String> sixImportantStates = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String zipUnion = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<String> zipUnions = new ArrayList<String>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Convert("TexoTestObjectConverter")
  private Object simpleUnion = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @Convert("TexoTestObjectConverter")
  @CollectionTable()
  private List<Object> simpleUnions = new ArrayList<Object>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String simpleStringUnion = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<String> simpleStringUnions = new ArrayList<String>();

  /**
   * Returns the value of '<em><b>country</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>country</b></em>' feature
   * @generated
   */
  public String getCountry() {
    return country;
  }

  /**
   * Sets the '{@link StatesByCountry#getCountry() <em>country</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCountry
   *          the new value of the '{@link StatesByCountry#getCountry() country}' feature.
   * @generated
   */
  public void setCountry(String newCountry) {
    country = newCountry;
  }

  /**
   * Returns the value of '<em><b>allStates</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>allStates</b></em>' feature
   * @generated
   */
  public List<String> getAllStates() {
    return allStates;
  }

  /**
   * Sets the '{@link StatesByCountry#getAllStates() <em>allStates</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAllStates
   *          the new value of the '{@link StatesByCountry#getAllStates() allStates}' feature.
   * @generated
   */
  public void setAllStates(List<String> newAllStates) {
    allStates = newAllStates;
  }

  /**
   * Returns the value of '<em><b>sixImportantStates</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>sixImportantStates</b></em>' feature
   * @generated
   */
  public List<String> getSixImportantStates() {
    return sixImportantStates;
  }

  /**
   * Sets the '{@link StatesByCountry#getSixImportantStates() <em>sixImportantStates</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSixImportantStates
   *          the new value of the '{@link StatesByCountry#getSixImportantStates() sixImportantStates}' feature.
   * @generated
   */
  public void setSixImportantStates(List<String> newSixImportantStates) {
    sixImportantStates = newSixImportantStates;
  }

  /**
   * Returns the value of '<em><b>zipUnion</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>zipUnion</b></em>' feature
   * @generated
   */
  public String getZipUnion() {
    return zipUnion;
  }

  /**
   * Sets the '{@link StatesByCountry#getZipUnion() <em>zipUnion</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newZipUnion
   *          the new value of the '{@link StatesByCountry#getZipUnion() zipUnion}' feature.
   * @generated
   */
  public void setZipUnion(String newZipUnion) {
    zipUnion = newZipUnion;
  }

  /**
   * Returns the value of '<em><b>zipUnions</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>zipUnions</b></em>' feature
   * @generated
   */
  public List<String> getZipUnions() {
    return zipUnions;
  }

  /**
   * Sets the '{@link StatesByCountry#getZipUnions() <em>zipUnions</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newZipUnions
   *          the new value of the '{@link StatesByCountry#getZipUnions() zipUnions}' feature.
   * @generated
   */
  public void setZipUnions(List<String> newZipUnions) {
    zipUnions = newZipUnions;
  }

  /**
   * Returns the value of '<em><b>simpleUnion</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>simpleUnion</b></em>' feature
   * @generated
   */
  public Object getSimpleUnion() {
    return simpleUnion;
  }

  /**
   * Sets the '{@link StatesByCountry#getSimpleUnion() <em>simpleUnion</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSimpleUnion
   *          the new value of the '{@link StatesByCountry#getSimpleUnion() simpleUnion}' feature.
   * @generated
   */
  public void setSimpleUnion(Object newSimpleUnion) {
    simpleUnion = newSimpleUnion;
  }

  /**
   * Returns the value of '<em><b>simpleUnions</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>simpleUnions</b></em>' feature
   * @generated
   */
  public List<Object> getSimpleUnions() {
    return simpleUnions;
  }

  /**
   * Sets the '{@link StatesByCountry#getSimpleUnions() <em>simpleUnions</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSimpleUnions
   *          the new value of the '{@link StatesByCountry#getSimpleUnions() simpleUnions}' feature.
   * @generated
   */
  public void setSimpleUnions(List<Object> newSimpleUnions) {
    simpleUnions = newSimpleUnions;
  }

  /**
   * Returns the value of '<em><b>simpleStringUnion</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>simpleStringUnion</b></em>' feature
   * @generated
   */
  public String getSimpleStringUnion() {
    return simpleStringUnion;
  }

  /**
   * Sets the '{@link StatesByCountry#getSimpleStringUnion() <em>simpleStringUnion</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSimpleStringUnion
   *          the new value of the '{@link StatesByCountry#getSimpleStringUnion() simpleStringUnion}' feature.
   * @generated
   */
  public void setSimpleStringUnion(String newSimpleStringUnion) {
    simpleStringUnion = newSimpleStringUnion;
  }

  /**
   * Returns the value of '<em><b>simpleStringUnions</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>simpleStringUnions</b></em>' feature
   * @generated
   */
  public List<String> getSimpleStringUnions() {
    return simpleStringUnions;
  }

  /**
   * Sets the '{@link StatesByCountry#getSimpleStringUnions() <em>simpleStringUnions</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSimpleStringUnions
   *          the new value of the '{@link StatesByCountry#getSimpleStringUnions() simpleStringUnions}' feature.
   * @generated
   */
  public void setSimpleStringUnions(List<String> newSimpleStringUnions) {
    simpleStringUnions = newSimpleStringUnions;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "statesByCountry " + " [country: " + getCountry() + "]" + " [allStates: " + getAllStates() + "]"
        + " [sixImportantStates: " + getSixImportantStates() + "]" + " [zipUnion: " + getZipUnion() + "]"
        + " [simpleUnion: " + getSimpleUnion() + "]" + " [simpleStringUnion: " + getSimpleStringUnion() + "]";
  }
}
