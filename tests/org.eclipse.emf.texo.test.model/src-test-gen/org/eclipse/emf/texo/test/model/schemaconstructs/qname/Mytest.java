package org.eclipse.emf.texo.test.model.schemaconstructs.qname;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OrderColumn;
import javax.xml.namespace.QName;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Mytest</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "qname_Mytest")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Mytest extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String description = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Convert("TexoTestQNameConverter")
  private QName name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @Convert("TexoTestQNameConverter")
  @CollectionTable()
  private List<QName> names = new ArrayList<QName>();

  /**
   * Returns the value of '<em><b>description</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>description</b></em>' feature
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the '{@link Mytest#getDescription() <em>description</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDescription
   *          the new value of the '{@link Mytest#getDescription() description}' feature.
   * @generated
   */
  public void setDescription(String newDescription) {
    description = newDescription;
  }

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public QName getName() {
    return name;
  }

  /**
   * Sets the '{@link Mytest#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Mytest#getName() name}' feature.
   * @generated
   */
  public void setName(QName newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>names</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>names</b></em>' feature
   * @generated
   */
  public List<QName> getNames() {
    return names;
  }

  /**
   * Sets the '{@link Mytest#getNames() <em>names</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNames
   *          the new value of the '{@link Mytest#getNames() names}' feature.
   * @generated
   */
  public void setNames(List<QName> newNames) {
    names = newNames;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Mytest " + " [description: " + getDescription() + "]" + " [name: " + getName() + "]";
  }
}
