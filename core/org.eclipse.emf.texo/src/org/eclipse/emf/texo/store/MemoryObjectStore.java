package org.eclipse.emf.texo.store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.provider.IdProvider;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.eclipse.emf.texo.utils.ModelUtils.TypeIdTuple;

/**
 * An object store which keeps all the data in memory, only supports simple querying.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class MemoryObjectStore extends ObjectStore {

  private static final String FROM = "from"; //$NON-NLS-1$
  private static final int FROM_LENGTH = FROM.length();

  private final Map<EClass, List<Object>> data = new HashMap<EClass, List<Object>>();

  public void addData(Collection<Object> objects) {
    for (Object object : objects) {
      @SuppressWarnings("unchecked")
      final ModelObject<Object> modelObject = (ModelObject<Object>) ModelResolver.getInstance().getModelObject(object);
      final EClass eClass = modelObject.eClass();
      List<Object> dataList = data.get(eClass);
      if (dataList == null) {
        dataList = new ArrayList<Object>();
        data.put(eClass, dataList);
      }
      dataList.add(object);
    }
  }

  @Override
  public Object get(EClass eClass, Object id) {
    final List<Object> dataList = data.get(eClass);
    if (dataList != null) {
      for (Object o : dataList) {
        final Object objectId = IdProvider.getInstance().getId(o);
        if (objectId != null && objectId.equals(id)) {
          return o;
        }
      }
    }
    return super.get(eClass, id);
  }

  @Override
  public long countNamedQuery(String name, Map<String, Object> namedParameters) {
    throw new UnsupportedOperationException();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.server.store.ObjectStore#get(java.lang.Class, java.lang.Object)
   */
  @SuppressWarnings("unchecked")
  @Override
  public <T extends Object> T get(Class<T> clz, Object id) {
    for (List<Object> dataList : data.values()) {
      for (Object o : dataList) {
        final Object objectId = IdProvider.getInstance().getId(o);
        if (clz.isAssignableFrom(o.getClass()) && objectId != null && objectId.equals(id)) {
          return (T) o;
        }
      }
    }
    return null;
  }

  @Override
  public <T extends Object> T update(T object) {
    return object;
  }

  @Override
  public <T extends Object> void remove(T object) {
    final ModelObject<?> modelObject = ModelResolver.getInstance().getModelObject(object);
    final List<Object> dataList = data.get(modelObject.eClass());
    if (dataList != null) {
      dataList.remove(object);
    }
  }

  @Override
  public <T extends Object> void refresh(T object) {
    // don't do anything
  }

  @Override
  public <T extends Object> void insert(T object) {
    final ModelObject<?> modelObject = ModelResolver.getInstance().getModelObject(object);
    List<Object> dataList = data.get(modelObject.eClass());
    if (dataList != null && !dataList.contains(object)) {
      dataList.add(object);
    } else if (dataList == null) {
      dataList = new ArrayList<Object>();
      dataList.add(object);
    }
  }

  @Override
  public List<?> query(String qryStr, Map<String, Object> namedParameters, int firstResult, int maxResults) {
    final int index = qryStr.indexOf(FROM);
    if (index != -1) {
      final String eClassName = qryStr.substring(index + FROM_LENGTH);
      for (EClass eClass : data.keySet()) {
        if (eClass.getName().equals(eClassName)) {
          return data.get(eClass);
        }
      }
    }
    return Collections.emptyList();
  }

  @Override
  public List<?> namedQuery(String name, Map<String, Object> namedParameters, int firstResult, int maxResults) {
    throw new UnsupportedOperationException();
  }

  @Override
  public long count(String qryStr, Map<String, Object> namedParameters) {
    final int index = qryStr.indexOf(FROM);
    if (index != -1) {
      final String eClassName = qryStr.substring(index + FROM_LENGTH);
      for (EClass eClass : data.keySet()) {
        if (eClass.getName().equals(eClassName)) {
          return data.size();
        }
      }
    }
    return 0;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.store.ObjectStore#query(org.eclipse.emf.ecore.EClass)
   */
  @Override
  public List<?> query(EClass eClass, int firstResult, int maxResults) {
    List<?> result = data.get(eClass);
    if (result == null) {
      return Collections.emptyList();
    }

    int from = 0;
    if (firstResult > -1) {
      from = firstResult;
    }
    int to = result.size();
    if (maxResults > -1) {
      to = from + maxResults;
    }
    if (from >= result.size()) {
      from = result.size();
      if (from == 0) {
        return Collections.emptyList();
      }
    }
    if (to > result.size()) {
      to = result.size();
    }

    return result.subList(from, to);
  }

  @Override
  public Object getDelegate() {
    return data;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.server.store.ObjectStore#getReferingObjects(java.lang.Object, int, boolean)
   */
  @Override
  public List<Object> getReferingObjects(Object target, int maxResult, boolean includeContainmentReferences) {
    return null;
  }

  @Override
  public EObject getEObject(URI objectUri) {
    EObject eObject = super.getEObject(objectUri);
    if (eObject == null) {
      final TypeIdTuple tuple = ModelUtils.getTypeAndIdFromUri(isUseWebServiceUriFormat(), objectUri);
      eObject = (EObject) get(tuple.getEClass(), tuple.getId());
      if (eObject == null) {
        eObject = EcoreUtil.create(tuple.getEClass());
        eObject.eSet(IdProvider.getInstance().getIdEAttribute(tuple.getEClass()), tuple.getId());
      }
    }
    return eObject;
  }

}
