package org.eclipse.emf.texo.test.model.samples.extlibrary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Entity(name = "extlib_Library")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Library extends Identifiable implements Addressable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<Item> stock = new HashSet<Item>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Set<Book> books = new HashSet<Book>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<Library> branches = new ArrayList<Library>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn() })
  private Library parentBranch = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = LibraryPeopleFeatureGroup.class)
  @JoinTable()
  private List<LibraryPeopleFeatureGroup> people = new ArrayList<LibraryPeopleFeatureGroup>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String address = null;

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
    return LibraryPeopleFeatureGroup
        .createUnmodifiableValueList(getPeople(), LibraryPeopleFeatureGroup.Feature.WRITERS);
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
    setPeople(LibraryPeopleFeatureGroup.createFeatureGroupList(LibraryPeopleFeatureGroup.Feature.WRITERS, newWriters));
  }

  /**
   * Returns the value of '<em><b>employees</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>employees</b></em>' feature
   * @generated
   */
  public List<Employee> getEmployees() {
    return LibraryPeopleFeatureGroup.createUnmodifiableValueList(getPeople(),
        LibraryPeopleFeatureGroup.Feature.EMPLOYEES);
  }

  /**
   * Sets the '{@link Library#getEmployees() <em>employees</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEmployees
   *          the new value of the '{@link Library#getEmployees() employees}' feature.
   * @generated
   */
  public void setEmployees(List<Employee> newEmployees) {
    setPeople(LibraryPeopleFeatureGroup.createFeatureGroupList(LibraryPeopleFeatureGroup.Feature.EMPLOYEES,
        newEmployees));
  }

  /**
   * Returns the value of '<em><b>borrowers</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>borrowers</b></em>' feature
   * @generated
   */
  public List<Borrower> getBorrowers() {
    return LibraryPeopleFeatureGroup.createUnmodifiableValueList(getPeople(),
        LibraryPeopleFeatureGroup.Feature.BORROWERS);
  }

  /**
   * Sets the '{@link Library#getBorrowers() <em>borrowers</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBorrowers
   *          the new value of the '{@link Library#getBorrowers() borrowers}' feature.
   * @generated
   */
  public void setBorrowers(List<Borrower> newBorrowers) {
    setPeople(LibraryPeopleFeatureGroup.createFeatureGroupList(LibraryPeopleFeatureGroup.Feature.BORROWERS,
        newBorrowers));
  }

  /**
   * Returns the value of '<em><b>stock</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>stock</b></em>' feature
   * @generated
   */
  public Set<Item> getStock() {
    return stock;
  }

  /**
   * Adds to the <em>stock</em> feature.
   * 
   * @param stockValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToStock(Item stockValue) {
    if (!stock.contains(stockValue)) {
      boolean result = stock.add(stockValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>stock</em> feature.
   * 
   * @param stockValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromStock(Item stockValue) {
    if (stock.contains(stockValue)) {
      boolean result = stock.remove(stockValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>stock</em> feature.
   * 
   * @generated
   */
  public void clearStock() {
    while (!stock.isEmpty()) {
      removeFromStock(stock.iterator().next());
    }
  }

  /**
   * Sets the '{@link Library#getStock() <em>stock</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStock
   *          the new value of the '{@link Library#getStock() stock}' feature.
   * @generated
   */
  public void setStock(Set<Item> newStock) {
    stock = newStock;
  }

  /**
   * Returns the value of '<em><b>books</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>books</b></em>' feature
   * @generated
   */
  public Set<Book> getBooks() {
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
  public void setBooks(Set<Book> newBooks) {
    books = newBooks;
  }

  /**
   * Returns the value of '<em><b>branches</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>branches</b></em>' feature
   * @generated
   */
  public List<Library> getBranches() {
    return branches;
  }

  /**
   * Adds to the <em>branches</em> feature.
   * 
   * @param branchesValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToBranches(Library branchesValue) {
    if (!branches.contains(branchesValue)) {
      boolean result = branches.add(branchesValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>branches</em> feature.
   * 
   * @param branchesValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromBranches(Library branchesValue) {
    if (branches.contains(branchesValue)) {
      boolean result = branches.remove(branchesValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>branches</em> feature.
   * 
   * @generated
   */
  public void clearBranches() {
    while (!branches.isEmpty()) {
      removeFromBranches(branches.iterator().next());
    }
  }

  /**
   * Sets the '{@link Library#getBranches() <em>branches</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBranches
   *          the new value of the '{@link Library#getBranches() branches}' feature.
   * @generated
   */
  public void setBranches(List<Library> newBranches) {
    branches = newBranches;
  }

  /**
   * Returns the value of '<em><b>parentBranch</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>parentBranch</b></em>' feature
   * @generated
   */
  public Library getParentBranch() {
    return parentBranch;
  }

  /**
   * Sets the '{@link Library#getParentBranch() <em>parentBranch</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newParentBranch
   *          the new value of the '{@link Library#getParentBranch() parentBranch}' feature.
   * @generated
   */
  public void setParentBranch(Library newParentBranch) {
    parentBranch = newParentBranch;
  }

  /**
   * Returns the value of '<em><b>people</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>people</b></em>' feature
   * @generated
   */
  public List<LibraryPeopleFeatureGroup> getPeople() {
    return people;
  }

  /**
   * Sets the '{@link Library#getPeople() <em>people</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPeople
   *          the new value of the '{@link Library#getPeople() people}' feature.
   * @generated
   */
  public void setPeople(List<LibraryPeopleFeatureGroup> newPeople) {
    people = newPeople;
  }

  /**
   * Returns the value of '<em><b>address</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>address</b></em>' feature
   * @generated
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the '{@link Library#getAddress() <em>address</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAddress
   *          the new value of the '{@link Library#getAddress() address}' feature.
   * @generated
   */
  public void setAddress(String newAddress) {
    address = newAddress;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Library " + " [name: " + getName() + "]" + " [address: " + getAddress() + "]";
  }
}
