package me.piggypiglet.rr;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class RREvent implements Listener {
    RandomRespawn plugin;

    public RREvent(RandomRespawn instance) {
        plugin = instance;
    }
    @EventHandler
    public void onPlayerDeathEvent(PlayerDeathEvent e) {
        Player p = e.getEntity();
        if (p.isDead()) {
            p.setHealth(20);
            String randomString = plugin.getRandomStringFromList(plugin.getLocationList());

            p.teleport(new Location(Bukkit.getWorld("world"),
                plugin.getConfig().getInt("locations." + randomString + ".x"),
                plugin.getConfig().getInt("locations." + randomString + ".y"),
                plugin.getConfig().getInt("locations." + randomString + ".z")));
        }
    }
}






