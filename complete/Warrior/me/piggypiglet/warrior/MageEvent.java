package me.piggypiglet.warrior;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import static org.bukkit.Material.STICK;
import static org.bukkit.entity.EntityType.FIREBALL;
import static org.bukkit.event.block.Action.*;

public class MageEvent implements Listener {
    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Action a = e.getAction();
        if (a == RIGHT_CLICK_AIR || a == RIGHT_CLICK_BLOCK || a == LEFT_CLICK_AIR || a == LEFT_CLICK_BLOCK) {
            if (e.getItem().getType() == STICK) {
                if (e.getItem().getItemMeta().getDisplayName().equals("§cWand")) {
                    p.getWorld().spawnEntity(p.getLocation(), FIREBALL);
                }
            }
        }
    }
}