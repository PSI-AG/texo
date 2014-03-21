/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedEClassifierItemProvider.java,v 1.6 2011/09/23 20:59:43 mtaal Exp $
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

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClassifier} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class AnnotatedEClassifierItemProvider extends AnnotatedENamedElementItemProvider implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AnnotatedEClassifierItemProvider(AdapterFactory adapterFactory) {
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

      addEClassifierPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the EClassifier feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addEClassifierPropertyDescriptor(Object object) {
    // itemPropertyDescriptors.add
    // (createItemPropertyDescriptor
    // (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
    // getResourceLocator(),
    // getString("_UI_AnnotatedEClassifier_eClassifier_feature"),
    // getString("_UI_PropertyDescriptor_description",
    // "_UI_AnnotatedEClassifier_eClassifier_feature", "_UI_AnnotatedEClassifier_type"),
    // AnnotationsmodelPackage.Literals.ANNOTATED_ECLASSIFIER__ECLASSIFIER,
    // false,
    // false,
    // false,
    // null,
    // null,
    // null));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    return getString("_UI_AnnotatedEClassifier_type");
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
