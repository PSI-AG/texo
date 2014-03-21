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
 * $Id: EclipseGenerateEcorePackageModel.java,v 1.6 2011/09/21 14:33:40 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.generator.ArtifactGenerator;
import org.eclipse.emf.texo.generator.ModelAnnotator;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.xtend.ModelTemplate;

/**
 * Test the generation of model code for the ecore model itself.
 * 
 * Note: the resulting code gives compile errors because the ecore package itself does not work because you get clashes
 * between generated objects and references to the runtime model.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public class EclipseGenerateEcorePackageModel extends TestCase {

  public void testGenerateEcoreModel() throws Exception {
    final List<EPackage> ePackages = new ArrayList<EPackage>();
    ePackages.add(EcorePackage.eINSTANCE);
    ePackages.add(XMLTypePackage.eINSTANCE);

    final ModelController modelController = new ModelController();
    modelController.setEPackages(ePackages);
    modelController.annotate(new ArrayList<ModelAnnotator>());

    final ArtifactGenerator artifactGenerator = new ArtifactGenerator();
    artifactGenerator.setModelController(modelController);
    artifactGenerator.setProjectName("org.eclipse.emf.texo.test.model"); //$NON-NLS-1$
    artifactGenerator.setOutputFolder("src-test-gen"); //$NON-NLS-1$
    artifactGenerator.setDoDao(true);
    artifactGenerator.setXTendTemplate(new ModelTemplate());
    artifactGenerator.run();
  }
}