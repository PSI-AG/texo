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
 * $Id: TestUtils.java,v 1.2 2011/08/25 12:42:19 mtaal Exp $
 */

package org.eclipse.emf.texo.test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.texo.converter.ModelEMFConverter;
import org.eclipse.emf.texo.datagenerator.ModelDataGenerator;
import org.eclipse.emf.texo.xml.ModelXMLLoader;
import org.eclipse.emf.texo.xml.ModelXMLSaver;
import org.junit.Assert;

/**
 * Utility methods for testcases.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class TestUtils {

  /**
   * Convert the objects to a XML/XMI String (depending on doXMI).
   * 
   * @param objects
   *          the objects to convert to XML/XMI
   * @param doXMI
   *          xmi or xml
   * @return the xmi/xml string
   */
  public static String writeXML(final List<Object> objects, boolean doXMI) {
    final ModelXMLSaver xmlSaver = new ModelXMLSaver();
    xmlSaver.setSaveAsXMI(doXMI);
    xmlSaver.setObjects(objects);
    final StringWriter sw = new StringWriter();
    xmlSaver.setWriter(sw);
    xmlSaver.write();
    return sw.toString();
  }

  /**
   * Read a set of objects from a xml/xmi string.
   * 
   * @param xml
   *          the xml/xmi content
   * @param doXMI
   *          read as xmi or xml
   * @return the read objects
   */
  public static List<Object> readXML(final String xml, boolean doXMI) {
    final ModelXMLLoader xmlLoader = new ModelXMLLoader();
    xmlLoader.setLoadAsXMI(doXMI);
    xmlLoader.setReader(new StringReader(xml));
    return xmlLoader.read();
  }

  /**
   * Generate a testset.
   * 
   * @See {@link ModelDataGenerator}
   */
  public static List<EObject> generateTestSet(final int dataSize, final int collectionSize, final int maxDepth,
      final int maxObjects, List<EPackage> ePackages, List<EClass> eClasses) {
    final ModelDataGenerator generator = generateTestSetModelGenerator(dataSize, collectionSize, maxDepth, maxObjects,
        ePackages, eClasses);
    return generator.getResult();
  }

  public static ModelDataGenerator generateTestSetModelGenerator(final int dataSize, final int collectionSize,
      final int maxDepth, final int maxObjects, List<EPackage> ePackages, List<EClass> eClasses) {
    final ModelDataGenerator modelDataGenerator = new ModelDataGenerator();
    modelDataGenerator.setStartEClasses(eClasses);
    modelDataGenerator.setMaxDepth(maxDepth);
    modelDataGenerator.setCollectionSize(collectionSize);
    modelDataGenerator.setDataSize(dataSize);
    modelDataGenerator.setMaxObjects(maxObjects);
    modelDataGenerator.setEPackages(ePackages);
    modelDataGenerator.generateTestData();
    System.err.println(modelDataGenerator.getTotalObjectCount());
    return modelDataGenerator;
  }

  /**
   * Compare a set of objects using EMF Compare.
   */
  public static void compareObjects(final List<Object> objects1, final List<Object> objects2) {
    final ModelEMFConverter modelEMFConverter = new ModelEMFConverter();
    final List<EObject> eObjects1 = modelEMFConverter.convert(objects1);
    final ModelEMFConverter modelEMFConverter2 = new ModelEMFConverter();
    final List<EObject> eObjects2 = modelEMFConverter2.convert(objects2);

    // compare sizes, should be all > 0 and the same!
    Assert.assertFalse(objects1.isEmpty());
    Assert.assertEquals(objects1.size(), objects2.size());
    Assert.assertEquals(objects1.size(), eObjects1.size());
    Assert.assertEquals(eObjects1.size(), eObjects2.size());
    // the objects should be different instances
    for (int i = 0; i < objects1.size(); i++) {
      Assert.assertTrue(objects1.get(i) != objects2.get(i));
    }

    compareEObjects(eObjects1, eObjects2);
  }

  /**
   * Compare a set of EObjects using EMF Compare.
   */
  public static void compareEObjects(final List<EObject> eObjects1, final List<EObject> eObjects2) {
    // note it is necessary to put the resources in a resourceset
    // cause EMF uses the resourceset to compute id's etc.
    final ResourceSet resourceSet = new ResourceSetImpl();
    final Resource resource1 = new XMLResourceImpl(URI.createURI("resource1.xml")); //$NON-NLS-1$
    final Resource resource2 = new XMLResourceImpl(URI.createURI("resource2.xml")); //$NON-NLS-1$
    resourceSet.getResources().add(resource1);
    resourceSet.getResources().add(resource2);
    resource1.getContents().addAll(eObjects1);
    resource2.getContents().addAll(eObjects2);

    final IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
    final IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
    final IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
    matchEngineFactory.setRanking(20);
    IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
    matchEngineRegistry.add(matchEngineFactory);
    final EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();

    // Compare the two models
    final IComparisonScope scope = EMFCompare.createDefaultScope(resource1, resource2);
    final Comparison comparison = comparator.compare(scope);
    final EList<Diff> differences = comparison.getDifferences();
    final StringBuilder sb = new StringBuilder();
    for (Diff diff : differences) {
      sb.append(diff.toString() + "\n"); //$NON-NLS-1$
    }
    Assert.assertTrue(sb.toString(), differences.isEmpty());
  }

}