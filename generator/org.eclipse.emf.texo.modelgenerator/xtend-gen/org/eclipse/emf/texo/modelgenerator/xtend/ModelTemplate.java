/**
 * Copyright (c) 2012 Springsite BV (http://www.springsite.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Author - Martin Taal
 */
package org.eclipse.emf.texo.modelgenerator.xtend;

import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation;
import org.eclipse.emf.texo.generator.ArtifactGenerator;
import org.eclipse.emf.texo.generator.BaseMainTemplate;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;
import org.eclipse.emf.texo.modelgenerator.xtend.DaoTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.EcoreFileTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.EntityTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.EnumTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.InterfaceTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.ModelFactoryTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.ModelPackageTemplate;

@SuppressWarnings("all")
public class ModelTemplate extends BaseMainTemplate {
  public void generate(final EPackage ePackage, final ModelController modelController, final boolean doDao) {
    ENamedElementAnnotation _annotation = modelController.getAnnotation(ePackage, ModelcodegeneratorPackage.eNS_URI);
    EPackageModelGenAnnotation ePackageAnnotation = ((EPackageModelGenAnnotation) _annotation);
    EList<EClassModelGenAnnotation> _eClassModelGenAnnotations = ePackageAnnotation.getEClassModelGenAnnotations();
    for (final EClassModelGenAnnotation eClassAnnotation : _eClassModelGenAnnotations) {
      {
        EClass _eClass = eClassAnnotation.getEClass();
        boolean _isInterface = _eClass.isInterface();
        if (_isInterface) {
          InterfaceTemplate _interfaceTemplate = new InterfaceTemplate();
          InterfaceTemplate template = _interfaceTemplate;
          ArtifactGenerator _artifactGenerator = this.getArtifactGenerator();
          template.setArtifactGenerator(_artifactGenerator);
          template.generate(eClassAnnotation);
          Map<String,String> _files = template.getFiles();
          this.addFiles(_files);
        } else {
          EntityTemplate _entityTemplate = new EntityTemplate();
          EntityTemplate template_1 = _entityTemplate;
          ArtifactGenerator _artifactGenerator_1 = this.getArtifactGenerator();
          template_1.setArtifactGenerator(_artifactGenerator_1);
          template_1.generate(eClassAnnotation);
          Map<String,String> _files_1 = template_1.getFiles();
          this.addFiles(_files_1);
        }
        this.doExecuteXPandTemplate("org::eclipse::emf::texo::modelgenerator::templates::addition", eClassAnnotation);
      }
    }
    EList<EEnumModelGenAnnotation> _eEnumModelGenAnnotations = ePackageAnnotation.getEEnumModelGenAnnotations();
    for (final EEnumModelGenAnnotation eEnumAnnotation : _eEnumModelGenAnnotations) {
      {
        EnumTemplate _enumTemplate = new EnumTemplate();
        EnumTemplate template = _enumTemplate;
        ArtifactGenerator _artifactGenerator = this.getArtifactGenerator();
        template.setArtifactGenerator(_artifactGenerator);
        template.generate(eEnumAnnotation);
        Map<String,String> _files = template.getFiles();
        this.addFiles(_files);
        this.doExecuteXPandTemplate("org::eclipse::emf::texo::modelgenerator::templates::addition", eEnumAnnotation);
      }
    }
    boolean _isAddRuntimeModelBehavior = ePackageAnnotation.isAddRuntimeModelBehavior();
    if (_isAddRuntimeModelBehavior) {
      {
        ModelPackageTemplate _modelPackageTemplate = new ModelPackageTemplate();
        ModelPackageTemplate template = _modelPackageTemplate;
        ArtifactGenerator _artifactGenerator = this.getArtifactGenerator();
        template.setArtifactGenerator(_artifactGenerator);
        template.generate(ePackageAnnotation, doDao);
        Map<String,String> _files = template.getFiles();
        this.addFiles(_files);
      }
      {
        ModelFactoryTemplate _modelFactoryTemplate = new ModelFactoryTemplate();
        ModelFactoryTemplate template = _modelFactoryTemplate;
        ArtifactGenerator _artifactGenerator = this.getArtifactGenerator();
        template.setArtifactGenerator(_artifactGenerator);
        template.generate(ePackageAnnotation);
        Map<String,String> _files = template.getFiles();
        this.addFiles(_files);
      }
      boolean _isHandleEcoreFile = ePackageAnnotation.isHandleEcoreFile();
      if (_isHandleEcoreFile) {
        EcoreFileTemplate _ecoreFileTemplate = new EcoreFileTemplate();
        EcoreFileTemplate template = _ecoreFileTemplate;
        ArtifactGenerator _artifactGenerator = this.getArtifactGenerator();
        template.setArtifactGenerator(_artifactGenerator);
        template.generate(ePackageAnnotation);
        Map<String,String> _files = template.getFiles();
        this.addFiles(_files);
      }
      if (doDao) {
        EList<EClassModelGenAnnotation> _eClassModelGenAnnotations_1 = ePackageAnnotation.getEClassModelGenAnnotations();
        for (final EClassModelGenAnnotation eClassAnnotation_1 : _eClassModelGenAnnotations_1) {
          String _daoQualifiedClassName = eClassAnnotation_1.getDaoQualifiedClassName();
          boolean _notEquals = (!Objects.equal(_daoQualifiedClassName, null));
          if (_notEquals) {
            DaoTemplate _daoTemplate = new DaoTemplate();
            DaoTemplate template_1 = _daoTemplate;
            ArtifactGenerator _artifactGenerator_1 = this.getArtifactGenerator();
            template_1.setArtifactGenerator(_artifactGenerator_1);
            template_1.generate(eClassAnnotation_1);
            Map<String,String> _files_1 = template_1.getFiles();
            this.addFiles(_files_1);
          }
        }
      }
    }
    this.doExecuteXPandTemplate("org::eclipse::emf::texo::modelgenerator::templates::addition", ePackageAnnotation);
  }
}
