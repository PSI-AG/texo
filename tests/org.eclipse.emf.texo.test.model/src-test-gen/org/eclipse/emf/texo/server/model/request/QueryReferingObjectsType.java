package org.eclipse.emf.texo.server.model.request;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>QueryReferingObjectsType</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "request_QueryReferingObjectsType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class QueryReferingObjectsType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String targetUri = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Boolean includeContainerReferences = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private int maxResults = -1;

  /**
   * Returns the value of '<em><b>targetUri</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>targetUri</b></em>' feature
   * @generated
   */
  public String getTargetUri() {
    return targetUri;
  }

  /**
   * Sets the '{@link QueryReferingObjectsType#getTargetUri() <em>targetUri</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTargetUri
   *          the new value of the '{@link QueryReferingObjectsType#getTargetUri() targetUri}' feature.
   * @generated
   */
  public void setTargetUri(String newTargetUri) {
    targetUri = newTargetUri;
  }

  /**
   * Returns the value of '<em><b>includeContainerReferences</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>includeContainerReferences</b></em>' feature
   * @generated
   */
  public Boolean getIncludeContainerReferences() {
    return includeContainerReferences;
  }

  /**
   * Sets the '{@link QueryReferingObjectsType#getIncludeContainerReferences() <em>includeContainerReferences</em>}'
   * feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newIncludeContainerReferences
   *          the new value of the '{@link QueryReferingObjectsType#getIncludeContainerReferences()
   *          includeContainerReferences}' feature.
   * @generated
   */
  public void setIncludeContainerReferences(Boolean newIncludeContainerReferences) {
    includeContainerReferences = newIncludeContainerReferences;
  }

  /**
   * Returns the value of '<em><b>maxResults</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>maxResults</b></em>' feature
   * @generated
   */
  public int getMaxResults() {
    return maxResults;
  }

  /**
   * Sets the '{@link QueryReferingObjectsType#getMaxResults() <em>maxResults</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMaxResults
   *          the new value of the '{@link QueryReferingObjectsType#getMaxResults() maxResults}' feature.
   * @generated
   */
  public void setMaxResults(int newMaxResults) {
    maxResults = newMaxResults;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "QueryReferingObjectsType " + " [targetUri: " + getTargetUri() + "]" + " [includeContainerReferences: "
        + getIncludeContainerReferences() + "]" + " [maxResults: " + getMaxResults() + "]";
  }
}
