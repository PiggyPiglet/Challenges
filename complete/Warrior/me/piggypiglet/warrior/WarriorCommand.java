package me.piggypiglet.warrior;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class WarriorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("warrior")) {

                ItemStack[] warrior;
                warrior = new ItemStack[]{new ItemStack(Material.IRON_SWORD), new ItemStack(Material.FISHING_ROD)};
                ItemStack helmet = new ItemStack(Material.IRON_HELMET);
                ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE);
                ItemStack leggings = new ItemStack(Material.IRON_LEGGINGS);
                ItemStack boots = new ItemStack(Material.IRON_BOOTS);

                player.getInventory().clear();
                player.getInventory().addItem(warrior);
                player.getInventory().setHelmet(helmet);
                player.getInventory().setChestplate(chestplate);
                player.getInventory().setLeggings(leggings);
                player.getInventory().setBoots(boots);
            }
            if (cmd.getName().equalsIgnoreCase("archer")) {

                ItemStack[] archer;
                archer = new ItemStack[]{new ItemStack(Material.WOOD_SWORD), new ItemStack(Material.ARROW, 64), new ItemStack(Material.ARROW, 64)};
                ItemStack helmet = new ItemStack(Material.CHAINMAIL_HELMET);
                ItemStack chestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
                ItemStack leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);
                ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS);

                player.getInventory().clear();
                player.getInventory().addItem(archer);
                player.getInventory().setHelmet(helmet);
                player.getInventory().setChestplate(chestplate);
                player.getInventory().setLeggings(leggings);
                player.getInventory().setBoots(boots);
            }
        }
    return true;
    }
}