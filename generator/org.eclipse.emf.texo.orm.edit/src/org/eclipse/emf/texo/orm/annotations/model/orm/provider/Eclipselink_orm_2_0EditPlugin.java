/**
 * <copyright>
 * </copyright>
 *
 * $Id: Eclipselink_orm_2_0EditPlugin.java,v 1.4 2011/08/25 15:03:10 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Eclipselink_orm_2_0 edit plugin.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public final class Eclipselink_orm_2_0EditPlugin extends EMFPlugin {
  /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public static final Eclipselink_orm_2_0EditPlugin INSTANCE = new Eclipselink_orm_2_0EditPlugin();

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
  public Eclipselink_orm_2_0EditPlugin() {
		super
		  (new ResourceLocator [] {
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
