package tk.ninjokin.rpgcraft;

import java.util.logging.Logger;

public class Log {
	
	protected void Logging(String msg, Logging log) {
		if(log.equals(Logging.NORMAL)) {
			Log.info("[RPGCraft] " + msg);
		}
		if(log.equals(Logging.WARNING)) {
			Log.warning("[RPGCraft] " + msg);
		}
		if(log.equals(Logging.ERROR)) {
			Log.severe("[RPGCraft] " + msg);
		}
		if(log.equals(Logging.DEBUGGING)) {
			Log.info("DEBUGGING -- " + msg);
		}
	}
	
	public void Logging(String addon, String msg, Logging log) {
		
	}
	
	private Logger Log = Logger.getLogger("Minecraft");
}

enum Logging {
	NORMAL, WARNING, ERROR, DEBUGGING
}