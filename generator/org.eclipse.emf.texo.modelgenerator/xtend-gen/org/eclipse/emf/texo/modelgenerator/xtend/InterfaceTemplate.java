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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.generator.BaseTemplate;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.xtend.TemplateUtil;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class InterfaceTemplate extends BaseTemplate {
  public void generate(final EClassModelGenAnnotation eClassModelGenAnnotation) {
    EPackageModelGenAnnotation ePackageAnnotation = eClassModelGenAnnotation.getOwnerEPackageAnnotation();
    boolean _isGenerateCode = eClassModelGenAnnotation.isGenerateCode();
    if (_isGenerateCode) {
      boolean _executeOverrides = this.executeOverrides(eClassModelGenAnnotation);
      if (_executeOverrides) {
        return;
      }
      String fileName = TemplateUtil.classFileName(eClassModelGenAnnotation);
      ModelController _modelController = this.getModelController();
      String content = this.generateContent(_modelController, eClassModelGenAnnotation, ePackageAnnotation);
      this.addFile(fileName, content);
    }
  }
  
  public List<String> getTemplateOverrides() {
    ArrayList<String> _arrayList = new ArrayList<String>();
    List<String> list = _arrayList;
    list.add("org::eclipse::emf::texo::modelgenerator::templates::interface");
    list.add("org::eclipse::emf::texo::modelgenerator::xtend::InterfaceTemplate");
    return list;
  }
  
  public String generateContent(final ModelController modelController, final EClassModelGenAnnotation eClassModelGenAnnotation, final EPackageModelGenAnnotation ePackageAnnotation) {
    StringConcatenation _builder = new StringConcatenation();
    String _javaFileHeader = ePackageAnnotation.getJavaFileHeader();
    _builder.append(_javaFileHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packagePath = ePackageAnnotation.getPackagePath();
    _builder.append(_packagePath, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* A representation of the model object \'<em><b>");
    String _name = eClassModelGenAnnotation.getName();
    _builder.append(_name, " ");
    _builder.append("</b></em>\'.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    {
      String _documentation = eClassModelGenAnnotation.getDocumentation();
      boolean _notEquals = (!Objects.equal(_documentation, null));
      if (_notEquals) {
        _builder.append("* <!-- begin-model-doc -->");
        _builder.newLine();
        _builder.append("* ");
        String _documentation_1 = eClassModelGenAnnotation.getDocumentation();
        _builder.append(_documentation_1, "");
        _builder.newLineIfNotEmpty();
        _builder.append("* <!-- end-model-doc -->");
        _builder.newLine();
      }
    }
    _builder.append(" ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    EClass _eClass = eClassModelGenAnnotation.getEClass();
    EClass _eClass_1 = eClassModelGenAnnotation.getEClass();
    String _javaAnnotations = modelController.getJavaAnnotations(_eClass, "type", _eClass_1);
    _builder.append(_javaAnnotations, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public interface ");
    String _simpleClassName = eClassModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName, "");
    _builder.newLineIfNotEmpty();
    {
      EList<String> _classExtends = eClassModelGenAnnotation.getClassExtends();
      int _size = _classExtends.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append(" extends ");
        EList<String> _classExtends_1 = eClassModelGenAnnotation.getClassExtends();
        String _get = _classExtends_1.get(0);
        _builder.append(_get, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eStructuralFeatureModelGenAnnotations = eClassModelGenAnnotation.getEStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation : _eStructuralFeatureModelGenAnnotations) {
        {
          boolean _isGenerateCode = featureAnnotation.isGenerateCode();
          if (_isGenerateCode) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("* Returns the value of \'<em><b>");
            EStructuralFeature _eStructuralFeature = featureAnnotation.getEStructuralFeature();
            String _name_1 = _eStructuralFeature.getName();
            _builder.append(_name_1, " ");
            _builder.append("</em></b>\' feature.");
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
            _builder.append("* @return the value of \'<em><b>");
            EStructuralFeature _eStructuralFeature_1 = featureAnnotation.getEStructuralFeature();
            String _name_2 = _eStructuralFeature_1.getName();
            _builder.append(_name_2, " ");
            _builder.append("</b></em>\' feature");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("* @generated");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
            EStructuralFeature _eStructuralFeature_2 = featureAnnotation.getEStructuralFeature();
            EClass _eClass_2 = eClassModelGenAnnotation.getEClass();
            String _javaAnnotations_1 = modelController.getJavaAnnotations(_eStructuralFeature_2, "getter", _eClass_2);
            _builder.append(_javaAnnotations_1, "");
            _builder.newLineIfNotEmpty();
            _builder.append("public ");
            String _type = featureAnnotation.getType();
            _builder.append(_type, "");
            _builder.append(" ");
            String _getter = featureAnnotation.getGetter();
            _builder.append(_getter, "");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
            {
              boolean _or = false;
              EStructuralFeature _eStructuralFeature_3 = featureAnnotation.getEStructuralFeature();
              boolean _isChangeable = _eStructuralFeature_3.isChangeable();
              if (_isChangeable) {
                _or = true;
              } else {
                boolean _and = false;
                boolean _isReference = featureAnnotation.isReference();
                if (!_isReference) {
                  _and = false;
                } else {
                  EReferenceModelGenAnnotation _oppositeModelGenAnnotation = ((EReferenceModelGenAnnotation) featureAnnotation).getOppositeModelGenAnnotation();
                  boolean _notEquals_1 = (!Objects.equal(_oppositeModelGenAnnotation, null));
                  _and = (_isReference && _notEquals_1);
                }
                _or = (_isChangeable || _and);
              }
              if (_or) {
                {
                  boolean _and_1 = false;
                  boolean _and_2 = false;
                  boolean _and_3 = false;
                  EStructuralFeatureModelGenAnnotation _featureMapFeature = featureAnnotation.getFeatureMapFeature();
                  boolean _equals = Objects.equal(_featureMapFeature, null);
                  if (!_equals) {
                    _and_3 = false;
                  } else {
                    boolean _isMany = featureAnnotation.isMany();
                    _and_3 = (_equals && _isMany);
                  }
                  if (!_and_3) {
                    _and_2 = false;
                  } else {
                    boolean _isReference_1 = featureAnnotation.isReference();
                    _and_2 = (_and_3 && _isReference_1);
                  }
                  if (!_and_2) {
                    _and_1 = false;
                  } else {
                    boolean _or_1 = false;
                    boolean _isGenerateBidirectionalAssociationSupport = ((EReferenceModelGenAnnotation) featureAnnotation).isGenerateBidirectionalAssociationSupport();
                    if (_isGenerateBidirectionalAssociationSupport) {
                      _or_1 = true;
                    } else {
                      boolean _isGenerateSafeManyAccess = ((EReferenceModelGenAnnotation) featureAnnotation).isGenerateSafeManyAccess();
                      _or_1 = (_isGenerateBidirectionalAssociationSupport || _isGenerateSafeManyAccess);
                    }
                    _and_1 = (_and_2 && _or_1);
                  }
                  if (_and_1) {
                    _builder.append("/**");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("* Adds to the <em>");
                    EStructuralFeature _eStructuralFeature_4 = featureAnnotation.getEStructuralFeature();
                    String _name_3 = _eStructuralFeature_4.getName();
                    _builder.append(_name_3, " ");
                    _builder.append("</em> feature.");
                    _builder.newLineIfNotEmpty();
                    _builder.append(" ");
                    _builder.append("*");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("* @param value the value to add");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("* @return true if the value is added to the collection (it was not yet present in the collection), false otherwise");
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
                    _builder.append("public boolean addTo");
                    String _validJavaMemberName = featureAnnotation.getValidJavaMemberName();
                    String _firstUpper = TemplateUtil.toFirstUpper(_validJavaMemberName);
                    _builder.append(_firstUpper, "");
                    _builder.append("(");
                    String _itemType = featureAnnotation.getItemType();
                    _builder.append(_itemType, "");
                    _builder.append(" value);");
                    _builder.newLineIfNotEmpty();
                    _builder.newLine();
                    _builder.append("/**");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("* Removes from the <em>");
                    EStructuralFeature _eStructuralFeature_5 = featureAnnotation.getEStructuralFeature();
                    String _name_4 = _eStructuralFeature_5.getName();
                    _builder.append(_name_4, " ");
                    _builder.append("</em> feature.");
                    _builder.newLineIfNotEmpty();
                    _builder.append(" ");
                    _builder.append("*");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("* @param value the value to remove");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("* @return true if the value is removed from the collection (it was present in the collection), false otherwise");
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
                    _builder.append("public boolean removeFrom");
                    String _validJavaMemberName_1 = featureAnnotation.getValidJavaMemberName();
                    String _firstUpper_1 = TemplateUtil.toFirstUpper(_validJavaMemberName_1);
                    _builder.append(_firstUpper_1, "");
                    _builder.append("(");
                    String _itemType_1 = featureAnnotation.getItemType();
                    _builder.append(_itemType_1, "");
                    _builder.append(" value);");
                    _builder.newLineIfNotEmpty();
                    _builder.newLine();
                    _builder.append("/**");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("* Clears the <em>");
                    EStructuralFeature _eStructuralFeature_6 = featureAnnotation.getEStructuralFeature();
                    String _name_5 = _eStructuralFeature_6.getName();
                    _builder.append(_name_5, " ");
                    _builder.append("</em> feature.");
                    _builder.newLineIfNotEmpty();
                    _builder.append(" ");
                    _builder.append("* @generated");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("*/");
                    _builder.newLine();
                    _builder.append("public void clear");
                    String _validJavaMemberName_2 = featureAnnotation.getValidJavaMemberName();
                    String _firstUpper_2 = TemplateUtil.toFirstUpper(_validJavaMemberName_2);
                    _builder.append(_firstUpper_2, "");
                    _builder.append("();");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("/**");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("* Sets the \'{@link ");
                String _simpleClassName_1 = eClassModelGenAnnotation.getSimpleClassName();
                _builder.append(_simpleClassName_1, " ");
                _builder.append("#");
                String _getter_1 = featureAnnotation.getGetter();
                _builder.append(_getter_1, " ");
                _builder.append("() <em>");
                EStructuralFeature _eStructuralFeature_7 = featureAnnotation.getEStructuralFeature();
                String _name_6 = _eStructuralFeature_7.getName();
                _builder.append(_name_6, " ");
                _builder.append("</em>}\' feature.");
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
                _builder.append("* @param new");
                String _name_7 = featureAnnotation.getName();
                String _firstUpper_3 = TemplateUtil.toFirstUpper(_name_7);
                _builder.append(_firstUpper_3, " ");
                _builder.append(" the new value of the \'{@link ");
                String _simpleClassName_2 = eClassModelGenAnnotation.getSimpleClassName();
                _builder.append(_simpleClassName_2, " ");
                _builder.append("#");
                String _getter_2 = featureAnnotation.getGetter();
                _builder.append(_getter_2, " ");
                _builder.append("() <em>");
                EStructuralFeature _eStructuralFeature_8 = featureAnnotation.getEStructuralFeature();
                String _name_8 = _eStructuralFeature_8.getName();
                _builder.append(_name_8, " ");
                _builder.append("</em>}\' feature.");
                _builder.newLineIfNotEmpty();
                _builder.append(" ");
                _builder.append("* @generated");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("*/");
                _builder.newLine();
                EStructuralFeature _eStructuralFeature_9 = featureAnnotation.getEStructuralFeature();
                EClass _eClass_3 = eClassModelGenAnnotation.getEClass();
                String _javaAnnotations_2 = modelController.getJavaAnnotations(_eStructuralFeature_9, "getter", _eClass_3);
                _builder.append(_javaAnnotations_2, "");
                _builder.newLineIfNotEmpty();
                _builder.append("public void ");
                String _setter = featureAnnotation.getSetter();
                _builder.append(_setter, "");
                _builder.append("(");
                String _type_1 = featureAnnotation.getType();
                _builder.append(_type_1, "");
                _builder.append(" new");
                String _name_9 = featureAnnotation.getName();
                String _firstUpper_4 = TemplateUtil.toFirstUpper(_name_9);
                _builder.append(_firstUpper_4, "");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    String _executeXPandTemplate = this.executeXPandTemplate("org::eclipse::emf::texo::modelgenerator::templates::interface_addition", eClassModelGenAnnotation);
    _builder.append(_executeXPandTemplate, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
