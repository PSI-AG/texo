/**
 * <copyright>
 * </copyright>
 *
 * $Id: EClassAnnotationItemProvider.java,v 1.6 2011/09/23 20:59:43 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class EClassAnnotationItemProvider extends EClassifierAnnotationItemProvider implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClassAnnotationItemProvider(AdapterFactory adapterFactory) {
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

      addEClassPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the EClass feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addEClassPropertyDescriptor(Object object) {
    // itemPropertyDescriptors.add(createItemPropertyDescriptor(
    // ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
    // getString("_UI_EClassAnnotation_eClass_feature"), getString(
    // "_UI_PropertyDescriptor_description", "_UI_EClassAnnotation_eClass_feature",
    // "_UI_EClassAnnotation_type"),
    // AnnotationsmodelPackage.Literals.ECLASS_ANNOTATION__ECLASS, false, false, false, null,
    // null, null));
  }

  /**
   * This returns EClassAnnotation.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/EClassAnnotation"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((EClassAnnotation)object).getDescription();
    return label == null || label.length() == 0 ?
      getString("_UI_EClassAnnotation_type") :
      getString("_UI_EClassAnnotation_type") + " " + label;
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
  }

}
