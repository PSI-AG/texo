/**
 * <copyright>
 * </copyright>
 *
 * $Id: EClassModelGenAnnotationItemProvider.java,v 1.9 2011/09/23 11:03:09 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.modelannotations.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.texo.annotations.annotationsmodel.provider.EClassAnnotationItemProvider;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EClassModelGenAnnotationItemProvider extends EClassAnnotationItemProvider implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClassModelGenAnnotationItemProvider(AdapterFactory adapterFactory) {
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

      addDocumentationPropertyDescriptor(object);
      // addNamePropertyDescriptor(object);
      addQualifiedClassNamePropertyDescriptor(object);
      addSimpleClassNamePropertyDescriptor(object);
      addGenerateCodePropertyDescriptor(object);
      // addOwnerEPackageAnnotationPropertyDescriptor(object);
      // addHasManyFeaturesPropertyDescriptor(object);
      addClassExtendsPropertyDescriptor(object);
      addDaoQualifiedClassNamePropertyDescriptor(object);
      // addHasSuperEClassPropertyDescriptor(object);
      addClassImplementsPropertyDescriptor(object);
      addSerializablePropertyDescriptor(object);
      // addAbstractPropertyDescriptor(object);
      // addSuperEClassPropertyDescriptor(object);
      // addFeatureMapFeaturesPropertyDescriptor(object);
      // addEStructuralFeatureModelGenAnnotationsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Documentation feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addDocumentationPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ENamedElementModelGenAnnotation_documentation_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_ENamedElementModelGenAnnotation_documentation_feature", "_UI_ENamedElementModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ENamedElementModelGenAnnotation_name_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_ENamedElementModelGenAnnotation_name_feature", "_UI_ENamedElementModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Qualified Class Name feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addQualifiedClassNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EClassifierModelGenAnnotation_qualifiedClassName_feature"), //$NON-NLS-1$
        getString("_UI_EClassifierModelGenAnnotation_qualifiedClassName_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.ECLASSIFIER_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Simple Class Name feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addSimpleClassNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EClassifierModelGenAnnotation_simpleClassName_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EClassifierModelGenAnnotation_simpleClassName_feature", "_UI_EClassifierModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ECLASSIFIER_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Generate Code feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addGenerateCodePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EClassifierModelGenAnnotation_generateCode_feature"), //$NON-NLS-1$
        getString("_UI_EClassifierModelGenAnnotation_generateCode_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.ECLASSIFIER_MODEL_GEN_ANNOTATION__GENERATE_CODE, true, false, false,
        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Owner EPackage Annotation feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addOwnerEPackageAnnotationPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EClassifierModelGenAnnotation_ownerEPackageAnnotation_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EClassifierModelGenAnnotation_ownerEPackageAnnotation_feature", "_UI_EClassifierModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ECLASSIFIER_MODEL_GEN_ANNOTATION__OWNER_EPACKAGE_ANNOTATION,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Has Many Features feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addHasManyFeaturesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EClassModelGenAnnotation_hasManyFeatures_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EClassModelGenAnnotation_hasManyFeatures_feature", "_UI_EClassModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ECLASS_MODEL_GEN_ANNOTATION__HAS_MANY_FEATURES,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Class Extends feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addClassExtendsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EClassModelGenAnnotation_classExtends_feature"), //$NON-NLS-1$
        getString("_UI_EClassModelGenAnnotation_classExtends_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.ECLASS_MODEL_GEN_ANNOTATION__CLASS_EXTENDS, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Has Super EClass feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addHasSuperEClassPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EClassModelGenAnnotation_hasSuperEClass_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EClassModelGenAnnotation_hasSuperEClass_feature", "_UI_EClassModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ECLASS_MODEL_GEN_ANNOTATION__HAS_SUPER_ECLASS,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Class Implements feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addClassImplementsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EClassModelGenAnnotation_classImplements_feature"), //$NON-NLS-1$
        getString("_UI_EClassModelGenAnnotation_classImplements_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.ECLASS_MODEL_GEN_ANNOTATION__CLASS_IMPLEMENTS, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Serializable feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addSerializablePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EClassModelGenAnnotation_serializable_feature"), //$NON-NLS-1$
        getString("_UI_EClassModelGenAnnotation_serializable_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.ECLASS_MODEL_GEN_ANNOTATION__SERIALIZABLE, true, false, false,
        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Abstract feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addAbstractPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EClassModelGenAnnotation_abstract_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EClassModelGenAnnotation_abstract_feature", "_UI_EClassModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ECLASS_MODEL_GEN_ANNOTATION__ABSTRACT,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Super EClass feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addSuperEClassPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EClassModelGenAnnotation_superEClass_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EClassModelGenAnnotation_superEClass_feature", "_UI_EClassModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ECLASS_MODEL_GEN_ANNOTATION__SUPER_ECLASS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Feature Map Features feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addFeatureMapFeaturesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EClassModelGenAnnotation_featureMapFeatures_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EClassModelGenAnnotation_featureMapFeatures_feature", "_UI_EClassModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ECLASS_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURES,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the EStructural Feature Model Gen Annotations feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addEStructuralFeatureModelGenAnnotationsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EClassModelGenAnnotation_eStructuralFeatureModelGenAnnotations_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EClassModelGenAnnotation_eStructuralFeatureModelGenAnnotations_feature", "_UI_EClassModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ECLASS_MODEL_GEN_ANNOTATION__ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATIONS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Dao Qualified Class Name feature. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  protected void addDaoQualifiedClassNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EClassModelGenAnnotation_daoQualifiedClassName_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EClassModelGenAnnotation_daoQualifiedClassName_feature", "_UI_EClassModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ECLASS_MODEL_GEN_ANNOTATION__DAO_QUALIFIED_CLASS_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Dao Finders feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDaoFindersPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EClassModelGenAnnotation_daoFinders_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EClassModelGenAnnotation_daoFinders_feature", "_UI_EClassModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ECLASS_MODEL_GEN_ANNOTATION__DAO_FINDERS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This returns EClassModelGenAnnotation.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/EClassModelGenAnnotation")); //$NON-NLS-1$
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((EClassModelGenAnnotation)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_EClassModelGenAnnotation_type") : //$NON-NLS-1$
      getString("_UI_EClassModelGenAnnotation_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

    switch (notification.getFeatureID(EClassModelGenAnnotation.class)) {
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DOCUMENTATION:
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__NAME:
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME:
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME:
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__GENERATE_CODE:
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__HAS_MANY_FEATURES:
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__CLASS_EXTENDS:
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__HAS_SUPER_ECLASS:
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__CLASS_IMPLEMENTS:
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__SERIALIZABLE:
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__ABSTRACT:
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION__DAO_QUALIFIED_CLASS_NAME:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator() {
    return TexoannotationsmodelgeneratorEditPlugin.INSTANCE;
  }

}
