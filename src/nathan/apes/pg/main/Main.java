package nathan.apes.pg.main;

import nathan.apes.pg.event.EventMobDeath;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;

public class Main extends JavaPlugin{

	public static FileConfiguration config = null;
	
	public void onEnable(){
		
		config = this.getConfig();
		
		config.addDefault("powergranted", 0);
		
		config.options().copyDefaults(true);
		this.saveConfig();
		
		this.getServer().getPluginManager().registerEvents(new EventMobDeath(), this);
		
		this.getLogger().info("Enabling PowerGranter...");
		
	}
	
	public void onDisable(){
		
		this.getLogger().info("Disabling PowerGranter...");
		
	}
	
}
