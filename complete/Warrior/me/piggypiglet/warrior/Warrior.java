package me.piggypiglet.warrior;

import org.bukkit.plugin.java.JavaPlugin;

public class Warrior extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Warrior v" + getDescription().getVersion() + " enabled.");
        this.getCommand("warrior").setExecutor(new WarriorCommand());
        this.getCommand("archer").setExecutor(new WarriorCommand());
        this.getCommand("mage").setExecutor(new WarriorCommand());
        getServer().getPluginManager().registerEvents(new MageEvent(), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("Warrior v" + getDescription().getVersion() + " disabled.");
    }
}
