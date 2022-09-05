package sawfowl.mysqldriver;

import org.spongepowered.plugin.PluginContainer;
import org.spongepowered.plugin.builtin.jvm.Plugin;

import com.google.inject.Inject;

@Plugin("mysqldriver")
public class MySQLDriver {

	private PluginContainer pluginContainer;

	@Inject
	public MySQLDriver(PluginContainer pluginContainer) {
		this.pluginContainer = pluginContainer;
	}

	public PluginContainer getPluginContainer() {
		return pluginContainer;
	}

}
