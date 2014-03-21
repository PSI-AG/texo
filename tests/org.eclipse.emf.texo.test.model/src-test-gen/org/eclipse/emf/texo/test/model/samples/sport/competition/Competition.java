package org.eclipse.emf.texo.test.model.samples.sport.competition;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.emf.texo.test.model.samples.sport.club.Team;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Competition</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "competition_Competition")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Competition extends Identifiable {

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
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  private List<Team> teams = new ArrayList<Team>();

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
   * Sets the '{@link Competition#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Competition#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>teams</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>teams</b></em>' feature
   * @generated
   */
  public List<Team> getTeams() {
    return teams;
  }

  /**
   * Adds to the <em>teams</em> feature.
   * 
   * @param teamsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToTeams(Team teamsValue) {
    if (!teams.contains(teamsValue)) {
      boolean result = teams.add(teamsValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>teams</em> feature.
   * 
   * @param teamsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromTeams(Team teamsValue) {
    if (teams.contains(teamsValue)) {
      boolean result = teams.remove(teamsValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>teams</em> feature.
   * 
   * @generated
   */
  public void clearTeams() {
    while (!teams.isEmpty()) {
      removeFromTeams(teams.iterator().next());
    }
  }

  /**
   * Sets the '{@link Competition#getTeams() <em>teams</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTeams
   *          the new value of the '{@link Competition#getTeams() teams}' feature.
   * @generated
   */
  public void setTeams(List<Team> newTeams) {
    teams = newTeams;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Competition " + " [name: " + getName() + "]";
  }
}
