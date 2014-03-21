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
 *   Dzmitry [zmicer] Harachka - implementation
 * </copyright>
 *
 * $Id: UpdateInsertModelOperation.java,v 1.5 2011/08/28 12:35:20 mtaal Exp $
 */
package org.eclipse.emf.texo.server.service;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.server.model.request.ActionType;
import org.eclipse.emf.texo.server.model.request.QueryReferingObjectsType;
import org.eclipse.emf.texo.server.model.request.QueryType;
import org.eclipse.emf.texo.server.model.response.ResponseModelPackage;
import org.eclipse.emf.texo.server.model.response.ResponseType;
import org.eclipse.emf.texo.server.model.response.ResultType;
import org.eclipse.emf.texo.store.ObjectStore;

/**
 * The model operation which takes care of updating and inserting data using an content string (xml/json) and an
 * objectstore.
 * 
 * The webservice responds by returning an instance of {@link ResultType}.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class UpdateInsertModelOperation extends ModelOperation {

  @Override
  protected void internalExecute() {
    final List<Object> allConvertedObjects = getServiceContext().getRequestData();
    final ObjectStore localObjectStore = getObjectStore();

    final ResultType result = ResponseModelPackage.INSTANCE.getModelFactory().createResultType();

    for (Iterator<Object> it = allConvertedObjects.iterator(); it.hasNext();) {
      final Object o = it.next();
      if (o instanceof QueryReferingObjectsType) {
        final QueryReferingObjectsType qrt = (QueryReferingObjectsType) o;
        final Object target = localObjectStore.fromUri(URI.createURI(qrt.getTargetUri()));
        final List<Object> referers = localObjectStore.getReferingObjects(target, qrt.getMaxResults(),
            qrt.getIncludeContainerReferences());
        final ResponseType responseType = ResponseModelPackage.INSTANCE.getModelFactory().createResponseType();
        responseType.setStatus(ServiceConstants.STATUS_SUCCESS);
        responseType.setData(referers);
        getServiceContext().setResultInResponse(responseType);
        return;
      } else if (o instanceof QueryType) {
        // also a querytype can be posted...
        // we can only handle one query action
        final RetrieveModelOperation retrieveModelOperation = ComponentProvider.getInstance().newInstance(
            RetrieveModelOperation.class);
        retrieveModelOperation.setServiceContext(getServiceContext());

        retrieveModelOperation.internalExecute();
        return;
      } else if (o instanceof ActionType) {
        final ActionType actionType = (ActionType) o;

        // first delete
        for (Iterator<Object> itObject = actionType.getDelete().iterator(); itObject.hasNext();) {
          final Object object = itObject.next();
          localObjectStore.remove(object);
          result.getDeleted().add(object);
        }

        // then insert
        for (Iterator<Object> itObject = actionType.getInsert().iterator(); itObject.hasNext();) {
          final Object object = itObject.next();
          if (localObjectStore.isNew(object)) {
            localObjectStore.insert(object);
            result.getInserted().add(object);
          } else {
            final Object updated = localObjectStore.update(object);
            // note also add to the inserted list
            // as the client expects it maybe
            result.getInserted().add(updated);
          }
        }

        // then update
        for (Iterator<Object> itObject = actionType.getUpdate().iterator(); itObject.hasNext();) {
          final Object object = itObject.next();
          if (localObjectStore.isNew(object)) {
            localObjectStore.insert(object);
            result.getInserted().add(object);
          } else {
            final Object updated = localObjectStore.update(object);
            result.getUpdated().add(updated);
          }
        }

        it.remove();

        localObjectStore.flush();
      }
    }

    // first insert the new objects
    for (Iterator<Object> it = allConvertedObjects.iterator(); it.hasNext();) {
      final Object o = it.next();
      if (localObjectStore.isNew(o)) {
        localObjectStore.insert(o);
        result.getInserted().add(o);
        it.remove();
      }
    }

    localObjectStore.flush();

    // and update the remaining objects
    for (Object o : allConvertedObjects) {
      final Object updated = localObjectStore.update(o);
      result.getUpdated().add(updated);
    }

    localObjectStore.flush();

    getServiceContext().setResultInResponse(result);
  }
}
