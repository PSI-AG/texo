/*******************************************************************************
 * Copyright (c) 2012 Springsite BV (http://www.springsite.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Author - Martin Taal
 *******************************************************************************/

package org.eclipse.emf.texo.modelgenerator.xtend

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.texo.generator.ModelController
import org.eclipse.emf.texo.generator.BaseMainTemplate
import org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage
 
class ModelTemplate extends BaseMainTemplate {
    
    override void generate(EPackage ePackage, ModelController modelController, boolean doDao) {
        var ePackageAnnotation = modelController.getAnnotation(ePackage, ModelcodegeneratorPackage::eNS_URI) as EPackageModelGenAnnotation
        
        for (eClassAnnotation : ePackageAnnotation.EClassModelGenAnnotations) {
            if (eClassAnnotation.EClass.interface) {
                var InterfaceTemplate template = new InterfaceTemplate();
                template.setArtifactGenerator(getArtifactGenerator())
                template.generate(eClassAnnotation);
                addFiles(template.getFiles())
            } else {
                var EntityTemplate template = new EntityTemplate();
                template.setArtifactGenerator(getArtifactGenerator())
                template.generate(eClassAnnotation);
                addFiles(template.getFiles())
            }
            doExecuteXPandTemplate("org::eclipse::emf::texo::modelgenerator::templates::addition", eClassAnnotation)
        }
        
        for (EEnumModelGenAnnotation eEnumAnnotation : ePackageAnnotation.EEnumModelGenAnnotations) {
            var EnumTemplate template = new EnumTemplate();
            template.setArtifactGenerator(getArtifactGenerator())
            template.generate(eEnumAnnotation);
            addFiles(template.getFiles())

            doExecuteXPandTemplate("org::eclipse::emf::texo::modelgenerator::templates::addition", eEnumAnnotation)
        }
        if (ePackageAnnotation.addRuntimeModelBehavior) {
            {
                var ModelPackageTemplate template = new ModelPackageTemplate();
                template.setArtifactGenerator(getArtifactGenerator())
                template.generate(ePackageAnnotation, doDao);
                addFiles(template.getFiles())
            }
            {
                var ModelFactoryTemplate template = new ModelFactoryTemplate();
                template.setArtifactGenerator(getArtifactGenerator())
                template.generate(ePackageAnnotation);
                addFiles(template.getFiles())
            }
            if (ePackageAnnotation.handleEcoreFile) {
                var EcoreFileTemplate template = new EcoreFileTemplate();
                template.setArtifactGenerator(getArtifactGenerator())
                template.generate(ePackageAnnotation);
                addFiles(template.getFiles())
            }
            if (doDao) {
                for (eClassAnnotation : ePackageAnnotation.EClassModelGenAnnotations) {
                    if (eClassAnnotation.daoQualifiedClassName != null) {
                        var DaoTemplate template = new DaoTemplate();
                        template.setArtifactGenerator(getArtifactGenerator())
                        template.generate(eClassAnnotation);
                        addFiles(template.getFiles())
                    }
                }
            }
        }

        doExecuteXPandTemplate("org::eclipse::emf::texo::modelgenerator::templates::addition", ePackageAnnotation)
    }
}