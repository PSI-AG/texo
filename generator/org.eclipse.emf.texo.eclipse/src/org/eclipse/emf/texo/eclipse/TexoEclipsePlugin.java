package org.eclipse.emf.texo.eclipse;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class TexoEclipsePlugin extends AbstractUIPlugin {

  // The plug-in ID
  public static final String PLUGIN_ID = "org.eclipse.emf.texo.eclipse"; //$NON-NLS-1$

  // The shared instance
  private static TexoEclipsePlugin plugin;

  public static TexoEclipsePlugin getInstance() {
    return plugin;
  }

  /**
   * The constructor
   */
  public TexoEclipsePlugin() {
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
   */
  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
   */
  @Override
  public void stop(BundleContext context) throws Exception {
    plugin = null;
    super.stop(context);
  }

  /**
   * Logs an exception in the Error Log.
   * 
   * @param throwable
   *          The exception.
   * @throws IllegalArgumentException
   *           If throwable is null.
   */
  public void logException(Throwable throwable) {
    logException(throwable.getMessage(), throwable);
  }

  /**
   * Logs an exception in the Error Log with the given message.
   * 
   * @param message
   *          The message to place in the Error Log.
   * @param throwable
   *          The exception.
   * @throws IllegalArgumentException
   *           If message or throwable is null.
   */
  public void logException(String message, Throwable throwable) {
    getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, IStatus.OK, message, throwable));
  }

  /**
   * Returns an image descriptor for the image file at the given plug-in relative path
   * 
   * @param path
   *          the path
   * @return the image descriptor
   */
  public static ImageDescriptor getImageDescriptor(String path) {
    return imageDescriptorFromPlugin(PLUGIN_ID, path);
  }
}
