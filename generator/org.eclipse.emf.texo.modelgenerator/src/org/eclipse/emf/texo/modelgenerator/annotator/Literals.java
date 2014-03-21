/**
 * <copyright>
 *
 * Copyright (c) 2002-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Martin Taal - Simplified specific methods
 *
 * </copyright>
 *
 * $Id: Literals.java,v 1.7 2011/08/25 12:35:07 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.annotator;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.eclipse.emf.ecore.EAttribute;

/**
 * Utility class for converting primitive values, strings, and classes to literals that could appear in code.
 * 
 * NOTE: partially copied from org.eclipse.emf.codegen.ecore.genmodel.impl.Literals, simplified version of that class.
 * Copyright and credits to the authors of that specific class.
 */
public class Literals {
  // Suppress default constructor for non-instantiability.
  private Literals() {
    super();
  }

  private static final SimpleDateFormat xmlDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'"); //$NON-NLS-1$

  /**
   * Returns a valid String representation of a value. This String can be placed in the source code to initialize a java
   * member.
   * 
   * @param value
   *          the value which is converted to a valid string member-initializing String
   * @return a String which can be placed inside a template to initialize the source.
   */
  public static String toLiteral(final Class<?> clz, final Object value) {
    if (!clz.isArray()) {
      return toLiteral(clz, value.toString());
    }

    final Class<?> componentType = clz.getComponentType();
    final StringBuilder sb = new StringBuilder();
    sb.append("new " + componentType.getName() + //$NON-NLS-1$ 
        "[]{"); //$NON-NLS-1$

    // convert the values
    for (int i = 0; i < Array.getLength(value); i++) {
      final Object o = Array.get(value, i);
      if (sb.length() > 0) {
        sb.append(","); //$NON-NLS-1$
      }
      sb.append(toLiteral(componentType, o));
    }

    sb.append("}"); //$NON-NLS-1$

    return sb.toString();
  }

  /**
   * Method which can create a type-safe (to-be-used-in-a-template) version of the default value. It can handle all java
   * lang types and Date, BigDecimal and BigInteger. If the method can not handle a class then null is returned.
   * 
   * The method automatically adds types to the import names set of the GenContext.
   * 
   * @param clz
   *          the result should be valid for this class
   * @param literalValue
   *          the value as specified in the EAttribute ( {@link EAttribute#getDefaultValueLiteral()} ).
   * @param genContext
   *          is used to add qualified java names to the stack of import statements (
   *          {@link ModelGenAnnotatorContext#getImportedName(GenEPackage, String)} )
   * @return a String which can be used in a template as the initialization value of a java member.
   */
  public static String toLiteral(final Class<?> clz, final String literalValue) {
    if (clz.isArray()) {
      final Class<?> componentType = clz.getComponentType();
      final StringBuilder sb = new StringBuilder();
      for (final String arrayPart : literalValue.split(",")) { //$NON-NLS-1$
        if (sb.length() > 0) {
          sb.append(", "); //$NON-NLS-1$
        }
        sb.append(toLiteral(componentType, arrayPart.trim()));
      }
      return "new " + componentType.getName() + //$NON-NLS-1$ 
          "[]{" + sb.toString() + //$NON-NLS-1$ 
          "}"; //$NON-NLS-1$
    }
    if (clz == Boolean.class) {
      return "Boolean." + literalValue.toUpperCase(Locale.ENGLISH); //$NON-NLS-1$
    } else if (clz == Boolean.TYPE) {
      return literalValue.toLowerCase(Locale.ENGLISH);
    } else if (clz == Byte.class) {
      return "new Byte((byte)" + literalValue + //$NON-NLS-1$ 
          ")"; //$NON-NLS-1$
    } else if (clz == Byte.TYPE) {
      return literalValue;
    } else if (clz == Short.class) {
      return "new Short((short)" + literalValue + //$NON-NLS-1$ 
          ")"; //$NON-NLS-1$
    } else if (clz == Short.TYPE) {
      return literalValue;
    } else if (clz == Integer.class) {
      return "new Integer(" + literalValue + //$NON-NLS-1$ 
          ")"; //$NON-NLS-1$
    } else if (clz == Integer.TYPE) {
      return literalValue;
    } else if (clz == Long.class) {
      return "new Long(" + literalValue + //$NON-NLS-1$ 
          ")"; //$NON-NLS-1$
    } else if (clz == Long.TYPE) {
      return literalValue;
    } else if (clz == Float.class) {
      return "new Float(" + literalValue + //$NON-NLS-1$ 
          "f)"; //$NON-NLS-1$
    } else if (clz == Float.TYPE) {
      return literalValue + "f"; //$NON-NLS-1$
    } else if (clz == Double.class) {
      return "new Double(" + literalValue + //$NON-NLS-1$ 
          ")"; //$NON-NLS-1$
    } else if (clz == Double.TYPE) {
      return literalValue;
    } else if (clz == Character.class) {
      return "new Character(" + toCharLiteral(literalValue) + //$NON-NLS-1$ 
          ")"; //$NON-NLS-1$
    } else if (clz == Character.TYPE) {
      return toCharLiteral(literalValue);
    } else if (clz == String.class) {
      return toStringLiteral(literalValue);
    } else if (clz == BigDecimal.class) {
      return "new " + BigDecimal.class.getName() + //$NON-NLS-1$ 
          "(\"" + literalValue //$NON-NLS-1$
          + "\")"; //$NON-NLS-1$
    } else if (clz == BigInteger.class) {
      return "new " + BigInteger.class.getName() + //$NON-NLS-1$ 
          "(\"" + literalValue //$NON-NLS-1$
          + "\")"; //$NON-NLS-1$
    } else if (clz == Date.class) {
      try {
        final Date dt = xmlDateFormat.parse(literalValue);
        return "new " + Date.class.getName() + //$NON-NLS-1$ 
            "(" + dt.getTime() + //$NON-NLS-1$
            ")"; //$NON-NLS-1$
      } catch (final ParseException e) {
        return "new Date(" + toStringLiteral(literalValue) + //$NON-NLS-1$ 
            ")"; //$NON-NLS-1$
      }
    } else if (clz == java.sql.Date.class) {
      try {
        final Date dt = xmlDateFormat.parse(literalValue);
        return "new " + java.sql.Date.class.getName() + //$NON-NLS-1$
            "(" //$NON-NLS-1$
            + dt.getTime() + ")"; //$NON-NLS-1$
      } catch (final ParseException e) {
        return "new Date(" + toStringLiteral(literalValue) + //$NON-NLS-1$ 
            ")"; //$NON-NLS-1$
      }
    } else if (clz == java.sql.Timestamp.class) {
      try {
        final Date dt = xmlDateFormat.parse(literalValue);
        return "new " + java.sql.Timestamp.class.getName() + //$NON-NLS-1$ 
            "(" //$NON-NLS-1$
            + dt.getTime() + ")"; //$NON-NLS-1$
      } catch (final ParseException e) {
        return "new Date(" + toStringLiteral(literalValue) + //$NON-NLS-1$ 
            ")"; //$NON-NLS-1$
      }
    }
    return null;
  }

