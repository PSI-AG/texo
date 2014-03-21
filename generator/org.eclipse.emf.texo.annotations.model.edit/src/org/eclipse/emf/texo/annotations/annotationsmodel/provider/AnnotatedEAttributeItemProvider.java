/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedEAttributeItemProvider.java,v 1.7 2011/09/23 20:59:43 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.util.AnnotationsModelRegistry;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEAttribute} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class AnnotatedEAttributeItemProvider extends AnnotatedEStructuralFeatureItemProvider implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AnnotatedEAttributeItemProvider(AdapterFactory adapterFactory) {
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

      addEAttributePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the EAttribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addEAttributePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createEAttributeItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_AnnotatedEAttribute_eAttribute_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_AnnotatedEAttribute_eAttribute_feature",
            "_UI_AnnotatedEAttribute_type"), AnnotationsmodelPackage.Literals.ANNOTATED_EATTRIBUTE__EATTRIBUTE, true,
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
      childrenFeatures.add(AnnotationsmodelPackage.Literals.ANNOTATED_EATTRIBUTE__EATTRIBUTE_ANNOTATIONS);
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
   * This returns AnnotatedEAttribute.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/AnnotatedEAttribute"));
  }

  /**
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  @Override
  public String getText(Object object) {

    final AnnotatedEAttribute aAttribute = (AnnotatedEAttribute) object;
    if (aAttribute.getEAttribute() != null) {
      return getString("_UI_AnnotatedEAttribute_type") + ": " + aAttribute.getEAttribute().getName();
    }
    return getString("_UI_AnnotatedEAttribute_type");
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

    switch (notification.getFeatureID(AnnotatedEAttribute.class)) {
      case AnnotationsmodelPackage.ANNOTATED_EATTRIBUTE__EATTRIBUTE_ANNOTATIONS:
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

    final AnnotatedEAttribute aAttribute = (AnnotatedEAttribute) object;
    for (EClass eClass : AnnotationsModelRegistry.getInstance().getSubEClasses(
        AnnotationsmodelPackage.Literals.EATTRIBUTE_ANNOTATION)) {
      boolean isUsed = false;
      for (EAttributeAnnotation annotation : aAttribute.getEAttributeAnnotations()) {
        if (eClass.isAbstract()) {
          continue;
        }
        if (annotation.eClass() == eClass) {
          isUsed = true;
          break;
        }
      }
      if (!isUsed) {
        newChildDescriptors.add(createChildParameter(
            AnnotationsmodelPackage.Literals.ANNOTATED_EATTRIBUTE__EATTRIBUTE_ANNOTATIONS, EcoreUtil.create(eClass)));
      }
    }
  }

  protected ItemPropertyDescriptor createEAttributeItemPropertyDescriptor(AdapterFactory rootAdapterFactory,
      ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature,
      boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage, String category,
      String[] filterFlags) {
    return new EAttributeItemPropertyDescriptor(rootAdapterFactory, resourceLocator, displayName, description, feature,
        isSettable, multiLine, sortChoices, staticImage, category, filterFlags);
  }

  private class EAttributeItemPropertyDescriptor extends ItemPropertyDescriptor {
    public EAttributeItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
        String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine,
        boolean sortChoices, Object staticImage, String category, String[] filterFlags) {
      super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices,
          staticImage, category, filterFlags);
    }

    @Override
    protected Collection<?> getComboBoxObjects(Object object) {
      final List<EAttribute> result = new ArrayList<EAttribute>();
      final AnnotatedEAttribute aAttribute = (AnnotatedEAttribute) object;

      for (EAttribute eAttribute : aAttribute.getAnnotatedEClass().getEClass().getEAllAttributes()) {
        result.add(eAttribute);
      }
      return result;
    }
  }

}
