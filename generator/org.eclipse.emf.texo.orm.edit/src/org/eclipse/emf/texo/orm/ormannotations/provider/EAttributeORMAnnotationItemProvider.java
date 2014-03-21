/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAttributeORMAnnotationItemProvider.java,v 1.7 2011/09/23 20:59:49 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.texo.annotations.annotationsmodel.provider.EAttributeAnnotationItemProvider;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class EAttributeORMAnnotationItemProvider extends EAttributeAnnotationItemProvider implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttributeORMAnnotationItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      // addVersionPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
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
      childrenFeatures.add(OrmannotationsPackage.Literals.EATTRIBUTE_ORM_ANNOTATION__BASIC);
      childrenFeatures.add(OrmannotationsPackage.Literals.EATTRIBUTE_ORM_ANNOTATION__ID);
      childrenFeatures.add(OrmannotationsPackage.Literals.EATTRIBUTE_ORM_ANNOTATION__VERSION);
      childrenFeatures.add(OrmannotationsPackage.Literals.EATTRIBUTE_ORM_ANNOTATION__ONE_TO_MANY);
      childrenFeatures.add(OrmannotationsPackage.Literals.EATTRIBUTE_ORM_ANNOTATION__FEATURE_MAP_ENTITY);
      childrenFeatures.add(OrmannotationsPackage.Literals.EATTRIBUTE_ORM_ANNOTATION__MANY_TO_ONE);
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
   * This returns EAttributeORMAnnotation.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/EAttributeORMAnnotation")); //$NON-NLS-1$
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((EAttributeORMAnnotation)object).getDescription();
    return label == null || label.length() == 0 ?
      getString("_UI_EAttributeORMAnnotation_type") : //$NON-NLS-1$
      getString("_UI_EAttributeORMAnnotation_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

    switch (notification.getFeatureID(EAttributeORMAnnotation.class)) {
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__TRANSIENT:
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__COLLECTION_TABLE:
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ELEMENT_COLLECTION:
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__BASIC:
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ID:
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__VERSION:
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ONE_TO_MANY:
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__FEATURE_MAP_ENTITY:
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__MANY_TO_ONE:
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
        (OrmannotationsPackage.Literals.EATTRIBUTE_ORM_ANNOTATION__BASIC,
         OrmFactory.eINSTANCE.createBasic()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EATTRIBUTE_ORM_ANNOTATION__ID,
         OrmFactory.eINSTANCE.createId()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EATTRIBUTE_ORM_ANNOTATION__VERSION,
         OrmFactory.eINSTANCE.createVersion()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EATTRIBUTE_ORM_ANNOTATION__ONE_TO_MANY,
         OrmFactory.eINSTANCE.createOneToMany()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EATTRIBUTE_ORM_ANNOTATION__FEATURE_MAP_ENTITY,
         OrmFactory.eINSTANCE.createEntity()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EATTRIBUTE_ORM_ANNOTATION__MANY_TO_ONE,
         OrmFactory.eINSTANCE.createManyToOne()));
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
