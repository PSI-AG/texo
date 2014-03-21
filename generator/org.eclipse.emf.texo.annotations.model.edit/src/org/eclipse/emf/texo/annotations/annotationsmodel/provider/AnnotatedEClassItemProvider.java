/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedEClassItemProvider.java,v 1.7 2011/09/23 20:59:43 mtaal Exp $
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
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelFactory;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.util.AnnotationsModelRegistry;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEClass} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class AnnotatedEClassItemProvider extends AnnotatedEClassifierItemProvider implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AnnotatedEClassItemProvider(AdapterFactory adapterFactory) {
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
   * This adds a property descriptor for the EClass feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addEClassPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_AnnotatedEClass_eClass_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_AnnotatedEClass_eClass_feature", "_UI_AnnotatedEClass_type"),
         AnnotationsmodelPackage.Literals.ANNOTATED_ECLASS__ECLASS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  protected ItemPropertyDescriptor createEClassItemPropertyDescriptor(AdapterFactory adapterFactory,
      ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature,
      boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage, String category,
      String[] filterFlags) {
    return new EClassItemPropertyDescriptor(adapterFactory, resourceLocator, displayName, description, feature,
        isSettable, multiLine, sortChoices, staticImage, category, filterFlags);
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
      childrenFeatures.add(AnnotationsmodelPackage.Literals.ANNOTATED_ECLASS__ECLASS_ANNOTATIONS);
      childrenFeatures.add(AnnotationsmodelPackage.Literals.ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES);
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
   * This returns AnnotatedEClass.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/AnnotatedEClass"));
  }

  /**
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  @Override
  public String getText(Object object) {

    final AnnotatedEClass aClass = (AnnotatedEClass) object;
    if (aClass.getEClass() != null) {
      return getString("_UI_AnnotatedEClass_type") + ": " + aClass.getEClass().getName();
    }

    return getString("_UI_AnnotatedEClass_type");
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

    switch (notification.getFeatureID(AnnotatedEClass.class)) {
      case AnnotationsmodelPackage.ANNOTATED_ECLASS__ECLASS_ANNOTATIONS:
      case AnnotationsmodelPackage.ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES:
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
    // AnnotationsmodelPackage.Literals.ANNOTATED_ECLASS__ECLASS_ANNOTATIONS,
    // AnnotationsmodelFactory.eINSTANCE.createEClassAnnotation()));

    final AnnotatedEClass aClass = (AnnotatedEClass) object;
    for (EClass eClass : AnnotationsModelRegistry.getInstance().getSubEClasses(
        AnnotationsmodelPackage.Literals.ECLASS_ANNOTATION)) {
      if (eClass.isAbstract()) {
        continue;
      }
      boolean isUsed = false;
      for (EClassAnnotation annotation : aClass.getEClassAnnotations()) {
        if (annotation.eClass() == eClass) {
          isUsed = true;
          break;
        }
      }
      if (!isUsed) {
        newChildDescriptors.add(createChildParameter(
            AnnotationsmodelPackage.Literals.ANNOTATED_ECLASS__ECLASS_ANNOTATIONS, EcoreUtil.create(eClass)));
      }
    }

    newChildDescriptors.add(createChildParameter(
        AnnotationsmodelPackage.Literals.ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES,
        AnnotationsmodelFactory.eINSTANCE.createAnnotatedEReference()));

    newChildDescriptors.add(createChildParameter(
        AnnotationsmodelPackage.Literals.ANNOTATED_ECLASS__ANNOTATED_ESTRUCTURAL_FEATURES,
        AnnotationsmodelFactory.eINSTANCE.createAnnotatedEAttribute()));
  }

  private class EClassItemPropertyDescriptor extends ItemPropertyDescriptor {
    public EClassItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator,
        String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine,
        boolean sortChoices, Object staticImage, String category, String[] filterFlags) {
      super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices,
          staticImage, category, filterFlags);
    }

    @Override
    protected Collection<?> getComboBoxObjects(Object object) {
      final List<EClassifier> result = new ArrayList<EClassifier>();
      final AnnotatedEClass aClass = (AnnotatedEClass) object;

      if (aClass.getAnnotatedEPackage().getEPackage() == null) {
        return Collections.emptyList();
      }

      for (EClassifier eClassifier : aClass.getAnnotatedEPackage().getEPackage().getEClassifiers()) {
        if (eClassifier instanceof EClass) {
          result.add(eClassifier);
        }
      }
      return result;
    }
  }
}
