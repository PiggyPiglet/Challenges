package me.piggypiglet.arena;

import org.bukkit.plugin.java.JavaPlugin;

public class Arena extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("arena").setExecutor(new ArenaCommand(this));
        getCommand("setarena").setExecutor(new ArenaCommand(this));
        getConfig().addDefault("x", 1);
        getConfig().addDefault("y", 1);
        getConfig().addDefault("z", 1);
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
}
