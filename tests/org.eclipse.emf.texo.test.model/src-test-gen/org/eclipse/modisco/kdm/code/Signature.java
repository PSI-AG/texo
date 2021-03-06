package org.eclipse.modisco.kdm.code;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Signature</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "code_Signature")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Signature extends Datatype {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<ParameterUnit> parameterUnit = new ArrayList<ParameterUnit>();

  /**
   * Returns the value of '<em><b>parameterUnit</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>parameterUnit</b></em>' feature
   * @generated
   */
  public List<ParameterUnit> getParameterUnit() {
    return parameterUnit;
  }

  /**
   * Adds to the <em>parameterUnit</em> feature.
   * 
   * @param parameterUnitValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToParameterUnit(ParameterUnit parameterUnitValue) {
    if (!parameterUnit.contains(parameterUnitValue)) {
      boolean result = parameterUnit.add(parameterUnitValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>parameterUnit</em> feature.
   * 
   * @param parameterUnitValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromParameterUnit(ParameterUnit parameterUnitValue) {
    if (parameterUnit.contains(parameterUnitValue)) {
      boolean result = parameterUnit.remove(parameterUnitValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>parameterUnit</em> feature.
   * 
   * @generated
   */
  public void clearParameterUnit() {
    while (!parameterUnit.isEmpty()) {
      removeFromParameterUnit(parameterUnit.iterator().next());
    }
  }

  /**
   * Sets the '{@link Signature#getParameterUnit() <em>parameterUnit</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newParameterUnit
   *          the new value of the '{@link Signature#getParameterUnit() parameterUnit}' feature.
   * @generated
   */
  public void setParameterUnit(List<ParameterUnit> newParameterUnit) {
    parameterUnit = newParameterUnit;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Signature ";
  }
}
