package org.eclipse.emf.texo.test.model.samples.play;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ActType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "play_ActType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ActType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<SceneType> scene = new ArrayList<SceneType>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private byte pindex = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String title = null;

  /**
   * Returns the value of '<em><b>scene</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>scene</b></em>' feature
   * @generated
   */
  public List<SceneType> getScene() {
    return scene;
  }

  /**
   * Adds to the <em>scene</em> feature.
   * 
   * @param sceneValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToScene(SceneType sceneValue) {
    if (!scene.contains(sceneValue)) {
      boolean result = scene.add(sceneValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>scene</em> feature.
   * 
   * @param sceneValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromScene(SceneType sceneValue) {
    if (scene.contains(sceneValue)) {
      boolean result = scene.remove(sceneValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>scene</em> feature.
   * 
   * @generated
   */
  public void clearScene() {
    while (!scene.isEmpty()) {
      removeFromScene(scene.iterator().next());
    }
  }

  /**
   * Sets the '{@link ActType#getScene() <em>scene</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newScene
   *          the new value of the '{@link ActType#getScene() scene}' feature.
   * @generated
   */
  public void setScene(List<SceneType> newScene) {
    scene = newScene;
  }

  /**
   * Returns the value of '<em><b>pindex</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>pindex</b></em>' feature
   * @generated
   */
  public byte getPindex() {
    return pindex;
  }

  /**
   * Sets the '{@link ActType#getPindex() <em>pindex</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPindex
   *          the new value of the '{@link ActType#getPindex() pindex}' feature.
   * @generated
   */
  public void setPindex(byte newPindex) {
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
   * Sets the '{@link ActType#getTitle() <em>title</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTitle
   *          the new value of the '{@link ActType#getTitle() title}' feature.
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
    return "ActType " + " [pindex: " + getPindex() + "]" + " [title: " + getTitle() + "]";
  }
}
