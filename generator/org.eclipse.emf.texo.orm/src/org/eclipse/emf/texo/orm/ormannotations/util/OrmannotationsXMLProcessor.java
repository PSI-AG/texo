/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmannotationsXMLProcessor.java,v 1.5 2011/09/23 21:00:39 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class OrmannotationsXMLProcessor extends XMLProcessor {

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrmannotationsXMLProcessor() {
    super((EPackage.Registry.INSTANCE));
    OrmannotationsPackage.eINSTANCE.eClass();
  }

  /**
   * Register for "*" and "xml" file extensions the OrmannotationsResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Map<String, Resource.Factory> getRegistrations() {
    if (registrations == null) {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new OrmannotationsResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new OrmannotationsResourceFactoryImpl());
    }
    return registrations;
  }

} // OrmannotationsXMLProcessor
