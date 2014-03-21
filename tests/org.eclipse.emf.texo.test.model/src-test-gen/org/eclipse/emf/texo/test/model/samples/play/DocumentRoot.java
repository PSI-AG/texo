package org.eclipse.emf.texo.test.model.samples.play;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>DocumentRoot</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DocumentRoot extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private List<DocumentRootMixedFeatureGroup> mixed = new ArrayList<DocumentRootMixedFeatureGroup>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private Map<String, String> xMLNSPrefixMap = new LinkedHashMap<String, String>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private Map<String, String> xSISchemaLocation = new LinkedHashMap<String, String>();

  /**
   * Returns the value of '<em><b>mixed</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>mixed</b></em>' feature
   * @generated
   */
  public List<DocumentRootMixedFeatureGroup> getMixed() {
    return mixed;
  }

  /**
   * Sets the '{@link DocumentRoot#getMixed() <em>mixed</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMixed
   *          the new value of the '{@link DocumentRoot#getMixed() mixed}' feature.
   * @generated
   */
  public void setMixed(List<DocumentRootMixedFeatureGroup> newMixed) {
    mixed = newMixed;
  }

  /**
   * Returns the value of '<em><b>xMLNSPrefixMap</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>xMLNSPrefixMap</b></em>' feature
   * @generated
   */
  public Map<String, String> getXMLNSPrefixMap() {
    return xMLNSPrefixMap;
  }

  /**
   * Sets the '{@link DocumentRoot#getXMLNSPrefixMap() <em>xMLNSPrefixMap</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newXMLNSPrefixMap
   *          the new value of the '{@link DocumentRoot#getXMLNSPrefixMap() xMLNSPrefixMap}' feature.
   * @generated
   */
  public void setXMLNSPrefixMap(Map<String, String> newXMLNSPrefixMap) {
    xMLNSPrefixMap = newXMLNSPrefixMap;
  }

  /**
   * Returns the value of '<em><b>xSISchemaLocation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>xSISchemaLocation</b></em>' feature
   * @generated
   */
  public Map<String, String> getXSISchemaLocation() {
    return xSISchemaLocation;
  }

  /**
   * Sets the '{@link DocumentRoot#getXSISchemaLocation() <em>xSISchemaLocation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newXSISchemaLocation
   *          the new value of the '{@link DocumentRoot#getXSISchemaLocation() xSISchemaLocation}' feature.
   * @generated
   */
  public void setXSISchemaLocation(Map<String, String> newXSISchemaLocation) {
    xSISchemaLocation = newXSISchemaLocation;
  }

  /**
   * Returns the value of '<em><b>act</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>act</b></em>' feature
   * @generated
   */
  public ActType getAct() {
    return DocumentRootMixedFeatureGroup
        .getSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.ACT);
  }

  /**
   * Sets the '{@link DocumentRoot#getAct() <em>act</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAct
   *          the new value of the '{@link DocumentRoot#getAct() act}' feature.
   * @generated
   */
  public void setAct(ActType newAct) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.ACT,
        newAct);
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
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.FM);
  }

  /**
   * Sets the '{@link DocumentRoot#getFm() <em>fm</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFm
   *          the new value of the '{@link DocumentRoot#getFm() fm}' feature.
   * @generated
   */
  public void setFm(FmType newFm) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.FM, newFm);
  }

  /**
   * Returns the value of '<em><b>groupDescription</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>groupDescription</b></em>' feature
   * @generated
   */
  public String getGroupDescription() {
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.GROUPDESCRIPTION);
  }

  /**
   * Sets the '{@link DocumentRoot#getGroupDescription() <em>groupDescription</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGroupDescription
   *          the new value of the '{@link DocumentRoot#getGroupDescription() groupDescription}' feature.
   * @generated
   */
  public void setGroupDescription(String newGroupDescription) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.GROUPDESCRIPTION, newGroupDescription);
  }

  /**
   * Returns the value of '<em><b>line</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>line</b></em>' feature
   * @generated
   */
  public String getLine() {
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.LINE);
  }

  /**
   * Sets the '{@link DocumentRoot#getLine() <em>line</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLine
   *          the new value of the '{@link DocumentRoot#getLine() line}' feature.
   * @generated
   */
  public void setLine(String newLine) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.LINE,
        newLine);
  }

  /**
   * Returns the value of '<em><b>p</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>p</b></em>' feature
   * @generated
   */
  public String getP() {
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.P);
  }

  /**
   * Sets the '{@link DocumentRoot#getP() <em>p</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newP
   *          the new value of the '{@link DocumentRoot#getP() p}' feature.
   * @generated
   */
  public void setP(String newP) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.P, newP);
  }

  /**
   * Returns the value of '<em><b>persona</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>persona</b></em>' feature
   * @generated
   */
  public String getPersona() {
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.PERSONA);
  }

  /**
   * Sets the '{@link DocumentRoot#getPersona() <em>persona</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPersona
   *          the new value of the '{@link DocumentRoot#getPersona() persona}' feature.
   * @generated
   */
  public void setPersona(String newPersona) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.PERSONA,
        newPersona);
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
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.PERSONAE);
  }

  /**
   * Sets the '{@link DocumentRoot#getPersonae() <em>personae</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPersonae
   *          the new value of the '{@link DocumentRoot#getPersonae() personae}' feature.
   * @generated
   */
  public void setPersonae(PersonaeType newPersonae) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.PERSONAE,
        newPersonae);
  }

  /**
   * Returns the value of '<em><b>personaGroup</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>personaGroup</b></em>' feature
   * @generated
   */
  public PersonaGroupType getPersonaGroup() {
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.PERSONAGROUP);
  }

  /**
   * Sets the '{@link DocumentRoot#getPersonaGroup() <em>personaGroup</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPersonaGroup
   *          the new value of the '{@link DocumentRoot#getPersonaGroup() personaGroup}' feature.
   * @generated
   */
  public void setPersonaGroup(PersonaGroupType newPersonaGroup) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.PERSONAGROUP, newPersonaGroup);
  }

  /**
   * Returns the value of '<em><b>play</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>play</b></em>' feature
   * @generated
   */
  public PlayType getPlay() {
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.PLAY);
  }

  /**
   * Sets the '{@link DocumentRoot#getPlay() <em>play</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPlay
   *          the new value of the '{@link DocumentRoot#getPlay() play}' feature.
   * @generated
   */
  public void setPlay(PlayType newPlay) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.PLAY,
        newPlay);
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
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.PLAYSUBTITLE);
  }

  /**
   * Sets the '{@link DocumentRoot#getPlaySubTitle() <em>playSubTitle</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPlaySubTitle
   *          the new value of the '{@link DocumentRoot#getPlaySubTitle() playSubTitle}' feature.
   * @generated
   */
  public void setPlaySubTitle(String newPlaySubTitle) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.PLAYSUBTITLE, newPlaySubTitle);
  }

  /**
   * Returns the value of '<em><b>scene</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>scene</b></em>' feature
   * @generated
   */
  public SceneType getScene() {
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.SCENE);
  }

  /**
   * Sets the '{@link DocumentRoot#getScene() <em>scene</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newScene
   *          the new value of the '{@link DocumentRoot#getScene() scene}' feature.
   * @generated
   */
  public void setScene(SceneType newScene) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.SCENE,
        newScene);
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
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.SCENEDESCRIPTION);
  }

  /**
   * Sets the '{@link DocumentRoot#getSceneDescription() <em>sceneDescription</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSceneDescription
   *          the new value of the '{@link DocumentRoot#getSceneDescription() sceneDescription}' feature.
   * @generated
   */
  public void setSceneDescription(String newSceneDescription) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.SCENEDESCRIPTION, newSceneDescription);
  }

  /**
   * Returns the value of '<em><b>speaker</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>speaker</b></em>' feature
   * @generated
   */
  public String getSpeaker() {
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.SPEAKER);
  }

  /**
   * Sets the '{@link DocumentRoot#getSpeaker() <em>speaker</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSpeaker
   *          the new value of the '{@link DocumentRoot#getSpeaker() speaker}' feature.
   * @generated
   */
  public void setSpeaker(String newSpeaker) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.SPEAKER,
        newSpeaker);
  }

  /**
   * Returns the value of '<em><b>speech</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>speech</b></em>' feature
   * @generated
   */
  public SpeechType getSpeech() {
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.SPEECH);
  }

  /**
   * Sets the '{@link DocumentRoot#getSpeech() <em>speech</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSpeech
   *          the new value of the '{@link DocumentRoot#getSpeech() speech}' feature.
   * @generated
   */
  public void setSpeech(SpeechType newSpeech) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.SPEECH,
        newSpeech);
  }

  /**
   * Returns the value of '<em><b>stageDirections</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>stageDirections</b></em>' feature
   * @generated
   */
  public String getStageDirections() {
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.STAGEDIRECTIONS);
  }

  /**
   * Sets the '{@link DocumentRoot#getStageDirections() <em>stageDirections</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStageDirections
   *          the new value of the '{@link DocumentRoot#getStageDirections() stageDirections}' feature.
   * @generated
   */
  public void setStageDirections(String newStageDirections) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.STAGEDIRECTIONS, newStageDirections);
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
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.TITLE);
  }

  /**
   * Sets the '{@link DocumentRoot#getTitle() <em>title</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTitle
   *          the new value of the '{@link DocumentRoot#getTitle() title}' feature.
   * @generated
   */
  public void setTitle(String newTitle) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.TITLE,
        newTitle);
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "DocumentRoot " + " [groupDescription: " + getGroupDescription() + "]" + " [line: " + getLine() + "]"
        + " [p: " + getP() + "]" + " [persona: " + getPersona() + "]" + " [playSubTitle: " + getPlaySubTitle() + "]"
        + " [sceneDescription: " + getSceneDescription() + "]" + " [speaker: " + getSpeaker() + "]"
        + " [stageDirections: " + getStageDirections() + "]" + " [title: " + getTitle() + "]";
  }
}
