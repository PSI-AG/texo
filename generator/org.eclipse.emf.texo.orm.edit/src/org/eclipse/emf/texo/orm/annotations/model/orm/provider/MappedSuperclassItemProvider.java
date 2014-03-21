/**
 * <copyright>
 * </copyright>
 *
 * $Id: MappedSuperclassItemProvider.java,v 1.4 2011/08/25 15:03:10 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class MappedSuperclassItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public MappedSuperclassItemProvider(AdapterFactory adapterFactory) {
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
			addPartitionedPropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addCacheablePropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addExcludeDefaultMappingsPropertyDescriptor(object);
			addExistenceCheckingPropertyDescriptor(object);
			addMetadataCompletePropertyDescriptor(object);
			addParentClassPropertyDescriptor(object);
			addReadOnlyPropertyDescriptor(object);
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
				 getString("_UI_MappedSuperclass_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedSuperclass_description_feature", "_UI_MappedSuperclass_type"),
				 OrmPackage.eINSTANCE.getMappedSuperclass_Description(),
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
				 getString("_UI_MappedSuperclass_partitioned_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedSuperclass_partitioned_feature", "_UI_MappedSuperclass_type"),
				 OrmPackage.eINSTANCE.getMappedSuperclass_Partitioned(),
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
				 getString("_UI_MappedSuperclass_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedSuperclass_access_feature", "_UI_MappedSuperclass_type"),
				 OrmPackage.eINSTANCE.getMappedSuperclass_Access(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Cacheable feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addCacheablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappedSuperclass_cacheable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedSuperclass_cacheable_feature", "_UI_MappedSuperclass_type"),
				 OrmPackage.eINSTANCE.getMappedSuperclass_Cacheable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappedSuperclass_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedSuperclass_class_feature", "_UI_MappedSuperclass_type"),
				 OrmPackage.eINSTANCE.getMappedSuperclass_Class(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
   * This adds a property descriptor for the Exclude Default Mappings feature. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  protected void addExcludeDefaultMappingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappedSuperclass_excludeDefaultMappings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedSuperclass_excludeDefaultMappings_feature", "_UI_MappedSuperclass_type"),
				 OrmPackage.eINSTANCE.getMappedSuperclass_ExcludeDefaultMappings(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Existence Checking feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addExistenceCheckingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappedSuperclass_existenceChecking_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedSuperclass_existenceChecking_feature", "_UI_MappedSuperclass_type"),
				 OrmPackage.eINSTANCE.getMappedSuperclass_ExistenceChecking(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Metadata Complete feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addMetadataCompletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappedSuperclass_metadataComplete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedSuperclass_metadataComplete_feature", "_UI_MappedSuperclass_type"),
				 OrmPackage.eINSTANCE.getMappedSuperclass_MetadataComplete(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Parent Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappedSuperclass_parentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedSuperclass_parentClass_feature", "_UI_MappedSuperclass_type"),
				 OrmPackage.eINSTANCE.getMappedSuperclass_ParentClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Read Only feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappedSuperclass_readOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappedSuperclass_readOnly_feature", "_UI_MappedSuperclass_type"),
				 OrmPackage.eINSTANCE.getMappedSuperclass_ReadOnly(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_AccessMethods());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_Multitenant());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_AdditionalCriteria());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_Customizer());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_ChangeTracking());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_IdClass());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_PrimaryKey());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_OptimisticLocking());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_Cache());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_CacheInterceptor());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_FetchGroup());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_Converter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_TypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_ObjectTypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_StructConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_CopyPolicy());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_InstantiationCopyPolicy());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_CloneCopyPolicy());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_SequenceGenerator());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_TableGenerator());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_Partitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_ReplicationPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_RoundRobinPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_PinnedPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_RangePartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_ValuePartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_HashPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_UnionPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_NamedQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_NamedNativeQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_NamedStoredProcedureQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_NamedStoredFunctionQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_NamedPlsqlStoredProcedureQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_NamedPlsqlStoredFunctionQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_PlsqlRecord());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_PlsqlTable());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_SqlResultSetMapping());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_QueryRedirectors());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_ExcludeDefaultListeners());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_ExcludeSuperclassListeners());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_EntityListeners());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_PrePersist());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_PostPersist());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_PreRemove());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_PostRemove());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_PreUpdate());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_PostUpdate());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_PostLoad());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_Property());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_AttributeOverride());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_AssociationOverride());
			childrenFeatures.add(OrmPackage.eINSTANCE.getMappedSuperclass_Attributes());
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
	 * This returns MappedSuperclass.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MappedSuperclass"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((MappedSuperclass)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_MappedSuperclass_type") :
			getString("_UI_MappedSuperclass_type") + " " + label;
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

		switch (notification.getFeatureID(MappedSuperclass.class)) {
			case OrmPackage.MAPPED_SUPERCLASS__DESCRIPTION:
			case OrmPackage.MAPPED_SUPERCLASS__PARTITIONED:
			case OrmPackage.MAPPED_SUPERCLASS__ACCESS:
			case OrmPackage.MAPPED_SUPERCLASS__CACHEABLE:
			case OrmPackage.MAPPED_SUPERCLASS__CLASS:
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_MAPPINGS:
			case OrmPackage.MAPPED_SUPERCLASS__EXISTENCE_CHECKING:
			case OrmPackage.MAPPED_SUPERCLASS__METADATA_COMPLETE:
			case OrmPackage.MAPPED_SUPERCLASS__PARENT_CLASS:
			case OrmPackage.MAPPED_SUPERCLASS__READ_ONLY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.MAPPED_SUPERCLASS__ACCESS_METHODS:
			case OrmPackage.MAPPED_SUPERCLASS__MULTITENANT:
			case OrmPackage.MAPPED_SUPERCLASS__ADDITIONAL_CRITERIA:
			case OrmPackage.MAPPED_SUPERCLASS__CUSTOMIZER:
			case OrmPackage.MAPPED_SUPERCLASS__CHANGE_TRACKING:
			case OrmPackage.MAPPED_SUPERCLASS__ID_CLASS:
			case OrmPackage.MAPPED_SUPERCLASS__PRIMARY_KEY:
			case OrmPackage.MAPPED_SUPERCLASS__OPTIMISTIC_LOCKING:
			case OrmPackage.MAPPED_SUPERCLASS__CACHE:
			case OrmPackage.MAPPED_SUPERCLASS__CACHE_INTERCEPTOR:
			case OrmPackage.MAPPED_SUPERCLASS__FETCH_GROUP:
			case OrmPackage.MAPPED_SUPERCLASS__CONVERTER:
			case OrmPackage.MAPPED_SUPERCLASS__TYPE_CONVERTER:
			case OrmPackage.MAPPED_SUPERCLASS__OBJECT_TYPE_CONVERTER:
			case OrmPackage.MAPPED_SUPERCLASS__STRUCT_CONVERTER:
			case OrmPackage.MAPPED_SUPERCLASS__COPY_POLICY:
			case OrmPackage.MAPPED_SUPERCLASS__INSTANTIATION_COPY_POLICY:
			case OrmPackage.MAPPED_SUPERCLASS__CLONE_COPY_POLICY:
			case OrmPackage.MAPPED_SUPERCLASS__SEQUENCE_GENERATOR:
			case OrmPackage.MAPPED_SUPERCLASS__TABLE_GENERATOR:
			case OrmPackage.MAPPED_SUPERCLASS__PARTITIONING:
			case OrmPackage.MAPPED_SUPERCLASS__REPLICATION_PARTITIONING:
			case OrmPackage.MAPPED_SUPERCLASS__ROUND_ROBIN_PARTITIONING:
			case OrmPackage.MAPPED_SUPERCLASS__PINNED_PARTITIONING:
			case OrmPackage.MAPPED_SUPERCLASS__RANGE_PARTITIONING:
			case OrmPackage.MAPPED_SUPERCLASS__VALUE_PARTITIONING:
			case OrmPackage.MAPPED_SUPERCLASS__HASH_PARTITIONING:
			case OrmPackage.MAPPED_SUPERCLASS__UNION_PARTITIONING:
			case OrmPackage.MAPPED_SUPERCLASS__NAMED_QUERY:
			case OrmPackage.MAPPED_SUPERCLASS__NAMED_NATIVE_QUERY:
			case OrmPackage.MAPPED_SUPERCLASS__NAMED_STORED_PROCEDURE_QUERY:
			case OrmPackage.MAPPED_SUPERCLASS__NAMED_STORED_FUNCTION_QUERY:
			case OrmPackage.MAPPED_SUPERCLASS__NAMED_PLSQL_STORED_PROCEDURE_QUERY:
			case OrmPackage.MAPPED_SUPERCLASS__NAMED_PLSQL_STORED_FUNCTION_QUERY:
			case OrmPackage.MAPPED_SUPERCLASS__PLSQL_RECORD:
			case OrmPackage.MAPPED_SUPERCLASS__PLSQL_TABLE:
			case OrmPackage.MAPPED_SUPERCLASS__SQL_RESULT_SET_MAPPING:
			case OrmPackage.MAPPED_SUPERCLASS__QUERY_REDIRECTORS:
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS:
			case OrmPackage.MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS:
			case OrmPackage.MAPPED_SUPERCLASS__ENTITY_LISTENERS:
			case OrmPackage.MAPPED_SUPERCLASS__PRE_PERSIST:
			case OrmPackage.MAPPED_SUPERCLASS__POST_PERSIST:
			case OrmPackage.MAPPED_SUPERCLASS__PRE_REMOVE:
			case OrmPackage.MAPPED_SUPERCLASS__POST_REMOVE:
			case OrmPackage.MAPPED_SUPERCLASS__PRE_UPDATE:
			case OrmPackage.MAPPED_SUPERCLASS__POST_UPDATE:
			case OrmPackage.MAPPED_SUPERCLASS__POST_LOAD:
			case OrmPackage.MAPPED_SUPERCLASS__PROPERTY:
			case OrmPackage.MAPPED_SUPERCLASS__ATTRIBUTE_OVERRIDE:
			case OrmPackage.MAPPED_SUPERCLASS__ASSOCIATION_OVERRIDE:
			case OrmPackage.MAPPED_SUPERCLASS__ATTRIBUTES:
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
				(OrmPackage.eINSTANCE.getMappedSuperclass_AccessMethods(),
				 OrmFactory.eINSTANCE.createAccessMethods()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_Multitenant(),
				 OrmFactory.eINSTANCE.createMultitenant()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_AdditionalCriteria(),
				 OrmFactory.eINSTANCE.createAdditionalCriteria()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_Customizer(),
				 OrmFactory.eINSTANCE.createCustomizer()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_ChangeTracking(),
				 OrmFactory.eINSTANCE.createChangeTracking()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_IdClass(),
				 OrmFactory.eINSTANCE.createIdClass()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_PrimaryKey(),
				 OrmFactory.eINSTANCE.createPrimaryKey()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_OptimisticLocking(),
				 OrmFactory.eINSTANCE.createOptimisticLocking()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_Cache(),
				 OrmFactory.eINSTANCE.createCache()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_CacheInterceptor(),
				 OrmFactory.eINSTANCE.createCacheInterceptor()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_FetchGroup(),
				 OrmFactory.eINSTANCE.createFetchGroup()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_Converter(),
				 OrmFactory.eINSTANCE.createConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_TypeConverter(),
				 OrmFactory.eINSTANCE.createTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_ObjectTypeConverter(),
				 OrmFactory.eINSTANCE.createObjectTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_StructConverter(),
				 OrmFactory.eINSTANCE.createStructConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_CopyPolicy(),
				 OrmFactory.eINSTANCE.createCopyPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_InstantiationCopyPolicy(),
				 OrmFactory.eINSTANCE.createInstantiationCopyPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_CloneCopyPolicy(),
				 OrmFactory.eINSTANCE.createCloneCopyPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_SequenceGenerator(),
				 OrmFactory.eINSTANCE.createSequenceGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_TableGenerator(),
				 OrmFactory.eINSTANCE.createTableGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_Partitioning(),
				 OrmFactory.eINSTANCE.createPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_ReplicationPartitioning(),
				 OrmFactory.eINSTANCE.createReplicationPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_RoundRobinPartitioning(),
				 OrmFactory.eINSTANCE.createRoundRobinPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_PinnedPartitioning(),
				 OrmFactory.eINSTANCE.createPinnedPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_RangePartitioning(),
				 OrmFactory.eINSTANCE.createRangePartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_ValuePartitioning(),
				 OrmFactory.eINSTANCE.createValuePartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_HashPartitioning(),
				 OrmFactory.eINSTANCE.createHashPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_UnionPartitioning(),
				 OrmFactory.eINSTANCE.createUnionPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_NamedQuery(),
				 OrmFactory.eINSTANCE.createNamedQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_NamedNativeQuery(),
				 OrmFactory.eINSTANCE.createNamedNativeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_NamedStoredProcedureQuery(),
				 OrmFactory.eINSTANCE.createNamedStoredProcedureQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_NamedStoredFunctionQuery(),
				 OrmFactory.eINSTANCE.createNamedStoredFunctionQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_NamedPlsqlStoredProcedureQuery(),
				 OrmFactory.eINSTANCE.createNamedPlsqlStoredProcedureQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_NamedPlsqlStoredFunctionQuery(),
				 OrmFactory.eINSTANCE.createNamedPlsqlStoredFunctionQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_PlsqlRecord(),
				 OrmFactory.eINSTANCE.createPlsqlRecord()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_PlsqlTable(),
				 OrmFactory.eINSTANCE.createPlsqlTable()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_SqlResultSetMapping(),
				 OrmFactory.eINSTANCE.createSqlResultSetMapping()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_QueryRedirectors(),
				 OrmFactory.eINSTANCE.createQueryRedirectors()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_ExcludeDefaultListeners(),
				 OrmFactory.eINSTANCE.createEmptyType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_ExcludeSuperclassListeners(),
				 OrmFactory.eINSTANCE.createEmptyType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_EntityListeners(),
				 OrmFactory.eINSTANCE.createEntityListeners()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_PrePersist(),
				 OrmFactory.eINSTANCE.createPrePersist()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_PostPersist(),
				 OrmFactory.eINSTANCE.createPostPersist()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_PreRemove(),
				 OrmFactory.eINSTANCE.createPreRemove()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_PostRemove(),
				 OrmFactory.eINSTANCE.createPostRemove()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_PreUpdate(),
				 OrmFactory.eINSTANCE.createPreUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_PostUpdate(),
				 OrmFactory.eINSTANCE.createPostUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_PostLoad(),
				 OrmFactory.eINSTANCE.createPostLoad()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_Property(),
				 OrmFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_AttributeOverride(),
				 OrmFactory.eINSTANCE.createAttributeOverride()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_AssociationOverride(),
				 OrmFactory.eINSTANCE.createAssociationOverride()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getMappedSuperclass_Attributes(),
				 OrmFactory.eINSTANCE.createAttributes()));
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
			childFeature == OrmPackage.eINSTANCE.getMappedSuperclass_ExcludeDefaultListeners() ||
			childFeature == OrmPackage.eINSTANCE.getMappedSuperclass_ExcludeSuperclassListeners();

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
