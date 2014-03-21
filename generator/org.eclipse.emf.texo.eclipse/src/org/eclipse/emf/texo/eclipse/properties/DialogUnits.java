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
 *   Springsite B.V. - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: DialogUnits.java,v 1.4 2011/08/25 12:36:19 mtaal Exp $
 */
package org.eclipse.emf.texo.eclipse.properties;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Control;

/**
 * Utility class for converting Dialog Units (DLU) to pixels.
 * 
 * @author Springsite B.V.
 * 
 */
public class DialogUnits {
  // The FontMetric used to measure DLUs.
  private final FontMetrics fontMetrics;

  public DialogUnits(Control control) {
    final GC gc = new GC(control);
    gc.setFont(JFaceResources.getDialogFont());
    fontMetrics = gc.getFontMetrics();
    gc.dispose();
  }

  /**
   * Converts horizontal DLUs to pixels.
   */
  public int pixelsX(int dlus) {
    return Dialog.convertHorizontalDLUsToPixels(fontMetrics, dlus);
  }

  /**
   * Converts vertical DLUs to pixels.
   */
  public int pixelsY(int dlus) {
    return Dialog.convertHorizontalDLUsToPixels(fontMetrics, dlus);
  }
}
