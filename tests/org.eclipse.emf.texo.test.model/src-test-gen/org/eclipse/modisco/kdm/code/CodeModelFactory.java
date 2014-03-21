package org.eclipse.modisco.kdm.code;

import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.modisco.kdm.action.EntryFlow;
import org.eclipse.modisco.kdm.core.CoreModelFactory;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.kdm.KdmModelFactory;
import org.eclipse.modisco.kdm.source.SourceRef;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: code. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CodeModelFactory implements ModelFactory {

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
    case CodeModelPackage.CODEMODEL_CLASSIFIER_ID:
      return createCodeModel();
    case CodeModelPackage.COMMENTUNIT_CLASSIFIER_ID:
      return createCommentUnit();
    case CodeModelPackage.COMPUTATIONALOBJECT_CLASSIFIER_ID:
      return createComputationalObject();
    case CodeModelPackage.DATATYPE_CLASSIFIER_ID:
      return createDatatype();
    case CodeModelPackage.MODULE_CLASSIFIER_ID:
      return createModule();
    case CodeModelPackage.COMPILATIONUNIT_CLASSIFIER_ID:
      return createCompilationUnit();
    case CodeModelPackage.SHAREDUNIT_CLASSIFIER_ID:
      return createSharedUnit();
    case CodeModelPackage.LANGUAGEUNIT_CLASSIFIER_ID:
      return createLanguageUnit();
    case CodeModelPackage.CODEASSEMBLY_CLASSIFIER_ID:
      return createCodeAssembly();
    case CodeModelPackage.PACKAGE_CLASSIFIER_ID:
      return createPackage();
    case CodeModelPackage.CONTROLELEMENT_CLASSIFIER_ID:
      return createControlElement();
    case CodeModelPackage.CALLABLEUNIT_CLASSIFIER_ID:
      return createCallableUnit();
    case CodeModelPackage.METHODUNIT_CLASSIFIER_ID:
      return createMethodUnit();
    case CodeModelPackage.DATAELEMENT_CLASSIFIER_ID:
      return createDataElement();
    case CodeModelPackage.STORABLEUNIT_CLASSIFIER_ID:
      return createStorableUnit();
    case CodeModelPackage.ITEMUNIT_CLASSIFIER_ID:
      return createItemUnit();
    case CodeModelPackage.INDEXUNIT_CLASSIFIER_ID:
      return createIndexUnit();
    case CodeModelPackage.MEMBERUNIT_CLASSIFIER_ID:
      return createMemberUnit();
    case CodeModelPackage.PARAMETERUNIT_CLASSIFIER_ID:
      return createParameterUnit();
    case CodeModelPackage.VALUE_CLASSIFIER_ID:
      return createValue();
    case CodeModelPackage.VALUELIST_CLASSIFIER_ID:
      return createValueList();
    case CodeModelPackage.PRIMITIVETYPE_CLASSIFIER_ID:
      return createPrimitiveType();
    case CodeModelPackage.BOOLEANTYPE_CLASSIFIER_ID:
      return createBooleanType();
    case CodeModelPackage.CHARTYPE_CLASSIFIER_ID:
      return createCharType();
    case CodeModelPackage.ORDINALTYPE_CLASSIFIER_ID:
      return createOrdinalType();
    case CodeModelPackage.DATETYPE_CLASSIFIER_ID:
      return createDateType();
    case CodeModelPackage.TIMETYPE_CLASSIFIER_ID:
      return createTimeType();
    case CodeModelPackage.INTEGERTYPE_CLASSIFIER_ID:
      return createIntegerType();
    case CodeModelPackage.DECIMALTYPE_CLASSIFIER_ID:
      return createDecimalType();
    case CodeModelPackage.SCALEDTYPE_CLASSIFIER_ID:
      return createScaledType();
    case CodeModelPackage.FLOATTYPE_CLASSIFIER_ID:
      return createFloatType();
    case CodeModelPackage.VOIDTYPE_CLASSIFIER_ID:
      return createVoidType();
    case CodeModelPackage.STRINGTYPE_CLASSIFIER_ID:
      return createStringType();
    case CodeModelPackage.BITTYPE_CLASSIFIER_ID:
      return createBitType();
    case CodeModelPackage.BITSTRINGTYPE_CLASSIFIER_ID:
      return createBitstringType();
    case CodeModelPackage.OCTETTYPE_CLASSIFIER_ID:
      return createOctetType();
    case CodeModelPackage.OCTETSTRINGTYPE_CLASSIFIER_ID:
      return createOctetstringType();
    case CodeModelPackage.ENUMERATEDTYPE_CLASSIFIER_ID:
      return createEnumeratedType();
    case CodeModelPackage.COMPOSITETYPE_CLASSIFIER_ID:
      return createCompositeType();
    case CodeModelPackage.CHOICETYPE_CLASSIFIER_ID:
      return createChoiceType();
    case CodeModelPackage.RECORDTYPE_CLASSIFIER_ID:
      return createRecordType();
    case CodeModelPackage.DERIVEDTYPE_CLASSIFIER_ID:
      return createDerivedType();
    case CodeModelPackage.ARRAYTYPE_CLASSIFIER_ID:
      return createArrayType();
    case CodeModelPackage.POINTERTYPE_CLASSIFIER_ID:
      return createPointerType();
    case CodeModelPackage.RANGETYPE_CLASSIFIER_ID:
      return createRangeType();
    case CodeModelPackage.BAGTYPE_CLASSIFIER_ID:
      return createBagType();
    case CodeModelPackage.SETTYPE_CLASSIFIER_ID:
      return createSetType();
    case CodeModelPackage.SEQUENCETYPE_CLASSIFIER_ID:
      return createSequenceType();
    case CodeModelPackage.SIGNATURE_CLASSIFIER_ID:
      return createSignature();
    case CodeModelPackage.TYPEUNIT_CLASSIFIER_ID:
      return createTypeUnit();
    case CodeModelPackage.SYNONYMUNIT_CLASSIFIER_ID:
      return createSynonymUnit();
    case CodeModelPackage.CLASSUNIT_CLASSIFIER_ID:
      return createClassUnit();
    case CodeModelPackage.INTERFACEUNIT_CLASSIFIER_ID:
      return createInterfaceUnit();
    case CodeModelPackage.TEMPLATEUNIT_CLASSIFIER_ID:
      return createTemplateUnit();
    case CodeModelPackage.TEMPLATEPARAMETER_CLASSIFIER_ID:
      return createTemplateParameter();
    case CodeModelPackage.TEMPLATETYPE_CLASSIFIER_ID:
      return createTemplateType();
    case CodeModelPackage.INSTANCEOF_CLASSIFIER_ID:
      return createInstanceOf();
    case CodeModelPackage.PARAMETERTO_CLASSIFIER_ID:
      return createParameterTo();
    case CodeModelPackage.IMPLEMENTS_CLASSIFIER_ID:
      return createImplements();
    case CodeModelPackage.IMPLEMENTATIONOF_CLASSIFIER_ID:
      return createImplementationOf();
    case CodeModelPackage.HASTYPE_CLASSIFIER_ID:
      return createHasType();
    case CodeModelPackage.HASVALUE_CLASSIFIER_ID:
      return createHasValue();
    case CodeModelPackage.EXTENDS_CLASSIFIER_ID:
      return createExtends();
    case CodeModelPackage.PREPROCESSORDIRECTIVE_CLASSIFIER_ID:
      return createPreprocessorDirective();
    case CodeModelPackage.MACROUNIT_CLASSIFIER_ID:
      return createMacroUnit();
    case CodeModelPackage.MACRODIRECTIVE_CLASSIFIER_ID:
      return createMacroDirective();
    case CodeModelPackage.INCLUDEDIRECTIVE_CLASSIFIER_ID:
      return createIncludeDirective();
    case CodeModelPackage.CONDITIONALDIRECTIVE_CLASSIFIER_ID:
      return createConditionalDirective();
    case CodeModelPackage.EXPANDS_CLASSIFIER_ID:
      return createExpands();
    case CodeModelPackage.GENERATEDFROM_CLASSIFIER_ID:
      return createGeneratedFrom();
    case CodeModelPackage.INCLUDES_CLASSIFIER_ID:
      return createIncludes();
    case CodeModelPackage.VARIANTTO_CLASSIFIER_ID:
      return createVariantTo();
    case CodeModelPackage.REDEFINES_CLASSIFIER_ID:
      return createRedefines();
    case CodeModelPackage.NAMESPACE_CLASSIFIER_ID:
      return createNamespace();
    case CodeModelPackage.VISIBLEIN_CLASSIFIER_ID:
      return createVisibleIn();
    case CodeModelPackage.IMPORTS_CLASSIFIER_ID:
      return createImports();
    case CodeModelPackage.CODEELEMENT_CLASSIFIER_ID:
      return createCodeElement();
    case CodeModelPackage.CODERELATIONSHIP_CLASSIFIER_ID:
      return createCodeRelationship();
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
    case CodeModelPackage.CODEMODEL_CLASSIFIER_ID:
      modelObject = new CodeModelModelObject();
      break;
    case CodeModelPackage.ABSTRACTCODEELEMENT_CLASSIFIER_ID:
      modelObject = new AbstractCodeElementModelObject();
      break;
    case CodeModelPackage.COMMENTUNIT_CLASSIFIER_ID:
      modelObject = new CommentUnitModelObject();
      break;
    case CodeModelPackage.ABSTRACTCODERELATIONSHIP_CLASSIFIER_ID:
      modelObject = new AbstractCodeRelationshipModelObject();
      break;
    case CodeModelPackage.CODEITEM_CLASSIFIER_ID:
      modelObject = new CodeItemModelObject();
      break;
    case CodeModelPackage.COMPUTATIONALOBJECT_CLASSIFIER_ID:
      modelObject = new ComputationalObjectModelObject();
      break;
    case CodeModelPackage.DATATYPE_CLASSIFIER_ID:
      modelObject = new DatatypeModelObject();
      break;
    case CodeModelPackage.MODULE_CLASSIFIER_ID:
      modelObject = new ModuleModelObject();
      break;
    case CodeModelPackage.COMPILATIONUNIT_CLASSIFIER_ID:
      modelObject = new CompilationUnitModelObject();
      break;
    case CodeModelPackage.SHAREDUNIT_CLASSIFIER_ID:
      modelObject = new SharedUnitModelObject();
      break;
    case CodeModelPackage.LANGUAGEUNIT_CLASSIFIER_ID:
      modelObject = new LanguageUnitModelObject();
      break;
    case CodeModelPackage.CODEASSEMBLY_CLASSIFIER_ID:
      modelObject = new CodeAssemblyModelObject();
      break;
    case CodeModelPackage.PACKAGE_CLASSIFIER_ID:
      modelObject = new PackageModelObject();
      break;
    case CodeModelPackage.CONTROLELEMENT_CLASSIFIER_ID:
      modelObject = new ControlElementModelObject();
      break;
    case CodeModelPackage.CALLABLEUNIT_CLASSIFIER_ID:
      modelObject = new CallableUnitModelObject();
      break;
    case CodeModelPackage.METHODUNIT_CLASSIFIER_ID:
      modelObject = new MethodUnitModelObject();
      break;
    case CodeModelPackage.DATAELEMENT_CLASSIFIER_ID:
      modelObject = new DataElementModelObject();
      break;
    case CodeModelPackage.STORABLEUNIT_CLASSIFIER_ID:
      modelObject = new StorableUnitModelObject();
      break;
    case CodeModelPackage.ITEMUNIT_CLASSIFIER_ID:
      modelObject = new ItemUnitModelObject();
      break;
    case CodeModelPackage.INDEXUNIT_CLASSIFIER_ID:
      modelObject = new IndexUnitModelObject();
      break;
    case CodeModelPackage.MEMBERUNIT_CLASSIFIER_ID:
      modelObject = new MemberUnitModelObject();
      break;
    case CodeModelPackage.PARAMETERUNIT_CLASSIFIER_ID:
      modelObject = new ParameterUnitModelObject();
      break;
    case CodeModelPackage.VALUEELEMENT_CLASSIFIER_ID:
      modelObject = new ValueElementModelObject();
      break;
    case CodeModelPackage.VALUE_CLASSIFIER_ID:
      modelObject = new ValueModelObject();
      break;
    case CodeModelPackage.VALUELIST_CLASSIFIER_ID:
      modelObject = new ValueListModelObject();
      break;
    case CodeModelPackage.PRIMITIVETYPE_CLASSIFIER_ID:
      modelObject = new PrimitiveTypeModelObject();
      break;
    case CodeModelPackage.BOOLEANTYPE_CLASSIFIER_ID:
      modelObject = new BooleanTypeModelObject();
      break;
    case CodeModelPackage.CHARTYPE_CLASSIFIER_ID:
      modelObject = new CharTypeModelObject();
      break;
    case CodeModelPackage.ORDINALTYPE_CLASSIFIER_ID:
      modelObject = new OrdinalTypeModelObject();
      break;
    case CodeModelPackage.DATETYPE_CLASSIFIER_ID:
      modelObject = new DateTypeModelObject();
      break;
    case CodeModelPackage.TIMETYPE_CLASSIFIER_ID:
      modelObject = new TimeTypeModelObject();
      break;
    case CodeModelPackage.INTEGERTYPE_CLASSIFIER_ID:
      modelObject = new IntegerTypeModelObject();
      break;
    case CodeModelPackage.DECIMALTYPE_CLASSIFIER_ID:
      modelObject = new DecimalTypeModelObject();
      break;
    case CodeModelPackage.SCALEDTYPE_CLASSIFIER_ID:
      modelObject = new ScaledTypeModelObject();
      break;
    case CodeModelPackage.FLOATTYPE_CLASSIFIER_ID:
      modelObject = new FloatTypeModelObject();
      break;
    case CodeModelPackage.VOIDTYPE_CLASSIFIER_ID:
      modelObject = new VoidTypeModelObject();
      break;
    case CodeModelPackage.STRINGTYPE_CLASSIFIER_ID:
      modelObject = new StringTypeModelObject();
      break;
    case CodeModelPackage.BITTYPE_CLASSIFIER_ID:
      modelObject = new BitTypeModelObject();
      break;
    case CodeModelPackage.BITSTRINGTYPE_CLASSIFIER_ID:
      modelObject = new BitstringTypeModelObject();
      break;
    case CodeModelPackage.OCTETTYPE_CLASSIFIER_ID:
      modelObject = new OctetTypeModelObject();
      break;
    case CodeModelPackage.OCTETSTRINGTYPE_CLASSIFIER_ID:
      modelObject = new OctetstringTypeModelObject();
      break;
    case CodeModelPackage.ENUMERATEDTYPE_CLASSIFIER_ID:
      modelObject = new EnumeratedTypeModelObject();
      break;
    case CodeModelPackage.COMPOSITETYPE_CLASSIFIER_ID:
      modelObject = new CompositeTypeModelObject();
      break;
    case CodeModelPackage.CHOICETYPE_CLASSIFIER_ID:
      modelObject = new ChoiceTypeModelObject();
      break;
    case CodeModelPackage.RECORDTYPE_CLASSIFIER_ID:
      modelObject = new RecordTypeModelObject();
      break;
    case CodeModelPackage.DERIVEDTYPE_CLASSIFIER_ID:
      modelObject = new DerivedTypeModelObject();
      break;
    case CodeModelPackage.ARRAYTYPE_CLASSIFIER_ID:
      modelObject = new ArrayTypeModelObject();
      break;
    case CodeModelPackage.POINTERTYPE_CLASSIFIER_ID:
      modelObject = new PointerTypeModelObject();
      break;
    case CodeModelPackage.RANGETYPE_CLASSIFIER_ID:
      modelObject = new RangeTypeModelObject();
      break;
    case CodeModelPackage.BAGTYPE_CLASSIFIER_ID:
      modelObject = new BagTypeModelObject();
      break;
    case CodeModelPackage.SETTYPE_CLASSIFIER_ID:
      modelObject = new SetTypeModelObject();
      break;
    case CodeModelPackage.SEQUENCETYPE_CLASSIFIER_ID:
      modelObject = new SequenceTypeModelObject();
      break;
    case CodeModelPackage.SIGNATURE_CLASSIFIER_ID:
      modelObject = new SignatureModelObject();
      break;
    case CodeModelPackage.DEFINEDTYPE_CLASSIFIER_ID:
      modelObject = new DefinedTypeModelObject();
      break;
    case CodeModelPackage.TYPEUNIT_CLASSIFIER_ID:
      modelObject = new TypeUnitModelObject();
      break;
    case CodeModelPackage.SYNONYMUNIT_CLASSIFIER_ID:
      modelObject = new SynonymUnitModelObject();
      break;
    case CodeModelPackage.CLASSUNIT_CLASSIFIER_ID:
      modelObject = new ClassUnitModelObject();
      break;
    case CodeModelPackage.INTERFACEUNIT_CLASSIFIER_ID:
      modelObject = new InterfaceUnitModelObject();
      break;
    case CodeModelPackage.TEMPLATEUNIT_CLASSIFIER_ID:
      modelObject = new TemplateUnitModelObject();
      break;
    case CodeModelPackage.TEMPLATEPARAMETER_CLASSIFIER_ID:
      modelObject = new TemplateParameterModelObject();
      break;
    case CodeModelPackage.TEMPLATETYPE_CLASSIFIER_ID:
      modelObject = new TemplateTypeModelObject();
      break;
    case CodeModelPackage.INSTANCEOF_CLASSIFIER_ID:
      modelObject = new InstanceOfModelObject();
      break;
    case CodeModelPackage.PARAMETERTO_CLASSIFIER_ID:
      modelObject = new ParameterToModelObject();
      break;
    case CodeModelPackage.IMPLEMENTS_CLASSIFIER_ID:
      modelObject = new ImplementsModelObject();
      break;
    case CodeModelPackage.IMPLEMENTATIONOF_CLASSIFIER_ID:
      modelObject = new ImplementationOfModelObject();
      break;
    case CodeModelPackage.HASTYPE_CLASSIFIER_ID:
      modelObject = new HasTypeModelObject();
      break;
    case CodeModelPackage.HASVALUE_CLASSIFIER_ID:
      modelObject = new HasValueModelObject();
      break;
    case CodeModelPackage.EXTENDS_CLASSIFIER_ID:
      modelObject = new ExtendsModelObject();
      break;
    case CodeModelPackage.PREPROCESSORDIRECTIVE_CLASSIFIER_ID:
      modelObject = new PreprocessorDirectiveModelObject();
      break;
    case CodeModelPackage.MACROUNIT_CLASSIFIER_ID:
      modelObject = new MacroUnitModelObject();
      break;
    case CodeModelPackage.MACRODIRECTIVE_CLASSIFIER_ID:
      modelObject = new MacroDirectiveModelObject();
      break;
    case CodeModelPackage.INCLUDEDIRECTIVE_CLASSIFIER_ID:
      modelObject = new IncludeDirectiveModelObject();
      break;
    case CodeModelPackage.CONDITIONALDIRECTIVE_CLASSIFIER_ID:
      modelObject = new ConditionalDirectiveModelObject();
      break;
    case CodeModelPackage.EXPANDS_CLASSIFIER_ID:
      modelObject = new ExpandsModelObject();
      break;
    case CodeModelPackage.GENERATEDFROM_CLASSIFIER_ID:
      modelObject = new GeneratedFromModelObject();
      break;
    case CodeModelPackage.INCLUDES_CLASSIFIER_ID:
      modelObject = new IncludesModelObject();
      break;
    case CodeModelPackage.VARIANTTO_CLASSIFIER_ID:
      modelObject = new VariantToModelObject();
      break;
    case CodeModelPackage.REDEFINES_CLASSIFIER_ID:
      modelObject = new RedefinesModelObject();
      break;
    case CodeModelPackage.NAMESPACE_CLASSIFIER_ID:
      modelObject = new NamespaceModelObject();
      break;
    case CodeModelPackage.VISIBLEIN_CLASSIFIER_ID:
      modelObject = new VisibleInModelObject();
      break;
    case CodeModelPackage.IMPORTS_CLASSIFIER_ID:
      modelObject = new ImportsModelObject();
      break;
    case CodeModelPackage.CODEELEMENT_CLASSIFIER_ID:
      modelObject = new CodeElementModelObject();
      break;
    case CodeModelPackage.CODERELATIONSHIP_CLASSIFIER_ID:
      modelObject = new CodeRelationshipModelObject();
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
   * @return an instance of the model object representing the EClass CodeModel
   * @generated
   */
  public CodeModel createCodeModel() {
    return new CodeModel();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CommentUnit
   * @generated
   */
  public CommentUnit createCommentUnit() {
    return new CommentUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ComputationalObject
   * @generated
   */
  public ComputationalObject createComputationalObject() {
    return new ComputationalObject();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Datatype
   * @generated
   */
  public Datatype createDatatype() {
    return new Datatype();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Module
   * @generated
   */
  public Module createModule() {
    return new Module();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CompilationUnit
   * @generated
   */
  public CompilationUnit createCompilationUnit() {
    return new CompilationUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SharedUnit
   * @generated
   */
  public SharedUnit createSharedUnit() {
    return new SharedUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass LanguageUnit
   * @generated
   */
  public LanguageUnit createLanguageUnit() {
    return new LanguageUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CodeAssembly
   * @generated
   */
  public CodeAssembly createCodeAssembly() {
    return new CodeAssembly();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Package
   * @generated
   */
  public Package createPackage() {
    return new Package();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ControlElement
   * @generated
   */
  public ControlElement createControlElement() {
    return new ControlElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CallableUnit
   * @generated
   */
  public CallableUnit createCallableUnit() {
    return new CallableUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass MethodUnit
   * @generated
   */
  public MethodUnit createMethodUnit() {
    return new MethodUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DataElement
   * @generated
   */
  public DataElement createDataElement() {
    return new DataElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass StorableUnit
   * @generated
   */
  public StorableUnit createStorableUnit() {
    return new StorableUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ItemUnit
   * @generated
   */
  public ItemUnit createItemUnit() {
    return new ItemUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass IndexUnit
   * @generated
   */
  public IndexUnit createIndexUnit() {
    return new IndexUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass MemberUnit
   * @generated
   */
  public MemberUnit createMemberUnit() {
    return new MemberUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ParameterUnit
   * @generated
   */
  public ParameterUnit createParameterUnit() {
    return new ParameterUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Value
   * @generated
   */
  public Value createValue() {
    return new Value();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ValueList
   * @generated
   */
  public ValueList createValueList() {
    return new ValueList();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PrimitiveType
   * @generated
   */
  public PrimitiveType createPrimitiveType() {
    return new PrimitiveType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BooleanType
   * @generated
   */
  public BooleanType createBooleanType() {
    return new BooleanType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CharType
   * @generated
   */
  public CharType createCharType() {
    return new CharType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass OrdinalType
   * @generated
   */
  public OrdinalType createOrdinalType() {
    return new OrdinalType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DateType
   * @generated
   */
  public DateType createDateType() {
    return new DateType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TimeType
   * @generated
   */
  public TimeType createTimeType() {
    return new TimeType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass IntegerType
   * @generated
   */
  public IntegerType createIntegerType() {
    return new IntegerType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DecimalType
   * @generated
   */
  public DecimalType createDecimalType() {
    return new DecimalType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ScaledType
   * @generated
   */
  public ScaledType createScaledType() {
    return new ScaledType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass FloatType
   * @generated
   */
  public FloatType createFloatType() {
    return new FloatType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass VoidType
   * @generated
   */
  public VoidType createVoidType() {
    return new VoidType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass StringType
   * @generated
   */
  public StringType createStringType() {
    return new StringType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BitType
   * @generated
   */
  public BitType createBitType() {
    return new BitType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BitstringType
   * @generated
   */
  public BitstringType createBitstringType() {
    return new BitstringType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass OctetType
   * @generated
   */
  public OctetType createOctetType() {
    return new OctetType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass OctetstringType
   * @generated
   */
  public OctetstringType createOctetstringType() {
    return new OctetstringType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass EnumeratedType
   * @generated
   */
  public EnumeratedType createEnumeratedType() {
    return new EnumeratedType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CompositeType
   * @generated
   */
  public CompositeType createCompositeType() {
    return new CompositeType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ChoiceType
   * @generated
   */
  public ChoiceType createChoiceType() {
    return new ChoiceType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RecordType
   * @generated
   */
  public RecordType createRecordType() {
    return new RecordType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DerivedType
   * @generated
   */
  public DerivedType createDerivedType() {
    return new DerivedType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ArrayType
   * @generated
   */
  public ArrayType createArrayType() {
    return new ArrayType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PointerType
   * @generated
   */
  public PointerType createPointerType() {
    return new PointerType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RangeType
   * @generated
   */
  public RangeType createRangeType() {
    return new RangeType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BagType
   * @generated
   */
  public BagType createBagType() {
    return new BagType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SetType
   * @generated
   */
  public SetType createSetType() {
    return new SetType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SequenceType
   * @generated
   */
  public SequenceType createSequenceType() {
    return new SequenceType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Signature
   * @generated
   */
  public Signature createSignature() {
    return new Signature();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TypeUnit
   * @generated
   */
  public TypeUnit createTypeUnit() {
    return new TypeUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SynonymUnit
   * @generated
   */
  public SynonymUnit createSynonymUnit() {
    return new SynonymUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ClassUnit
   * @generated
   */
  public ClassUnit createClassUnit() {
    return new ClassUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass InterfaceUnit
   * @generated
   */
  public InterfaceUnit createInterfaceUnit() {
    return new InterfaceUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TemplateUnit
   * @generated
   */
  public TemplateUnit createTemplateUnit() {
    return new TemplateUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TemplateParameter
   * @generated
   */
  public TemplateParameter createTemplateParameter() {
    return new TemplateParameter();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TemplateType
   * @generated
   */
  public TemplateType createTemplateType() {
    return new TemplateType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass InstanceOf
   * @generated
   */
  public InstanceOf createInstanceOf() {
    return new InstanceOf();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ParameterTo
   * @generated
   */
  public ParameterTo createParameterTo() {
    return new ParameterTo();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Implements
   * @generated
   */
  public Implements createImplements() {
    return new Implements();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ImplementationOf
   * @generated
   */
  public ImplementationOf createImplementationOf() {
    return new ImplementationOf();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass HasType
   * @generated
   */
  public HasType createHasType() {
    return new HasType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass HasValue
   * @generated
   */
  public HasValue createHasValue() {
    return new HasValue();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Extends
   * @generated
   */
  public Extends createExtends() {
    return new Extends();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PreprocessorDirective
   * @generated
   */
  public PreprocessorDirective createPreprocessorDirective() {
    return new PreprocessorDirective();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass MacroUnit
   * @generated
   */
  public MacroUnit createMacroUnit() {
    return new MacroUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass MacroDirective
   * @generated
   */
  public MacroDirective createMacroDirective() {
    return new MacroDirective();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass IncludeDirective
   * @generated
   */
  public IncludeDirective createIncludeDirective() {
    return new IncludeDirective();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ConditionalDirective
   * @generated
   */
  public ConditionalDirective createConditionalDirective() {
    return new ConditionalDirective();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Expands
   * @generated
   */
  public Expands createExpands() {
    return new Expands();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass GeneratedFrom
   * @generated
   */
  public GeneratedFrom createGeneratedFrom() {
    return new GeneratedFrom();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Includes
   * @generated
   */
  public Includes createIncludes() {
    return new Includes();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass VariantTo
   * @generated
   */
  public VariantTo createVariantTo() {
    return new VariantTo();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Redefines
   * @generated
   */
  public Redefines createRedefines() {
    return new Redefines();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Namespace
   * @generated
   */
  public Namespace createNamespace() {
    return new Namespace();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass VisibleIn
   * @generated
   */
  public VisibleIn createVisibleIn() {
    return new VisibleIn();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Imports
   * @generated
   */
  public Imports createImports() {
    return new Imports();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CodeElement
   * @generated
   */
  public CodeElement createCodeElement() {
    return new CodeElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CodeRelationship
   * @generated
   */
  public CodeRelationship createCodeRelationship() {
    return new CodeRelationship();
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
    case CodeModelPackage.CALLABLEKIND_CLASSIFIER_ID:
      return createCallableKindFromString(value);
    case CodeModelPackage.METHODKIND_CLASSIFIER_ID:
      return createMethodKindFromString(value);
    case CodeModelPackage.EXPORTKIND_CLASSIFIER_ID:
      return createExportKindFromString(value);
    case CodeModelPackage.STORABLEKIND_CLASSIFIER_ID:
      return createStorableKindFromString(value);
    case CodeModelPackage.PARAMETERKIND_CLASSIFIER_ID:
      return createParameterKindFromString(value);
    case CodeModelPackage.MACROKIND_CLASSIFIER_ID:
      return createMacroKindFromString(value);
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
    case CodeModelPackage.CALLABLEKIND_CLASSIFIER_ID:
      return convertCallableKindToString((CallableKind) value);
    case CodeModelPackage.METHODKIND_CLASSIFIER_ID:
      return convertMethodKindToString((MethodKind) value);
    case CodeModelPackage.EXPORTKIND_CLASSIFIER_ID:
      return convertExportKindToString((ExportKind) value);
    case CodeModelPackage.STORABLEKIND_CLASSIFIER_ID:
      return convertStorableKindToString((StorableKind) value);
    case CodeModelPackage.PARAMETERKIND_CLASSIFIER_ID:
      return convertParameterKindToString((ParameterKind) value);
    case CodeModelPackage.MACROKIND_CLASSIFIER_ID:
      return convertMacroKindToString((MacroKind) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: CallableKind to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertCallableKindToString(CallableKind value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: CallableKind from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public CallableKind createCallableKindFromString(String value) {
    if (value == null) {
      return null;
    }
    return CallableKind.get(value);
  }

  /**
   * Converts the EDataType: MethodKind to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertMethodKindToString(MethodKind value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: MethodKind from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public MethodKind createMethodKindFromString(String value) {
    if (value == null) {
      return null;
    }
    return MethodKind.get(value);
  }

  /**
   * Converts the EDataType: ExportKind to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertExportKindToString(ExportKind value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: ExportKind from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public ExportKind createExportKindFromString(String value) {
    if (value == null) {
      return null;
    }
    return ExportKind.get(value);
  }

  /**
   * Converts the EDataType: StorableKind to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertStorableKindToString(StorableKind value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: StorableKind from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public StorableKind createStorableKindFromString(String value) {
    if (value == null) {
      return null;
    }
    return StorableKind.get(value);
  }

  /**
   * Converts the EDataType: ParameterKind to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertParameterKindToString(ParameterKind value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: ParameterKind from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public ParameterKind createParameterKindFromString(String value) {
    if (value == null) {
      return null;
    }
    return ParameterKind.get(value);
  }

  /**
   * Converts the EDataType: MacroKind to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertMacroKindToString(MacroKind value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: MacroKind from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public MacroKind createMacroKindFromString(String value) {
    if (value == null) {
      return null;
    }
    return MacroKind.get(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CodeModel</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CodeModelModelObject<E extends CodeModel> extends KdmModelFactory.KDMModelModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCodeModelEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CODEMODEL_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.CODEMODEL_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.CODEMODEL_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.CODEMODEL_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.CODEMODEL_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.CODEMODEL_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.CODEMODEL_AUDIT_FEATURE_ID:
        return getTarget().getAudit();
      case CodeModelPackage.CODEMODEL_EXTENSION_FEATURE_ID:
        return getTarget().getExtension();
      case CodeModelPackage.CODEMODEL_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.CODEMODEL_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.CODEMODEL_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
      case CodeModelPackage.CODEMODEL_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((List<AbstractCodeElement>) value);
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

      case CodeModelPackage.CODEMODEL_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((AbstractCodeElement) value);
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

      case CodeModelPackage.CODEMODEL_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((AbstractCodeElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractCodeElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractCodeElementModelObject<E extends AbstractCodeElement> extends
      CoreModelFactory.KDMEntityModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getAbstractCodeElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.ABSTRACTCODEELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.ABSTRACTCODEELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.ABSTRACTCODEELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.ABSTRACTCODEELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.ABSTRACTCODEELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.ABSTRACTCODEELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.ABSTRACTCODEELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.ABSTRACTCODEELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.ABSTRACTCODEELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.ABSTRACTCODEELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.ABSTRACTCODEELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.ABSTRACTCODEELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.ABSTRACTCODEELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.ABSTRACTCODEELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.ABSTRACTCODEELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.ABSTRACTCODEELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.ABSTRACTCODEELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.ABSTRACTCODEELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.ABSTRACTCODEELEMENT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.ABSTRACTCODEELEMENT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.ABSTRACTCODEELEMENT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
      case CodeModelPackage.ABSTRACTCODEELEMENT_SOURCE_FEATURE_ID:
        getTarget().setSource((Set<SourceRef>) value);
        return;
      case CodeModelPackage.ABSTRACTCODEELEMENT_COMMENT_FEATURE_ID:
        getTarget().setComment((Set<CommentUnit>) value);
        return;
      case CodeModelPackage.ABSTRACTCODEELEMENT_CODERELATION_FEATURE_ID:
        getTarget().setCodeRelation((Set<AbstractCodeRelationship>) value);
        return;
      case CodeModelPackage.ABSTRACTCODEELEMENT_ENTRYFLOW_FEATURE_ID:
        getTarget().setEntryFlow((List<EntryFlow>) value);
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

      case CodeModelPackage.ABSTRACTCODEELEMENT_SOURCE_FEATURE_ID:
        return getTarget().addToSource((SourceRef) value);

      case CodeModelPackage.ABSTRACTCODEELEMENT_COMMENT_FEATURE_ID:
        return getTarget().addToComment((CommentUnit) value);

      case CodeModelPackage.ABSTRACTCODEELEMENT_CODERELATION_FEATURE_ID:
        return getTarget().addToCodeRelation((AbstractCodeRelationship) value);

      case CodeModelPackage.ABSTRACTCODEELEMENT_ENTRYFLOW_FEATURE_ID:
        return getTarget().addToEntryFlow((EntryFlow) value);
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

      case CodeModelPackage.ABSTRACTCODEELEMENT_SOURCE_FEATURE_ID:
        return getTarget().removeFromSource((SourceRef) value);

      case CodeModelPackage.ABSTRACTCODEELEMENT_COMMENT_FEATURE_ID:
        return getTarget().removeFromComment((CommentUnit) value);

      case CodeModelPackage.ABSTRACTCODEELEMENT_CODERELATION_FEATURE_ID:
        return getTarget().removeFromCodeRelation((AbstractCodeRelationship) value);

      case CodeModelPackage.ABSTRACTCODEELEMENT_ENTRYFLOW_FEATURE_ID:
        return getTarget().removeFromEntryFlow((EntryFlow) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CommentUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CommentUnitModelObject<E extends CommentUnit> extends CoreModelFactory.ModelElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCommentUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.COMMENTUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.COMMENTUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.COMMENTUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.COMMENTUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.COMMENTUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.COMMENTUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.COMMENTUNIT_TEXT_FEATURE_ID:
        return getTarget().getText();
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
      case CodeModelPackage.COMMENTUNIT_TEXT_FEATURE_ID:
        getTarget().setText((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>AbstractCodeRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractCodeRelationshipModelObject<E extends AbstractCodeRelationship> extends
      CoreModelFactory.KDMRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getAbstractCodeRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.ABSTRACTCODERELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.ABSTRACTCODERELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.ABSTRACTCODERELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.ABSTRACTCODERELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.ABSTRACTCODERELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.ABSTRACTCODERELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
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
   * The adapter/wrapper for the EClass '<em><b>CodeItem</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CodeItemModelObject<E extends CodeItem> extends AbstractCodeElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCodeItemEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CODEITEM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.CODEITEM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.CODEITEM_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.CODEITEM_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.CODEITEM_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.CODEITEM_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.CODEITEM_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.CODEITEM_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.CODEITEM_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.CODEITEM_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.CODEITEM_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.CODEITEM_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.CODEITEM_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.CODEITEM_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.CODEITEM_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.CODEITEM_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.CODEITEM_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.CODEITEM_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.CODEITEM_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.CODEITEM_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.CODEITEM_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>ComputationalObject</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ComputationalObjectModelObject<E extends ComputationalObject> extends CodeItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getComputationalObjectEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.COMPUTATIONALOBJECT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.COMPUTATIONALOBJECT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.COMPUTATIONALOBJECT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.COMPUTATIONALOBJECT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.COMPUTATIONALOBJECT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.COMPUTATIONALOBJECT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.COMPUTATIONALOBJECT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.COMPUTATIONALOBJECT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.COMPUTATIONALOBJECT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.COMPUTATIONALOBJECT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.COMPUTATIONALOBJECT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.COMPUTATIONALOBJECT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.COMPUTATIONALOBJECT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.COMPUTATIONALOBJECT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.COMPUTATIONALOBJECT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.COMPUTATIONALOBJECT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.COMPUTATIONALOBJECT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.COMPUTATIONALOBJECT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.COMPUTATIONALOBJECT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.COMPUTATIONALOBJECT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.COMPUTATIONALOBJECT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>Datatype</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DatatypeModelObject<E extends Datatype> extends CodeItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getDatatypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.DATATYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.DATATYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.DATATYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.DATATYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.DATATYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.DATATYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.DATATYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.DATATYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.DATATYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.DATATYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.DATATYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.DATATYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.DATATYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.DATATYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.DATATYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.DATATYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.DATATYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.DATATYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.DATATYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.DATATYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.DATATYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>Module</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ModuleModelObject<E extends Module> extends CodeItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getModuleEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.MODULE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.MODULE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.MODULE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.MODULE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.MODULE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.MODULE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.MODULE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.MODULE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.MODULE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.MODULE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.MODULE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.MODULE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.MODULE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.MODULE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.MODULE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.MODULE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.MODULE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.MODULE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.MODULE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.MODULE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.MODULE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.MODULE_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
      case CodeModelPackage.MODULE_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((List<AbstractCodeElement>) value);
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

      case CodeModelPackage.MODULE_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((AbstractCodeElement) value);
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

      case CodeModelPackage.MODULE_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((AbstractCodeElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CompilationUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CompilationUnitModelObject<E extends CompilationUnit> extends ModuleModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCompilationUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.COMPILATIONUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.COMPILATIONUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.COMPILATIONUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.COMPILATIONUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.COMPILATIONUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.COMPILATIONUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.COMPILATIONUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.COMPILATIONUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.COMPILATIONUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.COMPILATIONUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.COMPILATIONUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.COMPILATIONUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.COMPILATIONUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.COMPILATIONUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.COMPILATIONUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.COMPILATIONUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.COMPILATIONUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.COMPILATIONUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.COMPILATIONUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.COMPILATIONUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.COMPILATIONUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.COMPILATIONUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
   * The adapter/wrapper for the EClass '<em><b>SharedUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SharedUnitModelObject<E extends SharedUnit> extends CompilationUnitModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getSharedUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.SHAREDUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.SHAREDUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.SHAREDUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.SHAREDUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.SHAREDUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.SHAREDUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.SHAREDUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.SHAREDUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.SHAREDUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.SHAREDUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.SHAREDUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.SHAREDUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.SHAREDUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.SHAREDUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.SHAREDUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.SHAREDUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.SHAREDUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.SHAREDUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.SHAREDUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.SHAREDUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.SHAREDUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.SHAREDUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
   * The adapter/wrapper for the EClass '<em><b>LanguageUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class LanguageUnitModelObject<E extends LanguageUnit> extends ModuleModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getLanguageUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.LANGUAGEUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.LANGUAGEUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.LANGUAGEUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.LANGUAGEUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.LANGUAGEUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.LANGUAGEUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.LANGUAGEUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.LANGUAGEUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.LANGUAGEUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.LANGUAGEUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.LANGUAGEUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.LANGUAGEUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.LANGUAGEUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.LANGUAGEUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.LANGUAGEUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.LANGUAGEUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.LANGUAGEUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.LANGUAGEUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.LANGUAGEUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.LANGUAGEUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.LANGUAGEUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.LANGUAGEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
   * The adapter/wrapper for the EClass '<em><b>CodeAssembly</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CodeAssemblyModelObject<E extends CodeAssembly> extends ModuleModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCodeAssemblyEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CODEASSEMBLY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.CODEASSEMBLY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.CODEASSEMBLY_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.CODEASSEMBLY_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.CODEASSEMBLY_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.CODEASSEMBLY_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.CODEASSEMBLY_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.CODEASSEMBLY_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.CODEASSEMBLY_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.CODEASSEMBLY_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.CODEASSEMBLY_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.CODEASSEMBLY_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.CODEASSEMBLY_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.CODEASSEMBLY_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.CODEASSEMBLY_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.CODEASSEMBLY_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.CODEASSEMBLY_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.CODEASSEMBLY_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.CODEASSEMBLY_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.CODEASSEMBLY_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.CODEASSEMBLY_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.CODEASSEMBLY_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
   * The adapter/wrapper for the EClass '<em><b>Package</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PackageModelObject<E extends Package> extends ModuleModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getPackageEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.PACKAGE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.PACKAGE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.PACKAGE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.PACKAGE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.PACKAGE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.PACKAGE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.PACKAGE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.PACKAGE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.PACKAGE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.PACKAGE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.PACKAGE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.PACKAGE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.PACKAGE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.PACKAGE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.PACKAGE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.PACKAGE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.PACKAGE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.PACKAGE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.PACKAGE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.PACKAGE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.PACKAGE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.PACKAGE_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
   * The adapter/wrapper for the EClass '<em><b>ControlElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ControlElementModelObject<E extends ControlElement> extends ComputationalObjectModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getControlElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CONTROLELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.CONTROLELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.CONTROLELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.CONTROLELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.CONTROLELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.CONTROLELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.CONTROLELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.CONTROLELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.CONTROLELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.CONTROLELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.CONTROLELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.CONTROLELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.CONTROLELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.CONTROLELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.CONTROLELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.CONTROLELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.CONTROLELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.CONTROLELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.CONTROLELEMENT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.CONTROLELEMENT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.CONTROLELEMENT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.CONTROLELEMENT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.CONTROLELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
      case CodeModelPackage.CONTROLELEMENT_TYPE_FEATURE_ID:
        getTarget().setType((Datatype) value);
        return;
      case CodeModelPackage.CONTROLELEMENT_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((List<AbstractCodeElement>) value);
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

      case CodeModelPackage.CONTROLELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((AbstractCodeElement) value);
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

      case CodeModelPackage.CONTROLELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((AbstractCodeElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CallableUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CallableUnitModelObject<E extends CallableUnit> extends ControlElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCallableUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CALLABLEUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.CALLABLEUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.CALLABLEUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.CALLABLEUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.CALLABLEUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.CALLABLEUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.CALLABLEUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.CALLABLEUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.CALLABLEUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.CALLABLEUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.CALLABLEUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.CALLABLEUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.CALLABLEUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.CALLABLEUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.CALLABLEUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.CALLABLEUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.CALLABLEUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.CALLABLEUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.CALLABLEUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.CALLABLEUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.CALLABLEUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.CALLABLEUNIT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.CALLABLEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      case CodeModelPackage.CALLABLEUNIT_KIND_FEATURE_ID:
        return getTarget().getKind();
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
      case CodeModelPackage.CALLABLEUNIT_KIND_FEATURE_ID:
        getTarget().setKind((CallableKind) value);
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
   * The adapter/wrapper for the EClass '<em><b>MethodUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MethodUnitModelObject<E extends MethodUnit> extends ControlElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getMethodUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.METHODUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.METHODUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.METHODUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.METHODUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.METHODUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.METHODUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.METHODUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.METHODUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.METHODUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.METHODUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.METHODUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.METHODUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.METHODUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.METHODUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.METHODUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.METHODUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.METHODUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.METHODUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.METHODUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.METHODUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.METHODUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.METHODUNIT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.METHODUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      case CodeModelPackage.METHODUNIT_KIND_FEATURE_ID:
        return getTarget().getKind();
      case CodeModelPackage.METHODUNIT_EXPORT_FEATURE_ID:
        return getTarget().getExport();
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
      case CodeModelPackage.METHODUNIT_KIND_FEATURE_ID:
        getTarget().setKind((MethodKind) value);
        return;
      case CodeModelPackage.METHODUNIT_EXPORT_FEATURE_ID:
        getTarget().setExport((ExportKind) value);
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
   * The adapter/wrapper for the EClass '<em><b>DataElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DataElementModelObject<E extends DataElement> extends ComputationalObjectModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getDataElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.DATAELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.DATAELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.DATAELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.DATAELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.DATAELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.DATAELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.DATAELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.DATAELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.DATAELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.DATAELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.DATAELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.DATAELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.DATAELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.DATAELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.DATAELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.DATAELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.DATAELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.DATAELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.DATAELEMENT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.DATAELEMENT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.DATAELEMENT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.DATAELEMENT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.DATAELEMENT_EXT_FEATURE_ID:
        return getTarget().getExt();
      case CodeModelPackage.DATAELEMENT_SIZE_FEATURE_ID:
        return getTarget().getSize();
      case CodeModelPackage.DATAELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
      case CodeModelPackage.DATAELEMENT_TYPE_FEATURE_ID:
        getTarget().setType((Datatype) value);
        return;
      case CodeModelPackage.DATAELEMENT_EXT_FEATURE_ID:
        getTarget().setExt((String) value);
        return;
      case CodeModelPackage.DATAELEMENT_SIZE_FEATURE_ID:
        getTarget().setSize((Integer) value);
        return;
      case CodeModelPackage.DATAELEMENT_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((Set<Datatype>) value);
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

      case CodeModelPackage.DATAELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((Datatype) value);
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

      case CodeModelPackage.DATAELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((Datatype) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>StorableUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class StorableUnitModelObject<E extends StorableUnit> extends DataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getStorableUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.STORABLEUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.STORABLEUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.STORABLEUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.STORABLEUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.STORABLEUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.STORABLEUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.STORABLEUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.STORABLEUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.STORABLEUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.STORABLEUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.STORABLEUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.STORABLEUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.STORABLEUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.STORABLEUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.STORABLEUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.STORABLEUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.STORABLEUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.STORABLEUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.STORABLEUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.STORABLEUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.STORABLEUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.STORABLEUNIT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.STORABLEUNIT_EXT_FEATURE_ID:
        return getTarget().getExt();
      case CodeModelPackage.STORABLEUNIT_SIZE_FEATURE_ID:
        return getTarget().getSize();
      case CodeModelPackage.STORABLEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      case CodeModelPackage.STORABLEUNIT_KIND_FEATURE_ID:
        return getTarget().getKind();
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
      case CodeModelPackage.STORABLEUNIT_KIND_FEATURE_ID:
        getTarget().setKind((StorableKind) value);
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
   * The adapter/wrapper for the EClass '<em><b>ItemUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ItemUnitModelObject<E extends ItemUnit> extends DataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getItemUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.ITEMUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.ITEMUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.ITEMUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.ITEMUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.ITEMUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.ITEMUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.ITEMUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.ITEMUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.ITEMUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.ITEMUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.ITEMUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.ITEMUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.ITEMUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.ITEMUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.ITEMUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.ITEMUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.ITEMUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.ITEMUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.ITEMUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.ITEMUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.ITEMUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.ITEMUNIT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.ITEMUNIT_EXT_FEATURE_ID:
        return getTarget().getExt();
      case CodeModelPackage.ITEMUNIT_SIZE_FEATURE_ID:
        return getTarget().getSize();
      case CodeModelPackage.ITEMUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
   * The adapter/wrapper for the EClass '<em><b>IndexUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class IndexUnitModelObject<E extends IndexUnit> extends DataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getIndexUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.INDEXUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.INDEXUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.INDEXUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.INDEXUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.INDEXUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.INDEXUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.INDEXUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.INDEXUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.INDEXUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.INDEXUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.INDEXUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.INDEXUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.INDEXUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.INDEXUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.INDEXUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.INDEXUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.INDEXUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.INDEXUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.INDEXUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.INDEXUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.INDEXUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.INDEXUNIT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.INDEXUNIT_EXT_FEATURE_ID:
        return getTarget().getExt();
      case CodeModelPackage.INDEXUNIT_SIZE_FEATURE_ID:
        return getTarget().getSize();
      case CodeModelPackage.INDEXUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
   * The adapter/wrapper for the EClass '<em><b>MemberUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MemberUnitModelObject<E extends MemberUnit> extends DataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getMemberUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.MEMBERUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.MEMBERUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.MEMBERUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.MEMBERUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.MEMBERUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.MEMBERUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.MEMBERUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.MEMBERUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.MEMBERUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.MEMBERUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.MEMBERUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.MEMBERUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.MEMBERUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.MEMBERUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.MEMBERUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.MEMBERUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.MEMBERUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.MEMBERUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.MEMBERUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.MEMBERUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.MEMBERUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.MEMBERUNIT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.MEMBERUNIT_EXT_FEATURE_ID:
        return getTarget().getExt();
      case CodeModelPackage.MEMBERUNIT_SIZE_FEATURE_ID:
        return getTarget().getSize();
      case CodeModelPackage.MEMBERUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      case CodeModelPackage.MEMBERUNIT_EXPORT_FEATURE_ID:
        return getTarget().getExport();
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
      case CodeModelPackage.MEMBERUNIT_EXPORT_FEATURE_ID:
        getTarget().setExport((ExportKind) value);
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
   * The adapter/wrapper for the EClass '<em><b>ParameterUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ParameterUnitModelObject<E extends ParameterUnit> extends DataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getParameterUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.PARAMETERUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.PARAMETERUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.PARAMETERUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.PARAMETERUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.PARAMETERUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.PARAMETERUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.PARAMETERUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.PARAMETERUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.PARAMETERUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.PARAMETERUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.PARAMETERUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.PARAMETERUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.PARAMETERUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.PARAMETERUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.PARAMETERUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.PARAMETERUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.PARAMETERUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.PARAMETERUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.PARAMETERUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.PARAMETERUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.PARAMETERUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.PARAMETERUNIT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.PARAMETERUNIT_EXT_FEATURE_ID:
        return getTarget().getExt();
      case CodeModelPackage.PARAMETERUNIT_SIZE_FEATURE_ID:
        return getTarget().getSize();
      case CodeModelPackage.PARAMETERUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      case CodeModelPackage.PARAMETERUNIT_KIND_FEATURE_ID:
        return getTarget().getKind();
      case CodeModelPackage.PARAMETERUNIT_POS_FEATURE_ID:
        return getTarget().getPos();
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
      case CodeModelPackage.PARAMETERUNIT_KIND_FEATURE_ID:
        getTarget().setKind((ParameterKind) value);
        return;
      case CodeModelPackage.PARAMETERUNIT_POS_FEATURE_ID:
        getTarget().setPos((Integer) value);
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
   * The adapter/wrapper for the EClass '<em><b>ValueElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ValueElementModelObject<E extends ValueElement> extends DataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getValueElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.VALUEELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.VALUEELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.VALUEELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.VALUEELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.VALUEELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.VALUEELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.VALUEELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.VALUEELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.VALUEELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.VALUEELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.VALUEELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.VALUEELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.VALUEELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.VALUEELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.VALUEELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.VALUEELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.VALUEELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.VALUEELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.VALUEELEMENT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.VALUEELEMENT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.VALUEELEMENT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.VALUEELEMENT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.VALUEELEMENT_EXT_FEATURE_ID:
        return getTarget().getExt();
      case CodeModelPackage.VALUEELEMENT_SIZE_FEATURE_ID:
        return getTarget().getSize();
      case CodeModelPackage.VALUEELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
   * The adapter/wrapper for the EClass '<em><b>Value</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ValueModelObject<E extends Value> extends ValueElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getValueEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.VALUE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.VALUE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.VALUE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.VALUE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.VALUE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.VALUE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.VALUE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.VALUE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.VALUE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.VALUE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.VALUE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.VALUE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.VALUE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.VALUE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.VALUE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.VALUE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.VALUE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.VALUE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.VALUE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.VALUE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.VALUE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.VALUE_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.VALUE_EXT_FEATURE_ID:
        return getTarget().getExt();
      case CodeModelPackage.VALUE_SIZE_FEATURE_ID:
        return getTarget().getSize();
      case CodeModelPackage.VALUE_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
   * The adapter/wrapper for the EClass '<em><b>ValueList</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ValueListModelObject<E extends ValueList> extends ValueElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getValueListEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.VALUELIST_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.VALUELIST_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.VALUELIST_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.VALUELIST_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.VALUELIST_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.VALUELIST_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.VALUELIST_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.VALUELIST_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.VALUELIST_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.VALUELIST_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.VALUELIST_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.VALUELIST_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.VALUELIST_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.VALUELIST_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.VALUELIST_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.VALUELIST_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.VALUELIST_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.VALUELIST_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.VALUELIST_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.VALUELIST_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.VALUELIST_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.VALUELIST_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.VALUELIST_EXT_FEATURE_ID:
        return getTarget().getExt();
      case CodeModelPackage.VALUELIST_SIZE_FEATURE_ID:
        return getTarget().getSize();
      case CodeModelPackage.VALUELIST_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      case CodeModelPackage.VALUELIST_VALUEELEMENT_FEATURE_ID:
        return getTarget().getValueElement();
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
      case CodeModelPackage.VALUELIST_VALUEELEMENT_FEATURE_ID:
        getTarget().setValueElement((List<ValueElement>) value);
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

      case CodeModelPackage.VALUELIST_VALUEELEMENT_FEATURE_ID:
        return getTarget().addToValueElement((ValueElement) value);
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

      case CodeModelPackage.VALUELIST_VALUEELEMENT_FEATURE_ID:
        return getTarget().removeFromValueElement((ValueElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>PrimitiveType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PrimitiveTypeModelObject<E extends PrimitiveType> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getPrimitiveTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.PRIMITIVETYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.PRIMITIVETYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.PRIMITIVETYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.PRIMITIVETYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.PRIMITIVETYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.PRIMITIVETYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.PRIMITIVETYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.PRIMITIVETYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.PRIMITIVETYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.PRIMITIVETYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.PRIMITIVETYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.PRIMITIVETYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.PRIMITIVETYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.PRIMITIVETYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.PRIMITIVETYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.PRIMITIVETYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.PRIMITIVETYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.PRIMITIVETYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.PRIMITIVETYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.PRIMITIVETYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.PRIMITIVETYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>BooleanType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BooleanTypeModelObject<E extends BooleanType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getBooleanTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.BOOLEANTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.BOOLEANTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.BOOLEANTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.BOOLEANTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.BOOLEANTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.BOOLEANTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.BOOLEANTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.BOOLEANTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.BOOLEANTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.BOOLEANTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.BOOLEANTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.BOOLEANTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.BOOLEANTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.BOOLEANTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.BOOLEANTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.BOOLEANTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.BOOLEANTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.BOOLEANTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.BOOLEANTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.BOOLEANTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.BOOLEANTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>CharType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CharTypeModelObject<E extends CharType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCharTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CHARTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.CHARTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.CHARTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.CHARTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.CHARTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.CHARTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.CHARTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.CHARTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.CHARTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.CHARTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.CHARTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.CHARTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.CHARTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.CHARTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.CHARTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.CHARTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.CHARTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.CHARTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.CHARTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.CHARTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.CHARTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>OrdinalType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class OrdinalTypeModelObject<E extends OrdinalType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getOrdinalTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.ORDINALTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.ORDINALTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.ORDINALTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.ORDINALTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.ORDINALTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.ORDINALTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.ORDINALTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.ORDINALTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.ORDINALTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.ORDINALTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.ORDINALTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.ORDINALTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.ORDINALTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.ORDINALTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.ORDINALTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.ORDINALTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.ORDINALTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.ORDINALTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.ORDINALTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.ORDINALTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.ORDINALTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>DateType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DateTypeModelObject<E extends DateType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getDateTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.DATETYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.DATETYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.DATETYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.DATETYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.DATETYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.DATETYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.DATETYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.DATETYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.DATETYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.DATETYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.DATETYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.DATETYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.DATETYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.DATETYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.DATETYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.DATETYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.DATETYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.DATETYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.DATETYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.DATETYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.DATETYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>TimeType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TimeTypeModelObject<E extends TimeType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getTimeTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.TIMETYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.TIMETYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.TIMETYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.TIMETYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.TIMETYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.TIMETYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.TIMETYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.TIMETYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.TIMETYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.TIMETYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.TIMETYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.TIMETYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.TIMETYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.TIMETYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.TIMETYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.TIMETYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.TIMETYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.TIMETYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.TIMETYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.TIMETYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.TIMETYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>IntegerType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class IntegerTypeModelObject<E extends IntegerType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getIntegerTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.INTEGERTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.INTEGERTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.INTEGERTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.INTEGERTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.INTEGERTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.INTEGERTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.INTEGERTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.INTEGERTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.INTEGERTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.INTEGERTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.INTEGERTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.INTEGERTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.INTEGERTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.INTEGERTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.INTEGERTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.INTEGERTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.INTEGERTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.INTEGERTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.INTEGERTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.INTEGERTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.INTEGERTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>DecimalType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DecimalTypeModelObject<E extends DecimalType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getDecimalTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.DECIMALTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.DECIMALTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.DECIMALTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.DECIMALTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.DECIMALTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.DECIMALTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.DECIMALTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.DECIMALTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.DECIMALTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.DECIMALTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.DECIMALTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.DECIMALTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.DECIMALTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.DECIMALTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.DECIMALTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.DECIMALTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.DECIMALTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.DECIMALTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.DECIMALTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.DECIMALTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.DECIMALTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>ScaledType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ScaledTypeModelObject<E extends ScaledType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getScaledTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.SCALEDTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.SCALEDTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.SCALEDTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.SCALEDTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.SCALEDTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.SCALEDTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.SCALEDTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.SCALEDTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.SCALEDTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.SCALEDTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.SCALEDTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.SCALEDTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.SCALEDTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.SCALEDTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.SCALEDTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.SCALEDTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.SCALEDTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.SCALEDTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.SCALEDTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.SCALEDTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.SCALEDTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>FloatType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class FloatTypeModelObject<E extends FloatType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getFloatTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.FLOATTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.FLOATTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.FLOATTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.FLOATTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.FLOATTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.FLOATTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.FLOATTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.FLOATTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.FLOATTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.FLOATTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.FLOATTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.FLOATTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.FLOATTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.FLOATTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.FLOATTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.FLOATTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.FLOATTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.FLOATTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.FLOATTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.FLOATTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.FLOATTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>VoidType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class VoidTypeModelObject<E extends VoidType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getVoidTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.VOIDTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.VOIDTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.VOIDTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.VOIDTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.VOIDTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.VOIDTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.VOIDTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.VOIDTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.VOIDTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.VOIDTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.VOIDTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.VOIDTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.VOIDTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.VOIDTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.VOIDTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.VOIDTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.VOIDTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.VOIDTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.VOIDTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.VOIDTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.VOIDTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>StringType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class StringTypeModelObject<E extends StringType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getStringTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.STRINGTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.STRINGTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.STRINGTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.STRINGTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.STRINGTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.STRINGTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.STRINGTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.STRINGTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.STRINGTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.STRINGTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.STRINGTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.STRINGTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.STRINGTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.STRINGTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.STRINGTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.STRINGTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.STRINGTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.STRINGTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.STRINGTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.STRINGTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.STRINGTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>BitType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BitTypeModelObject<E extends BitType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getBitTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.BITTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.BITTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.BITTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.BITTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.BITTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.BITTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.BITTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.BITTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.BITTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.BITTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.BITTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.BITTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.BITTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.BITTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.BITTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.BITTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.BITTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.BITTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.BITTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.BITTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.BITTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>BitstringType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BitstringTypeModelObject<E extends BitstringType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getBitstringTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.BITSTRINGTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.BITSTRINGTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.BITSTRINGTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.BITSTRINGTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.BITSTRINGTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.BITSTRINGTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.BITSTRINGTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.BITSTRINGTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.BITSTRINGTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.BITSTRINGTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.BITSTRINGTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.BITSTRINGTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.BITSTRINGTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.BITSTRINGTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.BITSTRINGTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.BITSTRINGTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.BITSTRINGTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.BITSTRINGTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.BITSTRINGTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.BITSTRINGTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.BITSTRINGTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>OctetType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class OctetTypeModelObject<E extends OctetType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getOctetTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.OCTETTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.OCTETTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.OCTETTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.OCTETTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.OCTETTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.OCTETTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.OCTETTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.OCTETTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.OCTETTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.OCTETTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.OCTETTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.OCTETTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.OCTETTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.OCTETTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.OCTETTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.OCTETTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.OCTETTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.OCTETTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.OCTETTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.OCTETTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.OCTETTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>OctetstringType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class OctetstringTypeModelObject<E extends OctetstringType> extends PrimitiveTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getOctetstringTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.OCTETSTRINGTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.OCTETSTRINGTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.OCTETSTRINGTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.OCTETSTRINGTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.OCTETSTRINGTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.OCTETSTRINGTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.OCTETSTRINGTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.OCTETSTRINGTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.OCTETSTRINGTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.OCTETSTRINGTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.OCTETSTRINGTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.OCTETSTRINGTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.OCTETSTRINGTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.OCTETSTRINGTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.OCTETSTRINGTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.OCTETSTRINGTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.OCTETSTRINGTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.OCTETSTRINGTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.OCTETSTRINGTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.OCTETSTRINGTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.OCTETSTRINGTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>EnumeratedType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EnumeratedTypeModelObject<E extends EnumeratedType> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getEnumeratedTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.ENUMERATEDTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.ENUMERATEDTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.ENUMERATEDTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.ENUMERATEDTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.ENUMERATEDTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.ENUMERATEDTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.ENUMERATEDTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.ENUMERATEDTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.ENUMERATEDTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.ENUMERATEDTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.ENUMERATEDTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.ENUMERATEDTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.ENUMERATEDTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.ENUMERATEDTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.ENUMERATEDTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.ENUMERATEDTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.ENUMERATEDTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.ENUMERATEDTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.ENUMERATEDTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.ENUMERATEDTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.ENUMERATEDTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.ENUMERATEDTYPE_VALUE_FEATURE_ID:
        return getTarget().getValue();
      case CodeModelPackage.ENUMERATEDTYPE_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
      case CodeModelPackage.ENUMERATEDTYPE_VALUE_FEATURE_ID:
        getTarget().setValue((List<Value>) value);
        return;
      case CodeModelPackage.ENUMERATEDTYPE_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((List<CodeItem>) value);
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

      case CodeModelPackage.ENUMERATEDTYPE_VALUE_FEATURE_ID:
        return getTarget().addToValue((Value) value);

      case CodeModelPackage.ENUMERATEDTYPE_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((CodeItem) value);
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

      case CodeModelPackage.ENUMERATEDTYPE_VALUE_FEATURE_ID:
        return getTarget().removeFromValue((Value) value);

      case CodeModelPackage.ENUMERATEDTYPE_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((CodeItem) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CompositeType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CompositeTypeModelObject<E extends CompositeType> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCompositeTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.COMPOSITETYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.COMPOSITETYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.COMPOSITETYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.COMPOSITETYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.COMPOSITETYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.COMPOSITETYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.COMPOSITETYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.COMPOSITETYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.COMPOSITETYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.COMPOSITETYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.COMPOSITETYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.COMPOSITETYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.COMPOSITETYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.COMPOSITETYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.COMPOSITETYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.COMPOSITETYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.COMPOSITETYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.COMPOSITETYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.COMPOSITETYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.COMPOSITETYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.COMPOSITETYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.COMPOSITETYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
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
      case CodeModelPackage.COMPOSITETYPE_ITEMUNIT_FEATURE_ID:
        getTarget().setItemUnit((List<ItemUnit>) value);
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

      case CodeModelPackage.COMPOSITETYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().addToItemUnit((ItemUnit) value);
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

      case CodeModelPackage.COMPOSITETYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().removeFromItemUnit((ItemUnit) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ChoiceType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ChoiceTypeModelObject<E extends ChoiceType> extends CompositeTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getChoiceTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CHOICETYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.CHOICETYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.CHOICETYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.CHOICETYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.CHOICETYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.CHOICETYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.CHOICETYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.CHOICETYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.CHOICETYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.CHOICETYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.CHOICETYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.CHOICETYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.CHOICETYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.CHOICETYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.CHOICETYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.CHOICETYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.CHOICETYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.CHOICETYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.CHOICETYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.CHOICETYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.CHOICETYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.CHOICETYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
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
   * The adapter/wrapper for the EClass '<em><b>RecordType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RecordTypeModelObject<E extends RecordType> extends CompositeTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getRecordTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.RECORDTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.RECORDTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.RECORDTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.RECORDTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.RECORDTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.RECORDTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.RECORDTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.RECORDTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.RECORDTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.RECORDTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.RECORDTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.RECORDTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.RECORDTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.RECORDTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.RECORDTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.RECORDTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.RECORDTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.RECORDTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.RECORDTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.RECORDTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.RECORDTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.RECORDTYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
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
   * The adapter/wrapper for the EClass '<em><b>DerivedType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DerivedTypeModelObject<E extends DerivedType> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getDerivedTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.DERIVEDTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.DERIVEDTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.DERIVEDTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.DERIVEDTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.DERIVEDTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.DERIVEDTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.DERIVEDTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.DERIVEDTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.DERIVEDTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.DERIVEDTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.DERIVEDTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.DERIVEDTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.DERIVEDTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.DERIVEDTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.DERIVEDTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.DERIVEDTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.DERIVEDTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.DERIVEDTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.DERIVEDTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.DERIVEDTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.DERIVEDTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.DERIVEDTYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
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
      case CodeModelPackage.DERIVEDTYPE_ITEMUNIT_FEATURE_ID:
        getTarget().setItemUnit((ItemUnit) value);
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
   * The adapter/wrapper for the EClass '<em><b>ArrayType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ArrayTypeModelObject<E extends ArrayType> extends DerivedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getArrayTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.ARRAYTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.ARRAYTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.ARRAYTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.ARRAYTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.ARRAYTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.ARRAYTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.ARRAYTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.ARRAYTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.ARRAYTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.ARRAYTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.ARRAYTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.ARRAYTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.ARRAYTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.ARRAYTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.ARRAYTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.ARRAYTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.ARRAYTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.ARRAYTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.ARRAYTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.ARRAYTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.ARRAYTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.ARRAYTYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
      case CodeModelPackage.ARRAYTYPE_SIZE_FEATURE_ID:
        return getTarget().getSize();
      case CodeModelPackage.ARRAYTYPE_INDEXUNIT_FEATURE_ID:
        return getTarget().getIndexUnit();
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
      case CodeModelPackage.ARRAYTYPE_SIZE_FEATURE_ID:
        getTarget().setSize((Integer) value);
        return;
      case CodeModelPackage.ARRAYTYPE_INDEXUNIT_FEATURE_ID:
        getTarget().setIndexUnit((IndexUnit) value);
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
   * The adapter/wrapper for the EClass '<em><b>PointerType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PointerTypeModelObject<E extends PointerType> extends DerivedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getPointerTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.POINTERTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.POINTERTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.POINTERTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.POINTERTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.POINTERTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.POINTERTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.POINTERTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.POINTERTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.POINTERTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.POINTERTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.POINTERTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.POINTERTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.POINTERTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.POINTERTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.POINTERTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.POINTERTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.POINTERTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.POINTERTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.POINTERTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.POINTERTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.POINTERTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.POINTERTYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
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
   * The adapter/wrapper for the EClass '<em><b>RangeType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RangeTypeModelObject<E extends RangeType> extends DerivedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getRangeTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.RANGETYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.RANGETYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.RANGETYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.RANGETYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.RANGETYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.RANGETYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.RANGETYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.RANGETYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.RANGETYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.RANGETYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.RANGETYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.RANGETYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.RANGETYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.RANGETYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.RANGETYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.RANGETYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.RANGETYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.RANGETYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.RANGETYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.RANGETYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.RANGETYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.RANGETYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
      case CodeModelPackage.RANGETYPE_LOWER_FEATURE_ID:
        return getTarget().getLower();
      case CodeModelPackage.RANGETYPE_UPPER_FEATURE_ID:
        return getTarget().getUpper();
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
      case CodeModelPackage.RANGETYPE_LOWER_FEATURE_ID:
        getTarget().setLower((Integer) value);
        return;
      case CodeModelPackage.RANGETYPE_UPPER_FEATURE_ID:
        getTarget().setUpper((Integer) value);
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
   * The adapter/wrapper for the EClass '<em><b>BagType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BagTypeModelObject<E extends BagType> extends DerivedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getBagTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.BAGTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.BAGTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.BAGTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.BAGTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.BAGTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.BAGTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.BAGTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.BAGTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.BAGTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.BAGTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.BAGTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.BAGTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.BAGTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.BAGTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.BAGTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.BAGTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.BAGTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.BAGTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.BAGTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.BAGTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.BAGTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.BAGTYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
      case CodeModelPackage.BAGTYPE_SIZE_FEATURE_ID:
        return getTarget().getSize();
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
      case CodeModelPackage.BAGTYPE_SIZE_FEATURE_ID:
        getTarget().setSize((Integer) value);
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
   * The adapter/wrapper for the EClass '<em><b>SetType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SetTypeModelObject<E extends SetType> extends DerivedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getSetTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.SETTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.SETTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.SETTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.SETTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.SETTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.SETTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.SETTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.SETTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.SETTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.SETTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.SETTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.SETTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.SETTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.SETTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.SETTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.SETTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.SETTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.SETTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.SETTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.SETTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.SETTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.SETTYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
      case CodeModelPackage.SETTYPE_SIZE_FEATURE_ID:
        return getTarget().getSize();
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
      case CodeModelPackage.SETTYPE_SIZE_FEATURE_ID:
        getTarget().setSize((Integer) value);
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
   * The adapter/wrapper for the EClass '<em><b>SequenceType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SequenceTypeModelObject<E extends SequenceType> extends DerivedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getSequenceTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.SEQUENCETYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.SEQUENCETYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.SEQUENCETYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.SEQUENCETYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.SEQUENCETYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.SEQUENCETYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.SEQUENCETYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.SEQUENCETYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.SEQUENCETYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.SEQUENCETYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.SEQUENCETYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.SEQUENCETYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.SEQUENCETYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.SEQUENCETYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.SEQUENCETYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.SEQUENCETYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.SEQUENCETYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.SEQUENCETYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.SEQUENCETYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.SEQUENCETYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.SEQUENCETYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.SEQUENCETYPE_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
      case CodeModelPackage.SEQUENCETYPE_SIZE_FEATURE_ID:
        return getTarget().getSize();
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
      case CodeModelPackage.SEQUENCETYPE_SIZE_FEATURE_ID:
        getTarget().setSize((Integer) value);
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
   * The adapter/wrapper for the EClass '<em><b>Signature</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SignatureModelObject<E extends Signature> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getSignatureEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.SIGNATURE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.SIGNATURE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.SIGNATURE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.SIGNATURE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.SIGNATURE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.SIGNATURE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.SIGNATURE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.SIGNATURE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.SIGNATURE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.SIGNATURE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.SIGNATURE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.SIGNATURE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.SIGNATURE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.SIGNATURE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.SIGNATURE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.SIGNATURE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.SIGNATURE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.SIGNATURE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.SIGNATURE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.SIGNATURE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.SIGNATURE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.SIGNATURE_PARAMETERUNIT_FEATURE_ID:
        return getTarget().getParameterUnit();
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
      case CodeModelPackage.SIGNATURE_PARAMETERUNIT_FEATURE_ID:
        getTarget().setParameterUnit((List<ParameterUnit>) value);
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

      case CodeModelPackage.SIGNATURE_PARAMETERUNIT_FEATURE_ID:
        return getTarget().addToParameterUnit((ParameterUnit) value);
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

      case CodeModelPackage.SIGNATURE_PARAMETERUNIT_FEATURE_ID:
        return getTarget().removeFromParameterUnit((ParameterUnit) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>DefinedType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DefinedTypeModelObject<E extends DefinedType> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getDefinedTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.DEFINEDTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.DEFINEDTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.DEFINEDTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.DEFINEDTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.DEFINEDTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.DEFINEDTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.DEFINEDTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.DEFINEDTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.DEFINEDTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.DEFINEDTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.DEFINEDTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.DEFINEDTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.DEFINEDTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.DEFINEDTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.DEFINEDTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.DEFINEDTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.DEFINEDTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.DEFINEDTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.DEFINEDTYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.DEFINEDTYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.DEFINEDTYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.DEFINEDTYPE_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.DEFINEDTYPE_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
      case CodeModelPackage.DEFINEDTYPE_TYPE_FEATURE_ID:
        getTarget().setType((Datatype) value);
        return;
      case CodeModelPackage.DEFINEDTYPE_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((Datatype) value);
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
   * The adapter/wrapper for the EClass '<em><b>TypeUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TypeUnitModelObject<E extends TypeUnit> extends DefinedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getTypeUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.TYPEUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.TYPEUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.TYPEUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.TYPEUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.TYPEUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.TYPEUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.TYPEUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.TYPEUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.TYPEUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.TYPEUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.TYPEUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.TYPEUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.TYPEUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.TYPEUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.TYPEUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.TYPEUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.TYPEUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.TYPEUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.TYPEUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.TYPEUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.TYPEUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.TYPEUNIT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.TYPEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
   * The adapter/wrapper for the EClass '<em><b>SynonymUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SynonymUnitModelObject<E extends SynonymUnit> extends DefinedTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getSynonymUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.SYNONYMUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.SYNONYMUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.SYNONYMUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.SYNONYMUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.SYNONYMUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.SYNONYMUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.SYNONYMUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.SYNONYMUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.SYNONYMUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.SYNONYMUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.SYNONYMUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.SYNONYMUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.SYNONYMUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.SYNONYMUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.SYNONYMUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.SYNONYMUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.SYNONYMUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.SYNONYMUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.SYNONYMUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.SYNONYMUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.SYNONYMUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.SYNONYMUNIT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case CodeModelPackage.SYNONYMUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
   * The adapter/wrapper for the EClass '<em><b>ClassUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ClassUnitModelObject<E extends ClassUnit> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getClassUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CLASSUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.CLASSUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.CLASSUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.CLASSUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.CLASSUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.CLASSUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.CLASSUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.CLASSUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.CLASSUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.CLASSUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.CLASSUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.CLASSUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.CLASSUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.CLASSUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.CLASSUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.CLASSUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.CLASSUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.CLASSUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.CLASSUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.CLASSUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.CLASSUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.CLASSUNIT_ISABSTRACT_FEATURE_ID:
        return getTarget().getIsAbstract();
      case CodeModelPackage.CLASSUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
      case CodeModelPackage.CLASSUNIT_ISABSTRACT_FEATURE_ID:
        getTarget().setIsAbstract((Boolean) value);
        return;
      case CodeModelPackage.CLASSUNIT_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((List<CodeItem>) value);
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

      case CodeModelPackage.CLASSUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((CodeItem) value);
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

      case CodeModelPackage.CLASSUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((CodeItem) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>InterfaceUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InterfaceUnitModelObject<E extends InterfaceUnit> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getInterfaceUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.INTERFACEUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.INTERFACEUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.INTERFACEUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.INTERFACEUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.INTERFACEUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.INTERFACEUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.INTERFACEUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.INTERFACEUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.INTERFACEUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.INTERFACEUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.INTERFACEUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.INTERFACEUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.INTERFACEUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.INTERFACEUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.INTERFACEUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.INTERFACEUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.INTERFACEUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.INTERFACEUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.INTERFACEUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.INTERFACEUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.INTERFACEUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.INTERFACEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
      case CodeModelPackage.INTERFACEUNIT_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((List<CodeItem>) value);
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

      case CodeModelPackage.INTERFACEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((CodeItem) value);
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

      case CodeModelPackage.INTERFACEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((CodeItem) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>TemplateUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TemplateUnitModelObject<E extends TemplateUnit> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getTemplateUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.TEMPLATEUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.TEMPLATEUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.TEMPLATEUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.TEMPLATEUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.TEMPLATEUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.TEMPLATEUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.TEMPLATEUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.TEMPLATEUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.TEMPLATEUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.TEMPLATEUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.TEMPLATEUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.TEMPLATEUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.TEMPLATEUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.TEMPLATEUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.TEMPLATEUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.TEMPLATEUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.TEMPLATEUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.TEMPLATEUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.TEMPLATEUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.TEMPLATEUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.TEMPLATEUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.TEMPLATEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
      case CodeModelPackage.TEMPLATEUNIT_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((List<CodeItem>) value);
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

      case CodeModelPackage.TEMPLATEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((CodeItem) value);
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

      case CodeModelPackage.TEMPLATEUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((CodeItem) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>TemplateParameter</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TemplateParameterModelObject<E extends TemplateParameter> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getTemplateParameterEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.TEMPLATEPARAMETER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.TEMPLATEPARAMETER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.TEMPLATEPARAMETER_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.TEMPLATEPARAMETER_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.TEMPLATEPARAMETER_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.TEMPLATEPARAMETER_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.TEMPLATEPARAMETER_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.TEMPLATEPARAMETER_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.TEMPLATEPARAMETER_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.TEMPLATEPARAMETER_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.TEMPLATEPARAMETER_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.TEMPLATEPARAMETER_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.TEMPLATEPARAMETER_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.TEMPLATEPARAMETER_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.TEMPLATEPARAMETER_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.TEMPLATEPARAMETER_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.TEMPLATEPARAMETER_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.TEMPLATEPARAMETER_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.TEMPLATEPARAMETER_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.TEMPLATEPARAMETER_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.TEMPLATEPARAMETER_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>TemplateType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TemplateTypeModelObject<E extends TemplateType> extends DatatypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getTemplateTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.TEMPLATETYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.TEMPLATETYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.TEMPLATETYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.TEMPLATETYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.TEMPLATETYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.TEMPLATETYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.TEMPLATETYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.TEMPLATETYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.TEMPLATETYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.TEMPLATETYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.TEMPLATETYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.TEMPLATETYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.TEMPLATETYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.TEMPLATETYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.TEMPLATETYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.TEMPLATETYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.TEMPLATETYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.TEMPLATETYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.TEMPLATETYPE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.TEMPLATETYPE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.TEMPLATETYPE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>InstanceOf</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InstanceOfModelObject<E extends InstanceOf> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getInstanceOfEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.INSTANCEOF_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.INSTANCEOF_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.INSTANCEOF_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.INSTANCEOF_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.INSTANCEOF_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.INSTANCEOF_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.INSTANCEOF_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.INSTANCEOF_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case CodeModelPackage.INSTANCEOF_TO_FEATURE_ID:
        getTarget().setTo((TemplateUnit) value);
        return;
      case CodeModelPackage.INSTANCEOF_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractCodeElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>ParameterTo</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ParameterToModelObject<E extends ParameterTo> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getParameterToEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.PARAMETERTO_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.PARAMETERTO_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.PARAMETERTO_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.PARAMETERTO_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.PARAMETERTO_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.PARAMETERTO_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.PARAMETERTO_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.PARAMETERTO_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case CodeModelPackage.PARAMETERTO_TO_FEATURE_ID:
        getTarget().setTo((CodeItem) value);
        return;
      case CodeModelPackage.PARAMETERTO_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractCodeElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>Implements</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ImplementsModelObject<E extends Implements> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getImplementsEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.IMPLEMENTS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.IMPLEMENTS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.IMPLEMENTS_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.IMPLEMENTS_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.IMPLEMENTS_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.IMPLEMENTS_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.IMPLEMENTS_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.IMPLEMENTS_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case CodeModelPackage.IMPLEMENTS_TO_FEATURE_ID:
        getTarget().setTo((CodeItem) value);
        return;
      case CodeModelPackage.IMPLEMENTS_FROM_FEATURE_ID:
        getTarget().setFrom((CodeItem) value);
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
   * The adapter/wrapper for the EClass '<em><b>ImplementationOf</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ImplementationOfModelObject<E extends ImplementationOf> extends
      AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getImplementationOfEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.IMPLEMENTATIONOF_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.IMPLEMENTATIONOF_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.IMPLEMENTATIONOF_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.IMPLEMENTATIONOF_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.IMPLEMENTATIONOF_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.IMPLEMENTATIONOF_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.IMPLEMENTATIONOF_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.IMPLEMENTATIONOF_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case CodeModelPackage.IMPLEMENTATIONOF_TO_FEATURE_ID:
        getTarget().setTo((CodeItem) value);
        return;
      case CodeModelPackage.IMPLEMENTATIONOF_FROM_FEATURE_ID:
        getTarget().setFrom((CodeItem) value);
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
   * The adapter/wrapper for the EClass '<em><b>HasType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class HasTypeModelObject<E extends HasType> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getHasTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.HASTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.HASTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.HASTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.HASTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.HASTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.HASTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.HASTYPE_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.HASTYPE_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case CodeModelPackage.HASTYPE_TO_FEATURE_ID:
        getTarget().setTo((Datatype) value);
        return;
      case CodeModelPackage.HASTYPE_FROM_FEATURE_ID:
        getTarget().setFrom((CodeItem) value);
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
   * The adapter/wrapper for the EClass '<em><b>HasValue</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class HasValueModelObject<E extends HasValue> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getHasValueEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.HASVALUE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.HASVALUE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.HASVALUE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.HASVALUE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.HASVALUE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.HASVALUE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.HASVALUE_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.HASVALUE_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case CodeModelPackage.HASVALUE_TO_FEATURE_ID:
        getTarget().setTo((AbstractCodeElement) value);
        return;
      case CodeModelPackage.HASVALUE_FROM_FEATURE_ID:
        getTarget().setFrom((CodeItem) value);
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
   * The adapter/wrapper for the EClass '<em><b>Extends</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ExtendsModelObject<E extends Extends> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getExtendsEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.EXTENDS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.EXTENDS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.EXTENDS_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.EXTENDS_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.EXTENDS_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.EXTENDS_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.EXTENDS_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.EXTENDS_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case CodeModelPackage.EXTENDS_TO_FEATURE_ID:
        getTarget().setTo((Datatype) value);
        return;
      case CodeModelPackage.EXTENDS_FROM_FEATURE_ID:
        getTarget().setFrom((Datatype) value);
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
   * The adapter/wrapper for the EClass '<em><b>PreprocessorDirective</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PreprocessorDirectiveModelObject<E extends PreprocessorDirective> extends
      AbstractCodeElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getPreprocessorDirectiveEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.PREPROCESSORDIRECTIVE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.PREPROCESSORDIRECTIVE_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
      case CodeModelPackage.PREPROCESSORDIRECTIVE_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((Set<AbstractCodeElement>) value);
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

      case CodeModelPackage.PREPROCESSORDIRECTIVE_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((AbstractCodeElement) value);
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

      case CodeModelPackage.PREPROCESSORDIRECTIVE_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((AbstractCodeElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>MacroUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MacroUnitModelObject<E extends MacroUnit> extends PreprocessorDirectiveModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getMacroUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.MACROUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.MACROUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.MACROUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.MACROUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.MACROUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.MACROUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.MACROUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.MACROUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.MACROUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.MACROUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.MACROUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.MACROUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.MACROUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.MACROUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.MACROUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.MACROUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.MACROUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.MACROUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.MACROUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.MACROUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.MACROUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.MACROUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      case CodeModelPackage.MACROUNIT_KIND_FEATURE_ID:
        return getTarget().getKind();
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
      case CodeModelPackage.MACROUNIT_KIND_FEATURE_ID:
        getTarget().setKind((MacroKind) value);
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
   * The adapter/wrapper for the EClass '<em><b>MacroDirective</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MacroDirectiveModelObject<E extends MacroDirective> extends PreprocessorDirectiveModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getMacroDirectiveEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.MACRODIRECTIVE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.MACRODIRECTIVE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.MACRODIRECTIVE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.MACRODIRECTIVE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.MACRODIRECTIVE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.MACRODIRECTIVE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.MACRODIRECTIVE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.MACRODIRECTIVE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.MACRODIRECTIVE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.MACRODIRECTIVE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.MACRODIRECTIVE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.MACRODIRECTIVE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.MACRODIRECTIVE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.MACRODIRECTIVE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.MACRODIRECTIVE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.MACRODIRECTIVE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.MACRODIRECTIVE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.MACRODIRECTIVE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.MACRODIRECTIVE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.MACRODIRECTIVE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.MACRODIRECTIVE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.MACRODIRECTIVE_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
   * The adapter/wrapper for the EClass '<em><b>IncludeDirective</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class IncludeDirectiveModelObject<E extends IncludeDirective> extends
      PreprocessorDirectiveModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getIncludeDirectiveEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.INCLUDEDIRECTIVE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.INCLUDEDIRECTIVE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.INCLUDEDIRECTIVE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.INCLUDEDIRECTIVE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.INCLUDEDIRECTIVE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.INCLUDEDIRECTIVE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.INCLUDEDIRECTIVE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.INCLUDEDIRECTIVE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.INCLUDEDIRECTIVE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.INCLUDEDIRECTIVE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.INCLUDEDIRECTIVE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.INCLUDEDIRECTIVE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.INCLUDEDIRECTIVE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.INCLUDEDIRECTIVE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.INCLUDEDIRECTIVE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.INCLUDEDIRECTIVE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.INCLUDEDIRECTIVE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.INCLUDEDIRECTIVE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.INCLUDEDIRECTIVE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.INCLUDEDIRECTIVE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.INCLUDEDIRECTIVE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.INCLUDEDIRECTIVE_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
   * The adapter/wrapper for the EClass '<em><b>ConditionalDirective</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConditionalDirectiveModelObject<E extends ConditionalDirective> extends
      PreprocessorDirectiveModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getConditionalDirectiveEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CONDITIONALDIRECTIVE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.CONDITIONALDIRECTIVE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.CONDITIONALDIRECTIVE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.CONDITIONALDIRECTIVE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.CONDITIONALDIRECTIVE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.CONDITIONALDIRECTIVE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.CONDITIONALDIRECTIVE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.CONDITIONALDIRECTIVE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.CONDITIONALDIRECTIVE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.CONDITIONALDIRECTIVE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.CONDITIONALDIRECTIVE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.CONDITIONALDIRECTIVE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.CONDITIONALDIRECTIVE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.CONDITIONALDIRECTIVE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.CONDITIONALDIRECTIVE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.CONDITIONALDIRECTIVE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.CONDITIONALDIRECTIVE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.CONDITIONALDIRECTIVE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.CONDITIONALDIRECTIVE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.CONDITIONALDIRECTIVE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.CONDITIONALDIRECTIVE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.CONDITIONALDIRECTIVE_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
   * The adapter/wrapper for the EClass '<em><b>Expands</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ExpandsModelObject<E extends Expands> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getExpandsEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.EXPANDS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.EXPANDS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.EXPANDS_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.EXPANDS_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.EXPANDS_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.EXPANDS_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.EXPANDS_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.EXPANDS_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case CodeModelPackage.EXPANDS_TO_FEATURE_ID:
        getTarget().setTo((MacroUnit) value);
        return;
      case CodeModelPackage.EXPANDS_FROM_FEATURE_ID:
        getTarget().setFrom((PreprocessorDirective) value);
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
   * The adapter/wrapper for the EClass '<em><b>GeneratedFrom</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class GeneratedFromModelObject<E extends GeneratedFrom> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getGeneratedFromEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.GENERATEDFROM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.GENERATEDFROM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.GENERATEDFROM_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.GENERATEDFROM_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.GENERATEDFROM_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.GENERATEDFROM_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.GENERATEDFROM_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.GENERATEDFROM_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case CodeModelPackage.GENERATEDFROM_TO_FEATURE_ID:
        getTarget().setTo((PreprocessorDirective) value);
        return;
      case CodeModelPackage.GENERATEDFROM_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractCodeElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>Includes</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class IncludesModelObject<E extends Includes> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getIncludesEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.INCLUDES_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.INCLUDES_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.INCLUDES_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.INCLUDES_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.INCLUDES_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.INCLUDES_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.INCLUDES_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.INCLUDES_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case CodeModelPackage.INCLUDES_TO_FEATURE_ID:
        getTarget().setTo((AbstractCodeElement) value);
        return;
      case CodeModelPackage.INCLUDES_FROM_FEATURE_ID:
        getTarget().setFrom((PreprocessorDirective) value);
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
   * The adapter/wrapper for the EClass '<em><b>VariantTo</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class VariantToModelObject<E extends VariantTo> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getVariantToEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.VARIANTTO_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.VARIANTTO_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.VARIANTTO_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.VARIANTTO_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.VARIANTTO_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.VARIANTTO_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.VARIANTTO_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.VARIANTTO_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case CodeModelPackage.VARIANTTO_TO_FEATURE_ID:
        getTarget().setTo((PreprocessorDirective) value);
        return;
      case CodeModelPackage.VARIANTTO_FROM_FEATURE_ID:
        getTarget().setFrom((PreprocessorDirective) value);
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
   * The adapter/wrapper for the EClass '<em><b>Redefines</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RedefinesModelObject<E extends Redefines> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getRedefinesEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.REDEFINES_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.REDEFINES_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.REDEFINES_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.REDEFINES_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.REDEFINES_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.REDEFINES_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.REDEFINES_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.REDEFINES_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case CodeModelPackage.REDEFINES_TO_FEATURE_ID:
        getTarget().setTo((MacroUnit) value);
        return;
      case CodeModelPackage.REDEFINES_FROM_FEATURE_ID:
        getTarget().setFrom((PreprocessorDirective) value);
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
   * The adapter/wrapper for the EClass '<em><b>Namespace</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class NamespaceModelObject<E extends Namespace> extends CodeItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getNamespaceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.NAMESPACE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.NAMESPACE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.NAMESPACE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.NAMESPACE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.NAMESPACE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.NAMESPACE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.NAMESPACE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.NAMESPACE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.NAMESPACE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.NAMESPACE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.NAMESPACE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.NAMESPACE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.NAMESPACE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.NAMESPACE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.NAMESPACE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.NAMESPACE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.NAMESPACE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.NAMESPACE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.NAMESPACE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.NAMESPACE_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.NAMESPACE_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case CodeModelPackage.NAMESPACE_GROUPEDCODE_FEATURE_ID:
        return getTarget().getGroupedCode();
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
      case CodeModelPackage.NAMESPACE_GROUPEDCODE_FEATURE_ID:
        getTarget().setGroupedCode((Set<CodeItem>) value);
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

      case CodeModelPackage.NAMESPACE_GROUPEDCODE_FEATURE_ID:
        return getTarget().addToGroupedCode((CodeItem) value);
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

      case CodeModelPackage.NAMESPACE_GROUPEDCODE_FEATURE_ID:
        return getTarget().removeFromGroupedCode((CodeItem) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>VisibleIn</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class VisibleInModelObject<E extends VisibleIn> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getVisibleInEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.VISIBLEIN_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.VISIBLEIN_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.VISIBLEIN_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.VISIBLEIN_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.VISIBLEIN_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.VISIBLEIN_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.VISIBLEIN_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.VISIBLEIN_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case CodeModelPackage.VISIBLEIN_TO_FEATURE_ID:
        getTarget().setTo((CodeItem) value);
        return;
      case CodeModelPackage.VISIBLEIN_FROM_FEATURE_ID:
        getTarget().setFrom((CodeItem) value);
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
   * The adapter/wrapper for the EClass '<em><b>Imports</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ImportsModelObject<E extends Imports> extends AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getImportsEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.IMPORTS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.IMPORTS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.IMPORTS_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.IMPORTS_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.IMPORTS_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.IMPORTS_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.IMPORTS_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.IMPORTS_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case CodeModelPackage.IMPORTS_TO_FEATURE_ID:
        getTarget().setTo((CodeItem) value);
        return;
      case CodeModelPackage.IMPORTS_FROM_FEATURE_ID:
        getTarget().setFrom((CodeItem) value);
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
   * The adapter/wrapper for the EClass '<em><b>CodeElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CodeElementModelObject<E extends CodeElement> extends CodeItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCodeElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CODEELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.CODEELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.CODEELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.CODEELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.CODEELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.CODEELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.CODEELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case CodeModelPackage.CODEELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CodeModelPackage.CODEELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CodeModelPackage.CODEELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CodeModelPackage.CODEELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CodeModelPackage.CODEELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CodeModelPackage.CODEELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CodeModelPackage.CODEELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CodeModelPackage.CODEELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CodeModelPackage.CODEELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CodeModelPackage.CODEELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case CodeModelPackage.CODEELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case CodeModelPackage.CODEELEMENT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case CodeModelPackage.CODEELEMENT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case CodeModelPackage.CODEELEMENT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
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
   * The adapter/wrapper for the EClass '<em><b>CodeRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CodeRelationshipModelObject<E extends CodeRelationship> extends
      AbstractCodeRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CodeModelPackage.INSTANCE.getCodeRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CodeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CodeModelPackage.CODERELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CodeModelPackage.CODERELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CodeModelPackage.CODERELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CodeModelPackage.CODERELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CodeModelPackage.CODERELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CodeModelPackage.CODERELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CodeModelPackage.CODERELATIONSHIP_TO_FEATURE_ID:
        return getTarget().getTo();
      case CodeModelPackage.CODERELATIONSHIP_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case CodeModelPackage.CODERELATIONSHIP_TO_FEATURE_ID:
        getTarget().setTo((KDMEntity) value);
        return;
      case CodeModelPackage.CODERELATIONSHIP_FROM_FEATURE_ID:
        getTarget().setFrom((CodeItem) value);
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