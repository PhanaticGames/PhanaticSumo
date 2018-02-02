package me.phanatic.sumo.listeners;

public class air {
@EventHandler
	public static void onDamage(EntityDamageEvent event)
	{
		event.setDamage(2.0D);
	}
}
