package org.eclipse.emf.texo.test.model.samples.sport.club.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.sport.club.ClubModelPackage;
import org.eclipse.emf.texo.test.model.samples.sport.club.Team;

/**
 * The Dao implementation for the model object '<em><b>Team</b></em>'.
 * 
 * @generated
 */
public class TeamDao extends BaseDao<Team> {

  /**
   * @generated
   */
  @Override
  public Class<Team> getEntityClass() {
    return Team.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ClubModelPackage.INSTANCE.getTeamEClass();
  }
}
