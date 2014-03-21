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
 * $Id: ORMGeneratorTest.java,v 1.7 2011/09/24 09:07:25 mtaal Exp $
 */

package org.eclipse.emf.texo.orm.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.texo.generator.EclipseGeneratorUtils;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.annotator.GenUtils;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;
import org.eclipse.emf.texo.modelgenerator.test.models.TestModel;
import org.eclipse.emf.texo.orm.annotator.ORMGenerator;
import org.eclipse.emf.texo.orm.annotator.ORMMappingOptions;

/**
 * Generates the ORM for specified models. The generated orm files are stored in the src/META-INF folder.
 * 
 * @see TestModel
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class ORMGeneratorTest extends TestCase {

  private static final String TEST_ORM_PROJECT = "org.eclipse.emf.texo.orm.test"; //$NON-NLS-1$
  private static final String TEST_MODEL_PROJECT = "org.eclipse.emf.texo.test.model"; //$NON-NLS-1$
  private static final String MODELGENERATOR_TEST_PROJECT = "org.eclipse.emf.texo.modelgenerator.test"; //$NON-NLS-1$

  private static final String SRC_GEN = "src-test-gen"; //$NON-NLS-1$
  private static final String SRC = "src"; //$NON-NLS-1$
  private static final String META_INF = "META-INF"; //$NON-NLS-1$
  private static final String MAPPING_FILES = "mapping-files"; //$NON-NLS-1$
  private static final String ORM_SUFFIX = "-orm.xml"; //$NON-NLS-1$
  private static final String PERSISTENCE_SUFFIX = "-persistence.xml"; //$NON-NLS-1$
  private static final String PERSISTENCE_XML_TEMPLATE = "template-persistence.xml"; //$NON-NLS-1$
  private static final String PERSISTENCE_UNIT_PARAM = "{persistenceUnitName}"; //$NON-NLS-1$
  private static final String MAPPING_FILE_PARAM = "{mappingFile}"; //$NON-NLS-1$
  private static final String DBNAME_PARAM = "{dbname}"; //$NON-NLS-1$
  private static final String CLASS_PARAM = "{class}"; //$NON-NLS-1$

  private static final EPackage.Registry SHARED_REGISTRY = GeneratorUtils.createEPackageRegistry();
  private ORMMappingOptions testORMOptions = new ORMMappingOptions();

  public void testGenerateModels() throws Exception {
    // needed refresh/build the project so that the xcore files get resolved correctly
    final IProject project = EclipseGeneratorUtils.getProject(MODELGENERATOR_TEST_PROJECT);
    project.getWorkspace().getRoot().refreshLocal(100, null);
    project.build(IncrementalProjectBuilder.FULL_BUILD, null);

    // generate all the db names for the orms
    testORMOptions.setAddOrderColumnToListMappings(true);
    testORMOptions.setRenameSQLReservedNames(true);
    testORMOptions.setEnforceUniqueNames(true);
    testORMOptions.setGenerateFullDbSchemaNames(true);
    testORMOptions.setMaximumSqlNameLength(64);
    testORMOptions.setTestRun(true);
    ORMMappingOptions.setDefaultOptions(testORMOptions);

    final IProject modelTestProject = EclipseGeneratorUtils.getProject(TEST_MODEL_PROJECT);
    final IPath projectPath = modelTestProject.getLocation();
    final File modelTestProjectDir = projectPath.toFile();

    final IProject ormTestProject = EclipseGeneratorUtils.getProject(TEST_ORM_PROJECT);
    final File ormTestProjectDir = new File(ormTestProject.getRawLocation().toOSString());

    final File ormSrcDir = new File(ormTestProjectDir, SRC);
    final File modelSrcGenDir = new File(modelTestProjectDir, SRC_GEN);
    final File ormMetaInfDir = new File(ormSrcDir, META_INF);
    final File modelMetaInfDir = new File(modelSrcGenDir, META_INF);
    if (!modelMetaInfDir.exists()) {
      modelMetaInfDir.mkdir();
    }
    final File targetMappingFileDir = new File(modelMetaInfDir, MAPPING_FILES);

    for (String modelFile : getModelFileRelativePaths()) {
      System.err.println("Generating orm for " + modelFile); //$NON-NLS-1$
      generate(modelFile, ormMetaInfDir, modelMetaInfDir, targetMappingFileDir);
    }
  }

  protected boolean useSharedEPackageRegistry() {
    return false;
  }

  private void generate(String modelFilePath, File ormMetaInfDir, File modelMetaInfDir, File targetMappingFileDir) {
    try {
      final File mappingFileDir = new File(targetMappingFileDir, modelFilePath).getParentFile();

      final java.net.URI modelUri = TestModel.getModelPlatformUri(modelFilePath);

      final EPackage.Registry registry = useSharedEPackageRegistry() ? SHARED_REGISTRY : GeneratorUtils
          .createEPackageRegistry();
      final ResourceSet resourceSet = GeneratorUtils.createGenerationResourceSet(registry);

      // read the deps
      final List<String> deps = TestModel.getModelDependencies(modelFilePath);
      if (deps.size() > 0) {
        final List<java.net.URI> depUris = new ArrayList<java.net.URI>();
        for (String dep : deps) {
          depUris.add(TestModel.getModelPlatformUri(dep));
        }
        // register all the dependent epackages also using the resource uri, this is needed in case of xcore
        // which resolves using resource uris
        final List<EPackage> depEPackages = GeneratorUtils.readEPackages(depUris, resourceSet, registry, false);
        for (EPackage depEPackage : depEPackages) {
          if (depEPackage.eResource() != null && depEPackage.eResource().getURI() != null) {
            registry.put(depEPackage.eResource().getURI().toString(), depEPackage);
          }
        }
      }

      final List<EPackage> ePackages = GeneratorUtils.readEPackages(Collections.singletonList(modelUri), resourceSet,
          registry, false);

      // create the uri to store the mapping file
      final String ormFileName = ePackages.get(0).getName() + ORM_SUFFIX;
      final File ormFile = new File(mappingFileDir, ormFileName);
      if (ormFile.exists()) {
        ormFile.delete();
      }
      if (!ormFile.getParentFile().exists()) {
        ormFile.getParentFile().mkdirs();
      }

      final URI uri = URI.createFileURI(ormFile.getAbsolutePath());
      final ORMGenerator ormGenerator = new ORMGenerator();
      final ModelController modelController = ormGenerator.generateStoreORM(ePackages, uri);

      // store for each eclass the java class name
      final List<String> clzNames = collectClassNames(modelController, ePackages);
      // generate the persistence xml
      generatePersistenceXML(ormMetaInfDir, modelMetaInfDir, ormFile, ePackages.get(0).getName(), clzNames);
    } catch (final Exception e) {
      throw new IllegalStateException(e);
    }
  }

  private void generatePersistenceXML(File ormMetaInfDir, File modelMetaInfDir, File mappingFile, String ePackageName,
      List<String> classNames) throws IOException {
    final File persistenceXMLFile = new File(modelMetaInfDir, ePackageName + PERSISTENCE_SUFFIX);
    if (persistenceXMLFile.exists()) {
      persistenceXMLFile.delete();
    }

    String persistenceXMLTemplate = readFileAsString(new File(ormMetaInfDir, PERSISTENCE_XML_TEMPLATE)
        .getAbsolutePath());

    persistenceXMLTemplate = persistenceXMLTemplate.replace(PERSISTENCE_UNIT_PARAM, ePackageName);

    final String mappingFileLocation = mappingFile.getAbsolutePath();
    // strip the first part
    final String relativeMappingFileLocation = mappingFileLocation.substring(mappingFileLocation.indexOf(META_INF));
    persistenceXMLTemplate = persistenceXMLTemplate.replace(MAPPING_FILE_PARAM, relativeMappingFileLocation);
    persistenceXMLTemplate = persistenceXMLTemplate.replace(DBNAME_PARAM, ePackageName);

    final StringBuilder sb = new StringBuilder();
    for (String clzName : classNames) {
      sb.append("\t\t<class>" + clzName + "</class>\n");
    }
    persistenceXMLTemplate = persistenceXMLTemplate.replace(CLASS_PARAM, sb.toString());
    final FileWriter fileWriter = new FileWriter(persistenceXMLFile);
    fileWriter.write(persistenceXMLTemplate);
    fileWriter.close();
  }

  private List<String> collectClassNames(ModelController modelController, List<EPackage> ePackages) {
    final List<String> result = new ArrayList<String>();
    for (EPackage ePackage : ePackages) {
      for (EClassifier eClassifier : ePackage.getEClassifiers()) {
        if (eClassifier instanceof EClass) {
          final EClass eClass = (EClass) eClassifier;

          if (eClass.isInterface()) {
            continue;
          }
          if (GenUtils.isDocumentRoot(eClass)) {
            continue;
          }

          EClassModelGenAnnotation eClassAnnotation = (EClassModelGenAnnotation) modelController.getAnnotation(eClass,
              ModelcodegeneratorPackage.eNS_URI);
          result.add(eClassAnnotation.getQualifiedClassName());
          for (EStructuralFeature eFeature : eClass.getEAllStructuralFeatures()) {
            EStructuralFeatureModelGenAnnotation eFeatureAnnotation = (EStructuralFeatureModelGenAnnotation) modelController
                .getAnnotation(eFeature, ModelcodegeneratorPackage.eNS_URI);
            if (eFeatureAnnotation.getFeatureMapQualifiedClassName() != null) {
              result.add(eFeatureAnnotation.getFeatureMapQualifiedClassName());
            }
          }
        }
      }
    }
    return result;
  }

  private static String readFileAsString(String filePath) throws java.io.IOException {
    StringBuffer fileData = new StringBuffer(1000);
    BufferedReader reader = new BufferedReader(new FileReader(filePath));
    char[] buf = new char[1024];
    int numRead = 0;
    while ((numRead = reader.read(buf)) != -1) {
      String readData = String.valueOf(buf, 0, numRead);
      fileData.append(readData);
      buf = new char[1024];
    }
    reader.close();
    return fileData.toString();
  }

  protected List<String> getModelFileRelativePaths() {
    return TestModel.getAllSpecifiedModelRelativePaths();
  }
}