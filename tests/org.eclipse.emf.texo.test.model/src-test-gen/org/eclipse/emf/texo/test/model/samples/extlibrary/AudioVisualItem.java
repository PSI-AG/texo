package org.eclipse.emf.texo.test.model.samples.extlibrary;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AudioVisualItem</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "extlib_AudioVisualItem")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class AudioVisualItem extends CirculatingItem {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String title = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int minutesLength = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private boolean damaged = false;

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
   * Sets the '{@link AudioVisualItem#getTitle() <em>title</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTitle
   *          the new value of the '{@link AudioVisualItem#getTitle() title}' feature.
   * @generated
   */
  public void setTitle(String newTitle) {
    title = newTitle;
  }

  /**
   * Returns the value of '<em><b>minutesLength</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>minutesLength</b></em>' feature
   * @generated
   */
  public int getMinutesLength() {
    return minutesLength;
  }

  /**
   * Sets the '{@link AudioVisualItem#getMinutesLength() <em>minutesLength</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMinutesLength
   *          the new value of the '{@link AudioVisualItem#getMinutesLength() minutesLength}' feature.
   * @generated
   */
  public void setMinutesLength(int newMinutesLength) {
    minutesLength = newMinutesLength;
  }

  /**
   * Returns the value of '<em><b>damaged</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>damaged</b></em>' feature
   * @generated
   */
  public boolean isDamaged() {
    return damaged;
  }

  /**
   * Sets the '{@link AudioVisualItem#isDamaged() <em>damaged</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDamaged
   *          the new value of the '{@link AudioVisualItem#isDamaged() damaged}' feature.
   * @generated
   */
  public void setDamaged(boolean newDamaged) {
    damaged = newDamaged;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AudioVisualItem " + " [title: " + getTitle() + "]" + " [minutesLength: " + getMinutesLength() + "]"
        + " [damaged: " + isDamaged() + "]";
  }
}
