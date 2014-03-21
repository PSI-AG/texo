package org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ConcreteClass</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "bzWrongFeatureId_ConcreteClass")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ConcreteClass extends AbstractClass implements TheInterface {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String concreteName = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String interfaceName = null;

  /**
   * Returns the value of '<em><b>concreteName</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>concreteName</b></em>' feature
   * @generated
   */
  public String getConcreteName() {
    return concreteName;
  }

  /**
   * Sets the '{@link ConcreteClass#getConcreteName() <em>concreteName</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newConcreteName
   *          the new value of the '{@link ConcreteClass#getConcreteName() concreteName}' feature.
   * @generated
   */
  public void setConcreteName(String newConcreteName) {
    concreteName = newConcreteName;
  }

  /**
   * Returns the value of '<em><b>interfaceName</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>interfaceName</b></em>' feature
   * @generated
   */
  public String getInterfaceName() {
    return interfaceName;
  }

  /**
   * Sets the '{@link ConcreteClass#getInterfaceName() <em>interfaceName</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newInterfaceName
   *          the new value of the '{@link ConcreteClass#getInterfaceName() interfaceName}' feature.
   * @generated
   */
  public void setInterfaceName(String newInterfaceName) {
    interfaceName = newInterfaceName;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ConcreteClass " + " [concreteName: " + getConcreteName() + "]" + " [interfaceName: " + getInterfaceName()
        + "]";
  }
}
