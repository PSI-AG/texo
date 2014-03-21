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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.generator.BaseTemplate;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.annotator.GenConstants;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotationDefinition;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.xtend.TemplateUtil;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ModelPackageTemplate extends BaseTemplate {
  public void generate(final EPackageModelGenAnnotation ePackageModelGenAnnotation, final boolean doDao) {
    boolean _executeOverrides = this.executeOverrides(ePackageModelGenAnnotation);
    if (_executeOverrides) {
      return;
    }
    String fileName = TemplateUtil.packageFileName(ePackageModelGenAnnotation);
    ModelController _modelController = this.getModelController();
    String content = this.generateContent(_modelController, ePackageModelGenAnnotation, doDao);
    this.addFile(fileName, content);
  }
  
  public List<String> getTemplateOverrides() {
    ArrayList<String> _arrayList = new ArrayList<String>();
    List<String> list = _arrayList;
    list.add("org::eclipse::emf::texo::modelgenerator::templates::modelpackage");
    list.add("org::eclipse::emf::texo::modelgenerator::xtend::ModelPackageTemplate");
    return list;
  }
  
  public String generateContent(final ModelController modelController, final EPackageModelGenAnnotation ePackageModelGenAnnotation, final boolean doDao) {
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
    _builder.append("* The <b>Package</b> for the model \'<em><b>");
    String _name = ePackageModelGenAnnotation.getName();
    _builder.append(_name, " ");
    _builder.append("</b></em>\'.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* It contains initialization code and access to the Factory to instantiate types of this package.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
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
    String _simpleClassName = ePackageModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName, "");
    _builder.append(" extends org.eclipse.emf.texo.model.ModelPackage {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Is set when the package has been initialized.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static boolean isInitialized = false;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The package namespace URI.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final String NS_URI = \"");
    EPackage _ePackage = ePackageModelGenAnnotation.getEPackage();
    String _nsURI = _ePackage.getNsURI();
    _builder.append(_nsURI, "    ");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The {@link org.eclipse.emf.texo.model.ModelFactory} for this package.");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("public static final ");
    String _simpleModelFactoryClassName = ePackageModelGenAnnotation.getSimpleModelFactoryClassName();
    _builder.append(_simpleModelFactoryClassName, "     ");
    _builder.append(" ");
    _builder.append(GenConstants.MODELFACTORY_CONSTANT, "     ");
    _builder.append(" = new ");
    String _simpleModelFactoryClassName_1 = ePackageModelGenAnnotation.getSimpleModelFactoryClassName();
    _builder.append(_simpleModelFactoryClassName_1, "     ");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    {
      EList<EDataTypeModelGenAnnotationDefinition> _eDataTypeModelGenAnnotations = ePackageModelGenAnnotation.getEDataTypeModelGenAnnotations();
      for(final EDataTypeModelGenAnnotationDefinition eClassifierAnnotation : _eDataTypeModelGenAnnotations) {
        _builder.newLine();
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
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("public static final int ");
        String _name_1 = eClassifierAnnotation.getName();
        String _upperCase = TemplateUtil.toUpperCase(_name_1);
        _builder.append(_upperCase, "    ");
        _builder.append("_CLASSIFIER_ID = ");
        EClassifier _eClassifier = eClassifierAnnotation.getEClassifier();
        int _classifierID = _eClassifier.getClassifierID();
        _builder.append(_classifierID, "    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<EClassModelGenAnnotation> _eClassModelGenAnnotations = ePackageModelGenAnnotation.getEClassModelGenAnnotations();
      for(final EClassModelGenAnnotation eClassAnnotation : _eClassModelGenAnnotations) {
        _builder.newLine();
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
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("public static final int ");
        String _name_2 = eClassAnnotation.getName();
        String _upperCase_1 = TemplateUtil.toUpperCase(_name_2);
        _builder.append(_upperCase_1, "    ");
        _builder.append("_CLASSIFIER_ID = ");
        EClass _eClass = eClassAnnotation.getEClass();
        int _classifierID_1 = _eClass.getClassifierID();
        _builder.append(_classifierID_1, "    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        {
          EList<EStructuralFeatureModelGenAnnotation> _eAllStructuralFeatureModelGenAnnotations = eClassAnnotation.getEAllStructuralFeatureModelGenAnnotations();
          for(final EStructuralFeatureModelGenAnnotation featureAnnotation : _eAllStructuralFeatureModelGenAnnotations) {
            _builder.newLine();
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
            _builder.append("* @generated");
            _builder.newLine();
            _builder.append("    ");
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("public static final int ");
            String _name_3 = eClassAnnotation.getName();
            String _upperCase_2 = TemplateUtil.toUpperCase(_name_3);
            _builder.append(_upperCase_2, "    ");
            _builder.append("_");
            String _name_4 = featureAnnotation.getName();
            String _upperCase_3 = TemplateUtil.toUpperCase(_name_4);
            _builder.append(_upperCase_3, "    ");
            _builder.append("_FEATURE_ID = ");
            EClass _eClass_1 = eClassAnnotation.getEClass();
            EStructuralFeature _eStructuralFeature = featureAnnotation.getEStructuralFeature();
            int _featureID = _eClass_1.getFeatureID(_eStructuralFeature);
            _builder.append(_featureID, "    ");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The static member with the instance of this {@link ModelPackage}.");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final ");
    String _simpleClassName_1 = ePackageModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName_1, "    ");
    _builder.append(" INSTANCE = initialize();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Initializes this {@link org.eclipse.emf.texo.model.ModelPackage}.");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @return an initialized instance of this class");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static ");
    String _simpleClassName_2 = ePackageModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName_2, "    ");
    _builder.append(" initialize() {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (isInitialized) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return (");
    String _simpleClassName_3 = ePackageModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName_3, "            ");
    _builder.append(")org.eclipse.emf.texo.model.ModelResolver.getInstance().getModelPackage(NS_URI);");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final ");
    String _simpleClassName_4 = ePackageModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName_4, "        ");
    _builder.append(" modelPackage = new ");
    String _simpleClassName_5 = ePackageModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName_5, "        ");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("org.eclipse.emf.texo.model.ModelResolver.getInstance().registerModelPackage(modelPackage);");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _isHandleEcoreFile = ePackageModelGenAnnotation.isHandleEcoreFile();
      if (_isHandleEcoreFile) {
        _builder.append("        ");
        _builder.append("// read the model from the ecore file, the EPackage is registered in the EPackage.Registry");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("// see the ModelResolver getEPackageRegistry method");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("org.eclipse.emf.texo.utils.ModelUtils.readEPackagesFromFile(modelPackage);");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("        ");
    _builder.append("isInitialized = true;");
    _builder.newLine();
    _builder.newLine();
    {
      EList<EPackageModelGenAnnotation> _dependsOn = ePackageModelGenAnnotation.getDependsOn();
      for(final EPackageModelGenAnnotation p : _dependsOn) {
        _builder.append("        ");
        String _qualifiedClassName = ((EPackageModelGenAnnotation) p).getQualifiedClassName();
        _builder.append(_qualifiedClassName, "        ");
        _builder.append(".initialize();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// force the initialization of the EFactory proxy");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("modelPackage.getEPackage();");
    _builder.newLine();
    _builder.newLine();
    {
      EList<EPackageModelGenAnnotation> _subPackageModelGens = ePackageModelGenAnnotation.getSubPackageModelGens();
      for(final EPackageModelGenAnnotation p_1 : _subPackageModelGens) {
        _builder.append("        ");
        String _qualifiedClassName_1 = ((EPackageModelGenAnnotation) p_1).getQualifiedClassName();
        _builder.append(_qualifiedClassName_1, "        ");
        _builder.append(".initialize();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// register the relation between a Class and its EClassifier");
    _builder.newLine();
    {
      EList<EClassModelGenAnnotation> _eClassModelGenAnnotations_1 = ePackageModelGenAnnotation.getEClassModelGenAnnotations();
      for(final EClassModelGenAnnotation eClassAnnotation_1 : _eClassModelGenAnnotations_1) {
        {
          String _qualifiedClassName_2 = eClassAnnotation_1.getQualifiedClassName();
          boolean _notEquals_1 = (!Objects.equal(_qualifiedClassName_2, null));
          if (_notEquals_1) {
            _builder.append("    ");
            _builder.append("org.eclipse.emf.texo.model.ModelResolver.getInstance().registerClassModelMapping(");
            String _qualifiedClassName_3 = eClassAnnotation_1.getQualifiedClassName();
            _builder.append(_qualifiedClassName_3, "    ");
            _builder.append(".class, modelPackage.get");
            String _name_5 = eClassAnnotation_1.getName();
            String _firstUpper = TemplateUtil.toFirstUpper(_name_5);
            _builder.append(_firstUpper, "    ");
            _builder.append("EClass(),modelPackage);");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    {
      EList<EEnumModelGenAnnotation> _eEnumModelGenAnnotations = ePackageModelGenAnnotation.getEEnumModelGenAnnotations();
      for(final EEnumModelGenAnnotation eEnumAnnotation : _eEnumModelGenAnnotations) {
        {
          String _qualifiedClassName_4 = eEnumAnnotation.getQualifiedClassName();
          boolean _notEquals_2 = (!Objects.equal(_qualifiedClassName_4, null));
          if (_notEquals_2) {
            _builder.append("    ");
            _builder.append("org.eclipse.emf.texo.model.ModelResolver.getInstance().registerClassModelMapping(");
            String _qualifiedClassName_5 = eEnumAnnotation.getQualifiedClassName();
            _builder.append(_qualifiedClassName_5, "    ");
            _builder.append(".class, modelPackage.get");
            String _name_6 = eEnumAnnotation.getName();
            String _firstUpper_1 = TemplateUtil.toFirstUpper(_name_6);
            _builder.append(_firstUpper_1, "    ");
            _builder.append("EEnum(),modelPackage);");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    {
      if (doDao) {
        {
          EList<EClassModelGenAnnotation> _eClassModelGenAnnotations_2 = ePackageModelGenAnnotation.getEClassModelGenAnnotations();
          for(final EClassModelGenAnnotation eClassAnnotation_2 : _eClassModelGenAnnotations_2) {
            {
              String _daoQualifiedClassName = eClassAnnotation_2.getDaoQualifiedClassName();
              boolean _notEquals_3 = (!Objects.equal(_daoQualifiedClassName, null));
              if (_notEquals_3) {
                _builder.append("    ");
                _builder.append("org.eclipse.emf.texo.server.store.DaoRegistry.getInstance().registerDao(");
                String _qualifiedClassName_6 = eClassAnnotation_2.getQualifiedClassName();
                _builder.append(_qualifiedClassName_6, "    ");
                _builder.append(".class, ");
                String _daoQualifiedClassName_1 = eClassAnnotation_2.getDaoQualifiedClassName();
                _builder.append(_daoQualifiedClassName_1, "    ");
                _builder.append(".class);");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// and return ourselves");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return modelPackage;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Returns the {@link org.eclipse.emf.texo.model.ModelFactory} of this ModelPackage.");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @return the {@link ");
    String _simpleModelFactoryClassName_2 = ePackageModelGenAnnotation.getSimpleModelFactoryClassName();
    _builder.append(_simpleModelFactoryClassName_2, "     ");
    _builder.append("} instance.");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    String _simpleModelFactoryClassName_3 = ePackageModelGenAnnotation.getSimpleModelFactoryClassName();
    _builder.append(_simpleModelFactoryClassName_3, "    ");
    _builder.append(" getModelFactory() {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return ");
    _builder.append(GenConstants.MODELFACTORY_CONSTANT, "        ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Returns the nsUri of the {@link org.eclipse.emf.ecore.EPackage} managed by this Package instance.");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @return the nsUri of the EPackage");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getNsURI() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return NS_URI;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Returns the name of the ecore file containing the ecore model of the {@link org.eclipse.emf.ecore.EPackage} managed here.");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @return the name of the ecore file");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public String getEcoreFileName() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return \"");
    String _name_7 = ePackageModelGenAnnotation.getName();
    _builder.append(_name_7, "        ");
    _builder.append(".ecore\";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      EList<EClassModelGenAnnotation> _eClassModelGenAnnotations_3 = ePackageModelGenAnnotation.getEClassModelGenAnnotations();
      for(final EClassModelGenAnnotation eClassAnnotation_3 : _eClassModelGenAnnotations_3) {
        _builder.newLine();
        _builder.append("    ");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("    ");
        _builder.append(" ");
        _builder.append("* Returns the {@link org.eclipse.emf.ecore.EClass} \'<em><b>");
        EClass _eClass_2 = eClassAnnotation_3.getEClass();
        String _name_8 = _eClass_2.getName();
        _builder.append(_name_8, "     ");
        _builder.append("</b></em>\'.");
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
        _builder.append("* @return an instance of the {@link org.eclipse.emf.ecore.EClass} \'<em><b>");
        EClass _eClass_3 = eClassAnnotation_3.getEClass();
        String _name_9 = _eClass_3.getName();
        _builder.append(_name_9, "     ");
        _builder.append("</b></em>\'");
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
        _builder.append("public org.eclipse.emf.ecore.EClass get");
        String _name_10 = eClassAnnotation_3.getName();
        String _firstUpper_2 = TemplateUtil.toFirstUpper(_name_10);
        _builder.append(_firstUpper_2, "    ");
        _builder.append("EClass() {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return (org.eclipse.emf.ecore.EClass)getEPackage().getEClassifiers().get(");
        String _name_11 = eClassAnnotation_3.getName();
        String _upperCase_4 = TemplateUtil.toUpperCase(_name_11);
        _builder.append(_upperCase_4, "        ");
        _builder.append("_CLASSIFIER_ID);");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        {
          EList<EStructuralFeatureModelGenAnnotation> _eStructuralFeatureModelGenAnnotations = eClassAnnotation_3.getEStructuralFeatureModelGenAnnotations();
          for(final EStructuralFeatureModelGenAnnotation featureAnnotation_1 : _eStructuralFeatureModelGenAnnotations) {
            _builder.newLine();
            _builder.append("    ");
            _builder.append("/**");
            _builder.newLine();
            _builder.append("    ");
            _builder.append(" ");
            _builder.append("* Returns the {@link org.eclipse.emf.ecore.EStructuralFeature} \'<em><b>");
            EClass _eClass_4 = eClassAnnotation_3.getEClass();
            String _name_12 = _eClass_4.getName();
            _builder.append(_name_12, "     ");
            _builder.append(".");
            EStructuralFeature _eStructuralFeature_1 = featureAnnotation_1.getEStructuralFeature();
            String _name_13 = _eStructuralFeature_1.getName();
            _builder.append(_name_13, "     ");
            _builder.append("</b></em>\'.");
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
            _builder.append("* @return an instance of the {@link org.eclipse.emf.ecore.EStructuralFeature}: \'<em><b>");
            EClass _eClass_5 = eClassAnnotation_3.getEClass();
            String _name_14 = _eClass_5.getName();
            _builder.append(_name_14, "     ");
            _builder.append(".");
            EStructuralFeature _eStructuralFeature_2 = featureAnnotation_1.getEStructuralFeature();
            String _name_15 = _eStructuralFeature_2.getName();
            _builder.append(_name_15, "     ");
            _builder.append("</b></em>\'.");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append(" ");
            _builder.append("* @generated");
            _builder.newLine();
            _builder.append("    ");
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
            {
              EStructuralFeature _eStructuralFeature_3 = featureAnnotation_1.getEStructuralFeature();
              if ((_eStructuralFeature_3 instanceof EReference)) {
                _builder.append("    ");
                _builder.append("public org.eclipse.emf.ecore.EReference get");
                String _name_16 = eClassAnnotation_3.getName();
                String _firstUpper_3 = TemplateUtil.toFirstUpper(_name_16);
                _builder.append(_firstUpper_3, "    ");
                _builder.append("_");
                String _name_17 = featureAnnotation_1.getName();
                String _firstUpper_4 = TemplateUtil.toFirstUpper(_name_17);
                _builder.append(_firstUpper_4, "    ");
                _builder.append("() {");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("return (org.eclipse.emf.ecore.EReference)get");
                String _name_18 = eClassAnnotation_3.getName();
                String _firstUpper_5 = TemplateUtil.toFirstUpper(_name_18);
                _builder.append(_firstUpper_5, "        ");
                _builder.append("EClass().getEAllStructuralFeatures().get(");
                String _name_19 = eClassAnnotation_3.getName();
                String _upperCase_5 = TemplateUtil.toUpperCase(_name_19);
                _builder.append(_upperCase_5, "        ");
                _builder.append("_");
                String _name_20 = featureAnnotation_1.getName();
                String _upperCase_6 = TemplateUtil.toUpperCase(_name_20);
                _builder.append(_upperCase_6, "        ");
                _builder.append("_FEATURE_ID);");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("}");
                _builder.newLine();
              } else {
                _builder.append("    ");
                _builder.append("public org.eclipse.emf.ecore.EAttribute get");
                String _name_21 = eClassAnnotation_3.getName();
                String _firstUpper_6 = TemplateUtil.toFirstUpper(_name_21);
                _builder.append(_firstUpper_6, "    ");
                _builder.append("_");
                String _name_22 = featureAnnotation_1.getName();
                String _firstUpper_7 = TemplateUtil.toFirstUpper(_name_22);
                _builder.append(_firstUpper_7, "    ");
                _builder.append("() {");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("return (org.eclipse.emf.ecore.EAttribute)get");
                String _name_23 = eClassAnnotation_3.getName();
                String _firstUpper_8 = TemplateUtil.toFirstUpper(_name_23);
                _builder.append(_firstUpper_8, "        ");
                _builder.append("EClass().getEAllStructuralFeatures().get(");
                String _name_24 = eClassAnnotation_3.getName();
                String _upperCase_7 = TemplateUtil.toUpperCase(_name_24);
                _builder.append(_upperCase_7, "        ");
                _builder.append("_");
                String _name_25 = featureAnnotation_1.getName();
                String _upperCase_8 = TemplateUtil.toUpperCase(_name_25);
                _builder.append(_upperCase_8, "        ");
                _builder.append("_FEATURE_ID);");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    {
      EList<EDataTypeModelGenAnnotationDefinition> _eDataTypeModelGenAnnotations_1 = ePackageModelGenAnnotation.getEDataTypeModelGenAnnotations();
      for(final EDataTypeModelGenAnnotationDefinition eClassifierAnnotation_1 : _eDataTypeModelGenAnnotations_1) {
        {
          EClassifier _eClassifier_1 = eClassifierAnnotation_1.getEClassifier();
          if ((_eClassifier_1 instanceof EEnum)) {
            _builder.append("    ");
            _builder.append("/**");
            _builder.newLine();
            _builder.append("    ");
            _builder.append(" ");
            _builder.append("* Returns the EEnum \'<em><b>");
            EClassifier _eClassifier_2 = eClassifierAnnotation_1.getEClassifier();
            String _name_26 = _eClassifier_2.getName();
            _builder.append(_name_26, "     ");
            _builder.append("</b></em>\'.");
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
            _builder.append("* @return an instance of the EEnum representing \'<em><b>");
            EClassifier _eClassifier_3 = eClassifierAnnotation_1.getEClassifier();
            String _name_27 = _eClassifier_3.getName();
            _builder.append(_name_27, "     ");
            _builder.append("</b></em>\'");
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
            _builder.append("public org.eclipse.emf.ecore.EEnum get");
            String _name_28 = eClassifierAnnotation_1.getName();
            String _firstUpper_9 = TemplateUtil.toFirstUpper(_name_28);
            _builder.append(_firstUpper_9, "    ");
            _builder.append("EEnum() {");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("return (org.eclipse.emf.ecore.EEnum)getEPackage().getEClassifiers().get(");
            String _name_29 = eClassifierAnnotation_1.getName();
            String _upperCase_9 = TemplateUtil.toUpperCase(_name_29);
            _builder.append(_upperCase_9, "        ");
            _builder.append("_CLASSIFIER_ID);");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("}");
            _builder.newLine();
          } else {
            _builder.append("    ");
            _builder.append("/**");
            _builder.newLine();
            _builder.append("    ");
            _builder.append(" ");
            _builder.append("* Returns the {@link org.eclipse.emf.ecore.EDataType} \'<em><b>");
            EClassifier _eClassifier_4 = eClassifierAnnotation_1.getEClassifier();
            String _name_30 = _eClassifier_4.getName();
            _builder.append(_name_30, "     ");
            _builder.append("</b></em>\'.");
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
            _builder.append("* @return an instance of the {@link org.eclipse.emf.ecore.EDataType} representing \'<em><b>");
            EClassifier _eClassifier_5 = eClassifierAnnotation_1.getEClassifier();
            String _name_31 = _eClassifier_5.getName();
            _builder.append(_name_31, "     ");
            _builder.append("</b></em>\'");
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
            _builder.append("public org.eclipse.emf.ecore.EDataType get");
            String _name_32 = eClassifierAnnotation_1.getName();
            String _firstUpper_10 = TemplateUtil.toFirstUpper(_name_32);
            _builder.append(_firstUpper_10, "    ");
            _builder.append("EDataType() {");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("return    (org.eclipse.emf.ecore.EDataType)getEPackage().getEClassifiers().get(");
            String _name_33 = eClassifierAnnotation_1.getName();
            String _upperCase_10 = TemplateUtil.toUpperCase(_name_33);
            _builder.append(_upperCase_10, "        ");
            _builder.append("_CLASSIFIER_ID);");
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
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param eClassifier");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*            the {@link org.eclipse.emf.ecore.EClassifier}");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @return the class implementing a specific {@link org.eclipse.emf.ecore.EClass}.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Class<?> getEClassifierClass(org.eclipse.emf.ecore.EClassifier eClassifier) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("switch (eClassifier.getClassifierID()) {");
    _builder.newLine();
    {
      EList<EClassModelGenAnnotation> _eClassModelGenAnnotations_4 = ePackageModelGenAnnotation.getEClassModelGenAnnotations();
      for(final EClassModelGenAnnotation eClassAnnotation_4 : _eClassModelGenAnnotations_4) {
        {
          String _qualifiedClassName_7 = eClassAnnotation_4.getQualifiedClassName();
          boolean _notEquals_4 = (!Objects.equal(_qualifiedClassName_7, null));
          if (_notEquals_4) {
            _builder.append("    ");
            _builder.append("case ");
            String _name_34 = eClassAnnotation_4.getName();
            String _upperCase_11 = TemplateUtil.toUpperCase(_name_34);
            _builder.append(_upperCase_11, "    ");
            _builder.append("_CLASSIFIER_ID:");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("return ");
            String _qualifiedClassName_8 = eClassAnnotation_4.getQualifiedClassName();
            _builder.append(_qualifiedClassName_8, "        ");
            _builder.append(".class;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EList<EDataTypeModelGenAnnotationDefinition> _eDataTypeModelGenAnnotations_2 = ePackageModelGenAnnotation.getEDataTypeModelGenAnnotations();
      for(final EDataTypeModelGenAnnotationDefinition eClassifierAnnotation_2 : _eDataTypeModelGenAnnotations_2) {
        {
          String _qualifiedClassName_9 = eClassifierAnnotation_2.getQualifiedClassName();
          boolean _notEquals_5 = (!Objects.equal(_qualifiedClassName_9, null));
          if (_notEquals_5) {
            _builder.append("    ");
            _builder.append("case ");
            String _name_35 = eClassifierAnnotation_2.getName();
            String _upperCase_12 = TemplateUtil.toUpperCase(_name_35);
            _builder.append(_upperCase_12, "    ");
            _builder.append("_CLASSIFIER_ID:");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("return ");
            String _qualifiedClassName_10 = eClassifierAnnotation_2.getQualifiedClassName();
            _builder.append(_qualifiedClassName_10, "        ");
            _builder.append(".class;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("        ");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("throw new IllegalArgumentException(\"The EClassifier \'\" + eClassifier + \"\' is not defined in this EPackage\");");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
