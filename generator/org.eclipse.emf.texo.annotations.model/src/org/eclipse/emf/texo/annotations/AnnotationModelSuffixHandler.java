package org.eclipse.emf.texo.annotations;

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
 * $Id: AnnotationModelSuffixHandler.java,v 1.4 2011/08/25 12:33:30 mtaal Exp $
 */

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;

/**
 * Keeps all the allowed suffixes of the annotated models.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class AnnotationModelSuffixHandler {

  private static AnnotationModelSuffixHandler instance = new AnnotationModelSuffixHandler();

  /**
   * Creates an annotationsmodel uri by replacing the file extension in the passed URI and adding the suffix. For
   * example the EPackage URI: /test/library.ecore and with a suffix: 'orm', the result will be
   * '/test/library-orm.annotationsmodel
   * 
   * @param uri
   *          normally the URI of an EPackage
   * @param suffix
   *          the suffix to add (maybe empty or null)
   * @return the URI of an annotation model
   */
  public static URI createAnnotationsModelURIWithSuffix(URI uri, String suffix) {
    final String lastSegment = uri.lastSegment();
    final URI strippedURI = uri.trimSegments(1);
    final int lastDotIndexOf = lastSegment.lastIndexOf(".");

    final String realSuffix = suffix != null && suffix.trim().length() > 0 ? "-" + suffix : "";

    final String newLastSegment;
    if (lastDotIndexOf != -1) {
      newLastSegment = lastSegment.substring(0, lastDotIndexOf) + realSuffix + ".annotationsmodel"; //$NON-NLS-1$
    } else {
      newLastSegment = lastSegment + realSuffix + ".annotationsmodel"; //$NON-NLS-1$
    }
    return strippedURI.appendSegment(newLastSegment);
  }

  public static AnnotationModelSuffixHandler getInstance() {
    return instance;
  }

  public static void setInstance(AnnotationModelSuffixHandler instance) {
    AnnotationModelSuffixHandler.instance = instance;
  }

  private List<String> suffixes = new ArrayList<String>();

  public AnnotationModelSuffixHandler() {
    suffixes.add("");
  }

  public List<String> getSuffixes() {
    return suffixes;
  }
}
