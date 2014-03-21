/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.emf.model.samples.library;

import org.eclipse.emf.texo.emf.model.base.identifiable.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.emf.model.samples.library.Book#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.emf.model.samples.library.Book#getPages <em>Pages</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.emf.model.samples.library.Book#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.emf.model.samples.library.Book#getAuthor <em>Author</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.emf.model.samples.library.LibraryPackage#getBook()
 * @model annotation="texo.java.annotation value='@org.eclipse.emf.texo.test.models.annotations.TestAnnotationOne(\"test\")'"
 *        annotation="org.eclipse.emf.texo title='${title} (${pages}) - ${category}'"
 * @generated
 */
public interface Book extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.emf.texo.emf.model.samples.library.LibraryPackage#getBook_Title()
	 * @model annotation="texo.java.annotation field='@org.eclipse.emf.texo.test.models.annotations.TestAnnotationOne(\"field\")\n@org.eclipse.emf.texo.test.models.annotations.TestAnnotationTwo(\"field\")'"
	 *        annotation="org.eclipse.emf.texo id='true'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.emf.model.samples.library.Book#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' attribute.
	 * @see #setPages(int)
	 * @see org.eclipse.emf.texo.emf.model.samples.library.LibraryPackage#getBook_Pages()
	 * @model default="100"
	 *        annotation="texo.java.annotation getter='@org.eclipse.emf.texo.test.models.annotations.TestAnnotationOne(\"getter\")'"
	 * @generated
	 */
	int getPages();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.emf.model.samples.library.Book#getPages <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pages</em>' attribute.
	 * @see #getPages()
	 * @generated
	 */
	void setPages(int value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The default value is <code>"ScienceFiction"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.texo.emf.model.samples.library.BookCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.emf.texo.emf.model.samples.library.BookCategory
	 * @see #setCategory(BookCategory)
	 * @see org.eclipse.emf.texo.emf.model.samples.library.LibraryPackage#getBook_Category()
	 * @model default="ScienceFiction"
	 * @generated
	 */
	BookCategory getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.emf.model.samples.library.Book#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.emf.texo.emf.model.samples.library.BookCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(BookCategory value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.emf.model.samples.library.Writer#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Writer)
	 * @see org.eclipse.emf.texo.emf.model.samples.library.LibraryPackage#getBook_Author()
	 * @see org.eclipse.emf.texo.emf.model.samples.library.Writer#getBooks
	 * @model opposite="books" required="true"
	 *        annotation="texo.java.annotation setter='@org.eclipse.emf.texo.test.models.annotations.TestAnnotationOne(\"setter\")'"
	 * @generated
	 */
	Writer getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.emf.model.samples.library.Book#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Writer value);

} // Book
