package org.eclipse.emf.texo.generator;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.eclipse.xpand2.output.FileHandle;

/**
 * Receives the output of a generate action and the target location. Reads the current source from there and merges the
 * generation output and the current content.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class PropertyMerger extends MergingOutputHandler {

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.MergingOutputHandler#merge(org.eclipse.xpand2.output.FileHandle)
   */
  @Override
  protected void merge(final FileHandle fileHandle) {

    try {
      final File targetFile = new File(fileHandle.getAbsolutePath());
      final Properties currentProps = new Properties();
      if (targetFile.exists()) {
        final InputStream is = new FileInputStream(targetFile);
        try {
          currentProps.load(is);
        } finally {
          is.close();
        }
      }

      final Properties newProps = new Properties();
      // TODO: encoding?
      final InputStream is = new ByteArrayInputStream(fileHandle.getBuffer().toString().getBytes());
      try {
        newProps.load(is);
      } finally {
        is.close();
      }
      newProps.putAll(currentProps);

      final List<PropertyEntry> result = convertSort(newProps);

      // find the list of prefixes
      final List<String> prefixes = new ArrayList<String>();
      String currentPrefix = null;
      for (final PropertyEntry pe : result) {
        if (pe.key.indexOf(".") == -1) { // a prefix //$NON-NLS-1$
          if (currentPrefix == null) {
            currentPrefix = pe.key;
            prefixes.add(currentPrefix);
            // handle the plural case
          } else if (currentPrefix.compareTo(pe.key + "s") != 0) { //$NON-NLS-1$
            if (pe.key.endsWith("s")) { //$NON-NLS-1$
              final String shortPrefix = pe.key.substring(0, pe.key.length() - 1);
              if (!prefixes.contains(shortPrefix)) {
                currentPrefix = pe.key;
                prefixes.add(currentPrefix);
              }
            } else {
              currentPrefix = pe.key;
              prefixes.add(currentPrefix);
            }
          }
        }
      }

      final StringBuilder newContent = new StringBuilder();
      for (final String prefix : prefixes) {
        if (newContent.length() > 0) {
          newContent.append("\n"); //$NON-NLS-1$
        }
        newContent.append("#\n"); //$NON-NLS-1$
        newContent.append("# " + prefix + //$NON-NLS-1$ 
            "\n"); //$NON-NLS-1$
        newContent.append("#\n"); //$NON-NLS-1$
        for (final PropertyEntry pe : result) {
          if (pe.isWritten()) {
            continue;
          }
          if (pe.key.compareTo(prefix) == 0 || pe.key.compareTo(prefix + "s") == 0 //$NON-NLS-1$
              || pe.key.startsWith(prefix + ".")) { //$NON-NLS-1$
            newContent.append(pe.write() + "\n"); //$NON-NLS-1$
          }
        }
      }
      fileHandle.setBuffer(newContent);
    } catch (final IllegalStateException c) {
      throw c; // rethrow to prevent to many exceptions
    } catch (final Exception e) {
      // catch them all
      throw new IllegalStateException("Exception while merging and saving property file " //$NON-NLS-1$
          + fileHandle.getAbsolutePath() + " " + e.getMessage() + " " + e, e); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /** Sort and return the properties in a list */
  private List<PropertyEntry> convertSort(final Properties props) {
    final List<PropertyEntry> result = new ArrayList<PropertyEntry>();
    for (final Object keyObject : props.keySet()) {
      final String key = (String) keyObject;
      result.add(new PropertyEntry(key, props.getProperty(key)));
    }
    Collections.sort(result);
    return result;
  }

  protected class PropertyEntry implements Comparable<PropertyEntry> {

    private String key;
    private String value;
    private boolean written = false;

    PropertyEntry(final String key, final String value) {
      this.key = key;
      this.value = value;
    }

    public int compareTo(final PropertyEntry o) {
      // ensure that the ones with a dot are placed later
      return key.replaceAll("\\.", //$NON-NLS-1$ 
          "z").compareTo( //$NON-NLS-1$
          o.key.replaceAll("\\.", //$NON-NLS-1$ 
              "z")); //$NON-NLS-1$
    }

    private String write() {
      written = true;
      return key + " = " + value; //$NON-NLS-1$
    }

    /**
     * @return the written
     */
    public boolean isWritten() {
      return written;
    }
  }

  @Override
  protected String[] getSupportedExtensions() {
    return new String[] { ".properties" }; //$NON-NLS-1$
  }

}
