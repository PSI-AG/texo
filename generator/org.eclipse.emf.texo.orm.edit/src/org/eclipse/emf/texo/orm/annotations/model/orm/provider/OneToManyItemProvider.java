/**
 * <copyright>
 * </copyright>
 *
 * $Id: OneToManyItemProvider.java,v 1.4 2011/08/25 15:03:10 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class OneToManyItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public OneToManyItemProvider(AdapterFactory adapterFactory) {
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

			addOrderByPropertyDescriptor(object);
			addMapKeyTemporalPropertyDescriptor(object);
			addMapKeyEnumeratedPropertyDescriptor(object);
			addMapKeyConvertPropertyDescriptor(object);
			addCascadeOnDeletePropertyDescriptor(object);
			addJoinFetchPropertyDescriptor(object);
			addPartitionedPropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addAttributeTypePropertyDescriptor(object);
			addFetchPropertyDescriptor(object);
			addMappedByPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addOrphanRemovalPropertyDescriptor(object);
			addTargetEntityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Order By feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addOrderByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OneToMany_orderBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToMany_orderBy_feature", "_UI_OneToMany_type"),
				 OrmPackage.eINSTANCE.getOneToMany_OrderBy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Map Key Temporal feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addMapKeyTemporalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OneToMany_mapKeyTemporal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToMany_mapKeyTemporal_feature", "_UI_OneToMany_type"),
				 OrmPackage.eINSTANCE.getOneToMany_MapKeyTemporal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Map Key Enumerated feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addMapKeyEnumeratedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OneToMany_mapKeyEnumerated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToMany_mapKeyEnumerated_feature", "_UI_OneToMany_type"),
				 OrmPackage.eINSTANCE.getOneToMany_MapKeyEnumerated(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Map Key Convert feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addMapKeyConvertPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OneToMany_mapKeyConvert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToMany_mapKeyConvert_feature", "_UI_OneToMany_type"),
				 OrmPackage.eINSTANCE.getOneToMany_MapKeyConvert(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_OneToMany_cascadeOnDelete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToMany_cascadeOnDelete_feature", "_UI_OneToMany_type"),
				 OrmPackage.eINSTANCE.getOneToMany_CascadeOnDelete(),
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
				 getString("_UI_OneToMany_joinFetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToMany_joinFetch_feature", "_UI_OneToMany_type"),
				 OrmPackage.eINSTANCE.getOneToMany_JoinFetch(),
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
				 getString("_UI_OneToMany_partitioned_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToMany_partitioned_feature", "_UI_OneToMany_type"),
				 OrmPackage.eINSTANCE.getOneToMany_Partitioned(),
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
				 getString("_UI_OneToMany_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToMany_access_feature", "_UI_OneToMany_type"),
				 OrmPackage.eINSTANCE.getOneToMany_Access(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Attribute Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributeTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OneToMany_attributeType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToMany_attributeType_feature", "_UI_OneToMany_type"),
				 OrmPackage.eINSTANCE.getOneToMany_AttributeType(),
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
				 getString("_UI_OneToMany_fetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToMany_fetch_feature", "_UI_OneToMany_type"),
				 OrmPackage.eINSTANCE.getOneToMany_Fetch(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_OneToMany_mappedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToMany_mappedBy_feature", "_UI_OneToMany_type"),
				 OrmPackage.eINSTANCE.getOneToMany_MappedBy(),
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
				 getString("_UI_OneToMany_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToMany_name_feature", "_UI_OneToMany_type"),
				 OrmPackage.eINSTANCE.getOneToMany_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_OneToMany_orphanRemoval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToMany_orphanRemoval_feature", "_UI_OneToMany_type"),
				 OrmPackage.eINSTANCE.getOneToMany_OrphanRemoval(),
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
				 getString("_UI_OneToMany_targetEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OneToMany_targetEntity_feature", "_UI_OneToMany_type"),
				 OrmPackage.eINSTANCE.getOneToMany_TargetEntity(),
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
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_OrderColumn());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_MapKey());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_MapKeyClass());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_MapKeyAttributeOverride());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_MapKeyAssociationOverride());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_MapKeyColumn());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_MapKeyJoinColumn());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_Converter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_TypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_ObjectTypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_StructConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_JoinTable());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_JoinColumn());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_Cascade());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_PrivateOwned());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_BatchFetch());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_Property());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_AccessMethods());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_Noncacheable());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_Partitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_ReplicationPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_RoundRobinPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_PinnedPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_RangePartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_ValuePartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_HashPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getOneToMany_UnionPartitioning());
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
	 * This returns OneToMany.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OneToMany"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((OneToMany)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OneToMany_type") :
			getString("_UI_OneToMany_type") + " " + label;
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

		switch (notification.getFeatureID(OneToMany.class)) {
			case OrmPackage.ONE_TO_MANY__ORDER_BY:
			case OrmPackage.ONE_TO_MANY__MAP_KEY_TEMPORAL:
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ENUMERATED:
			case OrmPackage.ONE_TO_MANY__MAP_KEY_CONVERT:
			case OrmPackage.ONE_TO_MANY__CASCADE_ON_DELETE:
			case OrmPackage.ONE_TO_MANY__JOIN_FETCH:
			case OrmPackage.ONE_TO_MANY__PARTITIONED:
			case OrmPackage.ONE_TO_MANY__ACCESS:
			case OrmPackage.ONE_TO_MANY__ATTRIBUTE_TYPE:
			case OrmPackage.ONE_TO_MANY__FETCH:
			case OrmPackage.ONE_TO_MANY__MAPPED_BY:
			case OrmPackage.ONE_TO_MANY__NAME:
			case OrmPackage.ONE_TO_MANY__ORPHAN_REMOVAL:
			case OrmPackage.ONE_TO_MANY__TARGET_ENTITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.ONE_TO_MANY__ORDER_COLUMN:
			case OrmPackage.ONE_TO_MANY__MAP_KEY:
			case OrmPackage.ONE_TO_MANY__MAP_KEY_CLASS:
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE:
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ASSOCIATION_OVERRIDE:
			case OrmPackage.ONE_TO_MANY__MAP_KEY_COLUMN:
			case OrmPackage.ONE_TO_MANY__MAP_KEY_JOIN_COLUMN:
			case OrmPackage.ONE_TO_MANY__CONVERTER:
			case OrmPackage.ONE_TO_MANY__TYPE_CONVERTER:
			case OrmPackage.ONE_TO_MANY__OBJECT_TYPE_CONVERTER:
			case OrmPackage.ONE_TO_MANY__STRUCT_CONVERTER:
			case OrmPackage.ONE_TO_MANY__JOIN_TABLE:
			case OrmPackage.ONE_TO_MANY__JOIN_COLUMN:
			case OrmPackage.ONE_TO_MANY__CASCADE:
			case OrmPackage.ONE_TO_MANY__PRIVATE_OWNED:
			case OrmPackage.ONE_TO_MANY__BATCH_FETCH:
			case OrmPackage.ONE_TO_MANY__PROPERTY:
			case OrmPackage.ONE_TO_MANY__ACCESS_METHODS:
			case OrmPackage.ONE_TO_MANY__NONCACHEABLE:
			case OrmPackage.ONE_TO_MANY__PARTITIONING:
			case OrmPackage.ONE_TO_MANY__REPLICATION_PARTITIONING:
			case OrmPackage.ONE_TO_MANY__ROUND_ROBIN_PARTITIONING:
			case OrmPackage.ONE_TO_MANY__PINNED_PARTITIONING:
			case OrmPackage.ONE_TO_MANY__RANGE_PARTITIONING:
			case OrmPackage.ONE_TO_MANY__VALUE_PARTITIONING:
			case OrmPackage.ONE_TO_MANY__HASH_PARTITIONING:
			case OrmPackage.ONE_TO_MANY__UNION_PARTITIONING:
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
				(OrmPackage.eINSTANCE.getOneToMany_OrderColumn(),
				 OrmFactory.eINSTANCE.createOrderColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_MapKey(),
				 OrmFactory.eINSTANCE.createMapKey()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_MapKeyClass(),
				 OrmFactory.eINSTANCE.createMapKeyClass()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_MapKeyAttributeOverride(),
				 OrmFactory.eINSTANCE.createAttributeOverride()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_MapKeyAssociationOverride(),
				 OrmFactory.eINSTANCE.createAssociationOverride()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_MapKeyColumn(),
				 OrmFactory.eINSTANCE.createMapKeyColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_MapKeyJoinColumn(),
				 OrmFactory.eINSTANCE.createMapKeyJoinColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_Converter(),
				 OrmFactory.eINSTANCE.createConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_TypeConverter(),
				 OrmFactory.eINSTANCE.createTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_ObjectTypeConverter(),
				 OrmFactory.eINSTANCE.createObjectTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_StructConverter(),
				 OrmFactory.eINSTANCE.createStructConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_JoinTable(),
				 OrmFactory.eINSTANCE.createJoinTable()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_JoinColumn(),
				 OrmFactory.eINSTANCE.createJoinColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_Cascade(),
				 OrmFactory.eINSTANCE.createCascadeType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_PrivateOwned(),
				 OrmFactory.eINSTANCE.createEmptyType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_BatchFetch(),
				 OrmFactory.eINSTANCE.createBatchFetch()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_Property(),
				 OrmFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_AccessMethods(),
				 OrmFactory.eINSTANCE.createAccessMethods()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_Noncacheable(),
				 OrmFactory.eINSTANCE.createEmptyType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_Partitioning(),
				 OrmFactory.eINSTANCE.createPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_ReplicationPartitioning(),
				 OrmFactory.eINSTANCE.createReplicationPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_RoundRobinPartitioning(),
				 OrmFactory.eINSTANCE.createRoundRobinPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_PinnedPartitioning(),
				 OrmFactory.eINSTANCE.createPinnedPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_RangePartitioning(),
				 OrmFactory.eINSTANCE.createRangePartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_ValuePartitioning(),
				 OrmFactory.eINSTANCE.createValuePartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_HashPartitioning(),
				 OrmFactory.eINSTANCE.createHashPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getOneToMany_UnionPartitioning(),
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
			childFeature == OrmPackage.eINSTANCE.getOneToMany_PrivateOwned() ||
			childFeature == OrmPackage.eINSTANCE.getOneToMany_Noncacheable();

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
