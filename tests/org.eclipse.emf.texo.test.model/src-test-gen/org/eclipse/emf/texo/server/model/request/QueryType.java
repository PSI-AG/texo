package org.eclipse.emf.texo.server.model.request;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>QueryType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "request_QueryType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class QueryType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String namedQuery = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String query = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<Parameter> parameters = new ArrayList<Parameter>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private int firstResult = -1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private int maxResults = -1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private boolean doCount = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private boolean countOperation = false;

  /**
   * Returns the value of '<em><b>namedQuery</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>namedQuery</b></em>' feature
   * @generated
   */
  public String getNamedQuery() {
    return namedQuery;
  }

  /**
   * Sets the '{@link QueryType#getNamedQuery() <em>namedQuery</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNamedQuery
   *          the new value of the '{@link QueryType#getNamedQuery() namedQuery}' feature.
   * @generated
   */
  public void setNamedQuery(String newNamedQuery) {
    namedQuery = newNamedQuery;
  }

  /**
   * Returns the value of '<em><b>query</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>query</b></em>' feature
   * @generated
   */
  public String getQuery() {
    return query;
  }

  /**
   * Sets the '{@link QueryType#getQuery() <em>query</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newQuery
   *          the new value of the '{@link QueryType#getQuery() query}' feature.
   * @generated
   */
  public void setQuery(String newQuery) {
    query = newQuery;
  }

  /**
   * Returns the value of '<em><b>parameters</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>parameters</b></em>' feature
   * @generated
   */
  public List<Parameter> getParameters() {
    return parameters;
  }

  /**
   * Adds to the <em>parameters</em> feature.
   * 
   * @param parametersValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToParameters(Parameter parametersValue) {
    if (!parameters.contains(parametersValue)) {
      boolean result = parameters.add(parametersValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>parameters</em> feature.
   * 
   * @param parametersValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromParameters(Parameter parametersValue) {
    if (parameters.contains(parametersValue)) {
      boolean result = parameters.remove(parametersValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>parameters</em> feature.
   * 
   * @generated
   */
  public void clearParameters() {
    while (!parameters.isEmpty()) {
      removeFromParameters(parameters.iterator().next());
    }
  }

  /**
   * Sets the '{@link QueryType#getParameters() <em>parameters</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newParameters
   *          the new value of the '{@link QueryType#getParameters() parameters}' feature.
   * @generated
   */
  public void setParameters(List<Parameter> newParameters) {
    parameters = newParameters;
  }

  /**
   * Returns the value of '<em><b>firstResult</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>firstResult</b></em>' feature
   * @generated
   */
  public int getFirstResult() {
    return firstResult;
  }

  /**
   * Sets the '{@link QueryType#getFirstResult() <em>firstResult</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFirstResult
   *          the new value of the '{@link QueryType#getFirstResult() firstResult}' feature.
   * @generated
   */
  public void setFirstResult(int newFirstResult) {
    firstResult = newFirstResult;
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
   * Sets the '{@link QueryType#getMaxResults() <em>maxResults</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMaxResults
   *          the new value of the '{@link QueryType#getMaxResults() maxResults}' feature.
   * @generated
   */
  public void setMaxResults(int newMaxResults) {
    maxResults = newMaxResults;
  }

  /**
   * Returns the value of '<em><b>doCount</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>doCount</b></em>' feature
   * @generated
   */
  public boolean isDoCount() {
    return doCount;
  }

  /**
   * Sets the '{@link QueryType#isDoCount() <em>doCount</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDoCount
   *          the new value of the '{@link QueryType#isDoCount() doCount}' feature.
   * @generated
   */
  public void setDoCount(boolean newDoCount) {
    doCount = newDoCount;
  }

  /**
   * Returns the value of '<em><b>countOperation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>countOperation</b></em>' feature
   * @generated
   */
  public boolean isCountOperation() {
    return countOperation;
  }

  /**
   * Sets the '{@link QueryType#isCountOperation() <em>countOperation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCountOperation
   *          the new value of the '{@link QueryType#isCountOperation() countOperation}' feature.
   * @generated
   */
  public void setCountOperation(boolean newCountOperation) {
    countOperation = newCountOperation;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "QueryType " + " [namedQuery: " + getNamedQuery() + "]" + " [query: " + getQuery() + "]" + " [firstResult: "
        + getFirstResult() + "]" + " [maxResults: " + getMaxResults() + "]" + " [doCount: " + isDoCount() + "]"
        + " [countOperation: " + isCountOperation() + "]";
  }
}
