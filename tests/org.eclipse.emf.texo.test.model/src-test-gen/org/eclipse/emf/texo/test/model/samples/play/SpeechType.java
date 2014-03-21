package org.eclipse.emf.texo.test.model.samples.play;

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
 * A representation of the model object '<em><b>SpeechType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "play_SpeechType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class SpeechType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = SpeechTypeGroupFeatureGroup.class)
  @JoinTable()
  private List<SpeechTypeGroupFeatureGroup> group = new ArrayList<SpeechTypeGroupFeatureGroup>();

  /**
   * Returns the value of '<em><b>group</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>group</b></em>' feature
   * @generated
   */
  public List<SpeechTypeGroupFeatureGroup> getGroup() {
    return group;
  }

  /**
   * Sets the '{@link SpeechType#getGroup() <em>group</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGroup
   *          the new value of the '{@link SpeechType#getGroup() group}' feature.
   * @generated
   */
  public void setGroup(List<SpeechTypeGroupFeatureGroup> newGroup) {
    group = newGroup;
  }

  /**
   * Returns the value of '<em><b>speaker</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>speaker</b></em>' feature
   * @generated
   */
  public List<String> getSpeaker() {
    return SpeechTypeGroupFeatureGroup.createUnmodifiableValueList(getGroup(),
        SpeechTypeGroupFeatureGroup.Feature.SPEAKER);
  }

  /**
   * Sets the '{@link SpeechType#getSpeaker() <em>speaker</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSpeaker
   *          the new value of the '{@link SpeechType#getSpeaker() speaker}' feature.
   * @generated
   */
  public void setSpeaker(List<String> newSpeaker) {
    setGroup(SpeechTypeGroupFeatureGroup
        .createFeatureGroupList(SpeechTypeGroupFeatureGroup.Feature.SPEAKER, newSpeaker));
  }

  /**
   * Returns the value of '<em><b>line</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>line</b></em>' feature
   * @generated
   */
  public List<String> getLine() {
    return SpeechTypeGroupFeatureGroup
        .createUnmodifiableValueList(getGroup(), SpeechTypeGroupFeatureGroup.Feature.LINE);
  }

  /**
   * Sets the '{@link SpeechType#getLine() <em>line</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLine
   *          the new value of the '{@link SpeechType#getLine() line}' feature.
   * @generated
   */
  public void setLine(List<String> newLine) {
    setGroup(SpeechTypeGroupFeatureGroup.createFeatureGroupList(SpeechTypeGroupFeatureGroup.Feature.LINE, newLine));
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
    return SpeechTypeGroupFeatureGroup.createUnmodifiableValueList(getGroup(),
        SpeechTypeGroupFeatureGroup.Feature.STAGEDIRECTIONS);
  }

  /**
   * Sets the '{@link SpeechType#getStageDirections() <em>stageDirections</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStageDirections
   *          the new value of the '{@link SpeechType#getStageDirections() stageDirections}' feature.
   * @generated
   */
  public void setStageDirections(List<String> newStageDirections) {
    setGroup(SpeechTypeGroupFeatureGroup.createFeatureGroupList(SpeechTypeGroupFeatureGroup.Feature.STAGEDIRECTIONS,
        newStageDirections));
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SpeechType ";
  }
}
