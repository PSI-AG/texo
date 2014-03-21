/**
 * <copyright>
 * </copyright>
 *
 * $Id: BasicCollectionItemProvider.java,v 1.4 2011/08/25 15:03:09 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class BasicCollectionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public BasicCollectionItemProvider(AdapterFactory adapterFactory) {
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

			addConvertPropertyDescriptor(object);
			addJoinFetchPropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addFetchPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Convert feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addConvertPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BasicCollection_convert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BasicCollection_convert_feature", "_UI_BasicCollection_type"),
				 OrmPackage.eINSTANCE.getBasicCollection_Convert(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Join Fetch feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addJoinFetchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BasicCollection_joinFetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BasicCollection_joinFetch_feature", "_UI_BasicCollection_type"),
				 OrmPackage.eINSTANCE.getBasicCollection_JoinFetch(),
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
				 getString("_UI_BasicCollection_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BasicCollection_access_feature", "_UI_BasicCollection_type"),
				 OrmPackage.eINSTANCE.getBasicCollection_Access(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Fetch feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addFetchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BasicCollection_fetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BasicCollection_fetch_feature", "_UI_BasicCollection_type"),
				 OrmPackage.eINSTANCE.getBasicCollection_Fetch(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BasicCollection_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BasicCollection_name_feature", "_UI_BasicCollection_type"),
				 OrmPackage.eINSTANCE.getBasicCollection_Name(),
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
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicCollection_ValueColumn());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicCollection_Converter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicCollection_TypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicCollection_ObjectTypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicCollection_StructConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicCollection_CollectionTable());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicCollection_BatchFetch());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicCollection_Property());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicCollection_AccessMethods());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicCollection_Noncacheable());
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
	 * This returns BasicCollection.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BasicCollection"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((BasicCollection)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BasicCollection_type") :
			getString("_UI_BasicCollection_type") + " " + label;
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

		switch (notification.getFeatureID(BasicCollection.class)) {
			case OrmPackage.BASIC_COLLECTION__CONVERT:
			case OrmPackage.BASIC_COLLECTION__JOIN_FETCH:
			case OrmPackage.BASIC_COLLECTION__ACCESS:
			case OrmPackage.BASIC_COLLECTION__FETCH:
			case OrmPackage.BASIC_COLLECTION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.BASIC_COLLECTION__VALUE_COLUMN:
			case OrmPackage.BASIC_COLLECTION__CONVERTER:
			case OrmPackage.BASIC_COLLECTION__TYPE_CONVERTER:
			case OrmPackage.BASIC_COLLECTION__OBJECT_TYPE_CONVERTER:
			case OrmPackage.BASIC_COLLECTION__STRUCT_CONVERTER:
			case OrmPackage.BASIC_COLLECTION__COLLECTION_TABLE:
			case OrmPackage.BASIC_COLLECTION__BATCH_FETCH:
			case OrmPackage.BASIC_COLLECTION__PROPERTY:
			case OrmPackage.BASIC_COLLECTION__ACCESS_METHODS:
			case OrmPackage.BASIC_COLLECTION__NONCACHEABLE:
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
				(OrmPackage.eINSTANCE.getBasicCollection_ValueColumn(),
				 OrmFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicCollection_Converter(),
				 OrmFactory.eINSTANCE.createConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicCollection_TypeConverter(),
				 OrmFactory.eINSTANCE.createTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicCollection_ObjectTypeConverter(),
				 OrmFactory.eINSTANCE.createObjectTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicCollection_StructConverter(),
				 OrmFactory.eINSTANCE.createStructConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicCollection_CollectionTable(),
				 OrmFactory.eINSTANCE.createEclipselinkCollectionTable()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicCollection_BatchFetch(),
				 OrmFactory.eINSTANCE.createBatchFetch()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicCollection_Property(),
				 OrmFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicCollection_AccessMethods(),
				 OrmFactory.eINSTANCE.createAccessMethods()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicCollection_Noncacheable(),
				 OrmFactory.eINSTANCE.createEmptyType()));
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
