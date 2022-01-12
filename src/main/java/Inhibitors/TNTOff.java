package Inhibitors;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class TNTOff implements Listener {
    @EventHandler
    public void TNT(EntitySpawnEvent e) {
        if (e.getEntity().getType().equals(EntityType.PRIMED_TNT)) {
            e.setCancelled(true);
        }
    }
}
