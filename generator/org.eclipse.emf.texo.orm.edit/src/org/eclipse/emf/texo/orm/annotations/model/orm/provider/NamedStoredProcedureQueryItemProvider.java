/**
 * <copyright>
 * </copyright>
 *
 * $Id: NamedStoredProcedureQueryItemProvider.java,v 1.4 2011/08/25 15:03:10 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.provider;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class NamedStoredProcedureQueryItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NamedStoredProcedureQueryItemProvider(AdapterFactory adapterFactory) {
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

			addCallByIndexPropertyDescriptor(object);
			addMultipleResultSetsPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addProcedureNamePropertyDescriptor(object);
			addResultClassPropertyDescriptor(object);
			addResultSetMappingPropertyDescriptor(object);
			addReturnsResultSetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Call By Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCallByIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedStoredProcedureQuery_callByIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedStoredProcedureQuery_callByIndex_feature", "_UI_NamedStoredProcedureQuery_type"),
				 OrmPackage.eINSTANCE.getNamedStoredProcedureQuery_CallByIndex(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Multiple Result Sets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultipleResultSetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedStoredProcedureQuery_multipleResultSets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedStoredProcedureQuery_multipleResultSets_feature", "_UI_NamedStoredProcedureQuery_type"),
				 OrmPackage.eINSTANCE.getNamedStoredProcedureQuery_MultipleResultSets(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_NamedStoredProcedureQuery_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedStoredProcedureQuery_name_feature", "_UI_NamedStoredProcedureQuery_type"),
				 OrmPackage.eINSTANCE.getNamedStoredProcedureQuery_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Procedure Name feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addProcedureNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedStoredProcedureQuery_procedureName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedStoredProcedureQuery_procedureName_feature", "_UI_NamedStoredProcedureQuery_type"),
				 OrmPackage.eINSTANCE.getNamedStoredProcedureQuery_ProcedureName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Result Class feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addResultClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedStoredProcedureQuery_resultClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedStoredProcedureQuery_resultClass_feature", "_UI_NamedStoredProcedureQuery_type"),
				 OrmPackage.eINSTANCE.getNamedStoredProcedureQuery_ResultClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Result Set Mapping feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addResultSetMappingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedStoredProcedureQuery_resultSetMapping_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedStoredProcedureQuery_resultSetMapping_feature", "_UI_NamedStoredProcedureQuery_type"),
				 OrmPackage.eINSTANCE.getNamedStoredProcedureQuery_ResultSetMapping(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Returns Result Set feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addReturnsResultSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedStoredProcedureQuery_returnsResultSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedStoredProcedureQuery_returnsResultSet_feature", "_UI_NamedStoredProcedureQuery_type"),
				 OrmPackage.eINSTANCE.getNamedStoredProcedureQuery_ReturnsResultSet(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(OrmPackage.eINSTANCE.getNamedStoredProcedureQuery_Hint());
			childrenFeatures.add(OrmPackage.eINSTANCE.getNamedStoredProcedureQuery_Parameter());
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
	 * This returns NamedStoredProcedureQuery.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NamedStoredProcedureQuery"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((NamedStoredProcedureQuery)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NamedStoredProcedureQuery_type") :
			getString("_UI_NamedStoredProcedureQuery_type") + " " + label;
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

		switch (notification.getFeatureID(NamedStoredProcedureQuery.class)) {
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__CALL_BY_INDEX:
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__MULTIPLE_RESULT_SETS:
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__NAME:
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__PROCEDURE_NAME:
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RESULT_CLASS:
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING:
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RETURNS_RESULT_SET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__HINT:
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__PARAMETER:
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
				(OrmPackage.eINSTANCE.getNamedStoredProcedureQuery_Hint(),
				 OrmFactory.eINSTANCE.createQueryHint()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.eINSTANCE.getNamedStoredProcedureQuery_Parameter(),
				 OrmFactory.eINSTANCE.createStoredProcedureParameter()));
	}

  /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator() {
		return Eclipselink_ormEditPlugin.INSTANCE;
	}

}
