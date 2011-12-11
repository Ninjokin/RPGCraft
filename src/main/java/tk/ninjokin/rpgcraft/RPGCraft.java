package tk.ninjokin.rpgcraft;

import java.util.logging.Logger;

import lib.PatPeter.SQLibrary.SQLite;

import org.bukkit.plugin.java.JavaPlugin;

public class RPGCraft extends JavaPlugin {

	public void onEnable() {
		data.getConnection();
		
		if(!data.checkTable("mining")) {
			data.createTable("mining");
			RL.Logging("Table \"mining was created!", Logging.DEBUGGING);
		}
		
		if(!data.checkTable("woodcutting")) {
			data.createTable("woodcutting");
			RL.Logging("Table \"woodcutting was created!", Logging.DEBUGGING);
		}
		
		if(!data.checkTable("excavation")) {
			data.createTable("excavation");
			RL.Logging("Table \"excavation was created!", Logging.DEBUGGING);
		}
		
		RL.Logging("Plugin now enabled!", Logging.NORMAL);
	}
	
	public void onDisable() {
		RL.Logging("Plugin now disabled!", Logging.NORMAL);
	}
	
	private Log RL = new Log();
	private Logger Log = Logger.getLogger("Minecraft");
	private SQLite data = new SQLite(Log, "[RPGCraft] ", "RPGCraft", "rpgcraft");
}