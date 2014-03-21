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
 * $Id: DeleteModelOperation.java,v 1.8 2011/09/21 14:04:56 mtaal Exp $
 */
package org.eclipse.emf.texo.server.service;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.component.TexoComponent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Constructs a query from a type and filter and sort parameters.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class QueryBuilder implements TexoComponent {

  private static final char ESCAPE_CHAR = '|';
  private static final String CLIENT_PARAM = "client"; //$NON-NLS-1$

  /**
   * Create a client specific query builder and set its parameters.
   */
  public static QueryBuilder getQueryBuilder(String entityName, EClass eClass, Map<String, Object> parameters) {
    final QueryBuilder queryBuilder;
    if (SenchaQueryBuilder.SENCHA_CLIENT.equals(parameters.get(CLIENT_PARAM))) {
      queryBuilder = ComponentProvider.getInstance().newInstance(SenchaQueryBuilder.class);
    } else {
      queryBuilder = ComponentProvider.getInstance().newInstance(QueryBuilder.class);
    }

    queryBuilder.setEntityName(entityName);
    queryBuilder.setFilterSort(parameters);
    return queryBuilder;
  }

  private String entityName;
  private JSONArray filterJSON;
  private JSONArray sortJSON;

  public String getSelectQuery() {
    try {
      return "select e " + getFromWhereClause(); //$NON-NLS-1$
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  protected String getFromWhereClause() throws JSONException {

    final StringBuilder sb = new StringBuilder();
    sb.append("from " + getEntityName() + " e "); //$NON-NLS-1$ //$NON-NLS-2$ 
    if (filterJSON != null && filterJSON.length() > 0) {
      boolean addOr = false;
      sb.append(" where "); //$NON-NLS-1$
      for (int i = 0; i < filterJSON.length(); i++) {
        final JSONObject filterClause = filterJSON.getJSONObject(i);
        if (addOr) {
          sb.append(" or "); //$NON-NLS-1$
        }
        sb.append("upper(e." + filterClause.getString("property") + ")"); //$NON-NLS-1$ //$NON-NLS-2$//$NON-NLS-3$
        sb.append(" like "); //$NON-NLS-1$
        sb.append("'%" + escapeLike(filterClause.getString("value").toString().toUpperCase()).replaceAll(" ", "%") + "%' escape '" + ESCAPE_CHAR + "'"); //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
        addOr = true;
      }
    }
    return sb.toString();
  }

  public String getCountQuery() {
    try {
      return "select count(e) " + getFromWhereClause(); //$NON-NLS-1$
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  public void setFilterSort(Map<String, Object> parameters) {
    try {
      final String filter = (String) parameters.get(getFilterParamName());
      if (filter != null) {
        filterJSON = new JSONArray(filter);
      }
      final String sort = (String) parameters.get(getSortParamName());
      if (sort != null) {
        sortJSON = new JSONArray(sort);
      }
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * @return default value: filter
   */
  protected String getFilterParamName() {
    return "filter"; //$NON-NLS-1$
  }

  private String escapeLike(String value) {
    if (value == null || value.trim().length() == 0) {
      return value;
    }
    String localValue = value.replace(ESCAPE_CHAR + "", ESCAPE_CHAR + ESCAPE_CHAR + ""); //$NON-NLS-1$//$NON-NLS-2$
    localValue = localValue.replace("'", ESCAPE_CHAR + "'"); //$NON-NLS-1$//$NON-NLS-2$
    localValue = localValue.replace("_", ESCAPE_CHAR + "_"); //$NON-NLS-1$//$NON-NLS-2$
    localValue = localValue.replace("%", ESCAPE_CHAR + "%"); //$NON-NLS-1$ //$NON-NLS-2$
    return localValue;
  }

  /**
   * @return default value: sort
   */
  protected String getSortParamName() {
    return "sort"; //$NON-NLS-1$
  }

  protected String getEntityName() {
    return entityName;
  }

  protected void setEntityName(String entityName) {
    this.entityName = entityName;
  }
}
