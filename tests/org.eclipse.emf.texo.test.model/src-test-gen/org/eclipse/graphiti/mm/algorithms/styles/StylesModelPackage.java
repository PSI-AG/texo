package org.eclipse.graphiti.mm.algorithms.styles;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.graphiti.mm.MmModelPackage;
import org.eclipse.graphiti.mm.algorithms.AlgorithmsModelPackage;
import org.eclipse.graphiti.mm.algorithms.styles.dao.AbstractStyleDao;
import org.eclipse.graphiti.mm.algorithms.styles.dao.AdaptedGradientColoredAreasDao;
import org.eclipse.graphiti.mm.algorithms.styles.dao.ColorDao;
import org.eclipse.graphiti.mm.algorithms.styles.dao.FontDao;
import org.eclipse.graphiti.mm.algorithms.styles.dao.GradientColoredAreaDao;
import org.eclipse.graphiti.mm.algorithms.styles.dao.GradientColoredAreasDao;
import org.eclipse.graphiti.mm.algorithms.styles.dao.GradientColoredLocationDao;
import org.eclipse.graphiti.mm.algorithms.styles.dao.PointDao;
import org.eclipse.graphiti.mm.algorithms.styles.dao.PrecisionPointDao;
import org.eclipse.graphiti.mm.algorithms.styles.dao.RenderingStyleDao;
import org.eclipse.graphiti.mm.algorithms.styles.dao.StyleDao;
import org.eclipse.graphiti.mm.algorithms.styles.dao.TextStyleDao;
import org.eclipse.graphiti.mm.algorithms.styles.dao.TextStyleRegionDao;

