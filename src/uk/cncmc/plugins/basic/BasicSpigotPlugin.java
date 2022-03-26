package uk.cncmc.plugins.basic;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class BasicSpigotPlugin extends JavaPlugin {
	
	// get the plugins config object
	FileConfiguration config = getConfig();
	
    // Fired when plugin is first enabled
    @Override
    public void onEnable() {
    	// register the command execution class - also send "this" our main plugin class
    	this.getCommand("hellocommand").setExecutor(new CmdHelloCommand(this));
    	
    	// register all the events that are setup in JoinListener class
    	getServer().getPluginManager().registerEvents(new JoinListener(), this);
    	
    	// if theres nothing for this property yet, create a default value and then save it
    	config.addDefault("helloCount", 0);
    	config.options().copyDefaults(true);
    	saveConfig();
    }
    
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }
}