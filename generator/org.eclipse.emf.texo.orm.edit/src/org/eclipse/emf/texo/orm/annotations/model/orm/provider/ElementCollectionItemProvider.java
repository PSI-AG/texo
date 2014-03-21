/**
 * <copyright>
 * </copyright>
 *
 * $Id: ElementCollectionItemProvider.java,v 1.4 2011/08/25 15:03:09 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class ElementCollectionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public ElementCollectionItemProvider(AdapterFactory adapterFactory) {
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
			addTemporalPropertyDescriptor(object);
			addEnumeratedPropertyDescriptor(object);
			addConvertPropertyDescriptor(object);
			addCascadeOnDeletePropertyDescriptor(object);
			addJoinFetchPropertyDescriptor(object);
			addPartitionedPropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addAttributeTypePropertyDescriptor(object);
			addCompositeMemberPropertyDescriptor(object);
			addFetchPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTargetClassPropertyDescriptor(object);
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
				 getString("_UI_ElementCollection_orderBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_orderBy_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_OrderBy(),
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
				 getString("_UI_ElementCollection_mapKeyTemporal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_mapKeyTemporal_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_MapKeyTemporal(),
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
				 getString("_UI_ElementCollection_mapKeyEnumerated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_mapKeyEnumerated_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_MapKeyEnumerated(),
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
				 getString("_UI_ElementCollection_mapKeyConvert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_mapKeyConvert_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_MapKeyConvert(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Temporal feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addTemporalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementCollection_temporal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_temporal_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_Temporal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Enumerated feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addEnumeratedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementCollection_enumerated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_enumerated_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_Enumerated(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_ElementCollection_convert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_convert_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_Convert(),
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
				 getString("_UI_ElementCollection_cascadeOnDelete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_cascadeOnDelete_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_CascadeOnDelete(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Join Fetch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJoinFetchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementCollection_joinFetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_joinFetch_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_JoinFetch(),
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
				 getString("_UI_ElementCollection_partitioned_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_partitioned_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_Partitioned(),
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
				 getString("_UI_ElementCollection_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_access_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_Access(),
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
				 getString("_UI_ElementCollection_attributeType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_attributeType_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_AttributeType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Composite Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompositeMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementCollection_compositeMember_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_compositeMember_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_CompositeMember(),
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
				 getString("_UI_ElementCollection_fetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_fetch_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_Fetch(),
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
				 getString("_UI_ElementCollection_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_name_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Target Class feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addTargetClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementCollection_targetClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementCollection_targetClass_feature", "_UI_ElementCollection_type"),
				 OrmPackage.eINSTANCE.getElementCollection_TargetClass(),
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
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_OrderColumn());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_MapKey());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_MapKeyClass());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_MapKeyAttributeOverride());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_MapKeyAssociationOverride());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_MapKeyColumn());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_MapKeyJoinColumn());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_Column());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_Lob());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_AttributeOverride());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_AssociationOverride());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_Group());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_CollectionTable());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_BatchFetch());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_Property());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_AccessMethods());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_Noncacheable());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_Partitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_ReplicationPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_RoundRobinPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_PinnedPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_RangePartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_ValuePartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_HashPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getElementCollection_UnionPartitioning());
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
	 * This returns ElementCollection.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ElementCollection"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((ElementCollection)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ElementCollection_type") :
			getString("_UI_ElementCollection_type") + " " + label;
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

		switch (notification.getFeatureID(ElementCollection.class)) {
			case OrmPackage.ELEMENT_COLLECTION__ORDER_BY:
			case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_TEMPORAL:
			case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ENUMERATED:
			case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CONVERT:
			case OrmPackage.ELEMENT_COLLECTION__TEMPORAL:
			case OrmPackage.ELEMENT_COLLECTION__ENUMERATED:
			case OrmPackage.ELEMENT_COLLECTION__CONVERT:
			case OrmPackage.ELEMENT_COLLECTION__CASCADE_ON_DELETE:
			case OrmPackage.ELEMENT_COLLECTION__JOIN_FETCH:
			case OrmPackage.ELEMENT_COLLECTION__PARTITIONED:
			case OrmPackage.ELEMENT_COLLECTION__ACCESS:
			case OrmPackage.ELEMENT_COLLECTION__ATTRIBUTE_TYPE:
			case OrmPackage.ELEMENT_COLLECTION__COMPOSITE_MEMBER:
			case OrmPackage.ELEMENT_COLLECTION__FETCH:
			case OrmPackage.ELEMENT_COLLECTION__NAME:
			case OrmPackage.ELEMENT_COLLECTION__TARGET_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.ELEMENT_COLLECTION__ORDER_COLUMN:
			case OrmPackage.ELEMENT_COLLECTION__MAP_KEY:
			case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_CLASS:
			case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ATTRIBUTE_OVERRIDE:
			case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_ASSOCIATION_OVERRIDE:
			case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_COLUMN:
			case OrmPackage.ELEMENT_COLLECTION__MAP_KEY_JOIN_COLUMN:
			case OrmPackage.ELEMENT_COLLECTION__COLUMN:
			case OrmPackage.ELEMENT_COLLECTION__LOB:
			case OrmPackage.ELEMENT_COLLECTION__ATTRIBUTE_OVERRIDE:
			case OrmPackage.ELEMENT_COLLECTION__ASSOCIATION_OVERRIDE:
			case OrmPackage.ELEMENT_COLLECTION__GROUP:
			case OrmPackage.ELEMENT_COLLECTION__COLLECTION_TABLE:
			case OrmPackage.ELEMENT_COLLECTION__BATCH_FETCH:
			case OrmPackage.ELEMENT_COLLECTION__PROPERTY:
			case OrmPackage.ELEMENT_COLLECTION__ACCESS_METHODS:
			case OrmPackage.ELEMENT_COLLECTION__NONCACHEABLE:
			case OrmPackage.ELEMENT_COLLECTION__PARTITIONING:
			case OrmPackage.ELEMENT_COLLECTION__REPLICATION_PARTITIONING:
			case OrmPackage.ELEMENT_COLLECTION__ROUND_ROBIN_PARTITIONING:
			case OrmPackage.ELEMENT_COLLECTION__PINNED_PARTITIONING:
			case OrmPackage.ELEMENT_COLLECTION__RANGE_PARTITIONING:
			case OrmPackage.ELEMENT_COLLECTION__VALUE_PARTITIONING:
			case OrmPackage.ELEMENT_COLLECTION__HASH_PARTITIONING:
			case OrmPackage.ELEMENT_COLLECTION__UNION_PARTITIONING:
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
				(OrmPackage.eINSTANCE.getElementCollection_OrderColumn(),
				 OrmFactory.eINSTANCE.createOrderColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_MapKey(),
				 OrmFactory.eINSTANCE.createMapKey()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_MapKeyClass(),
				 OrmFactory.eINSTANCE.createMapKeyClass()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_MapKeyAttributeOverride(),
				 OrmFactory.eINSTANCE.createAttributeOverride()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_MapKeyAssociationOverride(),
				 OrmFactory.eINSTANCE.createAssociationOverride()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_MapKeyColumn(),
				 OrmFactory.eINSTANCE.createMapKeyColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_MapKeyJoinColumn(),
				 OrmFactory.eINSTANCE.createMapKeyJoinColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_Column(),
				 OrmFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_Lob(),
				 OrmFactory.eINSTANCE.createLob()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_AttributeOverride(),
				 OrmFactory.eINSTANCE.createAttributeOverride()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_AssociationOverride(),
				 OrmFactory.eINSTANCE.createAssociationOverride()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_Group(),
				 FeatureMapUtil.createEntry
					(OrmPackage.eINSTANCE.getElementCollection_Converter(),
					 OrmFactory.eINSTANCE.createConverter())));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_Group(),
				 FeatureMapUtil.createEntry
					(OrmPackage.eINSTANCE.getElementCollection_TypeConverter(),
					 OrmFactory.eINSTANCE.createTypeConverter())));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_Group(),
				 FeatureMapUtil.createEntry
					(OrmPackage.eINSTANCE.getElementCollection_ObjectTypeConverter(),
					 OrmFactory.eINSTANCE.createObjectTypeConverter())));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_Group(),
				 FeatureMapUtil.createEntry
					(OrmPackage.eINSTANCE.getElementCollection_StructConverter(),
					 OrmFactory.eINSTANCE.createStructConverter())));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_CollectionTable(),
				 OrmFactory.eINSTANCE.createCollectionTable()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_BatchFetch(),
				 OrmFactory.eINSTANCE.createBatchFetch()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_Property(),
				 OrmFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_AccessMethods(),
				 OrmFactory.eINSTANCE.createAccessMethods()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_Noncacheable(),
				 OrmFactory.eINSTANCE.createEmptyType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_Partitioning(),
				 OrmFactory.eINSTANCE.createPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_ReplicationPartitioning(),
				 OrmFactory.eINSTANCE.createReplicationPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_RoundRobinPartitioning(),
				 OrmFactory.eINSTANCE.createRoundRobinPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_PinnedPartitioning(),
				 OrmFactory.eINSTANCE.createPinnedPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_RangePartitioning(),
				 OrmFactory.eINSTANCE.createRangePartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_ValuePartitioning(),
				 OrmFactory.eINSTANCE.createValuePartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_HashPartitioning(),
				 OrmFactory.eINSTANCE.createHashPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getElementCollection_UnionPartitioning(),
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

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == OrmPackage.eINSTANCE.getElementCollection_MapKeyAttributeOverride() ||
			childFeature == OrmPackage.eINSTANCE.getElementCollection_AttributeOverride() ||
			childFeature == OrmPackage.eINSTANCE.getElementCollection_MapKeyAssociationOverride() ||
			childFeature == OrmPackage.eINSTANCE.getElementCollection_AssociationOverride();

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
