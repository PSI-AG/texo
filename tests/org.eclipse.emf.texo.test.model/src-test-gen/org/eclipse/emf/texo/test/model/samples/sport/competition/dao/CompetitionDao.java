package org.eclipse.emf.texo.test.model.samples.sport.competition.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.sport.competition.Competition;
import org.eclipse.emf.texo.test.model.samples.sport.competition.CompetitionModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Competition</b></em>'.
 * 
 * @generated
 */
public class CompetitionDao extends BaseDao<Competition> {

  /**
   * @generated
   */
  @Override
  public Class<Competition> getEntityClass() {
    return Competition.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CompetitionModelPackage.INSTANCE.getCompetitionEClass();
  }
}
