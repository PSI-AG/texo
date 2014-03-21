/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
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
 * $Id: TestConfiguration.java,v 1.13 2011/08/25 12:42:44 mtaal Exp $
 */
package org.eclipse.emf.texo.test.all;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.Test;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.test.model.issues.bz325429_test.TestModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;
import org.eclipse.emf.texo.test.model.samples.capa.CapaModelPackage;
import org.eclipse.emf.texo.test.model.samples.catalog.CatalogModelPackage;
import org.eclipse.emf.texo.test.model.samples.claim.ClaimModelPackage;
import org.eclipse.emf.texo.test.model.samples.emap.EmapsampleModelPackage;
import org.eclipse.emf.texo.test.model.samples.employee.EmployeeModelPackage;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.Epo2ModelPackage;
import org.eclipse.emf.texo.test.model.samples.forum.ForumModelPackage;
import org.eclipse.emf.texo.test.model.samples.interfaces.InterfacesModelPackage;
import org.eclipse.emf.texo.test.model.samples.inventory.InvModelPackage;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.music.MusicModelPackage;
import org.eclipse.emf.texo.test.model.samples.play.PlayModelPackage;
import org.eclipse.emf.texo.test.model.samples.rental.RentalModelPackage;
import org.eclipse.emf.texo.test.model.samples.schemaprimerpo.SchemaprimerpoModelPackage;
import org.eclipse.emf.texo.test.model.samples.schoollibrary.SchoollibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.sunbooks.SunBooksModelPackage;
import org.eclipse.emf.texo.test.model.samples.types.TypesModelPackage;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.anytype.AnytypeModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.attributes.AttributesModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.datetime.DatetimeModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.documentroot.DocumentrootModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.duration.DurationModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.EcoreattrsModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.emap.EmapModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.GroupallModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.list.ListModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.listunion.ListunionModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.mixed.MixedModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup.NestedgroupModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.qname.QnameModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.restriction.RestrictionModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.simplechoice.SimplechoiceModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.simplefeaturemap.SimplefeaturemapModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes.SimpletypesModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.SubstitutionModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.SubstitutionzvonModelPackage;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.eclipse.emf.texo.xml.test.ConversionTest;
import org.eclipse.emf.texo.xml.test.XMLTest;

/**
 * Creates the test cases for all model packages.
 * 
 * @author mtaal
 */
public class TestConfiguration {

  private List<Test> tests;

  protected void initialize() {
    tests = new ArrayList<Test>();

    addSampleTestModels();
    addIssuesTestModels();
    addSchemaConstructsTestModels();
  }

  private void addIssuesTestModels() {
    addAllTestsForModelPackage(TestModelPackage.INSTANCE);
    addAllTestsForModelPackage(ModelModelPackage.INSTANCE);
  }

  private void addSampleTestModels() {
    addAllTestsForModelPackage(EmapsampleModelPackage.INSTANCE);

    addAllTestsForModelPackage(AccountingModelPackage.INSTANCE);
    addAllTestsForModelPackage(CapaModelPackage.INSTANCE);
    tests.add(createXMLTest(CapaModelPackage.INSTANCE, CapaModelPackage.INSTANCE.getMachineListEClass()));

    addAllTestsForModelPackage(CatalogModelPackage.INSTANCE);

    addAllTestsForModelPackage(ClaimModelPackage.INSTANCE);
    addAllTestsForModelPackage(EmployeeModelPackage.INSTANCE);
    addAllTestsForModelPackage(Epo2ModelPackage.INSTANCE);

    // disabled for now...
    // addAllTestsForModelPackage(ExtlibraryModelPackage.INSTANCE);

    addAllTestsForModelPackage(ForumModelPackage.INSTANCE);
    addAllTestsForModelPackage(InterfacesModelPackage.INSTANCE);
    addAllTestsForModelPackage(InvModelPackage.INSTANCE);
    addAllTestsForModelPackage(LibraryModelPackage.INSTANCE);
    tests.add(createXMLTest(LibraryModelPackage.INSTANCE, LibraryModelPackage.INSTANCE.getLibraryEClass()));

    addAllTestsForModelPackage(MusicModelPackage.INSTANCE);
    addAllTestsForModelPackage(PlayModelPackage.INSTANCE);

    addAllTestsForModelPackage(RentalModelPackage.INSTANCE);
    tests.add(createXMLTest(RentalModelPackage.INSTANCE, RentalModelPackage.INSTANCE.getRentalBusinessEClass()));

    addAllTestsForModelPackage(SchemaprimerpoModelPackage.INSTANCE);
    addAllTestsForModelPackage(SchoollibraryModelPackage.INSTANCE);
    addAllTestsForModelPackage(SunBooksModelPackage.INSTANCE);
    // tests.add(createXMLTest(SunBooksModelPackage.INSTANCE, SunBooksModelPackage.INSTANCE
    // .getDocumentRootEClass()));

    addAllTestsForModelPackage(TypesModelPackage.INSTANCE);
    addAllTestsForModelPackage(WorkflowModelPackage.INSTANCE);
  }

