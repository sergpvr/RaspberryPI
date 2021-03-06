/*******************************************************************************
 * Copyright (c) 2014 Composent, Inc. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Scott Lewis - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecf.internal.raspberrypi.gpio.pi4j.MCP3008;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private MCP3008 fMCP3008;

	@Override
	public void start(BundleContext ctxt) throws Exception {
		fMCP3008 = new MCP3008();
		fMCP3008.start(ctxt);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		fMCP3008.stop(context);
		fMCP3008 = null;
		context = null;
	}
}
