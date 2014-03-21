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
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.generator.ArtifactGenerator;
import org.eclipse.emf.texo.generator.BaseTemplate;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.xtend.FeatureGroupTemplate;
import org.eclipse.emf.texo.modelgenerator.xtend.TemplateUtil;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EntityTemplate extends BaseTemplate {
  public void generate(final EClassModelGenAnnotation eClassModelGenAnnotation) {
    EPackageModelGenAnnotation ePackageModelGenAnnotation = eClassModelGenAnnotation.getOwnerEPackageAnnotation();
    boolean _and = false;
    boolean _isGenerateCode = eClassModelGenAnnotation.isGenerateCode();
    if (!_isGenerateCode) {
      _and = false;
    } else {
      boolean _or = false;
      boolean _isAddRuntimeModelBehavior = ePackageModelGenAnnotation.isAddRuntimeModelBehavior();
      if (_isAddRuntimeModelBehavior) {
        _or = true;
      } else {
        EClass _eClass = eClassModelGenAnnotation.getEClass();
        boolean _isDocumentRoot = TemplateUtil.isDocumentRoot(_eClass);
        boolean _not = (!_isDocumentRoot);
        _or = (_isAddRuntimeModelBehavior || _not);
      }
      _and = (_isGenerateCode && _or);
    }
    if (_and) {
      boolean _executeOverrides = this.executeOverrides(eClassModelGenAnnotation);
      if (_executeOverrides) {
        return;
      }
      String fileName = TemplateUtil.classFileName(eClassModelGenAnnotation);
      ModelController _modelController = this.getModelController();
      String content = this.generateContent(_modelController, eClassModelGenAnnotation, ePackageModelGenAnnotation);
      this.addFile(fileName, content);
      ModelController _modelController_1 = this.getModelController();
      this.generateFeatureGroups(_modelController_1, eClassModelGenAnnotation);
    }
  }
  
  public List<String> getTemplateOverrides() {
    ArrayList<String> _arrayList = new ArrayList<String>();
    List<String> list = _arrayList;
    list.add("org::eclipse::emf::texo::modelgenerator::templates::entity");
    list.add("org::eclipse::emf::texo::modelgenerator::xtend::EntityTemplate");
    return list;
  }
  
  public String generateContent(final ModelController modelController, final EClassModelGenAnnotation eClassModelGenAnnotation, final EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    StringConcatenation _builder = new StringConcatenation();
    String _javaFileHeader = ePackageModelGenAnnotation.getJavaFileHeader();
    _builder.append(_javaFileHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packagePath = ePackageModelGenAnnotation.getPackagePath();
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
    _builder.append("public");
    {
      boolean _abstractValue = eClassModelGenAnnotation.getAbstractValue();
      if (_abstractValue) {
        _builder.append(" abstract");
      }
    }
    _builder.append(" class ");
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
    {
      EList<String> _classImplements = eClassModelGenAnnotation.getClassImplements();
      int _size_1 = _classImplements.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        _builder.append(" implements");
        _builder.newLineIfNotEmpty();
        {
          EList<String> _classImplements_1 = eClassModelGenAnnotation.getClassImplements();
          boolean _hasElements = false;
          for(final String classImplements : _classImplements_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append(classImplements, "");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("{");
    _builder.newLine();
    {
      boolean _isSerializable = eClassModelGenAnnotation.isSerializable();
      if (_isSerializable) {
        _builder.append("/**");
        _builder.newLine();
        _builder.append("* @generated");
        _builder.newLine();
        _builder.append("*/");
        _builder.newLine();
        _builder.append("private static final long serialVersionUID = 1L;");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eStructuralFeatureModelGenAnnotations = eClassModelGenAnnotation.getEStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation : _eStructuralFeatureModelGenAnnotations) {
        _builder.newLine();
        {
          boolean _and = false;
          boolean _isGenerateCode = featureAnnotation.isGenerateCode();
          if (!_isGenerateCode) {
            _and = false;
          } else {
            EStructuralFeature _eStructuralFeature = featureAnnotation.getEStructuralFeature();
            boolean _isVolatile = _eStructuralFeature.isVolatile();
            boolean _not = (!_isVolatile);
            _and = (_isGenerateCode && _not);
          }
          if (_and) {
            _builder.newLine();
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("* <!-- begin-user-doc -->");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("* <!-- end-user-doc -->");
            _builder.newLine();
            {
              String _documentation_2 = featureAnnotation.getDocumentation();
              boolean _notEquals_1 = (!Objects.equal(_documentation_2, null));
              if (_notEquals_1) {
                _builder.append("* <!-- begin-model-doc -->");
                _builder.newLine();
                _builder.append("* ");
                String _documentation_3 = featureAnnotation.getDocumentation();
                _builder.append(_documentation_3, "");
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
            EStructuralFeature _eStructuralFeature_1 = featureAnnotation.getEStructuralFeature();
            EClass _eClass_2 = eClassModelGenAnnotation.getEClass();
            String _javaAnnotations_1 = modelController.getJavaAnnotations(_eStructuralFeature_1, "field", _eClass_2);
            _builder.append(_javaAnnotations_1, "");
            _builder.newLineIfNotEmpty();
            _builder.append("private ");
            String _type = featureAnnotation.getType();
            _builder.append(_type, "");
            _builder.append(" ");
            String _validJavaMemberName = featureAnnotation.getValidJavaMemberName();
            _builder.append(_validJavaMemberName, "");
            _builder.append(" = ");
            String _defaultValue = featureAnnotation.getDefaultValue();
            _builder.append(_defaultValue, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    String _executeXPandTemplate = this.executeXPandTemplate("org::eclipse::emf::texo::modelgenerator::templates::entity_addition", eClassModelGenAnnotation);
    _builder.append(_executeXPandTemplate, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eStructuralFeatureModelGenAnnotations_1 = eClassModelGenAnnotation.getEStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation_1 : _eStructuralFeatureModelGenAnnotations_1) {
        {
          boolean _isGenerateCode_1 = featureAnnotation_1.isGenerateCode();
          if (_isGenerateCode_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("* Returns the value of \'<em><b>");
            EStructuralFeature _eStructuralFeature_2 = featureAnnotation_1.getEStructuralFeature();
            String _name_1 = _eStructuralFeature_2.getName();
            _builder.append(_name_1, " ");
            _builder.append("</b></em>\' feature.");
            _builder.newLineIfNotEmpty();
            {
              boolean _and_1 = false;
              boolean _and_2 = false;
              boolean _and_3 = false;
              EStructuralFeature _eStructuralFeature_3 = featureAnnotation_1.getEStructuralFeature();
              boolean _isVolatile_1 = _eStructuralFeature_3.isVolatile();
              boolean _not_1 = (!_isVolatile_1);
              if (!_not_1) {
                _and_3 = false;
              } else {
                boolean _isMany = featureAnnotation_1.isMany();
                _and_3 = (_not_1 && _isMany);
              }
              if (!_and_3) {
                _and_2 = false;
              } else {
                boolean _isReference = featureAnnotation_1.isReference();
                _and_2 = (_and_3 && _isReference);
              }
              if (!_and_2) {
                _and_1 = false;
              } else {
                boolean _isGenerateSafeManyAccess = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateSafeManyAccess();
                _and_1 = (_and_2 && _isGenerateSafeManyAccess);
              }
              if (_and_1) {
                _builder.append("* Note: the returned collection is Unmodifiable use the {#addTo");
                String _validJavaMemberName_1 = featureAnnotation_1.getValidJavaMemberName();
                String _firstUpper = TemplateUtil.toFirstUpper(_validJavaMemberName_1);
                _builder.append(_firstUpper, "");
                _builder.append("(");
                String _itemType = featureAnnotation_1.getItemType();
                _builder.append(_itemType, "");
                _builder.append(" value)}");
                _builder.newLineIfNotEmpty();
                _builder.append("* and {@link #removeFrom");
                String _validJavaMemberName_2 = featureAnnotation_1.getValidJavaMemberName();
                String _firstUpper_1 = TemplateUtil.toFirstUpper(_validJavaMemberName_2);
                _builder.append(_firstUpper_1, "");
                _builder.append("(");
                String _itemType_1 = featureAnnotation_1.getItemType();
                _builder.append(_itemType_1, "");
                _builder.append(" value)} methods");
                _builder.newLineIfNotEmpty();
                _builder.append("* to modify this feature.");
                _builder.newLine();
              }
            }
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
              String _documentation_4 = featureAnnotation_1.getDocumentation();
              boolean _notEquals_2 = (!Objects.equal(_documentation_4, null));
              if (_notEquals_2) {
                _builder.append("* <!-- begin-model-doc -->");
                _builder.newLine();
                _builder.append("* ");
                String _documentation_5 = featureAnnotation_1.getDocumentation();
                _builder.append(_documentation_5, "");
                _builder.newLineIfNotEmpty();
                _builder.append("* <!-- end-model-doc -->");
                _builder.newLine();
              }
            }
            _builder.append(" ");
            _builder.append("* @return the value of \'<em><b>");
            EStructuralFeature _eStructuralFeature_4 = featureAnnotation_1.getEStructuralFeature();
            String _name_2 = _eStructuralFeature_4.getName();
            _builder.append(_name_2, " ");
            _builder.append("</b></em>\' feature");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("* @generated");
            _builder.newLine();
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
            EStructuralFeature _eStructuralFeature_5 = featureAnnotation_1.getEStructuralFeature();
            EClass _eClass_3 = eClassModelGenAnnotation.getEClass();
            String _javaAnnotations_2 = modelController.getJavaAnnotations(_eStructuralFeature_5, "getter", _eClass_3);
            _builder.append(_javaAnnotations_2, "");
            _builder.newLineIfNotEmpty();
            _builder.append("public ");
            String _type_1 = featureAnnotation_1.getType();
            _builder.append(_type_1, "");
            _builder.append(" ");
            String _getter = featureAnnotation_1.getGetter();
            _builder.append(_getter, "");
            _builder.append("() {");
            _builder.newLineIfNotEmpty();
            {
              EStructuralFeature _eStructuralFeature_6 = featureAnnotation_1.getEStructuralFeature();
              boolean _isVolatile_2 = _eStructuralFeature_6.isVolatile();
              boolean _not_2 = (!_isVolatile_2);
              if (_not_2) {
                {
                  boolean _and_4 = false;
                  boolean _and_5 = false;
                  boolean _isMany_1 = featureAnnotation_1.isMany();
                  if (!_isMany_1) {
                    _and_5 = false;
                  } else {
                    boolean _isReference_1 = featureAnnotation_1.isReference();
                    _and_5 = (_isMany_1 && _isReference_1);
                  }
                  if (!_and_5) {
                    _and_4 = false;
                  } else {
                    boolean _isGenerateSafeManyAccess_1 = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateSafeManyAccess();
                    _and_4 = (_and_5 && _isGenerateSafeManyAccess_1);
                  }
                  if (_and_4) {
                    {
                      boolean _isUseList = ((EReferenceModelGenAnnotation) featureAnnotation_1).isUseList();
                      if (_isUseList) {
                        _builder.append("return java.util.Collections.unmodifiableList(");
                        String _validJavaMemberName_3 = featureAnnotation_1.getValidJavaMemberName();
                        _builder.append(_validJavaMemberName_3, "");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("return java.util.Collections.unmodifiableSet(");
                        String _validJavaMemberName_4 = featureAnnotation_1.getValidJavaMemberName();
                        _builder.append(_validJavaMemberName_4, "");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  } else {
                    _builder.append("return ");
                    String _validJavaMemberName_5 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_5, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                EStructuralFeatureModelGenAnnotation _featureMapFeature = featureAnnotation_1.getFeatureMapFeature();
                boolean _notEquals_3 = (!Objects.equal(_featureMapFeature, null));
                if (_notEquals_3) {
                  {
                    boolean _isMany_2 = featureAnnotation_1.isMany();
                    if (_isMany_2) {
                      _builder.append("return ");
                      EStructuralFeatureModelGenAnnotation _featureMapFeature_1 = featureAnnotation_1.getFeatureMapFeature();
                      String _featureMapQualifiedClassName = _featureMapFeature_1.getFeatureMapQualifiedClassName();
                      _builder.append(_featureMapQualifiedClassName, "");
                      _builder.append(".createUnmodifiableValueList(");
                      EStructuralFeatureModelGenAnnotation _featureMapFeature_2 = featureAnnotation_1.getFeatureMapFeature();
                      String _getter_1 = _featureMapFeature_2.getGetter();
                      _builder.append(_getter_1, "");
                      _builder.append("(), ");
                      EStructuralFeatureModelGenAnnotation _featureMapFeature_3 = featureAnnotation_1.getFeatureMapFeature();
                      String _featureMapQualifiedClassName_1 = _featureMapFeature_3.getFeatureMapQualifiedClassName();
                      _builder.append(_featureMapQualifiedClassName_1, "");
                      _builder.append(".Feature.");
                      String _name_3 = featureAnnotation_1.getName();
                      String _upperCase = TemplateUtil.toUpperCase(_name_3);
                      _builder.append(_upperCase, "");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("return ");
                      EStructuralFeatureModelGenAnnotation _featureMapFeature_4 = featureAnnotation_1.getFeatureMapFeature();
                      String _featureMapQualifiedClassName_2 = _featureMapFeature_4.getFeatureMapQualifiedClassName();
                      _builder.append(_featureMapQualifiedClassName_2, "");
                      _builder.append(".getSingleFeatureMapValue(");
                      EStructuralFeatureModelGenAnnotation _featureMapFeature_5 = featureAnnotation_1.getFeatureMapFeature();
                      String _getter_2 = _featureMapFeature_5.getGetter();
                      _builder.append(_getter_2, "");
                      _builder.append("(), ");
                      EStructuralFeatureModelGenAnnotation _featureMapFeature_6 = featureAnnotation_1.getFeatureMapFeature();
                      String _featureMapQualifiedClassName_3 = _featureMapFeature_6.getFeatureMapQualifiedClassName();
                      _builder.append(_featureMapQualifiedClassName_3, "");
                      _builder.append(".Feature.");
                      String _name_4 = featureAnnotation_1.getName();
                      String _upperCase_1 = TemplateUtil.toUpperCase(_name_4);
                      _builder.append(_upperCase_1, "");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                } else {
                  _builder.append("// Volatile feature");
                  _builder.newLine();
                  _builder.append("// TODO: implement this method to return the \'");
                  EStructuralFeature _eStructuralFeature_7 = featureAnnotation_1.getEStructuralFeature();
                  String _name_5 = _eStructuralFeature_7.getName();
                  _builder.append(_name_5, "");
                  _builder.append("\'");
                  _builder.newLineIfNotEmpty();
                  _builder.append("// Ensure that you remove @generated or mark it @generated NOT");
                  _builder.newLine();
                  _builder.append("throw new UnsupportedOperationException();");
                  _builder.newLine();
                }
              }
            }
            _builder.append("}");
            _builder.newLine();
            _builder.newLine();
            {
              boolean _or = false;
              EStructuralFeature _eStructuralFeature_8 = featureAnnotation_1.getEStructuralFeature();
              boolean _isChangeable = _eStructuralFeature_8.isChangeable();
              if (_isChangeable) {
                _or = true;
              } else {
                boolean _and_6 = false;
                boolean _isReference_2 = featureAnnotation_1.isReference();
                if (!_isReference_2) {
                  _and_6 = false;
                } else {
                  EReferenceModelGenAnnotation _oppositeModelGenAnnotation = ((EReferenceModelGenAnnotation) featureAnnotation_1).getOppositeModelGenAnnotation();
                  boolean _notEquals_4 = (!Objects.equal(_oppositeModelGenAnnotation, null));
                  _and_6 = (_isReference_2 && _notEquals_4);
                }
                _or = (_isChangeable || _and_6);
              }
              if (_or) {
                {
                  boolean _and_7 = false;
                  boolean _and_8 = false;
                  boolean _and_9 = false;
                  EStructuralFeatureModelGenAnnotation _featureMapFeature_7 = featureAnnotation_1.getFeatureMapFeature();
                  boolean _equals = Objects.equal(_featureMapFeature_7, null);
                  if (!_equals) {
                    _and_9 = false;
                  } else {
                    boolean _isMany_3 = featureAnnotation_1.isMany();
                    _and_9 = (_equals && _isMany_3);
                  }
                  if (!_and_9) {
                    _and_8 = false;
                  } else {
                    boolean _isReference_3 = featureAnnotation_1.isReference();
                    _and_8 = (_and_9 && _isReference_3);
                  }
                  if (!_and_8) {
                    _and_7 = false;
                  } else {
                    boolean _or_1 = false;
                    boolean _isGenerateBidirectionalAssociationSupport = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateBidirectionalAssociationSupport();
                    if (_isGenerateBidirectionalAssociationSupport) {
                      _or_1 = true;
                    } else {
                      boolean _isGenerateSafeManyAccess_2 = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateSafeManyAccess();
                      _or_1 = (_isGenerateBidirectionalAssociationSupport || _isGenerateSafeManyAccess_2);
                    }
                    _and_7 = (_and_8 && _or_1);
                  }
                  if (_and_7) {
                    _builder.append("/**");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("* Adds to the <em>");
                    EStructuralFeature _eStructuralFeature_9 = featureAnnotation_1.getEStructuralFeature();
                    String _name_6 = _eStructuralFeature_9.getName();
                    _builder.append(_name_6, " ");
                    _builder.append("</em> feature.");
                    _builder.newLineIfNotEmpty();
                    _builder.append(" ");
                    _builder.append("*");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("* @param ");
                    String _validJavaMemberName_6 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_6, " ");
                    _builder.append("Value the value to add");
                    _builder.newLineIfNotEmpty();
                    _builder.append(" ");
                    _builder.append("* @return true if the value is added to the collection (it was not yet present in the collection), false otherwise");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("* @generated");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("*/");
                    _builder.newLine();
                    _builder.append("public boolean addTo");
                    String _validJavaMemberName_7 = featureAnnotation_1.getValidJavaMemberName();
                    String _firstUpper_2 = TemplateUtil.toFirstUpper(_validJavaMemberName_7);
                    _builder.append(_firstUpper_2, "");
                    _builder.append("(");
                    String _itemType_2 = featureAnnotation_1.getItemType();
                    _builder.append(_itemType_2, "");
                    _builder.append(" ");
                    String _validJavaMemberName_8 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_8, "");
                    _builder.append("Value) {");
                    _builder.newLineIfNotEmpty();
                    {
                      EStructuralFeature _eStructuralFeature_10 = featureAnnotation_1.getEStructuralFeature();
                      boolean _isVolatile_3 = _eStructuralFeature_10.isVolatile();
                      boolean _not_3 = (!_isVolatile_3);
                      if (_not_3) {
                        {
                          EStructuralFeature _eStructuralFeature_11 = featureAnnotation_1.getEStructuralFeature();
                          boolean _isUnique = _eStructuralFeature_11.isUnique();
                          if (_isUnique) {
                            _builder.append("    ");
                            _builder.append("if (!");
                            String _validJavaMemberName_9 = featureAnnotation_1.getValidJavaMemberName();
                            _builder.append(_validJavaMemberName_9, "    ");
                            _builder.append(".contains(");
                            String _validJavaMemberName_10 = featureAnnotation_1.getValidJavaMemberName();
                            _builder.append(_validJavaMemberName_10, "    ");
                            _builder.append("Value)) {");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                        _builder.append("    ");
                        _builder.append("    ");
                        _builder.append("boolean result = ");
                        String _validJavaMemberName_11 = featureAnnotation_1.getValidJavaMemberName();
                        _builder.append(_validJavaMemberName_11, "        ");
                        _builder.append(".add(");
                        String _validJavaMemberName_12 = featureAnnotation_1.getValidJavaMemberName();
                        _builder.append(_validJavaMemberName_12, "        ");
                        _builder.append("Value);");
                        _builder.newLineIfNotEmpty();
                        {
                          boolean _and_10 = false;
                          EReferenceModelGenAnnotation _oppositeModelGenAnnotation_1 = ((EReferenceModelGenAnnotation) featureAnnotation_1).getOppositeModelGenAnnotation();
                          boolean _notEquals_5 = (!Objects.equal(_oppositeModelGenAnnotation_1, null));
                          if (!_notEquals_5) {
                            _and_10 = false;
                          } else {
                            boolean _isGenerateBidirectionalAssociationSupport_1 = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateBidirectionalAssociationSupport();
                            _and_10 = (_notEquals_5 && _isGenerateBidirectionalAssociationSupport_1);
                          }
                          if (_and_10) {
                            _builder.append("    ");
                            _builder.append("    ");
                            EReferenceModelGenAnnotation oppositeAnnotation = ((EReferenceModelGenAnnotation) featureAnnotation_1).getOppositeModelGenAnnotation();
                            _builder.newLineIfNotEmpty();
                            {
                              boolean _isMany_4 = oppositeAnnotation.isMany();
                              if (_isMany_4) {
                                {
                                  boolean _isGenerateSafeManyAccess_3 = oppositeAnnotation.isGenerateSafeManyAccess();
                                  if (_isGenerateSafeManyAccess_3) {
                                    _builder.append("    ");
                                    _builder.append("    ");
                                    String _validJavaMemberName_13 = featureAnnotation_1.getValidJavaMemberName();
                                    _builder.append(_validJavaMemberName_13, "        ");
                                    _builder.append("Value.addTo");
                                    String _validJavaMemberName_14 = oppositeAnnotation.getValidJavaMemberName();
                                    String _firstUpper_3 = TemplateUtil.toFirstUpper(_validJavaMemberName_14);
                                    _builder.append(_firstUpper_3, "        ");
                                    _builder.append("(this);");
                                    _builder.newLineIfNotEmpty();
                                  } else {
                                    _builder.append("    ");
                                    _builder.append("    ");
                                    String _validJavaMemberName_15 = featureAnnotation_1.getValidJavaMemberName();
                                    _builder.append(_validJavaMemberName_15, "        ");
                                    _builder.append("Value.add(this);");
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                              } else {
                                _builder.append("    ");
                                _builder.append("    ");
                                String _validJavaMemberName_16 = featureAnnotation_1.getValidJavaMemberName();
                                _builder.append(_validJavaMemberName_16, "        ");
                                _builder.append("Value.");
                                String _setter = oppositeAnnotation.getSetter();
                                _builder.append(_setter, "        ");
                                _builder.append("(this);");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                        _builder.append("    ");
                        _builder.append("    ");
                        _builder.append("return result;");
                        _builder.newLine();
                        {
                          EStructuralFeature _eStructuralFeature_12 = featureAnnotation_1.getEStructuralFeature();
                          boolean _isUnique_1 = _eStructuralFeature_12.isUnique();
                          if (_isUnique_1) {
                            _builder.append("    ");
                            _builder.append("}");
                            _builder.newLine();
                            _builder.append("    ");
                            _builder.append("return false;");
                            _builder.newLine();
                          }
                        }
                      } else {
                        _builder.append("    ");
                        _builder.append("// Volatile feature");
                        _builder.newLine();
                        _builder.append("    ");
                        _builder.append("// Ensure that you remove @generated or mark it @generated NOT");
                        _builder.newLine();
                        _builder.append("    ");
                        _builder.append("throw new UnsupportedOperationException();");
                        _builder.newLine();
                      }
                    }
                    _builder.append("}");
                    _builder.newLine();
                    _builder.newLine();
                    _builder.append("/**");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("* Removes from the <em>");
                    EStructuralFeature _eStructuralFeature_13 = featureAnnotation_1.getEStructuralFeature();
                    String _name_7 = _eStructuralFeature_13.getName();
                    _builder.append(_name_7, " ");
                    _builder.append("</em> feature.");
                    _builder.newLineIfNotEmpty();
                    _builder.append(" ");
                    _builder.append("*");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("* @param ");
                    String _validJavaMemberName_17 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_17, " ");
                    _builder.append("Value the value to remove");
                    _builder.newLineIfNotEmpty();
                    _builder.append(" ");
                    _builder.append("* @return true if the value is removed from the collection (it existed in the collection before removing), false otherwise");
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
                    String _validJavaMemberName_18 = featureAnnotation_1.getValidJavaMemberName();
                    String _firstUpper_4 = TemplateUtil.toFirstUpper(_validJavaMemberName_18);
                    _builder.append(_firstUpper_4, "");
                    _builder.append("(");
                    String _itemType_3 = featureAnnotation_1.getItemType();
                    _builder.append(_itemType_3, "");
                    _builder.append(" ");
                    String _validJavaMemberName_19 = featureAnnotation_1.getValidJavaMemberName();
                    _builder.append(_validJavaMemberName_19, "");
                    _builder.append("Value) {");
                    _builder.newLineIfNotEmpty();
                    {
                      EStructuralFeature _eStructuralFeature_14 = featureAnnotation_1.getEStructuralFeature();
                      boolean _isVolatile_4 = _eStructuralFeature_14.isVolatile();
                      boolean _not_4 = (!_isVolatile_4);
                      if (_not_4) {
                        _builder.append("    ");
                        _builder.append("if (");
                        String _validJavaMemberName_20 = featureAnnotation_1.getValidJavaMemberName();
                        _builder.append(_validJavaMemberName_20, "    ");
                        _builder.append(".contains(");
                        String _validJavaMemberName_21 = featureAnnotation_1.getValidJavaMemberName();
                        _builder.append(_validJavaMemberName_21, "    ");
                        _builder.append("Value)) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("    ");
                        _builder.append("    ");
                        _builder.append("boolean result = ");
                        String _validJavaMemberName_22 = featureAnnotation_1.getValidJavaMemberName();
                        _builder.append(_validJavaMemberName_22, "        ");
                        _builder.append(".remove(");
                        String _validJavaMemberName_23 = featureAnnotation_1.getValidJavaMemberName();
                        _builder.append(_validJavaMemberName_23, "        ");
                        _builder.append("Value);");
                        _builder.newLineIfNotEmpty();
                        {
                          boolean _and_11 = false;
                          EReferenceModelGenAnnotation _oppositeModelGenAnnotation_2 = ((EReferenceModelGenAnnotation) featureAnnotation_1).getOppositeModelGenAnnotation();
                          boolean _notEquals_6 = (!Objects.equal(_oppositeModelGenAnnotation_2, null));
                          if (!_notEquals_6) {
                            _and_11 = false;
                          } else {
                            boolean _isGenerateBidirectionalAssociationSupport_2 = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateBidirectionalAssociationSupport();
                            _and_11 = (_notEquals_6 && _isGenerateBidirectionalAssociationSupport_2);
                          }
                          if (_and_11) {
                            _builder.append("    ");
                            _builder.append("    ");
                            EReferenceModelGenAnnotation oppositeAnnotation_1 = ((EReferenceModelGenAnnotation) featureAnnotation_1).getOppositeModelGenAnnotation();
                            _builder.newLineIfNotEmpty();
                            {
                              boolean _isMany_5 = oppositeAnnotation_1.isMany();
                              if (_isMany_5) {
                                {
                                  boolean _isGenerateSafeManyAccess_4 = oppositeAnnotation_1.isGenerateSafeManyAccess();
                                  if (_isGenerateSafeManyAccess_4) {
                                    _builder.append("    ");
                                    _builder.append("    ");
                                    String _validJavaMemberName_24 = featureAnnotation_1.getValidJavaMemberName();
                                    _builder.append(_validJavaMemberName_24, "        ");
                                    _builder.append("Value.removeFrom");
                                    String _validJavaMemberName_25 = oppositeAnnotation_1.getValidJavaMemberName();
                                    String _firstUpper_5 = TemplateUtil.toFirstUpper(_validJavaMemberName_25);
                                    _builder.append(_firstUpper_5, "        ");
                                    _builder.append("(this);");
                                    _builder.newLineIfNotEmpty();
                                  } else {
                                    _builder.append("    ");
                                    _builder.append("    ");
                                    String _validJavaMemberName_26 = featureAnnotation_1.getValidJavaMemberName();
                                    _builder.append(_validJavaMemberName_26, "        ");
                                    _builder.append("Value.remove(oppositeAnnotation.validJavaMemberName)»(this);");
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                              } else {
                                _builder.append("    ");
                                _builder.append("    ");
                                String _validJavaMemberName_27 = featureAnnotation_1.getValidJavaMemberName();
                                _builder.append(_validJavaMemberName_27, "        ");
                                _builder.append("Value.");
                                String _setter_1 = oppositeAnnotation_1.getSetter();
                                _builder.append(_setter_1, "        ");
                                _builder.append("(null);");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                        _builder.append("    ");
                        _builder.append("    ");
                        _builder.append("return result;");
                        _builder.newLine();
                        _builder.append("    ");
                        _builder.append("}");
                        _builder.newLine();
                        _builder.append("               \t");
                        _builder.append("return false;");
                        _builder.newLine();
                      } else {
                        _builder.append("    ");
                        _builder.append("// Volatile feature");
                        _builder.newLine();
                        _builder.append("    ");
                        _builder.append("// Ensure that you remove @generated or mark it @generated NOT");
                        _builder.newLine();
                        _builder.append("    ");
                        _builder.append("throw new UnsupportedOperationException();");
                        _builder.newLine();
                      }
                    }
                    _builder.append("}");
                    _builder.newLine();
                    _builder.newLine();
                    _builder.append("/**");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("* Clears the <em>");
                    EStructuralFeature _eStructuralFeature_15 = featureAnnotation_1.getEStructuralFeature();
                    String _name_8 = _eStructuralFeature_15.getName();
                    _builder.append(_name_8, " ");
                    _builder.append("</em> feature.");
                    _builder.newLineIfNotEmpty();
                    _builder.append(" ");
                    _builder.append("* @generated");
                    _builder.newLine();
                    _builder.append(" ");
                    _builder.append("*/");
                    _builder.newLine();
                    _builder.append("public void clear");
                    String _validJavaMemberName_28 = featureAnnotation_1.getValidJavaMemberName();
                    String _firstUpper_6 = TemplateUtil.toFirstUpper(_validJavaMemberName_28);
                    _builder.append(_firstUpper_6, "");
                    _builder.append("() {");
                    _builder.newLineIfNotEmpty();
                    {
                      EStructuralFeature _eStructuralFeature_16 = featureAnnotation_1.getEStructuralFeature();
                      boolean _isVolatile_5 = _eStructuralFeature_16.isVolatile();
                      boolean _not_5 = (!_isVolatile_5);
                      if (_not_5) {
                        _builder.append("    ");
                        _builder.append("while (!");
                        String _validJavaMemberName_29 = featureAnnotation_1.getValidJavaMemberName();
                        _builder.append(_validJavaMemberName_29, "    ");
                        _builder.append(".isEmpty()) {");
                        _builder.newLineIfNotEmpty();
                        _builder.append("    ");
                        _builder.append("    ");
                        _builder.append("removeFrom");
                        String _validJavaMemberName_30 = featureAnnotation_1.getValidJavaMemberName();
                        String _firstUpper_7 = TemplateUtil.toFirstUpper(_validJavaMemberName_30);
                        _builder.append(_firstUpper_7, "        ");
                        _builder.append("(");
                        String _validJavaMemberName_31 = featureAnnotation_1.getValidJavaMemberName();
                        _builder.append(_validJavaMemberName_31, "        ");
                        _builder.append(".iterator().next());");
                        _builder.newLineIfNotEmpty();
                        _builder.append("    ");
                        _builder.append("}");
                        _builder.newLine();
                      } else {
                        _builder.append("    ");
                        _builder.append("// Volatile feature");
                        _builder.newLine();
                        _builder.append("    ");
                        _builder.append("// Ensure that you remove @generated or mark it @generated NOT");
                        _builder.newLine();
                        _builder.append("    ");
                        _builder.append("throw new UnsupportedOperationException();");
                        _builder.newLine();
                      }
                    }
                    _builder.append("}");
                    _builder.newLine();
                  }
                }
                _builder.append("/**");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("* Sets the \'{@link ");
                String _simpleClassName_1 = eClassModelGenAnnotation.getSimpleClassName();
                _builder.append(_simpleClassName_1, " ");
                _builder.append("#");
                String _getter_3 = featureAnnotation_1.getGetter();
                _builder.append(_getter_3, " ");
                _builder.append("() <em>");
                EStructuralFeature _eStructuralFeature_17 = featureAnnotation_1.getEStructuralFeature();
                String _name_9 = _eStructuralFeature_17.getName();
                _builder.append(_name_9, " ");
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
                {
                  String _documentation_6 = featureAnnotation_1.getDocumentation();
                  boolean _notEquals_7 = (!Objects.equal(_documentation_6, null));
                  if (_notEquals_7) {
                    _builder.append("* <!-- begin-model-doc -->");
                    _builder.newLine();
                    _builder.append("* ");
                    String _documentation_7 = featureAnnotation_1.getDocumentation();
                    _builder.append(_documentation_7, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("* <!-- end-model-doc -->");
                    _builder.newLine();
                  }
                }
                _builder.append(" ");
                _builder.append("* @param new");
                String _validJavaMemberName_32 = featureAnnotation_1.getValidJavaMemberName();
                String _firstUpper_8 = TemplateUtil.toFirstUpper(_validJavaMemberName_32);
                _builder.append(_firstUpper_8, " ");
                _builder.append(" the new value of the \'{@link ");
                String _simpleClassName_2 = eClassModelGenAnnotation.getSimpleClassName();
                _builder.append(_simpleClassName_2, " ");
                _builder.append("#");
                String _getter_4 = featureAnnotation_1.getGetter();
                _builder.append(_getter_4, " ");
                _builder.append("() ");
                EStructuralFeature _eStructuralFeature_18 = featureAnnotation_1.getEStructuralFeature();
                String _name_10 = _eStructuralFeature_18.getName();
                _builder.append(_name_10, " ");
                _builder.append("}\' feature.");
                _builder.newLineIfNotEmpty();
                _builder.append(" ");
                _builder.append("* @generated");
                _builder.newLine();
                _builder.append(" ");
                _builder.append("*/");
                _builder.newLine();
                EStructuralFeature _eStructuralFeature_19 = featureAnnotation_1.getEStructuralFeature();
                EClass _eClass_4 = eClassModelGenAnnotation.getEClass();
                String _javaAnnotations_3 = modelController.getJavaAnnotations(_eStructuralFeature_19, "setter", _eClass_4);
                _builder.append(_javaAnnotations_3, "");
                _builder.newLineIfNotEmpty();
                _builder.append("public void ");
                String _setter_2 = featureAnnotation_1.getSetter();
                _builder.append(_setter_2, "");
                _builder.append("(");
                String _type_2 = featureAnnotation_1.getType();
                _builder.append(_type_2, "");
                _builder.append(" new");
                String _validJavaMemberName_33 = featureAnnotation_1.getValidJavaMemberName();
                String _firstUpper_9 = TemplateUtil.toFirstUpper(_validJavaMemberName_33);
                _builder.append(_firstUpper_9, "");
                _builder.append(") {");
                _builder.newLineIfNotEmpty();
                {
                  EStructuralFeature _eStructuralFeature_20 = featureAnnotation_1.getEStructuralFeature();
                  boolean _isVolatile_6 = _eStructuralFeature_20.isVolatile();
                  boolean _not_6 = (!_isVolatile_6);
                  if (_not_6) {
                    {
                      boolean _and_12 = false;
                      boolean _isReference_4 = featureAnnotation_1.isReference();
                      if (!_isReference_4) {
                        _and_12 = false;
                      } else {
                        boolean _isGenerateSafeManyAccess_5 = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateSafeManyAccess();
                        _and_12 = (_isReference_4 && _isGenerateSafeManyAccess_5);
                      }
                      if (_and_12) {
                        {
                          boolean _isMany_6 = featureAnnotation_1.isMany();
                          if (_isMany_6) {
                            _builder.append("clear");
                            String _validJavaMemberName_34 = featureAnnotation_1.getValidJavaMemberName();
                            String _firstUpper_10 = TemplateUtil.toFirstUpper(_validJavaMemberName_34);
                            _builder.append(_firstUpper_10, "");
                            _builder.append("();");
                            _builder.newLineIfNotEmpty();
                            _builder.append("for (");
                            String _itemType_4 = featureAnnotation_1.getItemType();
                            _builder.append(_itemType_4, "");
                            _builder.append(" value : new");
                            String _validJavaMemberName_35 = featureAnnotation_1.getValidJavaMemberName();
                            String _firstUpper_11 = TemplateUtil.toFirstUpper(_validJavaMemberName_35);
                            _builder.append(_firstUpper_11, "");
                            _builder.append(") {");
                            _builder.newLineIfNotEmpty();
                            _builder.append("    ");
                            _builder.append("addTo");
                            String _validJavaMemberName_36 = featureAnnotation_1.getValidJavaMemberName();
                            String _firstUpper_12 = TemplateUtil.toFirstUpper(_validJavaMemberName_36);
                            _builder.append(_firstUpper_12, "    ");
                            _builder.append("(value);");
                            _builder.newLineIfNotEmpty();
                            _builder.append("}");
                            _builder.newLine();
                          } else {
                            {
                              boolean _and_13 = false;
                              EReferenceModelGenAnnotation _oppositeModelGenAnnotation_3 = ((EReferenceModelGenAnnotation) featureAnnotation_1).getOppositeModelGenAnnotation();
                              boolean _notEquals_8 = (!Objects.equal(_oppositeModelGenAnnotation_3, null));
                              if (!_notEquals_8) {
                                _and_13 = false;
                              } else {
                                boolean _isGenerateBidirectionalAssociationSupport_3 = ((EReferenceModelGenAnnotation) featureAnnotation_1).isGenerateBidirectionalAssociationSupport();
                                _and_13 = (_notEquals_8 && _isGenerateBidirectionalAssociationSupport_3);
                              }
                              if (_and_13) {
                                EReferenceModelGenAnnotation oppositeAnnotation_2 = ((EReferenceModelGenAnnotation) featureAnnotation_1).getOppositeModelGenAnnotation();
                                _builder.newLineIfNotEmpty();
                                _builder.append("if (");
                                String _validJavaMemberName_37 = featureAnnotation_1.getValidJavaMemberName();
                                _builder.append(_validJavaMemberName_37, "");
                                _builder.append(" != new");
                                String _validJavaMemberName_38 = featureAnnotation_1.getValidJavaMemberName();
                                String _firstUpper_13 = TemplateUtil.toFirstUpper(_validJavaMemberName_38);
                                _builder.append(_firstUpper_13, "");
                                _builder.append(") {");
                                _builder.newLineIfNotEmpty();
                                _builder.append("    ");
                                _builder.append("if (");
                                String _validJavaMemberName_39 = featureAnnotation_1.getValidJavaMemberName();
                                _builder.append(_validJavaMemberName_39, "    ");
                                _builder.append(" != null) {");
                                _builder.newLineIfNotEmpty();
                                {
                                  boolean _isMany_7 = oppositeAnnotation_2.isMany();
                                  if (_isMany_7) {
                                    {
                                      boolean _isGenerateSafeManyAccess_6 = ((EReferenceModelGenAnnotation) oppositeAnnotation_2).isGenerateSafeManyAccess();
                                      if (_isGenerateSafeManyAccess_6) {
                                        _builder.append("        ");
                                        String _validJavaMemberName_40 = featureAnnotation_1.getValidJavaMemberName();
                                        _builder.append(_validJavaMemberName_40, "        ");
                                        _builder.append(".removeFrom");
                                        String _validJavaMemberName_41 = oppositeAnnotation_2.getValidJavaMemberName();
                                        String _firstUpper_14 = TemplateUtil.toFirstUpper(_validJavaMemberName_41);
                                        _builder.append(_firstUpper_14, "        ");
                                        _builder.append("(this);");
                                        _builder.newLineIfNotEmpty();
                                      } else {
                                        _builder.append("        ");
                                        String _validJavaMemberName_42 = featureAnnotation_1.getValidJavaMemberName();
                                        _builder.append(_validJavaMemberName_42, "        ");
                                        _builder.append(".remove(this);");
                                        _builder.newLineIfNotEmpty();
                                      }
                                    }
                                  } else {
                                    _builder.append("        ");
                                    String _type_3 = featureAnnotation_1.getType();
                                    _builder.append(_type_3, "        ");
                                    _builder.append(" temp");
                                    String _validJavaMemberName_43 = featureAnnotation_1.getValidJavaMemberName();
                                    String _firstUpper_15 = TemplateUtil.toFirstUpper(_validJavaMemberName_43);
                                    _builder.append(_firstUpper_15, "        ");
                                    _builder.append(" = ");
                                    String _validJavaMemberName_44 = featureAnnotation_1.getValidJavaMemberName();
                                    _builder.append(_validJavaMemberName_44, "        ");
                                    _builder.append(";");
                                    _builder.newLineIfNotEmpty();
                                    _builder.append("        ");
                                    String _validJavaMemberName_45 = featureAnnotation_1.getValidJavaMemberName();
                                    _builder.append(_validJavaMemberName_45, "        ");
                                    _builder.append(" = null;");
                                    _builder.newLineIfNotEmpty();
                                    _builder.append("        ");
                                    _builder.append("temp");
                                    String _validJavaMemberName_46 = featureAnnotation_1.getValidJavaMemberName();
                                    String _firstUpper_16 = TemplateUtil.toFirstUpper(_validJavaMemberName_46);
                                    _builder.append(_firstUpper_16, "        ");
                                    _builder.append(".");
                                    String _setter_3 = oppositeAnnotation_2.getSetter();
                                    _builder.append(_setter_3, "        ");
                                    _builder.append("(null);");
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                                _builder.append("    ");
                                _builder.append("}");
                                _builder.newLine();
                                _builder.append("    ");
                                String _validJavaMemberName_47 = featureAnnotation_1.getValidJavaMemberName();
                                _builder.append(_validJavaMemberName_47, "    ");
                                _builder.append(" = new");
                                String _validJavaMemberName_48 = featureAnnotation_1.getValidJavaMemberName();
                                String _firstUpper_17 = TemplateUtil.toFirstUpper(_validJavaMemberName_48);
                                _builder.append(_firstUpper_17, "    ");
                                _builder.append(";");
                                _builder.newLineIfNotEmpty();
                                _builder.append("    ");
                                _builder.append("if (");
                                String _validJavaMemberName_49 = featureAnnotation_1.getValidJavaMemberName();
                                _builder.append(_validJavaMemberName_49, "    ");
                                _builder.append(" != null) {");
                                _builder.newLineIfNotEmpty();
                                {
                                  boolean _isMany_8 = oppositeAnnotation_2.isMany();
                                  if (_isMany_8) {
                                    {
                                      boolean _isGenerateSafeManyAccess_7 = ((EReferenceModelGenAnnotation) oppositeAnnotation_2).isGenerateSafeManyAccess();
                                      if (_isGenerateSafeManyAccess_7) {
                                        _builder.append("        ");
                                        String _validJavaMemberName_50 = featureAnnotation_1.getValidJavaMemberName();
                                        _builder.append(_validJavaMemberName_50, "        ");
                                        _builder.append(".addTo");
                                        String _validJavaMemberName_51 = oppositeAnnotation_2.getValidJavaMemberName();
                                        String _firstUpper_18 = TemplateUtil.toFirstUpper(_validJavaMemberName_51);
                                        _builder.append(_firstUpper_18, "        ");
                                        _builder.append("(this);");
                                        _builder.newLineIfNotEmpty();
                                      } else {
                                        _builder.append("        ");
                                        String _validJavaMemberName_52 = featureAnnotation_1.getValidJavaMemberName();
                                        _builder.append(_validJavaMemberName_52, "        ");
                                        _builder.append(".add(this);");
                                        _builder.newLineIfNotEmpty();
                                      }
                                    }
                                  } else {
                                    _builder.append("        ");
                                    String _validJavaMemberName_53 = featureAnnotation_1.getValidJavaMemberName();
                                    _builder.append(_validJavaMemberName_53, "        ");
                                    _builder.append(".");
                                    String _setter_4 = oppositeAnnotation_2.getSetter();
                                    _builder.append(_setter_4, "        ");
                                    _builder.append("(this);");
                                    _builder.newLineIfNotEmpty();
                                  }
                                }
                                _builder.append("    ");
                                _builder.append("}");
                                _builder.newLine();
                                _builder.append("}");
                                _builder.newLine();
                              } else {
                                String _validJavaMemberName_54 = featureAnnotation_1.getValidJavaMemberName();
                                _builder.append(_validJavaMemberName_54, "");
                                _builder.append(" = new");
                                String _validJavaMemberName_55 = featureAnnotation_1.getValidJavaMemberName();
                                String _firstUpper_19 = TemplateUtil.toFirstUpper(_validJavaMemberName_55);
                                _builder.append(_firstUpper_19, "");
                                _builder.append(";");
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                      } else {
                        String _validJavaMemberName_56 = featureAnnotation_1.getValidJavaMemberName();
                        _builder.append(_validJavaMemberName_56, "");
                        _builder.append(" = new");
                        String _validJavaMemberName_57 = featureAnnotation_1.getValidJavaMemberName();
                        String _firstUpper_20 = TemplateUtil.toFirstUpper(_validJavaMemberName_57);
                        _builder.append(_firstUpper_20, "");
                        _builder.append(";");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  } else {
                    EStructuralFeatureModelGenAnnotation _featureMapFeature_8 = featureAnnotation_1.getFeatureMapFeature();
                    boolean _notEquals_9 = (!Objects.equal(_featureMapFeature_8, null));
                    if (_notEquals_9) {
                      {
                        boolean _isMany_9 = featureAnnotation_1.isMany();
                        if (_isMany_9) {
                          EStructuralFeatureModelGenAnnotation _featureMapFeature_9 = featureAnnotation_1.getFeatureMapFeature();
                          String _setter_5 = _featureMapFeature_9.getSetter();
                          _builder.append(_setter_5, "");
                          _builder.append("(");
                          EStructuralFeatureModelGenAnnotation _featureMapFeature_10 = featureAnnotation_1.getFeatureMapFeature();
                          String _featureMapQualifiedClassName_4 = _featureMapFeature_10.getFeatureMapQualifiedClassName();
                          _builder.append(_featureMapQualifiedClassName_4, "");
                          _builder.append(".createFeatureGroupList(");
                          EStructuralFeatureModelGenAnnotation _featureMapFeature_11 = featureAnnotation_1.getFeatureMapFeature();
                          String _featureMapQualifiedClassName_5 = _featureMapFeature_11.getFeatureMapQualifiedClassName();
                          _builder.append(_featureMapQualifiedClassName_5, "");
                          _builder.append(".Feature.");
                          String _name_11 = featureAnnotation_1.getName();
                          String _upperCase_2 = TemplateUtil.toUpperCase(_name_11);
                          _builder.append(_upperCase_2, "");
                          _builder.append(", new");
                          String _validJavaMemberName_58 = featureAnnotation_1.getValidJavaMemberName();
                          String _firstUpper_21 = TemplateUtil.toFirstUpper(_validJavaMemberName_58);
                          _builder.append(_firstUpper_21, "");
                          _builder.append("));");
                          _builder.newLineIfNotEmpty();
                        } else {
                          EStructuralFeatureModelGenAnnotation _featureMapFeature_12 = featureAnnotation_1.getFeatureMapFeature();
                          String _featureMapQualifiedClassName_6 = _featureMapFeature_12.getFeatureMapQualifiedClassName();
                          _builder.append(_featureMapQualifiedClassName_6, "");
                          _builder.append(".setSingleFeatureMapValue(");
                          EStructuralFeatureModelGenAnnotation _featureMapFeature_13 = featureAnnotation_1.getFeatureMapFeature();
                          String _getter_5 = _featureMapFeature_13.getGetter();
                          _builder.append(_getter_5, "");
                          _builder.append("(), ");
                          EStructuralFeatureModelGenAnnotation _featureMapFeature_14 = featureAnnotation_1.getFeatureMapFeature();
                          String _featureMapQualifiedClassName_7 = _featureMapFeature_14.getFeatureMapQualifiedClassName();
                          _builder.append(_featureMapQualifiedClassName_7, "");
                          _builder.append(".Feature.");
                          String _name_12 = featureAnnotation_1.getName();
                          String _upperCase_3 = TemplateUtil.toUpperCase(_name_12);
                          _builder.append(_upperCase_3, "");
                          _builder.append(", new");
                          String _validJavaMemberName_59 = featureAnnotation_1.getValidJavaMemberName();
                          String _firstUpper_22 = TemplateUtil.toFirstUpper(_validJavaMemberName_59);
                          _builder.append(_firstUpper_22, "");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    } else {
                      _builder.append("// Volatile feature");
                      _builder.newLine();
                      _builder.append("// TODO: implement this method to set the \'");
                      EStructuralFeature _eStructuralFeature_21 = featureAnnotation_1.getEStructuralFeature();
                      String _name_13 = _eStructuralFeature_21.getName();
                      _builder.append(_name_13, "");
                      _builder.append("\'");
                      _builder.newLineIfNotEmpty();
                      _builder.append("// Ensure that you remove @generated or mark it @generated NOT");
                      _builder.newLine();
                      _builder.append("throw new UnsupportedOperationException();");
                      _builder.newLine();
                    }
                  }
                }
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* A toString method which prints the values of all EAttributes of this instance.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- begin-user-doc -->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* <!-- end-user-doc -->");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("return  \"");
    String _name_14 = eClassModelGenAnnotation.getName();
    _builder.append(_name_14, "         ");
    _builder.append(" \"");
    _builder.newLineIfNotEmpty();
    {
      EList<EStructuralFeatureModelGenAnnotation> _eStructuralFeatureModelGenAnnotations_2 = eClassModelGenAnnotation.getEStructuralFeatureModelGenAnnotations();
      for(final EStructuralFeatureModelGenAnnotation featureAnnotation_2 : _eStructuralFeatureModelGenAnnotations_2) {
        {
          boolean _and_14 = false;
          boolean _and_15 = false;
          boolean _isGenerateCode_2 = featureAnnotation_2.isGenerateCode();
          if (!_isGenerateCode_2) {
            _and_15 = false;
          } else {
            boolean _isReference_5 = featureAnnotation_2.isReference();
            boolean _not_7 = (!_isReference_5);
            _and_15 = (_isGenerateCode_2 && _not_7);
          }
          if (!_and_15) {
            _and_14 = false;
          } else {
            EStructuralFeature _eStructuralFeature_22 = featureAnnotation_2.getEStructuralFeature();
            boolean _isMany_10 = _eStructuralFeature_22.isMany();
            boolean _not_8 = (!_isMany_10);
            _and_14 = (_and_15 && _not_8);
          }
          if (_and_14) {
            _builder.append("         ");
            _builder.append("+ \" [");
            String _name_15 = featureAnnotation_2.getName();
            _builder.append(_name_15, "         ");
            _builder.append(": \" +  ");
            String _getter_6 = featureAnnotation_2.getGetter();
            _builder.append(_getter_6, "         ");
            _builder.append("() + \"]\"");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("         ");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public void generateFeatureGroups(final ModelController modelController, final EClassModelGenAnnotation eClassModelGenAnnotation) {
    EList<EStructuralFeatureModelGenAnnotation> _featureMapFeatures = eClassModelGenAnnotation.getFeatureMapFeatures();
    for (final EStructuralFeatureModelGenAnnotation featureAnnotation : _featureMapFeatures) {
      boolean _isGenerateCode = featureAnnotation.isGenerateCode();
      if (_isGenerateCode) {
        FeatureGroupTemplate _featureGroupTemplate = new FeatureGroupTemplate();
        FeatureGroupTemplate template = _featureGroupTemplate;
        ArtifactGenerator _artifactGenerator = this.getArtifactGenerator();
        template.setArtifactGenerator(_artifactGenerator);
        template.generate(featureAnnotation);
        Map<String,String> _files = template.getFiles();
        this.addFiles(_files);
      }
    }
  }
}
