/**
 * <copyright>
 *
 * Copyright (c) 2012 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 * </copyright>
 *
 * $Id: DaoRegistry.java,v 1.1 2011/09/24 04:00:25 mtaal Exp $
 */
package org.eclipse.emf.texo.server.store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.component.TexoComponent;
import org.eclipse.emf.texo.converter.EMFModelConverter;
import org.eclipse.emf.texo.converter.ModelEMFConverter;
import org.eclipse.emf.texo.json.EMFJSONConverter;
import org.eclipse.emf.texo.provider.IdProvider;
import org.eclipse.emf.texo.store.EObjectStore;
import org.eclipse.emf.texo.store.ObjectStore;

/**
 * An implementation of a persistence service which can be used as an OSGI service.
 * 
 * This persistence service is capable of persisting EObjects by converting them to Texo model objects. The Texo pojos
 * are standard JPA annotated java classes which can be persisted by the ORM.
 * 
 * After updating/inserting the EObjects are updated with the values from the database/ORM layer. This is needed to pass
 * the id back to the previous layer. Also other values may have been set in the object.
 * 
 * You can set the entity manager provider to be used by this persistence service. If none is set then the one from the
 * {@link EntityManagerProvider} is used.
 * 
 * @see EMFJSONConverter
 * @see JSONToConverter
 * @see ObjectStore
 * @see EntityManagerProvider
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class EPersistenceService extends EObjectStore implements TexoComponent {

  private EntityManagerFactory entityManagerFactory;

  /**
   * Performs several persistence actions, the insert and updates are done in the order in the toInsertUpdate list, the
   * toDelete are done after the insert/updates.
   * 
   * Note that in general it makes sense to first have the new objects in the toInsertUpdate and then the to-be-updated
   * objects.
   * 
   * NOTE: After the persist action the {@link EObject} instances in toInsertUpdate are updated with the data returned
   * from the database. So id's for new objects and other computed information is set back in the passed EObjects.
   */
  @Override
  public void persist(List<EObject> toInsert, List<EObject> toUpdate, List<EObject> toDelete) {
    final ObjectStore os = getObjectStore();
    boolean err = true;
    os.begin();
    try {
      final EMFModelConverter converter = ComponentProvider.getInstance().newInstance(EMFModelConverter.class);
      converter.setUriResolver(os);
      final List<Object> allObjects = new ArrayList<Object>();
      int i = 0;
      final Map<Object, InternalEObject> objectMapping = new HashMap<Object, InternalEObject>();
      for (Object object : converter.convert(toInsert)) {
        allObjects.add(object);
        os.insert(object);
        objectMapping.put(object, (InternalEObject) toInsert.get(i));
        i++;
      }
      i = 0;
      for (Object object : converter.convert(toUpdate)) {
        allObjects.add(object);
        os.update(object);
        objectMapping.put(object, (InternalEObject) toUpdate.get(i));
        i++;
      }

      i = 0;
      for (Object delete : converter.convert(toDelete)) {
        os.remove(delete);
        removeFromCache(toUri(toDelete.get(i++)));
      }
      os.flush();

      // and convert back
      final ModelEMFConverter m2eConverter = createModelEMFConverter();
      m2eConverter.setObjectMapping(objectMapping);
      final List<EObject> result = m2eConverter.convert(allObjects);
      // the result should have the exact same objects
      for (EObject eObject : result) {
        if (!toInsert.contains(eObject) && !toUpdate.contains(eObject)) {
          throw new IllegalStateException("Invalid conversion"); //$NON-NLS-1$
        }
        addToCache(eObject);
      }

      err = false;
    } finally {
      if (err) {
        os.rollback();
      } else {
        os.commit();

        for (EObject delete : toDelete) {
          deleted(delete);
        }
      }

      os.close();
    }
  }

  /**
   * Query for a list of EObjects.
   */
  @Override
  public List<EObject> query(String qryStr, Map<String, Object> namedParameters, int firstResult, int maxResults) {
    final ObjectStore os = getObjectStore();
    boolean err = true;
    os.begin();
    try {
      final List<?> objects = os.query(qryStr, namedParameters, firstResult, maxResults);

      final ModelEMFConverter converter = createModelEMFConverter();
      @SuppressWarnings("unchecked")
      final List<EObject> result = converter.convert((List<Object>) objects);
      err = false;

      for (EObject resultObject : result) {
        addToCache(resultObject);
      }

      return result;
    } finally {
      if (err) {
        os.rollback();
      } else {
        os.commit();
      }
      os.close();
    }
  }

  /**
   * Execute a count query in the database.
   */
  @Override
  public long count(String qry, Map<String, Object> namedParameters) {
    final ObjectStore os = getObjectStore();
    boolean err = true;
    os.begin();
    try {
      final long result = os.count(qry, namedParameters);
      err = false;
      return result;
    } finally {
      if (err) {
        os.rollback();
      } else {
        os.commit();
      }
      os.close();
    }
  }

  protected ObjectStore getObjectStore() {
    final EntityManagerObjectStore emStore = ComponentProvider.getInstance()
        .newInstance(EntityManagerObjectStore.class);
    emStore.setEntityManager(getEntityManager());
    emStore.setUri(getUri());
    return emStore;
  }

  protected synchronized EntityManager getEntityManager() {
    if (entityManagerFactory == null) {
      return EntityManagerProvider.getInstance().getEntityManager();
    }
    return entityManagerFactory.createEntityManager();
  }

  /**
   * Set the {@link EntityManagerFactory} to use for this persistence service. If this persistence service does not have
   * an {@link EntityManagerFactory} then it is read from the {@link EntityManagerProvider}.
   * 
   * @see EntityManagerProvider
   */
  public void setEntityManagerFactory(EntityManagerFactory emf) {
    entityManagerFactory = emf;
  }

  @Override
  protected EObject loadEObject(EClass eClass, String idString) {
    final ObjectStore os = getObjectStore();
    boolean err = true;
    os.begin();
    try {
      final Object id = IdProvider.getInstance().convertIdStringToId(eClass, idString);
      final Object target = os.get(eClass, id);

      if (target == null) {
        return null;
      }

      final ModelEMFConverter converter = createModelEMFConverter();
      final List<EObject> result = converter.convert(Collections.singletonList(target));

      err = false;

      return result.get(0);
    } finally {
      if (err) {
        os.rollback();
      } else {
        os.commit();
      }
      os.close();
    }
  }

  @Override
  public void refresh(EObject eObject) {
    final ObjectStore os = getObjectStore();
    boolean err = true;
    os.begin();
    try {
      final Object target = os.resolveFromEObject(eObject);
      final Map<Object, InternalEObject> objectMapping = new HashMap<Object, InternalEObject>();
      objectMapping.put(target, (InternalEObject) eObject);

      final ModelEMFConverter converter = createModelEMFConverter();
      converter.setObjectMapping(objectMapping);

      final List<EObject> result = converter.convert(Collections.singletonList(target));
      if (result.get(0) != eObject) {
        throw new IllegalStateException("Object not refreshed, different object resolved back expected " + eObject //$NON-NLS-1$
            + " got " + result.get(0)); //$NON-NLS-1$
      }
      err = false;
    } finally {
      if (err) {
        os.rollback();
      } else {
        os.commit();
      }
      os.close();
    }
  }

  @Override
  public List<EObject> getReferingObjects(EObject eTarget, int maxResult, boolean includeContainerReferences) {
    final ObjectStore os = getObjectStore();
    boolean err = true;
    os.begin();
    try {
      final Object id = eTarget.eGet(IdProvider.getInstance().getIdEAttribute(eTarget.eClass()));
      final Object target = os.get(eTarget.eClass(), id);
      final List<?> objects = os.getReferingObjects(target, maxResult, includeContainerReferences);

      final ModelEMFConverter converter = createModelEMFConverter();
      @SuppressWarnings("unchecked")
      final List<EObject> result = converter.convert((List<Object>) objects);
      err = false;
      return result;
    } finally {
      if (err) {
        os.rollback();
      } else {
        os.commit();
      }
      os.close();
    }
  }

  protected ModelEMFConverter createModelEMFConverter() {
    final ModelEMFConverter converter = ComponentProvider.getInstance().newInstance(ModelEMFConverter.class);
    converter.setObjectResolver(this);
    converter.setMaxChildLevelsToConvert(1);
    return converter;
  }
}
