/**
 * <copyright>
 *
 * Copyright (c) 2012 Springsite BV (The Netherlands) and others
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
 * $Id: Annotator.java,v 1.6 2011/08/25 12:34:30 mtaal Exp $
 */

package org.eclipse.emf.texo.generator;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.texo.component.ComponentProvider;

/**
 * Base type for all xtend2 templates.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public abstract class BaseTemplate {
  private ArtifactGenerator artifactGenerator;

  private Map<String, String> files = new HashMap<String, String>();

  protected boolean executeOverrides(Object mainObject) {
    for (String override : getTemplateOverrides()) {
      if (getArtifactGenerator().getResourceManager().doesCustomTemplateExists(override)) {
        doExecuteXPandTemplate(override, mainObject);
        return true;
      }
    }
    return false;
  }

  public void addFile(String name, String content) {
    files.put(name, content);
  }

  public void addFiles(Map<String, String> newFiles) {
    files.putAll(newFiles);
  }

  public void clearFiles() {
    files.clear();
  }

  public Map<String, String> getFiles() {
    return files;
  }

  public ModelController getModelController() {
    return getArtifactGenerator().getModelController();
  }

  protected List<String> getTemplateOverrides() {
    return Collections.emptyList();
  }

  protected String executeXPandTemplate(String template, Object mainObject) {
    final XPandTemplate xpand = ComponentProvider.getInstance().newInstance(XPandTemplate.class);
    xpand.setArtifactGenerator(getArtifactGenerator());
    xpand.setMainObject(mainObject);
    xpand.setXPandTemplate(template);
    xpand.generate();
    return xpand.getAllContent();
  }

  protected void doExecuteXPandTemplate(String template, Object mainObject) {
    final XPandTemplate xpand = ComponentProvider.getInstance().newInstance(XPandTemplate.class);
    xpand.setArtifactGenerator(getArtifactGenerator());
    xpand.setMainObject(mainObject);
    xpand.setXPandTemplate(template);
    xpand.generate();
    addFiles(xpand.getFiles());
  }

  public ArtifactGenerator getArtifactGenerator() {
    return artifactGenerator;
  }

  public void setArtifactGenerator(ArtifactGenerator artifactGenerator) {
    this.artifactGenerator = artifactGenerator;
  }
}
