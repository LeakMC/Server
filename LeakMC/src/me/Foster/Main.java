package me.Foster;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	private static Plugin plugin;

	public static Plugin getPlugin() {
		return plugin;
	}

	public static void registerEvents(Plugin plugin,
			Listener... listeners) {
		for (Listener listener : listeners) {
			Bukkit.getServer().getPluginManager()
					.registerEvents(listener, plugin);
		}
	}
	
	public void onEnable() {
		registerEvents(this, new PlayerJoin());
	}
	
	public void onDisable() {
		
	}
}
