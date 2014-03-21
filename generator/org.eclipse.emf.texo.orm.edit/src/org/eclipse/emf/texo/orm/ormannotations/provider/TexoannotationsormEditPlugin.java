/**
 * <copyright>
 * </copyright>
 *
 * $Id: TexoannotationsormEditPlugin.java,v 1.6 2011/09/23 20:59:49 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.emf.texo.annotations.annotationsmodel.provider.TexoannotationsmodelEditPlugin;
import org.eclipse.emf.texo.orm.annotations.model.orm.provider.Eclipselink_ormEditPlugin;

/**
 * This is the central singleton for the Texo-annotations-orm edit plugin.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public final class TexoannotationsormEditPlugin extends EMFPlugin {
  /**
   * Keep track of the singleton.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final TexoannotationsormEditPlugin INSTANCE = new TexoannotationsormEditPlugin();

  /**
   * Keep track of the singleton.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static Implementation plugin;

  /**
   * Create the instance.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TexoannotationsormEditPlugin() {
    super
      (new ResourceLocator [] {
         Eclipselink_ormEditPlugin.INSTANCE,
         EcoreEditPlugin.INSTANCE,
         TexoannotationsmodelEditPlugin.INSTANCE,
       });
  }

  /**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
  @Override
  public ResourceLocator getPluginResourceLocator() {
    return plugin;
  }

  /**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
  public static Implementation getPlugin() {
    return plugin;
  }

  /**
   * The actual implementation of the Eclipse <b>Plugin</b>.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static class Implementation extends EclipsePlugin {
    /**
     * Creates an instance.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Implementation() {
      super();

      // Remember the static instance.
      //
      plugin = this;
    }
  }

}
