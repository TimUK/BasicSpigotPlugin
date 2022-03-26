package uk.cncmc.plugins.basic;

import org.bukkit.plugin.java.JavaPlugin;

public class BasicSpigotPlugin extends JavaPlugin {
	
    // Fired when plugin is first enabled
    @Override
    public void onEnable() {
    	// register the command execution class
    	this.getCommand("hellocommand").setExecutor(new CmdHelloCommand());
    	
    	// register all the events that are setup in JoinListener class
    	getServer().getPluginManager().registerEvents(new JoinListener(), this);
    }
    
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }
}