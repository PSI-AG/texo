package org.eclipse.emf.texo.test.model.samples.workflow;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Workflow</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "workflow_Workflow")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Workflow extends WorkflowElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn(name = "workflow_Workflow_nodes_ind")
  @JoinColumns({ @JoinColumn(name = "workflow_Workflow_nodes") })
  private List<WorkflowNode> nodes = new ArrayList<WorkflowNode>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn(name = "workflow_Workflow_edges_ind")
  @JoinColumns({ @JoinColumn(name = "workflow_Workflow_edges") })
  private List<Edge> edges = new ArrayList<Edge>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn(name = "workflow_Workflow_comments_ind")
  @JoinColumns({ @JoinColumn(name = "workflow_Workflow_comments") })
  private List<Comment> comments = new ArrayList<Comment>();

  /**
   * Returns the value of '<em><b>nodes</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>nodes</b></em>' feature
   * @generated
   */
  public List<WorkflowNode> getNodes() {
    return nodes;
  }

  /**
   * Adds to the <em>nodes</em> feature.
   * 
   * @param nodesValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToNodes(WorkflowNode nodesValue) {
    if (!nodes.contains(nodesValue)) {
      boolean result = nodes.add(nodesValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>nodes</em> feature.
   * 
   * @param nodesValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromNodes(WorkflowNode nodesValue) {
    if (nodes.contains(nodesValue)) {
      boolean result = nodes.remove(nodesValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>nodes</em> feature.
   * 
   * @generated
   */
  public void clearNodes() {
    while (!nodes.isEmpty()) {
      removeFromNodes(nodes.iterator().next());
    }
  }

  /**
   * Sets the '{@link Workflow#getNodes() <em>nodes</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNodes
   *          the new value of the '{@link Workflow#getNodes() nodes}' feature.
   * @generated
   */
  public void setNodes(List<WorkflowNode> newNodes) {
    nodes = newNodes;
  }

  /**
   * Returns the value of '<em><b>edges</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>edges</b></em>' feature
   * @generated
   */
  public List<Edge> getEdges() {
    return edges;
  }

  /**
   * Adds to the <em>edges</em> feature.
   * 
   * @param edgesValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToEdges(Edge edgesValue) {
    if (!edges.contains(edgesValue)) {
      boolean result = edges.add(edgesValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>edges</em> feature.
   * 
   * @param edgesValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromEdges(Edge edgesValue) {
    if (edges.contains(edgesValue)) {
      boolean result = edges.remove(edgesValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>edges</em> feature.
   * 
   * @generated
   */
  public void clearEdges() {
    while (!edges.isEmpty()) {
      removeFromEdges(edges.iterator().next());
    }
  }

  /**
   * Sets the '{@link Workflow#getEdges() <em>edges</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEdges
   *          the new value of the '{@link Workflow#getEdges() edges}' feature.
   * @generated
   */
  public void setEdges(List<Edge> newEdges) {
    edges = newEdges;
  }

  /**
   * Returns the value of '<em><b>comments</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>comments</b></em>' feature
   * @generated
   */
  public List<Comment> getComments() {
    return comments;
  }

  /**
   * Adds to the <em>comments</em> feature.
   * 
   * @param commentsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToComments(Comment commentsValue) {
    if (!comments.contains(commentsValue)) {
      boolean result = comments.add(commentsValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>comments</em> feature.
   * 
   * @param commentsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromComments(Comment commentsValue) {
    if (comments.contains(commentsValue)) {
      boolean result = comments.remove(commentsValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>comments</em> feature.
   * 
   * @generated
   */
  public void clearComments() {
    while (!comments.isEmpty()) {
      removeFromComments(comments.iterator().next());
    }
  }

  /**
   * Sets the '{@link Workflow#getComments() <em>comments</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newComments
   *          the new value of the '{@link Workflow#getComments() comments}' feature.
   * @generated
   */
  public void setComments(List<Comment> newComments) {
    comments = newComments;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Workflow ";
  }
}
