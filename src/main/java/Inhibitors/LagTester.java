package Inhibitors;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerEvent;

import javax.management.timer.Timer;
import java.util.EventListener;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LagTester implements EventListener, Listener {
    @EventHandler
    public void TPS(ServerEvent e) throws InterruptedException {
        if (Bukkit.getServer().getTPS().length < 10) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.sendMessage(ChatColor.BOLD+"Due to Server Lag, Dropped Items will be deleted in 15 seconds!");
                TimeUnit.SECONDS.sleep(15); //TimeFrame to Wait
            //----------------------------------------------------------//
                World world = Bukkit.getServer().getWorld("world"); //Change this if world name changes
                assert world!=null;
                List<Entity> entList = world.getEntities();
                for (Entity items : entList) {
                    if (items instanceof Item) {
                        items.remove();
                         players.sendMessage(ChatColor.BOLD+"All Dropped Items were deleted!");
                    }
                }
            }
        }
    }
}
