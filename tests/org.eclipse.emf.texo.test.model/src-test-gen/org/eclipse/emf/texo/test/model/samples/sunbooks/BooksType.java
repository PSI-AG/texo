package org.eclipse.emf.texo.test.model.samples.sunbooks;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>BooksType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "sunBooks_BooksType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class BooksType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<BookType> book = new ArrayList<BookType>();

  /**
   * Returns the value of '<em><b>book</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>book</b></em>' feature
   * @generated
   */
  public List<BookType> getBook() {
    return book;
  }

  /**
   * Adds to the <em>book</em> feature.
   * 
   * @param bookValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToBook(BookType bookValue) {
    if (!book.contains(bookValue)) {
      boolean result = book.add(bookValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>book</em> feature.
   * 
   * @param bookValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromBook(BookType bookValue) {
    if (book.contains(bookValue)) {
      boolean result = book.remove(bookValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>book</em> feature.
   * 
   * @generated
   */
  public void clearBook() {
    while (!book.isEmpty()) {
      removeFromBook(book.iterator().next());
    }
  }

  /**
   * Sets the '{@link BooksType#getBook() <em>book</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBook
   *          the new value of the '{@link BooksType#getBook() book}' feature.
   * @generated
   */
  public void setBook(List<BookType> newBook) {
    book = newBook;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "BooksType ";
  }
}
