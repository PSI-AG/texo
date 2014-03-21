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
 * $Id: XMLTest.java,v 1.16 2011/08/25 12:42:34 mtaal Exp $
 */

package org.eclipse.emf.texo.test.copycompare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.converter.EMFModelConverter;
import org.eclipse.emf.texo.converter.ObjectComparator;
import org.eclipse.emf.texo.converter.ObjectComparator.ObjectComparatorException;
import org.eclipse.emf.texo.converter.ObjectCopier;
import org.eclipse.emf.texo.datagenerator.DataGeneratorUtils;
import org.eclipse.emf.texo.json.ModelJSONConverter;
import org.eclipse.emf.texo.model.DynamicModelObject;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.store.MemoryObjectStore;
import org.eclipse.emf.texo.test.TestUtils;
import org.junit.Assert;

/**
 * Test copy and compare for an unnamed model package.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.16 $
 */
public class CopyCompareTest extends TestCase {

  private ModelPackage modelPackage;

  public CopyCompareTest(ModelPackage modelPackage) {
    super(modelPackage.getNsURI());
    this.modelPackage = modelPackage;
  }

  @Override
  public void runTest() throws Exception {
    final MemoryObjectStore memObjectStore = ComponentProvider.getInstance().newInstance(MemoryObjectStore.class);

    final List<EObject> eObjects = TestUtils.generateTestSet(1, 3, 3, 10000,
        Collections.singletonList(modelPackage.getEPackage()), getEClasses());
    final EMFModelConverter emfModelConverter = new EMFModelConverter();
    emfModelConverter.setUriResolver(memObjectStore);
    final List<Object> objects = emfModelConverter.convert(eObjects);
    memObjectStore.addData(emfModelConverter.getAllConvertedObjects());

    for (Object m1 : objects) {
      if (m1 instanceof DynamicModelObject) {
        // ignore these for now..
        continue;
      }
      final Object m2 = getObjectCopier().copy(m1);
      Assert.assertTrue(m1 != m2);
      getObjectComparator().compare(m1, m2);
      final Object json1 = getToJsonConverter(memObjectStore).convert(m1);
      final Object json2 = getToJsonConverter(memObjectStore).convert(m2);
      Assert.assertEquals(json1.toString(), json2.toString());

      // now change m2 and do a new compare
      Assert.assertTrue(changeStringEAttribute(m2, new ArrayList<Object>()));
      try {
        getObjectComparator().compare(m1, m2);
        Assert.fail();
      } catch (ObjectComparatorException e) {
        // fine
      }
    }
  }

  private boolean changeStringEAttribute(Object o, List<Object> visited) {
    if (visited.contains(o) || !ModelResolver.getInstance().isModelEnabled(o)) {
      return false;
    }
    visited.add(o);
    final ModelObject<?> m = ModelResolver.getInstance().getModelObject(o);
    for (EAttribute eAttr : m.eClass().getEAllAttributes()) {
      final Object v = m.eGet(eAttr);
      if (v instanceof Long) {
        m.eSet(eAttr, new Long((Long) v + 1));
        return true;
      } else if (v instanceof Integer) {
        m.eSet(eAttr, (Integer) v + 1);
        return true;
      } else if (v instanceof Date) {
        m.eSet(eAttr, new Date());
        return true;
      } else if (v instanceof String) {
        m.eSet(eAttr, v + "test"); //$NON-NLS-1$
        return true;
      } else if (v instanceof Collection<?>) {
        @SuppressWarnings("unchecked")
        final Collection<Object> c = (Collection<Object>) v;
        if (!c.isEmpty()) {
          final Object value = c.iterator().next();
          if (FeatureMapUtil.isFeatureMap(eAttr)) {
            for (Object co : c) {
              ModelFeatureMapEntry<?> fme = ModelResolver.getInstance().getModelFeatureMapEntry(eAttr, co);
              if (fme.getValue() instanceof String) {
                fme.setValue(fme.getValue() + "test"); //$NON-NLS-1$
                return true;
              }
            }
          }
          if (value instanceof Long) {
            c.add(new Long(4));
            return true;
          }
          if (value instanceof Integer) {
            c.add(new Integer(4));
            return true;
          }
          if (value instanceof Date) {
            c.add(new Date());
            return true;
          }
          if (value instanceof String) {
            c.add("test"); //$NON-NLS-1$
            return true;
          }
        }
      }
    }
    for (EReference eReference : m.eClass().getEAllReferences()) {
      final Object v = m.eGet(eReference);
      if (v instanceof Collection<?>) {
        @SuppressWarnings("unchecked")
        final Collection<Object> c = (Collection<Object>) v;
        for (Object oc : c) {
          if (oc instanceof Map.Entry<?, ?>) {
            final Map.Entry<?, ?> entry = (Map.Entry<?, ?>) oc;
            if (changeStringEAttribute(entry.getKey(), visited)) {
              return true;
            }
            if (changeStringEAttribute(entry.getValue(), visited)) {
              return true;
            }
          } else

          if (changeStringEAttribute(oc, visited)) {
            return true;
          }
        }
      } else {
        if (changeStringEAttribute(v, visited)) {
          return true;
        }
      }
    }
    return false;
  }

  private ModelJSONConverter getToJsonConverter(MemoryObjectStore store) {
    final ModelJSONConverter toJsonConverter = ComponentProvider.getInstance().newInstance(ModelJSONConverter.class);
    toJsonConverter.setObjectResolver(store);
    toJsonConverter.setConvertNonContainedReferencedObjects(false);
    toJsonConverter.setMaxChildLevelsToConvert(1);
    toJsonConverter.setPreSortManyValues(true);
    toJsonConverter.setSerializeTitleProperty(false);
    toJsonConverter.setSkipVolatileEFeatures(true);
    return toJsonConverter;
  }

  private ObjectCopier getObjectCopier() {
    final ObjectCopier objectCopier = ComponentProvider.getInstance().newInstance(ObjectCopier.class);
    objectCopier.setCopyChildren(true);
    objectCopier.setCopyReferences(true);
    return objectCopier;
  }

  private ObjectComparator getObjectComparator() {
    final ObjectComparator objectComparator = ComponentProvider.getInstance().newInstance(ObjectComparator.class);
    return objectComparator;
  }

  public List<EClass> getEClasses() {
    return DataGeneratorUtils.getRootEClasses(Collections.singletonList(modelPackage.getEPackage()));
  }
}
