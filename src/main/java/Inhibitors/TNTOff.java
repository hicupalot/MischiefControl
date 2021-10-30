package Inhibitors;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class TNTOff implements Listener {
    @EventHandler
    public void TNT(EntitySpawnEvent e) {
            if (e.getEntity().getType().equals(EntityType.PRIMED_TNT)) {
                e.setCancelled(true);
            }
        }
    }

