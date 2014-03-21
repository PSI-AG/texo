/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedEEnumItemProvider.java,v 1.7 2011/09/23 20:59:43 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
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
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.util.AnnotationsModelRegistry;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnum} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class AnnotatedEEnumItemProvider extends AnnotatedEDataTypeItemProvider implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AnnotatedEEnumItemProvider(AdapterFactory adapterFactory) {
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

      addEEnumPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the EEnum feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addEEnumPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createEEnumTypeItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_AnnotatedEEnum_eEnum_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_AnnotatedEEnum_eEnum_feature", "_UI_AnnotatedEEnum_type"),
        AnnotationsmodelPackage.Literals.ANNOTATED_EENUM__EENUM, true, false, true, null, null, null));
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
      childrenFeatures.add(AnnotationsmodelPackage.Literals.ANNOTATED_EENUM__EENUM_ANNOTATIONS);
      childrenFeatures.add(AnnotationsmodelPackage.Literals.ANNOTATED_EENUM__ANNOTATED_EENUM_LITERALS);
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
   * This returns AnnotatedEEnum.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/AnnotatedEEnum"));
  }

  /**
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  @Override
  public String getText(Object object) {

    final AnnotatedEEnum aEnum = (AnnotatedEEnum) object;
    if (aEnum.getEEnum() != null) {
      return getString("_UI_AnnotatedEEnum_type") + ": " + aEnum.getEEnum().getName();
    }
    return getString("_UI_AnnotatedEEnum_type");
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

    switch (notification.getFeatureID(AnnotatedEEnum.class)) {
      case AnnotationsmodelPackage.ANNOTATED_EENUM__EENUM_ANNOTATIONS:
      case AnnotationsmodelPackage.ANNOTATED_EENUM__ANNOTATED_EENUM_LITERALS:
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
    // don't show any super types
    // super.collectNewChildDescriptors(newChildDescriptors, object);

    final AnnotatedEEnum aEnum = (AnnotatedEEnum) object;
    for (EClass eClass : AnnotationsModelRegistry.getInstance().getSubEClasses(
        AnnotationsmodelPackage.Literals.EENUM_ANNOTATION)) {
      if (eClass.isAbstract()) {
        continue;
      }
      boolean isUsed = false;
      for (EEnumAnnotation annotation : aEnum.getEEnumAnnotations()) {
        if (annotation.eClass() == eClass) {
          isUsed = true;
          break;
        }
      }
      if (!isUsed && !eClass.isAbstract()) {
        newChildDescriptors.add(createChildParameter(
            AnnotationsmodelPackage.Literals.ANNOTATED_EENUM__EENUM_ANNOTATIONS, EcoreUtil.create(eClass)));
      }
    }

  }

  protected ItemPropertyDescriptor createEEnumTypeItemPropertyDescriptor(AdapterFactory rootAdapterFactory,
      ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature,
      boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage, String category,
      String[] filterFlags) {
    return new EEnumItemPropertyDescriptor(rootAdapterFactory, resourceLocator, displayName, description, feature,
        isSettable, multiLine, sortChoices, staticImage, category, filterFlags);
  }

  private class EEnumItemPropertyDescriptor extends ItemPropertyDescriptor {
    public EEnumItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
        String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine,
        boolean sortChoices, Object staticImage, String category, String[] filterFlags) {
      super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices,
          staticImage, category, filterFlags);
    }

    @Override
    protected Collection<?> getComboBoxObjects(Object object) {
      final List<EClassifier> result = new ArrayList<EClassifier>();
      final AnnotatedEEnum aEnum = (AnnotatedEEnum) object;

      if (aEnum.getAnnotatedEPackage().getEPackage() == null) {
        return Collections.emptyList();
      }

      for (EClassifier eClassifier : aEnum.getAnnotatedEPackage().getEPackage().getEClassifiers()) {
        if (eClassifier instanceof EEnum) {
          result.add(eClassifier);
        }
      }
      return result;
    }
  }
}
