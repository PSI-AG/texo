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

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.texo.generator.BaseTemplate
import org.eclipse.emf.texo.generator.ModelController
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation

class DaoTemplate extends BaseTemplate {

    def void generate(EClassModelGenAnnotation eClassModelGenAnnotation) {
        var EPackageModelGenAnnotation ePackageModelGenAnnotation = eClassModelGenAnnotation.ownerEPackageAnnotation

        if (!ePackageModelGenAnnotation.addRuntimeModelBehavior) {
            return
        }

        if (executeOverrides(eClassModelGenAnnotation)) {
            return
        }

        var fileName = TemplateUtil::daoClassFileName(eClassModelGenAnnotation)
        var content = generateContent(getModelController(), eClassModelGenAnnotation, ePackageModelGenAnnotation)

        addFile(fileName, content)
    }

    override List<String> getTemplateOverrides() {
        var List<String> list = new ArrayList<String>()
        list.add("org::eclipse::emf::texo::modelgenerator::templates::dao")
        list.add("org::eclipse::emf::texo::modelgenerator::xtend::DaoTemplate")
        return list
    }

    def String generateContent(ModelController modelController,
            EClassModelGenAnnotation eClassModelGenAnnotation,
        EPackageModelGenAnnotation ePackageModelGenAnnotation)
        '''
«ePackageModelGenAnnotation.javaFileHeader»
package «ePackageModelGenAnnotation.daoClassesPackagePath»;

/**
 * The Dao implementation for the model object '<em><b>«eClassModelGenAnnotation.name»</b></em>'.
 *
 * @generated
*/
public class «eClassModelGenAnnotation.simpleClassName»«ePackageModelGenAnnotation.daoPatternName.toFirstUpper()» extends «ePackageModelGenAnnotation.daoRootClass»<«eClassModelGenAnnotation.qualifiedClassName»> {

    /**
    * @generated
    */
    @Override
      public Class<«eClassModelGenAnnotation.qualifiedClassName»> getEntityClass() {
          return «eClassModelGenAnnotation.qualifiedClassName».class;
      }

    /**
    * @generated
    */
    @Override
    public org.eclipse.emf.ecore.EClass getEClass() {
        return «ePackageModelGenAnnotation.qualifiedClassName».INSTANCE.get«TemplateUtil::toFirstUpper(eClassModelGenAnnotation.name)»EClass();
    }
}
        '''
}

