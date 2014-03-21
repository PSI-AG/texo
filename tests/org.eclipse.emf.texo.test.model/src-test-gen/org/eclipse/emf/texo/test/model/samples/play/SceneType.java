package org.eclipse.emf.texo.test.model.samples.play;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>SceneType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "play_SceneType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class SceneType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = SceneTypeGroupFeatureGroup.class)
  @JoinTable()
  private List<SceneTypeGroupFeatureGroup> group = new ArrayList<SceneTypeGroupFeatureGroup>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Enumerated(EnumType.STRING)
  private PindexType pindex = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String title = null;

  /**
   * Returns the value of '<em><b>group</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>group</b></em>' feature
   * @generated
   */
  public List<SceneTypeGroupFeatureGroup> getGroup() {
    return group;
  }

  /**
   * Sets the '{@link SceneType#getGroup() <em>group</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGroup
   *          the new value of the '{@link SceneType#getGroup() group}' feature.
   * @generated
   */
  public void setGroup(List<SceneTypeGroupFeatureGroup> newGroup) {
    group = newGroup;
  }

  /**
   * Returns the value of '<em><b>stageDirections</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>stageDirections</b></em>' feature
   * @generated
   */
  public List<String> getStageDirections() {
    return SceneTypeGroupFeatureGroup.createUnmodifiableValueList(getGroup(),
        SceneTypeGroupFeatureGroup.Feature.STAGEDIRECTIONS);
  }

  /**
   * Sets the '{@link SceneType#getStageDirections() <em>stageDirections</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStageDirections
   *          the new value of the '{@link SceneType#getStageDirections() stageDirections}' feature.
   * @generated
   */
  public void setStageDirections(List<String> newStageDirections) {
    setGroup(SceneTypeGroupFeatureGroup.createFeatureGroupList(SceneTypeGroupFeatureGroup.Feature.STAGEDIRECTIONS,
        newStageDirections));
  }

  /**
   * Returns the value of '<em><b>speech</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>speech</b></em>' feature
   * @generated
   */
  public List<SpeechType> getSpeech() {
    return SceneTypeGroupFeatureGroup
        .createUnmodifiableValueList(getGroup(), SceneTypeGroupFeatureGroup.Feature.SPEECH);
  }

  /**
   * Sets the '{@link SceneType#getSpeech() <em>speech</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSpeech
   *          the new value of the '{@link SceneType#getSpeech() speech}' feature.
   * @generated
   */
  public void setSpeech(List<SpeechType> newSpeech) {
    setGroup(SceneTypeGroupFeatureGroup.createFeatureGroupList(SceneTypeGroupFeatureGroup.Feature.SPEECH, newSpeech));
  }

  /**
   * Returns the value of '<em><b>pindex</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>pindex</b></em>' feature
   * @generated
   */
  public PindexType getPindex() {
    return pindex;
  }

  /**
   * Sets the '{@link SceneType#getPindex() <em>pindex</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPindex
   *          the new value of the '{@link SceneType#getPindex() pindex}' feature.
   * @generated
   */
  public void setPindex(PindexType newPindex) {
    pindex = newPindex;
  }

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
   * Sets the '{@link SceneType#getTitle() <em>title</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTitle
   *          the new value of the '{@link SceneType#getTitle() title}' feature.
   * @generated
   */
  public void setTitle(String newTitle) {
    title = newTitle;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SceneType " + " [pindex: " + getPindex() + "]" + " [title: " + getTitle() + "]";
  }
}
