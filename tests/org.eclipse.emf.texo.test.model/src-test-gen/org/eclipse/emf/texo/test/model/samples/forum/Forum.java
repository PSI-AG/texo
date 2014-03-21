package org.eclipse.emf.texo.test.model.samples.forum;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
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
 * A representation of the model object '<em><b>Forum</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "forum_Forum")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Forum extends Identifiable {

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
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<Member> members = new ArrayList<Member>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<Topic> topics = new ArrayList<Topic>();

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
   * Sets the '{@link Forum#getTitle() <em>title</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTitle
   *          the new value of the '{@link Forum#getTitle() title}' feature.
   * @generated
   */
  public void setTitle(String newTitle) {
    title = newTitle;
  }

  /**
   * Returns the value of '<em><b>members</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>members</b></em>' feature
   * @generated
   */
  public List<Member> getMembers() {
    return members;
  }

  /**
   * Adds to the <em>members</em> feature.
   * 
   * @param membersValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToMembers(Member membersValue) {
    if (!members.contains(membersValue)) {
      boolean result = members.add(membersValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>members</em> feature.
   * 
   * @param membersValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromMembers(Member membersValue) {
    if (members.contains(membersValue)) {
      boolean result = members.remove(membersValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>members</em> feature.
   * 
   * @generated
   */
  public void clearMembers() {
    while (!members.isEmpty()) {
      removeFromMembers(members.iterator().next());
    }
  }

  /**
   * Sets the '{@link Forum#getMembers() <em>members</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMembers
   *          the new value of the '{@link Forum#getMembers() members}' feature.
   * @generated
   */
  public void setMembers(List<Member> newMembers) {
    members = newMembers;
  }

  /**
   * Returns the value of '<em><b>topics</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>topics</b></em>' feature
   * @generated
   */
  public List<Topic> getTopics() {
    return topics;
  }

  /**
   * Adds to the <em>topics</em> feature.
   * 
   * @param topicsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToTopics(Topic topicsValue) {
    if (!topics.contains(topicsValue)) {
      boolean result = topics.add(topicsValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>topics</em> feature.
   * 
   * @param topicsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromTopics(Topic topicsValue) {
    if (topics.contains(topicsValue)) {
      boolean result = topics.remove(topicsValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>topics</em> feature.
   * 
   * @generated
   */
  public void clearTopics() {
    while (!topics.isEmpty()) {
      removeFromTopics(topics.iterator().next());
    }
  }

  /**
   * Sets the '{@link Forum#getTopics() <em>topics</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTopics
   *          the new value of the '{@link Forum#getTopics() topics}' feature.
   * @generated
   */
  public void setTopics(List<Topic> newTopics) {
    topics = newTopics;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Forum " + " [title: " + getTitle() + "]";
  }
}
