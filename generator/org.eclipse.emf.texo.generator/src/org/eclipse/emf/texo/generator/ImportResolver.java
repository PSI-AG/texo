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
 * $Id: ImportResolver.java,v 1.13 2011/08/25 12:34:30 mtaal Exp $
 */

package org.eclipse.emf.texo.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.emf.texo.utils.Check;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.compiler.IProblem;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jdt.ui.PreferenceConstants;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;

/**
 * Is responsible for creating import statements in a source file based on the fully qualified names present in the
 * source file. The logic:
 * <ul>
 * <li>tries to retain and re-use existing import statements</li>
 * <li>will not create an import statement if not necessary, so types in the same package are not translated to an
 * import statement.</li>
 * <li>will prevent import collisions by</li>
 * </ul>
 * 
 * This resolver does not check if the referred-to types actually exist.
 * 
 * The resolver goes through the following steps:
 * <ol>
 * <li>Collect current import statements and all qualified names</li>
 * <li>Compare the qualified names with current import statements, determine which ones are re-used and which one to
 * remove</li>
 * <li>Create new import declarations for qualified names for which no import statement could be found</li>
 * <li>Sort the importdeclaration according to the project settings</li>
 * <li>Adapt the source file</li>
 * </ol>
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ImportResolver {

  private static final Pattern SEMICOLON_PATTERN = Pattern.compile(";"); //$NON-NLS-1$
  private static final Pattern DOT_PATTERN = Pattern.compile("\\."); //$NON-NLS-1$
  private static final String JAVA_LANG = "java.lang"; //$NON-NLS-1$
  private static final String DOT = "."; //$NON-NLS-1$

  private String source;
  private CompilationUnit compilationUnit;
  private IJavaProject javaProject;

  /**
   * Determine all needed imports, retain existing imports if needed, update import section in the source and replace
   * all qualified names with their non-qualified equivalent (if there is an import statement).
   * 
   * @return the updated source
   */
  public String resolve() {
    Check.isNotNullArgument(source, "source"); //$NON-NLS-1$
    Check.isNotNullArgument(javaProject, "javaProject"); //$NON-NLS-1$

    // get the package name and the list of existing and needed types
    final ImportReferenceCollector importReferenceCollector = new ImportReferenceCollector();
    compilationUnit.accept(importReferenceCollector);

    // get the list of needed imports because of already present
    // non-qualified names.
    final List<ImportDeclaration> importDeclarations = determineCurrentNeededImports(
        importReferenceCollector.getExistingImports(), importReferenceCollector.getQualifiedTypes());

    final List<String> cleanedQualifedNames = cleanQualifiedNames(importReferenceCollector.getQualifiedTypes());

    // now determine which new ones should be added and if so prevent
    // collisions
    final List<String> importedNonQualifiedNames = importedNonQualifiedNames(importDeclarations);
    final List<String> namesToImport = new ArrayList<String>();

    for (String declaredTypeName : importReferenceCollector.getUnqualifiedDeclaredTypes()) {
      importedNonQualifiedNames.add(getLastSegment(declaredTypeName));
    }

    // add all the retained imports also to the list
    for (final ImportDeclaration importDeclaration : importDeclarations) {
      final String nameToImport = importDeclaration.getName().getFullyQualifiedName();
      if (!namesToImport.contains(nameToImport)) {
        namesToImport.add(nameToImport);
      }
    }

    // handle a special case that there is a collision between a class in the same
    // package and a class imported from another package. In this case the class imported
    // from the other package should not be unqualified. This is accomplished by setting the
    // imports for the same package first, then later imports are recognized as collisions
    final String packageName = importReferenceCollector.getPackageName();
    Collections.sort(cleanedQualifedNames, new QualifiedNameSorter(packageName));

    for (final String qualifiedName : cleanedQualifedNames) {
      // already done
      final String correctedQualifiedName = getCorrectQualifiedName(qualifiedName);
      if (namesToImport.contains(correctedQualifiedName)) {
        continue;
      }
      // assume that it is covered by an already existing import
      if (!correctedQualifiedName.contains(DOT)) {
        continue;
      }
      final String lastSegment = getLastSegment(correctedQualifiedName);
      if (importedNonQualifiedNames.contains(lastSegment)) {
        // do not import these names to prevent collisions
        continue;
      }
      // if only one dot then also do not import
      // this is for example values.length (where values is an array)
      if (correctedQualifiedName.indexOf(DOT) == correctedQualifiedName.lastIndexOf(DOT)) {
        continue;
      }

      // prevent collisions later
      importedNonQualifiedNames.add(lastSegment);
      namesToImport.add(correctedQualifiedName);
    }

    final AST ast = compilationUnit.getAST();
    final List<ImportDeclaration> newImports = new ArrayList<ImportDeclaration>();
    for (final String nameToImport : namesToImport) {
      // don't do these ones
      if (inPackage(packageName, nameToImport)) {
        continue;
      }
      final Name name = ast.newName(nameToImport);
      final ImportDeclaration importDeclaration = ast.newImportDeclaration();
      importDeclaration.setOnDemand(false);
      importDeclaration.setStatic(false);
      importDeclaration.setName(name);
      newImports.add(importDeclaration);
    }
    try {
      String newSource = updateSource(namesToImport, newImports, ast, importReferenceCollector.getPackageName());

      // DIRTY HACK: solve an issue that if an EPackage has a sub package with the same
      // name that the import resolving of the subpackage goes wrong
      // for example the KdmModelPackage has a subpackage with the same name: KdmModelPackage
      // this results in this line in the source code:
      // kdm.KdmModelPackage.initialize();
      // which is incorrect
      for (String qualifiedName : cleanedQualifedNames) {
        // find the last two segments
        if (!qualifiedName.contains(DOT)) {
          continue;
        }
        final String[] parts = DOT_PATTERN.split(qualifiedName);
        if (parts.length > 1) {
          final String part1 = parts[parts.length - 2];
          final String part2 = parts[parts.length - 1];
          {
            final String searchString = "\t" + part1 + DOT + part2 + ".initialize();"; //$NON-NLS-1$ //$NON-NLS-2$
            if (newSource.contains(searchString)) {
              newSource = newSource.replace(searchString, "\t" + qualifiedName + ".initialize();"); //$NON-NLS-1$ //$NON-NLS-2$
            }
          }
          {
            final String searchString = " " + part1 + DOT + part2 + ".initialize();"; //$NON-NLS-1$ //$NON-NLS-2$
            if (newSource.contains(searchString)) {
              newSource = newSource.replace(searchString, " " + qualifiedName + ".initialize();"); //$NON-NLS-1$ //$NON-NLS-2$
            }
          }
          {
            final String searchString = "\n" + part1 + DOT + part2 + ".initialize();"; //$NON-NLS-1$ //$NON-NLS-2$
            if (newSource.contains(searchString)) {
              newSource = newSource.replace(searchString, "\n" + qualifiedName + ".initialize();"); //$NON-NLS-1$ //$NON-NLS-2$
            }
          }
        }
      }

      return newSource;
    } catch (final Exception e) {
      throw new IllegalStateException(e);
    }
  }

  /**
   * @param packageName
   *          package name of the current source
   * @param qualifiedName
   *          the qualified name to check against the package name #return true if the qualifiedName is a type directly
   *          contained in the package denoted by the packageName.
   */
  protected boolean inPackage(final String packageName, final String qualifiedName) {
    final int index = qualifiedName.lastIndexOf(DOT);
    if (index == -1) {
      return false;
    }
    final String qualifyingPart = qualifiedName.substring(0, index);
    return qualifyingPart.equals(packageName);
  }

  /**
   * Update the source ({@link #getSource()}):
   * <ul>
   * <li>replace the import declarations with new ones (in the correct sort order)</li>
   * <li>replace all qualified and imported names in the source with their simple variant.</li>
   * </ul>
   * 
   * @param allImportedNames
   *          the list of the qualified names which are imported
   * @param newImports
   *          the new set of import declarations (also contain import declarations from the original source which can be
   *          retained).
   * @param ast
   *          the abstract syntax tree of the original source
   * @param packageName
   *          the java package of the source
   * @return the updated source
   */
  protected String updateSource(final List<String> allImportedNames, final List<ImportDeclaration> newImports,
      final AST ast, final String packageName) throws BadLocationException {

    final ASTRewrite astRewriter = ASTRewrite.create(ast);

    final ImportChangeCollector changeCollector = new ImportChangeCollector();
    changeCollector.setAst(ast);
    changeCollector.setAstRewriter(astRewriter);
    changeCollector.setImportedNames(allImportedNames);
    changeCollector.setPackageName(packageName);
    compilationUnit.accept(changeCollector);

    final IDocument doc = new Document(source);

    // now do the importstatements themselve
    // first remove all the current ones
    final ListRewrite listRewrite = astRewriter.getListRewrite(compilationUnit, CompilationUnit.IMPORTS_PROPERTY);
    for (final Object obj : compilationUnit.imports()) {
      listRewrite.remove((ImportDeclaration) obj, null);
    }

    // then add them all using the sorted list
    final List<ImportDeclaration> sortedImports = sortImports(newImports);
    for (final ImportDeclaration importDeclaration : sortedImports) {
      listRewrite.insertLast(importDeclaration, null);
    }

    // computation of the text edits
    final TextEdit edits = astRewriter.rewriteAST(doc, getJavaProject().getOptions(true));

    // computation of the new source code
    edits.apply(doc);
    return doc.get();
  }

  /**
   * Sorts a list of import declarations taking into account the import order defined for the project (
   * {@link #getJavaProject()}), in addition sort alphabetically.
   * 
   * @param imports
   *          the import declarations to sort
   * @return the sorted import declarations
   */
  protected List<ImportDeclaration> sortImports(final List<ImportDeclaration> imports) {
    // first have them by alphabet
    final List<ImportDeclaration> alphabeticSortedImports = new ArrayList<ImportDeclaration>(imports);
    Collections.sort(alphabeticSortedImports, new ImportDeclarationComparator());

    // now use the preferences
    String order = PreferenceConstants.getPreference(PreferenceConstants.ORGIMPORTS_IMPORTORDER, javaProject);
    if (order.endsWith(";")) { //$NON-NLS-1$
      order = order.substring(0, order.length() - 1);
    }
    final String[] orderedParts = SEMICOLON_PATTERN.split(order, -1);
    final List<ImportDeclaration> sortedImports = new ArrayList<ImportDeclaration>();
    for (String orderPart : orderedParts) {
      if (orderPart.trim().endsWith("*")) { //$NON-NLS-1$
        orderPart = orderPart.trim().substring(0, orderPart.trim().length() - 1);
      }
      final List<ImportDeclaration> toRemove = new ArrayList<ImportDeclaration>();
      for (final ImportDeclaration importDeclaration : alphabeticSortedImports) {
        if (importDeclaration.getName().getFullyQualifiedName().startsWith(orderPart)) {
          sortedImports.add(importDeclaration);
          toRemove.add(importDeclaration);
        }
      }
      alphabeticSortedImports.removeAll(toRemove);
    }
    // add the remaining
    sortedImports.addAll(alphabeticSortedImports);
    return sortedImports;
  }

  // get the already imported names to prevent collisions
  private List<String> importedNonQualifiedNames(final List<ImportDeclaration> importDeclarations) {
    final List<String> result = new ArrayList<String>();
    for (final ImportDeclaration importDeclaration : importDeclarations) {
      // ignore these
      if (importDeclaration.isOnDemand() || importDeclaration.isStatic()) {
        continue;
      }
      result.add(getLastSegment(importDeclaration.getName().getFullyQualifiedName()));
    }
    return result;
  }

  /**
   * Strips a static member name from a fully qualified name (or returns the fully qualified name if there is no such
   * static member). Example:
   * <ul>
   * <li>org.eclipse.emf.texo.Library returns org.eclipse.emf.texo.Library</li>
   * <li>org.eclipse.emf.texo.Library.BOOK_INT_VALUE also returns org.eclipse.emf.texo.Library</li>
   * </ul>
   * Note: uses the heuristic that the class name in a fully qualified name is the first segment starting with an
   * upper-case character.
   * 
   * @param qualifiedName
   *          the qualified name to correct
   * @return the fully qualified class name
   */
  protected String getCorrectQualifiedName(final String qualifiedName) {
    if (!qualifiedName.contains(DOT)) {
      return qualifiedName;
    }
    final String[] parts = DOT_PATTERN.split(qualifiedName);
    final StringBuilder result = new StringBuilder();
    for (final String part : parts) {
      if (result.length() > 0) {
        result.append(DOT);
      }
      result.append(part);
      if (Character.isUpperCase(part.toCharArray()[0])) {
        return result.toString();
      }
    }
    return result.toString();
  }

  /**
   * Gets the last segment denoting the class plus any static member. Examples:
   * <ul>
   * <li>org.eclipse.emf.texo.Library returns Library</li>
   * <li>org.eclipse.emf.texo.Library.BOOK_INT_VALUE returns Library.BOOK_INT_VALUE</li>
   * </ul>
   * 
   * The last segment is identified by checking if the first character of a segment is an upper-case.
   * 
   * @param qualifiedName
   *          the fully qualified name of a type/static value used in the source
   * @return the last segment of a qualified name denoting the type name (plus any constant name)
   * @see #getCorrectQualifiedName(String)
   */
  protected String getLastSegment(final String qualifiedName) {
    if (qualifiedName.contains(DOT)) {
      final String correctedQualifiedName = getCorrectQualifiedName(qualifiedName);
      // the same no special handling
      if (correctedQualifiedName.length() == qualifiedName.length()) {
        final int index = qualifiedName.lastIndexOf(DOT);
        return qualifiedName.substring(1 + index);
      }

      // special case for example:
      // org.eclipse.emf.texo.Library.BOOK_INT_VALUE
      // should return Library.BOOK_INT_VALUE
      // while the import should be org.eclipse.emf.texo.Library
      // also handle this case:
      // org.eclipse.emf.texo.Library.Feature.WRITER
      final int index = correctedQualifiedName.lastIndexOf(DOT);
      return qualifiedName.substring(1 + index);
    }
    return qualifiedName;
  }

  /**
   * Cleans a list of qualified names from names without dot or the ones which start with java.lang.
   * 
   * @param qualifiedNames
   *          the list of qualified names to check
   * @return a cleaned list
   */
  protected List<String> cleanQualifiedNames(final List<String> qualifiedNames) {
    final List<String> cleanList = new ArrayList<String>();
    for (final String qualifiedName : qualifiedNames) {
      if (!isJavaLangClass(qualifiedName) && qualifiedName.contains(DOT)) {
        cleanList.add(qualifiedName);
      }
    }
    return cleanList;
  }

  private boolean isJavaLangClass(String className) {
    if (!className.startsWith(JAVA_LANG)) {
      return false;
    }
    // it starts with java.lang but it can be a sub package
    // java.lang.reflect
    if (className.substring(1 + JAVA_LANG.length()).contains(DOT)) {
      return false;
    }
    return true;
  }

  /**
   * Checks which of the imports is needed because there are non-qualified type names. Note, also static and wild card
   * imports are retained
   * 
   * @param currentImports
   *          the currentImports in the source
   * @param qualifiedNames
   *          the qualified names which have been collected
   * @return the list of imports needed for the existing qualified names
   */
  protected List<ImportDeclaration> determineCurrentNeededImports(final List<ImportDeclaration> currentImports,
      final List<String> qualifiedNames) {
    final List<ImportDeclaration> keepImports = new ArrayList<ImportDeclaration>();

    // keep the special ones
    final List<ImportDeclaration> remainingImports = new ArrayList<ImportDeclaration>(currentImports);
    for (final ImportDeclaration importDeclaration : currentImports) {
      // special cases must have been added manually
      if (importDeclaration.isStatic() || importDeclaration.isOnDemand()) {
        keepImports.add(importDeclaration);
        remainingImports.remove(importDeclaration);
      }
    }

    // keep the ones which are already imported
    // note also handles this name: LibraryPackage.BOOK_INT
    // with this import: org.eclipse.emf.texo.LibraryPackage.
    for (final String qualifiedName : qualifiedNames) {
      final int index = qualifiedName.indexOf(DOT);
      final String checkName;
      if (index != -1) {
        checkName = DOT + qualifiedName.substring(0, index);
      } else {
        checkName = DOT + qualifiedName;
      }
      ImportDeclaration foundDeclaration = null;
      for (final ImportDeclaration importDeclaration : remainingImports) {
        if (importDeclaration.getName().getFullyQualifiedName().endsWith(checkName)) {
          // found
          keepImports.add(importDeclaration);
          foundDeclaration = importDeclaration;
          break;
        }
      }
      if (foundDeclaration != null) {
        remainingImports.remove(foundDeclaration);
      }
    }
    return keepImports;
  }

  public String getSource() {
    return source;
  }

  public void setSource(final String source) {

    final ASTParser parser = ASTParser.newParser(AST.JLS4);
    parser.setKind(ASTParser.K_COMPILATION_UNIT);
    parser.setSource(source.toCharArray());
    compilationUnit = (CompilationUnit) parser.createAST(null);

    final IProblem[] problems = compilationUnit.getProblems();
    if (problems != null && problems.length > 0) {
      final StringBuilder sb = new StringBuilder();
      for (final IProblem problem : problems) {
        sb.append(problem.getSourceLineNumber() + ": " //$NON-NLS-1$
            + problem.getMessage() + "\n"); //$NON-NLS-1$
      }
      throw new IllegalStateException(source + "\n" + sb.toString()); //$NON-NLS-1$
    }

    this.source = source;
  }

  public CompilationUnit getCompilationUnit() {
    return compilationUnit;
  }

  public IJavaProject getJavaProject() {
    return javaProject;
  }

  public void setJavaProject(final IJavaProject javaProject) {
    this.javaProject = javaProject;
  }

  /**
   * Collects all changes in the source by replacing qualified imported names with simple names. The changes are
   * collected in the {@link ASTRewrite}.
   * 
   * The rewrite of the import section is done in the {@link ImportResolver#updateSource(List, List, AST, String)}
   * method.
   * 
   * @author mtaal
   */
  protected class ImportChangeCollector extends ASTVisitor {

    private List<String> importedNames;
    private AST ast;
    private ASTRewrite astRewriter;
    private String packageName;

    public ImportChangeCollector() {
      super(true);
    }

    @Override
    public boolean visit(final QualifiedName node) {
      final String correctedQualifyingName = getCorrectQualifiedName(node.getFullyQualifiedName());

      if (isJavaLangClass(correctedQualifyingName) || inPackage(packageName, correctedQualifyingName)
          || importedNames.contains(correctedQualifyingName)) {
        // note the last segment should not be called with the corrected
        // qualifying name but with the original one!
        // see the special cases for constant imports above.
        final Name newName = ast.newName(getLastSegment(node.getFullyQualifiedName()));
        astRewriter.replace(node, newName, null);
        return false;
      }
      return super.visit(node);
    }

    @Override
    public boolean visit(final ImportDeclaration node) {
      return false;
    }

    public void setImportedNames(final List<String> importedNames) {
      this.importedNames = importedNames;
    }

    public void setAst(final AST ast) {
      this.ast = ast;
    }

    public void setAstRewriter(final ASTRewrite astRewriter) {
      this.astRewriter = astRewriter;
    }

    public void setPackageName(final String packageName) {
      this.packageName = packageName;
    }
  }

  /**
   * Alphabetically sorts import declarations on the fully qualified name.
   * 
   * @author mtaal
   */
  protected class ImportDeclarationComparator implements Comparator<ImportDeclaration> {

    public int compare(final ImportDeclaration id0, final ImportDeclaration id1) {
      return id0.getName().getFullyQualifiedName().compareTo(id1.getName().getFullyQualifiedName());
    }

  }

  /**
   * Is used to sort a list of qualified names so that the qualified names belonging to the java package of the source
   * are located in the beginning.
   * 
   * @author mtaal
   */
  private class QualifiedNameSorter implements Comparator<String> {

    private final String packageName;

    private QualifiedNameSorter(String packageName) {
      this.packageName = packageName;
    }

    public int compare(String qName1, String qName2) {
      final boolean name1InPackage = inPackage(packageName, qName1);
      final boolean name2InPackage = inPackage(packageName, qName2);
      if (name1InPackage == name2InPackage) {
        return 0;
      } else if (name1InPackage) {
        return -1;
      } else {
        return 1;
      }
    }

  }
}
