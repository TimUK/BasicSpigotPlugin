package uk.cncmc.plugins.basic;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
	
	//use the eventhandler annotation to signal we want to register this event type
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
    	//sent a message to all players when a player joins
        Bukkit.broadcastMessage("Please welcome "+event.getPlayer().getName()+" to the server!");
    }
    
}
