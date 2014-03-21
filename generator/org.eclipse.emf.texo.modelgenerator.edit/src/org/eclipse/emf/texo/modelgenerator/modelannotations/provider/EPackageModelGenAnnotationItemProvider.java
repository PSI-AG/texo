/**
 * <copyright>
 * </copyright>
 *
 * $Id: EPackageModelGenAnnotationItemProvider.java,v 1.11 2011/09/23 12:00:48 mtaal Exp $
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
import org.eclipse.emf.texo.annotations.annotationsmodel.provider.EPackageAnnotationItemProvider;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class EPackageModelGenAnnotationItemProvider extends EPackageAnnotationItemProvider implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EPackageModelGenAnnotationItemProvider(AdapterFactory adapterFactory) {
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

      // disable some fields which should not be edited in the UI
      addDocumentationPropertyDescriptor(object);
      // addNamePropertyDescriptor(object);
      addAddRuntimeModelBehaviorPropertyDescriptor(object);
      // addGenerateInterfacesPropertyDescriptor(object);
      addGenerateSafeManyAccessPropertyDescriptor(object);
      addGenerateBidirectionalAssociationSupportPropertyDescriptor(object);
      addModelClassesPackagePathPropertyDescriptor(object);
      addDaoClassesPackagePathPropertyDescriptor(object);
      addDaoPatternNamePropertyDescriptor(object);
      addDaoRootClassPropertyDescriptor(object);
      addPackagePathPropertyDescriptor(object);
      // addQualifiedClassNamePropertyDescriptor(object);
      addSimpleClassNamePropertyDescriptor(object);
      addSimpleModelFactoryClassNamePropertyDescriptor(object);
      // addDependsOnPropertyDescriptor(object);
      // addEcoreFileContentPropertyDescriptor(object);
      // addEcoreFileNamePropertyDescriptor(object);
      addJavaFileHeaderPropertyDescriptor(object);
      // addEClassModelGenAnnotationsPropertyDescriptor(object);
      // addEDataTypeModelGenAnnotationsPropertyDescriptor(object);
      // addEEnumModelGenAnnotationsPropertyDescriptor(object);
      // addEClassifierModelGenAnnotationsPropertyDescriptor(object);
      // addModelPackageClassNamePostFixPropertyDescriptor(object);
      // addModelFactoryClassNamePostFixPropertyDescriptor(object);
      addFeatureGroupClassNamePostFixPropertyDescriptor(object);
      addRootClassExtendsPropertyDescriptor(object);
      addRootInterfaceExtendsPropertyDescriptor(object);
      addFeatureMapClassExtendsPropertyDescriptor(object);
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
   * This adds a property descriptor for the Add Runtime Model Behavior feature. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addAddRuntimeModelBehaviorPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EPackageModelGenAnnotation_addRuntimeModelBehavior_feature"), //$NON-NLS-1$
        getString("_UI_EPackageModelGenAnnotation_addRuntimeModelBehavior_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__ADD_RUNTIME_MODEL_BEHAVIOR, true, false,
        false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Generate Interfaces feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addGenerateInterfacesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageModelGenAnnotation_generateInterfaces_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageModelGenAnnotation_generateInterfaces_feature", "_UI_EPackageModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_INTERFACES,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Package Path feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addPackagePathPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EPackageModelGenAnnotation_packagePath_feature"), //$NON-NLS-1$
        getString("_UI_EPackageModelGenAnnotation_packagePath_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__PACKAGE_PATH, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Model Classes Package Path feature. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addModelClassesPackagePathPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EPackageModelGenAnnotation_modelClassesPackagePath_feature"), //$NON-NLS-1$
        getString("_UI_EPackageModelGenAnnotation_modelClassesPackagePath_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_CLASSES_PACKAGE_PATH, true, false,
        false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
         getString("_UI_EPackageModelGenAnnotation_qualifiedClassName_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageModelGenAnnotation_qualifiedClassName_feature", "_UI_EPackageModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Simple Class Name feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addSimpleClassNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EPackageModelGenAnnotation_simpleClassName_feature"), //$NON-NLS-1$
        getString("_UI_EPackageModelGenAnnotation_simpleClassName_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Simple Model Factory Class Name feature. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addSimpleModelFactoryClassNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EPackageModelGenAnnotation_simpleModelFactoryClassName_feature"), //$NON-NLS-1$
        getString("_UI_EPackageModelGenAnnotation_simpleModelFactoryClassName_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_MODEL_FACTORY_CLASS_NAME, true, false,
        false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Depends On feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addDependsOnPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageModelGenAnnotation_dependsOn_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageModelGenAnnotation_dependsOn_feature", "_UI_EPackageModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__DEPENDS_ON,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Ecore File Content feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addEcoreFileContentPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageModelGenAnnotation_ecoreFileContent_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageModelGenAnnotation_ecoreFileContent_feature", "_UI_EPackageModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_CONTENT,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Ecore File Name feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addEcoreFileNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageModelGenAnnotation_ecoreFileName_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageModelGenAnnotation_ecoreFileName_feature", "_UI_EPackageModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Java File Header feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addJavaFileHeaderPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EPackageModelGenAnnotation_javaFileHeader_feature"), //$NON-NLS-1$
        getString("_UI_EPackageModelGenAnnotation_javaFileHeader_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__JAVA_FILE_HEADER, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the EClass Model Gen Annotations feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addEClassModelGenAnnotationsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageModelGenAnnotation_eClassModelGenAnnotations_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageModelGenAnnotation_eClassModelGenAnnotations_feature", "_UI_EPackageModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__ECLASS_MODEL_GEN_ANNOTATIONS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the EData Type Model Gen Annotations feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addEDataTypeModelGenAnnotationsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageModelGenAnnotation_eDataTypeModelGenAnnotations_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageModelGenAnnotation_eDataTypeModelGenAnnotations_feature", "_UI_EPackageModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__EDATA_TYPE_MODEL_GEN_ANNOTATIONS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the EEnum Model Gen Annotations feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addEEnumModelGenAnnotationsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageModelGenAnnotation_eEnumModelGenAnnotations_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageModelGenAnnotation_eEnumModelGenAnnotations_feature", "_UI_EPackageModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__EENUM_MODEL_GEN_ANNOTATIONS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the EClassifier Model Gen Annotations feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addEClassifierModelGenAnnotationsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageModelGenAnnotation_eClassifierModelGenAnnotations_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageModelGenAnnotation_eClassifierModelGenAnnotations_feature", "_UI_EPackageModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__ECLASSIFIER_MODEL_GEN_ANNOTATIONS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Model Package Class Name Post Fix feature. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addModelPackageClassNamePostFixPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EPackageModelGenAnnotation_modelPackageClassNamePostFix_feature"), //$NON-NLS-1$
        getString("_UI_EPackageModelGenAnnotation_modelPackageClassNamePostFix_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_PACKAGE_CLASS_NAME_POST_FIX, true,
        false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Model Factory Class Name Post Fix feature. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addModelFactoryClassNamePostFixPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EPackageModelGenAnnotation_modelFactoryClassNamePostFix_feature"), //$NON-NLS-1$
        getString("_UI_EPackageModelGenAnnotation_modelFactoryClassNamePostFix_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_FACTORY_CLASS_NAME_POST_FIX, true,
        false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Feature Group Class Name Post Fix feature. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addFeatureGroupClassNamePostFixPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EPackageModelGenAnnotation_featureGroupClassNamePostFix_feature"), //$NON-NLS-1$
        getString("_UI_EPackageModelGenAnnotation_featureGroupClassNamePostFix_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_GROUP_CLASS_NAME_POST_FIX, true,
        false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
        getString("_UI_EPackageModelGenAnnotation_generateSafeManyAccess_feature"), //$NON-NLS-1$
        getString("_UI_EPackageModelGenAnnotation_generateSafeManyAccess_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS, true, false,
        false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Root Class Extends feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addRootClassExtendsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EPackageModelGenAnnotation_rootClassExtends_feature"), //$NON-NLS-1$
        getString("_UI_EPackageModelGenAnnotation_rootClassExtends_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_CLASS_EXTENDS, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Root Interface Extends feature. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generatedNOT
   */
  protected void addRootInterfaceExtendsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EPackageModelGenAnnotation_rootInterfaceExtends_feature"), //$NON-NLS-1$
        getString("_UI_EPackageModelGenAnnotation_rootInterfaceExtends_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_INTERFACE_EXTENDS, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Feature Map Class Extends feature. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addFeatureMapClassExtendsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EPackageModelGenAnnotation_featureMapClassExtends_feature"), //$NON-NLS-1$
        getString("_UI_EPackageModelGenAnnotation_featureMapClassExtends_feature"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_MAP_CLASS_EXTENDS, true, false,
        false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
        getString("_UI_EPackageModelGenAnnotation_generateBidirectionalAssociationSupport_feature"), //$NON-NLS-1$
        getString("_UI_EPackageModelGenAnnotation_generateBidirectionalAssociationSupport_description"), //$NON-NLS-1$
        ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT,
        true, false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Handle Ecore File feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addHandleEcoreFilePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageModelGenAnnotation_handleEcoreFile_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageModelGenAnnotation_handleEcoreFile_feature", "_UI_EPackageModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__HANDLE_ECORE_FILE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Dao Classes Package Path feature. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  protected void addDaoClassesPackagePathPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageModelGenAnnotation_daoClassesPackagePath_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageModelGenAnnotation_daoClassesPackagePath_feature", "_UI_EPackageModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_CLASSES_PACKAGE_PATH,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Dao Pattern Name feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addDaoPatternNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageModelGenAnnotation_daoPatternName_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageModelGenAnnotation_daoPatternName_feature", "_UI_EPackageModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_PATTERN_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Dao Root Class feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addDaoRootClassPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageModelGenAnnotation_daoRootClass_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageModelGenAnnotation_daoRootClass_feature", "_UI_EPackageModelGenAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         ModelcodegeneratorPackage.Literals.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_ROOT_CLASS,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This returns EPackageModelGenAnnotation.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/EPackageModelGenAnnotation")); //$NON-NLS-1$
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((EPackageModelGenAnnotation)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_EPackageModelGenAnnotation_type") : //$NON-NLS-1$
      getString("_UI_EPackageModelGenAnnotation_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

    switch (notification.getFeatureID(EPackageModelGenAnnotation.class)) {
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DOCUMENTATION:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__NAME:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ADD_RUNTIME_MODEL_BEHAVIOR:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_INTERFACES:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__PACKAGE_PATH:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_CLASSES_PACKAGE_PATH:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__QUALIFIED_CLASS_NAME:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_CLASS_NAME:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__SIMPLE_MODEL_FACTORY_CLASS_NAME:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_CONTENT:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ECORE_FILE_NAME:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__JAVA_FILE_HEADER:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_PACKAGE_CLASS_NAME_POST_FIX:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__MODEL_FACTORY_CLASS_NAME_POST_FIX:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_GROUP_CLASS_NAME_POST_FIX:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_SAFE_MANY_ACCESS:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_CLASS_EXTENDS:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__ROOT_INTERFACE_EXTENDS:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__FEATURE_MAP_CLASS_EXTENDS:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__GENERATE_BIDIRECTIONAL_ASSOCIATION_SUPPORT:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__HANDLE_ECORE_FILE:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_CLASSES_PACKAGE_PATH:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_PATTERN_NAME:
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION__DAO_ROOT_CLASS:
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
