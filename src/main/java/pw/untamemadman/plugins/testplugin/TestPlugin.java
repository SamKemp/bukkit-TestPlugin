package pw.untamemadman.plugins.testplugin;

import org.bukkit.plugin.java.JavaPlugin;
import pw.untamemadman.plugins.testplugin.listeners.onCommand;
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
        getServer().getPluginManager().registerEvents(new onLogin(), this);
        getServer().getPluginManager().registerEvents(new onCommand(), this);
    }

    @Override
    public void onDisable()
    {
        getLogger().info("onDisable has been invoked!"); //Prints that "onDisable" has been called
    }
}
