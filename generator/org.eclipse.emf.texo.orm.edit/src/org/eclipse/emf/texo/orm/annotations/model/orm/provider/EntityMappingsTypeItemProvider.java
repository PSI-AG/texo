/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityMappingsTypeItemProvider.java,v 1.4 2011/08/25 15:03:10 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class EntityMappingsTypeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EntityMappingsTypeItemProvider(AdapterFactory adapterFactory) {
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
			addPackagePropertyDescriptor(object);
			addSchemaPropertyDescriptor(object);
			addCatalogPropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
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
				 getString("_UI_EntityMappingsType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityMappingsType_description_feature", "_UI_EntityMappingsType_type"),
				 OrmPackage.eINSTANCE.getEntityMappingsType_Description(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Package feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityMappingsType_package_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityMappingsType_package_feature", "_UI_EntityMappingsType_type"),
				 OrmPackage.eINSTANCE.getEntityMappingsType_Package(),
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
				 getString("_UI_EntityMappingsType_schema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityMappingsType_schema_feature", "_UI_EntityMappingsType_type"),
				 OrmPackage.eINSTANCE.getEntityMappingsType_Schema(),
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
				 getString("_UI_EntityMappingsType_catalog_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityMappingsType_catalog_feature", "_UI_EntityMappingsType_type"),
				 OrmPackage.eINSTANCE.getEntityMappingsType_Catalog(),
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
				 getString("_UI_EntityMappingsType_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityMappingsType_access_feature", "_UI_EntityMappingsType_type"),
				 OrmPackage.eINSTANCE.getEntityMappingsType_Access(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntityMappingsType_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntityMappingsType_version_feature", "_UI_EntityMappingsType_type"),
				 OrmPackage.eINSTANCE.getEntityMappingsType_Version(),
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
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_PersistenceUnitMetadata());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_AccessMethods());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_TenantDiscriminator());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_Converter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_TypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_ObjectTypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_StructConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_SequenceGenerator());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_TableGenerator());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_Partitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_ReplicationPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_RoundRobinPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_PinnedPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_RangePartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_ValuePartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_HashPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_UnionPartitioning());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_NamedQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_NamedNativeQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_NamedStoredProcedureQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_NamedStoredFunctionQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_NamedPlsqlStoredProcedureQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_NamedPlsqlStoredFunctionQuery());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_PlsqlRecord());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_PlsqlTable());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_SqlResultSetMapping());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_MappedSuperclass());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_Entity());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEntityMappingsType_Embeddable());
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
	 * This returns EntityMappingsType.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EntityMappingsType"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((EntityMappingsType)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_EntityMappingsType_type") :
			getString("_UI_EntityMappingsType_type") + " " + label;
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

		switch (notification.getFeatureID(EntityMappingsType.class)) {
			case OrmPackage.ENTITY_MAPPINGS_TYPE__DESCRIPTION:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__PACKAGE:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SCHEMA:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__CATALOG:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS_METHODS:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__TENANT_DISCRIMINATOR:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__CONVERTER:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__TYPE_CONVERTER:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__OBJECT_TYPE_CONVERTER:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__STRUCT_CONVERTER:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__PARTITIONING:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__REPLICATION_PARTITIONING:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__ROUND_ROBIN_PARTITIONING:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__PINNED_PARTITIONING:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__RANGE_PARTITIONING:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__VALUE_PARTITIONING:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__HASH_PARTITIONING:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__UNION_PARTITIONING:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_QUERY:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_STORED_PROCEDURE_QUERY:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_STORED_FUNCTION_QUERY:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_PLSQL_STORED_PROCEDURE_QUERY:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_PLSQL_STORED_FUNCTION_QUERY:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__PLSQL_RECORD:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__PLSQL_TABLE:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__ENTITY:
			case OrmPackage.ENTITY_MAPPINGS_TYPE__EMBEDDABLE:
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
				(OrmPackage.eINSTANCE.getEntityMappingsType_PersistenceUnitMetadata(),
				 OrmFactory.eINSTANCE.createPersistenceUnitMetadata()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_AccessMethods(),
				 OrmFactory.eINSTANCE.createAccessMethods()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_TenantDiscriminator(),
				 OrmFactory.eINSTANCE.createTenantDiscriminator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_Converter(),
				 OrmFactory.eINSTANCE.createConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_TypeConverter(),
				 OrmFactory.eINSTANCE.createTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_ObjectTypeConverter(),
				 OrmFactory.eINSTANCE.createObjectTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_StructConverter(),
				 OrmFactory.eINSTANCE.createStructConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_SequenceGenerator(),
				 OrmFactory.eINSTANCE.createSequenceGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_TableGenerator(),
				 OrmFactory.eINSTANCE.createTableGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_Partitioning(),
				 OrmFactory.eINSTANCE.createPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_ReplicationPartitioning(),
				 OrmFactory.eINSTANCE.createReplicationPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_RoundRobinPartitioning(),
				 OrmFactory.eINSTANCE.createRoundRobinPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_PinnedPartitioning(),
				 OrmFactory.eINSTANCE.createPinnedPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_RangePartitioning(),
				 OrmFactory.eINSTANCE.createRangePartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_ValuePartitioning(),
				 OrmFactory.eINSTANCE.createValuePartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_HashPartitioning(),
				 OrmFactory.eINSTANCE.createHashPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_UnionPartitioning(),
				 OrmFactory.eINSTANCE.createUnionPartitioning()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_NamedQuery(),
				 OrmFactory.eINSTANCE.createNamedQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_NamedNativeQuery(),
				 OrmFactory.eINSTANCE.createNamedNativeQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_NamedStoredProcedureQuery(),
				 OrmFactory.eINSTANCE.createNamedStoredProcedureQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_NamedStoredFunctionQuery(),
				 OrmFactory.eINSTANCE.createNamedStoredFunctionQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_NamedPlsqlStoredProcedureQuery(),
				 OrmFactory.eINSTANCE.createNamedPlsqlStoredProcedureQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_NamedPlsqlStoredFunctionQuery(),
				 OrmFactory.eINSTANCE.createNamedPlsqlStoredFunctionQuery()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_PlsqlRecord(),
				 OrmFactory.eINSTANCE.createPlsqlRecord()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_PlsqlTable(),
				 OrmFactory.eINSTANCE.createPlsqlTable()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_SqlResultSetMapping(),
				 OrmFactory.eINSTANCE.createSqlResultSetMapping()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_MappedSuperclass(),
				 OrmFactory.eINSTANCE.createMappedSuperclass()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_Entity(),
				 OrmFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEntityMappingsType_Embeddable(),
				 OrmFactory.eINSTANCE.createEmbeddable()));
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
