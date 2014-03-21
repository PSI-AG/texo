package org.eclipse.modisco.kdm.event;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>EventAction</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "event_EventAction")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class EventAction extends AbstractEventElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String kind = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<Event> eventElement = new HashSet<Event>();

  /**
   * Returns the value of '<em><b>kind</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>kind</b></em>' feature
   * @generated
   */
  public String getKind() {
    return kind;
  }

  /**
   * Sets the '{@link EventAction#getKind() <em>kind</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newKind
   *          the new value of the '{@link EventAction#getKind() kind}' feature.
   * @generated
   */
  public void setKind(String newKind) {
    kind = newKind;
  }

  /**
   * Returns the value of '<em><b>eventElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>eventElement</b></em>' feature
   * @generated
   */
  public Set<Event> getEventElement() {
    return eventElement;
  }

  /**
   * Adds to the <em>eventElement</em> feature.
   * 
   * @param eventElementValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToEventElement(Event eventElementValue) {
    if (!eventElement.contains(eventElementValue)) {
      boolean result = eventElement.add(eventElementValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>eventElement</em> feature.
   * 
   * @param eventElementValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromEventElement(Event eventElementValue) {
    if (eventElement.contains(eventElementValue)) {
      boolean result = eventElement.remove(eventElementValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>eventElement</em> feature.
   * 
   * @generated
   */
  public void clearEventElement() {
    while (!eventElement.isEmpty()) {
      removeFromEventElement(eventElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link EventAction#getEventElement() <em>eventElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEventElement
   *          the new value of the '{@link EventAction#getEventElement() eventElement}' feature.
   * @generated
   */
  public void setEventElement(Set<Event> newEventElement) {
    eventElement = newEventElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "EventAction " + " [kind: " + getKind() + "]";
  }
}
