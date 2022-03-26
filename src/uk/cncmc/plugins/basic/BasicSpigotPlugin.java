package uk.cncmc.plugins.basic;

import org.bukkit.plugin.java.JavaPlugin;

public class BasicSpigotPlugin extends JavaPlugin {
	
    // Fired when plugin is first enabled
    @Override
    public void onEnable() {
    	// register the command execution class
    	this.getCommand("hellocommand").setExecutor(new CmdHelloCommand());
    }
    
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }
}