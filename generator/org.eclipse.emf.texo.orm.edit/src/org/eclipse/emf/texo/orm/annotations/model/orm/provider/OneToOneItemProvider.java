/**
 * <copyright>
 * </copyright>
 *
 * $Id: OneToOneItemProvider.java,v 1.4 2011/08/25 15:03:09 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class OneToOneItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public OneToOneItemProvider(AdapterFactory adapterFactory) {
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

			addCascadeOnDeletePropertyDescriptor(object);
			addJoinFetchPropertyDescriptor(object);
			addPartitionedPropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addFetchPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addMappedByPropertyDescriptor(object);
			addMapsIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addOptionalPropertyDescriptor(object);
			addOrphanRemovalPropertyDescriptor(object);
			addTargetEntityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Cascade On Delete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCascadeOnDeletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OneToOne_cascadeOnDelete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToOne_cascadeOnDelete_feature", "_UI_OneToOne_type"),
				 OrmPackage.eINSTANCE.getOneToOne_CascadeOnDelete(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_OneToOne_joinFetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToOne_joinFetch_feature", "_UI_OneToOne_type"),
				 OrmPackage.eINSTANCE.getOneToOne_JoinFetch(),
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
				 getString("_UI_OneToOne_partitioned_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToOne_partitioned_feature", "_UI_OneToOne_type"),
				 OrmPackage.eINSTANCE.getOneToOne_Partitioned(),
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
				 getString("_UI_OneToOne_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToOne_access_feature", "_UI_OneToOne_type"),
				 OrmPackage.eINSTANCE.getOneToOne_Access(),
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
				 getString("_UI_OneToOne_fetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToOne_fetch_feature", "_UI_OneToOne_type"),
				 OrmPackage.eINSTANCE.getOneToOne_Fetch(),
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
				 getString("_UI_OneToOne_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToOne_id_feature", "_UI_OneToOne_type"),
				 OrmPackage.eINSTANCE.getOneToOne_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Mapped By feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addMappedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OneToOne_mappedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToOne_mappedBy_feature", "_UI_OneToOne_type"),
				 OrmPackage.eINSTANCE.getOneToOne_MappedBy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_OneToOne_mapsId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToOne_mapsId_feature", "_UI_OneToOne_type"),
				 OrmPackage.eINSTANCE.getOneToOne_MapsId(),
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
				 getString("_UI_OneToOne_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToOne_name_feature", "_UI_OneToOne_type"),
				 OrmPackage.eINSTANCE.getOneToOne_Name(),
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
				 getString("_UI_OneToOne_optional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToOne_optional_feature", "_UI_OneToOne_type"),
				 OrmPackage.eINSTANCE.getOneToOne_Optional(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Orphan Removal feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addOrphanRemovalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OneToOne_orphanRemoval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToOne_orphanRemoval_feature", "_UI_OneToOne_type"),
				 OrmPackage.eINSTANCE.getOneToOne_OrphanRemoval(),
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
				 getString("_UI_OneToOne_targetEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToOne_targetEntity_feature", "_UI_OneToOne_type"),
				 OrmPackage.eINSTANCE.getOneToOne_TargetEntity(),
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
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_PrimaryKeyJoinColumn());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_JoinColumn());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_JoinTable());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_Cascade());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_PrivateOwned());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_BatchFetch());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_Property());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_AccessMethods());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_Noncacheable());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_Partitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_ReplicationPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_RoundRobinPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_PinnedPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_RangePartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_ValuePartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_HashPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToOne_UnionPartitioning());
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
	 * This returns OneToOne.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OneToOne"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((OneToOne)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OneToOne_type") :
			getString("_UI_OneToOne_type") + " " + label;
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

		switch (notification.getFeatureID(OneToOne.class)) {
			case OrmPackage.ONE_TO_ONE__CASCADE_ON_DELETE:
			case OrmPackage.ONE_TO_ONE__JOIN_FETCH:
			case OrmPackage.ONE_TO_ONE__PARTITIONED:
			case OrmPackage.ONE_TO_ONE__ACCESS:
			case OrmPackage.ONE_TO_ONE__FETCH:
			case OrmPackage.ONE_TO_ONE__ID:
			case OrmPackage.ONE_TO_ONE__MAPPED_BY:
			case OrmPackage.ONE_TO_ONE__MAPS_ID:
			case OrmPackage.ONE_TO_ONE__NAME:
			case OrmPackage.ONE_TO_ONE__OPTIONAL:
			case OrmPackage.ONE_TO_ONE__ORPHAN_REMOVAL:
			case OrmPackage.ONE_TO_ONE__TARGET_ENTITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMN:
			case OrmPackage.ONE_TO_ONE__JOIN_COLUMN:
			case OrmPackage.ONE_TO_ONE__JOIN_TABLE:
			case OrmPackage.ONE_TO_ONE__CASCADE:
			case OrmPackage.ONE_TO_ONE__PRIVATE_OWNED:
			case OrmPackage.ONE_TO_ONE__BATCH_FETCH:
			case OrmPackage.ONE_TO_ONE__PROPERTY:
			case OrmPackage.ONE_TO_ONE__ACCESS_METHODS:
			case OrmPackage.ONE_TO_ONE__NONCACHEABLE:
			case OrmPackage.ONE_TO_ONE__PARTITIONING:
			case OrmPackage.ONE_TO_ONE__REPLICATION_PARTITIONING:
			case OrmPackage.ONE_TO_ONE__ROUND_ROBIN_PARTITIONING:
			case OrmPackage.ONE_TO_ONE__PINNED_PARTITIONING:
			case OrmPackage.ONE_TO_ONE__RANGE_PARTITIONING:
			case OrmPackage.ONE_TO_ONE__VALUE_PARTITIONING:
			case OrmPackage.ONE_TO_ONE__HASH_PARTITIONING:
			case OrmPackage.ONE_TO_ONE__UNION_PARTITIONING:
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
				(OrmPackage.eINSTANCE.getOneToOne_PrimaryKeyJoinColumn(),
				 OrmFactory.eINSTANCE.createPrimaryKeyJoinColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_JoinColumn(),
				 OrmFactory.eINSTANCE.createJoinColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_JoinTable(),
				 OrmFactory.eINSTANCE.createJoinTable()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_Cascade(),
				 OrmFactory.eINSTANCE.createCascadeType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_PrivateOwned(),
				 OrmFactory.eINSTANCE.createEmptyType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_BatchFetch(),
				 OrmFactory.eINSTANCE.createBatchFetch()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_Property(),
				 OrmFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_AccessMethods(),
				 OrmFactory.eINSTANCE.createAccessMethods()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_Noncacheable(),
				 OrmFactory.eINSTANCE.createEmptyType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_Partitioning(),
				 OrmFactory.eINSTANCE.createPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_ReplicationPartitioning(),
				 OrmFactory.eINSTANCE.createReplicationPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_RoundRobinPartitioning(),
				 OrmFactory.eINSTANCE.createRoundRobinPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_PinnedPartitioning(),
				 OrmFactory.eINSTANCE.createPinnedPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_RangePartitioning(),
				 OrmFactory.eINSTANCE.createRangePartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_ValuePartitioning(),
				 OrmFactory.eINSTANCE.createValuePartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_HashPartitioning(),
				 OrmFactory.eINSTANCE.createHashPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToOne_UnionPartitioning(),
				 OrmFactory.eINSTANCE.createUnionPartitioning()));
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
			childFeature == OrmPackage.eINSTANCE.getOneToOne_PrivateOwned() ||
			childFeature == OrmPackage.eINSTANCE.getOneToOne_Noncacheable();

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
