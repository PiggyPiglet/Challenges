package me.piggypiglet.sword;

import org.bukkit.plugin.java.JavaPlugin;

public class Sword extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Sword v" + getDescription().getVersion() + " enabled.");
        this.getCommand("sword").setExecutor(new SwordCommand());
    }
    @Override
    public void onDisable() {
        getLogger().info("Sword v" + getDescription().getVersion() + " disabled.");
    }
}
