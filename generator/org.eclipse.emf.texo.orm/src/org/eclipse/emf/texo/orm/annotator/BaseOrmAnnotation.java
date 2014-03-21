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
 * $Id: BaseOrmAnnotation.java,v 1.1 2011/10/25 13:25:24 mtaal Exp $
 */

package org.eclipse.emf.texo.orm.annotator;

import org.eclipse.emf.ecore.EObject;

/**
 * Base class of generated orm annotations.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public interface BaseOrmAnnotation extends EObject {

  public String getJavaAnnotation(String identifier);
}