package org.eclipse.emf.texo.test.model.samples.forum;

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
 * The <b>{@link ModelFactory}</b> for the types of this model: org.eclipse.emf.texo.test.model.samples.forum. It
 * contains code to create instances {@link ModelObject} wrappers and instances for EClasses and convert objects back
 * and forth from their String (XML) representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ForumModelFactory implements ModelFactory {

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
    case ForumModelPackage.FORUM_CLASSIFIER_ID:
      return createForum();
    case ForumModelPackage.MEMBER_CLASSIFIER_ID:
      return createMember();
    case ForumModelPackage.TOPIC_CLASSIFIER_ID:
      return createTopic();
    case ForumModelPackage.POST_CLASSIFIER_ID:
      return createPost();
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
    case ForumModelPackage.FORUM_CLASSIFIER_ID:
      modelObject = new ForumModelObject();
      break;
    case ForumModelPackage.MEMBER_CLASSIFIER_ID:
      modelObject = new MemberModelObject();
      break;
    case ForumModelPackage.TOPIC_CLASSIFIER_ID:
      modelObject = new TopicModelObject();
      break;
    case ForumModelPackage.POST_CLASSIFIER_ID:
      modelObject = new PostModelObject();
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
   * @return an instance of the model object representing the EClass Forum
   * @generated
   */
  public Forum createForum() {
    return new Forum();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Member
   * @generated
   */
  public Member createMember() {
    return new Member();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Topic
   * @generated
   */
  public Topic createTopic() {
    return new Topic();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Post
   * @generated
   */
  public Post createPost() {
    return new Post();
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
    case ForumModelPackage.TOPICCATEGORY_CLASSIFIER_ID:
      return createTopicCategoryFromString(value);
    case ForumModelPackage.TOPICCATEGORYOBJECT_CLASSIFIER_ID:
      return createTopicCategoryObjectFromString(value);
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
    case ForumModelPackage.TOPICCATEGORY_CLASSIFIER_ID:
      return convertTopicCategoryToString((TopicCategory) value);
    case ForumModelPackage.TOPICCATEGORYOBJECT_CLASSIFIER_ID:
      return convertTopicCategoryObjectToString((TopicCategory) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: TopicCategory to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertTopicCategoryToString(TopicCategory value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: TopicCategory from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public TopicCategory createTopicCategoryFromString(String value) {
    if (value == null) {
      return null;
    }
    return TopicCategory.get(value);
  }

  /**
   * Converts the EDataType: TopicCategoryObject to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertTopicCategoryObjectToString(TopicCategory value) {
    if (value == null) {
      return null;
    }
    return convertTopicCategoryToString(value);
  }

  /**
   * Creates an instance of the EDataType: TopicCategoryObject from a String. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public TopicCategory createTopicCategoryObjectFromString(String value) {
    if (value == null) {
      return null;
    }
    return createTopicCategoryFromString(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Forum</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ForumModelObject<E extends Forum> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ForumModelPackage.INSTANCE.getForumEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ForumModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ForumModelPackage.FORUM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ForumModelPackage.FORUM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ForumModelPackage.FORUM_TITLE_FEATURE_ID:
        return getTarget().getTitle();
      case ForumModelPackage.FORUM_MEMBERS_FEATURE_ID:
        return getTarget().getMembers();
      case ForumModelPackage.FORUM_TOPICS_FEATURE_ID:
        return getTarget().getTopics();
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
      case ForumModelPackage.FORUM_TITLE_FEATURE_ID:
        getTarget().setTitle((String) value);
        return;
      case ForumModelPackage.FORUM_MEMBERS_FEATURE_ID:
        getTarget().setMembers((List<Member>) value);
        return;
      case ForumModelPackage.FORUM_TOPICS_FEATURE_ID:
        getTarget().setTopics((List<Topic>) value);
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

      case ForumModelPackage.FORUM_MEMBERS_FEATURE_ID:
        return getTarget().addToMembers((Member) value);

      case ForumModelPackage.FORUM_TOPICS_FEATURE_ID:
        return getTarget().addToTopics((Topic) value);
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

      case ForumModelPackage.FORUM_MEMBERS_FEATURE_ID:
        return getTarget().removeFromMembers((Member) value);

      case ForumModelPackage.FORUM_TOPICS_FEATURE_ID:
        return getTarget().removeFromTopics((Topic) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Member</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MemberModelObject<E extends Member> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ForumModelPackage.INSTANCE.getMemberEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ForumModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ForumModelPackage.MEMBER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ForumModelPackage.MEMBER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ForumModelPackage.MEMBER_NICKNAME_FEATURE_ID:
        return getTarget().getNickname();
      case ForumModelPackage.MEMBER_POSTS_FEATURE_ID:
        return getTarget().getPosts();
      case ForumModelPackage.MEMBER_CREATED_FEATURE_ID:
        return getTarget().getCreated();
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
      case ForumModelPackage.MEMBER_NICKNAME_FEATURE_ID:
        getTarget().setNickname((String) value);
        return;
      case ForumModelPackage.MEMBER_POSTS_FEATURE_ID:
        getTarget().setPosts((List<Post>) value);
        return;
      case ForumModelPackage.MEMBER_CREATED_FEATURE_ID:
        getTarget().setCreated((List<Topic>) value);
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

      case ForumModelPackage.MEMBER_POSTS_FEATURE_ID:
        return getTarget().addToPosts((Post) value);

      case ForumModelPackage.MEMBER_CREATED_FEATURE_ID:
        return getTarget().addToCreated((Topic) value);
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

      case ForumModelPackage.MEMBER_POSTS_FEATURE_ID:
        return getTarget().removeFromPosts((Post) value);

      case ForumModelPackage.MEMBER_CREATED_FEATURE_ID:
        return getTarget().removeFromCreated((Topic) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Topic</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TopicModelObject<E extends Topic> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ForumModelPackage.INSTANCE.getTopicEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ForumModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ForumModelPackage.TOPIC_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ForumModelPackage.TOPIC_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ForumModelPackage.TOPIC_TITLE_FEATURE_ID:
        return getTarget().getTitle();
      case ForumModelPackage.TOPIC_CATEGORY_FEATURE_ID:
        return getTarget().getCategory();
      case ForumModelPackage.TOPIC_CREATOR_FEATURE_ID:
        return getTarget().getCreator();
      case ForumModelPackage.TOPIC_POSTS_FEATURE_ID:
        return getTarget().getPosts();
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
      case ForumModelPackage.TOPIC_TITLE_FEATURE_ID:
        getTarget().setTitle((String) value);
        return;
      case ForumModelPackage.TOPIC_CATEGORY_FEATURE_ID:
        getTarget().setCategory((TopicCategory) value);
        return;
      case ForumModelPackage.TOPIC_CREATOR_FEATURE_ID:
        getTarget().setCreator((Member) value);
        return;
      case ForumModelPackage.TOPIC_POSTS_FEATURE_ID:
        getTarget().setPosts((List<Post>) value);
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

      case ForumModelPackage.TOPIC_POSTS_FEATURE_ID:
        return getTarget().addToPosts((Post) value);
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

      case ForumModelPackage.TOPIC_POSTS_FEATURE_ID:
        return getTarget().removeFromPosts((Post) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Post</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PostModelObject<E extends Post> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ForumModelPackage.INSTANCE.getPostEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ForumModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ForumModelPackage.POST_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ForumModelPackage.POST_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ForumModelPackage.POST_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case ForumModelPackage.POST_AUTHOR_FEATURE_ID:
        return getTarget().getAuthor();
      case ForumModelPackage.POST_TOPIC_FEATURE_ID:
        return getTarget().getTopic();
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
      case ForumModelPackage.POST_COMMENT_FEATURE_ID:
        getTarget().setComment((String) value);
        return;
      case ForumModelPackage.POST_AUTHOR_FEATURE_ID:
        getTarget().setAuthor((Member) value);
        return;
      case ForumModelPackage.POST_TOPIC_FEATURE_ID:
        getTarget().setTopic((Topic) value);
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