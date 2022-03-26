package uk.cncmc.plugins.basic;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class CmdHelloCommand implements CommandExecutor {
	
	// to access the config object we need to get the main class
	private BasicSpigotPlugin mainClass;
	
	// create an object to store the config object
	FileConfiguration config;
	
	public CmdHelloCommand(BasicSpigotPlugin mainClass) {
		//main class is passed in here
		this.mainClass = mainClass;
		
		// get the plugin config object
		config = mainClass.getConfig();
	}

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

    	// if you want to see if it was a player that executed the command and then
    	// do stuff with them, do that here.
    	// anything player specific needs to be inside this if statement
    	if (sender instanceof Player) {
    		
    		// anything inside here will only happen if the command is typed by a player.
    		// if the command is typed on the console, none of this will happen
    		
    		// to access the player object you need to cast it to the Player type
            Player player = (Player) sender;
            
            //send a message specifically to the player
            player.sendMessage(ChatColor.DARK_GREEN+"Thanks for playing.");
            
            //send a message to the whole server about the player
            Bukkit.getServer().broadcastMessage(player.getName()+" said hello. They are level "+ Integer.valueOf(player.getLevel()));
            
            //kill the player
            player.setHealth(0);
        }
    	
    	// get the value for this property
    	int helloCount = config.getInt("helloCount");
    	// add 1 to the value and save it
    	config.set("helloCount", helloCount + 1);
    	mainClass.saveConfig();
    	
    	// this will send a message to everyone, whether the command was typed by a player or if it was typed by console
    	// show the amount of times executed and add 1
    	Bukkit.getServer().broadcastMessage("Somebody typed /hellocommand - times typed: "+ String.valueOf((helloCount+1)));
    	
        return true;
    }
}
