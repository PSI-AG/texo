package org.eclipse.emf.texo.json;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

public class ReferenceCopier extends EcoreUtil.Copier {

  protected void copyReference(EReference eReference, EObject eObject, EObject copyEObject) {
    if (eObject.eIsSet(eReference)) {
      if (eReference.isMany()) {
        @SuppressWarnings("unchecked")
        InternalEList<EObject> source = (InternalEList<EObject>) eObject.eGet(eReference);
        @SuppressWarnings("unchecked")
        InternalEList<EObject> target = (InternalEList<EObject>) copyEObject.eGet(getTarget(eReference));
        if (source.isEmpty()) {
          target.clear();
        } else {
          boolean isBidirectional = eReference.getEOpposite() != null;
          int index = 0;
          for (Iterator<EObject> k = resolveProxies ? source.iterator() : source.basicIterator(); k.hasNext();) {
            EObject referencedEObject = k.next();
            EObject copyReferencedEObject = get(referencedEObject);
            if (copyReferencedEObject == null) {
              if (useOriginalReferences && !isBidirectional) {
                target.addUnique(index, referencedEObject);
                ++index;
              }
            } else {
              if (isBidirectional) {
                int position = target.indexOf(copyReferencedEObject);
                if (position == -1) {
                  target.addUnique(index, copyReferencedEObject);
                } else if (index != position) {
                  target.move(index, copyReferencedEObject);
                }
              } else {
                target.addUnique(index, copyReferencedEObject);
              }
              ++index;
            }
          }
        }
      } else {
        Object referencedEObject = eObject.eGet(eReference, resolveProxies);
        if (referencedEObject == null) {
          copyEObject.eSet(getTarget(eReference), null);
        } else {
          Object copyReferencedEObject = get(referencedEObject);
          if (copyReferencedEObject == null) {
            if (useOriginalReferences) {
              copyEObject.eSet(getTarget(eReference), referencedEObject);
            }
          } else {
            copyEObject.eSet(getTarget(eReference), copyReferencedEObject);
          }
        }
      }
    }
  }

}
