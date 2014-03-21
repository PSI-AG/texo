/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdItemProvider.java,v 1.4 2011/08/25 15:03:10 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.Id;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.Id} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class IdItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public IdItemProvider(AdapterFactory adapterFactory) {
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

			addTemporalPropertyDescriptor(object);
			addEnumeratedPropertyDescriptor(object);
			addConvertPropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addAttributeTypePropertyDescriptor(object);
			addMutablePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Id_temporal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Id_temporal_feature", "_UI_Id_type"),
				 OrmPackage.eINSTANCE.getId_Temporal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Enumerated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnumeratedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Id_enumerated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Id_enumerated_feature", "_UI_Id_type"),
				 OrmPackage.eINSTANCE.getId_Enumerated(),
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
				 getString("_UI_Id_convert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Id_convert_feature", "_UI_Id_type"),
				 OrmPackage.eINSTANCE.getId_Convert(),
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
				 getString("_UI_Id_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Id_access_feature", "_UI_Id_type"),
				 OrmPackage.eINSTANCE.getId_Access(),
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
				 getString("_UI_Id_attributeType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Id_attributeType_feature", "_UI_Id_type"),
				 OrmPackage.eINSTANCE.getId_AttributeType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Mutable feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addMutablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Id_mutable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Id_mutable_feature", "_UI_Id_type"),
				 OrmPackage.eINSTANCE.getId_Mutable(),
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
				 getString("_UI_Id_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Id_name_feature", "_UI_Id_type"),
				 OrmPackage.eINSTANCE.getId_Name(),
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
			childrenFeatures.add(OrmPackage.eINSTANCE.getId_Column());
			childrenFeatures.add(OrmPackage.eINSTANCE.getId_Index());
			childrenFeatures.add(OrmPackage.eINSTANCE.getId_GeneratedValue());
			childrenFeatures.add(OrmPackage.eINSTANCE.getId_Converter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getId_TypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getId_ObjectTypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getId_StructConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getId_TableGenerator());
			childrenFeatures.add(OrmPackage.eINSTANCE.getId_SequenceGenerator());
			childrenFeatures.add(OrmPackage.eINSTANCE.getId_Property());
			childrenFeatures.add(OrmPackage.eINSTANCE.getId_AccessMethods());
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
	 * This returns Id.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Id"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((Id)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Id_type") :
			getString("_UI_Id_type") + " " + label;
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

		switch (notification.getFeatureID(Id.class)) {
			case OrmPackage.ID__TEMPORAL:
			case OrmPackage.ID__ENUMERATED:
			case OrmPackage.ID__CONVERT:
			case OrmPackage.ID__ACCESS:
			case OrmPackage.ID__ATTRIBUTE_TYPE:
			case OrmPackage.ID__MUTABLE:
			case OrmPackage.ID__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.ID__COLUMN:
			case OrmPackage.ID__INDEX:
			case OrmPackage.ID__GENERATED_VALUE:
			case OrmPackage.ID__CONVERTER:
			case OrmPackage.ID__TYPE_CONVERTER:
			case OrmPackage.ID__OBJECT_TYPE_CONVERTER:
			case OrmPackage.ID__STRUCT_CONVERTER:
			case OrmPackage.ID__TABLE_GENERATOR:
			case OrmPackage.ID__SEQUENCE_GENERATOR:
			case OrmPackage.ID__PROPERTY:
			case OrmPackage.ID__ACCESS_METHODS:
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
				(OrmPackage.eINSTANCE.getId_Column(),
				 OrmFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getId_Index(),
				 OrmFactory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getId_GeneratedValue(),
				 OrmFactory.eINSTANCE.createGeneratedValue()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getId_Converter(),
				 OrmFactory.eINSTANCE.createConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getId_TypeConverter(),
				 OrmFactory.eINSTANCE.createTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getId_ObjectTypeConverter(),
				 OrmFactory.eINSTANCE.createObjectTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getId_StructConverter(),
				 OrmFactory.eINSTANCE.createStructConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getId_TableGenerator(),
				 OrmFactory.eINSTANCE.createTableGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getId_SequenceGenerator(),
				 OrmFactory.eINSTANCE.createSequenceGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getId_Property(),
				 OrmFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getId_AccessMethods(),
				 OrmFactory.eINSTANCE.createAccessMethods()));
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
