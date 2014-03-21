package org.eclipse.emf.texo.test.model.samples.library;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Library</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@orgeclipseemftexo.OneDotAnnotation("test")
@Entity(name = "library_Library")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Library extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "name", nullable = true)
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true)
  @OrderColumn(name = "library_Library_writers_ind")
  @JoinTable(joinColumns = { @JoinColumn(name = "library_Library_writers") }, inverseJoinColumns = { @JoinColumn(name = "writers_library_Writer") }, name = "Library_Books_Test")
  private List<Writer> writers = new ArrayList<Writer>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true)
  @OrderColumn(name = "library_Library_books_ind")
  @JoinColumns({ @JoinColumn(name = "library_Library_books") })
  private List<Book> books = new ArrayList<Book>();

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link Library#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Library#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>writers</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>writers</b></em>' feature
   * @generated
   */
  public List<Writer> getWriters() {
    return writers;
  }

  /**
   * Adds to the <em>writers</em> feature.
   * 
   * @param writersValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToWriters(Writer writersValue) {
    if (!writers.contains(writersValue)) {
      boolean result = writers.add(writersValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>writers</em> feature.
   * 
   * @param writersValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromWriters(Writer writersValue) {
    if (writers.contains(writersValue)) {
      boolean result = writers.remove(writersValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>writers</em> feature.
   * 
   * @generated
   */
  public void clearWriters() {
    while (!writers.isEmpty()) {
      removeFromWriters(writers.iterator().next());
    }
  }

  /**
   * Sets the '{@link Library#getWriters() <em>writers</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newWriters
   *          the new value of the '{@link Library#getWriters() writers}' feature.
   * @generated
   */
  public void setWriters(List<Writer> newWriters) {
    writers = newWriters;
  }

  /**
   * Returns the value of '<em><b>books</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>books</b></em>' feature
   * @generated
   */
  public List<Book> getBooks() {
    return books;
  }

  /**
   * Adds to the <em>books</em> feature.
   * 
   * @param booksValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToBooks(Book booksValue) {
    if (!books.contains(booksValue)) {
      boolean result = books.add(booksValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>books</em> feature.
   * 
   * @param booksValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromBooks(Book booksValue) {
    if (books.contains(booksValue)) {
      boolean result = books.remove(booksValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>books</em> feature.
   * 
   * @generated
   */
  public void clearBooks() {
    while (!books.isEmpty()) {
      removeFromBooks(books.iterator().next());
    }
  }

  /**
   * Sets the '{@link Library#getBooks() <em>books</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBooks
   *          the new value of the '{@link Library#getBooks() books}' feature.
   * @generated
   */
  public void setBooks(List<Book> newBooks) {
    books = newBooks;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Library " + " [name: " + getName() + "]";
  }
}
