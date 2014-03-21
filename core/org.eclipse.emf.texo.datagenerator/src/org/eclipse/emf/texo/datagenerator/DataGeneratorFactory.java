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
 *
 * </copyright>
 *
 * $Id: DataGeneratorFactory.java,v 1.14 2011/08/25 12:33:42 mtaal Exp $
 */

package org.eclipse.emf.texo.datagenerator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.datagenerator.attributegenerators.BigDecimalDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.BigIntegerDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.BooleanDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.ByteArrayDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.ByteDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.CharDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.CollectionDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.DateDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.DoubleDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.DurationDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.EEnumDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.FloatDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.IntegerDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.JavaClassDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.LongDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.NullDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.QNameDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.ShortDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.StringDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.StringFileDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.XMLDateDataGenerator;
import org.eclipse.emf.texo.datagenerator.attributegenerators.XMLDateTimeDataGenerator;

/**
 * Generates data generators for EStructuralFeatures, EClasses and EDataTypes. Can be overridden if more types of
 * DataGenerators should be added.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.14 $
 */

public class DataGeneratorFactory {

  private boolean useDataFiles = true;

  /**
   * Creates an {@link EClassDataGenerator}.
   * 
   * @param eClass
   *          the EClass used to create the EClassDataGenerator
   * @param modelDataGenerator
   *          the modelDataGenerator which calls this factory
   * @return a new instance of the EClassDataGenerator
   */
  public EClassDataGenerator createEClassDataGenerator(final EClass eClass, final ModelDataGenerator modelDataGenerator) {
    final EClassDataGenerator eClassDataGenerator = new EClassDataGenerator();
    eClassDataGenerator.setModelDataGenerator(modelDataGenerator);
    eClassDataGenerator.setEClass(eClass);
    return eClassDataGenerator;
  }

  /**
   * Creates a DataGenerator for an {@link EStructuralFeature}. Calls other methods to create the correct
   * {@link EAttributeDataGenerator} and {@link EReferenceDataGenerator}.
   * 
   * @param eClass
   *          the EClass for which this data generator is called
   * @param eStructuralFeature
   *          the EStructuralFeature used to create the correct DataGenerator
   * @param modelDataGenerator
   *          the modelDataGenerator which calls this factory
   * @return a new instance of a subclass of EStructuralFeatureDataGenerator
   * @see EReferenceDataGenerator
   * @see EAttributeDataGenerator
   * @see EDataTypeDataGenerator
   */
  public EStructuralFeatureDataGenerator createEStructuralFeatureDataGenerator(EClass eClass,
      final EStructuralFeature eStructuralFeature, final ModelDataGenerator modelDataGenerator) {
    if (eStructuralFeature instanceof EReference) {
      return createEReferenceDataGenerator((EReference) eStructuralFeature, modelDataGenerator);
    }
    if (FeatureMapUtil.isFeatureMap(eStructuralFeature)) {
      final FeatureMapDataGenerator featureMapDataGenerator = new FeatureMapDataGenerator();
      featureMapDataGenerator.setEStructuralFeature(eStructuralFeature);
      featureMapDataGenerator.setModelDataGenerator(modelDataGenerator);
      featureMapDataGenerator.setFeatures(eClass);
      return featureMapDataGenerator;
    }
    return createEAttributeDataGenerator((EAttribute) eStructuralFeature, modelDataGenerator);
  }

  protected EReferenceDataGenerator createEReferenceDataGenerator(final EReference eReference,
      final ModelDataGenerator modelDataGenerator) {
    final EReferenceDataGenerator eReferenceDataGenerator = new EReferenceDataGenerator();
    eReferenceDataGenerator.setEReference(eReference);
    eReferenceDataGenerator.setModelDataGenerator(modelDataGenerator);
    return eReferenceDataGenerator;
  }

  protected EAttributeDataGenerator createEAttributeDataGenerator(final EAttribute eAttribute,
      final ModelDataGenerator modelDataGenerator) {
    final EAttributeDataGenerator eAttributeDataGenerator = new EAttributeDataGenerator();
    eAttributeDataGenerator.setModelDataGenerator(modelDataGenerator);
    eAttributeDataGenerator.setEAttribute(eAttribute);
    return eAttributeDataGenerator;
  }

