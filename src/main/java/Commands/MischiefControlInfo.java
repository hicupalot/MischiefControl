package Commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MischiefControlInfo implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            sender.sendMessage(ChatColor.GOLD + "MischiefManaged:");
            sender.sendMessage(ChatColor.GOLD + "Author: " + "hicupalot");
            sender.sendMessage(ChatColor.GOLD + "Version: " + "1.1.2");
        }
        return true;
    }
}

