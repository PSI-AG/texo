/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: JPATest.java,v 1.8 2011/08/26 14:34:41 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.test;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.base.ModelPackageJPATest;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.eclipse.persistence.jpa.PersistenceProvider;

/**
 * Base JPA Test
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */
public abstract class JPATest extends ModelPackageJPATest {
  private EntityManagerFactory factory;

  private EntityManager em;
  private String persistenceXMLPrefix;
  private String persistenceUnitName;
  private String persistenceUnitPostFix = "-hsqldb"; //$NON-NLS-1$

  public JPATest(ModelPackage modelPackage, String postFix) {
    super(modelPackage, postFix);
    persistenceUnitPostFix = postFix;
    persistenceXMLPrefix = modelPackage.getEPackage().getName();
    persistenceUnitName = modelPackage.getEPackage().getName();
  }

  public JPATest(List<ModelPackage> modelPackages) {
    super(modelPackages);
    persistenceXMLPrefix = modelPackages.get(0).getEPackage().getName();
    persistenceUnitName = modelPackages.get(0).getEPackage().getName();
  }

  public EntityManagerFactory getEntityManagerFactory() {
    if (factory == null) {
      final HashMap<String, Object> properties = new HashMap<String, Object>();
      // on purpose using the IdentifiableModelPackage as it is in the plugin
      // which contains the persistence.xml files
      // the test.model plugin has Eclipse-BuddyPolicy set
      final ClassLoader classLoader = IdentifiableModelPackage.class.getClassLoader();
      properties.put(PersistenceUnitProperties.CLASSLOADER, classLoader);
      properties.put(PersistenceUnitProperties.ECLIPSELINK_PERSISTENCE_XML, "META-INF/" //$NON-NLS-1$
          + getPersistenceXMLPrefix() + "-persistence.xml"); //$NON-NLS-1$
      properties.put(PersistenceUnitProperties.MULTITENANT_PROPERTY_DEFAULT, "texo");
      factory = new PersistenceProvider().createEntityManagerFactory(getPersistenceUnitName(), properties);
    }
    return factory;
  }

  protected String getPersistenceUnitName() {
    return persistenceUnitName + persistenceUnitPostFix;
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    getEntityManager();
    cleanDatabase();
  }

  @Override
  protected void tearDown() throws Exception {
    if (em != null) {
      try {
        em.close();
        em = null;
      } catch (RuntimeException e) {
        System.out.println("Exception closing EntityManager: " + e.getMessage()); //$NON-NLS-1$
        e.printStackTrace();
        // not supposed to fail in tearDown
      } finally {
      }
    }
    factory.close();
    super.tearDown();
  }

  protected static long nextTitleInt = Calendar.getInstance().getTimeInMillis();

  /**
   * Utility method used to generate Strings for "don't care" attribute values of test objects: DON'T HARD WIRE VALUES
   * IN TESTS
   * 
   * @return String
   */
  protected String getAnonymousString() {
    return String.valueOf(nextTitleInt++);
  }

  protected void clearEntityManager() {
    if (em != null) {
      em.close();
      em = null;
    }
  }

  protected EntityManager getEntityManager() {
    if (em == null) {
      em = getEntityManagerFactory().createEntityManager();
    }
    return em;
  }

  protected void cleanDatabase(EntityManager entityManager) {

  }

  protected void cleanDatabase() {
    em.getTransaction().begin();
    cleanDatabase(em);
    em.getTransaction().commit();
  }

  protected void beginTransaction() {
    em.getTransaction().begin();
  }

  protected void commitTransaction() {
    em.getTransaction().commit();
  }

  protected void rollbackTransaction() {
    em.getTransaction().rollback();
  }

  protected void reinitializeCachesAndEntityManager() {
    // Session session = SessionManager.getManager().getSession(getPersistenceUnitName());
    // session.getIdentityMapAccessor().initializeAllIdentityMaps();
    em.close();
    em = getEntityManagerFactory().createEntityManager();
  }

  public String getPersistenceUnitPostFix() {
    return persistenceUnitPostFix;
  }

  public void setPersistenceUnitPostFix(String persistenceUnitPostFix) {
    this.persistenceUnitPostFix = persistenceUnitPostFix;
  }

  public String getPersistenceXMLPrefix() {
    return persistenceXMLPrefix;
  }

  public void setPersistenceXMLPrefix(String persistenceXMLPrefix) {
    this.persistenceXMLPrefix = persistenceXMLPrefix;
  }

}
