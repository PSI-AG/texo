/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnnotatedEEnumLiteralItemProvider.java,v 1.5 2011/09/23 20:59:43 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.EEnumLiteralAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.util.AnnotationsModelRegistry;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEEnumLiteral} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class AnnotatedEEnumLiteralItemProvider extends AnnotatedENamedElementItemProvider implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AnnotatedEEnumLiteralItemProvider(AdapterFactory adapterFactory) {
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

      addEEnumLiteralPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the EEnum Literal feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addEEnumLiteralPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_AnnotatedEEnumLiteral_eEnumLiteral_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_AnnotatedEEnumLiteral_eEnumLiteral_feature", "_UI_AnnotatedEEnumLiteral_type"),
         AnnotationsmodelPackage.Literals.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL,
         true,
         false,
         true,
         null,
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
      childrenFeatures.add(AnnotationsmodelPackage.Literals.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS);
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
   * This returns AnnotatedEEnumLiteral.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/AnnotatedEEnumLiteral"));
  }

  /**
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  @Override
  public String getText(Object object) {
    final AnnotatedEEnumLiteral aLiteral = (AnnotatedEEnumLiteral) object;
    if (aLiteral.getEEnumLiteral() != null) {
      return getString("_UI_AnnotatedEEnumLiteral_type") + ": " + aLiteral.getEEnumLiteral().getName();
    }

    return getString("_UI_AnnotatedEEnumLiteral_type");
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

    switch (notification.getFeatureID(AnnotatedEEnumLiteral.class)) {
      case AnnotationsmodelPackage.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS:
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
    // AnnotationsmodelPackage.Literals.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS,
    // AnnotationsmodelFactory.eINSTANCE.createEEnumLiteralAnnotation()));

    final AnnotatedEEnumLiteral aEnum = (AnnotatedEEnumLiteral) object;
    for (EClass eClass : AnnotationsModelRegistry.getInstance().getSubEClasses(
        AnnotationsmodelPackage.Literals.EENUM_LITERAL_ANNOTATION)) {
      if (eClass.isAbstract()) {
        continue;
      }
      boolean isUsed = false;
      for (EEnumLiteralAnnotation annotation : aEnum.getEEnumLiteralAnnotations()) {
        if (annotation.eClass() == eClass) {
          isUsed = true;
          break;
        }
      }
      if (!isUsed && !eClass.isAbstract()) {
        newChildDescriptors.add(createChildParameter(
            AnnotationsmodelPackage.Literals.ANNOTATED_EENUM_LITERAL__EENUM_LITERAL_ANNOTATIONS,
            EcoreUtil.create(eClass)));
      }
    }
  }

}
