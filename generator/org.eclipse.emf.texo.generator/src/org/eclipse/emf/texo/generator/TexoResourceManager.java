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
 *   OpenArchitectureWare - some lines copied from org.eclipse.xtend.expression.ResourceManagerDefaultImpl
 *
 * </copyright>
 *
 * $Id: TexoResourceManager.java,v 1.3 2011/08/25 12:34:30 mtaal Exp $
 */

package org.eclipse.emf.texo.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.texo.component.TexoComponent;
import org.eclipse.emf.texo.utils.Check;
import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;
import org.eclipse.xpand2.XpandUtil;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.expression.ResourceManagerDefaultImpl;
import org.eclipse.xtend.expression.ResourceParser;

/**
 * Special XPand resource manager that reads templates from a project if present in the project.
 * 
 * Note a few lines have been copied from org.eclipse.xtend.expression.ResourceManagerDefaultImpl
 * 
 * @author mtaal
 */
public class TexoResourceManager extends ResourceManagerDefaultImpl implements TexoComponent {

  public static final QualifiedName TEMPLATE_FOLDER_PROPERTY = new QualifiedName(
      "org.eclipse.emf.texo.eclipse", "TEMPLATE_FOLDER"); //$NON-NLS-1$ //$NON-NLS-2$

  private static final String TEMPLATES_LOCATION_PROPERTY = "TEMPLATE_FOLDER"; //$NON-NLS-1$

  private final Map<String, Resource> resources = new HashMap<String, Resource>();

  private File templateFolder;

  public void setProjectName(String projectName) {
    final IProject project = EclipseGeneratorUtils.getProject(projectName);
    final String projectFilePath = EclipseGeneratorUtils.getProjectFilePath(projectName);
    final File projectDirectory = new File(projectFilePath);
    final String templateFolderPath = getTemplateFolderPath(project);
    if (templateFolderPath != null) {
      templateFolder = new File(projectDirectory, templateFolderPath);
      if (!templateFolder.exists()) {
        templateFolder = null;
      }
    } else {
      templateFolder = null;
    }
  }

  /**
   * Returns true if the project has an override or implementation for a specific template.
   */
  public boolean doesCustomTemplateExists(String fullyQualifiedName) {
    final String resourceName = fullyQualifiedName.replace(SyntaxConstants.NS_DELIM, "/") + "." //$NON-NLS-1$//$NON-NLS-2$
        + XpandUtil.TEMPLATE_EXTENSION;
    File resourceFile = null;
    if (templateFolder != null) {
      resourceFile = new File(templateFolder, resourceName);
      return resourceFile.exists();
    }
    return false;
  }

  @Override
  public Resource loadResource(String fullyQualifiedName, String extension) {
    final String resourceName = fullyQualifiedName.replace(SyntaxConstants.NS_DELIM, "/") + "." //$NON-NLS-1$//$NON-NLS-2$
        + extension;
    if (resources.containsKey(resourceName)) {
      return resources.get(resourceName);
    }
    File resourceFile = null;
    final boolean useDefaultResourceManager;
    if (templateFolder != null) {
      resourceFile = new File(templateFolder, resourceName);
      useDefaultResourceManager = !resourceFile.exists();
    } else {
      useDefaultResourceManager = true;
    }

    if (useDefaultResourceManager) {
      final Resource resource = super.loadResource(fullyQualifiedName, extension);
      resources.put(resourceName, resource);
      return resource;
    }
    Check.isNotNull(resourceFile, "Resourcefile may not be null at this point"); //$NON-NLS-1$
    try {
      final InputStream in = new FileInputStream(resourceFile);

      final Reader reader = createReader(in);
      final ResourceParser parser = registeredParsers.get(extension);
      if (parser == null) {
        throw new RuntimeException("No Parser registered for extension '" + extension //$NON-NLS-1$
            + "'! Known extensions are '" + registeredParsers.keySet() + "'"); //$NON-NLS-1$//$NON-NLS-2$
      }
      final Resource res = parser.parse(reader, resourceName);
      res.setFullyQualifiedName(fullyQualifiedName);
      resources.put(resourceName, res);
      return res;
    } catch (Exception e) {
      throw new IllegalStateException("Exception loading resource " + resourceName, e); //$NON-NLS-1$
    }
  }

  private String getTemplateFolderPath(IProject project) {
    final IPath settingsPath = project.getLocation().append(".settings"); //$NON-NLS-1$
    final File settingsDir = settingsPath.toFile();
    if (!settingsDir.exists()) {
      settingsDir.mkdir();
    }
    final IPath iPath = settingsPath.append("org.eclipse.emf.texo.prefs"); //$NON-NLS-1$ 
    final File file = iPath.toFile();
    try {
      if (file.exists()) {
        final Properties props = new Properties();
        final InputStream is = new FileInputStream(file);
        props.load(is);
        is.close();
        return (String) props.get(TEMPLATES_LOCATION_PROPERTY);
      }

      return project.getPersistentProperty(TEMPLATE_FOLDER_PROPERTY);
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }
}
