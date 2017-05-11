package me.piggypiglet.rr;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RRCommand implements CommandExecutor {
    RandomRespawn plugin;

    public RRCommand(RandomRespawn instance) {
        plugin = instance;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("rr")) {
                player.setHealth(0);
                player.setHealth(20);
                String randomString = plugin.getRandomStringFromList(plugin.getLocationList());

                player.teleport(new Location(Bukkit.getWorld("world"),
                    plugin.getConfig().getInt("locations." + randomString + ".x"),
                    plugin.getConfig().getInt("locations." + randomString + ".y"),
                    plugin.getConfig().getInt("locations." + randomString + ".z")));
            }
        }
        return true;
    }
}
