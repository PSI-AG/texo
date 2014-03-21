package org.eclipse.emf.texo.test.model.issues.bz399086;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>TheMap</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "bz399086_TheMap")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class TheMap extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @MapKeyColumn(table = "bz399086_TheMap_refContent")
  @JoinTable(name = "bz399086_TheMap_refContent")
  private Map<String, MapElement> refContent = new LinkedHashMap<String, MapElement>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  private Map<String, String> valueContent = new LinkedHashMap<String, String>();

  /**
   * Returns the value of '<em><b>refContent</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>refContent</b></em>' feature
   * @generated
   */
  public Map<String, MapElement> getRefContent() {
    return refContent;
  }

  /**
   * Sets the '{@link TheMap#getRefContent() <em>refContent</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newRefContent
   *          the new value of the '{@link TheMap#getRefContent() refContent}' feature.
   * @generated
   */
  public void setRefContent(Map<String, MapElement> newRefContent) {
    refContent = newRefContent;
  }

  /**
   * Returns the value of '<em><b>valueContent</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>valueContent</b></em>' feature
   * @generated
   */
  public Map<String, String> getValueContent() {
    return valueContent;
  }

  /**
   * Sets the '{@link TheMap#getValueContent() <em>valueContent</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newValueContent
   *          the new value of the '{@link TheMap#getValueContent() valueContent}' feature.
   * @generated
   */
  public void setValueContent(Map<String, String> newValueContent) {
    valueContent = newValueContent;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "TheMap ";
  }
}
