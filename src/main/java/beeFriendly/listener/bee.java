package beeFriendly.listener;

import java.util.UUID;

import org.bukkit.entity.Bee;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

import beeFriendly.Main;


@SuppressWarnings("unused")

/**
 * 
 * @author Christopher Allen
 * This class detects and stops the harmful beesting event and sets the mob back to normal;
 * NOV 1 2019
 */

public class bee implements Listener  {
@EventHandler

public void BeeAngry (final EntityDamageByEntityEvent event) {
		EntityType happybee = org.bukkit.entity.EntityType.BEE;
		EntityType angrybee = event.getDamager().getType();
		Entity angryBee = event.getDamager();
		
		if(happybee.getEntityClass().equals(angrybee.getEntityClass())) {
			event.setCancelled(true);
			Bee bee = (Bee)angryBee;
			bee.setTarget(null);
			bee.setAnger(0);
			bee.setHasStung(false);
		}
	

	
	
}

}
