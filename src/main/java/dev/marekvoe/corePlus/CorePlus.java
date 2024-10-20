package dev.marekvoe.corePlus;

import dev.marekvoe.corePlus.commands.InfoCommand;
import dev.marekvoe.corePlus.managers.ChatManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class CorePlus extends JavaPlugin {

    // Managers
    private ChatManager chatManager;

    @Override
    public void onEnable() {
        registerManagers();
        registerCommands();
        registerListeners();
        Bukkit.getConsoleSender().sendMessage(chatManager.getPrefix() + ChatColor.GREEN + "Plugin enabled !");
    }

    // Register all listeners
    private void registerListeners() {

    }

    // Register all managers
    private void registerManagers() {
        this.chatManager = new ChatManager();
    }


    // Register all commands
    private void registerCommands() {
        getCommand("info").setExecutor(new InfoCommand(this.chatManager));
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(chatManager.getPrefix() + ChatColor.RED + "Plugin disabled !");
    }
}
