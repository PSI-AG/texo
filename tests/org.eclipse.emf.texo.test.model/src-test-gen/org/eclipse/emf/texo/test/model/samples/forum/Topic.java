package org.eclipse.emf.texo.test.model.samples.forum;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Topic</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "forum_Topic")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Topic extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String title = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Enumerated(EnumType.STRING)
  private TopicCategory category = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  @JoinColumns({ @JoinColumn() })
  private Member creator = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  @JoinTable()
  private List<Post> posts = new ArrayList<Post>();

  /**
   * Returns the value of '<em><b>title</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>title</b></em>' feature
   * @generated
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the '{@link Topic#getTitle() <em>title</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTitle
   *          the new value of the '{@link Topic#getTitle() title}' feature.
   * @generated
   */
  public void setTitle(String newTitle) {
    title = newTitle;
  }

  /**
   * Returns the value of '<em><b>category</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>category</b></em>' feature
   * @generated
   */
  public TopicCategory getCategory() {
    return category;
  }

  /**
   * Sets the '{@link Topic#getCategory() <em>category</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCategory
   *          the new value of the '{@link Topic#getCategory() category}' feature.
   * @generated
   */
  public void setCategory(TopicCategory newCategory) {
    category = newCategory;
  }

  /**
   * Returns the value of '<em><b>creator</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>creator</b></em>' feature
   * @generated
   */
  public Member getCreator() {
    return creator;
  }

  /**
   * Sets the '{@link Topic#getCreator() <em>creator</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCreator
   *          the new value of the '{@link Topic#getCreator() creator}' feature.
   * @generated
   */
  public void setCreator(Member newCreator) {
    creator = newCreator;
  }

  /**
   * Returns the value of '<em><b>posts</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>posts</b></em>' feature
   * @generated
   */
  public List<Post> getPosts() {
    return posts;
  }

  /**
   * Adds to the <em>posts</em> feature.
   * 
   * @param postsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToPosts(Post postsValue) {
    if (!posts.contains(postsValue)) {
      boolean result = posts.add(postsValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>posts</em> feature.
   * 
   * @param postsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromPosts(Post postsValue) {
    if (posts.contains(postsValue)) {
      boolean result = posts.remove(postsValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>posts</em> feature.
   * 
   * @generated
   */
  public void clearPosts() {
    while (!posts.isEmpty()) {
      removeFromPosts(posts.iterator().next());
    }
  }

  /**
   * Sets the '{@link Topic#getPosts() <em>posts</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPosts
   *          the new value of the '{@link Topic#getPosts() posts}' feature.
   * @generated
   */
  public void setPosts(List<Post> newPosts) {
    posts = newPosts;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Topic " + " [title: " + getTitle() + "]" + " [category: " + getCategory() + "]";
  }
}
