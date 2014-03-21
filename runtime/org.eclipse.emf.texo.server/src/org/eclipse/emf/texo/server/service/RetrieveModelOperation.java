/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010, 2012 Springsite BV (The Netherlands) and others
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
 * $Id: RetrieveModelOperation.java,v 1.7 2011/09/04 20:04:19 mtaal Exp $
 */
package org.eclipse.emf.texo.server.service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.provider.IdProvider;
import org.eclipse.emf.texo.server.model.request.QueryType;
import org.eclipse.emf.texo.server.model.response.ResponseModelPackage;
import org.eclipse.emf.texo.server.model.response.ResponseType;
import org.eclipse.emf.texo.utils.Check;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The model operation which takes care of retrieving data. The conversion to the expected format is done by the
 * implementing subclass.
 * 
 * The following type of request uris are supported here:
 * <ul>
 * <li>http://www.test.com/XMLService?query=select o from Order&firstResult=10&maxResults=50 a query with paging
 * parameters</li>
 * <li>http://www.test.com/XMLService?id=http://www.test.com/XMLService/Order/123 an uri with an id parameter
 * <li>http://www.test.com/XMLService/Order/123 a direct uri with a type and id</li>
 * <li>http://www.test.com/XMLService/Order an uri with just a type (and optional page parameters).</li>
 * <li>http://www.test.com/XMLService/model/eclass?id=Library</li>
 * <li>http://www.test.com/XMLService/model/epackage?id=</li>
 * </ul>
 * 
 * The response of this web service is an instance of the {@link ResponseType}.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class RetrieveModelOperation extends ModelOperation {

  private static final String FALSE = Boolean.FALSE.toString();

  @SuppressWarnings("unchecked")
  @Override
  protected void internalExecute() {

    final String[] segments = ServiceUtils.getSegments(getServiceContext().getServiceRequestURI());

    // 0) a post with a json object or 1) a query
    QueryType queryType = getQueryType();
    if (queryType != null) {
      int maxResults = queryType.getMaxResults();
      int startRow = queryType.getFirstResult() == -1 ? 0 : queryType.getFirstResult();

      if (!queryType.isDoCount() && maxResults != -1 && maxResults != Integer.MAX_VALUE) {
        // try to get one more than the requested result size
        // if we should not do count
        maxResults++;
      }

      final Map<String, Object> parameters = getParameters(queryType);

      final List<Object> resultList;
      if (queryType.getNamedQuery() != null) {
        resultList = (List<Object>) getObjectStore().namedQuery(queryType.getNamedQuery(), parameters, startRow,
            maxResults);
      } else {
        resultList = (List<Object>) getObjectStore().query(queryType.getQuery(), parameters, startRow, maxResults);
      }

      // now do smart things, to prevent unnecessary count operations
      long cnt;
      if (resultList.size() < maxResults) {
        // we did not get everything so we reached the end anyway
        cnt = resultList.size() + startRow;
      } else if (maxResults == -1 || maxResults == Integer.MAX_VALUE) {
        // if there were no paging limitations then this is the size
        cnt = resultList.size() + startRow;
      } else if (queryType.isDoCount()) {
        if (queryType.getNamedQuery() != null) {
          cnt = getObjectStore().countNamedQuery(queryType.getNamedQuery(), parameters);
        } else {
          cnt = getObjectStore().count(queryType.getQuery(), parameters);
        }
      } else {
        // okay then the count is one more than the original maxresults
        cnt = maxResults;
        // remove the last result from the result
        resultList.remove(resultList.size() - 1);
      }

      final Object responseObject;
      if (queryType.isCountOperation()) {
        responseObject = getResponse(Collections.emptyList(), 0, 0, (Long) resultList.get(0));
      } else {
        responseObject = getResponse(resultList, startRow, startRow + resultList.size() - 1, cnt);
      }
      getServiceContext().setResultInResponse(responseObject);
    } else if (segments.length < 2 && getServiceContext().getRequestParameters().containsKey(ServiceConstants.PARAM_ID)) {
      // an id which must be a uri
      final URI uri = URI.createURI((String) getServiceContext().getRequestParameters().get(ServiceConstants.PARAM_ID));
      final Object object = getObjectStore().fromUri(uri);
      getServiceContext().setResultInResponse(object);
    } else if (segments.length == 0) {
      throw new IllegalArgumentException("Service path " + getServiceContext().getServiceRequestURI() //$NON-NLS-1$
          + " not supported, uri " + getServiceContext().getRequestURI()); //$NON-NLS-1$
    } else if (segments.length == 1) {
      // 2) there is a specific type without an id, return all instances
      final EClass eClass = ModelUtils.getEClassFromQualifiedName(segments[0]);
      final QueryBuilder queryBuilder = QueryBuilder.getQueryBuilder(getObjectStore().getEntityName(eClass), eClass,
          getServiceContext().getRequestParameters());

      final List<Object> resultList = (List<Object>) getObjectStore().query(queryBuilder.getSelectQuery(),
          Collections.<String, Object> emptyMap(), getFirstResult(), getMaxResults());

      int maxResults = getMaxResults();
      int startRow = getFirstResult() == -1 ? 0 : getFirstResult();

      final String noCountParam = (String) getServiceContext().getRequestParameters().get(
          ServiceConstants.PARAM_NO_COUNT);
      boolean doCount = maxResults != -1 && (noCountParam == null || FALSE.equals(noCountParam));

      if (!doCount && maxResults != -1) {
        // try to get one more than the requested result size
        // if we should not do count
        maxResults++;
      }

      // now do smart things, to prevent unnecessary count operations
      long cnt;
      if (resultList.size() < maxResults) {
        // we did not get everything so we reached the end anyway
        cnt = resultList.size() + startRow;
      } else if (maxResults == -1) {
        // if there were no paging limitations then this is the size
        cnt = resultList.size() + startRow;
      } else if (doCount) {
        cnt = getObjectStore().count(queryBuilder.getCountQuery(), Collections.<String, Object> emptyMap());
      } else {
        // okay then the count is one more than the original maxresults
        cnt = maxResults;
        // remove the last result from the result
        resultList.remove(resultList.size() - 1);
      }

      final Object responseObject = getResponse(resultList, startRow, startRow + resultList.size() - 1, cnt);
      getServiceContext().setResultInResponse(responseObject);
    } else if (segments.length == 2) {
      // 3) there is specific type with an id, or
      // 4) a model request: model/eclass?id= or model/eclassifier?id= or model/epackage?id=
      if (ServiceConstants.SEGMENT_MODEL.equals(segments[0])) {
        final EObject modelElement = retrieveModelInformation(segments[1]);
        getServiceContext().setResultInResponse(modelElement);
      } else {
        final String idString = segments[1];
        final EClass eClass = ModelUtils.getEClassFromQualifiedName(segments[0]);
        final Object id = IdProvider.getInstance().convertIdStringToId(eClass, idString);
        final Object object = getObjectStore().get(eClass, id);
        if (object == null) {
          getServiceContext().createResourceNotFoundResult();
        } else {
          getServiceContext().setResultInResponse(object);
        }
      }
    } else {
      throw new IllegalArgumentException("Service path " + getServiceContext().getServiceRequestURI() //$NON-NLS-1$
          + " not supported, uri " + getServiceContext().getRequestURI()); //$NON-NLS-1$
    }

  }

  protected EObject retrieveModelInformation(String modelType) {
    if (ServiceConstants.SEGMENT_ECLASS.equals(modelType) || ServiceConstants.SEGMENT_ECLASSIFIER.equals(modelType)) {
      final boolean isRetrieveEClass = ServiceConstants.SEGMENT_ECLASS.equals(modelType);
      // eclass of eclassifier
      final String ePackageidentifier = (String) getServiceContext().getRequestParameters().get(
          ServiceConstants.MODEL_EPACKAGE_PARAMETER);
      final String name = (String) getServiceContext().getRequestParameters()
          .get(ServiceConstants.MODEL_NAME_PARAMETER);
      final String id = (String) getServiceContext().getRequestParameters().get(ServiceConstants.MODEL_ID_PARAMETER);
      if (id != null) {
        return ModelUtils.getEClassFromQualifiedName(id);
      }

      Check.isNotNull(name, "name parameter should be set when retrieving an eclass(ifier)"); //$NON-NLS-1$
      Check.isNotNull(ePackageidentifier, "epackage parameter should be set when retrieving an eclass(ifier)"); //$NON-NLS-1$
      final EPackage ePackage = ModelUtils.getEPackageFromNameUriOrPrefix(ePackageidentifier);
      for (EClassifier eClassifier : ePackage.getEClassifiers()) {
        if (name.equals(eClassifier.getName())) {
          if (isRetrieveEClass) {
            // force a cast to throw an exception if not correct
            final EClass eClass = (EClass) eClassifier;
            return eClass;
          }
          return eClassifier;
        }
      }
    }
    Check.isTrue(ServiceConstants.SEGMENT_EPACKAGE.equals(modelType),
        "Excepted uri segment of eclass, eclassifier or epackage but found " + modelType); //$NON-NLS-1$
    final String id = (String) getServiceContext().getRequestParameters().get(ServiceConstants.MODEL_ID_PARAMETER);
    Check.isNotNull(id, "id parameter should be set when retrieving an epackage"); //$NON-NLS-1$
    return ModelUtils.getEPackageFromNameUriOrPrefix(id);
  }

  protected ResponseType getResponse(List<Object> objects, int startRow, int endRow, long totalRows) {
    final ResponseType responseType = ResponseModelPackage.INSTANCE.getModelFactory().createResponseType();
    responseType.setEndRow(endRow);
    responseType.setStartRow(startRow);
    responseType.setTotalRows(totalRows);
    responseType.setStatus(ServiceConstants.STATUS_SUCCESS);
    responseType.setData(objects);
    return responseType;
  }

  private boolean doCount(QueryType queryType, int maxResults, int firstResult) {
    // if there is no limit on the max results and there is no first row then don't count
    if (getMaxResults() == -1 && getFirstResult() == -1) {
      return false;
    }

    final String noCountParam = (String) getServiceContext().getRequestParameters()
        .get(ServiceConstants.PARAM_NO_COUNT);
    return noCountParam == null || FALSE.equals(noCountParam);
  }
}
