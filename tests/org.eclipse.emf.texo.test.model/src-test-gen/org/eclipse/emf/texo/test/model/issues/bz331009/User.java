package org.eclipse.emf.texo.test.model.issues.bz331009;

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
 * A representation of the model object '<em><b>User</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Пользователь <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_User")
@Table(name = "m_User")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class User extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Логин <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "T_login")
  private String login = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Пароль <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "T_password")
  private String password = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Группа <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_User_group") })
  private UserGroup group = null;

  /**
   * Returns the value of '<em><b>login</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Логин <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>login</b></em>' feature
   * @generated
   */
  public String getLogin() {
    return login;
  }

  /**
   * Sets the '{@link User#getLogin() <em>login</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Логин <!-- end-model-doc -->
   * 
   * @param newLogin
   *          the new value of the '{@link User#getLogin() login}' feature.
   * @generated
   */
  public void setLogin(String newLogin) {
    login = newLogin;
  }

  /**
   * Returns the value of '<em><b>password</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Пароль <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>password</b></em>' feature
   * @generated
   */
  public String getPassword() {
    return password;
  }

  /**
   * Sets the '{@link User#getPassword() <em>password</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Пароль <!-- end-model-doc -->
   * 
   * @param newPassword
   *          the new value of the '{@link User#getPassword() password}' feature.
   * @generated
   */
  public void setPassword(String newPassword) {
    password = newPassword;
  }

  /**
   * Returns the value of '<em><b>group</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Группа <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>group</b></em>' feature
   * @generated
   */
  public UserGroup getGroup() {
    return group;
  }

  /**
   * Sets the '{@link User#getGroup() <em>group</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Группа <!-- end-model-doc -->
   * 
   * @param newGroup
   *          the new value of the '{@link User#getGroup() group}' feature.
   * @generated
   */
  public void setGroup(UserGroup newGroup) {
    group = newGroup;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "User " + " [login: " + getLogin() + "]" + " [password: " + getPassword() + "]";
  }
}