  private static String toCharLiteral(final String literalValue) {
    final StringBuilder result = new StringBuilder(8);
    result.append('\'');
    result.append(escapeChar(literalValue.toCharArray()[0]));
    result.append('\'');
    return result.toString();
  }

  /**
   * Returns a literal expression for the given <code>String</code>. Each of its characters will appear in the same form
   * as if it was the argument to {@link #toCharLiteral}.
   */
  public static String toStringLiteral(final String s) {
    if (s == null) {
      return GenConstants.NULL;
    }
    final int len = s.length();
    final StringBuilder result = new StringBuilder(len + 16);
    result.append('\"');
    for (int i = 0; i < len; i++) {
      result.append(escapeChar(s.charAt(i)));
    }
    result.append('\"');
    return result.toString();
  }

  private static String escapeChar(final char c) {
    if (c == '\b') {
      return "\\b"; //$NON-NLS-1$
    }
    if (c == '\t') {
      return "\\t"; //$NON-NLS-1$
    }
    if (c == '\n') {
      return "\\n"; //$NON-NLS-1$
    }
    if (c == '\f') {
      return "\\f"; //$NON-NLS-1$
    }
    if (c == '\r') {
      return "\\r"; //$NON-NLS-1$
    }
    if (c == '\"') {
      return "\\\""; //$NON-NLS-1$
    }
    if (c == '\'') {
      return "\\\'"; //$NON-NLS-1$
    }
    if (c == '\\') {
      return "\\\\"; //$NON-NLS-1$
    }
    if (c >= 32 && c < 127) {
      return String.valueOf(c);
    }

    // escaped unicode form
    final String num = Integer.toHexString(c);
    switch (num.length()) {
    case 1:
      return "\\u000" + num; //$NON-NLS-1$
    case 2:
      return "\\u00" + num; //$NON-NLS-1$
    case 3:
      return "\\u0" + num; //$NON-NLS-1$
    }
    return "\\u" + num; //$NON-NLS-1$
  }
}
