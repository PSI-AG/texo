/*******************************************************************************
 * Copyright (c) 2000, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Martin Taal - reworked for simpler use case (see class comments)
 *******************************************************************************/

package org.eclipse.emf.texo.generator;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.ArrayType;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
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

/**
 * Is initially copied from
 * org.eclipse.jdt.internal.corext.codemanipulation.ImportReferencesCollector
 * and then adapted to work specifically for code generation where the code
 * generation contains fully qualified type names together with type names which
 * already have an import declaration. Other changes compared to the original
 * class: with the following changes:
 * <ul>
 * <li>Static imports are not supported.</li>
 * <li>No bindings are resolved, all type references are assumed to be fully
 * qualified or already imported.</li>
 * <li>No support for specific regions over which the import is done</li>
 * <li>Not possible to ignore method bodies</li>
 * </ul>
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ImportReferencesCollector extends ASTVisitor {

	public static void collect(final ASTNode node, final IJavaProject project,
			final Collection<Name> resultingTypeImports) {
		ASTNode root = node.getRoot();
		CompilationUnit astRoot = root instanceof CompilationUnit ? (CompilationUnit) root
				: null;
		node.accept(new ImportReferencesCollector(project, astRoot,
				resultingTypeImports));
	}

	private Collection<Name> fTypeImports;

	private ImportReferencesCollector(final IJavaProject project,
			final CompilationUnit astRoot,
			final Collection<Name> resultingTypeImports) {
		super(processJavadocComments(astRoot));
		fTypeImports = resultingTypeImports;
	}

	private static boolean processJavadocComments(final CompilationUnit astRoot) {
		// don't visit Javadoc for 'package-info' (bug 216432)
		if (astRoot != null && astRoot.getTypeRoot() != null) {
			return !"package-info.java".equals(astRoot.getTypeRoot().getElementName()); //$NON-NLS-1$
		}
		return true;
	}

	private void addReference(final SimpleName name) {
		fTypeImports.add(name);
	}

	private void typeRefFound(Name node) {
		if (node != null) {
			while (node.isQualifiedName()) {
				node = ((QualifiedName) node).getQualifier();
			}
			addReference((SimpleName) node);
		}
	}

	private void possibleTypeRefFound(Name node) {
		while (node.isQualifiedName()) {
			node = ((QualifiedName) node).getQualifier();
		}
		addReference((SimpleName) node);
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
		possibleTypeRefFound(node); // possible ref
		return false;
	}

	/*
	 * @see ASTVisitor#visit(ImportDeclaration)
	 */
	@Override
	public boolean visit(final ImportDeclaration node) {
		return false;
	}

	/*
	 * @see ASTVisitor#visit(PackageDeclaration)
	 */
	@Override
	public boolean visit(final PackageDeclaration node) {
		if (node.getAST().apiLevel() >= AST.JLS3) {
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

	private void evalQualifyingExpression(final Expression expr,
			final Name selector) {
		if (expr != null) {
			if (expr instanceof Name) {
				Name name = (Name) expr;
				possibleTypeRefFound(name);
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
	 * @see
	 * org.eclipse.jdt.internal.corext.dom.GenericVisitor#visit(org.eclipse.
	 * jdt.core.dom.MarkerAnnotation)
	 */
	@Override
	public boolean visit(final MarkerAnnotation node) {
		typeRefFound(node.getTypeName());
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jdt.internal.corext.dom.GenericVisitor#visit(org.eclipse.
	 * jdt.core.dom.MarkerAnnotation)
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
	 * @see
	 * org.eclipse.jdt.internal.corext.dom.GenericVisitor#visit(org.eclipse.
	 * jdt.core.dom.MarkerAnnotation)
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

		if (node.getAST().apiLevel() >= AST.JLS3) {
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
					possibleTypeRefFound(name);
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
}
