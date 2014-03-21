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
 * $Id: ENamedElementORMAnnotator.java,v 1.5 2011/08/26 05:34:12 mtaal Exp $
 */

package org.eclipse.emf.texo.orm.annotator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.generator.AnnotationManager;
import org.eclipse.emf.texo.orm.annotations.model.orm.Inheritance;
import org.eclipse.emf.texo.orm.annotations.model.orm.InheritanceType;
import org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage;

/**
 * Base class of the ORM Annotators.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public abstract class ENamedElementORMAnnotator {

  private AnnotationManager annotationManager;

  public AnnotationManager getAnnotationManager() {
    return annotationManager;
  }

  public void setAnnotationManager(AnnotationManager annotationManager) {
    this.annotationManager = annotationManager;
  }

  public ORMNamingStrategy getOrmNamingStrategy(EPackage ePackage) {
    final EPackageORMAnnotation annotation = (EPackageORMAnnotation) getAnnotationManager().getAnnotation(ePackage,
        OrmannotationsPackage.eINSTANCE.getEPackageORMAnnotation());

    return annotation.getNamingStrategy();
  }

  private Inheritance getInheritance(EClassORMAnnotation orm) {
    if (orm.getEntity() != null && orm.getEntity().getInheritance() != null) {
      return orm.getEntity().getInheritance();
    }
    if (orm.getInheritance() != null) {
      return orm.getInheritance();
    }

    final EClass eClass = orm.getAnnotatedEClass().getEClass();

    for (EClass eSuperType : eClass.getESuperTypes()) {
      final EClassORMAnnotation superOrm = (EClassORMAnnotation) getAnnotationManager().getAnnotation(eSuperType,
          OrmannotationsPackage.eINSTANCE.getEClassORMAnnotation());
      final Inheritance inheritance = getInheritance(superOrm);
      if (inheritance != null) {
        return inheritance;
      }
    }
    final EPackageORMAnnotation ePackageAnnotation = (EPackageORMAnnotation) getAnnotationManager().getAnnotation(
        eClass.getEPackage(), OrmannotationsPackage.eINSTANCE.getEPackageORMAnnotation());
    if (ePackageAnnotation.getInheritance() != null) {
      return ePackageAnnotation.getInheritance();
    }
    return null;
  }

  protected boolean hasItsOwnTable(EClassORMAnnotation annotation) {
    final boolean isRoot = isRoot(annotation);
    final Inheritance inheritance = getInheritance(annotation);
    return isRoot || inheritance != null && inheritance.getStrategy() != InheritanceType.SINGLETABLE;
  }

  protected boolean isRoot(EClassORMAnnotation ormAnnotation) {
    final EClass eClass = ormAnnotation.getEClass();
    if (eClass.getESuperTypes().isEmpty()) {
      return true;
    }

    // all super types are transient or interface or mapped super class
    for (EClass eSuperType : eClass.getESuperTypes()) {
      final EClassORMAnnotation superOrmAnnotation = (EClassORMAnnotation) getAnnotationManager().getAnnotation(
          eSuperType, OrmannotationsPackage.eINSTANCE.getEClassORMAnnotation());
      if (!superOrmAnnotation.getEClass().isInterface() && superOrmAnnotation.getMappedSuperclass() == null
          && superOrmAnnotation.getTransient() == null) {
        return false;
      }
    }
    return true;
  }

}
