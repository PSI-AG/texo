/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
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
 * $Id: ExtensionPointUtils.java,v 1.4 2011/08/25 12:34:30 mtaal Exp $
 */

package org.eclipse.emf.texo.generator;

import java.lang.reflect.Field;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.util.AnnotationsModelRegistry;

/**
 * Takes care of reading extensions provided by other plugins and setting the information in the relevant Texo
 * registries.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ExtensionPointUtils {

  private static String ANNOTATIONS_MODEL_EXTENSION = "org.eclipse.emf.texo.extensionpoint.annotationmodels"; //$NON-NLS-1$
  private static String MODEL_ANNOTATORS_EXTENSION = "org.eclipse.emf.texo.extensionpoint.modelannotators"; //$NON-NLS-1$
  private static final String ATT_URI = "uri"; //$NON-NLS-1$
  private static final String ATT_CLASS = "class"; //$NON-NLS-1$

  private static boolean readAnnotators = false;

  public static void readAnnotationsModelsFromExtensions() {
    IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(
        ANNOTATIONS_MODEL_EXTENSION);
    for (IConfigurationElement extension : config) {
      if (extension.getAttribute(ATT_CLASS) != null) {
        final String value = extension.getAttribute(ATT_CLASS);
        try {
          Class<?> javaClass = Platform.getBundle(extension.getDeclaringExtension().getContributor().getName())
              .loadClass(value);
          final Field field = javaClass.getField("eINSTANCE"); //$NON-NLS-1$
          AnnotationsModelRegistry.getInstance().addAnnotationModel((EPackage) field.get(null));
        } catch (Exception e) {
          throw new IllegalStateException("Extension point has illegal value " + value); //$NON-NLS-1$
        }
      } else if (extension.getAttribute(ATT_URI) != null) {
        final String value = extension.getAttribute(ATT_URI);
        final EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(value);
        if (ePackage == null) {
          throw new IllegalStateException("No EPackage found using extension point uri: " + value); //$NON-NLS-1$
        }
        AnnotationsModelRegistry.getInstance().addAnnotationModel(ePackage);
      }
    }
  }

  public static synchronized void readModelAnnotatorsFromExtensions() {
    if (readAnnotators) {
      return;
    }
    readAnnotators = true;
    IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(
        MODEL_ANNOTATORS_EXTENSION);
    for (IConfigurationElement extension : config) {
      if (extension.getAttribute(ATT_CLASS) != null) {
        try {
          final ModelAnnotator modelAnnotator = (ModelAnnotator) extension.createExecutableExtension(ATT_CLASS);
          ModelAnnotatorRegistry.getInstance().addModelAnnotator(modelAnnotator);
        } catch (Exception e) {
          throw new IllegalStateException(e);
        }
      }
    }
  }
}
