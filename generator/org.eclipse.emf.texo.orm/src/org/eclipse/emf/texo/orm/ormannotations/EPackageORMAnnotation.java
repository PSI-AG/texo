/**
 * <copyright>
 * </copyright>
 *
 * $Id: EPackageORMAnnotation.java,v 1.11 2011/10/25 13:25:24 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.annotations.annotationsmodel.EPackageAnnotation;
import org.eclipse.emf.texo.generator.AnnotationManager;
import org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType;
import org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Inheritance;
import org.eclipse.emf.texo.orm.annotator.ORMMappingOptions;
import org.eclipse.emf.texo.orm.annotator.ORMNamingStrategy;
import org.eclipse.emf.texo.orm.annotator.ORMNamingStrategyProvider;
import org.eclipse.emf.texo.orm.annotator.ORMUtils;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EPackage ORM Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isGenerateFullDbSchemaNames <em>Generate Full Db Schema Names</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getNameDictionaryPropertyFile <em>Name Dictionary Property File</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getTableNamePrefix <em>Table Name Prefix</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getColumnNamePrefix <em>Column Name Prefix</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getMaximumSqlNameLength <em>Maximum Sql Name Length</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isLowerCasedNames <em>Lower Cased Names</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUpperCasedNames <em>Upper Cased Names</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isEnforceUniqueNames <em>Enforce Unique Names</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUseJoinTablesForContainment <em>Use Join Tables For Containment</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUseJoinTablesForNonContainment <em>Use Join Tables For Non Containment</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getDefaultCascadeContainment <em>Default Cascade Containment</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getDefaultCascadeNonContainment <em>Default Cascade Non Containment</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getEntityMappings <em>Entity Mappings</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isGenerateJavaAnnotations <em>Generate Java Annotations</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isAddOrderColumnToListMappings <em>Add Order Column To List Mappings</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isRenameSQLReservedNames <em>Rename SQL Reserved Names</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUniqueEntityNames <em>Unique Entity Names</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isSetDelimitedIdentifierTagInORM <em>Set Delimited Identifier Tag In ORM</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation()
 * @model kind="class"
 * @generated
 */
public class EPackageORMAnnotation extends EPackageAnnotation implements ENamedElementORMAnnotation {

  /**
   * The default value of the '{@link #isGenerateFullDbSchemaNames() <em>Generate Full Db Schema Names</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isGenerateFullDbSchemaNames()
   * @generated
   * @ordered
   */
  protected static final boolean GENERATE_FULL_DB_SCHEMA_NAMES_EDEFAULT = true;
  /**
   * The cached value of the '{@link #isGenerateFullDbSchemaNames() <em>Generate Full Db Schema Names</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isGenerateFullDbSchemaNames()
   * @generated
   * @ordered
   */
  protected boolean generateFullDbSchemaNames = GENERATE_FULL_DB_SCHEMA_NAMES_EDEFAULT;
  /**
   * The default value of the '{@link #getNameDictionaryPropertyFile() <em>Name Dictionary Property File</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getNameDictionaryPropertyFile()
   * @generated
   * @ordered
   */
  protected static final String NAME_DICTIONARY_PROPERTY_FILE_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getNameDictionaryPropertyFile() <em>Name Dictionary Property File</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getNameDictionaryPropertyFile()
   * @generated
   * @ordered
   */
  protected String nameDictionaryPropertyFile = NAME_DICTIONARY_PROPERTY_FILE_EDEFAULT;
  /**
   * The default value of the '{@link #getTableNamePrefix() <em>Table Name Prefix</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getTableNamePrefix()
   * @generated
   * @ordered
   */
  protected static final String TABLE_NAME_PREFIX_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getTableNamePrefix() <em>Table Name Prefix</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getTableNamePrefix()
   * @generated
   * @ordered
   */
  protected String tableNamePrefix = TABLE_NAME_PREFIX_EDEFAULT;
  /**
   * The default value of the '{@link #getColumnNamePrefix() <em>Column Name Prefix</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getColumnNamePrefix()
   * @generated
   * @ordered
   */
  protected static final String COLUMN_NAME_PREFIX_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getColumnNamePrefix() <em>Column Name Prefix</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getColumnNamePrefix()
   * @generated
   * @ordered
   */
  protected String columnNamePrefix = COLUMN_NAME_PREFIX_EDEFAULT;
  /**
   * The default value of the '{@link #getMaximumSqlNameLength() <em>Maximum Sql Name Length</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getMaximumSqlNameLength()
   * @generated
   * @ordered
   */
  protected static final int MAXIMUM_SQL_NAME_LENGTH_EDEFAULT = 255;
  /**
   * The cached value of the '{@link #getMaximumSqlNameLength() <em>Maximum Sql Name Length</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getMaximumSqlNameLength()
   * @generated
   * @ordered
   */
  protected int maximumSqlNameLength = MAXIMUM_SQL_NAME_LENGTH_EDEFAULT;
  /**
   * The default value of the '{@link #isLowerCasedNames() <em>Lower Cased Names</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isLowerCasedNames()
   * @generated
   * @ordered
   */
  protected static final boolean LOWER_CASED_NAMES_EDEFAULT = false;
  /**
   * The cached value of the '{@link #isLowerCasedNames() <em>Lower Cased Names</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isLowerCasedNames()
   * @generated
   * @ordered
   */
  protected boolean lowerCasedNames = LOWER_CASED_NAMES_EDEFAULT;
  /**
   * The default value of the '{@link #isUpperCasedNames() <em>Upper Cased Names</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isUpperCasedNames()
   * @generated
   * @ordered
   */
  protected static final boolean UPPER_CASED_NAMES_EDEFAULT = false;
  /**
   * The cached value of the '{@link #isUpperCasedNames() <em>Upper Cased Names</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isUpperCasedNames()
   * @generated
   * @ordered
   */
  protected boolean upperCasedNames = UPPER_CASED_NAMES_EDEFAULT;

