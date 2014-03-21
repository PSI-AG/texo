package org.eclipse.emf.texo.test.model.samples.claim;

import java.math.BigDecimal;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: org.eclipse.emf.texo.test.model.samples.claim. It
 * contains code to create instances {@link ModelObject} wrappers and instances for EClasses and convert objects back
 * and forth from their String (XML) representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ClaimModelFactory implements ModelFactory {

  /**
   * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          creates a Object instance for this EClass
   * @return an object representing the eClass
   * @generated
   */
  public Object create(EClass eClass) {
    switch (eClass.getClassifierID()) {
    case ClaimModelPackage.CLAIM_CLASSIFIER_ID:
      return createClaim();
    case ClaimModelPackage.CLAIMCOMPOSITEKEY_CLASSIFIER_ID:
      return createClaimCompositeKey();
    case ClaimModelPackage.CLAIMLINE_CLASSIFIER_ID:
      return createClaimLine();
    case ClaimModelPackage.CLAIMLINECOMPOSITEKEY_CLASSIFIER_ID:
      return createClaimLineCompositeKey();
    default:
      throw new IllegalArgumentException("The EClass '" + eClass.getName()
          + "' is not a valid EClass for this EPackage");
    }
  }

  /**
   * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          the EClass of the object
   * @param adaptee
   *          the object being wrapped/adapted
   * @return the wrapper {@link ModelObject}
   * @generated
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public ModelObject createModelObject(EClass eClass, Object adaptee) {
    ModelObject<Object> modelObject = null;
    switch (eClass.getClassifierID()) {
    case ClaimModelPackage.CLAIM_CLASSIFIER_ID:
      modelObject = new ClaimModelObject();
      break;
    case ClaimModelPackage.CLAIMCOMPOSITEKEY_CLASSIFIER_ID:
      modelObject = new ClaimCompositeKeyModelObject();
      break;
    case ClaimModelPackage.CLAIMLINE_CLASSIFIER_ID:
      modelObject = new ClaimLineModelObject();
      break;
    case ClaimModelPackage.CLAIMLINECOMPOSITEKEY_CLASSIFIER_ID:
      modelObject = new ClaimLineCompositeKeyModelObject();
      break;
    default:
      throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
    }
    modelObject.setTarget(adaptee);
    return modelObject;
  }

  /**
   * Creates a feature map entry instance for a certain EStructuralFeature.
   * 
   * @param eFeature
   *          the feature map feature
   * @return the pojo feature map entry
   * @generated
   */
  public Object createFeatureMapEntry(EStructuralFeature eFeature) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}. If the feature map entry is null then a
   * new one is created and <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eFeature
   *          the feature map feature of the object
   * @param adaptee
   *          the pojo feature map entry being wrapped/adapted
   * @return the wrapper {@link ModelFeatureMapEntry}
   * @generated
   */
  public ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature, Object adaptee) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Claim
   * @generated
   */
  public Claim createClaim() {
    return new Claim();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ClaimCompositeKey
   * @generated
   */
  public ClaimCompositeKey createClaimCompositeKey() {
    return new ClaimCompositeKey();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ClaimLine
   * @generated
   */
  public ClaimLine createClaimLine() {
    return new ClaimLine();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ClaimLineCompositeKey
   * @generated
   */
  public ClaimLineCompositeKey createClaimLineCompositeKey() {
    return new ClaimLineCompositeKey();
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if the value is null then null is returned.
   * @generated
   */
  public Object createFromString(EDataType eDataType, String value) {
    switch (eDataType.getClassifierID()) {
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
    }
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if value == null then null is returned
   * @generated
   */
  public String convertToString(EDataType eDataType, Object value) {
    switch (eDataType.getClassifierID()) {
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Claim</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ClaimModelObject<E extends Claim> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ClaimModelPackage.INSTANCE.getClaimEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ClaimModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ClaimModelPackage.CLAIM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ClaimModelPackage.CLAIM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ClaimModelPackage.CLAIM_CLAIMCOMPOSITEKEY_FEATURE_ID:
        return getTarget().getClaimCompositeKey();
      case ClaimModelPackage.CLAIM_BILLINGNAME_FEATURE_ID:
        return getTarget().getBillingName();
      case ClaimModelPackage.CLAIM_CLAIMGROUPVSPID_FEATURE_ID:
        return getTarget().getClaimGroupVSPId();
      case ClaimModelPackage.CLAIM_CLAIMSTATUS_FEATURE_ID:
        return getTarget().getClaimStatus();
      case ClaimModelPackage.CLAIM_CLAIMLINE_FEATURE_ID:
        return getTarget().getClaimLine();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ClaimModelPackage.CLAIM_CLAIMCOMPOSITEKEY_FEATURE_ID:
        getTarget().setClaimCompositeKey((ClaimCompositeKey) value);
        return;
      case ClaimModelPackage.CLAIM_BILLINGNAME_FEATURE_ID:
        getTarget().setBillingName((String) value);
        return;
      case ClaimModelPackage.CLAIM_CLAIMGROUPVSPID_FEATURE_ID:
        getTarget().setClaimGroupVSPId((String) value);
        return;
      case ClaimModelPackage.CLAIM_CLAIMSTATUS_FEATURE_ID:
        getTarget().setClaimStatus((String) value);
        return;
      case ClaimModelPackage.CLAIM_CLAIMLINE_FEATURE_ID:
        getTarget().setClaimLine((List<ClaimLine>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case ClaimModelPackage.CLAIM_CLAIMLINE_FEATURE_ID:
        return getTarget().addToClaimLine((ClaimLine) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case ClaimModelPackage.CLAIM_CLAIMLINE_FEATURE_ID:
        return getTarget().removeFromClaimLine((ClaimLine) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ClaimCompositeKey</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ClaimCompositeKeyModelObject<E extends ClaimCompositeKey> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ClaimModelPackage.INSTANCE.getClaimCompositeKeyEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ClaimModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ClaimModelPackage.CLAIMCOMPOSITEKEY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ClaimModelPackage.CLAIMCOMPOSITEKEY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ClaimModelPackage.CLAIMCOMPOSITEKEY_CLAIMNUMBER_FEATURE_ID:
        return getTarget().getClaimNumber();
      case ClaimModelPackage.CLAIMCOMPOSITEKEY_CLAIMEXTENSIONNUMBER_FEATURE_ID:
        return getTarget().getClaimExtensionNumber();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ClaimModelPackage.CLAIMCOMPOSITEKEY_CLAIMNUMBER_FEATURE_ID:
        getTarget().setClaimNumber((String) value);
        return;
      case ClaimModelPackage.CLAIMCOMPOSITEKEY_CLAIMEXTENSIONNUMBER_FEATURE_ID:
        getTarget().setClaimExtensionNumber((String) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ClaimLine</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ClaimLineModelObject<E extends ClaimLine> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ClaimModelPackage.INSTANCE.getClaimLineEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ClaimModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ClaimModelPackage.CLAIMLINE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ClaimModelPackage.CLAIMLINE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ClaimModelPackage.CLAIMLINE_CLAIM_FEATURE_ID:
        return getTarget().getClaim();
      case ClaimModelPackage.CLAIMLINE_CLAIMLINECOMPOSITEKEY_FEATURE_ID:
        return getTarget().getClaimLineCompositeKey();
      case ClaimModelPackage.CLAIMLINE_CLAIMLINEBILLEDAMOUNT_FEATURE_ID:
        return getTarget().getClaimLineBilledAmount();
      case ClaimModelPackage.CLAIMLINE_SERVICECODE_FEATURE_ID:
        return getTarget().getServiceCode();
      case ClaimModelPackage.CLAIMLINE_CLAIMLINESTATUS_FEATURE_ID:
        return getTarget().getClaimLineStatus();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ClaimModelPackage.CLAIMLINE_CLAIM_FEATURE_ID:
        getTarget().setClaim((Claim) value);
        return;
      case ClaimModelPackage.CLAIMLINE_CLAIMLINECOMPOSITEKEY_FEATURE_ID:
        getTarget().setClaimLineCompositeKey((ClaimLineCompositeKey) value);
        return;
      case ClaimModelPackage.CLAIMLINE_CLAIMLINEBILLEDAMOUNT_FEATURE_ID:
        getTarget().setClaimLineBilledAmount((BigDecimal) value);
        return;
      case ClaimModelPackage.CLAIMLINE_SERVICECODE_FEATURE_ID:
        getTarget().setServiceCode((String) value);
        return;
      case ClaimModelPackage.CLAIMLINE_CLAIMLINESTATUS_FEATURE_ID:
        getTarget().setClaimLineStatus((String) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ClaimLineCompositeKey</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ClaimLineCompositeKeyModelObject<E extends ClaimLineCompositeKey> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ClaimModelPackage.INSTANCE.getClaimLineCompositeKeyEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ClaimModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ClaimModelPackage.CLAIMLINECOMPOSITEKEY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ClaimModelPackage.CLAIMLINECOMPOSITEKEY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ClaimModelPackage.CLAIMLINECOMPOSITEKEY_CLAIM_FEATURE_ID:
        return getTarget().getClaim();
      case ClaimModelPackage.CLAIMLINECOMPOSITEKEY_CLAIMLINENUMBER_FEATURE_ID:
        return getTarget().getClaimLineNumber();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ClaimModelPackage.CLAIMLINECOMPOSITEKEY_CLAIM_FEATURE_ID:
        getTarget().setClaim((Claim) value);
        return;
      case ClaimModelPackage.CLAIMLINECOMPOSITEKEY_CLAIMLINENUMBER_FEATURE_ID:
        getTarget().setClaimLineNumber((String) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }
}