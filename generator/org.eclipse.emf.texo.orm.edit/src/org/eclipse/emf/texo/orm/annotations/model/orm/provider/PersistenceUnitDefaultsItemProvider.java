/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersistenceUnitDefaultsItemProvider.java,v 1.4 2011/08/25 15:03:10 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class PersistenceUnitDefaultsItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public PersistenceUnitDefaultsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDescriptionPropertyDescriptor(object);
			addSchemaPropertyDescriptor(object);
			addCatalogPropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersistenceUnitDefaults_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersistenceUnitDefaults_description_feature", "_UI_PersistenceUnitDefaults_type"),
				 OrmPackage.eINSTANCE.getPersistenceUnitDefaults_Description(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Schema feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addSchemaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersistenceUnitDefaults_schema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersistenceUnitDefaults_schema_feature", "_UI_PersistenceUnitDefaults_type"),
				 OrmPackage.eINSTANCE.getPersistenceUnitDefaults_Schema(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Catalog feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addCatalogPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersistenceUnitDefaults_catalog_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersistenceUnitDefaults_catalog_feature", "_UI_PersistenceUnitDefaults_type"),
				 OrmPackage.eINSTANCE.getPersistenceUnitDefaults_Catalog(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Access feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addAccessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersistenceUnitDefaults_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersistenceUnitDefaults_access_feature", "_UI_PersistenceUnitDefaults_type"),
				 OrmPackage.eINSTANCE.getPersistenceUnitDefaults_Access(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OrmPackage.eINSTANCE.getPersistenceUnitDefaults_DelimitedIdentifiers());
			childrenFeatures.add(OrmPackage.eINSTANCE.getPersistenceUnitDefaults_AccessMethods());
			childrenFeatures.add(OrmPackage.eINSTANCE.getPersistenceUnitDefaults_CascadePersist());
			childrenFeatures.add(OrmPackage.eINSTANCE.getPersistenceUnitDefaults_TenantDiscriminator());
			childrenFeatures.add(OrmPackage.eINSTANCE.getPersistenceUnitDefaults_EntityListeners());
		}
		return childrenFeatures;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

  /**
	 * This returns PersistenceUnitDefaults.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PersistenceUnitDefaults"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((PersistenceUnitDefaults)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_PersistenceUnitDefaults_type") :
			getString("_UI_PersistenceUnitDefaults_type") + " " + label;
	}

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PersistenceUnitDefaults.class)) {
			case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DESCRIPTION:
			case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__SCHEMA:
			case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CATALOG:
			case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__DELIMITED_IDENTIFIERS:
			case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ACCESS_METHODS:
			case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST:
			case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__TENANT_DISCRIMINATOR:
			case OrmPackage.PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

  /**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getPersistenceUnitDefaults_DelimitedIdentifiers(),
				 OrmFactory.eINSTANCE.createEmptyType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getPersistenceUnitDefaults_AccessMethods(),
				 OrmFactory.eINSTANCE.createAccessMethods()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getPersistenceUnitDefaults_CascadePersist(),
				 OrmFactory.eINSTANCE.createEmptyType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getPersistenceUnitDefaults_TenantDiscriminator(),
				 OrmFactory.eINSTANCE.createTenantDiscriminator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getPersistenceUnitDefaults_EntityListeners(),
				 OrmFactory.eINSTANCE.createEntityListeners()));
	}

  /**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == OrmPackage.eINSTANCE.getPersistenceUnitDefaults_DelimitedIdentifiers() ||
			childFeature == OrmPackage.eINSTANCE.getPersistenceUnitDefaults_CascadePersist();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

  /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator() {
		return Eclipselink_ormEditPlugin.INSTANCE;
	}

}