  private void addSchemaConstructsTestModels() {
    addAllTestsForModelPackage(AnytypeModelPackage.INSTANCE);
    addAllTestsForModelPackage(AttributesModelPackage.INSTANCE);
    addAllTestsForModelPackage(DatetimeModelPackage.INSTANCE);
    addAllTestsForModelPackage(DocumentrootModelPackage.INSTANCE);
    addAllTestsForModelPackage(DurationModelPackage.INSTANCE);
    addAllTestsForModelPackage(EcoreattrsModelPackage.INSTANCE);
    addAllTestsForModelPackage(EmapModelPackage.INSTANCE);

    addAllTestsForModelPackage(GroupallModelPackage.INSTANCE);
    // tests.add(createXMLTest(GroupallModelPackage.INSTANCE, GroupallModelPackage.INSTANCE
    // .getDocumentRootEClass()));

    addAllTestsForModelPackage(ListModelPackage.INSTANCE);
    addAllTestsForModelPackage(ListunionModelPackage.INSTANCE);

    addAllTestsForModelPackage(MixedModelPackage.INSTANCE);
    // tests.add(createXMLTest(MixedModelPackage.INSTANCE, MixedModelPackage.INSTANCE
    // .getDocumentRootEClass()));

    addAllTestsForModelPackage(NestedgroupModelPackage.INSTANCE);
    addAllTestsForModelPackage(QnameModelPackage.INSTANCE);
    addAllTestsForModelPackage(RestrictionModelPackage.INSTANCE);
    addAllTestsForModelPackage(SimplechoiceModelPackage.INSTANCE);
    addAllTestsForModelPackage(SimplefeaturemapModelPackage.INSTANCE);
    addAllTestsForModelPackage(SimpletypesModelPackage.INSTANCE);

    addAllTestsForModelPackage(SubstitutionModelPackage.INSTANCE);
    // tests.add(createXMLTest(SubstitutionModelPackage.INSTANCE, SubstitutionModelPackage.INSTANCE
    // .getDocumentRootEClass()));

    addAllTestsForModelPackage(SubstitutionzvonModelPackage.INSTANCE);
    // tests.add(createXMLTest(SubstitutionzvonModelPackage.INSTANCE,
    // SubstitutionzvonModelPackage.INSTANCE.getDocumentRootEClass()));

    // uncomment when this fix:
    // https://bugs.eclipse.org/bugs/show_bug.cgi?id=302921
    // has been committed
  }

  private void addAllTestsForModelPackage(ModelPackage modelPackage) {
    tests.add(createConversionTest(modelPackage));
    tests.add(createXMITest(modelPackage));
  }

  private ConversionTest createConversionTest(ModelPackage modelPackage) {
    final ConversionTest conversionTest = new ConversionTest("ConversionTest: " + modelPackage.getEPackage().getName()); //$NON-NLS-1$
    conversionTest.setModelPackages(Collections.singletonList(modelPackage));
    return conversionTest;
  }

  private XMLTest createXMLTest(ModelPackage modelPackage, EClass eClass) {
    return createXMITest(Collections.singletonList(modelPackage), Collections.singletonList(eClass), false);
  }

  private XMLTest createXMITest(ModelPackage modelPackage) {
    return createXMITest(Collections.singletonList(modelPackage), null, true);
  }

  private XMLTest createXMITest(List<ModelPackage> modelPackages, List<EClass> eClasses, boolean doXMI) {
    final String prefix;
    if (doXMI) {
      prefix = "XMITest: "; //$NON-NLS-1$
    } else {
      prefix = "XMLTest: "; //$NON-NLS-1$
    }
    final XMLTest xmlTest = new XMLTest(prefix + modelPackages.get(0).getEPackage().getName());
    xmlTest.setModelPackages(modelPackages);
    xmlTest.setEClasses(eClasses);
    xmlTest.setDoXMLCompare(determineIfXMLCompare(modelPackages, doXMI));
    xmlTest.setDoXMI(doXMI);
    return xmlTest;
  }

  // don't do xml compare if there is a collection which is not a list or in case of
  // mixed features
  private boolean determineIfXMLCompare(List<ModelPackage> modelPackages, boolean doXMI) {
    for (ModelPackage modelPackage : modelPackages) {
      for (EClassifier eClassifier : modelPackage.getEPackage().getEClassifiers()) {
        if (eClassifier instanceof EClass) {
          final EClass eClass = (EClass) eClassifier;
          if (eClass.isAbstract() || eClass.isInterface()) {
            continue;
          }
          final Object instance = modelPackage.getModelFactory().create(eClass);
          final ModelObject<?> modelObject = ModelResolver.getInstance().getModelObject(instance);
          for (EStructuralFeature eFeature : eClass.getEAllStructuralFeatures()) {
            if (!eFeature.isVolatile() && eFeature.isMany()) {
              final Object collection = modelObject.eGet(eFeature);
              if (!(collection instanceof List<?>)) {
                return false;
              }
              if (doXMI && ModelUtils.isMixed(eFeature)) {
                // XMI does not support mixed content very well
                return false;
              }
            }
          }
        }
      }
    }
    return true;
  }

  public List<Test> getTests() {
    if (tests == null) {
      initialize();
    }
    return tests;
  }

  public void setTests(List<Test> tests) {
    this.tests = tests;
  }
}
