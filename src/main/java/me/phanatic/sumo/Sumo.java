package me.phanatic.sumo;

import org.bukkit.plugin.java.JavaPlugin;

import code.matthew.psc.utils.core.CommandManager;

public class Sumo extends JavaPlugin {
	
	@Override
	public void onEnable() {
		CommandManager.regCommand(new join());
		CommandManager.regCommand(new host());
        getServer().getPluginManager().registerEvents(new Combo(), this);
	}
	
	@Override
	public void onDisable() {
	
	}

}
