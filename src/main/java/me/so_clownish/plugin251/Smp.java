package me.so_clownish.plugin251;


import me.so_clownish.plugin251.commands.rules;
import me.so_clownish.plugin251.commands.url;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Smp extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new OnJoin(), this);
        getCommand("rules").setExecutor(new rules());
        getCommand("website").setExecutor(new url());


        System.out.println("LOADED");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
