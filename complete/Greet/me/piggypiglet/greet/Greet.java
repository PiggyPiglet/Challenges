package me.piggypiglet.greet;

import org.bukkit.plugin.java.JavaPlugin;

public class Greet extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("greet").setExecutor(new GreetCommand());
    }
}
