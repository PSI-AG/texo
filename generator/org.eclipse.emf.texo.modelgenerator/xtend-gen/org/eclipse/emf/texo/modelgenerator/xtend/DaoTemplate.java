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
import org.eclipse.emf.texo.generator.BaseTemplate;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.xtend.TemplateUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DaoTemplate extends BaseTemplate {
  public void generate(final EClassModelGenAnnotation eClassModelGenAnnotation) {
    EPackageModelGenAnnotation ePackageModelGenAnnotation = eClassModelGenAnnotation.getOwnerEPackageAnnotation();
    boolean _isAddRuntimeModelBehavior = ePackageModelGenAnnotation.isAddRuntimeModelBehavior();
    boolean _not = (!_isAddRuntimeModelBehavior);
    if (_not) {
      return;
    }
    boolean _executeOverrides = this.executeOverrides(eClassModelGenAnnotation);
    if (_executeOverrides) {
      return;
    }
    String fileName = TemplateUtil.daoClassFileName(eClassModelGenAnnotation);
    ModelController _modelController = this.getModelController();
    String content = this.generateContent(_modelController, eClassModelGenAnnotation, ePackageModelGenAnnotation);
    this.addFile(fileName, content);
  }
  
  public List<String> getTemplateOverrides() {
    ArrayList<String> _arrayList = new ArrayList<String>();
    List<String> list = _arrayList;
    list.add("org::eclipse::emf::texo::modelgenerator::templates::dao");
    list.add("org::eclipse::emf::texo::modelgenerator::xtend::DaoTemplate");
    return list;
  }
  
  public String generateContent(final ModelController modelController, final EClassModelGenAnnotation eClassModelGenAnnotation, final EPackageModelGenAnnotation ePackageModelGenAnnotation) {
    StringConcatenation _builder = new StringConcatenation();
    String _javaFileHeader = ePackageModelGenAnnotation.getJavaFileHeader();
    _builder.append(_javaFileHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _daoClassesPackagePath = ePackageModelGenAnnotation.getDaoClassesPackagePath();
    _builder.append(_daoClassesPackagePath, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* The Dao implementation for the model object \'<em><b>");
    String _name = eClassModelGenAnnotation.getName();
    _builder.append(_name, " ");
    _builder.append("</b></em>\'.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    String _simpleClassName = eClassModelGenAnnotation.getSimpleClassName();
    _builder.append(_simpleClassName, "");
    String _daoPatternName = ePackageModelGenAnnotation.getDaoPatternName();
    String _firstUpper = StringExtensions.toFirstUpper(_daoPatternName);
    _builder.append(_firstUpper, "");
    _builder.append(" extends ");
    String _daoRootClass = ePackageModelGenAnnotation.getDaoRootClass();
    _builder.append(_daoRootClass, "");
    _builder.append("<");
    String _qualifiedClassName = eClassModelGenAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName, "");
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
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
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("public Class<");
    String _qualifiedClassName_1 = eClassModelGenAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName_1, "      ");
    _builder.append("> getEntityClass() {");
    _builder.newLineIfNotEmpty();
    _builder.append("          ");
    _builder.append("return ");
    String _qualifiedClassName_2 = eClassModelGenAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName_2, "          ");
    _builder.append(".class;");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
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
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public org.eclipse.emf.ecore.EClass getEClass() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return ");
    String _qualifiedClassName_3 = ePackageModelGenAnnotation.getQualifiedClassName();
    _builder.append(_qualifiedClassName_3, "        ");
    _builder.append(".INSTANCE.get");
    String _name_1 = eClassModelGenAnnotation.getName();
    String _firstUpper_1 = TemplateUtil.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "        ");
    _builder.append("EClass();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
