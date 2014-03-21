package org.eclipse.graphiti.mm.pictograms;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AdvancedAnchor</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "pi_AdvancedAnchor")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class AdvancedAnchor extends Anchor {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private boolean useAnchorLocationAsConnectionEndpoint = false;

  /**
   * Returns the value of '<em><b>useAnchorLocationAsConnectionEndpoint</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>useAnchorLocationAsConnectionEndpoint</b></em>' feature
   * @generated
   */
  public boolean isUseAnchorLocationAsConnectionEndpoint() {
    return useAnchorLocationAsConnectionEndpoint;
  }

  /**
   * Sets the '{@link AdvancedAnchor#isUseAnchorLocationAsConnectionEndpoint()
   * <em>useAnchorLocationAsConnectionEndpoint</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newUseAnchorLocationAsConnectionEndpoint
   *          the new value of the '{@link AdvancedAnchor#isUseAnchorLocationAsConnectionEndpoint()
   *          useAnchorLocationAsConnectionEndpoint}' feature.
   * @generated
   */
  public void setUseAnchorLocationAsConnectionEndpoint(boolean newUseAnchorLocationAsConnectionEndpoint) {
    useAnchorLocationAsConnectionEndpoint = newUseAnchorLocationAsConnectionEndpoint;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AdvancedAnchor " + " [useAnchorLocationAsConnectionEndpoint: " + isUseAnchorLocationAsConnectionEndpoint()
        + "]";
  }
}
