package org.eclipse.modisco.kdm.core;

import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>KDMRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> A KDM relationship is a model element that represents semantic association between two
 * entities. In the meta-model, KDMRelationship is a subclass of ModelElement. Each KDM package defines some specific
 * KDM relations that are either direct or indirect subclasses of KDMRelationship. Specific subclasses of
 * KDMRelationship are typed associations between some specific subclasses of KDMEntity. <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "core_KDMRelationship")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class KDMRelationship extends ModelElement {

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "KDMRelationship ";
  }
}
