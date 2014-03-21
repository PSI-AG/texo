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
 * $Id: ArtifactGenerationException.java,v 1.4 2011/08/25 12:34:30 mtaal Exp $
 */

package org.eclipse.emf.texo.generator;

import org.eclipse.emf.mwe.core.issues.Issues;

/**
 * Exception thrown when code generation fails.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ArtifactGenerationException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  private final Issues issues;

  public ArtifactGenerationException(final String msg) {
    super(msg);
    issues = null;
  }

  public ArtifactGenerationException(final String msg, final Issues issues) {
    super(msg);
    this.issues = issues;
  }

  /**
   * 
   * @return the issues found during code generation, note maybe null!
   */
  public Issues getIssues() {
    return issues;
  }

}
