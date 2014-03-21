package org.eclipse.emf.texo.test.model.issues.instanceclassset;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.emf.texo.test.model.instanceclassset.NonEMF;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>MySerializableClass</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "bz306546_MySerializableClass")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class MySerializableClass extends Identifiable implements Serializable {
  /**
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String somethingInteresting = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private NonEMF nonEMF = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  private List<NonEMF> nonEMFs = new ArrayList<NonEMF>();

  /**
   * Returns the value of '<em><b>somethingInteresting</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>somethingInteresting</b></em>' feature
   * @generated
   */
  public String getSomethingInteresting() {
    return somethingInteresting;
  }

  /**
   * Sets the '{@link MySerializableClass#getSomethingInteresting() <em>somethingInteresting</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSomethingInteresting
   *          the new value of the '{@link MySerializableClass#getSomethingInteresting() somethingInteresting}' feature.
   * @generated
   */
  public void setSomethingInteresting(String newSomethingInteresting) {
    somethingInteresting = newSomethingInteresting;
  }

  /**
   * Returns the value of '<em><b>nonEMF</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>nonEMF</b></em>' feature
   * @generated
   */
  public NonEMF getNonEMF() {
    return nonEMF;
  }

  /**
   * Sets the '{@link MySerializableClass#getNonEMF() <em>nonEMF</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNonEMF
   *          the new value of the '{@link MySerializableClass#getNonEMF() nonEMF}' feature.
   * @generated
   */
  public void setNonEMF(NonEMF newNonEMF) {
    nonEMF = newNonEMF;
  }

  /**
   * Returns the value of '<em><b>nonEMFs</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>nonEMFs</b></em>' feature
   * @generated
   */
  public List<NonEMF> getNonEMFs() {
    return nonEMFs;
  }

  /**
   * Adds to the <em>nonEMFs</em> feature.
   * 
   * @param nonEMFsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToNonEMFs(NonEMF nonEMFsValue) {
    if (!nonEMFs.contains(nonEMFsValue)) {
      boolean result = nonEMFs.add(nonEMFsValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>nonEMFs</em> feature.
   * 
   * @param nonEMFsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromNonEMFs(NonEMF nonEMFsValue) {
    if (nonEMFs.contains(nonEMFsValue)) {
      boolean result = nonEMFs.remove(nonEMFsValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>nonEMFs</em> feature.
   * 
   * @generated
   */
  public void clearNonEMFs() {
    while (!nonEMFs.isEmpty()) {
      removeFromNonEMFs(nonEMFs.iterator().next());
    }
  }

  /**
   * Sets the '{@link MySerializableClass#getNonEMFs() <em>nonEMFs</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNonEMFs
   *          the new value of the '{@link MySerializableClass#getNonEMFs() nonEMFs}' feature.
   * @generated
   */
  public void setNonEMFs(List<NonEMF> newNonEMFs) {
    nonEMFs = newNonEMFs;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "MySerializableClass " + " [somethingInteresting: " + getSomethingInteresting() + "]";
  }
}
