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
 * $Id: TestModelPackageProvider.java,v 1.7 2011/08/25 12:42:40 mtaal Exp $
 */
package org.eclipse.emf.texo.test.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.emfmodel.bz391624.impl.Bz391624PackageImpl;
import org.eclipse.emf.texo.test.emfmodel.bz399086.impl.Bz399086PackageImpl;
import org.eclipse.emf.texo.test.emfmodel.bz403743.impl.Bz403743PackageImpl;
import org.eclipse.emf.texo.test.model.issues.bz325427.Bz325427ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz325429_test.TestModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz352285.Bz352285ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz369476.Bz369476ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz369931.Bz369931ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz371509.Bz371509ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz378087.Bz378087ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz378642.Bz378642ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz379796.Bz379796ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz379815.Bz379815ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz386923.Bz386923ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz390942.Bz390942ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz391624.Bz391624ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz393240.Bz393240ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz397220.Bz397220ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz399086.Bz399086ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz403743.Bz403743ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz404132.Bz404132ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz411874.Bz411874ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz422811.Bz422811ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz423760.Bz423760ModelPackage;
import org.eclipse.emf.texo.test.model.issues.subpackage.MainModelPackage;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;
import org.eclipse.emf.texo.test.model.samples.capa.CapaModelPackage;
import org.eclipse.emf.texo.test.model.samples.catalog.CatalogModelPackage;
import org.eclipse.emf.texo.test.model.samples.claim.ClaimModelPackage;
import org.eclipse.emf.texo.test.model.samples.emap.EmapsampleModelPackage;
import org.eclipse.emf.texo.test.model.samples.employee.EmployeeModelPackage;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.Epo2ModelPackage;
import org.eclipse.emf.texo.test.model.samples.extlibrary.ExtlibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.featuremaptest.FeaturemaptestModelPackage;
import org.eclipse.emf.texo.test.model.samples.forum.ForumModelPackage;
import org.eclipse.emf.texo.test.model.samples.interfaces.InterfacesModelPackage;
import org.eclipse.emf.texo.test.model.samples.inventory.InvModelPackage;
import org.eclipse.emf.texo.test.model.samples.jpamixed.JpamixedModelPackage;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.music.MusicModelPackage;
import org.eclipse.emf.texo.test.model.samples.play.PlayModelPackage;
import org.eclipse.emf.texo.test.model.samples.rental.RentalModelPackage;
import org.eclipse.emf.texo.test.model.samples.schemaprimerpo.SchemaprimerpoModelPackage;
import org.eclipse.emf.texo.test.model.samples.sunbooks.SunBooksModelPackage;
import org.eclipse.emf.texo.test.model.samples.travel.TravelModelPackage;
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

/**
 * Returns the list of all generated model packages.
 * 
 * @author mtaal
 */
public class TestModelPackageProvider {

  public static List<ModelPackage> getModelPackages() {
    final List<ModelPackage> result = new ArrayList<ModelPackage>();

    result.add(AccountingModelPackage.INSTANCE);
    result.add(CapaModelPackage.INSTANCE);
    result.add(CatalogModelPackage.INSTANCE);
    result.add(ClaimModelPackage.INSTANCE);
    result.add(EmapsampleModelPackage.INSTANCE);
    result.add(EmployeeModelPackage.INSTANCE);
    result.add(Epo2ModelPackage.INSTANCE);
    result.add(ExtlibraryModelPackage.INSTANCE);
    result.add(FeaturemaptestModelPackage.INSTANCE);
    result.add(ForumModelPackage.INSTANCE);
    result.add(InterfacesModelPackage.INSTANCE);
    result.add(InvModelPackage.INSTANCE);
    result.add(JpamixedModelPackage.INSTANCE);
    result.add(LibraryModelPackage.INSTANCE);
    // result.add(MmModelPackage.INSTANCE);
    result.add(MusicModelPackage.INSTANCE);
    result.add(PlayModelPackage.INSTANCE);
    result.add(RentalModelPackage.INSTANCE);
    result.add(SchemaprimerpoModelPackage.INSTANCE);
    result.add(SunBooksModelPackage.INSTANCE);
    result.add(TypesModelPackage.INSTANCE);
    result.add(WorkflowModelPackage.INSTANCE);

    result.add(TravelModelPackage.INSTANCE);
    // result.add(ClubModelPackage.INSTANCE);
    // result.add(CompetitionModelPackage.INSTANCE);
    // result.add(SocietyModelPackage.INSTANCE);

    // jpa constructs
    result.add(Bz325427ModelPackage.INSTANCE);
    result.add(TestModelPackage.INSTANCE);
    result.add(ModelModelPackage.INSTANCE);
    result.add(Bz352285ModelPackage.INSTANCE);
    result.add(Bz369476ModelPackage.INSTANCE);
    result.add(Bz369931ModelPackage.INSTANCE);
    result.add(Bz371509ModelPackage.INSTANCE);
    result.add(Bz378087ModelPackage.INSTANCE);
    result.add(Bz378642ModelPackage.INSTANCE);
    result.add(Bz379796ModelPackage.INSTANCE);
    result.add(Bz379815ModelPackage.INSTANCE);

    // result.add(Bz380279ModelPackage.INSTANCE);
    result.add(Bz386923ModelPackage.INSTANCE);
    result.add(Bz390942ModelPackage.INSTANCE);

    // initialize the EMF package first
    Bz391624PackageImpl.init();
    result.add(Bz391624ModelPackage.INSTANCE);

    result.add(Bz393240ModelPackage.INSTANCE);
    result.add(Bz397220ModelPackage.INSTANCE);

    Bz399086PackageImpl.init();
    result.add(Bz399086ModelPackage.INSTANCE);

    // result.add(Bz403161_1ModelPackage.INSTANCE);
    // result.add(Bz403161_2ModelPackage.INSTANCE);

    Bz403743PackageImpl.init();
    result.add(Bz403743ModelPackage.INSTANCE);

    result.add(Bz404132ModelPackage.INSTANCE);
    // result.add(Bz409157ModelPackage.INSTANCE);
    result.add(Bz411874ModelPackage.INSTANCE);
    result.add(Bz422811ModelPackage.INSTANCE);
    result.add(Bz423760ModelPackage.INSTANCE);

    // ignored as it adds the serializable class to the modelresolver
    // collides with another model doing the same
    // result.add(Bz306546ModelPackage.INSTANCE);
    result.add(MainModelPackage.INSTANCE);

    // schema constructs
    result.add(AnytypeModelPackage.INSTANCE);
    result.add(AttributesModelPackage.INSTANCE);
    result.add(DatetimeModelPackage.INSTANCE);
    result.add(DocumentrootModelPackage.INSTANCE);
    result.add(DurationModelPackage.INSTANCE);
    result.add(EcoreattrsModelPackage.INSTANCE);
    result.add(EmapModelPackage.INSTANCE);
    result.add(GroupallModelPackage.INSTANCE);
    result.add(ListModelPackage.INSTANCE);
    result.add(ListunionModelPackage.INSTANCE);
    result.add(MixedModelPackage.INSTANCE);
    result.add(NestedgroupModelPackage.INSTANCE);
    result.add(QnameModelPackage.INSTANCE);
    result.add(RestrictionModelPackage.INSTANCE);
    result.add(SimplechoiceModelPackage.INSTANCE);
    result.add(SimplefeaturemapModelPackage.INSTANCE);
    result.add(SimpletypesModelPackage.INSTANCE);
    result.add(SubstitutionModelPackage.INSTANCE);
    result.add(SubstitutionzvonModelPackage.INSTANCE);

    return result;
  }
}
