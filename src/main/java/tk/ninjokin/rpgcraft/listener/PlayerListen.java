package tk.ninjokin.rpgcraft.listener;

import org.bukkit.Material;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerListener;

import tk.ninjokin.rpgcraft.util.Skill;
import tk.ninjokin.rpgcraft.util.Util;

public class PlayerListen extends PlayerListener {

	public void onBlockPlace(BlockPlaceEvent event) {
		if(event.getItemInHand().getType() == Material.DIAMOND_SPADE || event.getItemInHand().getType() == Material.GOLD_SPADE || event.getItemInHand().getType() == Material.IRON_SPADE || event.getItemInHand().getType() == Material.STONE_SPADE || event.getItemInHand().getType() == Material.WOOD_SPADE) {
			skill = Skill.EXCAVATION;
		} else if(event.getItemInHand().getType() == Material.DIAMOND_PICKAXE || event.getItemInHand().getType() == Material.GOLD_PICKAXE || event.getItemInHand().getType() == Material.IRON_PICKAXE || event.getItemInHand().getType() == Material.STONE_PICKAXE || event.getItemInHand().getType() == Material.WOOD_PICKAXE){
			skill = Skill.MINING;
		}
		u.getPlayerLevel(event.getPlayer(), skill);
	}
	private Util u = new Util();
	
	private Skill skill;
}