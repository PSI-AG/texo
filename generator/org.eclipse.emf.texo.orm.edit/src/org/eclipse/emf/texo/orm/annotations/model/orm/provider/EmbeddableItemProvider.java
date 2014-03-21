/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmbeddableItemProvider.java,v 1.4 2011/08/25 15:03:09 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class EmbeddableItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EmbeddableItemProvider(AdapterFactory adapterFactory) {
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
			addAccessPropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addExcludeDefaultMappingsPropertyDescriptor(object);
			addMetadataCompletePropertyDescriptor(object);
			addParentClassPropertyDescriptor(object);
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
				 getString("_UI_Embeddable_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Embeddable_description_feature", "_UI_Embeddable_type"),
				 OrmPackage.eINSTANCE.getEmbeddable_Description(),
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
				 getString("_UI_Embeddable_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Embeddable_access_feature", "_UI_Embeddable_type"),
				 OrmPackage.eINSTANCE.getEmbeddable_Access(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Embeddable_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Embeddable_class_feature", "_UI_Embeddable_type"),
				 OrmPackage.eINSTANCE.getEmbeddable_Class(),
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
				 getString("_UI_Embeddable_excludeDefaultMappings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Embeddable_excludeDefaultMappings_feature", "_UI_Embeddable_type"),
				 OrmPackage.eINSTANCE.getEmbeddable_ExcludeDefaultMappings(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Embeddable_metadataComplete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Embeddable_metadataComplete_feature", "_UI_Embeddable_type"),
				 OrmPackage.eINSTANCE.getEmbeddable_MetadataComplete(),
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
				 getString("_UI_Embeddable_parentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Embeddable_parentClass_feature", "_UI_Embeddable_type"),
				 OrmPackage.eINSTANCE.getEmbeddable_ParentClass(),
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
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_AccessMethods());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_Customizer());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_ChangeTracking());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_Struct());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_Converter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_TypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_ObjectTypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_StructConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_CopyPolicy());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_InstantiationCopyPolicy());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_CloneCopyPolicy());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_PlsqlRecord());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_PlsqlTable());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_Property());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_AttributeOverride());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_AssociationOverride());
			childrenFeatures.add(OrmPackage.eINSTANCE.getEmbeddable_Attributes());
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
	 * This returns Embeddable.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Embeddable"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((Embeddable)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_Embeddable_type") :
			getString("_UI_Embeddable_type") + " " + label;
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

		switch (notification.getFeatureID(Embeddable.class)) {
			case OrmPackage.EMBEDDABLE__DESCRIPTION:
			case OrmPackage.EMBEDDABLE__ACCESS:
			case OrmPackage.EMBEDDABLE__CLASS:
			case OrmPackage.EMBEDDABLE__EXCLUDE_DEFAULT_MAPPINGS:
			case OrmPackage.EMBEDDABLE__METADATA_COMPLETE:
			case OrmPackage.EMBEDDABLE__PARENT_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.EMBEDDABLE__ACCESS_METHODS:
			case OrmPackage.EMBEDDABLE__CUSTOMIZER:
			case OrmPackage.EMBEDDABLE__CHANGE_TRACKING:
			case OrmPackage.EMBEDDABLE__STRUCT:
			case OrmPackage.EMBEDDABLE__CONVERTER:
			case OrmPackage.EMBEDDABLE__TYPE_CONVERTER:
			case OrmPackage.EMBEDDABLE__OBJECT_TYPE_CONVERTER:
			case OrmPackage.EMBEDDABLE__STRUCT_CONVERTER:
			case OrmPackage.EMBEDDABLE__COPY_POLICY:
			case OrmPackage.EMBEDDABLE__INSTANTIATION_COPY_POLICY:
			case OrmPackage.EMBEDDABLE__CLONE_COPY_POLICY:
			case OrmPackage.EMBEDDABLE__PLSQL_RECORD:
			case OrmPackage.EMBEDDABLE__PLSQL_TABLE:
			case OrmPackage.EMBEDDABLE__PROPERTY:
			case OrmPackage.EMBEDDABLE__ATTRIBUTE_OVERRIDE:
			case OrmPackage.EMBEDDABLE__ASSOCIATION_OVERRIDE:
			case OrmPackage.EMBEDDABLE__ATTRIBUTES:
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
				(OrmPackage.eINSTANCE.getEmbeddable_AccessMethods(),
				 OrmFactory.eINSTANCE.createAccessMethods()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_Customizer(),
				 OrmFactory.eINSTANCE.createCustomizer()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_ChangeTracking(),
				 OrmFactory.eINSTANCE.createChangeTracking()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_Struct(),
				 OrmFactory.eINSTANCE.createStruct()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_Converter(),
				 OrmFactory.eINSTANCE.createConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_TypeConverter(),
				 OrmFactory.eINSTANCE.createTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_ObjectTypeConverter(),
				 OrmFactory.eINSTANCE.createObjectTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_StructConverter(),
				 OrmFactory.eINSTANCE.createStructConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_CopyPolicy(),
				 OrmFactory.eINSTANCE.createCopyPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_InstantiationCopyPolicy(),
				 OrmFactory.eINSTANCE.createInstantiationCopyPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_CloneCopyPolicy(),
				 OrmFactory.eINSTANCE.createCloneCopyPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_PlsqlRecord(),
				 OrmFactory.eINSTANCE.createPlsqlRecord()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_PlsqlTable(),
				 OrmFactory.eINSTANCE.createPlsqlTable()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_Property(),
				 OrmFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_AttributeOverride(),
				 OrmFactory.eINSTANCE.createAttributeOverride()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_AssociationOverride(),
				 OrmFactory.eINSTANCE.createAssociationOverride()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getEmbeddable_Attributes(),
				 OrmFactory.eINSTANCE.createAttributes()));
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
