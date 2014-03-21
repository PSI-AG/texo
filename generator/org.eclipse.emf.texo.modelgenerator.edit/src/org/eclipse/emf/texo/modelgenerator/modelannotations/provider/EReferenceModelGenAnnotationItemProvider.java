/**
 * <copyright>
 * </copyright>
 *
 * $Id: EReferenceModelGenAnnotationItemProvider.java,v 1.7 2011/09/21 14:33:13 mtaal Exp $
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
import org.eclipse.emf.texo.annotations.annotationsmodel.provider.EReferenceAnnotationItemProvider;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class EReferenceModelGenAnnotationItemProvider extends EReferenceAnnotationItemProvider implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReferenceModelGenAnnotationItemProvider(AdapterFactory adapterFactory) {
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
      addGetterPropertyDescriptor(object);
      // addTypePropertyDescriptor(object);
      // addObjectTypePropertyDescriptor(object);
      // addItemTypePropertyDescriptor(object);
      // addDefaultValuePropertyDescriptor(object);
      addSetterPropertyDescriptor(object);
      addValidJavaMemberNamePropertyDescriptor(object);
      addGenerateCodePropertyDescriptor(object);
      // addFeatureMapQualifiedClassNamePropertyDescriptor(object);
      // addFeatureMapSimpleClassNamePropertyDescriptor(object);
      // addFeatureMapFeaturePropertyDescriptor(object);
      // addMemberFeatureMapFeaturesPropertyDescriptor(object);
      // addManyPropertyDescriptor(object);
      addUseListPropertyDescriptor(object);
      addGenerateSafeManyAccessPropertyDescriptor(object);
      addGenerateBidirectionalAssociationSupportPropertyDescriptor(object);
      // addReferencePropertyDescriptor(object);
      // addOwnerEClassAnnotationPropertyDescriptor(object);
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
   * This adds a property descriptor for the Getter feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addGetterPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EStructuralFeatureModelGenAnnotation_getter_feature"), //$NON-NLS-1$
        getString("_UI_EStructuralFeatureModelGenAnnotation_getter_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GETTER, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Type feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addTypePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeatureModelGenAnnotation_type_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeatureModelGenAnnotation_type_feature", "_UI_EStructuralFeatureModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__TYPE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Object Type feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addObjectTypePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeatureModelGenAnnotation_objectType_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeatureModelGenAnnotation_objectType_feature", "_UI_EStructuralFeatureModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OBJECT_TYPE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
         getString("_UI_EStructuralFeatureModelGenAnnotation_itemType_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeatureModelGenAnnotation_itemType_feature", "_UI_EStructuralFeatureModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__ITEM_TYPE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Default Value feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addDefaultValuePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeatureModelGenAnnotation_defaultValue_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeatureModelGenAnnotation_defaultValue_feature", "_UI_EStructuralFeatureModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Setter feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addSetterPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EStructuralFeatureModelGenAnnotation_setter_feature"), //$NON-NLS-1$
        getString("_UI_EStructuralFeatureModelGenAnnotation_setter_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__SETTER, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Valid Java Member Name feature. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generatedNOT
   */
  protected void addValidJavaMemberNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EStructuralFeatureModelGenAnnotation_validJavaMemberName_feature"), //$NON-NLS-1$
        getString("_UI_EStructuralFeatureModelGenAnnotation_validJavaMemberName_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME, true,
        false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
        getString("_UI_EStructuralFeatureModelGenAnnotation_generateCode_feature"), //$NON-NLS-1$
        getString("_UI_EStructuralFeatureModelGenAnnotation_generateCode_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__GENERATE_CODE, true, false, false,
        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Feature Map Qualified Class Name feature. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addFeatureMapQualifiedClassNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EStructuralFeatureModelGenAnnotation_featureMapQualifiedClassName_feature"), //$NON-NLS-1$
        getString("_UI_EStructuralFeatureModelGenAnnotation_featureMapQualifiedClassName_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME,
        true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Feature Map Simple Class Name feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addFeatureMapSimpleClassNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeatureModelGenAnnotation_featureMapSimpleClassName_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeatureModelGenAnnotation_featureMapSimpleClassName_feature", "_UI_EStructuralFeatureModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Feature Map Feature feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addFeatureMapFeaturePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeatureModelGenAnnotation_featureMapFeature_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeatureModelGenAnnotation_featureMapFeature_feature", "_UI_EStructuralFeatureModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__FEATURE_MAP_FEATURE,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Member Feature Map Features feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addMemberFeatureMapFeaturesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeatureModelGenAnnotation_memberFeatureMapFeatures_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeatureModelGenAnnotation_memberFeatureMapFeatures_feature", "_UI_EStructuralFeatureModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MEMBER_FEATURE_MAP_FEATURES,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Many feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addManyPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeatureModelGenAnnotation_many_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeatureModelGenAnnotation_many_feature", "_UI_EStructuralFeatureModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__MANY,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Use List feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addUseListPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EStructuralFeatureModelGenAnnotation_useList_feature"), //$NON-NLS-1$
        getString("_UI_EStructuralFeatureModelGenAnnotation_useList_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__USE_LIST, true, false, false,
        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Reference feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addReferencePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeatureModelGenAnnotation_reference_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeatureModelGenAnnotation_reference_feature", "_UI_EStructuralFeatureModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__REFERENCE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Owner EClass Annotation feature. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  protected void addOwnerEClassAnnotationPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EStructuralFeatureModelGenAnnotation_ownerEClassAnnotation_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EStructuralFeatureModelGenAnnotation_ownerEClassAnnotation_feature", "_UI_EStructuralFeatureModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.ESTRUCTURAL_FEATURE_MODEL_GEN_ANNOTATION__OWNER_ECLASS_ANNOTATION,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Opposite Model Gen Annotation feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addOppositeModelGenAnnotationPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EReferenceModelGenAnnotation_oppositeModelGenAnnotation_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EReferenceModelGenAnnotation_oppositeModelGenAnnotation_feature", "_UI_EReferenceModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EREFERENCE_MODEL_GEN_ANNOTATION__OPPOSITE_MODEL_GEN_ANNOTATION,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Generate Safe Many Access feature. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addGenerateSafeManyAccessPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EReferenceModelGenAnnotation_generateSafeManyAccess_feature"), //$NON-NLS-1$
        getString("_UI_EReferenceModelGenAnnotation_generateSafeManyAccess_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS, true, false,
        false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Generate Bidirectional Association Support feature. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addGenerateBidirectionalAssociationSupportPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EReferenceModelGenAnnotation_generateBidirectionalAssociationSupport_feature"), //$NON-NLS-1$
        getString("_UI_EReferenceModelGenAnnotation_generateBidirectionalAssociationSupport_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT,
        true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This returns EReferenceModelGenAnnotation.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/EReferenceModelGenAnnotation")); //$NON-NLS-1$
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((EReferenceModelGenAnnotation)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_EReferenceModelGenAnnotation_type") : //$NON-NLS-1$
      getString("_UI_EReferenceModelGenAnnotation_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

    switch (notification.getFeatureID(EReferenceModelGenAnnotation.class)) {
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DOCUMENTATION:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__NAME:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GETTER:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__TYPE:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__OBJECT_TYPE:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__ITEM_TYPE:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__DEFAULT_VALUE:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__SETTER:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__VALID_JAVA_MEMBER_NAME:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_CODE:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_QUALIFIED_CLASS_NAME:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__FEATURE_MAP_SIMPLE_CLASS_NAME:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__MANY:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__USE_LIST:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__REFERENCE:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS:
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT:
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
