package your.packagehere;

import com.google.inject.Inject;

import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;

@Plugin(
	id = "yourplugin",
	name = "YourPlugin",
	version = Constants.VERSION
)
public final class YourPlugin {
	@Inject
	private ProxyServer proxyServer;
	
	@Subscribe
	void onProxyInitialization(final ProxyInitializeEvent event) {
		// do stuff here
	}
}