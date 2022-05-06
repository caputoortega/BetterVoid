package ar.com.caputo.bettervoid.event;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import ar.com.caputo.bettervoid.Core;

public class EventTrigger implements Listener {
    
    private Core core;

    public EventTrigger(Core core) {
        this.core = core;
    }

    @EventHandler
    public void triggerPlayerVoidFallEvent(PlayerMoveEvent evt) {

        int y = evt.getTo().getBlockY();
        Player player = evt.getPlayer();
        World world = player.getWorld();
        int trigger_height = world.getMinHeight()-15;

        if(y < trigger_height) {

            core.getServer().getPluginManager().callEvent(new PlayerVoidFallEvent(player));

        }

    }


}
