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
 * $Id: TestDirectJavaAnnotations.java,v 1.4 2011/08/25 12:42:19 mtaal Exp $
 */

package org.eclipse.emf.texo.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import junit.framework.TestCase;

import org.eclipse.emf.texo.test.model.samples.library.Book;
import org.eclipse.emf.texo.test.model.samples.library.BookCategory;
import org.eclipse.emf.texo.test.model.samples.library.Writer;
import org.eclipse.emf.texo.test.models.annotations.TestAnnotationOne;
import org.eclipse.emf.texo.test.models.annotations.TestAnnotationTwo;

/**
 * Tests that java annotations in the model are directly copied to the output.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */

public class TestDirectJavaAnnotations extends TestCase {

  public void testAnnotationsPresent() throws Exception {
    final TestAnnotationOne enumAnnotation = BookCategory.class.getAnnotation(TestAnnotationOne.class);
    assertNotNull(enumAnnotation);
    assertEquals("enum", enumAnnotation.value()); //$NON-NLS-1$

    final TestAnnotationOne bookAnnotation = Book.class.getAnnotation(TestAnnotationOne.class);
    assertNotNull(bookAnnotation);
    assertEquals("test", bookAnnotation.value()); //$NON-NLS-1$

    final TestAnnotationOne writerAnnotation = Writer.class.getAnnotation(TestAnnotationOne.class);
    assertNotNull(writerAnnotation);
    assertEquals("type", writerAnnotation.value()); //$NON-NLS-1$

    final Method method = Book.class.getMethod("getPages");//$NON-NLS-1$
    final TestAnnotationOne getterAnnotation = method.getAnnotation(TestAnnotationOne.class);
    assertEquals("getter", getterAnnotation.value()); //$NON-NLS-1$

    final Field field = Book.class.getDeclaredField("title"); //$NON-NLS-1$
    final TestAnnotationOne fieldAnnotationOne = field.getAnnotation(TestAnnotationOne.class);
    assertEquals("field", fieldAnnotationOne.value()); //$NON-NLS-1$
    final TestAnnotationTwo fieldAnnotationTwo = field.getAnnotation(TestAnnotationTwo.class);
    assertEquals("field", fieldAnnotationTwo.value()); //$NON-NLS-1$

    final Method setter = Book.class.getMethod("setAuthor", Writer.class);//$NON-NLS-1$
    final TestAnnotationOne setterAnnotation = setter.getAnnotation(TestAnnotationOne.class);
    assertEquals("setter", setterAnnotation.value()); //$NON-NLS-1$
  }
}