/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManyToOneItemProvider.java,v 1.4 2011/08/25 15:03:09 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ManyToOneItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public ManyToOneItemProvider(AdapterFactory adapterFactory) {
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

			addJoinFetchPropertyDescriptor(object);
			addPartitionedPropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addFetchPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addMapsIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addOptionalPropertyDescriptor(object);
			addTargetEntityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_ManyToOne_joinFetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_joinFetch_feature", "_UI_ManyToOne_type"),
				 OrmPackage.eINSTANCE.getManyToOne_JoinFetch(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Partitioned feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartitionedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_partitioned_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_partitioned_feature", "_UI_ManyToOne_type"),
				 OrmPackage.eINSTANCE.getManyToOne_Partitioned(),
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
				 getString("_UI_ManyToOne_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_access_feature", "_UI_ManyToOne_type"),
				 OrmPackage.eINSTANCE.getManyToOne_Access(),
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
				 getString("_UI_ManyToOne_fetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_fetch_feature", "_UI_ManyToOne_type"),
				 OrmPackage.eINSTANCE.getManyToOne_Fetch(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_id_feature", "_UI_ManyToOne_type"),
				 OrmPackage.eINSTANCE.getManyToOne_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Maps Id feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addMapsIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_mapsId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_mapsId_feature", "_UI_ManyToOne_type"),
				 OrmPackage.eINSTANCE.getManyToOne_MapsId(),
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
				 getString("_UI_ManyToOne_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_name_feature", "_UI_ManyToOne_type"),
				 OrmPackage.eINSTANCE.getManyToOne_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Optional feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_optional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_optional_feature", "_UI_ManyToOne_type"),
				 OrmPackage.eINSTANCE.getManyToOne_Optional(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Target Entity feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addTargetEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManyToOne_targetEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManyToOne_targetEntity_feature", "_UI_ManyToOne_type"),
				 OrmPackage.eINSTANCE.getManyToOne_TargetEntity(),
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
			childrenFeatures.add(OrmPackage.eINSTANCE.getManyToOne_JoinColumn());
			childrenFeatures.add(OrmPackage.eINSTANCE.getManyToOne_JoinTable());
			childrenFeatures.add(OrmPackage.eINSTANCE.getManyToOne_Cascade());
			childrenFeatures.add(OrmPackage.eINSTANCE.getManyToOne_BatchFetch());
			childrenFeatures.add(OrmPackage.eINSTANCE.getManyToOne_Property());
			childrenFeatures.add(OrmPackage.eINSTANCE.getManyToOne_AccessMethods());
			childrenFeatures.add(OrmPackage.eINSTANCE.getManyToOne_Noncacheable());
			childrenFeatures.add(OrmPackage.eINSTANCE.getManyToOne_Partitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getManyToOne_ReplicationPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getManyToOne_RoundRobinPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getManyToOne_PinnedPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getManyToOne_RangePartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getManyToOne_ValuePartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getManyToOne_HashPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getManyToOne_UnionPartitioning());
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
	 * This returns ManyToOne.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ManyToOne"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((ManyToOne)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ManyToOne_type") :
			getString("_UI_ManyToOne_type") + " " + label;
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

		switch (notification.getFeatureID(ManyToOne.class)) {
			case OrmPackage.MANY_TO_ONE__JOIN_FETCH:
			case OrmPackage.MANY_TO_ONE__PARTITIONED:
			case OrmPackage.MANY_TO_ONE__ACCESS:
			case OrmPackage.MANY_TO_ONE__FETCH:
			case OrmPackage.MANY_TO_ONE__ID:
			case OrmPackage.MANY_TO_ONE__MAPS_ID:
			case OrmPackage.MANY_TO_ONE__NAME:
			case OrmPackage.MANY_TO_ONE__OPTIONAL:
			case OrmPackage.MANY_TO_ONE__TARGET_ENTITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.MANY_TO_ONE__JOIN_COLUMN:
			case OrmPackage.MANY_TO_ONE__JOIN_TABLE:
			case OrmPackage.MANY_TO_ONE__CASCADE:
			case OrmPackage.MANY_TO_ONE__BATCH_FETCH:
			case OrmPackage.MANY_TO_ONE__PROPERTY:
			case OrmPackage.MANY_TO_ONE__ACCESS_METHODS:
			case OrmPackage.MANY_TO_ONE__NONCACHEABLE:
			case OrmPackage.MANY_TO_ONE__PARTITIONING:
			case OrmPackage.MANY_TO_ONE__REPLICATION_PARTITIONING:
			case OrmPackage.MANY_TO_ONE__ROUND_ROBIN_PARTITIONING:
			case OrmPackage.MANY_TO_ONE__PINNED_PARTITIONING:
			case OrmPackage.MANY_TO_ONE__RANGE_PARTITIONING:
			case OrmPackage.MANY_TO_ONE__VALUE_PARTITIONING:
			case OrmPackage.MANY_TO_ONE__HASH_PARTITIONING:
			case OrmPackage.MANY_TO_ONE__UNION_PARTITIONING:
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
				(OrmPackage.eINSTANCE.getManyToOne_JoinColumn(),
				 OrmFactory.eINSTANCE.createJoinColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getManyToOne_JoinTable(),
				 OrmFactory.eINSTANCE.createJoinTable()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getManyToOne_Cascade(),
				 OrmFactory.eINSTANCE.createCascadeType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getManyToOne_BatchFetch(),
				 OrmFactory.eINSTANCE.createBatchFetch()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getManyToOne_Property(),
				 OrmFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getManyToOne_AccessMethods(),
				 OrmFactory.eINSTANCE.createAccessMethods()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getManyToOne_Noncacheable(),
				 OrmFactory.eINSTANCE.createEmptyType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getManyToOne_Partitioning(),
				 OrmFactory.eINSTANCE.createPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getManyToOne_ReplicationPartitioning(),
				 OrmFactory.eINSTANCE.createReplicationPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getManyToOne_RoundRobinPartitioning(),
				 OrmFactory.eINSTANCE.createRoundRobinPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getManyToOne_PinnedPartitioning(),
				 OrmFactory.eINSTANCE.createPinnedPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getManyToOne_RangePartitioning(),
				 OrmFactory.eINSTANCE.createRangePartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getManyToOne_ValuePartitioning(),
				 OrmFactory.eINSTANCE.createValuePartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getManyToOne_HashPartitioning(),
				 OrmFactory.eINSTANCE.createHashPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getManyToOne_UnionPartitioning(),
				 OrmFactory.eINSTANCE.createUnionPartitioning()));
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
