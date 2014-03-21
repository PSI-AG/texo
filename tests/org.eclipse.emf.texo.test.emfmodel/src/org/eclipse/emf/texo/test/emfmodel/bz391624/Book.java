/**
 */
package org.eclipse.emf.texo.test.emfmodel.bz391624;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.test.emfmodel.identifiable.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.test.emfmodel.bz391624.Book#getAuthors <em>Authors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.Bz391624Package#getBook()
 * @model
 * @generated
 */
public interface Book extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.texo.test.emfmodel.bz391624.Author}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference list.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.Bz391624Package#getBook_Authors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Author> getAuthors();

} // Book
