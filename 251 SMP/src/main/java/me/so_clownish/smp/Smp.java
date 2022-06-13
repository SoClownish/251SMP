package me.so_clownish.smp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Smp extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new OnJoin(), this);



        System.out.println("LOADED");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
