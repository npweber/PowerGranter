package nathan.apes.pg.event;

import nathan.apes.pg.main.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class EventMobDeath implements Listener{

	@EventHandler
	public void onMobDeath(EntityDeathEvent ede){
		
		double rint = Math.random();
		
		if(ede.getEntityType().equals(EntityType.CREEPER) || ede.getEntityType().equals(EntityType.SKELETON) || ede.getEntityType().equals(EntityType.SPIDER) || ede.getEntityType().equals(EntityType.ZOMBIE) || ede.getEntityType().equals(EntityType.CAVE_SPIDER) || ede.getEntityType().equals(EntityType.ENDERMAN) || ede.getEntityType().equals(EntityType.HUSK) || ede.getEntityType().equals(EntityType.STRAY)){
			
			if(ede.getEntity().getKiller().getHealth() <= 8){
				
				if(rint <= 0.5){
					
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "f powerboost p " + ede.getEntity().getKiller().getPlayerListName() + " " + Main.config.getInt("powergranted"));
					
					ede.getEntity().getKiller().sendMessage("[" + ChatColor.RED + "PowerGranter" + ChatColor.RESET + "]" + ChatColor.AQUA + " You just earned " + Main.config.getInt("powergranted") + " amount of Faction Power!");
					
				}
				
			}
			
		}
		
	}
	
}
