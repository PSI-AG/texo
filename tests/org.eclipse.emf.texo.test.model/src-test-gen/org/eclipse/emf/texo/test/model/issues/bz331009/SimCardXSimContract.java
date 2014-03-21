package org.eclipse.emf.texo.test.model.issues.bz331009;

import javax.persistence.CascadeType;
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
 * A representation of the model object '<em><b>SimCardXSimContract</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * --> <!-- begin-model-doc --> Привязка сим-карты к контракту <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_SimCardXSimContract")
@Table(name = "m_SimCardXSimContract")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class SimCardXSimContract extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Сим-карта <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_SimCardXSimContract_simCard") })
  private SimCard simCard = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Контракт <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_SimCardXSimContract_simContract") })
  private SimContract simContract = null;

  /**
   * Returns the value of '<em><b>simCard</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Сим-карта <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>simCard</b></em>' feature
   * @generated
   */
  public SimCard getSimCard() {
    return simCard;
  }

  /**
   * Sets the '{@link SimCardXSimContract#getSimCard() <em>simCard</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Сим-карта <!-- end-model-doc -->
   * 
   * @param newSimCard
   *          the new value of the '{@link SimCardXSimContract#getSimCard() simCard}' feature.
   * @generated
   */
  public void setSimCard(SimCard newSimCard) {
    simCard = newSimCard;
  }

  /**
   * Returns the value of '<em><b>simContract</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Контракт <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>simContract</b></em>' feature
   * @generated
   */
  public SimContract getSimContract() {
    return simContract;
  }

  /**
   * Sets the '{@link SimCardXSimContract#getSimContract() <em>simContract</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Контракт <!-- end-model-doc -->
   * 
   * @param newSimContract
   *          the new value of the '{@link SimCardXSimContract#getSimContract() simContract}' feature.
   * @generated
   */
  public void setSimContract(SimContract newSimContract) {
    simContract = newSimContract;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SimCardXSimContract ";
  }
}
