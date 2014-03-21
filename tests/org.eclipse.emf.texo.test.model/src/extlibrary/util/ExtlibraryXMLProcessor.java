/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtlibraryXMLProcessor.java,v 1.4 2011/08/25 14:34:31 mtaal Exp $
 */
package extlibrary.util;

import extlibrary.ExtlibraryPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ExtlibraryXMLProcessor extends XMLProcessor {

  /**
   * Public constructor to instantiate the helper. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public ExtlibraryXMLProcessor() {
    super((EPackage.Registry.INSTANCE));
    ExtlibraryPackage.eINSTANCE.eClass();
  }

  /**
   * Register for "*" and "xml" file extensions the ExtlibraryResourceFactoryImpl factory. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected Map<String, Resource.Factory> getRegistrations() {
    if (registrations == null) {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new ExtlibraryResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new ExtlibraryResourceFactoryImpl());
    }
    return registrations;
  }

} // ExtlibraryXMLProcessor
