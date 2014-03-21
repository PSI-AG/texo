/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttributesItemProvider.java,v 1.4 2011/08/25 15:03:09 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.Attributes;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class AttributesItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AttributesItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_Attributes_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attributes_description_feature", "_UI_Attributes_type"),
				 OrmPackage.eINSTANCE.getAttributes_Description(),
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
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_Id());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_EmbeddedId());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_Basic());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_BasicCollection());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_BasicMap());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_Version());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_ManyToOne());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_OneToMany());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_OneToOne());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_VariableOneToOne());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_ManyToMany());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_ElementCollection());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_Embedded());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_Transformation());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_Transient());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_Structure());
			childrenFeatures.add(OrmPackage.eINSTANCE.getAttributes_Array());
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
	 * This returns Attributes.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Attributes"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((Attributes)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_Attributes_type") :
			getString("_UI_Attributes_type") + " " + label;
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

		switch (notification.getFeatureID(Attributes.class)) {
			case OrmPackage.ATTRIBUTES__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.ATTRIBUTES__ID:
			case OrmPackage.ATTRIBUTES__EMBEDDED_ID:
			case OrmPackage.ATTRIBUTES__BASIC:
			case OrmPackage.ATTRIBUTES__BASIC_COLLECTION:
			case OrmPackage.ATTRIBUTES__BASIC_MAP:
			case OrmPackage.ATTRIBUTES__VERSION:
			case OrmPackage.ATTRIBUTES__MANY_TO_ONE:
			case OrmPackage.ATTRIBUTES__ONE_TO_MANY:
			case OrmPackage.ATTRIBUTES__ONE_TO_ONE:
			case OrmPackage.ATTRIBUTES__VARIABLE_ONE_TO_ONE:
			case OrmPackage.ATTRIBUTES__MANY_TO_MANY:
			case OrmPackage.ATTRIBUTES__ELEMENT_COLLECTION:
			case OrmPackage.ATTRIBUTES__EMBEDDED:
			case OrmPackage.ATTRIBUTES__TRANSFORMATION:
			case OrmPackage.ATTRIBUTES__TRANSIENT:
			case OrmPackage.ATTRIBUTES__STRUCTURE:
			case OrmPackage.ATTRIBUTES__ARRAY:
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
				(OrmPackage.eINSTANCE.getAttributes_Id(),
				 OrmFactory.eINSTANCE.createId()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_EmbeddedId(),
				 OrmFactory.eINSTANCE.createEmbeddedId()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_Basic(),
				 OrmFactory.eINSTANCE.createBasic()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_BasicCollection(),
				 OrmFactory.eINSTANCE.createBasicCollection()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_BasicMap(),
				 OrmFactory.eINSTANCE.createBasicMap()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_Version(),
				 OrmFactory.eINSTANCE.createVersion()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_ManyToOne(),
				 OrmFactory.eINSTANCE.createManyToOne()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_OneToMany(),
				 OrmFactory.eINSTANCE.createOneToMany()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_OneToOne(),
				 OrmFactory.eINSTANCE.createOneToOne()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_VariableOneToOne(),
				 OrmFactory.eINSTANCE.createVariableOneToOne()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_ManyToMany(),
				 OrmFactory.eINSTANCE.createManyToMany()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_ElementCollection(),
				 OrmFactory.eINSTANCE.createElementCollection()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_Embedded(),
				 OrmFactory.eINSTANCE.createEmbedded()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_Transformation(),
				 OrmFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_Transient(),
				 OrmFactory.eINSTANCE.createTransient()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_Structure(),
				 OrmFactory.eINSTANCE.createStructure()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getAttributes_Array(),
				 OrmFactory.eINSTANCE.createArray()));
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
