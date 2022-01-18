package com.hicupalot.mischiefcontrol;

import Commands.MischiefControlInfo;
import Inhibitors.LaggStopper;
import Inhibitors.Piston;
import Inhibitors.TNTOff;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class MischiefControl extends JavaPlugin {

    @Override
    public void onEnable(){
        getCommand("mischiefcontrol").setExecutor(new MischiefControlInfo());
        getServer().getPluginManager().registerEvents(new TNTOff(), this);
        getServer().getPluginManager().registerEvents(new Piston(), this);
        getServer().getPluginManager().registerEvents(new LaggStopper(),this);
        System.out.println(ChatColor.LIGHT_PURPLE+"MischiefControl loaded successfully!");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
