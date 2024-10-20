package dev.marekvoe.corePlus.commands;

import dev.marekvoe.corePlus.managers.ChatManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InfoCommand implements CommandExecutor {

    // Chat manager for prefixes etc.
    private ChatManager chatManager;

    // Command constructor
    public InfoCommand(ChatManager chatManager) {
        this.chatManager = chatManager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            if (cmd.getName().equalsIgnoreCase(label)) {
                Player player = (Player) sender;
                if (player.hasPermission("coreplus.command.info")) {
                    chatManager.sendInfoMessage(player);
                } else {
                    player.sendMessage(chatManager.getPrefix() + ChatColor.RED + "You dont have enough permissions !");
                }
            }
        }
        return false;
    }
}
