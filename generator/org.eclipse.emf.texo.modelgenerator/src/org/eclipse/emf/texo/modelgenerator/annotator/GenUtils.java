/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *   IBM - getInstanceClass method
 *
 * </copyright>
 *
 * $Id: GenUtils.java,v 1.16 2011/08/25 12:35:07 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.annotator;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.generator.AnnotationManager;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EEnumModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;
import org.eclipse.emf.texo.utils.Check;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.eclipse.xsd.ecore.NameMangler;

/**
 * Utility methods for code/ui generation. Contains methods for default value computation and type computation for
 * EDataTypes.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class GenUtils {

  private static final HashSet<String> javaWords;

  static {
    javaWords = new HashSet<String>(50);
    javaWords.add("true"); //$NON-NLS-1$
    javaWords.add("false"); //$NON-NLS-1$
    javaWords.add("abstract"); //$NON-NLS-1$
    javaWords.add("continue");//$NON-NLS-1$
    javaWords.add("for");//$NON-NLS-1$
    javaWords.add("new");//$NON-NLS-1$
    javaWords.add("switch");//$NON-NLS-1$
    javaWords.add("assert");//$NON-NLS-1$
    javaWords.add("default");//$NON-NLS-1$
    javaWords.add("goto");//$NON-NLS-1$
    javaWords.add("package");//$NON-NLS-1$
    javaWords.add("synchronized");//$NON-NLS-1$
    javaWords.add("boolean");//$NON-NLS-1$
    javaWords.add("do");//$NON-NLS-1$
    javaWords.add("if");//$NON-NLS-1$
    javaWords.add("private");//$NON-NLS-1$
    javaWords.add("this");//$NON-NLS-1$
    javaWords.add("break");//$NON-NLS-1$
    javaWords.add("double");//$NON-NLS-1$
    javaWords.add("implements");//$NON-NLS-1$
    javaWords.add("protected");//$NON-NLS-1$
    javaWords.add("throw");//$NON-NLS-1$
    javaWords.add("byte");//$NON-NLS-1$
    javaWords.add("else");//$NON-NLS-1$
    javaWords.add("import");//$NON-NLS-1$
    javaWords.add("public");//$NON-NLS-1$
    javaWords.add("throws");//$NON-NLS-1$
    javaWords.add("case");//$NON-NLS-1$
    javaWords.add("enum");//$NON-NLS-1$
    javaWords.add("instanceof");//$NON-NLS-1$
    javaWords.add("return");//$NON-NLS-1$
    javaWords.add("transient");//$NON-NLS-1$
    javaWords.add("catch");//$NON-NLS-1$
    javaWords.add("extends");//$NON-NLS-1$
    javaWords.add("int");//$NON-NLS-1$
    javaWords.add("short");//$NON-NLS-1$
    javaWords.add("try");//$NON-NLS-1$
    javaWords.add("char");//$NON-NLS-1$
    javaWords.add("final");//$NON-NLS-1$
    javaWords.add("interface");//$NON-NLS-1$
    javaWords.add("static");//$NON-NLS-1$
    javaWords.add("void");//$NON-NLS-1$
    javaWords.add("class");//$NON-NLS-1$
    javaWords.add("finally");//$NON-NLS-1$
    javaWords.add("long");//$NON-NLS-1$
    javaWords.add("strictfp");//$NON-NLS-1$
    javaWords.add("volatile");//$NON-NLS-1$
    javaWords.add("const");//$NON-NLS-1$
    javaWords.add("float");//$NON-NLS-1$
    javaWords.add("native");//$NON-NLS-1$
    javaWords.add("super");//$NON-NLS-1$
    javaWords.add("while");//$NON-NLS-1$
  }

  public static String cast(String type) {
    if (type == null) {
      return type;
    }
    if (type.equals(Object.class.getName())) {
      return ""; //$NON-NLS-1$
    }
    return "(" + type + ")"; //$NON-NLS-1$ //$NON-NLS-2$
  }

  public static String correctTypeDef(String type) {
    if (type == null) {
      return null;
    }
    if (type.equals(Class.class.getName())) {
      return Class.class.getName() + "<?>"; //$NON-NLS-1$
    }
    return type;
  }

  /**
   * @return true if the epackage is not a generated EMF epackage.
   * 
   *         Note will return true for the {@link EcorePackage} and {@link XMLTypePackage}. As from these packages the
   *         instance classes should be used.
   */
  public static boolean useInstanceClassNames(EPackage ePackage) {
    if (ePackage.getNsURI().equals(EcorePackage.eNS_URI) || ePackage.getNsURI().equals(XMLTypePackage.eNS_URI)) {
      return true;
    }
    return ePackage.getClass() == EPackageImpl.class;
  }

  /**
   * Determines the instance class of an EAttribute, if the EAttribute is isMany then it will return the class of the
   * elements in the collection.
   * 
   * @param eAttribute
   *          the EAttribute for which the type is computed
   * @returns the type of a many attribute
   */
  public static Class<?> getEDataTypeClass(final EDataType eDataType) {
    final Class<?> instanceClass = eDataType.getInstanceClass();
    if (instanceClass != null && !Object.class.equals(instanceClass) && !List.class.equals(instanceClass)) {
      if (instanceClass.isArray()) {
        return eDataType.getInstanceClass().getComponentType();
      }
      return instanceClass;
    }

    // the type is hidden somewhere deep get it
    // the edatatype is the java.util.list
    // it has an itemType which is the name of the element edatatype
    // which contains the instanceclass
    // takes also into account inheritance between datatypes
    // NOTE the otm.targetentity can consist of a comma delimited list
    // of target
    // entities this is required for listunion types but is not
    // supported, in that case the first one is returned
    final EDataType itemType = ExtendedMetaData.INSTANCE.getItemType(eDataType);
    if (itemType != null) {
      return itemType.getInstanceClass();
    }

    final List<EDataType> memberTypes = ExtendedMetaData.INSTANCE.getMemberTypes(eDataType);
    if (memberTypes != null && memberTypes.size() > 0) {
      return memberTypes.get(0).getInstanceClass();
    }

    return Object.class;
  }

  /**
   * @param eClassifier
   *          the eClassifier for which the name of the object type is returned.
   * @return the name of the object type if the eClassifier represents a primitive type.
   */
  public static String getPrimitiveObjectType(final EClassifier eClassifier) {
    final Class<?> instanceClass = eClassifier.getInstanceClass();
    if (instanceClass == null) {
      return null;
    }
    if (!instanceClass.isPrimitive()) {
      if (instanceClass.isArray()) {
        return instanceClass.getComponentType().getName() + "[]"; //$NON-NLS-1$
      }
      return instanceClass.getName();
    }
    final Class<?> objectClass = getObjectClass(instanceClass);
    if (objectClass != null) {
      return objectClass.getName();
    }
    return null;
  }

  /**
   * Return the object class of a primitive java class, int --> Integer, long --> Long etc. If there is no object class
   * (e.g. if the instanceClass is not a primitive java class) then null is returned.
   */
  public static Class<?> getObjectClass(Class<?> instanceClass) {
    if (XMLGregorianCalendar.class.isAssignableFrom(instanceClass)) {
      return Date.class;
    } else if (instanceClass == java.lang.Boolean.TYPE) {
      return Boolean.class;
    } else if (instanceClass == java.lang.Byte.TYPE) {
      return Byte.class;
    } else if (instanceClass == java.lang.Character.TYPE) {
      return Character.class;
    } else if (instanceClass == java.lang.Double.TYPE) {
      return Double.class;
    } else if (instanceClass == java.lang.Float.TYPE) {
      return Float.class;
    } else if (instanceClass == java.lang.Integer.TYPE) {
      return Integer.class;
    } else if (instanceClass == java.lang.Long.TYPE) {
      return Long.class;
    } else if (instanceClass == java.lang.Short.TYPE) {
      return Short.class;
    }
    return null;
  }

  /**
   * Checks if the passed word is a java reserved word.
   * 
   * @param word
   *          the word to check
   * @return in case the word is a java reserved word then it appends a _
   */
  public static String getValidJavaMemberName(final String word) {
    if (javaWords.contains(word)) {
      return lowerCaseFirst(word) + GenConstants.SAFE_NAME_POSTFIX;
    }
    return lowerCaseFirst(word);
  }

  private static String lowerCaseFirst(String value) {
    if (GeneratorUtils.isEmptyOrNull(value)) {
      return value;
    }
    if (value.length() == 1) {
      return value.toLowerCase();
    }
    return value.substring(0, 1).toLowerCase() + value.substring(1);
  }

  /**
   * Translates an EPackage nsURI into a java package name, for example http://www.elver.org/test/codegen is translated
   * to org.elver.test.codegen. If the last entry in the path is equal to the package name then that is stripped off as
   * this is added later during code generation. Uses the EMF method to translate a namespace into a java package name.
   * 
   * @param ePackage
   *          the EPackage for which the java package name is created.
   * @return a valid java package name
   * @see {@link NameMangler#qualifiedPackageName(String)}
   */
  public static String createJavaPackagePath(final String nsURI) {
    return new NameMangler().qualifiedPackageName(nsURI.toLowerCase(Locale.ENGLISH)).toLowerCase();
  }

  /**
   * Search for another file next to this URI which ends on the passed suffix.
   */
  public static String getSiblingName(final String location, final String siblingSuffix) {
    // strip the last part
    if (location.lastIndexOf(GenConstants.DOT) != -1) {
      return location.substring(0, location.lastIndexOf(GenConstants.DOT)) + siblingSuffix;
    }

    return location + siblingSuffix;
  }

  /**
   * @param eClass
   *          the eClass to check if it is the document root
   * @return true if the passed eClass is a DocumentRoot
   * @see ExtendedMetaData#getDocumentRoot(org.eclipse.emf.ecore.EPackage)
   * @see ExtendedMetaData#isDocumentRoot(EClass)
   */
  public static boolean isDocumentRoot(final EClass eClass) {
    final boolean result = ExtendedMetaData.INSTANCE.isDocumentRoot(eClass);
    return result;
  }

  /**
   * Formats a name so that it can be used as an identifier (like an enum value name) in a java source.
   * 
   * The following formatting is done:
   * <ul>
   * <li>spaces are replaced by _</li>
   * </ul>
   * 
   * @param name
   *          the name to format
   * @return the formatted name
   */
  public static String formatIdentifier(final String name) {
    return name.replaceAll(" ", "_"); //$NON-NLS-1$ //$NON-NLS-2$
  }

  /**
   * Based on the literal a default value is returned. If the literal is null then a zero length string is returned.
   * 
   * @param literal
   *          the literal defining the default value to create
   * @return a valid (from a type perspective) java default value
   */
  public static String getStaticDefaultValue(AnnotationManager annotationManager, EDataType eDataType,
      final String literal) {

    if (eDataType instanceof EEnum) {
      return getStaticDefaultValue(annotationManager, (EEnum) eDataType, literal);
    }
    if (isObjectTypeWithEnumBaseType(eDataType)) {
      final EEnum enumDataType = ModelUtils.getEnumBaseDataTypeIfObject(eDataType);
      return getStaticDefaultValue(annotationManager, enumDataType, literal);
    }

    // first check if there the type extends a base Ecore/XML type (is often
    // the case)
    final EDataType baseType = getEcoreXMLDataType(eDataType);
    if (baseType != null && !useFactoryFor(baseType)) {
      // get an object variant of the default value
      final Object value;
      if (literal == null) {
        value = baseType.getDefaultValue();
      } else {
        try {
          value = EcoreUtil.createFromString(baseType, literal);
        } catch (final Exception e) {
          // illegal value just return anything
          return "Exception: " + e.getMessage() + //$NON-NLS-1$ 
              " literal:" //$NON-NLS-1$
              + literal; // cause a syntax error
        }
      }
      if (value == null) {
        return "null"; //$NON-NLS-1$
      }

      // then translate this value to a string representation
      // if the instanceclass is there, use that as it may be a primitive
      // type
      // (the class of the value is always the object type as it is an
      // object
      if (baseType.getInstanceClass() == null) {
        return Literals.toLiteral(value.getClass(), value);
      }
      return Literals.toLiteral(baseType.getInstanceClass(), value);
    }

    // always an object type at this point
    if (literal == null) {
      return GenConstants.NULL;
    }

    // not an ecore type or must use a factory, create the call to the
    // factory in that
    // case. There are different factories. The factory for the ecore/xml
    // types is the
    // ecore/xml factory, the factory for the other types is the
    // ModelFactory.

    // the current data type is an ecore type
    if (baseType == eDataType) {
      return createEcoreFactoryCall(baseType, literal);
    }

    // finally use the modelfactory createFromString
    return createModelFactoryCall(annotationManager, eDataType, literal);
  }

  private static String getStaticDefaultValue(AnnotationManager annotationManager, EEnum eNum, final String literal) {
    final EEnumLiteral enumLiteral;
    if (literal == null || literal.trim().length() == 0) {
      enumLiteral = null;
    } else {
      enumLiteral = eNum.getEEnumLiteralByLiteral(literal);
    }
    if (enumLiteral == null) {
      // never select the first one, always return null
      return GenConstants.NULL;
    }
    final EEnumModelGenAnnotation annotation = (EEnumModelGenAnnotation) annotationManager.getAnnotation(eNum,
        ModelcodegeneratorPackage.eINSTANCE.getEEnumModelGenAnnotation());

    // NOTE: this assumes that in the template the names of the literals are upper-cased
    // this implements a strict dependency from the java code to the template, which
    // in general is undesirable but in this case unavoidable
    return annotation.getQualifiedClassName() + GenConstants.DOT + enumLiteral.getName().toUpperCase();
  }

  /**
   * Creates a call to the {@link ModelFactory#createFromString(EDataType, String)} method which is placed inside of the
   * java model template.
   * 
   * @param annotationManager
   *          used to get the {@link EPackageModelGenAnnotation}
   * @param eDataType
   *          the EDataType which defines the type
   * @param literalValue
   *          the value which is passed to the createFromString method
   * @return the call to the generated ModelFactory createFromString method
   */
  public static String createModelFactoryCall(AnnotationManager annotationManager, EDataType eDataType,
      final String literalValue) {
    final EPackageModelGenAnnotation annotation = getEPackageModelGenAnnotation(annotationManager,
        eDataType.getEPackage());
    final String pkgClassName = annotation.getQualifiedClassName();
    final StringBuilder result = new StringBuilder("(" //$NON-NLS-1$
        + getInstanceClassName(eDataType) + ")"); //$NON-NLS-1$
    result.append(pkgClassName + "." + GenConstants.MODELFACTORY_CONSTANT); //$NON-NLS-1$
    result.append(".createFromString("); //$NON-NLS-1$
    result.append(pkgClassName + ".INSTANCE.get" //$NON-NLS-1$
        + ModelUtils.upCaseFirst(eDataType.getName()) + "EDataType()"); //$NON-NLS-1$
    result.append(", "); //$NON-NLS-1$

    // special case, if the instance is not a String then don't accept
    // empty string defaults, they are always null
    final String instanceClassName = getInstanceClassName(eDataType);
    if (!String.class.getName().equals(instanceClassName) && literalValue != null && literalValue.length() == 0) {
      result.append("null"); //$NON-NLS-1$
    } else {
      result.append(Literals.toStringLiteral(literalValue));
    }
    result.append(')');
    return result.toString();
  }

  private static EPackageModelGenAnnotation getEPackageModelGenAnnotation(AnnotationManager annotationManager,
      EPackage ePackage) {
    return (EPackageModelGenAnnotation) annotationManager.getAnnotation(ePackage,
        ModelcodegeneratorPackage.eINSTANCE.getEPackageModelGenAnnotation());
  }

  /**
   * Creates a String which can be placed in the java source (through a template). The String represents a call to an
   * EFactory to create an instance of the default value passed in the literalValue.
   * 
   * @param ecoreDataType
   *          the ecore data type to create the factory call
   * @param literalValue
   *          the literal value which is passed to the EFactory to create a type-safe insfance
   * @return a String which can be placed in the java source, initializing a member
   */
  public static String createEcoreFactoryCall(final EDataType ecoreDataType, final String literalValue) {
    final StringBuilder result = new StringBuilder("(" //$NON-NLS-1$
        + getInstanceClassName(ecoreDataType) + ")"); //$NON-NLS-1$
    if (ecoreDataType.getEPackage() instanceof EcorePackage) {
      result.append(EcoreFactory.class.getName() + GenConstants.DOT_EINSTANCE);
    } else if (ecoreDataType.getEPackage() instanceof XMLTypePackage) {
      result.append(XMLTypeFactory.class.getName() + GenConstants.DOT_EINSTANCE);
    } else {
      result
          .append(ecoreDataType.getEPackage().getEFactoryInstance().getClass().getName() + GenConstants.DOT_EINSTANCE);
    }
    result.append(".createFromString("); //$NON-NLS-1$

    if (ecoreDataType.getEPackage() instanceof EcorePackage) {
      result.append(EcorePackage.class.getName());
    } else if (ecoreDataType.getEPackage() instanceof XMLTypePackage) {
      result.append(XMLTypePackage.class.getName());
    } else {
      result.append(ecoreDataType.getEPackage().getClass().getName());
    }
    result.append(GenConstants.DOT_EINSTANCE + ".get"); //$NON-NLS-1$
    result.append(ModelUtils.upCaseFirst(ecoreDataType.getName()));
    result.append("(), "); //$NON-NLS-1$

    final String instanceClassName = getInstanceClassName(ecoreDataType);
    if (!String.class.getName().equals(instanceClassName) && literalValue != null && literalValue.length() == 0) {
      result.append(GenConstants.NULL);
    } else {
      result.append(Literals.toStringLiteral(literalValue));
    }
    result.append(')');
    return result.toString();
  }

  // /**
  // * Determines the instance class of the EDataType. Also considers super types of the passed
  // * EDataType. Note, null is returned when no class can be determined. This also happens in case
  // of
  // * a ClassNotFoundException.
  // *
  // * @param eDataType
  // * the EDataType to get the instanceClass for
  // * @return the Class reflecting the java type of the EDataType
  // * @see GenUtils#getInstanceClassName(EDataType)
  // */
  // public static Class<?> getInstanceClass(EDataType eDataType) {
  // if (eDataType.getInstanceClass() != null) {
  // return eDataType.getInstanceClass();
  // }
  // final ExtendedMetaData extendedMetaData = ExtendedMetaData.INSTANCE;
  // for (EDataType localDataType = eDataType; localDataType != null; localDataType =
  // extendedMetaData
  // .getBaseType(localDataType)) {
  // try {
  // if (localDataType == XMLTypePackage.eINSTANCE.getDate()
  // || localDataType == XMLTypePackage.eINSTANCE.getDateTime()) {
  // return Date.class;
  // }
  // final Class<?> instanceClass = localDataType.getInstanceClass();
  // if (instanceClass != null) {
  // return instanceClass;
  // }
  // } catch (final Exception e) {
  // // can happen in case of class not found
  // // do nothing and continue with the next one
  // }
  // }
  // return null;
  // }

  /**
   * Guarantees that the returned class name is always an object and never a primitive type. Imports the class name, so
   * that it appears in the import list in the top of the java source.
   * 
   * @param eDataType
   *          the EDataType to compute the object class name for
   * @param instanceClassName
   *          class name of the java type of the EDataType. If the class name contains a dot (.) then it is returned,
   *          otherwise the java Object type is determined.
   * @return for a primitive type will return the Object type, for other classes calls {@link #getImportedClassName()} .
   * @see #getImportedClassName()
   */
  public static String getObjectClassName(EDataType eDataType, String instanceClassName) {
    try {
      // if there is a dot then is an object anyway
      if (instanceClassName != null && instanceClassName.indexOf(GenConstants.DOT) != -1) {
        return instanceClassName;
      }

      // okay a primitive one, get the object variant
      return GenUtils.getPrimitiveObjectType(eDataType);
    } catch (final Throwable t) {
      // TODO: ignore to be robust, it will show up in the generated file
      t.printStackTrace(System.err);
      return GenConstants.EMPTY;
    }
  }

  /**
   * @return the instanceclassname of this EDataType. The method walks over the EDataType extension structure using
   *         {@link ExtendedMetaData#INSTANCE #getBaseType(EDataType)} to use the instanceClass of a super simple type.
   * @see GenUtils#getInstanceClass(EDataType)
   */
  public static String getInstanceClassName(EDataType eDataType) {
    if (isDateOrDateTime(eDataType)) {
      return Date.class.getName();
    }

    Check.isFalse(isObjectTypeWithEnumBaseType(eDataType),
        "EDataType with base type EEnum should be handled differently, " + eDataType); //$NON-NLS-1$

    if (eDataType.getInstanceClassName() != null) {
      return removeDollar(eDataType.getInstanceClassName());
    }
    final ExtendedMetaData extendedMetaData = ExtendedMetaData.INSTANCE;
    for (EDataType localDataType = eDataType; localDataType != null; localDataType = extendedMetaData
        .getBaseType(localDataType)) {
      if (isDateOrDateTime(localDataType)) {
        return Date.class.getName();
      }
      if (localDataType.getInstanceClassName() != null) {
        return removeDollar(localDataType.getInstanceClassName());
      }
    }
    return removeDollar(eDataType.getInstanceClassName());
  }

  /**
   * When in a xsd the enum element is nillable then EMF will create an extra data type called Object which has the enum
   * EDataType as the base. In this case always the enum instance needs to be returned
   * 
   * @param eDataType
   * @return true if the eDataType has a base Enum type, false otherwise
   */
  public static boolean isObjectTypeWithEnumBaseType(EDataType eDataType) {
    return null != ModelUtils.getEnumBaseDataTypeIfObject(eDataType);
  }

  /**
   * Determines if the passed EDataType is a Date or DateTime by checking:
   * <ul>
   * <li>if it is equal to the Date/DateTime EDataType of the XMLTypePackage</li>
   * <li>if the instance class is a Date or a XMLGregorianCalendar</li>
   * </ul>
   * 
   * @param eDataType
   * @return
   */
  public static boolean isDateOrDateTime(EDataType eDataType) {
    if (eDataType == XMLTypePackage.eINSTANCE.getDate() || eDataType == XMLTypePackage.eINSTANCE.getDateTime()) {
      return true;
    } else if (eDataType.getInstanceClass() != null
        && XMLGregorianCalendar.class.isAssignableFrom(eDataType.getInstanceClass())) {
      return true;
    } else if (XMLGregorianCalendar.class.getName().equals(eDataType.getInstanceClassName())) {
      return true;
    } else if (eDataType.getInstanceClass() != null && Date.class.isAssignableFrom(eDataType.getInstanceClass())) {
      return true;
    }
    return false;
  }

  /**
   * First follows base types in extended metadata, returning the first data type from Ecore or XMLTypes encountered. In
   * none, looks for a serializable Ecore data type that represents the Java type. This Ecore type matching is
   * unfortunately not so great, but required for backwards compatibility.
   */
  public static EDataType getEcoreXMLDataType(EDataType eDataType) {
    // incomplete model not caught by model validation
    if (eDataType == null) {
      return null;
    }
    final ExtendedMetaData extendedMetaData = ExtendedMetaData.INSTANCE;
    for (EDataType ecoreDataType = eDataType; ecoreDataType != null; ecoreDataType = extendedMetaData
        .getBaseType(ecoreDataType)) {
      final String namespace = extendedMetaData.getNamespace(ecoreDataType);
      if (EcorePackage.eNS_URI.equals(namespace) || XMLTypePackage.eNS_URI.equals(namespace)) {
        return ecoreDataType;
      }
    }

    final String instanceClassName = eDataType.getInstanceClassName();
    for (final EClassifier eClassifier : EcorePackage.eINSTANCE.getEClassifiers()) {
      if (eClassifier instanceof EDataType && eClassifier.getInstanceClassName().equals(instanceClassName)) {
        final EDataType ecoreDataType = (EDataType) eClassifier;
        if (ecoreDataType.isSerializable()) {
          return ecoreDataType;
        }
      }
    }
    return null;
  }

  /**
   * Determines if an EDataType value should be created through an EFactory or not.
   * 
   * Note code is copied from EMF's {@link GenDataTypeImpl}, copyright to the authors of that class.
   * 
   * @param ecoreDataType
   *          the data type for which it is determined if values should be created through a factory.
   * @return true, use factory ( {@link EFactory#createFromString(EDataType, String)}), false otherwise
   */
  public static boolean useFactoryFor(final EDataType ecoreDataType) {
    final String nsURI = ecoreDataType.getEPackage().getNsURI();
    if (XMLTypePackage.eNS_URI.equals(nsURI)) {
      // Some XML types declare nebulous Object mappings.
      // They actually map to internal types that shouldn't be generated
      // into code.
      //
      final String name = ecoreDataType.getName();
      return "Date".equals(name) //$NON-NLS-1$
          || "DateTime".equals(name) //$NON-NLS-1$
          || "Duration".equals(name) //$NON-NLS-1$ 
          || "GDay".equals(name) //$NON-NLS-1$
          || "GMonth".equals(name) //$NON-NLS-1$ 
          || "GMonthDay".equals(name) //$NON-NLS-1$
          || "GYear".equals(name) //$NON-NLS-1$ 
          || "GYearMonth".equals(name) //$NON-NLS-1$
          || "NOTATION".equals(name) //$NON-NLS-1$ 
          || "QName".equals(name) //$NON-NLS-1$
          || "Time".equals(name) //$NON-NLS-1$ 
          || "ENTITIES".equals(name) //$NON-NLS-1$
          || "ENTITIESBASE".equals(name) //$NON-NLS-1$ 
          || "IDREFS".equals(name) //$NON-NLS-1$
          || "IDREFSBase".equals(name) //$NON-NLS-1$ 
          || "NMTOKENS".equals(name) //$NON-NLS-1$
          || "NMTOKENSBase".equals(name); //$NON-NLS-1$
    } else if (EcorePackage.eNS_URI.equals(nsURI)) {
      // EDate is far too often overridden to provide a different mapping,
      // and therefore the default is somewhat
      // obscure.
      // So, it's best to delegate to the factory.
      //
      if ("EDate".equals(ecoreDataType.getName())) { //$NON-NLS-1$
        return true;
      } else if ("EJavaObject".equals(ecoreDataType.getName())) { //$NON-NLS-1$
        final ExtendedMetaData extendedMetaData = ExtendedMetaData.INSTANCE;
        for (EDataType base = ecoreDataType; base != null; base = extendedMetaData.getBaseType(base)) {
          if (!extendedMetaData.getMemberTypes(base).isEmpty()) {
            return true;
          }
        }
      }
      return false;
    }
    return true;
  }

  /**
   * Returns the <code>Class</code> object associated with the class or interface with the given name, as from a
   * {@link java.lang.Class#forName(String)} call; however, if this classifier belongs to a package, that package's
   * class loader is used. Since the package may be model-specific code in another plug-in, its class loader may be able
   * to see classes that Ecore's can't.
   * 
   * Note: copied from EMF's EClassifierImpl and adapted for use here
   * 
   * NOTE, BEWARE: returns null when the name can not be resolved to a Class.
   */
  public static Class<?> getClassForName(EDataType eDataType, String name) {
    if (!name.contains(GenConstants.DOT)) {
      return getPrimitiveClass(name);
    }
    if (eDataType instanceof EEnum) {
      return null;
    }
    try {
      final EPackage p = eDataType.getEPackage();
      return p != null ? Class.forName(name, true, p.getClass().getClassLoader()) : Class.forName(name);
    } catch (ClassNotFoundException e) {
      // IGNORING on purpose
      return null;
    }
  }

  private static Class<?> getPrimitiveClass(String className) {
    if (className.equals(boolean.class.getName())) {
      return boolean.class;
    } else if (className.equals(byte.class.getName())) {
      return byte.class;
    } else if (className.equals(char.class.getName())) {
      return char.class;
    } else if (className.equals(double.class.getName())) {
      return double.class;
    } else if (className.equals(float.class.getName())) {
      return float.class;
    } else if (className.equals(int.class.getName())) {
      return int.class;
    } else if (className.equals(long.class.getName())) {
      return long.class;
    } else if (className.equals(short.class.getName())) {
      return short.class;
    }
    return null;
  }

  /**
   * Removes the dollar sign from a class name. The dollar sign appears sometimes with class names of inner classes.
   * 
   * @param className
   *          the class name to check/repair
   * @return a class name with dollar character replaced with a dot
   */
  public static String removeDollar(String className) {
    if (!className.contains(GenConstants.DOLLAR)) {
      return className;
    }
    return className.replaceAll("\\" + GenConstants.DOLLAR, GenConstants.DOT); //$NON-NLS-1$
  }

}