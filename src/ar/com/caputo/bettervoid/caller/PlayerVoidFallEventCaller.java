package ar.com.caputo.bettervoid.caller;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;

import ar.com.caputo.bettervoid.Core;
import ar.com.caputo.bettervoid.event.PlayerVoidFallEvent;

public class PlayerVoidFallEventCaller extends EventCaller {

    private Core core;

    public PlayerVoidFallEventCaller(Core core) {
        this.core=core;
   }

    @EventHandler
    public void handleCall(PlayerMoveEvent evt) {

        if(evt instanceof PlayerMoveEvent) {

            int y = ((PlayerMoveEvent)evt).getTo().getBlockY();
            Player player = ((PlayerMoveEvent)evt).getPlayer();
            World world = player.getWorld();

            if(y < world.getMinHeight()-15) {

                core.getServer().getPluginManager().callEvent(new PlayerVoidFallEvent(player));

            }
            
        }
        
    }

    
}
