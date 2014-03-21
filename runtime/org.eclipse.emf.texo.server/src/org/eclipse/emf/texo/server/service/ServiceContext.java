/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010, 2012 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *   Dzmitry [zmicer] Harachka - implementation
 * </copyright>
 *
 * $Id: ServiceContext.java,v 1.7 2011/08/27 19:21:32 mtaal Exp $
 */
package org.eclipse.emf.texo.server.service;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.component.TexoComponent;
import org.eclipse.emf.texo.server.model.request.RequestModelPackage;
import org.eclipse.emf.texo.server.model.response.ErrorType;
import org.eclipse.emf.texo.server.model.response.ResponseModelPackage;
import org.eclipse.emf.texo.store.MemoryObjectStore;
import org.eclipse.emf.texo.store.ObjectStore;

/**
 * Defines the context in which a {@link ModelOperation} operates. Contains for example request parameters and allows to
 * set result content and result type and result response code. The context is used for as well input as well as
 * providing results of an operation. A ServiceContext is not shared and is used for one single thread and operation
 * bean.
 * 
 * @author <a href="mailto:zmicer.harachka@gmail.com">Dzmitry [zmicer] Harachka</a>
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public abstract class ServiceContext implements TexoComponent {

  protected static final String CONTENT_TYPE_HEADER_PARAM = "Content-Type"; //$NON-NLS-1$
  protected static final String RESPONSE_HEADER_CACHE_CONTROL = "Cache-Control"; //$NON-NLS-1$
  protected static final String RESPONSE_NO_CACHE = "no-cache"; //$NON-NLS-1$

  // flag set when running texo testcases, not used in other cases
  private static boolean isInTexoTestRun = false;

  public static void setInTexoTestRun() {
    isInTexoTestRun = true;
  }

  protected static boolean isInTexoTestRun() {
    return isInTexoTestRun;
  }

  private String requestContent;
  private Map<String, Object> requestParameters = new HashMap<String, Object>();
  private String requestURI;

  // default is true
  private boolean useWebServiceUriFormat = true;

  /**
   * @see #getServiceRequestURI()
   */
  private String serviceRequestURI;

  private String responseContent;
  private int responseCode = HttpServletResponse.SC_OK; // default is okay
  private String responseContentType;
  private Map<String, String> responseHeaders = new HashMap<String, String>();
  private boolean errorOccured = false;

  private ObjectStore objectStore;

  private ServiceOptions serviceOptions = ComponentProvider.getInstance().newInstance(ServiceOptions.class);

  public ServiceContext() {
    // most of the time caching is not needed
    getResponseHeaders().put(RESPONSE_HEADER_CACHE_CONTROL, RESPONSE_NO_CACHE);
    // touch the request package so it is read
    RequestModelPackage.initialize();
  }

  /**
   * The delegate is the underlying representation of the context, this can be for example the request object.
   */
  private Object delegate;

  public String getRequestContent() {
    return requestContent;
  }

  public void setRequestContent(String requestContent) {
    this.requestContent = requestContent;
  }

  public Map<String, Object> getRequestParameters() {
    return requestParameters;
  }

  public void setRequestParameters(Map<String, Object> requestParameters) {
    this.requestParameters = requestParameters;
  }

  public String getRequestURI() {
    return requestURI;
  }

  public void setRequestURI(String requestURI) {
    this.requestURI = requestURI;
  }

  public String getResponseContent() {
    return responseContent;
  }

  public void setResponseContent(String responseContent) {
    this.responseContent = responseContent;
  }

  public int getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(int responseCode) {
    this.responseCode = responseCode;
  }

  public String getResponseContentType() {
    return responseContentType;
  }

  public void setResponseContentType(String responseType) {
    responseContentType = responseType;
    getResponseHeaders().put(CONTENT_TYPE_HEADER_PARAM, responseType);
  }

  public Object getDelegate() {
    return delegate;
  }

  public void setDelegate(Object delegate) {
    this.delegate = delegate;
  }

  public void createErrorResult(Throwable t) {
    setResponseCode(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    final ErrorType error = createErrorType(t, new ArrayList<Throwable>());
    if (getObjectStore() == null) {
      // error occured probably during object store creation
      // use the in memory object store for now
      setObjectStore(ComponentProvider.getInstance().newInstance(MemoryObjectStore.class));
    }
    setResponseContent(convertToResultFormat(error));
    setErrorOccured(true);
  }

  public void createResourceNotFoundResult() {
    createErrorResult(new IllegalArgumentException("Resource not found " + getRequestURI())); //$NON-NLS-1$
    setResponseCode(HttpServletResponse.SC_NOT_FOUND);
  }

  public Map<String, String> getResponseHeaders() {
    return responseHeaders;
  }

  public boolean isErrorOccured() {
    return errorOccured;
  }

  public void setErrorOccured(boolean errorOccured) {
    this.errorOccured = errorOccured;
  }

  /**
   * The part of the requestURI which is specific for the service, the service can use this to identify a specific
   * resource which is being fetched. For example say that the complete request URI is this:
   * http://www.test.com/xmlwebservice/SalesOrder/1231
   * 
   * which would be a url pointing to a specific SalesOrder. Then the serviceRequestURI will be: SalesOrder/1231
   * 
   * So without a preceding /.
   */
  public String getServiceRequestURI() {
    return serviceRequestURI;
  }

  /**
   * @param serviceRequestURI
   * @see #getServiceRequestURI()
   */
  public void setServiceRequestURI(String serviceRequestURI) {
    this.serviceRequestURI = serviceRequestURI;
  }

  protected ErrorType createErrorType(Throwable t, List<Throwable> handledThrowables) {
    final ErrorType error = ResponseModelPackage.INSTANCE.getModelFactory().createErrorType();
    error.setErrorClass(t.getClass().getName());
    error.setMessage(t.getMessage());
    final StringWriter sw = new StringWriter();
    final PrintWriter pw = new PrintWriter(sw);
    t.printStackTrace(pw);
    pw.close();
    error.setStackTrace(sw.toString());
    if (t.getCause() != null && !handledThrowables.contains(t.getCause())) {
      error.setCause(createErrorType(t.getCause(), handledThrowables));
    }
    return error;
  }

  /**
   * Convert a single object to the format supported by the implementing service, for example to json or to xml.
   * 
   * @param object
   *          the object to convert, should typically be a Texo generated object
   * @return a string representing the format returned by the webservice.
   */
  protected abstract String convertToResultFormat(Object object);

  /**
   * Convert a single object to the format supported by the implementing service, for example to json or to xml.
   * 
   * @param object
   *          the object to convert, should typically be a Texo generated object
   * @return a string representing the format returned by the webservice.
   */
  protected abstract String convertToResultFormat(EObject eObject);

  /**
   * Convert the passed object to the format expected (xml or json for example) and place the result in the response
   * content.
   * 
   * @param object
   *          the object to convert
   * @see ServiceContext#setResponseContent(String)
   */
  public void setResultInResponse(Object object) {
    setResponseContent(convertToResultFormat(object));
  }

  /**
   * Convert the passed object to the format expected (xml or json for example) and place the result in the response
   * content.
   * 
   * @param eObject
   *          the {@link EObject} to convert
   * @see ServiceContext#setResponseContent(String)
   */
  public void setResultInResponse(EObject eObject) {
    setResponseContent(convertToResultFormat(eObject));
  }

  /**
   * Get the data posted as the request content as a list of objects.
   * 
   * @return the list of objects present in the request content
   */
  public abstract List<Object> getRequestData();

  public ObjectStore getObjectStore() {
    return objectStore;
  }

  public void setObjectStore(ObjectStore objectStore) {
    this.objectStore = objectStore;
  }

  public ServiceOptions getServiceOptions() {
    return serviceOptions;
  }

  public void setServiceOptions(ServiceOptions serviceOptions) {
    this.serviceOptions = serviceOptions;
  }

  public boolean isUseWebServiceUriFormat() {
    return useWebServiceUriFormat;
  }

  public void setUseWebServiceUriFormat(boolean useWebServiceUriFormat) {
    this.useWebServiceUriFormat = useWebServiceUriFormat;
  }

}
