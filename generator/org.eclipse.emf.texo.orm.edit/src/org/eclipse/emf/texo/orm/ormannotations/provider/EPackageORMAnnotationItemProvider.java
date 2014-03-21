/**
 * <copyright>
 * </copyright>
 *
 * $Id: EPackageORMAnnotationItemProvider.java,v 1.10 2011/10/26 05:27:14 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class EPackageORMAnnotationItemProvider extends EPackageAnnotationItemProvider implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EPackageORMAnnotationItemProvider(AdapterFactory adapterFactory) {
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

      addGenerateFullDbSchemaNamesPropertyDescriptor(object);
      addNameDictionaryPropertyFilePropertyDescriptor(object);
      addTableNamePrefixPropertyDescriptor(object);
      addColumnNamePrefixPropertyDescriptor(object);
      addMaximumSqlNameLengthPropertyDescriptor(object);
      addLowerCasedNamesPropertyDescriptor(object);
      addUpperCasedNamesPropertyDescriptor(object);
      addEnforceUniqueNamesPropertyDescriptor(object);
      addUseJoinTablesForContainmentPropertyDescriptor(object);
      addUseJoinTablesForNonContainmentPropertyDescriptor(object);
      addGenerateJavaAnnotationsPropertyDescriptor(object);
      addAddOrderColumnToListMappingsPropertyDescriptor(object);
      addRenameSQLReservedNamesPropertyDescriptor(object);
      addUniqueEntityNamesPropertyDescriptor(object);
      addSetDelimitedIdentifierTagInORMPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Generate Full Db Schema Names feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addGenerateFullDbSchemaNamesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageORMAnnotation_generateFullDbSchemaNames_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageORMAnnotation_generateFullDbSchemaNames_feature", "_UI_EPackageORMAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__GENERATE_FULL_DB_SCHEMA_NAMES,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Name Dictionary Property File feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addNameDictionaryPropertyFilePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageORMAnnotation_nameDictionaryPropertyFile_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageORMAnnotation_nameDictionaryPropertyFile_feature", "_UI_EPackageORMAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__NAME_DICTIONARY_PROPERTY_FILE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Table Name Prefix feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addTableNamePrefixPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageORMAnnotation_tableNamePrefix_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageORMAnnotation_tableNamePrefix_feature", "_UI_EPackageORMAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__TABLE_NAME_PREFIX,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Column Name Prefix feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addColumnNamePrefixPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageORMAnnotation_columnNamePrefix_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageORMAnnotation_columnNamePrefix_feature", "_UI_EPackageORMAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__COLUMN_NAME_PREFIX,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Maximum Sql Name Length feature. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  protected void addMaximumSqlNameLengthPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageORMAnnotation_maximumSqlNameLength_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageORMAnnotation_maximumSqlNameLength_feature", "_UI_EPackageORMAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__MAXIMUM_SQL_NAME_LENGTH,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Lower Cased Names feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addLowerCasedNamesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageORMAnnotation_lowerCasedNames_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageORMAnnotation_lowerCasedNames_feature", "_UI_EPackageORMAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__LOWER_CASED_NAMES,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Upper Cased Names feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addUpperCasedNamesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageORMAnnotation_upperCasedNames_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageORMAnnotation_upperCasedNames_feature", "_UI_EPackageORMAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__UPPER_CASED_NAMES,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Enforce Unique Names feature.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void addEnforceUniqueNamesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageORMAnnotation_enforceUniqueNames_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageORMAnnotation_enforceUniqueNames_feature", "_UI_EPackageORMAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__ENFORCE_UNIQUE_NAMES,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Use Join Tables For Containment feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addUseJoinTablesForContainmentPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageORMAnnotation_useJoinTablesForContainment_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageORMAnnotation_useJoinTablesForContainment_feature", "_UI_EPackageORMAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_CONTAINMENT,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Use Join Tables For Non Containment feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addUseJoinTablesForNonContainmentPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageORMAnnotation_useJoinTablesForNonContainment_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageORMAnnotation_useJoinTablesForNonContainment_feature", "_UI_EPackageORMAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_NON_CONTAINMENT,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Generate Java Annotations feature. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addGenerateJavaAnnotationsPropertyDescriptor(Object object) {
    // don't generate this anymore

    // itemPropertyDescriptors.add
    // (createItemPropertyDescriptor
    // (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
    // getResourceLocator(),
    // getString("_UI_EPackageORMAnnotation_generateJavaAnnotations_feature"),
    // getString("_UI_PropertyDescriptor_description", "_UI_EPackageORMAnnotation_generateJavaAnnotations_feature",
    // "_UI_EPackageORMAnnotation_type"),
    // OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__GENERATE_JAVA_ANNOTATIONS,
    // true,
    // false,
    // false,
    // ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
    // null,
    // null));
  }

  /**
   * This adds a property descriptor for the Add Order Column To List Mappings feature. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addAddOrderColumnToListMappingsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EPackageORMAnnotation_addOrderColumnToListMappings_feature"),
        getString("_UI_EPackageORMAnnotation_addOrderColumnToListMappings_description",
            "_UI_EPackageORMAnnotation_addOrderColumnToListMappings_feature", "_UI_EPackageORMAnnotation_type"),
        OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__ADD_ORDER_COLUMN_TO_LIST_MAPPINGS, true, false, false,
        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Rename SQL Reserved Names feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addRenameSQLReservedNamesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_EPackageORMAnnotation_renameSQLReservedNames_feature"), //$NON-NLS-1$
         getString("_UI_PropertyDescriptor_description", "_UI_EPackageORMAnnotation_renameSQLReservedNames_feature", "_UI_EPackageORMAnnotation_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
         OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__RENAME_SQL_RESERVED_NAMES,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Unique Entity Names feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addUniqueEntityNamesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EPackageORMAnnotation_uniqueEntityNames_feature"),
        getString("_UI_EPackageORMAnnotation_uniqueEntityNames_description",
            "_UI_EPackageORMAnnotation_uniqueEntityNames_feature", "_UI_EPackageORMAnnotation_type"),
        OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__UNIQUE_ENTITY_NAMES, true, false, false,
        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Set Delimited Identifier Tag In ORM feature. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generatedNOT
   */
  protected void addSetDelimitedIdentifierTagInORMPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_EPackageORMAnnotation_setDelimitedIdentifierTagInORM_feature"),
        getString("_UI_EPackageORMAnnotation_setDelimitedIdentifierTagInORM_description",
            "_UI_EPackageORMAnnotation_setDelimitedIdentifierTagInORM_feature", "_UI_EPackageORMAnnotation_type"),
        OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__SET_DELIMITED_IDENTIFIER_TAG_IN_ORM, true, false,
        false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
      childrenFeatures.add(OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT);
      childrenFeatures.add(OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT);
      childrenFeatures.add(OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__ENTITY_MAPPINGS);
      childrenFeatures.add(OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__INHERITANCE);
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
   * This returns EPackageORMAnnotation.gif.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/EPackageORMAnnotation")); //$NON-NLS-1$
  }

  /**
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  @Override
  public String getText(Object object) {
    String label = ((EPackageORMAnnotation) object).getDescription();
    return label == null || label.length() == 0 ? getString("_UI_EPackageORMAnnotation_type")
        : getString("_UI_EPackageORMAnnotation_type") + " " + label;
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

    switch (notification.getFeatureID(EPackageORMAnnotation.class)) {
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__GENERATE_FULL_DB_SCHEMA_NAMES:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__NAME_DICTIONARY_PROPERTY_FILE:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__TABLE_NAME_PREFIX:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__COLUMN_NAME_PREFIX:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__MAXIMUM_SQL_NAME_LENGTH:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__LOWER_CASED_NAMES:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__UPPER_CASED_NAMES:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENFORCE_UNIQUE_NAMES:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_CONTAINMENT:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_NON_CONTAINMENT:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__GENERATE_JAVA_ANNOTATIONS:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ADD_ORDER_COLUMN_TO_LIST_MAPPINGS:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__RENAME_SQL_RESERVED_NAMES:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__UNIQUE_ENTITY_NAMES:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__SET_DELIMITED_IDENTIFIER_TAG_IN_ORM:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENTITY_MAPPINGS:
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__INHERITANCE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT,
         OrmFactory.eINSTANCE.createCascadeType()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT,
         OrmFactory.eINSTANCE.createCascadeType()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__ENTITY_MAPPINGS,
         OrmFactory.eINSTANCE.createEntityMappingsType()));

    newChildDescriptors.add
      (createChildParameter
        (OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__INHERITANCE,
         OrmFactory.eINSTANCE.createInheritance()));
  }

  /**
   * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
    Object childFeature = feature;
    Object childObject = child;

    boolean qualify =
      childFeature == OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT ||
      childFeature == OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT;

    if (qualify) {
      return getString
        ("_UI_CreateChild_text2", //$NON-NLS-1$
         new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
    }
    return super.getCreateChildText(owner, feature, child, selection);
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator() {
    return TexoannotationsormEditPlugin.INSTANCE;
  }

}
