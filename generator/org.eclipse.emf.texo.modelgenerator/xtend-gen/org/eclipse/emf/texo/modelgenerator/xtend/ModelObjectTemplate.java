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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.generator.BaseTemplate;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.xtend.TemplateUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ModelObjectTemplate extends BaseTemplate {
  public String generateContent(final EClassModelGenAnnotation eClassModelGenAnnotation) {
    String _xblockexpression = null;
    {
      EPackageModelGenAnnotation ePackageAnnotation = eClassModelGenAnnotation.getOwnerEPackageAnnotation();
      ModelController _modelController = this.getModelController();
      String _generateContent = this.generateContent(_modelController, eClassModelGenAnnotation, ePackageAnnotation);
      _xblockexpression = (_generateContent);
    }
    return _xblockexpression;
  }
  
  /**
   * Note that this method is just here for reference purposes,
   * this template is not overrideable at this point as the
   * override assumes that the overrider will generate a file
   */
  public List<String> getTemplateOverrides() {
    ArrayList<String> _arrayList = new ArrayList<String>();
    List<String> list = _arrayList;
    list.add("org::eclipse::emf::texo::modelgenerator::templates::modelobject");
    list.add("org::eclipse::emf::texo::modelgenerator::xtend::ModelObjectTemplate");
    return list;
  }
  
  public String generateContent(final ModelController modelController, final EClassModelGenAnnotation eClassModelGenAnnotation, final EPackageModelGenAnnotation ePackageAnnotation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* The adapter/wrapper for the EClass \'<em><b>");
    String _name = eClassModelGenAnnotation.getName();
    _builder.append(_name, " ");
    _builder.append("</b></em>\'.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param <E> the domain model java class");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public static class ");
    String _simpleClassName = eClassModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName, "");
    _builder.append("ModelObject<E extends ");
    String _qualifiedClassName = eClassModelGenAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      boolean _isHasSuperEClass = eClassModelGenAnnotation.isHasSuperEClass();
      if (_isHasSuperEClass) {
        EClassModelGenAnnotation eSuperClassAnnotation = eClassModelGenAnnotation.getSuperEClass();
        _builder.newLineIfNotEmpty();
        EClassModelGenAnnotation _superEClass = eClassModelGenAnnotation.getSuperEClass();
        EPackageModelGenAnnotation eSuperPackageAnnotation = _superEClass.getOwnerEPackageAnnotation();
        _builder.newLineIfNotEmpty();
        {
          EPackage _ePackage = eSuperPackageAnnotation.getEPackage();
          EClass _eClass = eClassModelGenAnnotation.getEClass();
          EPackage _ePackage_1 = _eClass.getEPackage();
          boolean _notEquals = (!Objects.equal(_ePackage, _ePackage_1));
          if (_notEquals) {
            _builder.append("extends ");
            String _modelClassesPackagePath = eSuperPackageAnnotation.getModelClassesPackagePath();
            _builder.append(_modelClassesPackagePath, "");
            _builder.append(".");
            String _simpleModelFactoryClassName = eSuperPackageAnnotation.getSimpleModelFactoryClassName();
            _builder.append(_simpleModelFactoryClassName, "");
            _builder.append(".");
            String _simpleClassName_1 = eSuperClassAnnotation.getSimpleClassName();
            _builder.append(_simpleClassName_1, "");
            _builder.append("ModelObject<E>");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("extends ");
            String _simpleClassName_2 = eSuperClassAnnotation.getSimpleClassName();
            _builder.append(_simpleClassName_2, "");
            _builder.append("ModelObject<E>");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append("extends org.eclipse.emf.texo.model.AbstractModelObject<E>");
        _builder.newLine();
      }
    }
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("*/");
    _builder.newLine();
    {
      boolean _isHasSuperEClass_1 = eClassModelGenAnnotation.isHasSuperEClass();
      if (_isHasSuperEClass_1) {
        _builder.append("    ");
        _builder.append("@Override");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("public org.eclipse.emf.ecore.EClass eClass() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return ");
    String _qualifiedClassName_1 = ePackageAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName_1, "        ");
    _builder.append(".INSTANCE.get");
    String _name_1 = eClassModelGenAnnotation.getName();
    String _firstUpper = TemplateUtil.toFirstUpper(_name_1);
    _builder.append(_firstUpper, "        ");
    _builder.append("EClass();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("*/");
    _builder.newLine();
    {
      boolean _isHasSuperEClass_2 = eClassModelGenAnnotation.isHasSuperEClass();
      if (_isHasSuperEClass_2) {
        _builder.append("    ");
        _builder.append("@Override");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("public org.eclipse.emf.texo.model.ModelPackage getModelPackage() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return ");
    String _qualifiedClassName_2 = ePackageAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName_2, "        ");
    _builder.append(".INSTANCE;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
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
    _builder.append("public Object eGet(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final int featureID = eClass().getFeatureID(eStructuralFeature);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("switch (featureID) {");
    _builder.newLine();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eAllStructuralFeatureModelGenAnnotations = eClassModelGenAnnotation.getEAllStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation : _eAllStructuralFeatureModelGenAnnotations) {
        {
          boolean _isGenerateCode = featureAnnotation.isGenerateCode();
          if (_isGenerateCode) {
            _builder.append("case ");
            String _qualifiedClassName_3 = ePackageAnnotation.getQualifiedClassName();
            _builder.append(_qualifiedClassName_3, "");
            _builder.append(".");
            String _name_2 = eClassModelGenAnnotation.getName();
            String _upperCase = TemplateUtil.toUpperCase(_name_2);
            _builder.append(_upperCase, "");
            _builder.append("_");
            String _name_3 = featureAnnotation.getName();
            String _upperCase_1 = TemplateUtil.toUpperCase(_name_3);
            _builder.append(_upperCase_1, "");
            _builder.append("_FEATURE_ID:");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("return getTarget().");
            String _getter = featureAnnotation.getGetter();
            _builder.append(_getter, "    ");
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
    _builder.append("return super.eGet(eStructuralFeature);");
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
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    {
      boolean _or = false;
      boolean _addSuppressUnchecked = eClassModelGenAnnotation.getAddSuppressUnchecked();
      if (_addSuppressUnchecked) {
        _or = true;
      } else {
        EList<EStructuralFeatureModelGenAnnotation> _eAllStructuralFeatureModelGenAnnotations_1 = eClassModelGenAnnotation.getEAllStructuralFeatureModelGenAnnotations();
        final Function1<EStructuralFeatureModelGenAnnotation,Boolean> _function = new Function1<EStructuralFeatureModelGenAnnotation,Boolean>() {
          public Boolean apply(final EStructuralFeatureModelGenAnnotation e) {
            boolean _and = false;
            EStructuralFeature _eStructuralFeature = e.getEStructuralFeature();
            boolean _isMany = _eStructuralFeature.isMany();
            if (!_isMany) {
              _and = false;
            } else {
              EStructuralFeature _eStructuralFeature_1 = e.getEStructuralFeature();
              boolean _isChangeable = _eStructuralFeature_1.isChangeable();
              _and = (_isMany && _isChangeable);
            }
            return Boolean.valueOf(_and);
          }
        };
        boolean _exists = IterableExtensions.<EStructuralFeatureModelGenAnnotation>exists(_eAllStructuralFeatureModelGenAnnotations_1, _function);
        _or = (_addSuppressUnchecked || _exists);
      }
      if (_or) {
        _builder.append("    ");
        _builder.append("@SuppressWarnings(\"unchecked\")");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void eSet(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature, Object value) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final int featureID = eClass().getFeatureID(eStructuralFeature);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("switch (featureID) {");
    _builder.newLine();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eStructuralFeatureModelGenAnnotations = eClassModelGenAnnotation.getEStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation_1 : _eStructuralFeatureModelGenAnnotations) {
        {
          boolean _and = false;
          boolean _isGenerateCode_1 = featureAnnotation_1.isGenerateCode();
          if (!_isGenerateCode_1) {
            _and = false;
          } else {
            EStructuralFeature _eStructuralFeature = featureAnnotation_1.getEStructuralFeature();
            boolean _isChangeable = _eStructuralFeature.isChangeable();
            _and = (_isGenerateCode_1 && _isChangeable);
          }
          if (_and) {
            _builder.append("        ");
            _builder.append("case ");
            String _qualifiedClassName_4 = ePackageAnnotation.getQualifiedClassName();
            _builder.append(_qualifiedClassName_4, "        ");
            _builder.append(".");
            String _name_4 = eClassModelGenAnnotation.getName();
            String _upperCase_2 = TemplateUtil.toUpperCase(_name_4);
            _builder.append(_upperCase_2, "        ");
            _builder.append("_");
            String _name_5 = featureAnnotation_1.getName();
            String _upperCase_3 = TemplateUtil.toUpperCase(_name_5);
            _builder.append(_upperCase_3, "        ");
            _builder.append("_FEATURE_ID:");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("getTarget().");
            String _setter = featureAnnotation_1.getSetter();
            _builder.append(_setter, "            ");
            _builder.append("(");
            String _objectType = featureAnnotation_1.getObjectType();
            String _cast = TemplateUtil.cast(_objectType);
            _builder.append(_cast, "            ");
            _builder.append("value);");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("return;");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("            ");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("super.eSet(eStructuralFeature, value);");
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
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean eAddTo(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature, Object value) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final int featureID = eClass().getFeatureID(eStructuralFeature);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("switch (featureID) {");
    _builder.newLine();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eStructuralFeatureModelGenAnnotations_1 = eClassModelGenAnnotation.getEStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation_2 : _eStructuralFeatureModelGenAnnotations_1) {
        _builder.append("        ");
        _builder.newLine();
        {
          boolean _and_1 = false;
          boolean _and_2 = false;
          EStructuralFeature _eStructuralFeature_1 = featureAnnotation_2.getEStructuralFeature();
          boolean _isChangeable_1 = _eStructuralFeature_1.isChangeable();
          if (!_isChangeable_1) {
            _and_2 = false;
          } else {
            boolean _isMany = featureAnnotation_2.isMany();
            _and_2 = (_isChangeable_1 && _isMany);
          }
          if (!_and_2) {
            _and_1 = false;
          } else {
            String _itemType = featureAnnotation_2.getItemType();
            boolean _contains = _itemType.contains(",");
            boolean _not = (!_contains);
            _and_1 = (_and_2 && _not);
          }
          if (_and_1) {
            {
              boolean _and_3 = false;
              boolean _and_4 = false;
              boolean _isReference = featureAnnotation_2.isReference();
              if (!_isReference) {
                _and_4 = false;
              } else {
                EStructuralFeatureModelGenAnnotation _featureMapFeature = featureAnnotation_2.getFeatureMapFeature();
                boolean _equals = Objects.equal(_featureMapFeature, null);
                _and_4 = (_isReference && _equals);
              }
              if (!_and_4) {
                _and_3 = false;
              } else {
                boolean _or_1 = false;
                boolean _isGenerateBidirectionalAssociationSupport = ((EReferenceModelGenAnnotation) featureAnnotation_2).isGenerateBidirectionalAssociationSupport();
                if (_isGenerateBidirectionalAssociationSupport) {
                  _or_1 = true;
                } else {
                  boolean _isGenerateSafeManyAccess = ((EReferenceModelGenAnnotation) featureAnnotation_2).isGenerateSafeManyAccess();
                  _or_1 = (_isGenerateBidirectionalAssociationSupport || _isGenerateSafeManyAccess);
                }
                _and_3 = (_and_4 && _or_1);
              }
              if (_and_3) {
                _builder.append("        ");
                _builder.append("case ");
                String _qualifiedClassName_5 = ePackageAnnotation.getQualifiedClassName();
                _builder.append(_qualifiedClassName_5, "        ");
                _builder.append(".");
                String _name_6 = eClassModelGenAnnotation.getName();
                String _upperCase_4 = TemplateUtil.toUpperCase(_name_6);
                _builder.append(_upperCase_4, "        ");
                _builder.append("_");
                String _name_7 = featureAnnotation_2.getName();
                String _upperCase_5 = TemplateUtil.toUpperCase(_name_7);
                _builder.append(_upperCase_5, "        ");
                _builder.append("_FEATURE_ID:");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("return getTarget().addTo");
                String _validJavaMemberName = featureAnnotation_2.getValidJavaMemberName();
                String _firstUpper_1 = TemplateUtil.toFirstUpper(_validJavaMemberName);
                _builder.append(_firstUpper_1, "            ");
                _builder.append("(");
                String _itemType_1 = featureAnnotation_2.getItemType();
                String _cast_1 = TemplateUtil.cast(_itemType_1);
                _builder.append(_cast_1, "            ");
                _builder.append("value);");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("        ");
                _builder.append("case ");
                String _qualifiedClassName_6 = ePackageAnnotation.getQualifiedClassName();
                _builder.append(_qualifiedClassName_6, "        ");
                _builder.append(".");
                String _name_8 = eClassModelGenAnnotation.getName();
                String _upperCase_6 = TemplateUtil.toUpperCase(_name_8);
                _builder.append(_upperCase_6, "        ");
                _builder.append("_");
                String _name_9 = featureAnnotation_2.getName();
                String _upperCase_7 = TemplateUtil.toUpperCase(_name_9);
                _builder.append(_upperCase_7, "        ");
                _builder.append("_FEATURE_ID:");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("return getTarget().");
                String _getter_1 = featureAnnotation_2.getGetter();
                _builder.append(_getter_1, "            ");
                _builder.append("().add(");
                String _itemType_2 = featureAnnotation_2.getItemType();
                String _cast_2 = TemplateUtil.cast(_itemType_2);
                _builder.append(_cast_2, "            ");
                _builder.append("value);");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("            ");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return super.eAddTo(eStructuralFeature, value);");
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
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public boolean eRemoveFrom(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature, Object value) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final int featureID = eClass().getFeatureID(eStructuralFeature);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("switch (featureID) {");
    _builder.newLine();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eStructuralFeatureModelGenAnnotations_2 = eClassModelGenAnnotation.getEStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation_3 : _eStructuralFeatureModelGenAnnotations_2) {
        _builder.append("        ");
        _builder.newLine();
        {
          boolean _and_5 = false;
          boolean _and_6 = false;
          EStructuralFeature _eStructuralFeature_2 = featureAnnotation_3.getEStructuralFeature();
          boolean _isChangeable_2 = _eStructuralFeature_2.isChangeable();
          if (!_isChangeable_2) {
            _and_6 = false;
          } else {
            boolean _isMany_1 = featureAnnotation_3.isMany();
            _and_6 = (_isChangeable_2 && _isMany_1);
          }
          if (!_and_6) {
            _and_5 = false;
          } else {
            String _itemType_3 = featureAnnotation_3.getItemType();
            boolean _contains_1 = _itemType_3.contains(",");
            boolean _not_1 = (!_contains_1);
            _and_5 = (_and_6 && _not_1);
          }
          if (_and_5) {
            {
              boolean _and_7 = false;
              boolean _and_8 = false;
              boolean _isReference_1 = featureAnnotation_3.isReference();
              if (!_isReference_1) {
                _and_8 = false;
              } else {
                EStructuralFeatureModelGenAnnotation _featureMapFeature_1 = featureAnnotation_3.getFeatureMapFeature();
                boolean _equals_1 = Objects.equal(_featureMapFeature_1, null);
                _and_8 = (_isReference_1 && _equals_1);
              }
              if (!_and_8) {
                _and_7 = false;
              } else {
                boolean _or_2 = false;
                boolean _isGenerateBidirectionalAssociationSupport_1 = ((EReferenceModelGenAnnotation) featureAnnotation_3).isGenerateBidirectionalAssociationSupport();
                if (_isGenerateBidirectionalAssociationSupport_1) {
                  _or_2 = true;
                } else {
                  boolean _isGenerateSafeManyAccess_1 = ((EReferenceModelGenAnnotation) featureAnnotation_3).isGenerateSafeManyAccess();
                  _or_2 = (_isGenerateBidirectionalAssociationSupport_1 || _isGenerateSafeManyAccess_1);
                }
                _and_7 = (_and_8 && _or_2);
              }
              if (_and_7) {
                _builder.append("        ");
                _builder.append("case ");
                String _qualifiedClassName_7 = ePackageAnnotation.getQualifiedClassName();
                _builder.append(_qualifiedClassName_7, "        ");
                _builder.append(".");
                String _name_10 = eClassModelGenAnnotation.getName();
                String _upperCase_8 = TemplateUtil.toUpperCase(_name_10);
                _builder.append(_upperCase_8, "        ");
                _builder.append("_");
                String _name_11 = featureAnnotation_3.getName();
                String _upperCase_9 = TemplateUtil.toUpperCase(_name_11);
                _builder.append(_upperCase_9, "        ");
                _builder.append("_FEATURE_ID:");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("return getTarget().removeFrom");
                String _validJavaMemberName_1 = featureAnnotation_3.getValidJavaMemberName();
                String _firstUpper_2 = TemplateUtil.toFirstUpper(_validJavaMemberName_1);
                _builder.append(_firstUpper_2, "            ");
                _builder.append("((");
                String _itemType_4 = featureAnnotation_3.getItemType();
                _builder.append(_itemType_4, "            ");
                _builder.append(")value);");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("        ");
                _builder.append("case ");
                String _qualifiedClassName_8 = ePackageAnnotation.getQualifiedClassName();
                _builder.append(_qualifiedClassName_8, "        ");
                _builder.append(".");
                String _name_12 = eClassModelGenAnnotation.getName();
                String _upperCase_10 = TemplateUtil.toUpperCase(_name_12);
                _builder.append(_upperCase_10, "        ");
                _builder.append("_");
                String _name_13 = featureAnnotation_3.getName();
                String _upperCase_11 = TemplateUtil.toUpperCase(_name_13);
                _builder.append(_upperCase_11, "        ");
                _builder.append("_FEATURE_ID:");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("return getTarget().");
                String _getter_2 = featureAnnotation_3.getGetter();
                _builder.append(_getter_2, "            ");
                _builder.append("().remove(value);");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("            ");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return super.eRemoveFrom(eStructuralFeature, value);");
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
