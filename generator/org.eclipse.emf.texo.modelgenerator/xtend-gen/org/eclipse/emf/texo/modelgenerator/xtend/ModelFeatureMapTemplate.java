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

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.generator.BaseTemplate;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.xtend.TemplateUtil;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ModelFeatureMapTemplate extends BaseTemplate {
  public String generateContent(final EStructuralFeatureModelGenAnnotation eStructuralFeatureModelGenAnnotation) {
    String _xblockexpression = null;
    {
      EClassModelGenAnnotation _ownerEClassAnnotation = eStructuralFeatureModelGenAnnotation.getOwnerEClassAnnotation();
      EClassModelGenAnnotation eClassAnnotation = ((EClassModelGenAnnotation) _ownerEClassAnnotation);
      EPackageModelGenAnnotation _ownerEPackageAnnotation = eClassAnnotation.getOwnerEPackageAnnotation();
      EPackageModelGenAnnotation ePackageAnnotation = ((EPackageModelGenAnnotation) _ownerEPackageAnnotation);
      ModelController _modelController = this.getModelController();
      String _generateContent = this.generateContent(_modelController, eStructuralFeatureModelGenAnnotation, eClassAnnotation, ePackageAnnotation);
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
    list.add("org::eclipse::emf::texo::modelgenerator::templates::modelfeaturemap");
    list.add("org::eclipse::emf::texo::modelgenerator::xtend::ModelFeatureMapTemplate");
    return list;
  }
  
  public String generateContent(final ModelController modelController, final EStructuralFeatureModelGenAnnotation eStructuralFeatureModelGenAnnotation, final EClassModelGenAnnotation eClassAnnotation, final EPackageModelGenAnnotation ePackageAnnotation) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* The wrapper/adapter for the Feature Group \'<em><b>");
    EClass _eClass = eClassAnnotation.getEClass();
    String _name = _eClass.getName();
    _builder.append(_name, " ");
    _builder.append(".");
    String _name_1 = eStructuralFeatureModelGenAnnotation.getName();
    _builder.append(_name_1, " ");
    _builder.append("</b></em>\'.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param <E> the Feature Group class");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public static class ");
    String _featureMapSimpleClassName = eStructuralFeatureModelGenAnnotation.getFeatureMapSimpleClassName();
    _builder.append(_featureMapSimpleClassName, "");
    _builder.append("ModelFeatureMapEntry<E extends ");
    String _featureMapQualifiedClassName = eStructuralFeatureModelGenAnnotation.getFeatureMapQualifiedClassName();
    _builder.append(_featureMapQualifiedClassName, "");
    _builder.append("> extends org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry<");
    String _featureMapQualifiedClassName_1 = eStructuralFeatureModelGenAnnotation.getFeatureMapQualifiedClassName();
    _builder.append(_featureMapQualifiedClassName_1, "");
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
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
    _builder.append("public org.eclipse.emf.ecore.EStructuralFeature getEStructuralFeature() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("switch (getTarget().getFeature()) {");
    _builder.newLine();
    {
      EStructuralFeature _eStructuralFeature = eStructuralFeatureModelGenAnnotation.getEStructuralFeature();
      boolean _isMixed = TemplateUtil.isMixed(_eStructuralFeature);
      if (_isMixed) {
        _builder.append("        ");
        _builder.append("case TEXT:");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("return org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text();");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("case CDATA:");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("return org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA();");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("case COMMENT:");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("return org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment();");
        _builder.newLine();
      }
    }
    {
      List<EStructuralFeatureModelGenAnnotation> _allMemberFeatureMapFeatures = eStructuralFeatureModelGenAnnotation.getAllMemberFeatureMapFeatures();
      for(final EStructuralFeatureModelGenAnnotation memberFeatureAnnotation : _allMemberFeatureMapFeatures) {
        _builder.append("    ");
        _builder.append("case ");
        String _name_2 = memberFeatureAnnotation.getName();
        String _upperCase = TemplateUtil.toUpperCase(_name_2);
        _builder.append(_upperCase, "    ");
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return ");
        String _qualifiedClassName = ePackageAnnotation.getQualifiedClassName();
        _builder.append(_qualifiedClassName, "        ");
        _builder.append(".INSTANCE.get");
        String _name_3 = eClassAnnotation.getName();
        String _firstUpper = TemplateUtil.toFirstUpper(_name_3);
        _builder.append(_firstUpper, "        ");
        _builder.append("_");
        String _name_4 = memberFeatureAnnotation.getName();
        String _firstUpper_1 = TemplateUtil.toFirstUpper(_name_4);
        _builder.append(_firstUpper_1, "        ");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("            ");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("throw new IllegalArgumentException(\"No eStructuralFeature for feature kind \" + getTarget().getFeature());");
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
    _builder.append("public void setEStructuralFeature(final org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature) {");
    _builder.newLine();
    {
      EStructuralFeature _eStructuralFeature_1 = eStructuralFeatureModelGenAnnotation.getEStructuralFeature();
      boolean _isMixed_1 = TemplateUtil.isMixed(_eStructuralFeature_1);
      if (_isMixed_1) {
        _builder.append("        ");
        _builder.append("if (eStructuralFeature == org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text()) {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("getTarget().setFeature(");
        String _featureMapQualifiedClassName_2 = eStructuralFeatureModelGenAnnotation.getFeatureMapQualifiedClassName();
        _builder.append(_featureMapQualifiedClassName_2, "            ");
        _builder.append(".Feature.TEXT);");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("return;");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("} else if (eStructuralFeature == org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA()) {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("getTarget().setFeature(");
        String _featureMapQualifiedClassName_3 = eStructuralFeatureModelGenAnnotation.getFeatureMapQualifiedClassName();
        _builder.append(_featureMapQualifiedClassName_3, "            ");
        _builder.append(".Feature.CDATA);");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("return;");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("} else if (eStructuralFeature == org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment()) {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("getTarget().setFeature(");
        String _featureMapQualifiedClassName_4 = eStructuralFeatureModelGenAnnotation.getFeatureMapQualifiedClassName();
        _builder.append(_featureMapQualifiedClassName_4, "            ");
        _builder.append(".Feature.COMMENT);");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("return;");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final org.eclipse.emf.ecore.EClass eClass = ");
    String _qualifiedClassName_1 = ePackageAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName_1, "        ");
    _builder.append(".INSTANCE.get");
    String _name_5 = eClassAnnotation.getName();
    String _firstUpper_2 = TemplateUtil.toFirstUpper(_name_5);
    _builder.append(_firstUpper_2, "        ");
    _builder.append("EClass();");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("switch (eClass.getFeatureID(eStructuralFeature)) {");
    _builder.newLine();
    {
      List<EStructuralFeatureModelGenAnnotation> _allMemberFeatureMapFeatures_1 = eStructuralFeatureModelGenAnnotation.getAllMemberFeatureMapFeatures();
      for(final EStructuralFeatureModelGenAnnotation memberFeatureAnnotation_1 : _allMemberFeatureMapFeatures_1) {
        {
          boolean _isGenerateCode = memberFeatureAnnotation_1.isGenerateCode();
          if (_isGenerateCode) {
            _builder.append("case ");
            String _qualifiedClassName_2 = ePackageAnnotation.getQualifiedClassName();
            _builder.append(_qualifiedClassName_2, "");
            _builder.append(".");
            String _name_6 = eClassAnnotation.getName();
            String _upperCase_1 = TemplateUtil.toUpperCase(_name_6);
            _builder.append(_upperCase_1, "");
            _builder.append("_");
            String _name_7 = memberFeatureAnnotation_1.getName();
            String _upperCase_2 = TemplateUtil.toUpperCase(_name_7);
            _builder.append(_upperCase_2, "");
            _builder.append("_FEATURE_ID:");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("getTarget().setFeature(");
            String _featureMapQualifiedClassName_5 = eStructuralFeatureModelGenAnnotation.getFeatureMapQualifiedClassName();
            _builder.append(_featureMapQualifiedClassName_5, "    ");
            _builder.append(".Feature.");
            String _name_8 = memberFeatureAnnotation_1.getName();
            String _upperCase_3 = TemplateUtil.toUpperCase(_name_8);
            _builder.append(_upperCase_3, "    ");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
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
    _builder.append("throw new IllegalArgumentException(\"EStructuralFeature \" + eStructuralFeature + \" not supported here\");");
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
    _builder.append("public Object getValue() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return getTarget().getValue();");
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
    _builder.append("public void setValue(final Object value) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("getTarget().setValue(getTarget().getFeature(), value);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
