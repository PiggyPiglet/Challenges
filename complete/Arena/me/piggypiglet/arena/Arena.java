package me.piggypiglet.arena;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Arena extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Arena v" + getDescription().getVersion() + " enabled.");
        getCommand("arena").setExecutor(new ArenaCommand(this));
        getCommand("setarena").setExecutor(new ArenaCommand(this));
        final FileConfiguration config = this.getConfig();
        config.addDefault("x", 1);
        config.addDefault("y", 1);
        config.addDefault("z", 1);
        config.options().copyDefaults(true);
        saveConfig();
    }
    @Override
    public void onDisable() {
        getLogger().info("Arena v" + getDescription().getVersion() + " disabled.");
    }
}
