package org.eclipse.emf.texo.test.model.issues.bz325429_test;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Person</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "test_Person")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Person extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String firstname = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String lastname = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  private Address address = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  private List<Contact> contacts = new ArrayList<Contact>();

  /**
   * Returns the value of '<em><b>firstname</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>firstname</b></em>' feature
   * @generated
   */
  public String getFirstname() {
    return firstname;
  }

  /**
   * Sets the '{@link Person#getFirstname() <em>firstname</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFirstname
   *          the new value of the '{@link Person#getFirstname() firstname}' feature.
   * @generated
   */
  public void setFirstname(String newFirstname) {
    firstname = newFirstname;
  }

  /**
   * Returns the value of '<em><b>lastname</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>lastname</b></em>' feature
   * @generated
   */
  public String getLastname() {
    return lastname;
  }

  /**
   * Sets the '{@link Person#getLastname() <em>lastname</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLastname
   *          the new value of the '{@link Person#getLastname() lastname}' feature.
   * @generated
   */
  public void setLastname(String newLastname) {
    lastname = newLastname;
  }

  /**
   * Returns the value of '<em><b>address</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>address</b></em>' feature
   * @generated
   */
  public Address getAddress() {
    return address;
  }

  /**
   * Sets the '{@link Person#getAddress() <em>address</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAddress
   *          the new value of the '{@link Person#getAddress() address}' feature.
   * @generated
   */
  public void setAddress(Address newAddress) {
    address = newAddress;
  }

  /**
   * Returns the value of '<em><b>contacts</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>contacts</b></em>' feature
   * @generated
   */
  public List<Contact> getContacts() {
    return contacts;
  }

  /**
   * Adds to the <em>contacts</em> feature.
   * 
   * @param contactsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToContacts(Contact contactsValue) {
    if (!contacts.contains(contactsValue)) {
      boolean result = contacts.add(contactsValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>contacts</em> feature.
   * 
   * @param contactsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromContacts(Contact contactsValue) {
    if (contacts.contains(contactsValue)) {
      boolean result = contacts.remove(contactsValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>contacts</em> feature.
   * 
   * @generated
   */
  public void clearContacts() {
    while (!contacts.isEmpty()) {
      removeFromContacts(contacts.iterator().next());
    }
  }

  /**
   * Sets the '{@link Person#getContacts() <em>contacts</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newContacts
   *          the new value of the '{@link Person#getContacts() contacts}' feature.
   * @generated
   */
  public void setContacts(List<Contact> newContacts) {
    contacts = newContacts;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Person " + " [firstname: " + getFirstname() + "]" + " [lastname: " + getLastname() + "]";
  }
}
