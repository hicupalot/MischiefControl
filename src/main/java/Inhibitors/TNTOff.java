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

    @EventHandler
    public void onInteract(PlayerInteractEvent e) { //This is to make sure players aren't confused
        assert e.getClickedBlock().getType() != null; //I know this is always true but IntelliJ was shouting at me and we can't have that
        if (e.getClickedBlock().getType() != Material.TNT) {
            return;
        }
        if (e.getClickedBlock().getType().equals(Material.TNT)) {
            if (e.getPlayer().getItemInUse() == null){ //This is a fallback
                return;
            }
            if (e.getPlayer().getItemInUse().getType().equals(Material.FLINT_AND_STEEL)) {
                e.getPlayer().sendMessage(ChatColor.YELLOW + "TNT is disabled on this server for lagg reasons");
            }
        }
    }
}

