package org.eclipse.emf.texo.server.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Utility method for the service layer.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ServiceUtils {

  /**
   * Gets the segments of a part, will ignore first and last separator.
   * 
   * @param path
   *          for example: SalesOrder/1233
   * @return the segments of the path: {"SalesOrder", "1233"}
   */
  public static String[] getSegments(String path) {
    if (path == null) {
      return new String[0];
    }
    String localPath = path;
    if (path.startsWith(ServiceConstants.PATH_SEPARATOR)) {
      localPath = localPath.substring(1);
    }
    if (path.endsWith(ServiceConstants.PATH_SEPARATOR)) {
      localPath = localPath.substring(0, path.length() - 1);
    }
    return localPath.split(ServiceConstants.PATH_SEPARATOR);
  }

  /**
   * Converts input stream to a string, if the inputstream is null then an empty string is returned.
   */
  public static String toString(InputStream is, String encoding) {
    if (is == null) {
      return ""; //$NON-NLS-1$
    }

    try {
      final String localEncoding = encoding == null ? "UTF-8" : encoding; //$NON-NLS-1$
      final Writer writer = new StringWriter();

      final char[] buffer = new char[1000];
      try {
        final Reader reader = new BufferedReader(new InputStreamReader(is, localEncoding));
        int n;
        while ((n = reader.read(buffer)) != -1) {
          writer.write(buffer, 0, n);
        }
      } finally {
        is.close();
      }
      return writer.toString();
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

}
