/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ImportReferenceCollector.java,v 1.7 2011/08/25 12:34:30 mtaal Exp $
 */

package org.eclipse.emf.texo.generator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.ArrayType;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberRef;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.MethodRef;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.QualifiedType;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.ThisExpression;
import org.eclipse.jdt.core.dom.TypeDeclaration;

/**
 * Collects all existing imports and the qualified type names. Is initially based on:
 * org.eclipse.jdt.internal.corext.codemanipulation.ImportReferenceCollector but many not needed parts have been
 * stripped and code has been reworked.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ImportReferenceCollector extends ASTVisitor {

  private List<ImportDeclaration> existingImports = new ArrayList<ImportDeclaration>();
  private List<String> qualifiedTypes = new ArrayList<String>();
  private String packageName = null;
  private List<String> unQualifiedDeclaredTypes = new ArrayList<String>();

  public ImportReferenceCollector() {
    // always parse the java doc also
    super(true);
  }

  public List<ImportDeclaration> getExistingImports() {
    return existingImports;
  }

  public List<String> getQualifiedTypes() {
    return qualifiedTypes;
  }

  public String getPackageName() {
    return packageName;
  }

  private void typeRefFound(final Name node) {
    if (node == null) {
      return;
    }
    // ignore all the ones starting with lowercase which don't have a dot
    if (!node.getFullyQualifiedName().contains(".") //$NON-NLS-1$
        && Character.isLowerCase(node.getFullyQualifiedName().toCharArray()[0])) {
      return;
    }
    qualifiedTypes.add(node.getFullyQualifiedName());
  }

  private void doVisitChildren(final List<?> elements) {
    int nElements = elements.size();
    for (int i = 0; i < nElements; i++) {
      ((ASTNode) elements.get(i)).accept(this);
    }
  }

  private void doVisitNode(final ASTNode node) {
    if (node != null) {
      node.accept(this);
    }
  }

  /*
   * @see ASTVisitor#visit(ArrayType)
   */
  @Override
  public boolean visit(final ArrayType node) {
    doVisitNode(node.getElementType());
    return false;
  }

  /*
   * @see ASTVisitor#visit(SimpleName)
   */
  @Override
  public boolean visit(final SimpleName node) {
    typeRefFound(node);
    return false;
  }

  /*
   * @see ASTVisitor#visit(SimpleType)
   */
  @Override
  public boolean visit(final SimpleType node) {
    typeRefFound(node.getName());
    return false;
  }

  /*
   * @see ASTVisitor#visit(QualifiedType)
   */
  @Override
  public boolean visit(final QualifiedType node) {
    // nothing to do here, let the qualifier be visited
    return true;
  }

  /*
   * @see ASTVisitor#visit(QualifiedName)
   */
  @Override
  public boolean visit(final QualifiedName node) {
    typeRefFound(node); // possible ref
    return false;
  }

  /*
   * @see ASTVisitor#visit(ImportDeclaration)
   */
  @Override
  public boolean visit(final ImportDeclaration node) {
    existingImports.add(node);
    return false;
  }

  /*
   * @see ASTVisitor#visit(PackageDeclaration)
   */
  @Override
  public boolean visit(final PackageDeclaration node) {
    packageName = node.getName().getFullyQualifiedName();
    if (node.getAST().apiLevel() >= AST.JLS4) {
      doVisitNode(node.getJavadoc());
      doVisitChildren(node.annotations());
    }
    return false;
  }

  /*
   * @see ASTVisitor#visit(ThisExpression)
   */
  @Override
  public boolean visit(final ThisExpression node) {
    typeRefFound(node.getQualifier());
    return false;
  }

  private void evalQualifyingExpression(final Expression expr, final Name selector) {
    if (expr != null) {
      if (expr instanceof Name) {
        Name name = (Name) expr;
        typeRefFound(name);
      } else {
        expr.accept(this);
      }
    }
  }

  /*
   * @see ASTVisitor#visit(ClassInstanceCreation)
   */
  @Override
  public boolean visit(final ClassInstanceCreation node) {
    doVisitChildren(node.typeArguments());
    doVisitNode(node.getType());
    evalQualifyingExpression(node.getExpression(), null);
    if (node.getAnonymousClassDeclaration() != null) {
      node.getAnonymousClassDeclaration().accept(this);
    }
    doVisitChildren(node.arguments());
    return false;
  }

  /*
   * @see ASTVisitor#endVisit(MethodInvocation)
   */
  @Override
  public boolean visit(final MethodInvocation node) {
    evalQualifyingExpression(node.getExpression(), node.getName());
    doVisitChildren(node.typeArguments());
    doVisitChildren(node.arguments());
    return false;
  }

  /*
   * @see ASTVisitor#visit(SuperConstructorInvocation)
   */
  @Override
  public boolean visit(final SuperConstructorInvocation node) {
    evalQualifyingExpression(node.getExpression(), null);
    doVisitChildren(node.typeArguments());
    doVisitChildren(node.arguments());
    return false;
  }

  /*
   * @see ASTVisitor#visit(FieldAccess)
   */
  @Override
  public boolean visit(final FieldAccess node) {
    evalQualifyingExpression(node.getExpression(), node.getName());
    return false;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.jdt.internal.corext.dom.GenericVisitor#visit(org.eclipse. jdt.core.dom.MarkerAnnotation)
   */
  @Override
  public boolean visit(final MarkerAnnotation node) {
    typeRefFound(node.getTypeName());
    return false;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.jdt.internal.corext.dom.GenericVisitor#visit(org.eclipse. jdt.core.dom.MarkerAnnotation)
   */
  @Override
  public boolean visit(final NormalAnnotation node) {
    typeRefFound(node.getTypeName());
    doVisitChildren(node.values());
    return false;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.jdt.internal.corext.dom.GenericVisitor#visit(org.eclipse. jdt.core.dom.MarkerAnnotation)
   */
  @Override
  public boolean visit(final SingleMemberAnnotation node) {
    typeRefFound(node.getTypeName());
    doVisitNode(node.getValue());
    return false;
  }

  /*
   * @see ASTVisitor#visit(MethodDeclaration)
   */
  @Override
  public boolean visit(final MethodDeclaration node) {
    doVisitNode(node.getJavadoc());

    if (node.getAST().apiLevel() >= AST.JLS4) {
      doVisitChildren(node.modifiers());
      doVisitChildren(node.typeParameters());
    }

    if (!node.isConstructor()) {
      doVisitNode(node.getReturnType2());
    }
    doVisitChildren(node.parameters());
    Iterator<?> iter = node.thrownExceptions().iterator();
    while (iter.hasNext()) {
      typeRefFound((Name) iter.next());
    }
    doVisitNode(node.getBody());
    return false;
  }

  @Override
  public boolean visit(final TagElement node) {
    String tagName = node.getTagName();
    List<?> list = node.fragments();
    int idx = 0;
    if (tagName != null && !list.isEmpty()) {
      Object first = list.get(0);
      if (first instanceof Name) {
        if ("@throws".equals(tagName) || "@exception".equals(tagName)) { //$NON-NLS-1$//$NON-NLS-2$
          typeRefFound((Name) first);
        } else if ("@see".equals(tagName) || "@link".equals(tagName) || "@linkplain".equals(tagName)) { //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
          Name name = (Name) first;
          typeRefFound(name);
        }
        idx++;
      }
    }
    for (int i = idx; i < list.size(); i++) {
      doVisitNode((ASTNode) list.get(i));
    }
    return false;
  }

  @Override
  public boolean visit(final MemberRef node) {
    Name qualifier = node.getQualifier();
    if (qualifier != null) {
      typeRefFound(qualifier);
    }
    return false;
  }

  @Override
  public boolean visit(final MethodRef node) {
    Name qualifier = node.getQualifier();
    if (qualifier != null) {
      typeRefFound(qualifier);
    }
    List<?> list = node.parameters();
    if (list != null) {
      doVisitChildren(list); // visit MethodRefParameter with Type
    }
    return false;
  }

  @Override
  public boolean visit(EnumDeclaration node) {
    final Name nodeName = node.getName();
    unQualifiedDeclaredTypes.add(nodeName.getFullyQualifiedName());
    return super.visit(node);
  }

  @Override
  public boolean visit(TypeDeclaration node) {
    final Name nodeName = node.getName();
    unQualifiedDeclaredTypes.add(nodeName.getFullyQualifiedName());
    return super.visit(node);
  }

  public List<String> getUnqualifiedDeclaredTypes() {
    return unQualifiedDeclaredTypes;
  }
}
