package beeFriendly;

import org.bukkit.plugin.java.JavaPlugin;

import beeFriendly.listener.bee;

public class Main extends JavaPlugin {
    
    @Override
    public void onEnable() {
    	if(getConfig().getString("isEnabled").equalsIgnoreCase("true")) {
    	System.out.println("\u001b[33m" + "BeeFriendly is enabled in your config!" + "\u001b[0m");
    	getServer().getPluginManager().registerEvents(new bee(), this);
    	} else {
    		System.out.println("\u001b[31m" + "BeeFriendly is DISABLED in your config!" + "\u001b[0m");
    	}
    	saveDefaultConfig();
    }
    
    @Override
    public void onDisable() {

    }
     
    /**
     * 
     * @param 
     * @return requested config file string is returned
     */
}
 