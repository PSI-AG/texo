package org.eclipse.emf.texo.test.model.samples.workflow;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>InputPort</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "workflow_InputPort")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class InputPort extends Port {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  @JoinColumns({ @JoinColumn(name = "workflow_InputPort_node", nullable = true) })
  private WorkflowNode node = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn(name = "workflow_InputPort_edges_ind")
  @JoinTable(joinColumns = { @JoinColumn(name = "workflow_InputPort_edges") }, inverseJoinColumns = { @JoinColumn(name = "edges_workflow_Edge") }, name = "workflow_InputPort_edges")
  private List<Edge> edges = new ArrayList<Edge>();

  /**
   * Returns the value of '<em><b>node</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>node</b></em>' feature
   * @generated
   */
  public WorkflowNode getNode() {
    return node;
  }

  /**
   * Sets the '{@link InputPort#getNode() <em>node</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNode
   *          the new value of the '{@link InputPort#getNode() node}' feature.
   * @generated
   */
  public void setNode(WorkflowNode newNode) {
    node = newNode;
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
   * Sets the '{@link InputPort#getEdges() <em>edges</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEdges
   *          the new value of the '{@link InputPort#getEdges() edges}' feature.
   * @generated
   */
  public void setEdges(List<Edge> newEdges) {
    edges = newEdges;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "InputPort ";
  }
}
