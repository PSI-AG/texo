/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityItemProvider.java,v 1.4 2011/08/25 15:03:10 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.Entity;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EntityItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EntityItemProvider(AdapterFactory adapterFactory) {
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
			addCascadeOnDeletePropertyDescriptor(object);
			addDiscriminatorValuePropertyDescriptor(object);
			addPartitionedPropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addCacheablePropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addExcludeDefaultMappingsPropertyDescriptor(object);
			addExistenceCheckingPropertyDescriptor(object);
			addMetadataCompletePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
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
				 getString("_UI_Entity_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_description_feature", "_UI_Entity_type"),
				 OrmPackage.eINSTANCE.getEntity_Description(),
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
				 getString("_UI_Entity_cascadeOnDelete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_cascadeOnDelete_feature", "_UI_Entity_type"),
				 OrmPackage.eINSTANCE.getEntity_CascadeOnDelete(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Discriminator Value feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addDiscriminatorValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_discriminatorValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_discriminatorValue_feature", "_UI_Entity_type"),
				 OrmPackage.eINSTANCE.getEntity_DiscriminatorValue(),
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
				 getString("_UI_Entity_partitioned_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_partitioned_feature", "_UI_Entity_type"),
				 OrmPackage.eINSTANCE.getEntity_Partitioned(),
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
				 getString("_UI_Entity_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_access_feature", "_UI_Entity_type"),
				 OrmPackage.eINSTANCE.getEntity_Access(),
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
				 getString("_UI_Entity_cacheable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_cacheable_feature", "_UI_Entity_type"),
				 OrmPackage.eINSTANCE.getEntity_Cacheable(),
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
				 getString("_UI_Entity_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_class_feature", "_UI_Entity_type"),
				 OrmPackage.eINSTANCE.getEntity_Class(),
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
				 getString("_UI_Entity_excludeDefaultMappings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_excludeDefaultMappings_feature", "_UI_Entity_type"),
				 OrmPackage.eINSTANCE.getEntity_ExcludeDefaultMappings(),
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
				 getString("_UI_Entity_existenceChecking_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_existenceChecking_feature", "_UI_Entity_type"),
				 OrmPackage.eINSTANCE.getEntity_ExistenceChecking(),
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
				 getString("_UI_Entity_metadataComplete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_metadataComplete_feature", "_UI_Entity_type"),
				 OrmPackage.eINSTANCE.getEntity_MetadataComplete(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Entity_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_name_feature", "_UI_Entity_type"),
				 OrmPackage.eINSTANCE.getEntity_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Entity_parentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_parentClass_feature", "_UI_Entity_type"),
				 OrmPackage.eINSTANCE.getEntity_ParentClass(),
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
				 getString("_UI_Entity_readOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_readOnly_feature", "_UI_Entity_type"),
				 OrmPackage.eINSTANCE.getEntity_ReadOnly(),
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
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_AccessMethods());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_Multitenant());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_AdditionalCriteria());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_Customizer());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_ChangeTracking());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_Table());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_SecondaryTable());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_Struct());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_PrimaryKeyJoinColumn());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_Index());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_IdClass());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_PrimaryKey());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_Inheritance());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_DiscriminatorColumn());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_ClassExtractor());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_OptimisticLocking());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_Cache());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_CacheInterceptor());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_FetchGroup());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_Converter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_TypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_ObjectTypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_StructConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_CopyPolicy());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_InstantiationCopyPolicy());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_CloneCopyPolicy());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_SequenceGenerator());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_TableGenerator());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_Partitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_ReplicationPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_RoundRobinPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_PinnedPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_RangePartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_ValuePartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_HashPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_UnionPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_NamedQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_NamedNativeQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_NamedStoredProcedureQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_NamedStoredFunctionQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_NamedPlsqlStoredProcedureQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_NamedPlsqlStoredFunctionQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_PlsqlRecord());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_PlsqlTable());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_SqlResultSetMapping());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_QueryRedirectors());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_ExcludeDefaultListeners());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_ExcludeSuperclassListeners());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_EntityListeners());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_PrePersist());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_PostPersist());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_PreRemove());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_PostRemove());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_PreUpdate());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_PostUpdate());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_PostLoad());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_Property());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_AttributeOverride());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_AssociationOverride());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntity_Attributes());
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
	 * This returns Entity.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Entity"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((Entity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Entity_type") :
			getString("_UI_Entity_type") + " " + label;
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

		switch (notification.getFeatureID(Entity.class)) {
			case OrmPackage.ENTITY__DESCRIPTION:
			case OrmPackage.ENTITY__CASCADE_ON_DELETE:
			case OrmPackage.ENTITY__DISCRIMINATOR_VALUE:
			case OrmPackage.ENTITY__PARTITIONED:
			case OrmPackage.ENTITY__ACCESS:
			case OrmPackage.ENTITY__CACHEABLE:
			case OrmPackage.ENTITY__CLASS:
			case OrmPackage.ENTITY__EXCLUDE_DEFAULT_MAPPINGS:
			case OrmPackage.ENTITY__EXISTENCE_CHECKING:
			case OrmPackage.ENTITY__METADATA_COMPLETE:
			case OrmPackage.ENTITY__NAME:
			case OrmPackage.ENTITY__PARENT_CLASS:
			case OrmPackage.ENTITY__READ_ONLY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.ENTITY__ACCESS_METHODS:
			case OrmPackage.ENTITY__MULTITENANT:
			case OrmPackage.ENTITY__ADDITIONAL_CRITERIA:
			case OrmPackage.ENTITY__CUSTOMIZER:
			case OrmPackage.ENTITY__CHANGE_TRACKING:
			case OrmPackage.ENTITY__TABLE:
			case OrmPackage.ENTITY__SECONDARY_TABLE:
			case OrmPackage.ENTITY__STRUCT:
			case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
			case OrmPackage.ENTITY__INDEX:
			case OrmPackage.ENTITY__ID_CLASS:
			case OrmPackage.ENTITY__PRIMARY_KEY:
			case OrmPackage.ENTITY__INHERITANCE:
			case OrmPackage.ENTITY__DISCRIMINATOR_COLUMN:
			case OrmPackage.ENTITY__CLASS_EXTRACTOR:
			case OrmPackage.ENTITY__OPTIMISTIC_LOCKING:
			case OrmPackage.ENTITY__CACHE:
			case OrmPackage.ENTITY__CACHE_INTERCEPTOR:
			case OrmPackage.ENTITY__FETCH_GROUP:
			case OrmPackage.ENTITY__CONVERTER:
			case OrmPackage.ENTITY__TYPE_CONVERTER:
			case OrmPackage.ENTITY__OBJECT_TYPE_CONVERTER:
			case OrmPackage.ENTITY__STRUCT_CONVERTER:
			case OrmPackage.ENTITY__COPY_POLICY:
			case OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY:
			case OrmPackage.ENTITY__CLONE_COPY_POLICY:
			case OrmPackage.ENTITY__SEQUENCE_GENERATOR:
			case OrmPackage.ENTITY__TABLE_GENERATOR:
			case OrmPackage.ENTITY__PARTITIONING:
			case OrmPackage.ENTITY__REPLICATION_PARTITIONING:
			case OrmPackage.ENTITY__ROUND_ROBIN_PARTITIONING:
			case OrmPackage.ENTITY__PINNED_PARTITIONING:
			case OrmPackage.ENTITY__RANGE_PARTITIONING:
			case OrmPackage.ENTITY__VALUE_PARTITIONING:
			case OrmPackage.ENTITY__HASH_PARTITIONING:
			case OrmPackage.ENTITY__UNION_PARTITIONING:
			case OrmPackage.ENTITY__NAMED_QUERY:
			case OrmPackage.ENTITY__NAMED_NATIVE_QUERY:
			case OrmPackage.ENTITY__NAMED_STORED_PROCEDURE_QUERY:
			case OrmPackage.ENTITY__NAMED_STORED_FUNCTION_QUERY:
			case OrmPackage.ENTITY__NAMED_PLSQL_STORED_PROCEDURE_QUERY:
			case OrmPackage.ENTITY__NAMED_PLSQL_STORED_FUNCTION_QUERY:
			case OrmPackage.ENTITY__PLSQL_RECORD:
			case OrmPackage.ENTITY__PLSQL_TABLE:
			case OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING:
			case OrmPackage.ENTITY__QUERY_REDIRECTORS:
			case OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS:
			case OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS:
			case OrmPackage.ENTITY__ENTITY_LISTENERS:
			case OrmPackage.ENTITY__PRE_PERSIST:
			case OrmPackage.ENTITY__POST_PERSIST:
			case OrmPackage.ENTITY__PRE_REMOVE:
			case OrmPackage.ENTITY__POST_REMOVE:
			case OrmPackage.ENTITY__PRE_UPDATE:
			case OrmPackage.ENTITY__POST_UPDATE:
			case OrmPackage.ENTITY__POST_LOAD:
			case OrmPackage.ENTITY__PROPERTY:
			case OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE:
			case OrmPackage.ENTITY__ASSOCIATION_OVERRIDE:
			case OrmPackage.ENTITY__ATTRIBUTES:
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
				(OrmPackage.eINSTANCE.getEntity_AccessMethods(),
				 OrmFactory.eINSTANCE.createAccessMethods()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_Multitenant(),
				 OrmFactory.eINSTANCE.createMultitenant()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_AdditionalCriteria(),
				 OrmFactory.eINSTANCE.createAdditionalCriteria()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_Customizer(),
				 OrmFactory.eINSTANCE.createCustomizer()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_ChangeTracking(),
				 OrmFactory.eINSTANCE.createChangeTracking()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_Table(),
				 OrmFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_SecondaryTable(),
				 OrmFactory.eINSTANCE.createSecondaryTable()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_Struct(),
				 OrmFactory.eINSTANCE.createStruct()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_PrimaryKeyJoinColumn(),
				 OrmFactory.eINSTANCE.createPrimaryKeyJoinColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_Index(),
				 OrmFactory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_IdClass(),
				 OrmFactory.eINSTANCE.createIdClass()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_PrimaryKey(),
				 OrmFactory.eINSTANCE.createPrimaryKey()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_Inheritance(),
				 OrmFactory.eINSTANCE.createInheritance()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_DiscriminatorColumn(),
				 OrmFactory.eINSTANCE.createDiscriminatorColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_ClassExtractor(),
				 OrmFactory.eINSTANCE.createClassExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_OptimisticLocking(),
				 OrmFactory.eINSTANCE.createOptimisticLocking()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_Cache(),
				 OrmFactory.eINSTANCE.createCache()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_CacheInterceptor(),
				 OrmFactory.eINSTANCE.createCacheInterceptor()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_FetchGroup(),
				 OrmFactory.eINSTANCE.createFetchGroup()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_Converter(),
				 OrmFactory.eINSTANCE.createConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_TypeConverter(),
				 OrmFactory.eINSTANCE.createTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_ObjectTypeConverter(),
				 OrmFactory.eINSTANCE.createObjectTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_StructConverter(),
				 OrmFactory.eINSTANCE.createStructConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_CopyPolicy(),
				 OrmFactory.eINSTANCE.createCopyPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_InstantiationCopyPolicy(),
				 OrmFactory.eINSTANCE.createInstantiationCopyPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_CloneCopyPolicy(),
				 OrmFactory.eINSTANCE.createCloneCopyPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_SequenceGenerator(),
				 OrmFactory.eINSTANCE.createSequenceGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_TableGenerator(),
				 OrmFactory.eINSTANCE.createTableGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_Partitioning(),
				 OrmFactory.eINSTANCE.createPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_ReplicationPartitioning(),
				 OrmFactory.eINSTANCE.createReplicationPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_RoundRobinPartitioning(),
				 OrmFactory.eINSTANCE.createRoundRobinPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_PinnedPartitioning(),
				 OrmFactory.eINSTANCE.createPinnedPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_RangePartitioning(),
				 OrmFactory.eINSTANCE.createRangePartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_ValuePartitioning(),
				 OrmFactory.eINSTANCE.createValuePartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_HashPartitioning(),
				 OrmFactory.eINSTANCE.createHashPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_UnionPartitioning(),
				 OrmFactory.eINSTANCE.createUnionPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_NamedQuery(),
				 OrmFactory.eINSTANCE.createNamedQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_NamedNativeQuery(),
				 OrmFactory.eINSTANCE.createNamedNativeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_NamedStoredProcedureQuery(),
				 OrmFactory.eINSTANCE.createNamedStoredProcedureQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_NamedStoredFunctionQuery(),
				 OrmFactory.eINSTANCE.createNamedStoredFunctionQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_NamedPlsqlStoredProcedureQuery(),
				 OrmFactory.eINSTANCE.createNamedPlsqlStoredProcedureQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_NamedPlsqlStoredFunctionQuery(),
				 OrmFactory.eINSTANCE.createNamedPlsqlStoredFunctionQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_PlsqlRecord(),
				 OrmFactory.eINSTANCE.createPlsqlRecord()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_PlsqlTable(),
				 OrmFactory.eINSTANCE.createPlsqlTable()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_SqlResultSetMapping(),
				 OrmFactory.eINSTANCE.createSqlResultSetMapping()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_QueryRedirectors(),
				 OrmFactory.eINSTANCE.createQueryRedirectors()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_ExcludeDefaultListeners(),
				 OrmFactory.eINSTANCE.createEmptyType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_ExcludeSuperclassListeners(),
				 OrmFactory.eINSTANCE.createEmptyType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_EntityListeners(),
				 OrmFactory.eINSTANCE.createEntityListeners()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_PrePersist(),
				 OrmFactory.eINSTANCE.createPrePersist()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_PostPersist(),
				 OrmFactory.eINSTANCE.createPostPersist()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_PreRemove(),
				 OrmFactory.eINSTANCE.createPreRemove()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_PostRemove(),
				 OrmFactory.eINSTANCE.createPostRemove()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_PreUpdate(),
				 OrmFactory.eINSTANCE.createPreUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_PostUpdate(),
				 OrmFactory.eINSTANCE.createPostUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_PostLoad(),
				 OrmFactory.eINSTANCE.createPostLoad()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_Property(),
				 OrmFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_AttributeOverride(),
				 OrmFactory.eINSTANCE.createAttributeOverride()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_AssociationOverride(),
				 OrmFactory.eINSTANCE.createAssociationOverride()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntity_Attributes(),
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
			childFeature == OrmPackage.eINSTANCE.getEntity_ExcludeDefaultListeners() ||
			childFeature == OrmPackage.eINSTANCE.getEntity_ExcludeSuperclassListeners();

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
