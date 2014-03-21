package org.eclipse.modisco.kdm.source;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>InventoryItem</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "source_InventoryItem")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class InventoryItem extends AbstractInventoryElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String version = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String path = null;

  /**
   * Returns the value of '<em><b>version</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>version</b></em>' feature
   * @generated
   */
  public String getVersion() {
    return version;
  }

  /**
   * Sets the '{@link InventoryItem#getVersion() <em>version</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newVersion
   *          the new value of the '{@link InventoryItem#getVersion() version}' feature.
   * @generated
   */
  public void setVersion(String newVersion) {
    version = newVersion;
  }

  /**
   * Returns the value of '<em><b>path</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>path</b></em>' feature
   * @generated
   */
  public String getPath() {
    return path;
  }

  /**
   * Sets the '{@link InventoryItem#getPath() <em>path</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPath
   *          the new value of the '{@link InventoryItem#getPath() path}' feature.
   * @generated
   */
  public void setPath(String newPath) {
    path = newPath;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "InventoryItem " + " [version: " + getVersion() + "]" + " [path: " + getPath() + "]";
  }
}
