package uk.cncmc.plugins.basic;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CmdHelloCommand implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

    	// outputs to the console
    	Bukkit.getLogger().info("Hello thanks for typing /hellocommand");
    	
        return true;
    }
}
