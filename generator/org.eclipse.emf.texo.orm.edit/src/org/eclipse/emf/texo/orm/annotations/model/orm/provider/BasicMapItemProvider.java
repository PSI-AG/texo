/**
 * <copyright>
 * </copyright>
 *
 * $Id: BasicMapItemProvider.java,v 1.4 2011/08/25 15:03:10 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
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
import org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class BasicMapItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public BasicMapItemProvider(AdapterFactory adapterFactory) {
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

			addKeyConverterPropertyDescriptor(object);
			addValueConverterPropertyDescriptor(object);
			addJoinFetchPropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addFetchPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Key Converter feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addKeyConverterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BasicMap_keyConverter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BasicMap_keyConverter_feature", "_UI_BasicMap_type"),
				 OrmPackage.eINSTANCE.getBasicMap_KeyConverter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Value Converter feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addValueConverterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BasicMap_valueConverter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BasicMap_valueConverter_feature", "_UI_BasicMap_type"),
				 OrmPackage.eINSTANCE.getBasicMap_ValueConverter(),
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
				 getString("_UI_BasicMap_joinFetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BasicMap_joinFetch_feature", "_UI_BasicMap_type"),
				 OrmPackage.eINSTANCE.getBasicMap_JoinFetch(),
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
				 getString("_UI_BasicMap_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BasicMap_access_feature", "_UI_BasicMap_type"),
				 OrmPackage.eINSTANCE.getBasicMap_Access(),
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
				 getString("_UI_BasicMap_fetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BasicMap_fetch_feature", "_UI_BasicMap_type"),
				 OrmPackage.eINSTANCE.getBasicMap_Fetch(),
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
				 getString("_UI_BasicMap_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BasicMap_name_feature", "_UI_BasicMap_type"),
				 OrmPackage.eINSTANCE.getBasicMap_Name(),
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
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicMap_KeyColumn());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicMap_ValueColumn());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicMap_Group());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicMap_CollectionTable());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicMap_BatchFetch());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicMap_Property());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicMap_AccessMethods());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasicMap_Noncacheable());
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
	 * This returns BasicMap.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BasicMap"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((BasicMap)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BasicMap_type") :
			getString("_UI_BasicMap_type") + " " + label;
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

		switch (notification.getFeatureID(BasicMap.class)) {
			case OrmPackage.BASIC_MAP__KEY_CONVERTER:
			case OrmPackage.BASIC_MAP__VALUE_CONVERTER:
			case OrmPackage.BASIC_MAP__JOIN_FETCH:
			case OrmPackage.BASIC_MAP__ACCESS:
			case OrmPackage.BASIC_MAP__FETCH:
			case OrmPackage.BASIC_MAP__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.BASIC_MAP__KEY_COLUMN:
			case OrmPackage.BASIC_MAP__VALUE_COLUMN:
			case OrmPackage.BASIC_MAP__GROUP:
			case OrmPackage.BASIC_MAP__COLLECTION_TABLE:
			case OrmPackage.BASIC_MAP__BATCH_FETCH:
			case OrmPackage.BASIC_MAP__PROPERTY:
			case OrmPackage.BASIC_MAP__ACCESS_METHODS:
			case OrmPackage.BASIC_MAP__NONCACHEABLE:
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
				(OrmPackage.eINSTANCE.getBasicMap_KeyColumn(),
				 OrmFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicMap_ValueColumn(),
				 OrmFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicMap_Group(),
				 FeatureMapUtil.createEntry
					(OrmPackage.eINSTANCE.getBasicMap_Converter(),
					 OrmFactory.eINSTANCE.createConverter())));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicMap_Group(),
				 FeatureMapUtil.createEntry
					(OrmPackage.eINSTANCE.getBasicMap_TypeConverter(),
					 OrmFactory.eINSTANCE.createTypeConverter())));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicMap_Group(),
				 FeatureMapUtil.createEntry
					(OrmPackage.eINSTANCE.getBasicMap_ObjectTypeConverter(),
					 OrmFactory.eINSTANCE.createObjectTypeConverter())));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicMap_Group(),
				 FeatureMapUtil.createEntry
					(OrmPackage.eINSTANCE.getBasicMap_StructConverter(),
					 OrmFactory.eINSTANCE.createStructConverter())));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicMap_CollectionTable(),
				 OrmFactory.eINSTANCE.createEclipselinkCollectionTable()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicMap_BatchFetch(),
				 OrmFactory.eINSTANCE.createBatchFetch()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicMap_Property(),
				 OrmFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicMap_AccessMethods(),
				 OrmFactory.eINSTANCE.createAccessMethods()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasicMap_Noncacheable(),
				 OrmFactory.eINSTANCE.createEmptyType()));
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

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == OrmPackage.eINSTANCE.getBasicMap_KeyColumn() ||
			childFeature == OrmPackage.eINSTANCE.getBasicMap_ValueColumn();

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
