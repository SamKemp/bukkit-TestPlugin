package pw.untamemadman.plugins.testplugin;

import org.bukkit.Bukkit;
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
            if(args.length == 0)
            {
                Player player = (Player) sender;
                sender.sendMessage("Use arguments");
                return false;
            }
            else if(args[0].equalsIgnoreCase("info"))
            {
                if (sender instanceof Player) {
                    Player player = (Player) sender;
                    sender.sendMessage("Thanks for using my plugin!");
                    sender.sendMessage("This is version " + ChatColor.GREEN + "1.1");
                    sender.sendMessage("for more information go to my website");
                    sender.sendMessage(ChatColor.BLUE + "http://plugins.untamemadman.pw");
                    sender.sendMessage(ChatColor.BLUE + "http://modding.untamemadman.pw");
                    sender.sendMessage("View my blog here");
                    sender.sendMessage(ChatColor.BLUE + "http://blog.untamemadman.pw");
                    sender.sendMessage("How about supporting me?");
                    sender.sendMessage(ChatColor.BLUE + "http://patreon.untamemadman.pw");
                    return true;
                } else
                {
                    getLogger().info("'untamemadman' has been run from console.");
                    getLogger().info("ALL players will see the message.");
                    Bukkit.broadcastMessage("Thanks for using my plugin!");
                    Bukkit.broadcastMessage("This is version " + ChatColor.GREEN + "1.1");
                    Bukkit.broadcastMessage("for more information go to my website");
                    Bukkit.broadcastMessage(ChatColor.BLUE + "http://plugins.untamemadman.pw");
                    Bukkit.broadcastMessage(ChatColor.BLUE + "http://modding.untamemadman.pw");
                    Bukkit.broadcastMessage("View my blog here");
                    Bukkit.broadcastMessage(ChatColor.BLUE + "http://blog.untamemadman.pw");
                    Bukkit.broadcastMessage("How about supporting me?");
                    Bukkit.broadcastMessage(ChatColor.BLUE + "http://patreon.untamemadman.pw");
                    return true;
                }
            }
            else if(args[0].equalsIgnoreCase("fire"))
            {
                if (sender instanceof Player)
                {
                    ((Player) sender).setFireTicks(2400); //2400 = 120 seconds = 2 mins
                    return true;
                }
                else
                {
                    sender.sendMessage("You must be a player");
                    return false;
                }
            }
            else
            {
                Player player = (Player) sender;
                sender.sendMessage("Use arguments");
                return false;
            }
        }

        if (cmd.getName().equalsIgnoreCase("untame"))
        // If the player typed /untame then do the following...
        {
            if(args.length == 0)
            {
                Player player = (Player) sender;
                sender.sendMessage("Use arguments");
                return false;
            }
            else if(args[0].equalsIgnoreCase("info"))
            {
                if (sender instanceof Player) {
                    Player player = (Player) sender;
                    sender.sendMessage("Thanks for using my plugin!");
                    sender.sendMessage("This is version " + ChatColor.GREEN + "1.1");
                    sender.sendMessage("for more information go to my website");
                    sender.sendMessage(ChatColor.BLUE + "http://plugins.untamemadman.pw");
                    sender.sendMessage(ChatColor.BLUE + "http://modding.untamemadman.pw");
                    sender.sendMessage("View my blog here");
                    sender.sendMessage(ChatColor.BLUE + "http://blog.untamemadman.pw");
                    sender.sendMessage("How about supporting me?");
                    sender.sendMessage(ChatColor.BLUE + "http://patreon.untamemadman.pw");
                    return true;
                } else
                {
                    getLogger().info("'untame' has been run from console.");
                    getLogger().info("ALL players will see the message.");
                    Bukkit.broadcastMessage("Thanks for using my plugin!");
                    Bukkit.broadcastMessage("This is version " + ChatColor.GREEN + "1.1");
                    Bukkit.broadcastMessage("for more information go to my website");
                    Bukkit.broadcastMessage(ChatColor.BLUE + "http://plugins.untamemadman.pw");
                    Bukkit.broadcastMessage(ChatColor.BLUE + "http://modding.untamemadman.pw");
                    Bukkit.broadcastMessage("View my blog here");
                    Bukkit.broadcastMessage(ChatColor.BLUE + "http://blog.untamemadman.pw");
                    Bukkit.broadcastMessage("How about supporting me?");
                    Bukkit.broadcastMessage(ChatColor.BLUE + "http://patreon.untamemadman.pw");
                    return true;
                }
            }
            else if(args[0].equalsIgnoreCase("fire"))
            {
                if (sender instanceof Player)
                {
                    ((Player) sender).setFireTicks(2400); //2400 = 120 seconds = 2 mins
                    return true;
                }
                else
                {
                    sender.sendMessage("You must be a player");
                    return false;
                }
            }
            else
            {
                Player player = (Player) sender;
                sender.sendMessage("Use arguments");
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
