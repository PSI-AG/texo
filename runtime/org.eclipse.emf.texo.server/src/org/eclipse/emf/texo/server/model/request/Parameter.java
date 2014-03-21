package org.eclipse.emf.texo.server.model.request;

/**
 * A representation of the model object '<em><b>Parameter</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Parameter {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private Object value = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private String type = null;

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link Parameter#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Parameter#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>value</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>value</b></em>' feature
   * @generated
   */
  public Object getValue() {
    return value;
  }

  /**
   * Sets the '{@link Parameter#getValue() <em>value</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Parameter#getValue() value}' feature.
   * @generated
   */
  public void setValue(Object newValue) {
    value = newValue;
  }

  /**
   * Returns the value of '<em><b>type</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>type</b></em>' feature
   * @generated
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the '{@link Parameter#getType() <em>type</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Parameter#getType() type}' feature.
   * @generated
   */
  public void setType(String newType) {
    type = newType;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Parameter " + " [name: " + getName() + "]" + " [value: " + getValue() + "]" + " [type: " + getType() + "]";
  }
}
