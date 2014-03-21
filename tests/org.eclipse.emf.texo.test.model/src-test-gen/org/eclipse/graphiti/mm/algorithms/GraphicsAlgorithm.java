package org.eclipse.graphiti.mm.algorithms;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.RenderingStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>GraphicsAlgorithm</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "al_GraphicsAlgorithm")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class GraphicsAlgorithm extends GraphicsAlgorithmContainer {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<GraphicsAlgorithm> graphicsAlgorithmChildren = new ArrayList<GraphicsAlgorithm>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(nullable = true) })
  private GraphicsAlgorithm parentGraphicsAlgorithm = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, mappedBy = "graphicsAlgorithm")
  private PictogramElement pictogramElement = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int width = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int height = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int x = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int y = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private Style style = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Color background = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Color foreground = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer lineWidth = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Enumerated(EnumType.STRING)
  private LineStyle lineStyle = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Boolean filled = Boolean.TRUE;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Boolean lineVisible = Boolean.TRUE;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL })
  private RenderingStyle renderingStyle = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Double transparency = null;

  /**
   * Returns the value of '<em><b>graphicsAlgorithmChildren</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>graphicsAlgorithmChildren</b></em>' feature
   * @generated
   */
  public List<GraphicsAlgorithm> getGraphicsAlgorithmChildren() {
    return graphicsAlgorithmChildren;
  }

  /**
   * Adds to the <em>graphicsAlgorithmChildren</em> feature.
   * 
   * @param graphicsAlgorithmChildrenValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToGraphicsAlgorithmChildren(GraphicsAlgorithm graphicsAlgorithmChildrenValue) {
    if (!graphicsAlgorithmChildren.contains(graphicsAlgorithmChildrenValue)) {
      boolean result = graphicsAlgorithmChildren.add(graphicsAlgorithmChildrenValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>graphicsAlgorithmChildren</em> feature.
   * 
   * @param graphicsAlgorithmChildrenValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromGraphicsAlgorithmChildren(GraphicsAlgorithm graphicsAlgorithmChildrenValue) {
    if (graphicsAlgorithmChildren.contains(graphicsAlgorithmChildrenValue)) {
      boolean result = graphicsAlgorithmChildren.remove(graphicsAlgorithmChildrenValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>graphicsAlgorithmChildren</em> feature.
   * 
   * @generated
   */
  public void clearGraphicsAlgorithmChildren() {
    while (!graphicsAlgorithmChildren.isEmpty()) {
      removeFromGraphicsAlgorithmChildren(graphicsAlgorithmChildren.iterator().next());
    }
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getGraphicsAlgorithmChildren() <em>graphicsAlgorithmChildren</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGraphicsAlgorithmChildren
   *          the new value of the '{@link GraphicsAlgorithm#getGraphicsAlgorithmChildren() graphicsAlgorithmChildren}'
   *          feature.
   * @generated
   */
  public void setGraphicsAlgorithmChildren(List<GraphicsAlgorithm> newGraphicsAlgorithmChildren) {
    graphicsAlgorithmChildren = newGraphicsAlgorithmChildren;
  }

  /**
   * Returns the value of '<em><b>parentGraphicsAlgorithm</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>parentGraphicsAlgorithm</b></em>' feature
   * @generated
   */
  public GraphicsAlgorithm getParentGraphicsAlgorithm() {
    return parentGraphicsAlgorithm;
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getParentGraphicsAlgorithm() <em>parentGraphicsAlgorithm</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newParentGraphicsAlgorithm
   *          the new value of the '{@link GraphicsAlgorithm#getParentGraphicsAlgorithm() parentGraphicsAlgorithm}'
   *          feature.
   * @generated
   */
  public void setParentGraphicsAlgorithm(GraphicsAlgorithm newParentGraphicsAlgorithm) {
    parentGraphicsAlgorithm = newParentGraphicsAlgorithm;
  }

  /**
   * Returns the value of '<em><b>pictogramElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>pictogramElement</b></em>' feature
   * @generated
   */
  public PictogramElement getPictogramElement() {
    return pictogramElement;
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getPictogramElement() <em>pictogramElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPictogramElement
   *          the new value of the '{@link GraphicsAlgorithm#getPictogramElement() pictogramElement}' feature.
   * @generated
   */
  public void setPictogramElement(PictogramElement newPictogramElement) {
    pictogramElement = newPictogramElement;
  }

  /**
   * Returns the value of '<em><b>width</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>width</b></em>' feature
   * @generated
   */
  public int getWidth() {
    return width;
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getWidth() <em>width</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newWidth
   *          the new value of the '{@link GraphicsAlgorithm#getWidth() width}' feature.
   * @generated
   */
  public void setWidth(int newWidth) {
    width = newWidth;
  }

  /**
   * Returns the value of '<em><b>height</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>height</b></em>' feature
   * @generated
   */
  public int getHeight() {
    return height;
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getHeight() <em>height</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newHeight
   *          the new value of the '{@link GraphicsAlgorithm#getHeight() height}' feature.
   * @generated
   */
  public void setHeight(int newHeight) {
    height = newHeight;
  }

  /**
   * Returns the value of '<em><b>x</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>x</b></em>' feature
   * @generated
   */
  public int getX() {
    return x;
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getX() <em>x</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newX
   *          the new value of the '{@link GraphicsAlgorithm#getX() x}' feature.
   * @generated
   */
  public void setX(int newX) {
    x = newX;
  }

  /**
   * Returns the value of '<em><b>y</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>y</b></em>' feature
   * @generated
   */
  public int getY() {
    return y;
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getY() <em>y</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newY
   *          the new value of the '{@link GraphicsAlgorithm#getY() y}' feature.
   * @generated
   */
  public void setY(int newY) {
    y = newY;
  }

  /**
   * Returns the value of '<em><b>style</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>style</b></em>' feature
   * @generated
   */
  public Style getStyle() {
    return style;
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getStyle() <em>style</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStyle
   *          the new value of the '{@link GraphicsAlgorithm#getStyle() style}' feature.
   * @generated
   */
  public void setStyle(Style newStyle) {
    style = newStyle;
  }

  /**
   * Returns the value of '<em><b>background</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>background</b></em>' feature
   * @generated
   */
  public Color getBackground() {
    return background;
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getBackground() <em>background</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBackground
   *          the new value of the '{@link GraphicsAlgorithm#getBackground() background}' feature.
   * @generated
   */
  public void setBackground(Color newBackground) {
    background = newBackground;
  }

  /**
   * Returns the value of '<em><b>foreground</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>foreground</b></em>' feature
   * @generated
   */
  public Color getForeground() {
    return foreground;
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getForeground() <em>foreground</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newForeground
   *          the new value of the '{@link GraphicsAlgorithm#getForeground() foreground}' feature.
   * @generated
   */
  public void setForeground(Color newForeground) {
    foreground = newForeground;
  }

  /**
   * Returns the value of '<em><b>lineWidth</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>lineWidth</b></em>' feature
   * @generated
   */
  public Integer getLineWidth() {
    return lineWidth;
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getLineWidth() <em>lineWidth</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLineWidth
   *          the new value of the '{@link GraphicsAlgorithm#getLineWidth() lineWidth}' feature.
   * @generated
   */
  public void setLineWidth(Integer newLineWidth) {
    lineWidth = newLineWidth;
  }

  /**
   * Returns the value of '<em><b>lineStyle</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>lineStyle</b></em>' feature
   * @generated
   */
  public LineStyle getLineStyle() {
    return lineStyle;
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getLineStyle() <em>lineStyle</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLineStyle
   *          the new value of the '{@link GraphicsAlgorithm#getLineStyle() lineStyle}' feature.
   * @generated
   */
  public void setLineStyle(LineStyle newLineStyle) {
    lineStyle = newLineStyle;
  }

  /**
   * Returns the value of '<em><b>filled</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>filled</b></em>' feature
   * @generated
   */
  public Boolean getFilled() {
    return filled;
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getFilled() <em>filled</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFilled
   *          the new value of the '{@link GraphicsAlgorithm#getFilled() filled}' feature.
   * @generated
   */
  public void setFilled(Boolean newFilled) {
    filled = newFilled;
  }

  /**
   * Returns the value of '<em><b>lineVisible</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>lineVisible</b></em>' feature
   * @generated
   */
  public Boolean getLineVisible() {
    return lineVisible;
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getLineVisible() <em>lineVisible</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLineVisible
   *          the new value of the '{@link GraphicsAlgorithm#getLineVisible() lineVisible}' feature.
   * @generated
   */
  public void setLineVisible(Boolean newLineVisible) {
    lineVisible = newLineVisible;
  }

  /**
   * Returns the value of '<em><b>renderingStyle</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>renderingStyle</b></em>' feature
   * @generated
   */
  public RenderingStyle getRenderingStyle() {
    return renderingStyle;
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getRenderingStyle() <em>renderingStyle</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newRenderingStyle
   *          the new value of the '{@link GraphicsAlgorithm#getRenderingStyle() renderingStyle}' feature.
   * @generated
   */
  public void setRenderingStyle(RenderingStyle newRenderingStyle) {
    renderingStyle = newRenderingStyle;
  }

  /**
   * Returns the value of '<em><b>transparency</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>transparency</b></em>' feature
   * @generated
   */
  public Double getTransparency() {
    return transparency;
  }

  /**
   * Sets the '{@link GraphicsAlgorithm#getTransparency() <em>transparency</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTransparency
   *          the new value of the '{@link GraphicsAlgorithm#getTransparency() transparency}' feature.
   * @generated
   */
  public void setTransparency(Double newTransparency) {
    transparency = newTransparency;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "GraphicsAlgorithm " + " [width: " + getWidth() + "]" + " [height: " + getHeight() + "]" + " [x: " + getX()
        + "]" + " [y: " + getY() + "]" + " [lineWidth: " + getLineWidth() + "]" + " [lineStyle: " + getLineStyle()
        + "]" + " [filled: " + getFilled() + "]" + " [lineVisible: " + getLineVisible() + "]" + " [transparency: "
        + getTransparency() + "]";
  }
}
