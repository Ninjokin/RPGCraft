package tk.ninjokin.rpgcraft;

import org.bukkit.configuration.Configuration;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import tk.ninjokin.rpgcraft.listener.BlockListen;

public class RPGCraft extends JavaPlugin {

	public void onEnable() {
		config = getConfig();
		saveConfig();
		
		PluginManager PM = getServer().getPluginManager();
		PM.registerEvent(Type.BLOCK_BREAK, new BlockListen(), Priority.Low, this);
		
		RL.Logging("Plugin now enabled!", Logging.NORMAL);
	}
	
	public void onDisable() {
		RL.Logging("Plugin now disabled!", Logging.NORMAL);
	}
	
	public int getConfigInt(String path) {
		return config.getInt(path);
	}
	
	public void addExperience(String path, int amount) {
		config.set(path, config.getInt(path) + amount);
	}
	
	private Log RL = new Log();
	private Configuration config;
}