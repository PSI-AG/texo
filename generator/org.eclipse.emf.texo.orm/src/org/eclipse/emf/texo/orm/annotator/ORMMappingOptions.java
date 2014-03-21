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
 *
 * </copyright>
 *
 * $Id: StandardORMGenerator.java,v 1.2 2011/08/26 05:34:12 mtaal Exp $
 */

package org.eclipse.emf.texo.orm.annotator;

/**
 * Container for a set of ORM mapping options, either set by tests or by the project properties.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ORMMappingOptions {

  private static ORMMappingOptions defaultOptions = new ORMMappingOptions();

  public static ORMMappingOptions getDefaultOptions() {
    if (defaultOptions == null) {
      defaultOptions = new ORMMappingOptions();
    }
    return defaultOptions;
  }

  public static void setDefaultOptions(ORMMappingOptions defaultOptions) {
    ORMMappingOptions.defaultOptions = defaultOptions;
  }

  private boolean testRun = false;
  private boolean addOrderColumnToListMappings = false;
  private boolean enforceUniqueNames = false;
  private boolean renameSQLReservedNames = false;
  private boolean generateFullDbSchemaNames = false;
  private int maximumSqlNameLength = -1;

  public boolean isAddOrderColumnToListMappings() {
    return addOrderColumnToListMappings;
  }

  public void setAddOrderColumnToListMappings(boolean addOrderColumnToListMappings) {
    this.addOrderColumnToListMappings = addOrderColumnToListMappings;
  }

  public boolean isEnforceUniqueNames() {
    return enforceUniqueNames;
  }

  public void setEnforceUniqueNames(boolean enforceUniqueNames) {
    this.enforceUniqueNames = enforceUniqueNames;
  }

  public boolean isRenameSQLReservedNames() {
    return renameSQLReservedNames;
  }

  public void setRenameSQLReservedNames(boolean renameSQLReservedNames) {
    this.renameSQLReservedNames = renameSQLReservedNames;
  }

  public boolean isGenerateFullDbSchemaNames() {
    return generateFullDbSchemaNames;
  }

  public void setGenerateFullDbSchemaNames(boolean generateFullDbSchemaNames) {
    this.generateFullDbSchemaNames = generateFullDbSchemaNames;
  }

  public int getMaximumSqlNameLength() {
    return maximumSqlNameLength;
  }

  public void setMaximumSqlNameLength(int maximumSqlNameLength) {
    this.maximumSqlNameLength = maximumSqlNameLength;
  }

  public boolean isTestRun() {
    return testRun;
  }

  public void setTestRun(boolean testRun) {
    this.testRun = testRun;
  }

}