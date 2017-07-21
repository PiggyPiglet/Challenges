package me.piggypiglet.arena;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ArenaCommand implements CommandExecutor {

    private Arena plugin;

    public ArenaCommand(Arena instance) {
        plugin = instance;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("setarena")) {
                plugin.getConfig().set("x", player.getLocation().getBlockX());
                plugin.getConfig().set("y", player.getLocation().getBlockY());
                plugin.getConfig().set("z", player.getLocation().getBlockZ());
                plugin.saveConfig();
                player.getWorld().setSpawnLocation(player.getLocation().getBlockX(), player.getLocation().getBlockY(), player.getLocation().getBlockZ());
                player.sendRawMessage("§7Arena and world spawn set to §c" + player.getLocation().getBlockX() + " §c" + player.getLocation().getBlockY() + " §c" + player.getLocation().getBlockZ());
            }
            if (cmd.getName().equalsIgnoreCase("arena")) {
                player.teleport(new Location(Bukkit.getWorld("world"), plugin.getConfig().getInt("x"), plugin.getConfig().getInt("y"), plugin.getConfig().getInt("z")));
                player.sendRawMessage("§7You have been teleported to the arena");
            }
        }
        return true;
    }
}
