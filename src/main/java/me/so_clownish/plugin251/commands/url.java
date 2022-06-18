package me.so_clownish.plugin251.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class url implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){




        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.RED +"www.minecraft.251.org");
        }



        return false;
    }

}
