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
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.generator.ArtifactGenerator;
import org.eclipse.emf.texo.generator.BaseTemplate;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.xtend.ModelFeatureMapTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.ModelObjectTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.TemplateUtil;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ModelFactoryTemplate extends BaseTemplate {
  public void generate(final EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    boolean _executeOverrides = this.executeOverrides(ePackageModelGenAnnotation);
    if (_executeOverrides) {
      return;
    }
    String fileName = TemplateUtil.modelFactoryFileName(ePackageModelGenAnnotation);
    ModelController _modelController = this.getModelController();
    String content = this.generateContent(_modelController, ePackageModelGenAnnotation);
    ModelController _modelController_1 = this.getModelController();
    String _generateModelObjects = this.generateModelObjects(_modelController_1, ePackageModelGenAnnotation);
    String _plus = (content + _generateModelObjects);
    content = _plus;
    ModelController _modelController_2 = this.getModelController();
    String _generateFeatureMaps = this.generateFeatureMaps(_modelController_2, ePackageModelGenAnnotation);
    String _plus_1 = (content + _generateFeatureMaps);
    content = _plus_1;
    content = (content + "}");
    this.addFile(fileName, content);
  }
  
  public List<String> getTemplateOverrides() {
    ArrayList<String> _arrayList = new ArrayList<String>();
    List<String> list = _arrayList;
    list.add("org::eclipse::emf::texo::modelgenerator::templates::modelfactory");
    list.add("org::eclipse::emf::texo::modelgenerator::xtend::ModelFactoryTemplate");
    return list;
  }
  
  public String generateContent(final ModelController modelController, final EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    StringConcatenation _builder = new StringConcatenation();
    String _javaFileHeader = ePackageModelGenAnnotation.getJavaFileHeader();
    _builder.append(_javaFileHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _modelClassesPackagePath = ePackageModelGenAnnotation.getModelClassesPackagePath();
    _builder.append(_modelClassesPackagePath, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* The <b>{@link org.eclipse.emf.texo.model.ModelFactory}</b> for the types of this model: ");
    EPackage _ePackage = ePackageModelGenAnnotation.getEPackage();
    String _name = _ePackage.getName();
    _builder.append(_name, " ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* It contains code to create instances {@link org.eclipse.emf.texo.model.ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML) representation.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    {
      String _documentation = ePackageModelGenAnnotation.getDocumentation();
      boolean _notEquals = (!Objects.equal(_documentation, null));
      if (_notEquals) {
        _builder.append("* <!-- begin-model-doc -->");
        _builder.newLine();
        _builder.append("* ");
        String _documentation_1 = ePackageModelGenAnnotation.getDocumentation();
        _builder.append(_documentation_1, "");
        _builder.newLineIfNotEmpty();
        _builder.append("* <!-- end-model-doc -->");
        _builder.newLine();
      }
    }
    _builder.append(" ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    String _simpleModelFactoryClassName = ePackageModelGenAnnotation.getSimpleModelFactoryClassName();
    _builder.append(_simpleModelFactoryClassName, "");
    _builder.append(" implements org.eclipse.emf.texo.model.ModelFactory {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Creates an instance for an {@link org.eclipse.emf.ecore.EClass}");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param eClass creates a Object instance for this EClass");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @return an object representing the eClass");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Object create(org.eclipse.emf.ecore.EClass eClass) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("switch (eClass.getClassifierID()) {");
    _builder.newLine();
    {
      EList<EClassModelGenAnnotation> _eClassModelGenAnnotations = ePackageModelGenAnnotation.getEClassModelGenAnnotations();
      for(final EClassModelGenAnnotation eClassAnnotation : _eClassModelGenAnnotations) {
        {
          boolean _and = false;
          boolean _and_1 = false;
          EClass _eClass = eClassAnnotation.getEClass();
          boolean _isAbstract = _eClass.isAbstract();
          boolean _not = (!_isAbstract);
          if (!_not) {
            _and_1 = false;
          } else {
            EClass _eClass_1 = eClassAnnotation.getEClass();
            boolean _isInterface = _eClass_1.isInterface();
            boolean _not_1 = (!_isInterface);
            _and_1 = (_not && _not_1);
          }
          if (!_and_1) {
            _and = false;
          } else {
            boolean _isGenerateCode = eClassAnnotation.isGenerateCode();
            _and = (_and_1 && _isGenerateCode);
          }
          if (_and) {
            _builder.append("    ");
            _builder.append("case ");
            String _qualifiedClassName = ePackageModelGenAnnotation.getQualifiedClassName();
            _builder.append(_qualifiedClassName, "    ");
            _builder.append(".");
            String _name_1 = eClassAnnotation.getName();
            String _upperCase = TemplateUtil.toUpperCase(_name_1);
            _builder.append(_upperCase, "    ");
            _builder.append("_CLASSIFIER_ID:");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("return create");
            String _name_2 = eClassAnnotation.getName();
            String _firstUpper = TemplateUtil.toFirstUpper(_name_2);
            _builder.append(_firstUpper, "        ");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("            ");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("throw new IllegalArgumentException(\"The EClass \'\" + eClass.getName() + \"\' is not a valid EClass for this EPackage\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Wraps an object in a {@link ModelObject}.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param eClass");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*            the EClass of the object");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param adaptee");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*            the object being wrapped/adapted");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @return the wrapper {@link ModelObject}");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@SuppressWarnings( { \"unchecked\", \"rawtypes\" })");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ModelObject createModelObject(org.eclipse.emf.ecore.EClass eClass, Object adaptee) {");
    _builder.newLine();
    {
      EList<EClassModelGenAnnotation> _eClassModelGenAnnotations_1 = ePackageModelGenAnnotation.getEClassModelGenAnnotations();
      boolean _isEmpty = _eClassModelGenAnnotations_1.isEmpty();
      boolean _not_2 = (!_isEmpty);
      if (_not_2) {
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("ModelObject<Object> modelObject = null;");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("switch (eClass.getClassifierID()) {");
        _builder.newLine();
        {
          EList<EClassModelGenAnnotation> _eClassModelGenAnnotations_2 = ePackageModelGenAnnotation.getEClassModelGenAnnotations();
          for(final EClassModelGenAnnotation eClassAnnotation_1 : _eClassModelGenAnnotations_2) {
            {
              boolean _isGenerateCode_1 = eClassAnnotation_1.isGenerateCode();
              if (_isGenerateCode_1) {
                _builder.append("    ");
                _builder.append("case ");
                String _qualifiedClassName_1 = ePackageModelGenAnnotation.getQualifiedClassName();
                _builder.append(_qualifiedClassName_1, "    ");
                _builder.append(".");
                String _name_3 = eClassAnnotation_1.getName();
                String _upperCase_1 = TemplateUtil.toUpperCase(_name_3);
                _builder.append(_upperCase_1, "    ");
                _builder.append("_CLASSIFIER_ID:");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("modelObject = new ");
                String _simpleClassName = eClassAnnotation_1.getSimpleClassName();
                _builder.append(_simpleClassName, "        ");
                _builder.append("ModelObject();");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("break;");
                _builder.newLine();
              }
            }
          }
        }
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("default:");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("            ");
        _builder.append("throw new IllegalArgumentException(\"The EClass \'\" + eClass + \"\' is not defined in this EPackage\");");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("modelObject.setTarget(adaptee);");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return modelObject;");
        _builder.newLine();
      } else {
        _builder.append("    ");
        _builder.append("throw new IllegalArgumentException(\"The EClass \'\" + eClass + \"\' is not defined in this EPackage\");");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Creates a feature map entry instance for a certain EStructuralFeature.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param eFeature");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*          the feature map feature");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @return the pojo feature map entry");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Object createFeatureMapEntry(org.eclipse.emf.ecore.EStructuralFeature eFeature) {");
    _builder.newLine();
    {
      EList<EClassModelGenAnnotation> _eClassModelGenAnnotations_3 = ePackageModelGenAnnotation.getEClassModelGenAnnotations();
      for(final EClassModelGenAnnotation eClassAnnotation_2 : _eClassModelGenAnnotations_3) {
        {
          EList<EStructuralFeatureModelGenAnnotation> _featureMapFeatures = eClassAnnotation_2.getFeatureMapFeatures();
          for(final EStructuralFeatureModelGenAnnotation featureAnnotation : _featureMapFeatures) {
            {
              boolean _isGenerateCode_2 = featureAnnotation.isGenerateCode();
              if (_isGenerateCode_2) {
                _builder.append("if (eFeature == ");
                String _qualifiedClassName_2 = ePackageModelGenAnnotation.getQualifiedClassName();
                _builder.append(_qualifiedClassName_2, "");
                _builder.append(".INSTANCE.get");
                String _name_4 = eClassAnnotation_2.getName();
                String _firstUpper_1 = TemplateUtil.toFirstUpper(_name_4);
                _builder.append(_firstUpper_1, "");
                _builder.append("_");
                String _name_5 = featureAnnotation.getName();
                String _firstUpper_2 = TemplateUtil.toFirstUpper(_name_5);
                _builder.append(_firstUpper_2, "");
                _builder.append("()) {");
                _builder.newLineIfNotEmpty();
                _builder.append("  ");
                _builder.append("return new ");
                String _featureMapQualifiedClassName = featureAnnotation.getFeatureMapQualifiedClassName();
                _builder.append(_featureMapQualifiedClassName, "  ");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.append("      ");
    _builder.append("throw new IllegalArgumentException(\"The EStructuralFeature \'\" + eFeature");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("+ \"\' is not a valid feature map in this EPackage\");");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Wraps a feature map entry pojo in a {@link org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry}. If the feature map");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* entry is null then a new one is created and <!-- begin-user-doc --> <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param eFeature");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*          the feature map feature of the object");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param adaptee");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*          the pojo feature map entry being wrapped/adapted");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @return the wrapper {@link ModelFeatureMapEntry}");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public org.eclipse.emf.texo.model.ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature,");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Object adaptee) {");
    _builder.newLine();
    {
      EList<EClassModelGenAnnotation> _eClassModelGenAnnotations_4 = ePackageModelGenAnnotation.getEClassModelGenAnnotations();
      for(final EClassModelGenAnnotation eClassAnnotation_3 : _eClassModelGenAnnotations_4) {
        {
          EList<EStructuralFeatureModelGenAnnotation> _featureMapFeatures_1 = eClassAnnotation_3.getFeatureMapFeatures();
          for(final EStructuralFeatureModelGenAnnotation featureAnnotation_1 : _featureMapFeatures_1) {
            {
              boolean _isGenerateCode_3 = featureAnnotation_1.isGenerateCode();
              if (_isGenerateCode_3) {
                _builder.append("if (eFeature == ");
                String _qualifiedClassName_3 = ePackageModelGenAnnotation.getQualifiedClassName();
                _builder.append(_qualifiedClassName_3, "");
                _builder.append(".INSTANCE.get");
                String _name_6 = eClassAnnotation_3.getName();
                String _firstUpper_3 = TemplateUtil.toFirstUpper(_name_6);
                _builder.append(_firstUpper_3, "");
                _builder.append("_");
                String _name_7 = featureAnnotation_1.getName();
                String _firstUpper_4 = TemplateUtil.toFirstUpper(_name_7);
                _builder.append(_firstUpper_4, "");
                _builder.append("()) {");
                _builder.newLineIfNotEmpty();
                _builder.append("  ");
                _builder.append("final ");
                String _featureMapSimpleClassName = featureAnnotation_1.getFeatureMapSimpleClassName();
                _builder.append(_featureMapSimpleClassName, "  ");
                _builder.append("ModelFeatureMapEntry<");
                String _featureMapQualifiedClassName_1 = featureAnnotation_1.getFeatureMapQualifiedClassName();
                _builder.append(_featureMapQualifiedClassName_1, "  ");
                _builder.append("> entry = new ");
                String _featureMapSimpleClassName_1 = featureAnnotation_1.getFeatureMapSimpleClassName();
                _builder.append(_featureMapSimpleClassName_1, "  ");
                _builder.append("ModelFeatureMapEntry<");
                String _featureMapQualifiedClassName_2 = featureAnnotation_1.getFeatureMapQualifiedClassName();
                _builder.append(_featureMapQualifiedClassName_2, "  ");
                _builder.append(">();");
                _builder.newLineIfNotEmpty();
                _builder.append("  ");
                _builder.append("entry.setTarget((");
                String _featureMapQualifiedClassName_3 = featureAnnotation_1.getFeatureMapQualifiedClassName();
                _builder.append(_featureMapQualifiedClassName_3, "  ");
                _builder.append(") adaptee);");
                _builder.newLineIfNotEmpty();
                _builder.append("  ");
                _builder.append("return entry;");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.append("      ");
    _builder.append("throw new IllegalArgumentException(\"The EStructuralFeature \'\" + eFeature");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("+ \"\' is not a valid feature map in this EPackage\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      EList<EClassModelGenAnnotation> _eClassModelGenAnnotations_5 = ePackageModelGenAnnotation.getEClassModelGenAnnotations();
      for(final EClassModelGenAnnotation eClassAnnotation_4 : _eClassModelGenAnnotations_5) {
        {
          boolean _and_2 = false;
          boolean _and_3 = false;
          EClass _eClass_2 = eClassAnnotation_4.getEClass();
          boolean _isAbstract_1 = _eClass_2.isAbstract();
          boolean _not_3 = (!_isAbstract_1);
          if (!_not_3) {
            _and_3 = false;
          } else {
            EClass _eClass_3 = eClassAnnotation_4.getEClass();
            boolean _isInterface_1 = _eClass_3.isInterface();
            boolean _not_4 = (!_isInterface_1);
            _and_3 = (_not_3 && _not_4);
          }
          if (!_and_3) {
            _and_2 = false;
          } else {
            boolean _isGenerateCode_4 = eClassAnnotation_4.isGenerateCode();
            _and_2 = (_and_3 && _isGenerateCode_4);
          }
          if (_and_2) {
            _builder.append("    ");
            _builder.append("/**");
            _builder.newLine();
            _builder.append("    ");
            _builder.append(" ");
            _builder.append("* <!-- begin-user-doc -->");
            _builder.newLine();
            _builder.append("    ");
            _builder.append(" ");
            _builder.append("* <!-- end-user-doc -->");
            _builder.newLine();
            _builder.append("    ");
            _builder.append(" ");
            _builder.append("* @return an instance of the model object representing the EClass ");
            EClass _eClass_4 = eClassAnnotation_4.getEClass();
            String _name_8 = _eClass_4.getName();
            _builder.append(_name_8, "     ");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append(" ");
            _builder.append("* @generated");
            _builder.newLine();
            _builder.append("    ");
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("public ");
            String _qualifiedClassName_4 = eClassAnnotation_4.getQualifiedClassName();
            _builder.append(_qualifiedClassName_4, "    ");
            _builder.append(" create");
            String _name_9 = eClassAnnotation_4.getName();
            String _firstUpper_5 = TemplateUtil.toFirstUpper(_name_9);
            _builder.append(_firstUpper_5, "    ");
            _builder.append("() {");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("return new ");
            String _qualifiedClassName_5 = eClassAnnotation_4.getQualifiedClassName();
            _builder.append(_qualifiedClassName_5, "        ");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Converts an instance of an {@link org.eclipse.emf.ecore.EDataType} to a String.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param eDataType the {@link org.eclipse.emf.ecore.EDataType} defining the type");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param value the object to convert, if the value is null then null is returned.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Object createFromString(org.eclipse.emf.ecore.EDataType eDataType, String value) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("switch (eDataType.getClassifierID()) {");
    _builder.newLine();
    {
      EList<EDataTypeModelGenAnnotationDefinition> _eDataTypeModelGenAnnotations = ePackageModelGenAnnotation.getEDataTypeModelGenAnnotations();
      for(final EDataTypeModelGenAnnotationDefinition eDataTypeAnnotation : _eDataTypeModelGenAnnotations) {
        _builder.append("    ");
        _builder.append("case ");
        String _qualifiedClassName_6 = ePackageModelGenAnnotation.getQualifiedClassName();
        _builder.append(_qualifiedClassName_6, "    ");
        _builder.append(".");
        String _name_10 = eDataTypeAnnotation.getName();
        String _upperCase_2 = TemplateUtil.toUpperCase(_name_10);
        _builder.append(_upperCase_2, "    ");
        _builder.append("_CLASSIFIER_ID:");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return create");
        String _name_11 = eDataTypeAnnotation.getName();
        String _firstUpper_6 = TemplateUtil.toFirstUpper(_name_11);
        _builder.append(_firstUpper_6, "        ");
        _builder.append("FromString(value);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("throw new IllegalArgumentException(\"The EDatatype \'\" + eDataType + \"\' is not defined in this EPackage\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Converts an instance of an {@link org.eclipse.emf.ecore.EDataType} to a String.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param eDataType the {@link org.eclipse.emf.ecore.EDataType} defining the type");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param value the object to convert, if value == null then null is returned");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    {
      boolean _addSuppressUnchecked = ePackageModelGenAnnotation.getAddSuppressUnchecked();
      if (_addSuppressUnchecked) {
        _builder.append("\t");
        _builder.append("@SuppressWarnings(\"unchecked\")");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("public String convertToString(org.eclipse.emf.ecore.EDataType eDataType, Object value) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("switch (eDataType.getClassifierID()) {");
    _builder.newLine();
    {
      EList<EDataTypeModelGenAnnotationDefinition> _eDataTypeModelGenAnnotations_1 = ePackageModelGenAnnotation.getEDataTypeModelGenAnnotations();
      for(final EDataTypeModelGenAnnotationDefinition eDataTypeAnnotation_1 : _eDataTypeModelGenAnnotations_1) {
        {
          boolean _isGenerateCode_5 = eDataTypeAnnotation_1.isGenerateCode();
          if (_isGenerateCode_5) {
            _builder.append("    ");
            _builder.append("case ");
            String _qualifiedClassName_7 = ePackageModelGenAnnotation.getQualifiedClassName();
            _builder.append(_qualifiedClassName_7, "    ");
            _builder.append(".");
            String _name_12 = eDataTypeAnnotation_1.getName();
            String _upperCase_3 = TemplateUtil.toUpperCase(_name_12);
            _builder.append(_upperCase_3, "    ");
            _builder.append("_CLASSIFIER_ID:");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("return convert");
            String _name_13 = eDataTypeAnnotation_1.getName();
            String _firstUpper_7 = TemplateUtil.toFirstUpper(_name_13);
            _builder.append(_firstUpper_7, "        ");
            _builder.append("ToString(");
            String _objectClassName = eDataTypeAnnotation_1.getObjectClassName();
            String _cast = TemplateUtil.cast(_objectClassName);
            _builder.append(_cast, "        ");
            _builder.append("value);");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("            ");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("throw new IllegalArgumentException(\"The EDatatype \'\" + eDataType + \"\' is not defined in this EPackage.\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      EList<EDataTypeModelGenAnnotationDefinition> _eDataTypeModelGenAnnotations_2 = ePackageModelGenAnnotation.getEDataTypeModelGenAnnotations();
      for(final EDataTypeModelGenAnnotationDefinition eDataTypeAnnotation_2 : _eDataTypeModelGenAnnotations_2) {
        _builder.append("    ");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("* Converts the EDataType: ");
        EClassifier _eClassifier = eDataTypeAnnotation_2.getEClassifier();
        String _name_14 = _eClassifier.getName();
        _builder.append(_name_14, "     ");
        _builder.append(" to a String.");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("  ");
        _builder.append("* <!-- begin-user-doc -->");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("* <!-- end-user-doc -->");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("* @param value the object to convert");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("* @return the String representing the value, if value == null then null is returned");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("public String convert");
        String _name_15 = eDataTypeAnnotation_2.getName();
        String _firstUpper_8 = TemplateUtil.toFirstUpper(_name_15);
        _builder.append(_firstUpper_8, "    ");
        _builder.append("ToString(");
        String _objectClassName_1 = eDataTypeAnnotation_2.getObjectClassName();
        _builder.append(_objectClassName_1, "    ");
        _builder.append(" value) {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("if (value == null) {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("return null;");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        {
          boolean _isEnum = eDataTypeAnnotation_2.isEnum();
          if (_isEnum) {
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("return value.toString();");
            _builder.newLine();
          } else {
            EDataTypeModelGenAnnotationDefinition _baseTypeAnnotation = eDataTypeAnnotation_2.getBaseTypeAnnotation();
            boolean _notEquals_1 = (!Objects.equal(_baseTypeAnnotation, null));
            if (_notEquals_1) {
              _builder.append("    ");
              _builder.append("    ");
              _builder.append("return convert");
              EDataTypeModelGenAnnotationDefinition _baseTypeAnnotation_1 = eDataTypeAnnotation_2.getBaseTypeAnnotation();
              String _name_16 = _baseTypeAnnotation_1.getName();
              String _firstUpper_9 = TemplateUtil.toFirstUpper(_name_16);
              _builder.append(_firstUpper_9, "        ");
              _builder.append("ToString(value);");
              _builder.newLineIfNotEmpty();
            } else {
              boolean _isDateType = eDataTypeAnnotation_2.isDateType();
              if (_isDateType) {
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("return org.eclipse.emf.texo.utils.ModelUtils.convertToXML(value);");
                _builder.newLine();
              } else {
                String _instanceClassName = eDataTypeAnnotation_2.getInstanceClassName();
                boolean _equals = Objects.equal(_instanceClassName, "java.lang.String");
                if (_equals) {
                  _builder.append("    ");
                  _builder.append("    ");
                  _builder.append("return value;");
                  _builder.newLine();
                } else {
                  boolean _isAutomaticStringConversion = eDataTypeAnnotation_2.isAutomaticStringConversion();
                  if (_isAutomaticStringConversion) {
                    _builder.append("    ");
                    _builder.append("    ");
                    _builder.append("return value.toString();");
                    _builder.newLine();
                  } else {
                    _builder.append("    ");
                    _builder.append("    ");
                    _builder.append("EDataType eDataType = ");
                    String _qualifiedClassName_8 = ePackageModelGenAnnotation.getQualifiedClassName();
                    _builder.append(_qualifiedClassName_8, "        ");
                    _builder.append(".INSTANCE.get");
                    String _name_17 = eDataTypeAnnotation_2.getName();
                    String _firstUpper_10 = TemplateUtil.toFirstUpper(_name_17);
                    _builder.append(_firstUpper_10, "        ");
                    _builder.append("EDataType();");
                    _builder.newLineIfNotEmpty();
                    _builder.append("    ");
                    _builder.append("    ");
                    _builder.append("throw new UnsupportedOperationException(\"Operation not support for EDataType \" + eDataType.getName() + \" converting from value \" + value);");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("* Creates an instance of the EDataType: ");
        EClassifier _eClassifier_1 = eDataTypeAnnotation_2.getEClassifier();
        String _name_18 = _eClassifier_1.getName();
        _builder.append(_name_18, "     ");
        _builder.append(" from a String.");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("  ");
        _builder.append("* <!-- begin-user-doc -->");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("* <!-- end-user-doc -->");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("* @param value the string value to convert to an object");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("* @return the instance of the data type, if value == null then null is returned");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("public ");
        String _objectClassName_2 = eDataTypeAnnotation_2.getObjectClassName();
        _builder.append(_objectClassName_2, "    ");
        _builder.append(" create");
        String _name_19 = eDataTypeAnnotation_2.getName();
        String _firstUpper_11 = TemplateUtil.toFirstUpper(_name_19);
        _builder.append(_firstUpper_11, "    ");
        _builder.append("FromString(String value) {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("if (value == null) {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("return null;");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        {
          boolean _isEnum_1 = eDataTypeAnnotation_2.isEnum();
          if (_isEnum_1) {
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("return ");
            String _qualifiedClassName_9 = eDataTypeAnnotation_2.getQualifiedClassName();
            _builder.append(_qualifiedClassName_9, "        ");
            _builder.append(".get(value);");
            _builder.newLineIfNotEmpty();
          } else {
            EDataTypeModelGenAnnotationDefinition _baseTypeAnnotation_2 = eDataTypeAnnotation_2.getBaseTypeAnnotation();
            boolean _notEquals_2 = (!Objects.equal(_baseTypeAnnotation_2, null));
            if (_notEquals_2) {
              _builder.append("    ");
              _builder.append("    ");
              _builder.append("return create");
              EDataTypeModelGenAnnotationDefinition _baseTypeAnnotation_3 = eDataTypeAnnotation_2.getBaseTypeAnnotation();
              String _name_20 = _baseTypeAnnotation_3.getName();
              String _firstUpper_12 = TemplateUtil.toFirstUpper(_name_20);
              _builder.append(_firstUpper_12, "        ");
              _builder.append("FromString(value);");
              _builder.newLineIfNotEmpty();
            } else {
              boolean _isDateType_1 = eDataTypeAnnotation_2.isDateType();
              if (_isDateType_1) {
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("return org.eclipse.emf.texo.utils.ModelUtils.createFromXML(value);");
                _builder.newLine();
              } else {
                String _instanceClassName_1 = eDataTypeAnnotation_2.getInstanceClassName();
                boolean _equals_1 = Objects.equal(_instanceClassName_1, "java.lang.String");
                if (_equals_1) {
                  _builder.append("    ");
                  _builder.append("    ");
                  _builder.append("return value;");
                  _builder.newLine();
                } else {
                  boolean _isAutomaticStringConversion_1 = eDataTypeAnnotation_2.isAutomaticStringConversion();
                  if (_isAutomaticStringConversion_1) {
                    _builder.append("    ");
                    _builder.append("    ");
                    _builder.append("return new ");
                    String _objectClassName_3 = eDataTypeAnnotation_2.getObjectClassName();
                    _builder.append(_objectClassName_3, "        ");
                    _builder.append("(value);");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("    ");
                    _builder.append("    ");
                    _builder.append("EDataType eDataType = ");
                    String _qualifiedClassName_10 = ePackageModelGenAnnotation.getQualifiedClassName();
                    _builder.append(_qualifiedClassName_10, "        ");
                    _builder.append(".INSTANCE.get");
                    String _name_21 = eDataTypeAnnotation_2.getName();
                    String _firstUpper_13 = TemplateUtil.toFirstUpper(_name_21);
                    _builder.append(_firstUpper_13, "        ");
                    _builder.append("EDataType();");
                    _builder.newLineIfNotEmpty();
                    _builder.append("    ");
                    _builder.append("    ");
                    _builder.append("throw new UnsupportedOperationException(\"Operation not support for EDataType \" + eDataType.getName() + \" converting from value \" + value);");
                    _builder.newLine();
                  }
                }
              }
            }
          }
        }
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  public String generateModelObjects(final ModelController modelController, final EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    String _xblockexpression = null;
    {
      String result = "";
      EList<EClassModelGenAnnotation> _eClassModelGenAnnotations = ePackageModelGenAnnotation.getEClassModelGenAnnotations();
      for (final EClassModelGenAnnotation eClassAnnotation : _eClassModelGenAnnotations) {
        boolean _and = false;
        String _qualifiedClassName = eClassAnnotation.getQualifiedClassName();
        boolean _notEquals = (!Objects.equal(_qualifiedClassName, null));
        if (!_notEquals) {
          _and = false;
        } else {
          boolean _isGenerateCode = eClassAnnotation.isGenerateCode();
          _and = (_notEquals && _isGenerateCode);
        }
        if (_and) {
          ModelObjectTemplate _modelObjectTemplate = new ModelObjectTemplate();
          ModelObjectTemplate template = _modelObjectTemplate;
          ArtifactGenerator _artifactGenerator = this.getArtifactGenerator();
          template.setArtifactGenerator(_artifactGenerator);
          String _generateContent = template.generateContent(eClassAnnotation);
          String _plus = ((result + "\n\n") + _generateContent);
          result = _plus;
        }
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public String generateFeatureMaps(final ModelController modelController, final EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    String _xblockexpression = null;
    {
      String result = "";
      EList<EClassModelGenAnnotation> _eClassModelGenAnnotations = ePackageModelGenAnnotation.getEClassModelGenAnnotations();
      for (final EClassModelGenAnnotation eClassAnnotation : _eClassModelGenAnnotations) {
        boolean _isGenerateCode = eClassAnnotation.isGenerateCode();
        if (_isGenerateCode) {
          EList<EStructuralFeatureModelGenAnnotation> _featureMapFeatures = eClassAnnotation.getFeatureMapFeatures();
          for (final EStructuralFeatureModelGenAnnotation featureAnnotation : _featureMapFeatures) {
            boolean _isGenerateCode_1 = featureAnnotation.isGenerateCode();
            if (_isGenerateCode_1) {
              ModelFeatureMapTemplate _modelFeatureMapTemplate = new ModelFeatureMapTemplate();
              ModelFeatureMapTemplate template = _modelFeatureMapTemplate;
              ArtifactGenerator _artifactGenerator = this.getArtifactGenerator();
              template.setArtifactGenerator(_artifactGenerator);
              String _generateContent = template.generateContent(featureAnnotation);
              String _plus = ((result + "\n\n") + _generateContent);
              result = _plus;
            }
          }
        }
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
}
