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
 * $Id: Messages.java,v 1.4 2011/08/25 12:36:19 mtaal Exp $
 */
package org.eclipse.emf.texo.eclipse;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Used for accessing message strings in a ResourceBundle.
 * 
 * @author mtaal
 * 
 */
public class Messages {
  private static final String BUNDLE_NAME = "org.eclipse.emf.texo.eclipse.messages"; //$NON-NLS-1$

  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

  private Messages() {
  }

  public static String getString(String key) {
    try {
      return RESOURCE_BUNDLE.getString(key);
    } catch (MissingResourceException e) {
      return '!' + key + '!';
    }
  }

  public static String formatMessage(String key, Object... arguments) {
    return MessageFormat.format(getString(key), arguments);
  }
}
