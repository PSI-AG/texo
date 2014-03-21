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
 * $Id: ArtifactGenerator.java,v 1.18 2011/09/21 14:03:58 mtaal Exp $
 */
package org.eclipse.emf.texo.generator;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.texo.component.TexoComponent;
import org.eclipse.emf.texo.utils.Check;
import org.eclipse.internal.xpand2.XpandTokens;
import org.eclipse.internal.xpand2.ast.Definition;
import org.eclipse.internal.xpand2.ast.ExpandStatement;
import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.internal.xpand2.parser.XpandParseFacade;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.ExceptionHandler;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.type.impl.java.JavaMetaModel;

/**
 * Allows xpand templates to be called as part of a xtend run.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class XPandTemplate extends BaseTemplate implements TexoComponent {

  private static final String MAIN_OBJECT = "mainObject"; //$NON-NLS-1$

  private Object mainObject;
  private String expand;
  private String template;

  private String generatedContent = ""; //$NON-NLS-1$

  private Map<String, String> files = new HashMap<String, String>();

  public void generate() {

    final TexoResourceManager resourceManager = getArtifactGenerator().getResourceManager();

    // don't do anything in this case
    if (!resourceManager.doesCustomTemplateExists(template)) {
      return;
    }

    final Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put(ArtifactGenerator.MODEL_CONTROLLER, getModelController());
    parameters.put(ArtifactGenerator.DO_DAO, getArtifactGenerator().isDoDao());
    parameters.put(MAIN_OBJECT, mainObject);

    final OutputCapture out = new OutputCapture();

    XpandExecutionContextImpl executionContext = new XpandExecutionContextImpl(resourceManager, out, null,
        new HashMap<String, Variable>(), null, getExceptionHandler(), null, null);

    executionContext.registerMetaModel(new JavaMetaModel());

    final ExpandStatement es = getStatement();

    for (final String name : parameters.keySet()) {
      executionContext = (XpandExecutionContextImpl) executionContext.cloneWithVariable(new Variable(name, parameters
          .get(name)));
    }

    es.evaluate(executionContext);

    // remaining content, store it somewhere
    if (out.getCurrentFile() == null && out.getCurrentContent().trim().length() > 0) {
      generatedContent = out.getCurrentContent().trim();
    }
  }

  public String getAllContent() {
    final StringBuilder sb = new StringBuilder();
    for (String content : getFiles().values()) {
      if (sb.length() > 0) {
        sb.append("\n"); //$NON-NLS-1$
      }
      sb.append(content);
    }

    // and get any remaining content not stored in files
    sb.append(generatedContent);

    return sb.toString();
  }

  private ExpandStatement getStatement() {
    Check.isNotNull(expand, "Template/expand not set"); //$NON-NLS-1$

    final Template tpl = XpandParseFacade.file(new StringReader(XpandTokens.LT + "DEFINE test FOR test" //$NON-NLS-1$
        + XpandTokens.RT + XpandTokens.LT + "EXPAND " + expand + XpandTokens.RT + XpandTokens.LT //$NON-NLS-1$
        + "ENDDEFINE" + XpandTokens.RT), null); //$NON-NLS-1$
    return (ExpandStatement) ((Definition) tpl.getDefinitions()[0]).getBody()[1];
  }

  protected ExceptionHandler getExceptionHandler() {
    return new ExceptionHandler() {
      public void handleRuntimeException(RuntimeException ex, SyntaxElement element, ExecutionContext ctx,
          Map<String, Object> additionalContextInfo) {
        throw ex;
      }
    };
  }

  @Override
  public void addFile(String name, String content) {
    files.put(name, content);
  }

  @Override
  public void addFiles(Map<String, String> newFiles) {
    files.putAll(newFiles);
  }

  @Override
  public void clearFiles() {
    files.clear();
  }

  @Override
  public Map<String, String> getFiles() {
    return files;
  }

  protected Object getMainObject() {
    return mainObject;
  }

  protected void setMainObject(Object mainObject) {
    this.mainObject = mainObject;
  }

  /**
   * Parameter expected is something like this: org::eclipse::emf::texo::modelgenerator::templates::entity_addition
   * which will become a statement like this: «EXPAND
   * org::eclipse::emf::texo::modelgenerator::templates::entity_addition::root(modelController) FOR this»
   * 
   * @param template
   */
  public void setXPandTemplate(String template) {
    this.template = template;
    if (template.endsWith("modelpackage")) { //$NON-NLS-1$
      this.expand = template + "::root(modelController, doDao) FOR mainObject"; //$NON-NLS-1$
    } else {
      this.expand = template + "::root(modelController) FOR mainObject"; //$NON-NLS-1$
    }
  }

  private class OutputCapture extends OutputImpl {

    private String currentFile;
    private String currentContent = ""; //$NON-NLS-1$

    @Override
    public void write(String bytes) {
      currentContent += bytes;
      super.write(bytes);
    }

    @Override
    public void openFile(String path, String outletName) {
      if (super.getOutlet(outletName) == null) {
        final Outlet localOutlet = new Outlet();
        localOutlet.setName(outletName);
        super.addOutlet(localOutlet);
      }
      currentFile = path;
      currentContent = ""; //$NON-NLS-1$
      super.openFile(path, outletName);
    }

    @Override
    public void closeFile() {
      XPandTemplate.this.addFile(currentFile, current().getBuffer().toString());
    }

    protected String getCurrentFile() {
      return currentFile;
    }

    protected String getCurrentContent() {
      return currentContent.trim();
    }
  }
}
