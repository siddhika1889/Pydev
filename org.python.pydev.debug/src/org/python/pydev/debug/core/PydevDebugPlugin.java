package org.python.pydev.debug.core;

import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.plugin.*;
import org.eclipse.core.runtime.*;
import org.eclipse.core.resources.*;
/**
 * The main plugin for Python Debugger.
 * 
 * Standard plugin functionality: preferences, logging, some utility functions
 */
public class PydevDebugPlugin extends AbstractUIPlugin {
	//The shared instance.
	private static PydevDebugPlugin plugin;
		
	public PydevDebugPlugin(IPluginDescriptor descriptor) {
		super(descriptor);
		plugin = this;
	}

	public static PydevDebugPlugin getDefault() {
		return plugin;
	}
	
	public static String getPluginID() {
		return getDefault().getDescriptor().getUniqueIdentifier();
	}
	
	public static IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
	}
	
	/**
	 * Returns the active workbench window or <code>null</code> if none
	 */
	public static IWorkbenchWindow getActiveWorkbenchWindow() {
		return getDefault().getWorkbench().getActiveWorkbenchWindow();
	}
	
	public static Status makeStatus(int errorLevel, String message, Throwable e) {
		return new Status(errorLevel, getPluginID(), errorLevel, message, e);
	}
	/**
	 * @param errorLevel  IStatus.[OK|INFO|WARNING|ERROR]
	 */
	public static void log(int errorLevel, String message, Throwable e) {
		Status s = makeStatus(errorLevel, message, e);
		getDefault().getLog().log(s);
	}
}
