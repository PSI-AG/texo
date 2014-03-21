/**
 * <copyright>
 * </copyright>
 *
 * $Id: TexoannotationsmodelEditorPlugin.java,v 1.5 2011/08/25 12:55:03 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel.presentation;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.emf.texo.generator.ExtensionPointUtils;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;

/**
 * This is the central singleton for the Texo-annotations-model editor plugin. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
public final class TexoannotationsmodelEditorPlugin extends EMFPlugin {
  /**
   * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final TexoannotationsmodelEditorPlugin INSTANCE = new TexoannotationsmodelEditorPlugin();

  /**
   * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static Implementation plugin;

  /**
   * Create the instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public TexoannotationsmodelEditorPlugin() {
    super(new ResourceLocator[] { EcoreEditPlugin.INSTANCE, });

    // force initialization
    ModelcodegeneratorPackage.eINSTANCE.basicGetESuperPackage();
  }

  /**
   * Returns the singleton instance of the Eclipse plugin. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the singleton instance.
   * @generated
   */
  @Override
  public ResourceLocator getPluginResourceLocator() {
    return plugin;
  }

  /**
   * Returns the singleton instance of the Eclipse plugin. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the singleton instance.
   * @generated
   */
  public static Implementation getPlugin() {
    return plugin;
  }

  /**
   * The actual implementation of the Eclipse <b>Plugin</b>. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class Implementation extends EclipseUIPlugin {
    /**
     * Creates an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Implementation() {
      super();

      // Remember the static instance.
      //
      plugin = this;

      ExtensionPointUtils.readAnnotationsModelsFromExtensions();
    }
  }

}
