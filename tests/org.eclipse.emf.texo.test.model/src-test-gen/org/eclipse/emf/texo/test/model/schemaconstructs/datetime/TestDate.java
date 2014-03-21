package org.eclipse.emf.texo.test.model.schemaconstructs.datetime;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>TestDate</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "datetime_TestDate")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class TestDate extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Temporal(TemporalType.DATE)
  private Date date = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date datetime = null;

  /**
   * Returns the value of '<em><b>date</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>date</b></em>' feature
   * @generated
   */
  public Date getDate() {
    return date;
  }

  /**
   * Sets the '{@link TestDate#getDate() <em>date</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDate
   *          the new value of the '{@link TestDate#getDate() date}' feature.
   * @generated
   */
  public void setDate(Date newDate) {
    date = newDate;
  }

  /**
   * Returns the value of '<em><b>datetime</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>datetime</b></em>' feature
   * @generated
   */
  public Date getDatetime() {
    return datetime;
  }

  /**
   * Sets the '{@link TestDate#getDatetime() <em>datetime</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDatetime
   *          the new value of the '{@link TestDate#getDatetime() datetime}' feature.
   * @generated
   */
  public void setDatetime(Date newDatetime) {
    datetime = newDatetime;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "TestDate " + " [date: " + getDate() + "]" + " [datetime: " + getDatetime() + "]";
  }
}
