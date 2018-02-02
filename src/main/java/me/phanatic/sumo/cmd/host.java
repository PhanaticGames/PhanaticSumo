package me.phanatic.sumo.listeners;


import code.matthew.psc.api.command.ICommand;

public class host extends ICommand{

	
	public host()
	{
		super("host", "sumo.Host", "This command is used to host a game", true);
	}
	
	@Override
	public boolean finalExe(CommandSender sender, String[] args) {
		
		Bukkit.getServer().broadcastMessage(player.GetName() + "Is Hosting a Sumo Event Do /join");
		
	}
}
