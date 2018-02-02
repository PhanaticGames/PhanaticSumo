package me.phanatic.sumo.listeners;

import org.bukkit.Location;
import org.bukkit.scoreboard.Team;

public class combo {

	public static void setArena(PlayerInteractEvent event) 
	{
		Location loc1 = new Location(null, -127, 70, 103);
		Location loc2 = new Location(null, -126, 70, 89);
	}
	
	@EventHandler
	public static void onDamage(EntityDamageEvent event)
	{
		event.getPlayer().setMaximumNoDamageTicks(0);
	}
	
}
	
	