  /**
   * The default value of the '{@link #isEnforceUniqueNames() <em>Enforce Unique Names</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isEnforceUniqueNames()
   * @generated
   * @ordered
   */
  protected static final boolean ENFORCE_UNIQUE_NAMES_EDEFAULT = true;
  /**
   * The cached value of the '{@link #isEnforceUniqueNames() <em>Enforce Unique Names</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isEnforceUniqueNames()
   * @generated
   * @ordered
   */
  protected boolean enforceUniqueNames = ENFORCE_UNIQUE_NAMES_EDEFAULT;
  /**
   * The default value of the '{@link #isUseJoinTablesForContainment() <em>Use Join Tables For Containment</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isUseJoinTablesForContainment()
   * @generated
   * @ordered
   */
  protected static final boolean USE_JOIN_TABLES_FOR_CONTAINMENT_EDEFAULT = false;
  /**
   * The cached value of the '{@link #isUseJoinTablesForContainment() <em>Use Join Tables For Containment</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isUseJoinTablesForContainment()
   * @generated
   * @ordered
   */
  protected boolean useJoinTablesForContainment = USE_JOIN_TABLES_FOR_CONTAINMENT_EDEFAULT;
  /**
   * The default value of the '{@link #isUseJoinTablesForNonContainment() <em>Use Join Tables For Non Containment</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isUseJoinTablesForNonContainment()
   * @generated
   * @ordered
   */
  protected static final boolean USE_JOIN_TABLES_FOR_NON_CONTAINMENT_EDEFAULT = true;
  /**
   * The cached value of the '{@link #isUseJoinTablesForNonContainment() <em>Use Join Tables For Non Containment</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isUseJoinTablesForNonContainment()
   * @generated
   * @ordered
   */
  protected boolean useJoinTablesForNonContainment = USE_JOIN_TABLES_FOR_NON_CONTAINMENT_EDEFAULT;
  /**
   * The cached value of the '{@link #getDefaultCascadeContainment() <em>Default Cascade Containment</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getDefaultCascadeContainment()
   * @generated
   * @ordered
   */
  protected CascadeType defaultCascadeContainment;
  /**
   * The cached value of the '{@link #getDefaultCascadeNonContainment() <em>Default Cascade Non Containment</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getDefaultCascadeNonContainment()
   * @generated
   * @ordered
   */
  protected CascadeType defaultCascadeNonContainment;

  /**
   * The cached value of the '{@link #getEntityMappings() <em>Entity Mappings</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getEntityMappings()
   * @generated
   * @ordered
   */
  protected EntityMappingsType entityMappings;

  /**
   * The default value of the '{@link #isGenerateJavaAnnotations() <em>Generate Java Annotations</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isGenerateJavaAnnotations()
   * @generated
   * @ordered
   */
  protected static final boolean GENERATE_JAVA_ANNOTATIONS_EDEFAULT = true;
  /**
   * The cached value of the '{@link #isGenerateJavaAnnotations() <em>Generate Java Annotations</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isGenerateJavaAnnotations()
   * @generated
   * @ordered
   */
  protected boolean generateJavaAnnotations = GENERATE_JAVA_ANNOTATIONS_EDEFAULT;
  /**
   * The default value of the '{@link #isAddOrderColumnToListMappings() <em>Add Order Column To List Mappings</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isAddOrderColumnToListMappings()
   * @generated
   * @ordered
   */
  protected static final boolean ADD_ORDER_COLUMN_TO_LIST_MAPPINGS_EDEFAULT = false;
  /**
   * The cached value of the '{@link #isAddOrderColumnToListMappings() <em>Add Order Column To List Mappings</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isAddOrderColumnToListMappings()
   * @generated
   * @ordered
   */
  protected boolean addOrderColumnToListMappings = ADD_ORDER_COLUMN_TO_LIST_MAPPINGS_EDEFAULT;
  /**
   * The default value of the '{@link #isRenameSQLReservedNames() <em>Rename SQL Reserved Names</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isRenameSQLReservedNames()
   * @generated
   * @ordered
   */
  protected static final boolean RENAME_SQL_RESERVED_NAMES_EDEFAULT = true;
  /**
   * The cached value of the '{@link #isRenameSQLReservedNames() <em>Rename SQL Reserved Names</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isRenameSQLReservedNames()
   * @generated
   * @ordered
   */
  protected boolean renameSQLReservedNames = RENAME_SQL_RESERVED_NAMES_EDEFAULT;

