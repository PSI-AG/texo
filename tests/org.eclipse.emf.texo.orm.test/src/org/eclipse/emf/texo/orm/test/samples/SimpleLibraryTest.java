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
 * $Id: SimpleTest.java,v 1.5 2011/09/02 07:12:37 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.test.samples;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import org.eclipse.emf.texo.modelgenerator.test.models.TestModel;
import org.eclipse.emf.texo.orm.test.JPATest;
import org.eclipse.emf.texo.test.model.samples.library.Writer;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.junit.Assert;

/**
 * Tests persistence of library testcase
 * 
 * @see TestModel
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class SimpleLibraryTest extends JPATest {
  public SimpleLibraryTest() {
    super(LibraryModelPackage.INSTANCE, "-hsqldb");
  }

  public void testPersist() {
    {
      beginTransaction();
      final Writer writer = LibraryModelPackage.INSTANCE.getModelFactory().createWriter();
      writer.setName("test"); //$NON-NLS-1$
      getEntityManager().persist(writer);
      commitTransaction();
    }

    {
      beginTransaction();
      final Writer writer = (Writer) getEntityManager()
          .createQuery("select w from library_Writer w where w.name = :name").setParameter("name", "test") //$NON-NLS-3$  //$NON-NLS-2$  //$NON-NLS-1$
          .getSingleResult();
      assertTrue(writer != null);
      commitTransaction();
    }

    // do a count using the criteriabuilder
    {
      beginTransaction();

      // do a select
      {
        final CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();

        final CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
        final Root<Writer> from = criteriaQuery.from(Writer.class);
        final CriteriaQuery<Object> select = criteriaQuery.select(from);

        final TypedQuery<Object> typedQuery = getEntityManager().createQuery(select);

        final List<Object> resultList = typedQuery.getResultList();

        Assert.assertEquals(1, resultList.size());
      }

      // and do the count
      {
        final CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();

        final CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();

        final Root<Writer> from = criteriaQuery.from(Writer.class);
        final Expression<Long> countExpression = criteriaBuilder.countDistinct(from);
        final CriteriaQuery<Object> select = criteriaQuery.select(countExpression);

        final TypedQuery<Object> typedQuery = getEntityManager().createQuery(select);
        final Long cnt = (Long) typedQuery.getSingleResult();

        Assert.assertEquals(new Long(1), cnt);
      }

      commitTransaction();
    }
  }
}
