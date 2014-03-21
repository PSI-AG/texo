package org.eclipse.emf.texo.test.model.samples.employee;

import java.util.Date;

import org.eclipse.emf.texo.test.models.annotations.MergeAnnotationOne;
import org.eclipse.emf.texo.test.models.annotations.MergeAnnotationTwo;

/**
 * A representation of the model object '<em><b>Employee</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@MergeAnnotationOne("should-be-removed")
public class Employee {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @MergeAnnotationOne("should-be-removed")
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private int salary = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private int age = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private Date hireDate = null;

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  @MergeAnnotationOne("should-be-removed")
  @MergeAnnotationTwo("should-be-removed")
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link Employee#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Employee#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>salary</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>salary</b></em>' feature
   * @generated
   */
  public int getSalary() {
    return salary;
  }

  /**
   * Sets the '{@link Employee#getSalary() <em>salary</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Employee#getSalary() salary}' feature.
   * @generated
   */
  public void setSalary(int newSalary) {
    salary = newSalary;
  }

  /**
   * Returns the value of '<em><b>age</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>age</b></em>' feature
   * @generated
   */
  public int getAge() {
    return age;
  }

  /**
   * Sets the '{@link Employee#getAge() <em>age</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Employee#getAge() age}' feature.
   * @generated
   */
  public void setAge(int newAge) {
    age = newAge;
  }

  /**
   * Returns the value of '<em><b>hireDate</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>hireDate</b></em>' feature
   * @generatedNot
   */
  @MergeAnnotationOne("should-not-be-removed")
  @MergeAnnotationTwo("should-not-be-removed")
  public Date getHireDate() {
    return hireDate;
  }

  /**
   * Sets the '{@link Employee#getHireDate() <em>hireDate</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Employee#getHireDate() hireDate}' feature.
   * @generated
   */
  public void setHireDate(Date newHireDate) {
    hireDate = newHireDate;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Employee " + " [name: " + getName() + "]" + " [salary: " + getSalary() + "]"
        + " [age: " + getAge() + "]" + " [hireDate: " + getHireDate() + "]";
  }

  @MergeAnnotationOne("should-not-be-removed")
  public String methodRemains() {
    return "test that method is not removed";
  }

  /**
   * @generated
   */
  @MergeAnnotationOne("should-be-removed")
  public String methodRemoved() {
    return "test that method is removed";
  }

  /**
   * @generatedNOT
   */
  @MergeAnnotationOne("should-not-be-removed")
  public static class Info {
    private String name;
    private String test;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getTest() {
      return test;
    }

    public void setTest(String test) {
      this.test = test;
    }
  }

  /**
   * @generated
   */
  @MergeAnnotationTwo("should-be-removed")
  public static class Removed {
    private String name;
    private String test;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getTest() {
      return test;
    }

    public void setTest(String test) {
      this.test = test;
    }
  }

  /**
   * @generatedNOT
   */
  @MergeAnnotationTwo("should-not-be-removed")
  @SuppressWarnings("unused")
  public static class NotRemoved {
    @MergeAnnotationTwo("should-not-be-removed")
    private String name = "test";

    @MergeAnnotationTwo("should-not-be-removed")
    private String test;

    /**
     * @generated
     */
    public String methodRemoved() {
      return "should go away";
    }

    /**
     * @generated
     */
    @MergeAnnotationTwo("should-be-removed")
    public String getName() {
      return name;
    }

    /**
     * @generatedNOT
     */
    @MergeAnnotationTwo("should-not-be-removed")
    public String methodNotRemoved() {
      return "should not go away";
    }

    @MergeAnnotationTwo("should-not-be-removed")
    public void setName(String name) {
      this.name = name;
    }
  }
}
