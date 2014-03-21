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
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation
 
class EcoreFileTemplate extends BaseTemplate {

    def void generate(EPackageModelGenAnnotation ePackageModelGenAnnotation) {

        if (executeOverrides(ePackageModelGenAnnotation)) {
            return
        }
        
        var fileName = TemplateUtil::ecoreFileName(ePackageModelGenAnnotation)
        var content = ePackageModelGenAnnotation.ecoreFileContent
        
        addFile(fileName, content)        
    }
    
    override List<String> getTemplateOverrides() {
        var List<String> list = new ArrayList<String>()
        list.add("org::eclipse::emf::texo::modelgenerator::templates::ecorefile")
        list.add("org::eclipse::emf::texo::modelgenerator::xtend::EcoreFileTemplate")
        return list
    }
}
