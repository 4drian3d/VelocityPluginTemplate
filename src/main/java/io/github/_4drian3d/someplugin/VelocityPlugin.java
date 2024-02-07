package io.github._4drian3d.someplugin;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(
	id = "velocityplugin",
	name = "VelocityPlugin",
	description = "A Velocity Plugin Template",
	version = Constants.VERSION,
	authors = { "4drian3d" }
)
public final class VelocityPlugin {
	@Inject
	private Logger logger;
	
	@Subscribe
	void onProxyInitialization(final ProxyInitializeEvent event) {
		// do stuff here
		logger.info("Hello World");
	}
}