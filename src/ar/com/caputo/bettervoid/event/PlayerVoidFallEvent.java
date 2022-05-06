package ar.com.caputo.bettervoid.event;

import org.bukkit.Location;
import org.bukkit.World.Environment;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerVoidFallEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private Player player;
    private Location location;
    private Environment environment;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public PlayerVoidFallEvent(Player player) {
        this.player = player;
        this.environment = player.getWorld().getEnvironment();
        this.location = player.getLocation();
    }

    public Player getPlayer() {
        return this.player;
    }

    public Environment getEnvironment() {
        return this.environment;
    }

    public Location getPlayerLocation() {
        return this.location;
    }


}
