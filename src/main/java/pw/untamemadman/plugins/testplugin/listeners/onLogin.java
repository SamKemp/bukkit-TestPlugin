package pw.untamemadman.plugins.testplugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

/**
 * Created by untamemadman on 28/02/2015.
 */

public class onLogin implements Listener
{
    @EventHandler
    public void onLogin(PlayerLoginEvent event)
    {

        Bukkit.broadcastMessage("A player just joined!");
    }
}
