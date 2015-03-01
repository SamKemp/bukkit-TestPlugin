package pw.untamemadman.plugins.testplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import pw.untamemadman.plugins.testplugin.listeners.onLogin;

/**
 * Created by untamemadman on 28/02/2015.
 */

public class TestPlugin extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getLogger().info("onEnable has been invoked!"); //Prints that "onEnable" has been called
        //getServer().getPluginManager().registerEvents(new onLogin(), this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (cmd.getName().equalsIgnoreCase("untamemadman"))
        // If the player typed /untamemadman then do the following...
        {
            if (sender instanceof Player)
            {
                Player player = (Player) sender;
                sender.sendMessage("Thanks for using my plugin!");
                sender.sendMessage("This is version " + ChatColor.GREEN + "1.0");
                sender.sendMessage("for more information go to my website");
                sender.sendMessage(ChatColor.BLUE  + "http://plugins.untamemadman.pw");
                sender.sendMessage(ChatColor.BLUE  + "http://modding.untamemadman.pw");
                sender.sendMessage("View my blog here");
                sender.sendMessage(ChatColor.BLUE  + "http://blog.untamemadman.pw");
                sender.sendMessage("How about supporting me?");
                sender.sendMessage(ChatColor.BLUE  + "http://patreon.untamemadman.pw");
                return true;
            }
            else
            {
                sender.sendMessage("You must be a player!");
                return false;
            }
        }
        return false;
    }

    @Override
    public void onDisable()
    {
        getLogger().info("onDisable has been invoked!"); //Prints that "onDisable" has been called
    }
}