  protected EDataTypeDataGenerator createEDataTypeDataGenerator(final EDataType eDataType,
      final ModelDataGenerator modelDataGenerator, EAttribute eAttribute) {

    EDataTypeDataGenerator eDataTypeDataGenerator = null;
    if (DataGeneratorUtils.getEnumBaseDataTypeIfObject(eDataType) != null || eDataType instanceof EEnum) {
      eDataTypeDataGenerator = new EEnumDataGenerator();
    } else {
      Class<?> clz = DataGeneratorUtils.getInstanceClass(eDataType);
      final boolean isArray = clz.isArray();
      if (isArray) {
        clz = clz.getComponentType();
      }
      if (QName.class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new QNameDataGenerator();
      } else if (Class.class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new JavaClassDataGenerator();
      } else if (Collection.class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new CollectionDataGenerator();
      } else if (DataGeneratorUtils.getEnumBaseDataTypeIfObject(eDataType) != null || eDataType instanceof EEnum) {
        eDataTypeDataGenerator = new EEnumDataGenerator();
      } else if (char.class.isAssignableFrom(clz) || Character.class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new CharDataGenerator();
      } else if (boolean.class.isAssignableFrom(clz) || Boolean.class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new BooleanDataGenerator();
      } else if (int.class.isAssignableFrom(clz) || Integer.class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new IntegerDataGenerator();
      } else if (short.class.isAssignableFrom(clz) || Short.class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new ShortDataGenerator();
      } else if (byte.class.isAssignableFrom(clz) || Byte.class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new ByteDataGenerator();
      } else if (byte[].class.isAssignableFrom(clz) || Byte[].class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new ByteArrayDataGenerator();
      } else if (long.class.isAssignableFrom(clz) || Long.class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new LongDataGenerator();
      } else if (double.class.isAssignableFrom(clz) || Double.class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new DoubleDataGenerator();
      } else if (float.class.isAssignableFrom(clz) || Float.class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new FloatDataGenerator();
      } else if (Date.class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new DateDataGenerator();
      } else if (eDataType == XMLTypePackage.eINSTANCE.getDate()) {
        eDataTypeDataGenerator = new XMLDateDataGenerator();
      } else if (eDataType == XMLTypePackage.eINSTANCE.getDateTime()) {
        eDataTypeDataGenerator = new XMLDateTimeDataGenerator();
      } else if (BigDecimal.class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new BigDecimalDataGenerator();
      } else if (BigInteger.class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new BigIntegerDataGenerator();
      } else if (Duration.class.isAssignableFrom(clz)) {
        eDataTypeDataGenerator = new DurationDataGenerator();
      } else if (String.class.isAssignableFrom(clz) && eAttribute == null) {
        eDataTypeDataGenerator = new StringDataGenerator();
      } else if (String.class.isAssignableFrom(clz)) {
        final String path = "/org/eclipse/emf/texo/datagenerator/data/general/"; //$NON-NLS-1$
        final String name = eAttribute.getName().toLowerCase(Locale.ENGLISH);
        StringFileDataGenerator stringFileDataGenerator = null;
        if (eAttribute.isID()) {
          // generates unique id values
          eDataTypeDataGenerator = new StringDataGenerator();
        } else if (name.equals("description") || name.equals("title")) { //$NON-NLS-1$ //$NON-NLS-2$
          stringFileDataGenerator = new StringFileDataGenerator();
          stringFileDataGenerator.setDataContent(path + "description.txt"); //$NON-NLS-1$
          stringFileDataGenerator.setValuesPerEAttribute(5);
        } else if (name.equals("name")) { //$NON-NLS-1$
          stringFileDataGenerator = new StringFileDataGenerator();
          stringFileDataGenerator.setDataContent(path + "description.txt"); //$NON-NLS-1$
          stringFileDataGenerator.setValuesPerEAttribute(2);
        } else if (name.equals("city")) { //$NON-NLS-1$
          stringFileDataGenerator = new StringFileDataGenerator();
          stringFileDataGenerator.setDataContent(path + "city.txt"); //$NON-NLS-1$
        } else if (name.equals("firstname")) { //$NON-NLS-1$
          stringFileDataGenerator = new StringFileDataGenerator();
          stringFileDataGenerator.setDataContent(path + "firstname.txt"); //$NON-NLS-1$
        } else if (name.equals("lastname")) { //$NON-NLS-1$
          stringFileDataGenerator = new StringFileDataGenerator();
          stringFileDataGenerator.setDataContent(path + "lastname.txt"); //$NON-NLS-1$
        } else if (name.equals("zipcode")) { //$NON-NLS-1$
          stringFileDataGenerator = new StringFileDataGenerator();
          stringFileDataGenerator.setDataContent(path + "us_zip.txt"); //$NON-NLS-1$
        } else if (name.equals("zip")) { //$NON-NLS-1$
          stringFileDataGenerator = new StringFileDataGenerator();
          stringFileDataGenerator.setDataContent(path + "us_zip.txt"); //$NON-NLS-1$
        } else if (name.equals("street")) { //$NON-NLS-1$
          stringFileDataGenerator = new StringFileDataGenerator();
          stringFileDataGenerator.setDataContent(path + "street.txt"); //$NON-NLS-1$
        }
        if (useDataFiles && stringFileDataGenerator != null) {
          eDataTypeDataGenerator = stringFileDataGenerator;
        } else {
          eDataTypeDataGenerator = new StringDataGenerator();
        }
      } else if (!eAttribute.isRequired()) {
        eDataTypeDataGenerator = new NullDataGenerator();
      } else {
        throw new UnsupportedOperationException("EAttribute " //$NON-NLS-1$
            + eAttribute + " with EDataType " //$NON-NLS-1$
            + eDataType.getName() + " not supported"); //$NON-NLS-1$
      }
    }
    eDataTypeDataGenerator.setModelDataGenerator(modelDataGenerator);
    eDataTypeDataGenerator.setEDataType(eDataType);
    return eDataTypeDataGenerator;
  }

  public boolean isUseDataFiles() {
    return useDataFiles;
  }

  public void setUseDataFiles(boolean useDataFiles) {
    this.useDataFiles = useDataFiles;
  }
}