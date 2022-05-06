package ar.com.caputo.bettervoid.handler;

import org.bukkit.Location;
import org.bukkit.World.Environment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import ar.com.caputo.bettervoid.Core;
import ar.com.caputo.bettervoid.event.PlayerVoidFallEvent;

public class PlayerVoidFallEventHandler implements Listener {

    private Core core;

    public PlayerVoidFallEventHandler(Core core) {
        this.core = core;
    }
    
    @EventHandler
    public void handle(PlayerVoidFallEvent event) {
        
        if(event.getEnvironment().equals(Environment.THE_END)) {

                Location bed_location = event.getPlayer().getBedSpawnLocation();
                
                if(bed_location==null) {
                    bed_location = core.getServer().getWorlds().get(0).getSpawnLocation();
                }
                
                Location overworld_target = new Location(
                    bed_location.getWorld(),
                    bed_location.getX()*8,
                    bed_location.getWorld().getMaxHeight()+128,
                    bed_location.getZ()*8,
                    event.getPlayerLocation().getPitch(),
                    event.getPlayerLocation().getYaw());
                
                event.getPlayer().teleport(overworld_target);

        }


    }

}
