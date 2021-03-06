package me.piggypiglet.rr;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class RandomRespawn extends JavaPlugin {

    public String getRandomStringFromList(List<String> list) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int randomNumber = random.nextInt(list.size());
        String randomString = list.get(randomNumber);

        return randomString;
    }

    private List<String> locationList;

    public List<String> getLocationList() {
        if (this.locationList == null)
            this.locationList = new ArrayList<>();
        return this.locationList;
    }
    @Override
    public void onEnable() {
        getCommand("rr").setExecutor(new RRCommand(this));
        getServer().getPluginManager().registerEvents(new RREvent(this), this);
        getConfig().addDefault("locations.name.x", 10);
        getConfig().addDefault("locations.name.y", 100);
        getConfig().addDefault("locations.name.z", 10);
        getConfig().options().copyDefaults(true);
        saveConfig();
        ConfigurationSection section = this.getConfig().getConfigurationSection("locations");

        if (section != null) {
            Set<String> locations = section.getKeys(false);

            if (locations != null && !locations.isEmpty()) {
                for (String location : locations) {
                    getLocationList().add(location);
                }
            }
        }
    }
}
