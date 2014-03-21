package org.eclipse.modisco.kdm.source;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.core.Element;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>SourceRegion</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "source_SourceRegion")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class SourceRegion extends Element {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private SourceFile file = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer startLine = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer startPosition = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer endLine = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer endPosition = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String language = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String path = null;

  /**
   * Returns the value of '<em><b>file</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>file</b></em>' feature
   * @generated
   */
  public SourceFile getFile() {
    return file;
  }

  /**
   * Sets the '{@link SourceRegion#getFile() <em>file</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFile
   *          the new value of the '{@link SourceRegion#getFile() file}' feature.
   * @generated
   */
  public void setFile(SourceFile newFile) {
    file = newFile;
  }

  /**
   * Returns the value of '<em><b>startLine</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>startLine</b></em>' feature
   * @generated
   */
  public Integer getStartLine() {
    return startLine;
  }

  /**
   * Sets the '{@link SourceRegion#getStartLine() <em>startLine</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStartLine
   *          the new value of the '{@link SourceRegion#getStartLine() startLine}' feature.
   * @generated
   */
  public void setStartLine(Integer newStartLine) {
    startLine = newStartLine;
  }

  /**
   * Returns the value of '<em><b>startPosition</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>startPosition</b></em>' feature
   * @generated
   */
  public Integer getStartPosition() {
    return startPosition;
  }

  /**
   * Sets the '{@link SourceRegion#getStartPosition() <em>startPosition</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStartPosition
   *          the new value of the '{@link SourceRegion#getStartPosition() startPosition}' feature.
   * @generated
   */
  public void setStartPosition(Integer newStartPosition) {
    startPosition = newStartPosition;
  }

  /**
   * Returns the value of '<em><b>endLine</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>endLine</b></em>' feature
   * @generated
   */
  public Integer getEndLine() {
    return endLine;
  }

  /**
   * Sets the '{@link SourceRegion#getEndLine() <em>endLine</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEndLine
   *          the new value of the '{@link SourceRegion#getEndLine() endLine}' feature.
   * @generated
   */
  public void setEndLine(Integer newEndLine) {
    endLine = newEndLine;
  }

  /**
   * Returns the value of '<em><b>endPosition</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>endPosition</b></em>' feature
   * @generated
   */
  public Integer getEndPosition() {
    return endPosition;
  }

  /**
   * Sets the '{@link SourceRegion#getEndPosition() <em>endPosition</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEndPosition
   *          the new value of the '{@link SourceRegion#getEndPosition() endPosition}' feature.
   * @generated
   */
  public void setEndPosition(Integer newEndPosition) {
    endPosition = newEndPosition;
  }

  /**
   * Returns the value of '<em><b>language</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>language</b></em>' feature
   * @generated
   */
  public String getLanguage() {
    return language;
  }

  /**
   * Sets the '{@link SourceRegion#getLanguage() <em>language</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLanguage
   *          the new value of the '{@link SourceRegion#getLanguage() language}' feature.
   * @generated
   */
  public void setLanguage(String newLanguage) {
    language = newLanguage;
  }

  /**
   * Returns the value of '<em><b>path</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>path</b></em>' feature
   * @generated
   */
  public String getPath() {
    return path;
  }

  /**
   * Sets the '{@link SourceRegion#getPath() <em>path</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPath
   *          the new value of the '{@link SourceRegion#getPath() path}' feature.
   * @generated
   */
  public void setPath(String newPath) {
    path = newPath;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SourceRegion " + " [startLine: " + getStartLine() + "]" + " [startPosition: " + getStartPosition() + "]"
        + " [endLine: " + getEndLine() + "]" + " [endPosition: " + getEndPosition() + "]" + " [language: "
        + getLanguage() + "]" + " [path: " + getPath() + "]";
  }
}