  /**
   * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getInheritance()
   * @generated
   * @ordered
   */
  protected Inheritance inheritance;
  /**
   * The default value of the '{@link #isUniqueEntityNames() <em>Unique Entity Names</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isUniqueEntityNames()
   * @generated
   * @ordered
   */
  protected static final boolean UNIQUE_ENTITY_NAMES_EDEFAULT = true;
  /**
   * The cached value of the '{@link #isUniqueEntityNames() <em>Unique Entity Names</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isUniqueEntityNames()
   * @generated
   * @ordered
   */
  protected boolean uniqueEntityNames = UNIQUE_ENTITY_NAMES_EDEFAULT;
  /**
   * The default value of the '{@link #isSetDelimitedIdentifierTagInORM() <em>Set Delimited Identifier Tag In ORM</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDelimitedIdentifierTagInORM()
   * @generated
   * @ordered
   */
  protected static final boolean SET_DELIMITED_IDENTIFIER_TAG_IN_ORM_EDEFAULT = true;
  /**
   * The cached value of the '{@link #isSetDelimitedIdentifierTagInORM() <em>Set Delimited Identifier Tag In ORM</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDelimitedIdentifierTagInORM()
   * @generated
   * @ordered
   */
  protected boolean setDelimitedIdentifierTagInORM = SET_DELIMITED_IDENTIFIER_TAG_IN_ORM_EDEFAULT;
  private final ORMNamingStrategy namingStrategy;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  protected EPackageORMAnnotation() {
    super();
    // set some defaults which help to run
    // different testcases or are read from the project
    // properties
    if (ORMMappingOptions.getDefaultOptions() != null && ORMMappingOptions.getDefaultOptions().isTestRun()) {
      final ORMMappingOptions options = ORMMappingOptions.getDefaultOptions();
      applyMappingOptions(options);
    }

    namingStrategy = ORMNamingStrategyProvider.getInstance().createORMNamingStrategy(this);
    generateJavaAnnotations = AnnotationManager.isAnnotationSystemEnabled(AnnotationManager.JPA_ANNOTATION_SYSTEM_ID);
  }

  @Override
  public void setGenerated(boolean newGenerated) {
    if (newGenerated && ORMMappingOptions.getDefaultOptions() != null) {
      final ORMMappingOptions options = ORMMappingOptions.getDefaultOptions();
      applyMappingOptions(options);
    }

    super.setGenerated(newGenerated);
  }

  public void applyMappingOptions(ORMMappingOptions options) {
    // otherwise order of lists is not maintained
    addOrderColumnToListMappings = options.isAddOrderColumnToListMappings();
    enforceUniqueNames = options.isEnforceUniqueNames();
    renameSQLReservedNames = options.isRenameSQLReservedNames();
    generateFullDbSchemaNames = options.isGenerateFullDbSchemaNames();
    if (options.getMaximumSqlNameLength() > 0) {
      maximumSqlNameLength = options.getMaximumSqlNameLength();
    }
  }

  public ORMNamingStrategy getNamingStrategy() {
    return namingStrategy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmannotationsPackage.Literals.EPACKAGE_ORM_ANNOTATION;
  }

