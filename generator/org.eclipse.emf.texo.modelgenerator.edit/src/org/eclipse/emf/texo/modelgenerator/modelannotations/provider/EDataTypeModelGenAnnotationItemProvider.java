/**
 * <copyright>
 * </copyright>
 *
 * $Id: EDataTypeModelGenAnnotationItemProvider.java,v 1.7 2011/09/21 14:33:13 mtaal Exp $
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
import org.eclipse.emf.texo.annotations.annotationsmodel.provider.EDataTypeAnnotationItemProvider;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EDataTypeModelGenAnnotation} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class EDataTypeModelGenAnnotationItemProvider extends EDataTypeAnnotationItemProvider implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataTypeModelGenAnnotationItemProvider(AdapterFactory adapterFactory) {
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

      // addDocumentationPropertyDescriptor(object);
      // addNamePropertyDescriptor(object);
      // addQualifiedClassNamePropertyDescriptor(object);
      // addSimpleClassNamePropertyDescriptor(object);
      // addGenerateCodePropertyDescriptor(object);
      // addOwnerEPackageAnnotationPropertyDescriptor(object);
      addInstanceClassNamePropertyDescriptor(object);
      // addObjectClassNamePropertyDescriptor(object);
      // addEnumPropertyDescriptor(object);
      // addDateTypePropertyDescriptor(object);
      addAutomaticStringConversionPropertyDescriptor(object);
      // addBaseTypeAnnotationPropertyDescriptor(object);
      // addItemTypePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Documentation feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addDocumentationPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_ENamedElementModelGenAnnotation_documentation_feature"), //$NON-NLS-1$
        getString("_UI_ENamedElementModelGenAnnotation_documentation_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.ENAMED_ELEMENT_MODEL_GEN_ANNOTATION__DOCUMENTATION, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
   * This adds a property descriptor for the Qualified Class Name feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addQualifiedClassNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EClassifierModelGenAnnotation_qualifiedClassName_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EClassifierModelGenAnnotation_qualifiedClassName_feature", "_UI_EClassifierModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ECLASSIFIER_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
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
   * This adds a property descriptor for the Instance Class Name feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addInstanceClassNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EDataTypeModelGenAnnotationDefinition_instanceClassName_feature"), //$NON-NLS-1$
        getString("_UI_EDataTypeModelGenAnnotationDefinition_instanceClassName_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__INSTANCE_CLASS_NAME, true,
        false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Object Class Name feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addObjectClassNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EDataTypeModelGenAnnotationDefinition_objectClassName_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EDataTypeModelGenAnnotationDefinition_objectClassName_feature", "_UI_EDataTypeModelGenAnnotationDefinition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__OBJECT_CLASS_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Enum feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addEnumPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EDataTypeModelGenAnnotationDefinition_enum_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EDataTypeModelGenAnnotationDefinition_enum_feature", "_UI_EDataTypeModelGenAnnotationDefinition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ENUM,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Date Type feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addDateTypePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EDataTypeModelGenAnnotationDefinition_dateType_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EDataTypeModelGenAnnotationDefinition_dateType_feature", "_UI_EDataTypeModelGenAnnotationDefinition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__DATE_TYPE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Automatic String Conversion feature. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addAutomaticStringConversionPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EDataTypeModelGenAnnotationDefinition_automaticStringConversion_feature"), //$NON-NLS-1$
        getString("_UI_EDataTypeModelGenAnnotationDefinition_automaticStringConversion_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__AUTOMATIC_STRING_CONVERSION,
        true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Base Type Annotation feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addBaseTypeAnnotationPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EDataTypeModelGenAnnotationDefinition_baseTypeAnnotation_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EDataTypeModelGenAnnotationDefinition_baseTypeAnnotation_feature", "_UI_EDataTypeModelGenAnnotationDefinition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__BASE_TYPE_ANNOTATION,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Item Type feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addItemTypePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EDataTypeModelGenAnnotationDefinition_itemType_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EDataTypeModelGenAnnotationDefinition_itemType_feature", "_UI_EDataTypeModelGenAnnotationDefinition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EDATA_TYPE_MODEL_GEN_ANNOTATION_DEFINITION__ITEM_TYPE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This returns EDataTypeModelGenAnnotation.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/EDataTypeModelGenAnnotation")); //$NON-NLS-1$
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((EDataTypeModelGenAnnotation)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_EDataTypeModelGenAnnotation_type") : //$NON-NLS-1$
      getString("_UI_EDataTypeModelGenAnnotation_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

    switch (notification.getFeatureID(EDataTypeModelGenAnnotation.class)) {
      case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION__DOCUMENTATION:
      case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION__NAME:
      case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME:
      case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME:
      case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION__GENERATE_CODE:
      case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION__INSTANCE_CLASS_NAME:
      case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION__OBJECT_CLASS_NAME:
      case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION__ENUM:
      case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION__DATE_TYPE:
      case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION__AUTOMATIC_STRING_CONVERSION:
      case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION__ITEM_TYPE:
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
