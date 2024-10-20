package dev.marekvoe.corePlus.managers;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ChatManager {

    private String prefix = ChatColor.translateAlternateColorCodes('&', "&8[&6CorePlus&8] &7");

    public ChatManager() {

    }

    public void sendInfoMessage(Player player) {

    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
