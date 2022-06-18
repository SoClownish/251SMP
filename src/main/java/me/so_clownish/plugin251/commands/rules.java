package me.so_clownish.plugin251.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class rules implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){




        if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.RED + "No Hacking or using xray \n Limit the destruction of bases \n NO lag machines \n No spamming \n Do not argue with staff, follow instructions \n If a staff makes a decision, it is final and there is no point arguing \n No swearing or saying inappropriate things in chat \n No asking for personal info \n No bullying \n Do NOT blackmail people in minecraft for real world things such as money, also do not threaten people");
        }



        return false;
    }


}
