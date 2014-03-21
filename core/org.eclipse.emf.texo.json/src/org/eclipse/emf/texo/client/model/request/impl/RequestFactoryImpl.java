/**
 */
package org.eclipse.emf.texo.client.model.request.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.texo.client.model.request.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequestFactoryImpl extends EFactoryImpl implements RequestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequestFactory init() {
		try {
			RequestFactory theRequestFactory = (RequestFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/texo/server/model/request"); 
			if (theRequestFactory != null) {
				return theRequestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RequestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RequestPackage.ACTION_TYPE: return createActionType();
			case RequestPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case RequestPackage.PARAMETER: return createParameter();
			case RequestPackage.QUERY_REFERING_OBJECTS_TYPE: return createQueryReferingObjectsType();
			case RequestPackage.QUERY_TYPE: return createQueryType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionType() {
		ActionTypeImpl actionType = new ActionTypeImpl();
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryReferingObjectsType createQueryReferingObjectsType() {
		QueryReferingObjectsTypeImpl queryReferingObjectsType = new QueryReferingObjectsTypeImpl();
		return queryReferingObjectsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryType createQueryType() {
		QueryTypeImpl queryType = new QueryTypeImpl();
		return queryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPackage getRequestPackage() {
		return (RequestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RequestPackage getPackage() {
		return RequestPackage.eINSTANCE;
	}

} //RequestFactoryImpl
