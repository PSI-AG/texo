package org.eclipse.emf.texo.test.model.samples.play;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>PlayType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "play_PlayType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class PlayType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String title = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private FmType fm = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private PersonaeType personae = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String sceneDescription = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String playSubTitle = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<ActType> act = new ArrayList<ActType>();

  /**
   * Returns the value of '<em><b>title</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>title</b></em>' feature
   * @generated
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the '{@link PlayType#getTitle() <em>title</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTitle
   *          the new value of the '{@link PlayType#getTitle() title}' feature.
   * @generated
   */
  public void setTitle(String newTitle) {
    title = newTitle;
  }

  /**
   * Returns the value of '<em><b>fm</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>fm</b></em>' feature
   * @generated
   */
  public FmType getFm() {
    return fm;
  }

  /**
   * Sets the '{@link PlayType#getFm() <em>fm</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFm
   *          the new value of the '{@link PlayType#getFm() fm}' feature.
   * @generated
   */
  public void setFm(FmType newFm) {
    fm = newFm;
  }

  /**
   * Returns the value of '<em><b>personae</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>personae</b></em>' feature
   * @generated
   */
  public PersonaeType getPersonae() {
    return personae;
  }

  /**
   * Sets the '{@link PlayType#getPersonae() <em>personae</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPersonae
   *          the new value of the '{@link PlayType#getPersonae() personae}' feature.
   * @generated
   */
  public void setPersonae(PersonaeType newPersonae) {
    personae = newPersonae;
  }

  /**
   * Returns the value of '<em><b>sceneDescription</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>sceneDescription</b></em>' feature
   * @generated
   */
  public String getSceneDescription() {
    return sceneDescription;
  }

  /**
   * Sets the '{@link PlayType#getSceneDescription() <em>sceneDescription</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSceneDescription
   *          the new value of the '{@link PlayType#getSceneDescription() sceneDescription}' feature.
   * @generated
   */
  public void setSceneDescription(String newSceneDescription) {
    sceneDescription = newSceneDescription;
  }

  /**
   * Returns the value of '<em><b>playSubTitle</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>playSubTitle</b></em>' feature
   * @generated
   */
  public String getPlaySubTitle() {
    return playSubTitle;
  }

  /**
   * Sets the '{@link PlayType#getPlaySubTitle() <em>playSubTitle</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPlaySubTitle
   *          the new value of the '{@link PlayType#getPlaySubTitle() playSubTitle}' feature.
   * @generated
   */
  public void setPlaySubTitle(String newPlaySubTitle) {
    playSubTitle = newPlaySubTitle;
  }

  /**
   * Returns the value of '<em><b>act</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>act</b></em>' feature
   * @generated
   */
  public List<ActType> getAct() {
    return act;
  }

  /**
   * Adds to the <em>act</em> feature.
   * 
   * @param actValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToAct(ActType actValue) {
    if (!act.contains(actValue)) {
      boolean result = act.add(actValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>act</em> feature.
   * 
   * @param actValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromAct(ActType actValue) {
    if (act.contains(actValue)) {
      boolean result = act.remove(actValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>act</em> feature.
   * 
   * @generated
   */
  public void clearAct() {
    while (!act.isEmpty()) {
      removeFromAct(act.iterator().next());
    }
  }

  /**
   * Sets the '{@link PlayType#getAct() <em>act</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAct
   *          the new value of the '{@link PlayType#getAct() act}' feature.
   * @generated
   */
  public void setAct(List<ActType> newAct) {
    act = newAct;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PlayType " + " [title: " + getTitle() + "]" + " [sceneDescription: " + getSceneDescription() + "]"
        + " [playSubTitle: " + getPlaySubTitle() + "]";
  }
}
