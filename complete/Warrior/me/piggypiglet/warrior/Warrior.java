package me.piggypiglet.warrior;

import org.bukkit.plugin.java.JavaPlugin;

public class Warrior extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("warrior").setExecutor(new WarriorCommand());
        getCommand("archer").setExecutor(new WarriorCommand());
        getCommand("mage").setExecutor(new WarriorCommand());
        getServer().getPluginManager().registerEvents(new MageEvent(), this);
    }
}
