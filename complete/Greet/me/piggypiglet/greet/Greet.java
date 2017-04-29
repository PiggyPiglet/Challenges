package me.piggypiglet.greet;

import org.bukkit.plugin.java.JavaPlugin;

public class Greet extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Greet v" + getDescription().getVersion() + " enabled.");
        this.getCommand("greet").setExecutor(new GreetCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Greet v" + getDescription().getVersion() + " disabled.");
    }
}
