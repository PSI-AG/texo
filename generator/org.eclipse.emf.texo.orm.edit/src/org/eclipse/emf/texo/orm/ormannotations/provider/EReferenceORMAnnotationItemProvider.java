/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.ormannotations.provider;

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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.texo.annotations.annotationsmodel.provider.EReferenceAnnotationItemProvider;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class EReferenceORMAnnotationItemProvider extends EReferenceAnnotationItemProvider implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReferenceORMAnnotationItemProvider(AdapterFactory adapterFactory) {
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

      addEmbeddedPropertyDescriptor(object);
      addOrderByPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Embedded feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addEmbeddedPropertyDescriptor(Object object) {
    // somehow EMF insists on generating the embedded as a property....
    // prevent this by just commenting out
    // itemPropertyDescriptors.add
    // (createItemPropertyDescriptor
    // (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
    // getResourceLocator(),
    // getString("_UI_EReferenceORMAnnotation_embedded_feature"),
    // getString("_UI_PropertyDescriptor_description", "_UI_EReferenceORMAnnotation_embedded_feature",
    // "_UI_EReferenceORMAnnotation_type"),
    // OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__EMBEDDED,
    // true,
    // false,
    // true,
    // null,
    // null,
    // null));
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
         getString("_UI_EReferenceORMAnnotation_orderBy_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EReferenceORMAnnotation_orderBy_feature", "_UI_EReferenceORMAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__ORDER_BY,
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
      childrenFeatures.add(OrmannotationsPackage.Literals.ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT);
      childrenFeatures.add(OrmannotationsPackage.Literals.ESTRUCTURAL_FEATURE_ORM_ANNOTATION__COLLECTION_TABLE);
      childrenFeatures.add(OrmannotationsPackage.Literals.ESTRUCTURAL_FEATURE_ORM_ANNOTATION__ELEMENT_COLLECTION);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__EMBEDDED);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__EMBEDDED_ID);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__JOIN_COLUMN);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__JOIN_TABLE);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__MANY_TO_MANY);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__MANY_TO_ONE);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__ONE_TO_MANY);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__ONE_TO_ONE);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__MAP_KEY);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__MAP_KEY_CLASS);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__MAP_KEY_COLUMN);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__MAP_KEY_JOIN_COLUMN);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__ORDER_COLUMN);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__BASIC_COLLECTION);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__BASIC_MAP);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__ASSOCIATION_OVERRIDE);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__ATTRIBUTE_OVERRIDE);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__PRIMARY_KEY_JOIN_COLUMN);
      childrenFeatures.add(OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__BASIC);
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
   * This returns EReferenceORMAnnotation.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/EReferenceORMAnnotation")); //$NON-NLS-1$
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((EReferenceORMAnnotation)object).getDescription();
    return label == null || label.length() == 0 ?
      getString("_UI_EReferenceORMAnnotation_type") : //$NON-NLS-1$
      getString("_UI_EReferenceORMAnnotation_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

    switch (notification.getFeatureID(EReferenceORMAnnotation.class)) {
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_BY:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__TRANSIENT:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__COLLECTION_TABLE:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ELEMENT_COLLECTION:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED_ID:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_COLUMN:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_TABLE:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_MANY:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_ONE:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_MANY:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_ONE:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_CLASS:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_COLUMN:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_JOIN_COLUMN:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_COLUMN:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_COLLECTION:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_MAP:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ASSOCIATION_OVERRIDE:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ATTRIBUTE_OVERRIDE:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__PRIMARY_KEY_JOIN_COLUMN:
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC:
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
        (OrmannotationsPackage.Literals.ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT,
         OrmFactory.eINSTANCE.createTransient()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.ESTRUCTURAL_FEATURE_ORM_ANNOTATION__COLLECTION_TABLE,
         OrmFactory.eINSTANCE.createCollectionTable()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.ESTRUCTURAL_FEATURE_ORM_ANNOTATION__ELEMENT_COLLECTION,
         OrmFactory.eINSTANCE.createElementCollection()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__EMBEDDED,
         OrmFactory.eINSTANCE.createEmbedded()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__EMBEDDED_ID,
         OrmFactory.eINSTANCE.createEmbeddedId()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__JOIN_COLUMN,
         OrmFactory.eINSTANCE.createJoinColumn()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__JOIN_TABLE,
         OrmFactory.eINSTANCE.createJoinTable()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__MANY_TO_MANY,
         OrmFactory.eINSTANCE.createManyToMany()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__MANY_TO_ONE,
         OrmFactory.eINSTANCE.createManyToOne()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__ONE_TO_MANY,
         OrmFactory.eINSTANCE.createOneToMany()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__ONE_TO_ONE,
         OrmFactory.eINSTANCE.createOneToOne()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__MAP_KEY,
         OrmFactory.eINSTANCE.createMapKey()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__MAP_KEY_CLASS,
         OrmFactory.eINSTANCE.createMapKeyClass()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__MAP_KEY_COLUMN,
         OrmFactory.eINSTANCE.createMapKeyColumn()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__MAP_KEY_JOIN_COLUMN,
         OrmFactory.eINSTANCE.createMapKeyJoinColumn()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__ORDER_COLUMN,
         OrmFactory.eINSTANCE.createOrderColumn()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__BASIC_COLLECTION,
         OrmFactory.eINSTANCE.createBasicCollection()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__BASIC_MAP,
         OrmFactory.eINSTANCE.createBasicMap()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__ASSOCIATION_OVERRIDE,
         OrmFactory.eINSTANCE.createAssociationOverride()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__ATTRIBUTE_OVERRIDE,
         OrmFactory.eINSTANCE.createAttributeOverride()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__PRIMARY_KEY_JOIN_COLUMN,
         OrmFactory.eINSTANCE.createPrimaryKeyJoinColumn()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION__BASIC,
         OrmFactory.eINSTANCE.createBasic()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator() {
    return TexoannotationsormEditPlugin.INSTANCE;
  }

}
