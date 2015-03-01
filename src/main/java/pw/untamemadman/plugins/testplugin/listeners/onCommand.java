package pw.untamemadman.plugins.testplugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/**
 * Created by untamemadman on 01/03/2015.
 */

public class onCommand implements Listener
{
    @EventHandler
    public void onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (cmd.getName().equalsIgnoreCase("untamemadman"))
        // If the player typed /untamemadman then do the following...
        {
            Bukkit.broadcastMessage("Thanks for using my mod!");
        }
    }
}
