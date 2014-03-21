package org.eclipse.graphiti.mm.pictograms;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Diagram</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "pi_Diagram")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Diagram extends ContainerShape {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int gridUnit = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String diagramTypeId = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "parent")
  private Set<Connection> connections = new HashSet<Connection>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private boolean snapToGrid = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * @deprecated This attribute simply exists because of compatibility (after removing it old diagrams would not be
   *             readable any more). It is never evaluated, instead the Graphiti framework queries the tool behaviour
   *             provider if guides shall be shown in a diagram editor. <!-- end-model-doc -->
   * @generated
   */
  @Basic(optional = false)
  private boolean showGuides = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<Color> colors = new HashSet<Color>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<Font> fonts = new HashSet<Font>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Set<PictogramLink> pictogramLinks = new HashSet<PictogramLink>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private int verticalGridUnit = -1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String version = "";

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "styleContainer")
  private Set<Style> styles = new HashSet<Style>();

  /**
   * Returns the value of '<em><b>gridUnit</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>gridUnit</b></em>' feature
   * @generated
   */
  public int getGridUnit() {
    return gridUnit;
  }

  /**
   * Sets the '{@link Diagram#getGridUnit() <em>gridUnit</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGridUnit
   *          the new value of the '{@link Diagram#getGridUnit() gridUnit}' feature.
   * @generated
   */
  public void setGridUnit(int newGridUnit) {
    gridUnit = newGridUnit;
  }

  /**
   * Returns the value of '<em><b>diagramTypeId</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>diagramTypeId</b></em>' feature
   * @generated
   */
  public String getDiagramTypeId() {
    return diagramTypeId;
  }

  /**
   * Sets the '{@link Diagram#getDiagramTypeId() <em>diagramTypeId</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDiagramTypeId
   *          the new value of the '{@link Diagram#getDiagramTypeId() diagramTypeId}' feature.
   * @generated
   */
  public void setDiagramTypeId(String newDiagramTypeId) {
    diagramTypeId = newDiagramTypeId;
  }

  /**
   * Returns the value of '<em><b>connections</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>connections</b></em>' feature
   * @generated
   */
  public Set<Connection> getConnections() {
    return connections;
  }

  /**
   * Adds to the <em>connections</em> feature.
   * 
   * @param connectionsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToConnections(Connection connectionsValue) {
    if (!connections.contains(connectionsValue)) {
      boolean result = connections.add(connectionsValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>connections</em> feature.
   * 
   * @param connectionsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromConnections(Connection connectionsValue) {
    if (connections.contains(connectionsValue)) {
      boolean result = connections.remove(connectionsValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>connections</em> feature.
   * 
   * @generated
   */
  public void clearConnections() {
    while (!connections.isEmpty()) {
      removeFromConnections(connections.iterator().next());
    }
  }

  /**
   * Sets the '{@link Diagram#getConnections() <em>connections</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newConnections
   *          the new value of the '{@link Diagram#getConnections() connections}' feature.
   * @generated
   */
  public void setConnections(Set<Connection> newConnections) {
    connections = newConnections;
  }

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
   * Sets the '{@link Diagram#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Diagram#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>snapToGrid</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>snapToGrid</b></em>' feature
   * @generated
   */
  public boolean isSnapToGrid() {
    return snapToGrid;
  }

  /**
   * Sets the '{@link Diagram#isSnapToGrid() <em>snapToGrid</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSnapToGrid
   *          the new value of the '{@link Diagram#isSnapToGrid() snapToGrid}' feature.
   * @generated
   */
  public void setSnapToGrid(boolean newSnapToGrid) {
    snapToGrid = newSnapToGrid;
  }

  /**
   * Returns the value of '<em><b>showGuides</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * @deprecated This attribute simply exists because of compatibility (after removing it old diagrams would not be
   *             readable any more). It is never evaluated, instead the Graphiti framework queries the tool behaviour
   *             provider if guides shall be shown in a diagram editor. <!-- end-model-doc -->
   * @return the value of '<em><b>showGuides</b></em>' feature
   * @generated
   */
  public boolean isShowGuides() {
    return showGuides;
  }

  /**
   * Sets the '{@link Diagram#isShowGuides() <em>showGuides</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * @deprecated This attribute simply exists because of compatibility (after removing it old diagrams would not be
   *             readable any more). It is never evaluated, instead the Graphiti framework queries the tool behaviour
   *             provider if guides shall be shown in a diagram editor. <!-- end-model-doc -->
   * @param newShowGuides
   *          the new value of the '{@link Diagram#isShowGuides() showGuides}' feature.
   * @generated
   */
  public void setShowGuides(boolean newShowGuides) {
    showGuides = newShowGuides;
  }

  /**
   * Returns the value of '<em><b>colors</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>colors</b></em>' feature
   * @generated
   */
  public Set<Color> getColors() {
    return colors;
  }

  /**
   * Adds to the <em>colors</em> feature.
   * 
   * @param colorsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToColors(Color colorsValue) {
    if (!colors.contains(colorsValue)) {
      boolean result = colors.add(colorsValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>colors</em> feature.
   * 
   * @param colorsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromColors(Color colorsValue) {
    if (colors.contains(colorsValue)) {
      boolean result = colors.remove(colorsValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>colors</em> feature.
   * 
   * @generated
   */
  public void clearColors() {
    while (!colors.isEmpty()) {
      removeFromColors(colors.iterator().next());
    }
  }

  /**
   * Sets the '{@link Diagram#getColors() <em>colors</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newColors
   *          the new value of the '{@link Diagram#getColors() colors}' feature.
   * @generated
   */
  public void setColors(Set<Color> newColors) {
    colors = newColors;
  }

  /**
   * Returns the value of '<em><b>fonts</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>fonts</b></em>' feature
   * @generated
   */
  public Set<Font> getFonts() {
    return fonts;
  }

  /**
   * Adds to the <em>fonts</em> feature.
   * 
   * @param fontsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToFonts(Font fontsValue) {
    if (!fonts.contains(fontsValue)) {
      boolean result = fonts.add(fontsValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>fonts</em> feature.
   * 
   * @param fontsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromFonts(Font fontsValue) {
    if (fonts.contains(fontsValue)) {
      boolean result = fonts.remove(fontsValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>fonts</em> feature.
   * 
   * @generated
   */
  public void clearFonts() {
    while (!fonts.isEmpty()) {
      removeFromFonts(fonts.iterator().next());
    }
  }

  /**
   * Sets the '{@link Diagram#getFonts() <em>fonts</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFonts
   *          the new value of the '{@link Diagram#getFonts() fonts}' feature.
   * @generated
   */
  public void setFonts(Set<Font> newFonts) {
    fonts = newFonts;
  }

  /**
   * Returns the value of '<em><b>pictogramLinks</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>pictogramLinks</b></em>' feature
   * @generated
   */
  public Set<PictogramLink> getPictogramLinks() {
    return pictogramLinks;
  }

  /**
   * Adds to the <em>pictogramLinks</em> feature.
   * 
   * @param pictogramLinksValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToPictogramLinks(PictogramLink pictogramLinksValue) {
    if (!pictogramLinks.contains(pictogramLinksValue)) {
      boolean result = pictogramLinks.add(pictogramLinksValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>pictogramLinks</em> feature.
   * 
   * @param pictogramLinksValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromPictogramLinks(PictogramLink pictogramLinksValue) {
    if (pictogramLinks.contains(pictogramLinksValue)) {
      boolean result = pictogramLinks.remove(pictogramLinksValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>pictogramLinks</em> feature.
   * 
   * @generated
   */
  public void clearPictogramLinks() {
    while (!pictogramLinks.isEmpty()) {
      removeFromPictogramLinks(pictogramLinks.iterator().next());
    }
  }

  /**
   * Sets the '{@link Diagram#getPictogramLinks() <em>pictogramLinks</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPictogramLinks
   *          the new value of the '{@link Diagram#getPictogramLinks() pictogramLinks}' feature.
   * @generated
   */
  public void setPictogramLinks(Set<PictogramLink> newPictogramLinks) {
    pictogramLinks = newPictogramLinks;
  }

  /**
   * Returns the value of '<em><b>verticalGridUnit</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>verticalGridUnit</b></em>' feature
   * @generated
   */
  public int getVerticalGridUnit() {
    return verticalGridUnit;
  }

  /**
   * Sets the '{@link Diagram#getVerticalGridUnit() <em>verticalGridUnit</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newVerticalGridUnit
   *          the new value of the '{@link Diagram#getVerticalGridUnit() verticalGridUnit}' feature.
   * @generated
   */
  public void setVerticalGridUnit(int newVerticalGridUnit) {
    verticalGridUnit = newVerticalGridUnit;
  }

  /**
   * Returns the value of '<em><b>version</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>version</b></em>' feature
   * @generated
   */
  public String getVersion() {
    return version;
  }

  /**
   * Sets the '{@link Diagram#getVersion() <em>version</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newVersion
   *          the new value of the '{@link Diagram#getVersion() version}' feature.
   * @generated
   */
  public void setVersion(String newVersion) {
    version = newVersion;
  }

  /**
   * Returns the value of '<em><b>styles</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>styles</b></em>' feature
   * @generated
   */
  public Set<Style> getStyles() {
    return styles;
  }

  /**
   * Adds to the <em>styles</em> feature.
   * 
   * @param stylesValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToStyles(Style stylesValue) {
    if (!styles.contains(stylesValue)) {
      boolean result = styles.add(stylesValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>styles</em> feature.
   * 
   * @param stylesValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromStyles(Style stylesValue) {
    if (styles.contains(stylesValue)) {
      boolean result = styles.remove(stylesValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>styles</em> feature.
   * 
   * @generated
   */
  public void clearStyles() {
    while (!styles.isEmpty()) {
      removeFromStyles(styles.iterator().next());
    }
  }

  /**
   * Sets the '{@link Diagram#getStyles() <em>styles</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStyles
   *          the new value of the '{@link Diagram#getStyles() styles}' feature.
   * @generated
   */
  public void setStyles(Set<Style> newStyles) {
    styles = newStyles;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Diagram " + " [gridUnit: " + getGridUnit() + "]" + " [diagramTypeId: " + getDiagramTypeId() + "]"
        + " [name: " + getName() + "]" + " [snapToGrid: " + isSnapToGrid() + "]" + " [showGuides: " + isShowGuides()
        + "]" + " [verticalGridUnit: " + getVerticalGridUnit() + "]" + " [version: " + getVersion() + "]";
  }
}