/**
 * The <b>Package</b> for the model '<em><b>styles</b></em>'. It contains initialization code and access to the Factory
 * to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class StylesModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://eclipse.org/graphiti/mm/algorithms/styles";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final StylesModelFactory MODELFACTORY = new StylesModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ORIENTATION_CLASSIFIER_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LINESTYLE_CLASSIFIER_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOCATIONTYPE_CLASSIFIER_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNDERLINESTYLE_CLASSIFIER_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_STYLES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_ID_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_DESCRIPTION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_FONT_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_HORIZONTALALIGNMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_VERTICALALIGNMENT_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_ANGLE_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_STRETCHH_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_STRETCHV_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_PROPORTIONAL_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_STYLECONTAINER_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_BACKGROUND_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_FOREGROUND_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_LINEWIDTH_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_LINESTYLE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_FILLED_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_LINEVISIBLE_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_RENDERINGSTYLE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLE_TRANSPARENCY_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTYLE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTYLE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTYLE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTYLE_BACKGROUND_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTYLE_FOREGROUND_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTYLE_LINEWIDTH_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTYLE_LINESTYLE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTYLE_FILLED_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTYLE_LINEVISIBLE_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTYLE_RENDERINGSTYLE_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTSTYLE_TRANSPARENCY_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLOR_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLOR_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLOR_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLOR_RED_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLOR_GREEN_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLOR_BLUE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FONT_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FONT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FONT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FONT_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FONT_SIZE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FONT_ITALIC_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FONT_BOLD_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POINT_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POINT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POINT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POINT_X_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POINT_Y_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POINT_BEFORE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POINT_AFTER_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRECISIONPOINT_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRECISIONPOINT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRECISIONPOINT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRECISIONPOINT_X_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRECISIONPOINT_Y_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLEREGION_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLEREGION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLEREGION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLEREGION_START_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLEREGION_END_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLEREGION_STYLE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENDERINGSTYLE_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENDERINGSTYLE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENDERINGSTYLE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENDERINGSTYLE_ADAPTEDGRADIENTCOLOREDAREAS_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADAPTEDGRADIENTCOLOREDAREAS_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADAPTEDGRADIENTCOLOREDAREAS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADAPTEDGRADIENTCOLOREDAREAS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADAPTEDGRADIENTCOLOREDAREAS_DEFINEDSTYLEID_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADAPTEDGRADIENTCOLOREDAREAS_ADAPTEDGRADIENTCOLOREDAREAS_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADAPTEDGRADIENTCOLOREDAREAS_GRADIENTTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDLOCATION_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDLOCATION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDLOCATION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDLOCATION_LOCATIONTYPE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDLOCATION_LOCATIONVALUE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDLOCATION_COLOR_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDAREA_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDAREA_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDAREA_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDAREA_START_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDAREA_END_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDAREAS_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDAREAS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDAREAS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDAREAS_GRADIENTCOLOR_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRADIENTCOLOREDAREAS_STYLEADAPTION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLE_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLE_UNDERLINE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLE_UNDERLINESTYLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLE_STRIKEOUT_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLE_FONT_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLE_FOREGROUND_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLE_BACKGROUND_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLE_UNDERLINECOLOR_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXTSTYLE_STRIKEOUTCOLOR_FEATURE_ID = 9;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final StylesModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static StylesModelPackage initialize() {

    if (isInitialized) {
      return (StylesModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final StylesModelPackage modelPackage = new StylesModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    AlgorithmsModelPackage.initialize();
    IdentifiableModelPackage.initialize();
    MmModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Style.class, modelPackage.getStyleEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractStyle.class, modelPackage.getAbstractStyleEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Color.class, modelPackage.getColorEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Font.class, modelPackage.getFontEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Point.class, modelPackage.getPointEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PrecisionPoint.class, modelPackage.getPrecisionPointEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TextStyleRegion.class,
        modelPackage.getTextStyleRegionEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RenderingStyle.class, modelPackage.getRenderingStyleEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AdaptedGradientColoredAreas.class,
        modelPackage.getAdaptedGradientColoredAreasEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(GradientColoredLocation.class,
        modelPackage.getGradientColoredLocationEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(GradientColoredArea.class,
        modelPackage.getGradientColoredAreaEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(GradientColoredAreas.class,
        modelPackage.getGradientColoredAreasEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TextStyle.class, modelPackage.getTextStyleEClass(),
        modelPackage);

    ModelResolver.getInstance().registerClassModelMapping(Orientation.class, modelPackage.getOrientationEEnum(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(LineStyle.class, modelPackage.getLineStyleEEnum(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(LocationType.class, modelPackage.getLocationTypeEEnum(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UnderlineStyle.class, modelPackage.getUnderlineStyleEEnum(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(Style.class, StyleDao.class);
    DaoRegistry.getInstance().registerDao(AbstractStyle.class, AbstractStyleDao.class);
    DaoRegistry.getInstance().registerDao(Color.class, ColorDao.class);
    DaoRegistry.getInstance().registerDao(Font.class, FontDao.class);
    DaoRegistry.getInstance().registerDao(Point.class, PointDao.class);
    DaoRegistry.getInstance().registerDao(PrecisionPoint.class, PrecisionPointDao.class);
    DaoRegistry.getInstance().registerDao(TextStyleRegion.class, TextStyleRegionDao.class);
    DaoRegistry.getInstance().registerDao(RenderingStyle.class, RenderingStyleDao.class);
    DaoRegistry.getInstance().registerDao(AdaptedGradientColoredAreas.class, AdaptedGradientColoredAreasDao.class);
    DaoRegistry.getInstance().registerDao(GradientColoredLocation.class, GradientColoredLocationDao.class);
    DaoRegistry.getInstance().registerDao(GradientColoredArea.class, GradientColoredAreaDao.class);
    DaoRegistry.getInstance().registerDao(GradientColoredAreas.class, GradientColoredAreasDao.class);
    DaoRegistry.getInstance().registerDao(TextStyle.class, TextStyleDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link StylesModelFactory} instance.
   * @generated
   */
  @Override
  public StylesModelFactory getModelFactory() {
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
    return "styles.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Style</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Style</b></em>'
   * @generated
   */
  public EClass getStyleEClass() {
    return (EClass) getEPackage().getEClassifiers().get(STYLE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.id</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.id</b></em>'.
   * @generated
   */
  public EAttribute getStyle_Id() {
    return (EAttribute) getStyleEClass().getEAllStructuralFeatures().get(STYLE_ID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.description</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.description</b></em>'.
   * @generated
   */
  public EAttribute getStyle_Description() {
    return (EAttribute) getStyleEClass().getEAllStructuralFeatures().get(STYLE_DESCRIPTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.font</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.font</b></em>'.
   * @generated
   */
  public EReference getStyle_Font() {
    return (EReference) getStyleEClass().getEAllStructuralFeatures().get(STYLE_FONT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.horizontalAlignment</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.horizontalAlignment</b></em>'.
   * @generated
   */
  public EAttribute getStyle_HorizontalAlignment() {
    return (EAttribute) getStyleEClass().getEAllStructuralFeatures().get(STYLE_HORIZONTALALIGNMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.verticalAlignment</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.verticalAlignment</b></em>'.
   * @generated
   */
  public EAttribute getStyle_VerticalAlignment() {
    return (EAttribute) getStyleEClass().getEAllStructuralFeatures().get(STYLE_VERTICALALIGNMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.angle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.angle</b></em>'.
   * @generated
   */
  public EAttribute getStyle_Angle() {
    return (EAttribute) getStyleEClass().getEAllStructuralFeatures().get(STYLE_ANGLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.stretchH</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.stretchH</b></em>'.
   * @generated
   */
  public EAttribute getStyle_StretchH() {
    return (EAttribute) getStyleEClass().getEAllStructuralFeatures().get(STYLE_STRETCHH_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.stretchV</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.stretchV</b></em>'.
   * @generated
   */
  public EAttribute getStyle_StretchV() {
    return (EAttribute) getStyleEClass().getEAllStructuralFeatures().get(STYLE_STRETCHV_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.proportional</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.proportional</b></em>'.
   * @generated
   */
  public EAttribute getStyle_Proportional() {
    return (EAttribute) getStyleEClass().getEAllStructuralFeatures().get(STYLE_PROPORTIONAL_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.styleContainer</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.styleContainer</b></em>'.
   * @generated
   */
  public EReference getStyle_StyleContainer() {
    return (EReference) getStyleEClass().getEAllStructuralFeatures().get(STYLE_STYLECONTAINER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.background</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.background</b></em>'.
   * @generated
   */
  public EReference getStyle_Background() {
    return (EReference) getStyleEClass().getEAllStructuralFeatures().get(STYLE_BACKGROUND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.foreground</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.foreground</b></em>'.
   * @generated
   */
  public EReference getStyle_Foreground() {
    return (EReference) getStyleEClass().getEAllStructuralFeatures().get(STYLE_FOREGROUND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.lineWidth</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.lineWidth</b></em>'.
   * @generated
   */
  public EAttribute getStyle_LineWidth() {
    return (EAttribute) getStyleEClass().getEAllStructuralFeatures().get(STYLE_LINEWIDTH_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.lineStyle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.lineStyle</b></em>'.
   * @generated
   */
  public EAttribute getStyle_LineStyle() {
    return (EAttribute) getStyleEClass().getEAllStructuralFeatures().get(STYLE_LINESTYLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.filled</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.filled</b></em>'.
   * @generated
   */
  public EAttribute getStyle_Filled() {
    return (EAttribute) getStyleEClass().getEAllStructuralFeatures().get(STYLE_FILLED_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.lineVisible</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.lineVisible</b></em>'.
   * @generated
   */
  public EAttribute getStyle_LineVisible() {
    return (EAttribute) getStyleEClass().getEAllStructuralFeatures().get(STYLE_LINEVISIBLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.renderingStyle</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.renderingStyle</b></em>'.
   * @generated
   */
  public EReference getStyle_RenderingStyle() {
    return (EReference) getStyleEClass().getEAllStructuralFeatures().get(STYLE_RENDERINGSTYLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Style.transparency</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Style.transparency</b></em>'.
   * @generated
   */
  public EAttribute getStyle_Transparency() {
    return (EAttribute) getStyleEClass().getEAllStructuralFeatures().get(STYLE_TRANSPARENCY_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractStyle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractStyle</b></em>'
   * @generated
   */
  public EClass getAbstractStyleEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTSTYLE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractStyle.background</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractStyle.background</b></em>'.
   * @generated
   */
  public EReference getAbstractStyle_Background() {
    return (EReference) getAbstractStyleEClass().getEAllStructuralFeatures().get(ABSTRACTSTYLE_BACKGROUND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractStyle.foreground</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractStyle.foreground</b></em>'.
   * @generated
   */
  public EReference getAbstractStyle_Foreground() {
    return (EReference) getAbstractStyleEClass().getEAllStructuralFeatures().get(ABSTRACTSTYLE_FOREGROUND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractStyle.lineWidth</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractStyle.lineWidth</b></em>'.
   * @generated
   */
  public EAttribute getAbstractStyle_LineWidth() {
    return (EAttribute) getAbstractStyleEClass().getEAllStructuralFeatures().get(ABSTRACTSTYLE_LINEWIDTH_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractStyle.lineStyle</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractStyle.lineStyle</b></em>'.
   * @generated
   */
  public EAttribute getAbstractStyle_LineStyle() {
    return (EAttribute) getAbstractStyleEClass().getEAllStructuralFeatures().get(ABSTRACTSTYLE_LINESTYLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractStyle.filled</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractStyle.filled</b></em>'.
   * @generated
   */
  public EAttribute getAbstractStyle_Filled() {
    return (EAttribute) getAbstractStyleEClass().getEAllStructuralFeatures().get(ABSTRACTSTYLE_FILLED_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractStyle.lineVisible</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractStyle.lineVisible</b></em>'.
   * @generated
   */
  public EAttribute getAbstractStyle_LineVisible() {
    return (EAttribute) getAbstractStyleEClass().getEAllStructuralFeatures().get(ABSTRACTSTYLE_LINEVISIBLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractStyle.renderingStyle</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractStyle.renderingStyle</b></em>'.
   * @generated
   */
  public EReference getAbstractStyle_RenderingStyle() {
    return (EReference) getAbstractStyleEClass().getEAllStructuralFeatures().get(
        ABSTRACTSTYLE_RENDERINGSTYLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractStyle.transparency</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractStyle.transparency</b></em>'.
   * @generated
   */
  public EAttribute getAbstractStyle_Transparency() {
    return (EAttribute) getAbstractStyleEClass().getEAllStructuralFeatures().get(ABSTRACTSTYLE_TRANSPARENCY_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Color</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Color</b></em>'
   * @generated
   */
  public EClass getColorEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COLOR_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Color.red</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Color.red</b></em>'.
   * @generated
   */
  public EAttribute getColor_Red() {
    return (EAttribute) getColorEClass().getEAllStructuralFeatures().get(COLOR_RED_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Color.green</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Color.green</b></em>'.
   * @generated
   */
  public EAttribute getColor_Green() {
    return (EAttribute) getColorEClass().getEAllStructuralFeatures().get(COLOR_GREEN_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Color.blue</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Color.blue</b></em>'.
   * @generated
   */
  public EAttribute getColor_Blue() {
    return (EAttribute) getColorEClass().getEAllStructuralFeatures().get(COLOR_BLUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Font</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Font</b></em>'
   * @generated
   */
  public EClass getFontEClass() {
    return (EClass) getEPackage().getEClassifiers().get(FONT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Font.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Font.name</b></em>'.
   * @generated
   */
  public EAttribute getFont_Name() {
    return (EAttribute) getFontEClass().getEAllStructuralFeatures().get(FONT_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Font.size</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Font.size</b></em>'.
   * @generated
   */
  public EAttribute getFont_Size() {
    return (EAttribute) getFontEClass().getEAllStructuralFeatures().get(FONT_SIZE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Font.italic</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Font.italic</b></em>'.
   * @generated
   */
  public EAttribute getFont_Italic() {
    return (EAttribute) getFontEClass().getEAllStructuralFeatures().get(FONT_ITALIC_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Font.bold</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Font.bold</b></em>'.
   * @generated
   */
  public EAttribute getFont_Bold() {
    return (EAttribute) getFontEClass().getEAllStructuralFeatures().get(FONT_BOLD_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Point</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Point</b></em>'
   * @generated
   */
  public EClass getPointEClass() {
    return (EClass) getEPackage().getEClassifiers().get(POINT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Point.x</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Point.x</b></em>'.
   * @generated
   */
  public EAttribute getPoint_X() {
    return (EAttribute) getPointEClass().getEAllStructuralFeatures().get(POINT_X_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Point.y</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Point.y</b></em>'.
   * @generated
   */
  public EAttribute getPoint_Y() {
    return (EAttribute) getPointEClass().getEAllStructuralFeatures().get(POINT_Y_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Point.before</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Point.before</b></em>'.
   * @generated
   */
  public EAttribute getPoint_Before() {
    return (EAttribute) getPointEClass().getEAllStructuralFeatures().get(POINT_BEFORE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Point.after</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Point.after</b></em>'.
   * @generated
   */
  public EAttribute getPoint_After() {
    return (EAttribute) getPointEClass().getEAllStructuralFeatures().get(POINT_AFTER_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PrecisionPoint</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PrecisionPoint</b></em>'
   * @generated
   */
  public EClass getPrecisionPointEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PRECISIONPOINT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PrecisionPoint.x</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PrecisionPoint.x</b></em>'.
   * @generated
   */
  public EAttribute getPrecisionPoint_X() {
    return (EAttribute) getPrecisionPointEClass().getEAllStructuralFeatures().get(PRECISIONPOINT_X_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PrecisionPoint.y</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PrecisionPoint.y</b></em>'.
   * @generated
   */
  public EAttribute getPrecisionPoint_Y() {
    return (EAttribute) getPrecisionPointEClass().getEAllStructuralFeatures().get(PRECISIONPOINT_Y_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TextStyleRegion</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TextStyleRegion</b></em>'
   * @generated
   */
  public EClass getTextStyleRegionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TEXTSTYLEREGION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TextStyleRegion.start</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TextStyleRegion.start</b></em>'.
   * @generated
   */
  public EAttribute getTextStyleRegion_Start() {
    return (EAttribute) getTextStyleRegionEClass().getEAllStructuralFeatures().get(TEXTSTYLEREGION_START_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TextStyleRegion.end</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TextStyleRegion.end</b></em>'.
   * @generated
   */
  public EAttribute getTextStyleRegion_End() {
    return (EAttribute) getTextStyleRegionEClass().getEAllStructuralFeatures().get(TEXTSTYLEREGION_END_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TextStyleRegion.style</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TextStyleRegion.style</b></em>'.
   * @generated
   */
  public EReference getTextStyleRegion_Style() {
    return (EReference) getTextStyleRegionEClass().getEAllStructuralFeatures().get(TEXTSTYLEREGION_STYLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RenderingStyle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RenderingStyle</b></em>'
   * @generated
   */
  public EClass getRenderingStyleEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RENDERINGSTYLE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RenderingStyle.adaptedGradientColoredAreas</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RenderingStyle.adaptedGradientColoredAreas</b></em>
   *         '.
   * @generated
   */
  public EReference getRenderingStyle_AdaptedGradientColoredAreas() {
    return (EReference) getRenderingStyleEClass().getEAllStructuralFeatures().get(
        RENDERINGSTYLE_ADAPTEDGRADIENTCOLOREDAREAS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AdaptedGradientColoredAreas</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AdaptedGradientColoredAreas</b></em>'
   * @generated
   */
  public EClass getAdaptedGradientColoredAreasEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ADAPTEDGRADIENTCOLOREDAREAS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AdaptedGradientColoredAreas.definedStyleId</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AdaptedGradientColoredAreas.definedStyleId</b></em>
   *         '.
   * @generated
   */
  public EAttribute getAdaptedGradientColoredAreas_DefinedStyleId() {
    return (EAttribute) getAdaptedGradientColoredAreasEClass().getEAllStructuralFeatures().get(
        ADAPTEDGRADIENTCOLOREDAREAS_DEFINEDSTYLEID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AdaptedGradientColoredAreas.adaptedGradientColoredAreas</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '
   *         <em><b>AdaptedGradientColoredAreas.adaptedGradientColoredAreas</b></em>'.
   * @generated
   */
  public EReference getAdaptedGradientColoredAreas_AdaptedGradientColoredAreas() {
    return (EReference) getAdaptedGradientColoredAreasEClass().getEAllStructuralFeatures().get(
        ADAPTEDGRADIENTCOLOREDAREAS_ADAPTEDGRADIENTCOLOREDAREAS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AdaptedGradientColoredAreas.gradientType</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AdaptedGradientColoredAreas.gradientType</b></em>'.
   * @generated
   */
  public EAttribute getAdaptedGradientColoredAreas_GradientType() {
    return (EAttribute) getAdaptedGradientColoredAreasEClass().getEAllStructuralFeatures().get(
        ADAPTEDGRADIENTCOLOREDAREAS_GRADIENTTYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>GradientColoredLocation</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>GradientColoredLocation</b></em>'
   * @generated
   */
  public EClass getGradientColoredLocationEClass() {
    return (EClass) getEPackage().getEClassifiers().get(GRADIENTCOLOREDLOCATION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GradientColoredLocation.locationType</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GradientColoredLocation.locationType</b></em>'.
   * @generated
   */
  public EAttribute getGradientColoredLocation_LocationType() {
    return (EAttribute) getGradientColoredLocationEClass().getEAllStructuralFeatures().get(
        GRADIENTCOLOREDLOCATION_LOCATIONTYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GradientColoredLocation.locationValue</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GradientColoredLocation.locationValue</b></em>'.
   * @generated
   */
  public EAttribute getGradientColoredLocation_LocationValue() {
    return (EAttribute) getGradientColoredLocationEClass().getEAllStructuralFeatures().get(
        GRADIENTCOLOREDLOCATION_LOCATIONVALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GradientColoredLocation.color</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GradientColoredLocation.color</b></em>'.
   * @generated
   */
  public EReference getGradientColoredLocation_Color() {
    return (EReference) getGradientColoredLocationEClass().getEAllStructuralFeatures().get(
        GRADIENTCOLOREDLOCATION_COLOR_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>GradientColoredArea</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>GradientColoredArea</b></em>'
   * @generated
   */
  public EClass getGradientColoredAreaEClass() {
    return (EClass) getEPackage().getEClassifiers().get(GRADIENTCOLOREDAREA_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GradientColoredArea.start</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GradientColoredArea.start</b></em>'.
   * @generated
   */
  public EReference getGradientColoredArea_Start() {
    return (EReference) getGradientColoredAreaEClass().getEAllStructuralFeatures().get(
        GRADIENTCOLOREDAREA_START_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GradientColoredArea.end</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GradientColoredArea.end</b></em>'.
   * @generated
   */
  public EReference getGradientColoredArea_End() {
    return (EReference) getGradientColoredAreaEClass().getEAllStructuralFeatures().get(
        GRADIENTCOLOREDAREA_END_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>GradientColoredAreas</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>GradientColoredAreas</b></em>'
   * @generated
   */
  public EClass getGradientColoredAreasEClass() {
    return (EClass) getEPackage().getEClassifiers().get(GRADIENTCOLOREDAREAS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GradientColoredAreas.gradientColor</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GradientColoredAreas.gradientColor</b></em>'.
   * @generated
   */
  public EReference getGradientColoredAreas_GradientColor() {
    return (EReference) getGradientColoredAreasEClass().getEAllStructuralFeatures().get(
        GRADIENTCOLOREDAREAS_GRADIENTCOLOR_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GradientColoredAreas.styleAdaption</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GradientColoredAreas.styleAdaption</b></em>'.
   * @generated
   */
  public EAttribute getGradientColoredAreas_StyleAdaption() {
    return (EAttribute) getGradientColoredAreasEClass().getEAllStructuralFeatures().get(
        GRADIENTCOLOREDAREAS_STYLEADAPTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TextStyle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TextStyle</b></em>'
   * @generated
   */
  public EClass getTextStyleEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TEXTSTYLE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TextStyle.underline</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TextStyle.underline</b></em>'.
   * @generated
   */
  public EAttribute getTextStyle_Underline() {
    return (EAttribute) getTextStyleEClass().getEAllStructuralFeatures().get(TEXTSTYLE_UNDERLINE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TextStyle.underlineStyle</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TextStyle.underlineStyle</b></em>'.
   * @generated
   */
  public EAttribute getTextStyle_UnderlineStyle() {
    return (EAttribute) getTextStyleEClass().getEAllStructuralFeatures().get(TEXTSTYLE_UNDERLINESTYLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TextStyle.strikeout</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TextStyle.strikeout</b></em>'.
   * @generated
   */
  public EAttribute getTextStyle_Strikeout() {
    return (EAttribute) getTextStyleEClass().getEAllStructuralFeatures().get(TEXTSTYLE_STRIKEOUT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TextStyle.font</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TextStyle.font</b></em>'.
   * @generated
   */
  public EReference getTextStyle_Font() {
    return (EReference) getTextStyleEClass().getEAllStructuralFeatures().get(TEXTSTYLE_FONT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TextStyle.foreground</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TextStyle.foreground</b></em>'.
   * @generated
   */
  public EReference getTextStyle_Foreground() {
    return (EReference) getTextStyleEClass().getEAllStructuralFeatures().get(TEXTSTYLE_FOREGROUND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TextStyle.background</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TextStyle.background</b></em>'.
   * @generated
   */
  public EReference getTextStyle_Background() {
    return (EReference) getTextStyleEClass().getEAllStructuralFeatures().get(TEXTSTYLE_BACKGROUND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TextStyle.underlineColor</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TextStyle.underlineColor</b></em>'.
   * @generated
   */
  public EReference getTextStyle_UnderlineColor() {
    return (EReference) getTextStyleEClass().getEAllStructuralFeatures().get(TEXTSTYLE_UNDERLINECOLOR_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TextStyle.strikeoutColor</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TextStyle.strikeoutColor</b></em>'.
   * @generated
   */
  public EReference getTextStyle_StrikeoutColor() {
    return (EReference) getTextStyleEClass().getEAllStructuralFeatures().get(TEXTSTYLE_STRIKEOUTCOLOR_FEATURE_ID);
  }

  /**
   * Returns the EEnum '<em><b>Orientation</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>Orientation</b></em>'
   * @generated
   */
  public EEnum getOrientationEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(ORIENTATION_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>LineStyle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>LineStyle</b></em>'
   * @generated
   */
  public EEnum getLineStyleEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(LINESTYLE_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>LocationType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>LocationType</b></em>'
   * @generated
   */
  public EEnum getLocationTypeEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(LOCATIONTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>UnderlineStyle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>UnderlineStyle</b></em>'
   * @generated
   */
  public EEnum getUnderlineStyleEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(UNDERLINESTYLE_CLASSIFIER_ID);
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
    case STYLE_CLASSIFIER_ID:
      return Style.class;
    case ABSTRACTSTYLE_CLASSIFIER_ID:
      return AbstractStyle.class;
    case COLOR_CLASSIFIER_ID:
      return Color.class;
    case FONT_CLASSIFIER_ID:
      return Font.class;
    case POINT_CLASSIFIER_ID:
      return Point.class;
    case PRECISIONPOINT_CLASSIFIER_ID:
      return PrecisionPoint.class;
    case TEXTSTYLEREGION_CLASSIFIER_ID:
      return TextStyleRegion.class;
    case RENDERINGSTYLE_CLASSIFIER_ID:
      return RenderingStyle.class;
    case ADAPTEDGRADIENTCOLOREDAREAS_CLASSIFIER_ID:
      return AdaptedGradientColoredAreas.class;
    case GRADIENTCOLOREDLOCATION_CLASSIFIER_ID:
      return GradientColoredLocation.class;
    case GRADIENTCOLOREDAREA_CLASSIFIER_ID:
      return GradientColoredArea.class;
    case GRADIENTCOLOREDAREAS_CLASSIFIER_ID:
      return GradientColoredAreas.class;
    case TEXTSTYLE_CLASSIFIER_ID:
      return TextStyle.class;
    case ORIENTATION_CLASSIFIER_ID:
      return Orientation.class;
    case LINESTYLE_CLASSIFIER_ID:
      return LineStyle.class;
    case LOCATIONTYPE_CLASSIFIER_ID:
      return LocationType.class;
    case UNDERLINESTYLE_CLASSIFIER_ID:
      return UnderlineStyle.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
