package texo.dto;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>TestA</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "bz409157_TestA")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class TestADTO extends Identifiable implements Serializable {
  /**
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private TestBDTO testB = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Enumerated(EnumType.STRING)
  private TESTABCEnum testEnum = null;

  /**
   * Returns the value of '<em><b>testB</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>testB</b></em>' feature
   * @generated
   */
  public TestBDTO getTestB() {
    return testB;
  }

  /**
   * Sets the '{@link TestADTO#getTestB() <em>testB</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTestB
   *          the new value of the '{@link TestADTO#getTestB() testB}' feature.
   * @generated
   */
  public void setTestB(TestBDTO newTestB) {
    testB = newTestB;
  }

  /**
   * Returns the value of '<em><b>testEnum</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>testEnum</b></em>' feature
   * @generated
   */
  public TESTABCEnum getTestEnum() {
    return testEnum;
  }

  /**
   * Sets the '{@link TestADTO#getTestEnum() <em>testEnum</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTestEnum
   *          the new value of the '{@link TestADTO#getTestEnum() testEnum}' feature.
   * @generated
   */
  public void setTestEnum(TESTABCEnum newTestEnum) {
    testEnum = newTestEnum;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "TestA " + " [testEnum: " + getTestEnum() + "]";
  }
}
