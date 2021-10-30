package Inhibitors;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;

public class Piston implements  Listener {
    @EventHandler
    public void PistonIn(BlockPistonRetractEvent e) {
            e.setCancelled(true);
        }
    @EventHandler
    public void PistonOut(BlockPistonExtendEvent e) {
            e.setCancelled(true);
        }
    }
