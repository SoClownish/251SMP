package me.so_clownish.plugin251;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.concurrent.TimeUnit;

public class OnJoin implements Listener {


    @EventHandler
    public  void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if(player.hasPlayedBefore()){

            player.sendMessage(ChatColor.GREEN + "Welcome Back to 251 " + player.getDisplayName());
            player.sendMessage(ChatColor.YELLOW + "Ever done /tips? I recommend you do. Also do /rules so you don't get banned :) ");
            event.setJoinMessage(ChatColor.BLUE + "Welcome back to the server " + player.getDisplayName()+ "!");

        }
        else{
            player.sendMessage(ChatColor.BLUE + "Hey, you must be new. Check out /tips for tips and do /rules so you don't get banned. Enjoy your stay:)");
            event.setJoinMessage(ChatColor.LIGHT_PURPLE + player.getDisplayName() + " is new to the server. Make them feel welcomed!");

        }
    }


    @EventHandler
    public void onLeave(PlayerQuitEvent event){
        Player player = event.getPlayer();

        event.setQuitMessage(ChatColor.DARK_AQUA + player.getDisplayName() + " Has left the game. You shall be missed!");
    }

}
