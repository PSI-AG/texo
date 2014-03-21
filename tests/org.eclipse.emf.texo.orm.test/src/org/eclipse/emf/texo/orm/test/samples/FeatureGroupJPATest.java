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
 * $Id: JPATest.java,v 1.8 2011/08/26 14:34:41 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.test.samples;

import java.math.BigInteger;

import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.json.ModelJSONConverter;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.orm.test.JPATest;
import org.eclipse.emf.texo.store.MemoryObjectStore;
import org.eclipse.emf.texo.test.model.samples.jpamixed.JpamixedModelPackage;
import org.eclipse.emf.texo.test.model.samples.jpamixed.LetterBodyType;
import org.eclipse.emf.texo.test.model.samples.jpamixed.LetterBodyTypeMixedFeatureGroup;
import org.eclipse.emf.texo.test.model.samples.jpamixed.SalutationType;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test persistence of a model with feature groups.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */
public class FeatureGroupJPATest extends JPATest {

  public FeatureGroupJPATest() {
    super(JpamixedModelPackage.INSTANCE, "-class-hsqldb");
  }

  @Test
  public void testPersistence() throws Exception {
    final MemoryObjectStore memObjectStore = ComponentProvider.getInstance().newInstance(MemoryObjectStore.class);
    final ModelJSONConverter toJsonConverter = ComponentProvider.getInstance().newInstance(ModelJSONConverter.class);
    toJsonConverter.setObjectResolver(memObjectStore);
    String json1;
    String json2;
    LetterBodyType lb1 = null;
    {
      beginTransaction();
      final LetterBodyType letterBody = JpamixedModelPackage.INSTANCE.getModelFactory().createLetterBodyType();

      for (int i = 0; i < 50; i++) {
        final LetterBodyTypeMixedFeatureGroup group = new LetterBodyTypeMixedFeatureGroup();
        if (i % 15 == 0) {
          group.setCDATA("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        } else if (i % 10 == 0) {
          group.setComment("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        } else if (i % 5 == 0) {
          group.setProductName("productname");
        } else if (i % 3 == 0) {
          final SalutationType salutation = new SalutationType();
          salutation.setName("salutation");
          group.setSalutation(salutation);
        } else {
          group.setQuantity(new BigInteger("123123"));
        }
        letterBody.getMixed().add(group);
      }
      getEntityManager().persist(letterBody);
      commitTransaction();
      clearEntityManager();

      json1 = toJsonConverter.convert(letterBody).toString();
      lb1 = letterBody;
    }
    {
      getEntityManager();
      beginTransaction();
      final LetterBodyType letterBody = (LetterBodyType) getEntityManager().createQuery(
          "select l from jpamixed_LetterBodyType l") //$NON-NLS-1$
          .getSingleResult();
      assertTrue(letterBody != null);
      assertTrue(letterBody != lb1);
      assertTrue(letterBody.getMixed().size() == 50);
      for (int i = 0; i < 50; i++) {
        LetterBodyTypeMixedFeatureGroup fm1 = lb1.getMixed().get(i);
        LetterBodyTypeMixedFeatureGroup fm2 = letterBody.getMixed().get(i);
        if (!ModelResolver.getInstance().isModelEnabled(fm1.getValue())) {
          assertTrue(fm1.getValue().equals(fm2.getValue()));
        }
        assertTrue(fm1.getFeature() == fm2.getFeature());
      }
      json2 = toJsonConverter.convert(letterBody).toString();
      commitTransaction();
    }

    Assert.assertEquals(json1, json2);
  }
}
