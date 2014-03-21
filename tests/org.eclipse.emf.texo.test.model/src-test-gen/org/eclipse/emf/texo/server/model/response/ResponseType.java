package org.eclipse.emf.texo.server.model.response;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ResponseType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "response_ResponseType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ResponseType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String status = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private long startRow = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private long endRow = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private long totalRows = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @Convert("TexoTestObjectConverter")
  private List<Object> data = new ArrayList<Object>();

  /**
   * Returns the value of '<em><b>status</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>status</b></em>' feature
   * @generated
   */
  public String getStatus() {
    return status;
  }

  /**
   * Sets the '{@link ResponseType#getStatus() <em>status</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStatus
   *          the new value of the '{@link ResponseType#getStatus() status}' feature.
   * @generated
   */
  public void setStatus(String newStatus) {
    status = newStatus;
  }

  /**
   * Returns the value of '<em><b>startRow</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>startRow</b></em>' feature
   * @generated
   */
  public long getStartRow() {
    return startRow;
  }

  /**
   * Sets the '{@link ResponseType#getStartRow() <em>startRow</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStartRow
   *          the new value of the '{@link ResponseType#getStartRow() startRow}' feature.
   * @generated
   */
  public void setStartRow(long newStartRow) {
    startRow = newStartRow;
  }

  /**
   * Returns the value of '<em><b>endRow</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>endRow</b></em>' feature
   * @generated
   */
  public long getEndRow() {
    return endRow;
  }

  /**
   * Sets the '{@link ResponseType#getEndRow() <em>endRow</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEndRow
   *          the new value of the '{@link ResponseType#getEndRow() endRow}' feature.
   * @generated
   */
  public void setEndRow(long newEndRow) {
    endRow = newEndRow;
  }

  /**
   * Returns the value of '<em><b>totalRows</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>totalRows</b></em>' feature
   * @generated
   */
  public long getTotalRows() {
    return totalRows;
  }

  /**
   * Sets the '{@link ResponseType#getTotalRows() <em>totalRows</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTotalRows
   *          the new value of the '{@link ResponseType#getTotalRows() totalRows}' feature.
   * @generated
   */
  public void setTotalRows(long newTotalRows) {
    totalRows = newTotalRows;
  }

  /**
   * Returns the value of '<em><b>data</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>data</b></em>' feature
   * @generated
   */
  public List<Object> getData() {
    return data;
  }

  /**
   * Adds to the <em>data</em> feature.
   * 
   * @param dataValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToData(Object dataValue) {
    if (!data.contains(dataValue)) {
      boolean result = data.add(dataValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>data</em> feature.
   * 
   * @param dataValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromData(Object dataValue) {
    if (data.contains(dataValue)) {
      boolean result = data.remove(dataValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>data</em> feature.
   * 
   * @generated
   */
  public void clearData() {
    while (!data.isEmpty()) {
      removeFromData(data.iterator().next());
    }
  }

  /**
   * Sets the '{@link ResponseType#getData() <em>data</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newData
   *          the new value of the '{@link ResponseType#getData() data}' feature.
   * @generated
   */
  public void setData(List<Object> newData) {
    data = newData;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ResponseType " + " [status: " + getStatus() + "]" + " [startRow: " + getStartRow() + "]" + " [endRow: "
        + getEndRow() + "]" + " [totalRows: " + getTotalRows() + "]";
  }
}
