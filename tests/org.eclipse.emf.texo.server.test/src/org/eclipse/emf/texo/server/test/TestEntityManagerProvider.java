package org.eclipse.emf.texo.server.test;

import javax.persistence.EntityManager;

import org.eclipse.emf.texo.server.store.EntityManagerProvider;

/**
 * An EntityManagerObjectStoreFactory which uses EclipseLink specifics to load the persistence xml's from the test
 * plugins.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class TestEntityManagerProvider extends EntityManagerProvider {

  @Override
  public EntityManager createEntityManager() {
    return getEntityManagerFactory().createEntityManager(getPersistenceOptions());
  }
}
