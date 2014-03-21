package org.eclipse.emf.texo.test.model.samples.forum;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.samples.forum.dao.ForumDao;
import org.eclipse.emf.texo.test.model.samples.forum.dao.MemberDao;
import org.eclipse.emf.texo.test.model.samples.forum.dao.PostDao;
import org.eclipse.emf.texo.test.model.samples.forum.dao.TopicDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>forum</b></em>'. It contains initialization code and access to the Factory
 * to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ForumModelPackage extends ModelPackage {

  /**
   * Is set when the package has been initialized.
   * 
   * @generated
   */
  private static boolean isInitialized = false;

  /**
   * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/forum";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ForumModelFactory MODELFACTORY = new ForumModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TOPICCATEGORY_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TOPICCATEGORYOBJECT_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FORUM_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FORUM_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FORUM_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FORUM_TITLE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FORUM_MEMBERS_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FORUM_TOPICS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBER_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBER_NICKNAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBER_POSTS_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBER_CREATED_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TOPIC_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TOPIC_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TOPIC_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TOPIC_TITLE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TOPIC_CATEGORY_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TOPIC_CREATOR_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TOPIC_POSTS_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POST_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POST_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POST_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POST_COMMENT_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POST_AUTHOR_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POST_TOPIC_FEATURE_ID = 4;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ForumModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static ForumModelPackage initialize() {

    if (isInitialized) {
      return (ForumModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final ForumModelPackage modelPackage = new ForumModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Forum.class, modelPackage.getForumEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Member.class, modelPackage.getMemberEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Topic.class, modelPackage.getTopicEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Post.class, modelPackage.getPostEClass(), modelPackage);

    ModelResolver.getInstance().registerClassModelMapping(TopicCategory.class, modelPackage.getTopicCategoryEEnum(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(Forum.class, ForumDao.class);
    DaoRegistry.getInstance().registerDao(Member.class, MemberDao.class);
    DaoRegistry.getInstance().registerDao(Topic.class, TopicDao.class);
    DaoRegistry.getInstance().registerDao(Post.class, PostDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link ForumModelFactory} instance.
   * @generated
   */
  @Override
  public ForumModelFactory getModelFactory() {
    return MODELFACTORY;
  }

  /**
   * Returns the nsUri of the {@link EPackage} managed by this Package instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return the nsUri of the EPackage
   * @generated
   */
  @Override
  public String getNsURI() {
    return NS_URI;
  }

  /**
   * Returns the name of the ecore file containing the ecore model of the {@link EPackage} managed here. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the name of the ecore file
   * @generated
   */
  @Override
  public String getEcoreFileName() {
    return "forum.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Forum</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Forum</b></em>'
   * @generated
   */
  public EClass getForumEClass() {
    return (EClass) getEPackage().getEClassifiers().get(FORUM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Forum.title</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Forum.title</b></em>'.
   * @generated
   */
  public EAttribute getForum_Title() {
    return (EAttribute) getForumEClass().getEAllStructuralFeatures().get(FORUM_TITLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Forum.members</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Forum.members</b></em>'.
   * @generated
   */
  public EReference getForum_Members() {
    return (EReference) getForumEClass().getEAllStructuralFeatures().get(FORUM_MEMBERS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Forum.topics</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Forum.topics</b></em>'.
   * @generated
   */
  public EReference getForum_Topics() {
    return (EReference) getForumEClass().getEAllStructuralFeatures().get(FORUM_TOPICS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Member</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Member</b></em>'
   * @generated
   */
  public EClass getMemberEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MEMBER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Member.nickname</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Member.nickname</b></em>'.
   * @generated
   */
  public EAttribute getMember_Nickname() {
    return (EAttribute) getMemberEClass().getEAllStructuralFeatures().get(MEMBER_NICKNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Member.posts</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Member.posts</b></em>'.
   * @generated
   */
  public EReference getMember_Posts() {
    return (EReference) getMemberEClass().getEAllStructuralFeatures().get(MEMBER_POSTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Member.created</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Member.created</b></em>'.
   * @generated
   */
  public EReference getMember_Created() {
    return (EReference) getMemberEClass().getEAllStructuralFeatures().get(MEMBER_CREATED_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Topic</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Topic</b></em>'
   * @generated
   */
  public EClass getTopicEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TOPIC_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Topic.title</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Topic.title</b></em>'.
   * @generated
   */
  public EAttribute getTopic_Title() {
    return (EAttribute) getTopicEClass().getEAllStructuralFeatures().get(TOPIC_TITLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Topic.category</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Topic.category</b></em>'.
   * @generated
   */
  public EAttribute getTopic_Category() {
    return (EAttribute) getTopicEClass().getEAllStructuralFeatures().get(TOPIC_CATEGORY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Topic.creator</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Topic.creator</b></em>'.
   * @generated
   */
  public EReference getTopic_Creator() {
    return (EReference) getTopicEClass().getEAllStructuralFeatures().get(TOPIC_CREATOR_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Topic.posts</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Topic.posts</b></em>'.
   * @generated
   */
  public EReference getTopic_Posts() {
    return (EReference) getTopicEClass().getEAllStructuralFeatures().get(TOPIC_POSTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Post</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Post</b></em>'
   * @generated
   */
  public EClass getPostEClass() {
    return (EClass) getEPackage().getEClassifiers().get(POST_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Post.comment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Post.comment</b></em>'.
   * @generated
   */
  public EAttribute getPost_Comment() {
    return (EAttribute) getPostEClass().getEAllStructuralFeatures().get(POST_COMMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Post.author</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Post.author</b></em>'.
   * @generated
   */
  public EReference getPost_Author() {
    return (EReference) getPostEClass().getEAllStructuralFeatures().get(POST_AUTHOR_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Post.topic</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Post.topic</b></em>'.
   * @generated
   */
  public EReference getPost_Topic() {
    return (EReference) getPostEClass().getEAllStructuralFeatures().get(POST_TOPIC_FEATURE_ID);
  }

  /**
   * Returns the EEnum '<em><b>TopicCategory</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>TopicCategory</b></em>'
   * @generated
   */
  public EEnum getTopicCategoryEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(TOPICCATEGORY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>TopicCategoryObject</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>TopicCategoryObject</b></em>'
   * @generated
   */
  public EDataType getTopicCategoryObjectEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(TOPICCATEGORYOBJECT_CLASSIFIER_ID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClassifier
   *          the {@link EClassifier}
   * @return the class implementing a specific {@link EClass}.
   * @generated
   */
  @Override
  public Class<?> getEClassifierClass(EClassifier eClassifier) {
    switch (eClassifier.getClassifierID()) {
    case FORUM_CLASSIFIER_ID:
      return Forum.class;
    case MEMBER_CLASSIFIER_ID:
      return Member.class;
    case TOPIC_CLASSIFIER_ID:
      return Topic.class;
    case POST_CLASSIFIER_ID:
      return Post.class;
    case TOPICCATEGORY_CLASSIFIER_ID:
      return TopicCategory.class;
    case TOPICCATEGORYOBJECT_CLASSIFIER_ID:
      return TopicCategory.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
