package org.eclipse.emf.texo.modelgenerator.test;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.modelgenerator.test.models.TestModel;

public class TestAnnotationType extends TestCase {

  public void testAnnotation() throws Exception {
    final EPackage.Registry registry = GeneratorUtils.createEPackageRegistry();

    readEPackages(registry, "samples/Catalog.xsd"); //$NON-NLS-1$
    final List<EPackage> otherEPackages = readEPackages(registry, "samples/rental.xsd"); //$NON-NLS-1$
    System.err.println(otherEPackages.size());
  }

  private List<EPackage> readEPackages(final EPackage.Registry registry, final String ecoreFileName) throws Exception {
    final List<URI> uris = new ArrayList<URI>();
    final URL url = TestModel.getModelUrl(ecoreFileName);
    uris.add(url.toURI());
    return GeneratorUtils.readEPackages(uris, registry, false);
  }

}
