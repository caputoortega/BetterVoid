package ar.com.caputo.bettervoid;


import org.bukkit.plugin.java.JavaPlugin;

import ar.com.caputo.bettervoid.event.EventTrigger;
import ar.com.caputo.bettervoid.handler.PlayerVoidFallEventHandler;

public class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        
        this.getServer().getPluginManager().registerEvents(new EventTrigger(this), this);
        this.getServer().getPluginManager().registerEvents(new PlayerVoidFallEventHandler(this), this);

    }

}
