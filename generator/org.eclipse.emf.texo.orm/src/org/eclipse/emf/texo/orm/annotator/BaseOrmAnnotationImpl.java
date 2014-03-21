/**
 * <copyright>
 *
 * Copyright (c) 2011 Springsite BV (The Netherlands) and others
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
 * $Id: BaseOrmAnnotationImpl.java,v 1.2 2011/10/25 22:27:57 mtaal Exp $
 */

package org.eclipse.emf.texo.orm.annotator;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * Base class of generated orm annotations.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class BaseOrmAnnotationImpl extends EObjectImpl {
  public String getJavaAnnotation(String identifier) {
    return ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, null, false, identifier);
  }
}