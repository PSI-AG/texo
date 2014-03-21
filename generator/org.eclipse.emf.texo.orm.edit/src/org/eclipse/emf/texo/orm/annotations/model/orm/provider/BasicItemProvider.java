/**
 * <copyright>
 * </copyright>
 *
 * $Id: BasicItemProvider.java,v 1.4 2011/08/25 15:03:10 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.Basic;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class BasicItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public BasicItemProvider(AdapterFactory adapterFactory) {
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
			addFetchPropertyDescriptor(object);
			addMutablePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addOptionalPropertyDescriptor(object);
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
				 getString("_UI_Basic_temporal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Basic_temporal_feature", "_UI_Basic_type"),
				 OrmPackage.eINSTANCE.getBasic_Temporal(),
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
				 getString("_UI_Basic_enumerated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Basic_enumerated_feature", "_UI_Basic_type"),
				 OrmPackage.eINSTANCE.getBasic_Enumerated(),
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
				 getString("_UI_Basic_convert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Basic_convert_feature", "_UI_Basic_type"),
				 OrmPackage.eINSTANCE.getBasic_Convert(),
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
				 getString("_UI_Basic_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Basic_access_feature", "_UI_Basic_type"),
				 OrmPackage.eINSTANCE.getBasic_Access(),
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
				 getString("_UI_Basic_attributeType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Basic_attributeType_feature", "_UI_Basic_type"),
				 OrmPackage.eINSTANCE.getBasic_AttributeType(),
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
				 getString("_UI_Basic_fetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Basic_fetch_feature", "_UI_Basic_type"),
				 OrmPackage.eINSTANCE.getBasic_Fetch(),
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
				 getString("_UI_Basic_mutable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Basic_mutable_feature", "_UI_Basic_type"),
				 OrmPackage.eINSTANCE.getBasic_Mutable(),
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
				 getString("_UI_Basic_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Basic_name_feature", "_UI_Basic_type"),
				 OrmPackage.eINSTANCE.getBasic_Name(),
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
				 getString("_UI_Basic_optional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Basic_optional_feature", "_UI_Basic_type"),
				 OrmPackage.eINSTANCE.getBasic_Optional(),
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
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasic_Column());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasic_Index());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasic_GeneratedValue());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasic_Lob());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasic_Converter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasic_TypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasic_ObjectTypeConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasic_StructConverter());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasic_TableGenerator());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasic_SequenceGenerator());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasic_Property());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasic_AccessMethods());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasic_ReturnInsert());
			childrenFeatures.add(OrmPackage.eINSTANCE.getBasic_ReturnUpdate());
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
	 * This returns Basic.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Basic"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((Basic)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Basic_type") :
			getString("_UI_Basic_type") + " " + label;
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

		switch (notification.getFeatureID(Basic.class)) {
			case OrmPackage.BASIC__TEMPORAL:
			case OrmPackage.BASIC__ENUMERATED:
			case OrmPackage.BASIC__CONVERT:
			case OrmPackage.BASIC__ACCESS:
			case OrmPackage.BASIC__ATTRIBUTE_TYPE:
			case OrmPackage.BASIC__FETCH:
			case OrmPackage.BASIC__MUTABLE:
			case OrmPackage.BASIC__NAME:
			case OrmPackage.BASIC__OPTIONAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.BASIC__COLUMN:
			case OrmPackage.BASIC__INDEX:
			case OrmPackage.BASIC__GENERATED_VALUE:
			case OrmPackage.BASIC__LOB:
			case OrmPackage.BASIC__CONVERTER:
			case OrmPackage.BASIC__TYPE_CONVERTER:
			case OrmPackage.BASIC__OBJECT_TYPE_CONVERTER:
			case OrmPackage.BASIC__STRUCT_CONVERTER:
			case OrmPackage.BASIC__TABLE_GENERATOR:
			case OrmPackage.BASIC__SEQUENCE_GENERATOR:
			case OrmPackage.BASIC__PROPERTY:
			case OrmPackage.BASIC__ACCESS_METHODS:
			case OrmPackage.BASIC__RETURN_INSERT:
			case OrmPackage.BASIC__RETURN_UPDATE:
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
				(OrmPackage.eINSTANCE.getBasic_Column(),
				 OrmFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasic_Index(),
				 OrmFactory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasic_GeneratedValue(),
				 OrmFactory.eINSTANCE.createGeneratedValue()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasic_Lob(),
				 OrmFactory.eINSTANCE.createLob()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasic_Converter(),
				 OrmFactory.eINSTANCE.createConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasic_TypeConverter(),
				 OrmFactory.eINSTANCE.createTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasic_ObjectTypeConverter(),
				 OrmFactory.eINSTANCE.createObjectTypeConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasic_StructConverter(),
				 OrmFactory.eINSTANCE.createStructConverter()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasic_TableGenerator(),
				 OrmFactory.eINSTANCE.createTableGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasic_SequenceGenerator(),
				 OrmFactory.eINSTANCE.createSequenceGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasic_Property(),
				 OrmFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasic_AccessMethods(),
				 OrmFactory.eINSTANCE.createAccessMethods()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasic_ReturnInsert(),
				 OrmFactory.eINSTANCE.createReturnInsert()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getBasic_ReturnUpdate(),
				 OrmFactory.eINSTANCE.createEmptyType()));
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
