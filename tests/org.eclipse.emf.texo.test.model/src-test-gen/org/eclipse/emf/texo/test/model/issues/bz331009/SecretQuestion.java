package org.eclipse.emf.texo.test.model.issues.bz331009;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>SecretQuestion</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> Секретный авторизационный ворпос <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_SecretQuestion")
@Table(name = "m_SecretQuestion")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class SecretQuestion extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Вопрос <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "question")
  private String question = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Корректный ответ <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "correctAnswer")
  private String correctAnswer = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Сигнальный ответ под принуждением <!--
   * end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "alarmAnswer")
  private String alarmAnswer = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Активен ли <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "active")
  private boolean active = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Тип вопроса <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "T_type")
  @Enumerated(EnumType.STRING)
  private SecretQuestionType type = null;

  /**
   * Returns the value of '<em><b>question</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Вопрос <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>question</b></em>' feature
   * @generated
   */
  public String getQuestion() {
    return question;
  }

  /**
   * Sets the '{@link SecretQuestion#getQuestion() <em>question</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Вопрос <!-- end-model-doc -->
   * 
   * @param newQuestion
   *          the new value of the '{@link SecretQuestion#getQuestion() question}' feature.
   * @generated
   */
  public void setQuestion(String newQuestion) {
    question = newQuestion;
  }

  /**
   * Returns the value of '<em><b>correctAnswer</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Корректный ответ <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>correctAnswer</b></em>' feature
   * @generated
   */
  public String getCorrectAnswer() {
    return correctAnswer;
  }

  /**
   * Sets the '{@link SecretQuestion#getCorrectAnswer() <em>correctAnswer</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Корректный ответ <!-- end-model-doc -->
   * 
   * @param newCorrectAnswer
   *          the new value of the '{@link SecretQuestion#getCorrectAnswer() correctAnswer}' feature.
   * @generated
   */
  public void setCorrectAnswer(String newCorrectAnswer) {
    correctAnswer = newCorrectAnswer;
  }

  /**
   * Returns the value of '<em><b>alarmAnswer</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Сигнальный ответ под принуждением <!--
   * end-model-doc -->
   * 
   * @return the value of '<em><b>alarmAnswer</b></em>' feature
   * @generated
   */
  public String getAlarmAnswer() {
    return alarmAnswer;
  }

  /**
   * Sets the '{@link SecretQuestion#getAlarmAnswer() <em>alarmAnswer</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Сигнальный ответ под принуждением <!--
   * end-model-doc -->
   * 
   * @param newAlarmAnswer
   *          the new value of the '{@link SecretQuestion#getAlarmAnswer() alarmAnswer}' feature.
   * @generated
   */
  public void setAlarmAnswer(String newAlarmAnswer) {
    alarmAnswer = newAlarmAnswer;
  }

  /**
   * Returns the value of '<em><b>active</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Активен ли <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>active</b></em>' feature
   * @generated
   */
  public boolean isActive() {
    return active;
  }

  /**
   * Sets the '{@link SecretQuestion#isActive() <em>active</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Активен ли <!-- end-model-doc -->
   * 
   * @param newActive
   *          the new value of the '{@link SecretQuestion#isActive() active}' feature.
   * @generated
   */
  public void setActive(boolean newActive) {
    active = newActive;
  }

  /**
   * Returns the value of '<em><b>type</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Тип вопроса <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>type</b></em>' feature
   * @generated
   */
  public SecretQuestionType getType() {
    return type;
  }

  /**
   * Sets the '{@link SecretQuestion#getType() <em>type</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Тип вопроса <!-- end-model-doc -->
   * 
   * @param newType
   *          the new value of the '{@link SecretQuestion#getType() type}' feature.
   * @generated
   */
  public void setType(SecretQuestionType newType) {
    type = newType;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SecretQuestion " + " [question: " + getQuestion() + "]" + " [correctAnswer: " + getCorrectAnswer() + "]"
        + " [alarmAnswer: " + getAlarmAnswer() + "]" + " [active: " + isActive() + "]" + " [type: " + getType() + "]";
  }
}
