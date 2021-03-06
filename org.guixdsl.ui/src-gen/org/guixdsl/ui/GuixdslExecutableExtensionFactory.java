/*
 * generated by Xtext
 */
package org.guixdsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.guixdsl.ui.internal.GuixdslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GuixdslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return GuixdslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return GuixdslActivator.getInstance().getInjector(GuixdslActivator.ORG_GUIXDSL_GUIXDSL);
	}
	
}
