package me.piggypiglet.warrior;

import org.bukkit.plugin.java.JavaPlugin;

public class Warrior extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Warrior v" + getDescription().getVersion() + " enabled.");
        this.getCommand("warrior").setExecutor(new WarriorCommand());
    }
    @Override
    public void onDisable() {
        getLogger().info("Warrior v" + getDescription().getVersion() + " disabled.");
    }
}
