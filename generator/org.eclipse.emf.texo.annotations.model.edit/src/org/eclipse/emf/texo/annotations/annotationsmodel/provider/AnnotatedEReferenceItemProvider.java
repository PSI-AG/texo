/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedEReferenceItemProvider.java,v 1.7 2011/09/23 20:59:43 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.util.AnnotationsModelRegistry;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEReference} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class AnnotatedEReferenceItemProvider extends AnnotatedEStructuralFeatureItemProvider implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AnnotatedEReferenceItemProvider(AdapterFactory adapterFactory) {
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

      addEReferencePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the EReference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addEReferencePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createEReferenceItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_AnnotatedEReference_eReference_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_AnnotatedEReference_eReference_feature",
            "_UI_AnnotatedEReference_type"), AnnotationsmodelPackage.Literals.ANNOTATED_EREFERENCE__EREFERENCE, true,
        false, true, null, null, null));
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
      childrenFeatures.add(AnnotationsmodelPackage.Literals.ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS);
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
   * This returns AnnotatedEReference.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/AnnotatedEReference"));
  }

  /**
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  @Override
  public String getText(Object object) {

    final AnnotatedEReference aReference = (AnnotatedEReference) object;
    if (aReference.getEReference() != null) {
      return getString("_UI_AnnotatedEReference_type") + ": " + aReference.getEReference().getName();
    }
    return getString("_UI_AnnotatedEReference_type");
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

    switch (notification.getFeatureID(AnnotatedEReference.class)) {
      case AnnotationsmodelPackage.ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created under
   * this object. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    // newChildDescriptors.add(createChildParameter(
    // AnnotationsmodelPackage.Literals.ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS,
    // AnnotationsmodelFactory.eINSTANCE.createEReferenceAnnotation()));

    final AnnotatedEReference aReference = (AnnotatedEReference) object;
    for (EClass eClass : AnnotationsModelRegistry.getInstance().getSubEClasses(
        AnnotationsmodelPackage.Literals.EREFERENCE_ANNOTATION)) {
      if (eClass.isAbstract()) {
        continue;
      }
      boolean isUsed = false;
      for (EReferenceAnnotation annotation : aReference.getEReferenceAnnotations()) {
        if (annotation.eClass() == eClass) {
          isUsed = true;
          break;
        }
      }
      if (!isUsed) {
        newChildDescriptors.add(createChildParameter(
            AnnotationsmodelPackage.Literals.ANNOTATED_EREFERENCE__EREFERENCE_ANNOTATIONS, EcoreUtil.create(eClass)));
      }
    }
  }

  protected ItemPropertyDescriptor createEReferenceItemPropertyDescriptor(AdapterFactory rootAdapterFactory,
      ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature,
      boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage, String category,
      String[] filterFlags) {
    return new EReferenceItemPropertyDescriptor(rootAdapterFactory, resourceLocator, displayName, description, feature,
        isSettable, multiLine, sortChoices, staticImage, category, filterFlags);
  }

  private class EReferenceItemPropertyDescriptor extends ItemPropertyDescriptor {
    public EReferenceItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
        String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine,
        boolean sortChoices, Object staticImage, String category, String[] filterFlags) {
      super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices,
          staticImage, category, filterFlags);
    }

    @Override
    protected Collection<?> getComboBoxObjects(Object object) {
      final List<EReference> result = new ArrayList<EReference>();
      final AnnotatedEReference aReference = (AnnotatedEReference) object;

      for (EReference eReference : aReference.getAnnotatedEClass().getEClass().getEAllReferences()) {
        result.add(eReference);
      }
      return result;
    }
  }
}
