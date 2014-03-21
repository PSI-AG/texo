package org.eclipse.modisco.kdm.event;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.kdm.KDMModel;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>EventModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "event_EventModel")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class EventModel extends KDMModel {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractEventElement> eventElement = new HashSet<AbstractEventElement>();

  /**
   * Returns the value of '<em><b>eventElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>eventElement</b></em>' feature
   * @generated
   */
  public Set<AbstractEventElement> getEventElement() {
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
  public boolean addToEventElement(AbstractEventElement eventElementValue) {
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
  public boolean removeFromEventElement(AbstractEventElement eventElementValue) {
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
   * Sets the '{@link EventModel#getEventElement() <em>eventElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEventElement
   *          the new value of the '{@link EventModel#getEventElement() eventElement}' feature.
   * @generated
   */
  public void setEventElement(Set<AbstractEventElement> newEventElement) {
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
    return "EventModel ";
  }
}
