package org.eclipse.emf.texo.server.model.request;

/**
 * A representation of the model object '<em><b>QueryReferingObjectsType</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class QueryReferingObjectsType {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private String targetUri = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private Boolean includeContainerReferences = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
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
   * @param the
   *          new value of the '{@link QueryReferingObjectsType#getTargetUri() targetUri}' feature.
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
   * @param the
   *          new value of the '{@link QueryReferingObjectsType#getIncludeContainerReferences()
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
   * @param the
   *          new value of the '{@link QueryReferingObjectsType#getMaxResults() maxResults}' feature.
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
