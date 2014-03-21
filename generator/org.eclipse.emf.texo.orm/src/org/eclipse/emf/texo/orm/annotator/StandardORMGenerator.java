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
 * $Id: StandardORMGenerator.java,v 1.2 2011/08/26 05:34:12 mtaal Exp $
 */

package org.eclipse.emf.texo.orm.annotator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel;
import org.eclipse.emf.texo.generator.AnnotationManager;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.orm.annotations.model.orm.DocumentRoot;
import org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.SupportedVersionsType;
import org.eclipse.emf.texo.orm.ormannotations.util.OrmannotationsResourceFactoryImpl;
import org.eclipse.emf.texo.orm.ormannotations.util.OrmannotationsResourceImpl;

/**
 * Generates an ORM model on the basis of an annotated model and then replaces the namespace and version to let it work
 * correctly with other ORM's. This class also sets a ThreadLocal flag which can be checked by the orm generator in
 * which mode the generation runs.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class StandardORMGenerator extends ORMGenerator {
  private static final String STANDARD_ORM_NS = "http://java.sun.com/xml/ns/persistence/orm"; //$NON-NLS-1$
  private static final String ECLIPSELINK_ORM_NS = "http://www.eclipse.org/eclipselink/xsds/persistence/orm"; //$NON-NLS-1$

  private static final List<String> eclipseLinkSpecificFeatureNames = new ArrayList<String>();

  static {
    eclipseLinkSpecificFeatureNames.add("creationSuffix");
  }

  @Override
  public ModelController generateStoreORM(List<EPackage> ePackages, URI ormUri) {
    try {
      ORMGenerator.setInStandardsCompliantMode(true);
      return super.generateStoreORM(ePackages, ormUri);
    } finally {
      ORMGenerator.setInStandardsCompliantMode(null);
    }
  }

  @Override
  protected void storeORM(URI fileUri, AnnotatedModel annotatedModel, AnnotationManager annotationManager,
      EntityMappingsType entityMappings) {
    if (ORMGenerator.areInStandardsCompliantMode()) {
      entityMappings.setVersion(SupportedVersionsType._20);
    } else {
      entityMappings.setVersion(SupportedVersionsType._23);
    }

    unsetEclipseLinkFeatures(entityMappings);

    final OrmannotationsResourceImpl ormResource = (OrmannotationsResourceImpl) new OrmannotationsResourceFactoryImpl()
        .createResource(fileUri);
    try {
      String fileUriStr = fileUri.toFileString();
      final File file = new File(fileUriStr);
      if (file.exists()) {
        file.delete();
      }
      file.createNewFile();

      final DocumentRoot docRoot = OrmFactory.eINSTANCE.createDocumentRoot();
      docRoot.setEntityMappings(entityMappings);
      ormResource.getContents().add(docRoot);
      final StringWriter sw = new StringWriter();
      ormResource.save(sw, Collections.emptyMap());
      final FileWriter fw = new FileWriter(file);
      String result = sw.toString();
      while (result.contains(ECLIPSELINK_ORM_NS)) {
        result = result.replace(ECLIPSELINK_ORM_NS, STANDARD_ORM_NS);
      }
      fw.write(result);
      fw.close();
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

  protected void unsetEclipseLinkFeatures(EObject eObject) {
    if (eObject == null) {
      return;
    }
    for (EStructuralFeature eFeature : eObject.eClass().getEAllStructuralFeatures()) {
      final Object value = eObject.eGet(eFeature);
      if (eFeature instanceof EReference) {
        final EReference eReference = (EReference) eFeature;
        // visit the children
        if (eReference.isContainment()) {
          if (value instanceof Collection<?>) {
            final Collection<?> coll = (Collection<?>) value;
            for (Object o : coll) {
              unsetEclipseLinkFeatures((EObject) o);
            }
          } else {
            unsetEclipseLinkFeatures((EObject) value);
          }
        }

        // unset
        if (eclipseLinkSpecificFeatureNames.contains(eReference.getName())) {
          if (value instanceof Collection<?>) {
            final Collection<?> coll = (Collection<?>) value;
            coll.clear();
          } else {
            eObject.eSet(eReference, null);
          }
          eObject.eUnset(eReference);
        }
      } else {
        final EAttribute eAttribute = (EAttribute) eFeature;
        if (eclipseLinkSpecificFeatureNames.contains(eAttribute.getName())) {
          if (value instanceof Collection<?>) {
            final Collection<?> coll = (Collection<?>) eObject.eGet(eAttribute);
            coll.clear();
          } else {
            eObject.eSet(eAttribute, null);
          }
          eObject.eUnset(eAttribute);
        }
      }
    }
  }
}