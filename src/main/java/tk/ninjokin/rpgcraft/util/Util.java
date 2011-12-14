package tk.ninjokin.rpgcraft.util;

import org.bukkit.entity.Player;

import tk.ninjokin.rpgcraft.RPGCraft;

public class Util {
	
	
	/**
	 * Gets a level for a player.
	 * @param player
	 * @param skill
	 * @return
	 */
	public Level getPlayerLevel(Player p, Skill skill) {
		return lvl.getLevelFromInt(rpgc.getConfigInt(skill.toString() + "." + p.getName()));
	}
	
	/**
	 * Gets the experience for a player.
	 * @param player
	 * @param skill
	 * @return
	 */
	public Experience getPlayerExperience(Player p, Skill skill) {
		return exp.getExpFromInt(rpgc.getConfigInt(skill.toString() + "." + p.getName()));
	}
	
	public void addPlayerExp(String path, int amount) {
		rpgc.addExperience(path, amount);
	}
	
	private Level lvl = new Level();
	private Experience exp = new Experience();
	private RPGCraft rpgc = new RPGCraft();
}