package org.eclipse.modisco.kdm.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.action.EntryFlow;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.source.SourceRef;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AbstractCodeElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "code_AbstractCodeElement")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class AbstractCodeElement extends KDMEntity {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<SourceRef> source = new HashSet<SourceRef>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<CommentUnit> comment = new HashSet<CommentUnit>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractCodeRelationship> codeRelation = new HashSet<AbstractCodeRelationship>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  private List<EntryFlow> entryFlow = new ArrayList<EntryFlow>();

  /**
   * Returns the value of '<em><b>source</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>source</b></em>' feature
   * @generated
   */
  public Set<SourceRef> getSource() {
    return source;
  }

  /**
   * Adds to the <em>source</em> feature.
   * 
   * @param sourceValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToSource(SourceRef sourceValue) {
    if (!source.contains(sourceValue)) {
      boolean result = source.add(sourceValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>source</em> feature.
   * 
   * @param sourceValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromSource(SourceRef sourceValue) {
    if (source.contains(sourceValue)) {
      boolean result = source.remove(sourceValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>source</em> feature.
   * 
   * @generated
   */
  public void clearSource() {
    while (!source.isEmpty()) {
      removeFromSource(source.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractCodeElement#getSource() <em>source</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSource
   *          the new value of the '{@link AbstractCodeElement#getSource() source}' feature.
   * @generated
   */
  public void setSource(Set<SourceRef> newSource) {
    source = newSource;
  }

  /**
   * Returns the value of '<em><b>comment</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>comment</b></em>' feature
   * @generated
   */
  public Set<CommentUnit> getComment() {
    return comment;
  }

  /**
   * Adds to the <em>comment</em> feature.
   * 
   * @param commentValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToComment(CommentUnit commentValue) {
    if (!comment.contains(commentValue)) {
      boolean result = comment.add(commentValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>comment</em> feature.
   * 
   * @param commentValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromComment(CommentUnit commentValue) {
    if (comment.contains(commentValue)) {
      boolean result = comment.remove(commentValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>comment</em> feature.
   * 
   * @generated
   */
  public void clearComment() {
    while (!comment.isEmpty()) {
      removeFromComment(comment.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractCodeElement#getComment() <em>comment</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newComment
   *          the new value of the '{@link AbstractCodeElement#getComment() comment}' feature.
   * @generated
   */
  public void setComment(Set<CommentUnit> newComment) {
    comment = newComment;
  }

  /**
   * Returns the value of '<em><b>codeRelation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>codeRelation</b></em>' feature
   * @generated
   */
  public Set<AbstractCodeRelationship> getCodeRelation() {
    return codeRelation;
  }

  /**
   * Adds to the <em>codeRelation</em> feature.
   * 
   * @param codeRelationValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToCodeRelation(AbstractCodeRelationship codeRelationValue) {
    if (!codeRelation.contains(codeRelationValue)) {
      boolean result = codeRelation.add(codeRelationValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>codeRelation</em> feature.
   * 
   * @param codeRelationValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromCodeRelation(AbstractCodeRelationship codeRelationValue) {
    if (codeRelation.contains(codeRelationValue)) {
      boolean result = codeRelation.remove(codeRelationValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>codeRelation</em> feature.
   * 
   * @generated
   */
  public void clearCodeRelation() {
    while (!codeRelation.isEmpty()) {
      removeFromCodeRelation(codeRelation.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractCodeElement#getCodeRelation() <em>codeRelation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCodeRelation
   *          the new value of the '{@link AbstractCodeElement#getCodeRelation() codeRelation}' feature.
   * @generated
   */
  public void setCodeRelation(Set<AbstractCodeRelationship> newCodeRelation) {
    codeRelation = newCodeRelation;
  }

  /**
   * Returns the value of '<em><b>entryFlow</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>entryFlow</b></em>' feature
   * @generated
   */
  public List<EntryFlow> getEntryFlow() {
    return entryFlow;
  }

  /**
   * Adds to the <em>entryFlow</em> feature.
   * 
   * @param entryFlowValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToEntryFlow(EntryFlow entryFlowValue) {
    if (!entryFlow.contains(entryFlowValue)) {
      boolean result = entryFlow.add(entryFlowValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>entryFlow</em> feature.
   * 
   * @param entryFlowValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromEntryFlow(EntryFlow entryFlowValue) {
    if (entryFlow.contains(entryFlowValue)) {
      boolean result = entryFlow.remove(entryFlowValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>entryFlow</em> feature.
   * 
   * @generated
   */
  public void clearEntryFlow() {
    while (!entryFlow.isEmpty()) {
      removeFromEntryFlow(entryFlow.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractCodeElement#getEntryFlow() <em>entryFlow</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEntryFlow
   *          the new value of the '{@link AbstractCodeElement#getEntryFlow() entryFlow}' feature.
   * @generated
   */
  public void setEntryFlow(List<EntryFlow> newEntryFlow) {
    entryFlow = newEntryFlow;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractCodeElement ";
  }
}
