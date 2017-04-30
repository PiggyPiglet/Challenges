package me.piggypiglet.warrior;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static org.bukkit.Material.*;
import static org.bukkit.enchantments.Enchantment.*;
import static org.bukkit.event.block.Action.*;

public class WarriorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("warrior")) {

                ItemStack[] warrior;
                warrior = new ItemStack[]{new ItemStack(IRON_SWORD), new ItemStack(FISHING_ROD)};
                ItemStack helmet = new ItemStack(IRON_HELMET);
                ItemStack chestplate = new ItemStack(IRON_CHESTPLATE);
                ItemStack leggings = new ItemStack(IRON_LEGGINGS);
                ItemStack boots = new ItemStack(IRON_BOOTS);

                player.getInventory().clear();
                player.getInventory().addItem(warrior);
                player.getInventory().setHelmet(helmet);
                player.getInventory().setChestplate(chestplate);
                player.getInventory().setLeggings(leggings);
                player.getInventory().setBoots(boots);
            }
            if (cmd.getName().equalsIgnoreCase("archer")) {

                ItemStack[] archer;
                archer = new ItemStack[]{new ItemStack(WOOD_SWORD), new ItemStack(BOW), new ItemStack(ARROW, 64), new ItemStack(ARROW, 64)};
                ItemStack helmet = new ItemStack(CHAINMAIL_HELMET);
                ItemStack chestplate = new ItemStack(CHAINMAIL_CHESTPLATE);
                ItemStack leggings = new ItemStack(CHAINMAIL_LEGGINGS);
                ItemStack boots = new ItemStack(CHAINMAIL_BOOTS);

                player.getInventory().clear();
                player.getInventory().addItem(archer);
                player.getInventory().setHelmet(helmet);
                player.getInventory().setChestplate(chestplate);
                player.getInventory().setLeggings(leggings);
                player.getInventory().setBoots(boots);
            }
            if (cmd.getName().equalsIgnoreCase("mage")) {

                ItemStack mage = new ItemStack(STICK);
                ItemMeta meta = mage.getItemMeta();
                meta.addEnchant(KNOCKBACK, 2, false);
                meta.setDisplayName("§cWand");
                mage.setItemMeta(meta);

                ItemStack helmet = new ItemStack(GOLD_HELMET);
                ItemStack chestplate = new ItemStack(GOLD_CHESTPLATE);
                ItemStack leggings = new ItemStack(GOLD_LEGGINGS);
                ItemStack boots = new ItemStack(GOLD_BOOTS);

                player.getInventory().clear();
                player.getInventory().addItem(mage);
                player.getInventory().setHelmet(helmet);
                player.getInventory().setChestplate(chestplate);
                player.getInventory().setLeggings(leggings);
                player.getInventory().setBoots(boots);
            }
        }
    return true;
    }
}

