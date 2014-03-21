package org.eclipse.emf.texo.test.model.samples.accounting;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Report</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "accounting_Report")
@Table(name = "accounting_Report")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Report extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Column(name = "name")
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  @JoinColumns({ @JoinColumn(name = "accounting_Report_debitReportGroup") })
  private ReportGroup debitReportGroup = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  @JoinColumns({ @JoinColumn(name = "accounting_Report_creditReportGroup") })
  private ReportGroup creditReportGroup = null;

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link Report#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Report#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>debitReportGroup</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>debitReportGroup</b></em>' feature
   * @generated
   */
  public ReportGroup getDebitReportGroup() {
    return debitReportGroup;
  }

  /**
   * Sets the '{@link Report#getDebitReportGroup() <em>debitReportGroup</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDebitReportGroup
   *          the new value of the '{@link Report#getDebitReportGroup() debitReportGroup}' feature.
   * @generated
   */
  public void setDebitReportGroup(ReportGroup newDebitReportGroup) {
    debitReportGroup = newDebitReportGroup;
  }

  /**
   * Returns the value of '<em><b>creditReportGroup</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>creditReportGroup</b></em>' feature
   * @generated
   */
  public ReportGroup getCreditReportGroup() {
    return creditReportGroup;
  }

  /**
   * Sets the '{@link Report#getCreditReportGroup() <em>creditReportGroup</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCreditReportGroup
   *          the new value of the '{@link Report#getCreditReportGroup() creditReportGroup}' feature.
   * @generated
   */
  public void setCreditReportGroup(ReportGroup newCreditReportGroup) {
    creditReportGroup = newCreditReportGroup;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Report " + " [name: " + getName() + "]";
  }
}
