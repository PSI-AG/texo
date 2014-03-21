/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookOnTape.java,v 1.4 2011/08/25 14:34:33 mtaal Exp $
 */
package extlibrary;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Book On Tape</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link extlibrary.BookOnTape#getReader <em>Reader</em>}</li>
 * <li>{@link extlibrary.BookOnTape#getAuthor <em>Author</em>}</li>
 * </ul>
 * </p>
 * 
 * @see extlibrary.ExtlibraryPackage#getBookOnTape()
 * @model
 * @generated
 */
public interface BookOnTape extends AudioVisualItem {
  /**
   * Returns the value of the '<em><b>Reader</b></em>' reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reader</em>' reference isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Reader</em>' reference.
   * @see #setReader(Person)
   * @see extlibrary.ExtlibraryPackage#getBookOnTape_Reader()
   * @model
   * @generated
   */
  Person getReader();

  /**
   * Sets the value of the '{@link extlibrary.BookOnTape#getReader <em>Reader</em>}' reference. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Reader</em>' reference.
   * @see #getReader()
   * @generated
   */
  void setReader(Person value);

  /**
   * Returns the value of the '<em><b>Author</b></em>' reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Author</em>' reference isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Author</em>' reference.
   * @see #setAuthor(Writer)
   * @see extlibrary.ExtlibraryPackage#getBookOnTape_Author()
   * @model
   * @generated
   */
  Writer getAuthor();

  /**
   * Sets the value of the '{@link extlibrary.BookOnTape#getAuthor <em>Author</em>}' reference. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Author</em>' reference.
   * @see #getAuthor()
   * @generated
   */
  void setAuthor(Writer value);

} // BookOnTape