  /**
   * Returns the value of the '<em><b>Generate Full Db Schema Names</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generate Full Db Schema Names</em>' attribute isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generate Full Db Schema Names</em>' attribute.
   * @see #setGenerateFullDbSchemaNames(boolean)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_GenerateFullDbSchemaNames()
   * @model default="true"
   * @generated
   */
  public boolean isGenerateFullDbSchemaNames() {
    return generateFullDbSchemaNames;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isGenerateFullDbSchemaNames <em>Generate Full Db Schema Names</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Generate Full Db Schema Names</em>' attribute.
   * @see #isGenerateFullDbSchemaNames()
   * @generated
   */
  public void setGenerateFullDbSchemaNames(boolean newGenerateFullDbSchemaNames) {
    boolean oldGenerateFullDbSchemaNames = generateFullDbSchemaNames;
    generateFullDbSchemaNames = newGenerateFullDbSchemaNames;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__GENERATE_FULL_DB_SCHEMA_NAMES, oldGenerateFullDbSchemaNames, generateFullDbSchemaNames));
  }

  /**
   * Returns the value of the '<em><b>Name Dictionary Property File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Dictionary Property File</em>' attribute isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Dictionary Property File</em>' attribute.
   * @see #setNameDictionaryPropertyFile(String)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_NameDictionaryPropertyFile()
   * @model
   * @generated
   */
  public String getNameDictionaryPropertyFile() {
    return nameDictionaryPropertyFile;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getNameDictionaryPropertyFile <em>Name Dictionary Property File</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Dictionary Property File</em>' attribute.
   * @see #getNameDictionaryPropertyFile()
   * @generated
   */
  public void setNameDictionaryPropertyFile(String newNameDictionaryPropertyFile) {
    String oldNameDictionaryPropertyFile = nameDictionaryPropertyFile;
    nameDictionaryPropertyFile = newNameDictionaryPropertyFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__NAME_DICTIONARY_PROPERTY_FILE, oldNameDictionaryPropertyFile, nameDictionaryPropertyFile));
  }

  /**
   * Returns the value of the '<em><b>Table Name Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Name Prefix</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Name Prefix</em>' attribute.
   * @see #setTableNamePrefix(String)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_TableNamePrefix()
   * @model
   * @generated
   */
  public String getTableNamePrefix() {
    return tableNamePrefix;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getTableNamePrefix <em>Table Name Prefix</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Name Prefix</em>' attribute.
   * @see #getTableNamePrefix()
   * @generated
   */
  public void setTableNamePrefix(String newTableNamePrefix) {
    String oldTableNamePrefix = tableNamePrefix;
    tableNamePrefix = newTableNamePrefix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__TABLE_NAME_PREFIX, oldTableNamePrefix, tableNamePrefix));
  }

  /**
   * Returns the value of the '<em><b>Column Name Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Name Prefix</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Name Prefix</em>' attribute.
   * @see #setColumnNamePrefix(String)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_ColumnNamePrefix()
   * @model
   * @generated
   */
  public String getColumnNamePrefix() {
    return columnNamePrefix;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getColumnNamePrefix <em>Column Name Prefix</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Name Prefix</em>' attribute.
   * @see #getColumnNamePrefix()
   * @generated
   */
  public void setColumnNamePrefix(String newColumnNamePrefix) {
    String oldColumnNamePrefix = columnNamePrefix;
    columnNamePrefix = newColumnNamePrefix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__COLUMN_NAME_PREFIX, oldColumnNamePrefix, columnNamePrefix));
  }

  /**
   * Returns the value of the '<em><b>Maximum Sql Name Length</b></em>' attribute.
   * The default value is <code>"255"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maximum Sql Name Length</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maximum Sql Name Length</em>' attribute.
   * @see #setMaximumSqlNameLength(int)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_MaximumSqlNameLength()
   * @model default="255"
   * @generated
   */
  public int getMaximumSqlNameLength() {
    return maximumSqlNameLength;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getMaximumSqlNameLength <em>Maximum Sql Name Length</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Maximum Sql Name Length</em>' attribute.
   * @see #getMaximumSqlNameLength()
   * @generated
   */
  public void setMaximumSqlNameLength(int newMaximumSqlNameLength) {
    int oldMaximumSqlNameLength = maximumSqlNameLength;
    maximumSqlNameLength = newMaximumSqlNameLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__MAXIMUM_SQL_NAME_LENGTH, oldMaximumSqlNameLength, maximumSqlNameLength));
  }

  /**
   * Returns the value of the '<em><b>Lower Cased Names</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Cased Names</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Cased Names</em>' attribute.
   * @see #setLowerCasedNames(boolean)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_LowerCasedNames()
   * @model default="false"
   * @generated
   */
  public boolean isLowerCasedNames() {
    return lowerCasedNames;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isLowerCasedNames <em>Lower Cased Names</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Cased Names</em>' attribute.
   * @see #isLowerCasedNames()
   * @generated
   */
  public void setLowerCasedNames(boolean newLowerCasedNames) {
    boolean oldLowerCasedNames = lowerCasedNames;
    lowerCasedNames = newLowerCasedNames;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__LOWER_CASED_NAMES, oldLowerCasedNames, lowerCasedNames));
  }

  /**
   * Returns the value of the '<em><b>Upper Cased Names</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Cased Names</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Cased Names</em>' attribute.
   * @see #setUpperCasedNames(boolean)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_UpperCasedNames()
   * @model default="false"
   * @generated
   */
  public boolean isUpperCasedNames() {
    return upperCasedNames;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUpperCasedNames <em>Upper Cased Names</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Cased Names</em>' attribute.
   * @see #isUpperCasedNames()
   * @generated
   */
  public void setUpperCasedNames(boolean newUpperCasedNames) {
    boolean oldUpperCasedNames = upperCasedNames;
    upperCasedNames = newUpperCasedNames;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__UPPER_CASED_NAMES, oldUpperCasedNames, upperCasedNames));
  }

  /**
   * Returns the value of the '<em><b>Enforce Unique Names</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enforce Unique Names</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enforce Unique Names</em>' attribute.
   * @see #setEnforceUniqueNames(boolean)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_EnforceUniqueNames()
   * @model default="true"
   * @generated
   */
  public boolean isEnforceUniqueNames() {
    return enforceUniqueNames;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isEnforceUniqueNames <em>Enforce Unique Names</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Enforce Unique Names</em>' attribute.
   * @see #isEnforceUniqueNames()
   * @generated
   */
  public void setEnforceUniqueNames(boolean newEnforceUniqueNames) {
    boolean oldEnforceUniqueNames = enforceUniqueNames;
    enforceUniqueNames = newEnforceUniqueNames;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENFORCE_UNIQUE_NAMES, oldEnforceUniqueNames, enforceUniqueNames));
  }

  /**
   * Returns the value of the '<em><b>Use Join Tables For Containment</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Join Tables For Containment</em>' attribute isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Join Tables For Containment</em>' attribute.
   * @see #setUseJoinTablesForContainment(boolean)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_UseJoinTablesForContainment()
   * @model default="false"
   * @generated
   */
  public boolean isUseJoinTablesForContainment() {
    return useJoinTablesForContainment;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUseJoinTablesForContainment <em>Use Join Tables For Containment</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Use Join Tables For Containment</em>' attribute.
   * @see #isUseJoinTablesForContainment()
   * @generated
   */
  public void setUseJoinTablesForContainment(boolean newUseJoinTablesForContainment) {
    boolean oldUseJoinTablesForContainment = useJoinTablesForContainment;
    useJoinTablesForContainment = newUseJoinTablesForContainment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_CONTAINMENT, oldUseJoinTablesForContainment, useJoinTablesForContainment));
  }

  /**
   * Returns the value of the '<em><b>Use Join Tables For Non Containment</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Join Tables For Non Containment</em>' attribute isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Join Tables For Non Containment</em>' attribute.
   * @see #setUseJoinTablesForNonContainment(boolean)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_UseJoinTablesForNonContainment()
   * @model default="true"
   * @generated
   */
  public boolean isUseJoinTablesForNonContainment() {
    return useJoinTablesForNonContainment;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUseJoinTablesForNonContainment <em>Use Join Tables For Non Containment</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Use Join Tables For Non Containment</em>' attribute.
   * @see #isUseJoinTablesForNonContainment()
   * @generated
   */
  public void setUseJoinTablesForNonContainment(boolean newUseJoinTablesForNonContainment) {
    boolean oldUseJoinTablesForNonContainment = useJoinTablesForNonContainment;
    useJoinTablesForNonContainment = newUseJoinTablesForNonContainment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_NON_CONTAINMENT, oldUseJoinTablesForNonContainment, useJoinTablesForNonContainment));
  }

  /**
   * Returns the value of the '<em><b>Default Cascade Containment</b></em>' containment reference.
   * <!-- begin-user-doc
   * -->
   * <p>
   * If the meaning of the '<em>Default Cascade Containment</em>' containment reference isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Cascade Containment</em>' containment reference.
   * @see #setDefaultCascadeContainment(CascadeType)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_DefaultCascadeContainment()
   * @model containment="true"
   * @generated
   */
  public CascadeType getDefaultCascadeContainment() {
    return defaultCascadeContainment;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultCascadeContainment(CascadeType newDefaultCascadeContainment,
      NotificationChain msgs) {
    CascadeType oldDefaultCascadeContainment = defaultCascadeContainment;
    defaultCascadeContainment = newDefaultCascadeContainment;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT, oldDefaultCascadeContainment, newDefaultCascadeContainment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getDefaultCascadeContainment <em>Default Cascade Containment</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Cascade Containment</em>' containment reference.
   * @see #getDefaultCascadeContainment()
   * @generated
   */
  public void setDefaultCascadeContainment(CascadeType newDefaultCascadeContainment) {
    if (newDefaultCascadeContainment != defaultCascadeContainment) {
      NotificationChain msgs = null;
      if (defaultCascadeContainment != null)
        msgs = ((InternalEObject)defaultCascadeContainment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT, null, msgs);
      if (newDefaultCascadeContainment != null)
        msgs = ((InternalEObject)newDefaultCascadeContainment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT, null, msgs);
      msgs = basicSetDefaultCascadeContainment(newDefaultCascadeContainment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT, newDefaultCascadeContainment, newDefaultCascadeContainment));
  }

  /**
   * Returns the value of the '<em><b>Default Cascade Non Containment</b></em>' containment reference. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Cascade Non Containment</em>' containment reference isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Default Cascade Non Containment</em>' containment reference.
   * @see #setDefaultCascadeNonContainment(CascadeType)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_DefaultCascadeNonContainment()
   * @model containment="true"
   * @generated
   */
  public CascadeType getDefaultCascadeNonContainment() {
    return defaultCascadeNonContainment;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultCascadeNonContainment(CascadeType newDefaultCascadeNonContainment,
      NotificationChain msgs) {
    CascadeType oldDefaultCascadeNonContainment = defaultCascadeNonContainment;
    defaultCascadeNonContainment = newDefaultCascadeNonContainment;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT, oldDefaultCascadeNonContainment, newDefaultCascadeNonContainment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getDefaultCascadeNonContainment <em>Default Cascade Non Containment</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Cascade Non Containment</em>' containment reference.
   * @see #getDefaultCascadeNonContainment()
   * @generated
   */
  public void setDefaultCascadeNonContainment(CascadeType newDefaultCascadeNonContainment) {
    if (newDefaultCascadeNonContainment != defaultCascadeNonContainment) {
      NotificationChain msgs = null;
      if (defaultCascadeNonContainment != null)
        msgs = ((InternalEObject)defaultCascadeNonContainment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT, null, msgs);
      if (newDefaultCascadeNonContainment != null)
        msgs = ((InternalEObject)newDefaultCascadeNonContainment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT, null, msgs);
      msgs = basicSetDefaultCascadeNonContainment(newDefaultCascadeNonContainment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT, newDefaultCascadeNonContainment, newDefaultCascadeNonContainment));
  }

  /**
   * Returns the value of the '<em><b>Entity Mappings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Mappings</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Mappings</em>' containment reference.
   * @see #setEntityMappings(EntityMappingsType)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_EntityMappings()
   * @model containment="true"
   * @generated
   */
  public EntityMappingsType getEntityMappings() {
    return entityMappings;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntityMappings(EntityMappingsType newEntityMappings, NotificationChain msgs) {
    EntityMappingsType oldEntityMappings = entityMappings;
    entityMappings = newEntityMappings;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENTITY_MAPPINGS, oldEntityMappings, newEntityMappings);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getEntityMappings <em>Entity Mappings</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Mappings</em>' containment reference.
   * @see #getEntityMappings()
   * @generated
   */
  public void setEntityMappings(EntityMappingsType newEntityMappings) {
    if (newEntityMappings != entityMappings) {
      NotificationChain msgs = null;
      if (entityMappings != null)
        msgs = ((InternalEObject)entityMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENTITY_MAPPINGS, null, msgs);
      if (newEntityMappings != null)
        msgs = ((InternalEObject)newEntityMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENTITY_MAPPINGS, null, msgs);
      msgs = basicSetEntityMappings(newEntityMappings, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENTITY_MAPPINGS, newEntityMappings, newEntityMappings));
  }

  /**
   * Returns the value of the '<em><b>Generate Java Annotations</b></em>' attribute. The default value is
   * <code>"true"</code>. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generate Java Annotations</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Generate Java Annotations</em>' attribute.
   * @see #setGenerateJavaAnnotations(boolean)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_GenerateJavaAnnotations()
   * @model default="true"
   * @generatedNOT
   */
  public boolean isGenerateJavaAnnotations() {
    // don't use this setting and always return the global setting
    return AnnotationManager.isAnnotationSystemEnabled(AnnotationManager.JPA_ANNOTATION_SYSTEM_ID);
    // return generateJavaAnnotations;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isGenerateJavaAnnotations <em>Generate Java Annotations</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Generate Java Annotations</em>' attribute.
   * @see #isGenerateJavaAnnotations()
   * @generated
   */
  public void setGenerateJavaAnnotations(boolean newGenerateJavaAnnotations) {
    boolean oldGenerateJavaAnnotations = generateJavaAnnotations;
    generateJavaAnnotations = newGenerateJavaAnnotations;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__GENERATE_JAVA_ANNOTATIONS, oldGenerateJavaAnnotations, generateJavaAnnotations));
  }

  /**
   * Returns the value of the '<em><b>Add Order Column To List Mappings</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add Order Column To List Mappings</em>' attribute isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add Order Column To List Mappings</em>' attribute.
   * @see #setAddOrderColumnToListMappings(boolean)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_AddOrderColumnToListMappings()
   * @model default="false"
   * @generated
   */
  public boolean isAddOrderColumnToListMappings() {
    return addOrderColumnToListMappings;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isAddOrderColumnToListMappings <em>Add Order Column To List Mappings</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Add Order Column To List Mappings</em>' attribute.
   * @see #isAddOrderColumnToListMappings()
   * @generated
   */
  public void setAddOrderColumnToListMappings(boolean newAddOrderColumnToListMappings) {
    boolean oldAddOrderColumnToListMappings = addOrderColumnToListMappings;
    addOrderColumnToListMappings = newAddOrderColumnToListMappings;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ADD_ORDER_COLUMN_TO_LIST_MAPPINGS, oldAddOrderColumnToListMappings, addOrderColumnToListMappings));
  }

  /**
   * Returns the value of the '<em><b>Rename SQL Reserved Names</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rename SQL Reserved Names</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rename SQL Reserved Names</em>' attribute.
   * @see #setRenameSQLReservedNames(boolean)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_RenameSQLReservedNames()
   * @model default="true"
   * @generated
   */
  public boolean isRenameSQLReservedNames() {
    return renameSQLReservedNames;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isRenameSQLReservedNames <em>Rename SQL Reserved Names</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Rename SQL Reserved Names</em>' attribute.
   * @see #isRenameSQLReservedNames()
   * @generated
   */
  public void setRenameSQLReservedNames(boolean newRenameSQLReservedNames) {
    boolean oldRenameSQLReservedNames = renameSQLReservedNames;
    renameSQLReservedNames = newRenameSQLReservedNames;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__RENAME_SQL_RESERVED_NAMES, oldRenameSQLReservedNames, renameSQLReservedNames));
  }

  /**
   * Returns the value of the '<em><b>Inheritance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inheritance</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inheritance</em>' containment reference.
   * @see #setInheritance(Inheritance)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_Inheritance()
   * @model containment="true"
   * @generated
   */
  public Inheritance getInheritance() {
    return inheritance;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInheritance(Inheritance newInheritance, NotificationChain msgs) {
    Inheritance oldInheritance = inheritance;
    inheritance = newInheritance;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__INHERITANCE, oldInheritance, newInheritance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#getInheritance <em>Inheritance</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Inheritance</em>' containment reference.
   * @see #getInheritance()
   * @generated
   */
  public void setInheritance(Inheritance newInheritance) {
    if (newInheritance != inheritance) {
      NotificationChain msgs = null;
      if (inheritance != null)
        msgs = ((InternalEObject)inheritance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__INHERITANCE, null, msgs);
      if (newInheritance != null)
        msgs = ((InternalEObject)newInheritance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__INHERITANCE, null, msgs);
      msgs = basicSetInheritance(newInheritance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__INHERITANCE, newInheritance, newInheritance));
  }

  /**
   * Returns the value of the '<em><b>Unique Entity Names</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique Entity Names</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique Entity Names</em>' attribute.
   * @see #setUniqueEntityNames(boolean)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_UniqueEntityNames()
   * @model default="true"
   * @generated
   */
  public boolean isUniqueEntityNames() {
    return uniqueEntityNames;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isUniqueEntityNames <em>Unique Entity Names</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique Entity Names</em>' attribute.
   * @see #isUniqueEntityNames()
   * @generated
   */
  public void setUniqueEntityNames(boolean newUniqueEntityNames) {
    boolean oldUniqueEntityNames = uniqueEntityNames;
    uniqueEntityNames = newUniqueEntityNames;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__UNIQUE_ENTITY_NAMES, oldUniqueEntityNames, uniqueEntityNames));
  }

  /**
   * Returns the value of the '<em><b>Set Delimited Identifier Tag In ORM</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set Delimited Identifier Tag In ORM</em>' attribute isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Delimited Identifier Tag In ORM</em>' attribute.
   * @see #setSetDelimitedIdentifierTagInORM(boolean)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEPackageORMAnnotation_SetDelimitedIdentifierTagInORM()
   * @model default="true"
   * @generated
   */
  public boolean isSetDelimitedIdentifierTagInORM() {
    return setDelimitedIdentifierTagInORM;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation#isSetDelimitedIdentifierTagInORM <em>Set Delimited Identifier Tag In ORM</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Set Delimited Identifier Tag In ORM</em>' attribute.
   * @see #isSetDelimitedIdentifierTagInORM()
   * @generated
   */
  public void setSetDelimitedIdentifierTagInORM(boolean newSetDelimitedIdentifierTagInORM) {
    boolean oldSetDelimitedIdentifierTagInORM = setDelimitedIdentifierTagInORM;
    setDelimitedIdentifierTagInORM = newSetDelimitedIdentifierTagInORM;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__SET_DELIMITED_IDENTIFIER_TAG_IN_ORM, oldSetDelimitedIdentifierTagInORM, setDelimitedIdentifierTagInORM));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT:
        return basicSetDefaultCascadeContainment(null, msgs);
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT:
        return basicSetDefaultCascadeNonContainment(null, msgs);
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENTITY_MAPPINGS:
        return basicSetEntityMappings(null, msgs);
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__INHERITANCE:
        return basicSetInheritance(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__GENERATE_FULL_DB_SCHEMA_NAMES:
        return isGenerateFullDbSchemaNames();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__NAME_DICTIONARY_PROPERTY_FILE:
        return getNameDictionaryPropertyFile();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__TABLE_NAME_PREFIX:
        return getTableNamePrefix();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__COLUMN_NAME_PREFIX:
        return getColumnNamePrefix();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__MAXIMUM_SQL_NAME_LENGTH:
        return getMaximumSqlNameLength();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__LOWER_CASED_NAMES:
        return isLowerCasedNames();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__UPPER_CASED_NAMES:
        return isUpperCasedNames();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENFORCE_UNIQUE_NAMES:
        return isEnforceUniqueNames();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_CONTAINMENT:
        return isUseJoinTablesForContainment();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_NON_CONTAINMENT:
        return isUseJoinTablesForNonContainment();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT:
        return getDefaultCascadeContainment();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT:
        return getDefaultCascadeNonContainment();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENTITY_MAPPINGS:
        return getEntityMappings();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__GENERATE_JAVA_ANNOTATIONS:
        return isGenerateJavaAnnotations();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ADD_ORDER_COLUMN_TO_LIST_MAPPINGS:
        return isAddOrderColumnToListMappings();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__RENAME_SQL_RESERVED_NAMES:
        return isRenameSQLReservedNames();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__INHERITANCE:
        return getInheritance();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__UNIQUE_ENTITY_NAMES:
        return isUniqueEntityNames();
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__SET_DELIMITED_IDENTIFIER_TAG_IN_ORM:
        return isSetDelimitedIdentifierTagInORM();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__GENERATE_FULL_DB_SCHEMA_NAMES:
        setGenerateFullDbSchemaNames((Boolean)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__NAME_DICTIONARY_PROPERTY_FILE:
        setNameDictionaryPropertyFile((String)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__TABLE_NAME_PREFIX:
        setTableNamePrefix((String)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__COLUMN_NAME_PREFIX:
        setColumnNamePrefix((String)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__MAXIMUM_SQL_NAME_LENGTH:
        setMaximumSqlNameLength((Integer)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__LOWER_CASED_NAMES:
        setLowerCasedNames((Boolean)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__UPPER_CASED_NAMES:
        setUpperCasedNames((Boolean)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENFORCE_UNIQUE_NAMES:
        setEnforceUniqueNames((Boolean)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_CONTAINMENT:
        setUseJoinTablesForContainment((Boolean)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_NON_CONTAINMENT:
        setUseJoinTablesForNonContainment((Boolean)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT:
        setDefaultCascadeContainment((CascadeType)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT:
        setDefaultCascadeNonContainment((CascadeType)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENTITY_MAPPINGS:
        setEntityMappings((EntityMappingsType)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__GENERATE_JAVA_ANNOTATIONS:
        setGenerateJavaAnnotations((Boolean)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ADD_ORDER_COLUMN_TO_LIST_MAPPINGS:
        setAddOrderColumnToListMappings((Boolean)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__RENAME_SQL_RESERVED_NAMES:
        setRenameSQLReservedNames((Boolean)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__INHERITANCE:
        setInheritance((Inheritance)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__UNIQUE_ENTITY_NAMES:
        setUniqueEntityNames((Boolean)newValue);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__SET_DELIMITED_IDENTIFIER_TAG_IN_ORM:
        setSetDelimitedIdentifierTagInORM((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__GENERATE_FULL_DB_SCHEMA_NAMES:
        setGenerateFullDbSchemaNames(GENERATE_FULL_DB_SCHEMA_NAMES_EDEFAULT);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__NAME_DICTIONARY_PROPERTY_FILE:
        setNameDictionaryPropertyFile(NAME_DICTIONARY_PROPERTY_FILE_EDEFAULT);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__TABLE_NAME_PREFIX:
        setTableNamePrefix(TABLE_NAME_PREFIX_EDEFAULT);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__COLUMN_NAME_PREFIX:
        setColumnNamePrefix(COLUMN_NAME_PREFIX_EDEFAULT);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__MAXIMUM_SQL_NAME_LENGTH:
        setMaximumSqlNameLength(MAXIMUM_SQL_NAME_LENGTH_EDEFAULT);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__LOWER_CASED_NAMES:
        setLowerCasedNames(LOWER_CASED_NAMES_EDEFAULT);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__UPPER_CASED_NAMES:
        setUpperCasedNames(UPPER_CASED_NAMES_EDEFAULT);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENFORCE_UNIQUE_NAMES:
        setEnforceUniqueNames(ENFORCE_UNIQUE_NAMES_EDEFAULT);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_CONTAINMENT:
        setUseJoinTablesForContainment(USE_JOIN_TABLES_FOR_CONTAINMENT_EDEFAULT);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_NON_CONTAINMENT:
        setUseJoinTablesForNonContainment(USE_JOIN_TABLES_FOR_NON_CONTAINMENT_EDEFAULT);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT:
        setDefaultCascadeContainment((CascadeType)null);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT:
        setDefaultCascadeNonContainment((CascadeType)null);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENTITY_MAPPINGS:
        setEntityMappings((EntityMappingsType)null);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__GENERATE_JAVA_ANNOTATIONS:
        setGenerateJavaAnnotations(GENERATE_JAVA_ANNOTATIONS_EDEFAULT);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ADD_ORDER_COLUMN_TO_LIST_MAPPINGS:
        setAddOrderColumnToListMappings(ADD_ORDER_COLUMN_TO_LIST_MAPPINGS_EDEFAULT);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__RENAME_SQL_RESERVED_NAMES:
        setRenameSQLReservedNames(RENAME_SQL_RESERVED_NAMES_EDEFAULT);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__INHERITANCE:
        setInheritance((Inheritance)null);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__UNIQUE_ENTITY_NAMES:
        setUniqueEntityNames(UNIQUE_ENTITY_NAMES_EDEFAULT);
        return;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__SET_DELIMITED_IDENTIFIER_TAG_IN_ORM:
        setSetDelimitedIdentifierTagInORM(SET_DELIMITED_IDENTIFIER_TAG_IN_ORM_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__GENERATE_FULL_DB_SCHEMA_NAMES:
        return generateFullDbSchemaNames != GENERATE_FULL_DB_SCHEMA_NAMES_EDEFAULT;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__NAME_DICTIONARY_PROPERTY_FILE:
        return NAME_DICTIONARY_PROPERTY_FILE_EDEFAULT == null ? nameDictionaryPropertyFile != null : !NAME_DICTIONARY_PROPERTY_FILE_EDEFAULT.equals(nameDictionaryPropertyFile);
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__TABLE_NAME_PREFIX:
        return TABLE_NAME_PREFIX_EDEFAULT == null ? tableNamePrefix != null : !TABLE_NAME_PREFIX_EDEFAULT.equals(tableNamePrefix);
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__COLUMN_NAME_PREFIX:
        return COLUMN_NAME_PREFIX_EDEFAULT == null ? columnNamePrefix != null : !COLUMN_NAME_PREFIX_EDEFAULT.equals(columnNamePrefix);
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__MAXIMUM_SQL_NAME_LENGTH:
        return maximumSqlNameLength != MAXIMUM_SQL_NAME_LENGTH_EDEFAULT;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__LOWER_CASED_NAMES:
        return lowerCasedNames != LOWER_CASED_NAMES_EDEFAULT;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__UPPER_CASED_NAMES:
        return upperCasedNames != UPPER_CASED_NAMES_EDEFAULT;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENFORCE_UNIQUE_NAMES:
        return enforceUniqueNames != ENFORCE_UNIQUE_NAMES_EDEFAULT;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_CONTAINMENT:
        return useJoinTablesForContainment != USE_JOIN_TABLES_FOR_CONTAINMENT_EDEFAULT;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__USE_JOIN_TABLES_FOR_NON_CONTAINMENT:
        return useJoinTablesForNonContainment != USE_JOIN_TABLES_FOR_NON_CONTAINMENT_EDEFAULT;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_CONTAINMENT:
        return defaultCascadeContainment != null;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__DEFAULT_CASCADE_NON_CONTAINMENT:
        return defaultCascadeNonContainment != null;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ENTITY_MAPPINGS:
        return entityMappings != null;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__GENERATE_JAVA_ANNOTATIONS:
        return generateJavaAnnotations != GENERATE_JAVA_ANNOTATIONS_EDEFAULT;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__ADD_ORDER_COLUMN_TO_LIST_MAPPINGS:
        return addOrderColumnToListMappings != ADD_ORDER_COLUMN_TO_LIST_MAPPINGS_EDEFAULT;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__RENAME_SQL_RESERVED_NAMES:
        return renameSQLReservedNames != RENAME_SQL_RESERVED_NAMES_EDEFAULT;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__INHERITANCE:
        return inheritance != null;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__UNIQUE_ENTITY_NAMES:
        return uniqueEntityNames != UNIQUE_ENTITY_NAMES_EDEFAULT;
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION__SET_DELIMITED_IDENTIFIER_TAG_IN_ORM:
        return setDelimitedIdentifierTagInORM != SET_DELIMITED_IDENTIFIER_TAG_IN_ORM_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (generateFullDbSchemaNames: "); //$NON-NLS-1$
    result.append(generateFullDbSchemaNames);
    result.append(", nameDictionaryPropertyFile: "); //$NON-NLS-1$
    result.append(nameDictionaryPropertyFile);
    result.append(", tableNamePrefix: "); //$NON-NLS-1$
    result.append(tableNamePrefix);
    result.append(", columnNamePrefix: "); //$NON-NLS-1$
    result.append(columnNamePrefix);
    result.append(", maximumSqlNameLength: "); //$NON-NLS-1$
    result.append(maximumSqlNameLength);
    result.append(", lowerCasedNames: "); //$NON-NLS-1$
    result.append(lowerCasedNames);
    result.append(", upperCasedNames: "); //$NON-NLS-1$
    result.append(upperCasedNames);
    result.append(", enforceUniqueNames: "); //$NON-NLS-1$
    result.append(enforceUniqueNames);
    result.append(", useJoinTablesForContainment: "); //$NON-NLS-1$
    result.append(useJoinTablesForContainment);
    result.append(", useJoinTablesForNonContainment: "); //$NON-NLS-1$
    result.append(useJoinTablesForNonContainment);
    result.append(", generateJavaAnnotations: "); //$NON-NLS-1$
    result.append(generateJavaAnnotations);
    result.append(", addOrderColumnToListMappings: "); //$NON-NLS-1$
    result.append(addOrderColumnToListMappings);
    result.append(", renameSQLReservedNames: "); //$NON-NLS-1$
    result.append(renameSQLReservedNames);
    result.append(", uniqueEntityNames: "); //$NON-NLS-1$
    result.append(uniqueEntityNames);
    result.append(", setDelimitedIdentifierTagInORM: "); //$NON-NLS-1$
    result.append(setDelimitedIdentifierTagInORM);
    result.append(')');
    return result.toString();
  }

  @Override
  // in the constructor to support testcases certain members are
  // set, this object is copied, force the copy of these
  // apparently unset features by always returning true
  public boolean eIsSet(EStructuralFeature eFeature) {
    return true;
  }

  @Override
  public boolean isValidForContext(ENamedElement eNamedElement) {
    return ORMUtils.isValidForContext(eNamedElement);
  }

} // EPackageORMAnnotation
