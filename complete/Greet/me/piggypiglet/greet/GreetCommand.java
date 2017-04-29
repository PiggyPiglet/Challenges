package me.piggypiglet.greet;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GreetCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                player.sendRawMessage("§7Greetings §c" + player.getDisplayName());
            }
            else {
                player.sendRawMessage("§7Greetings §c" + args[0].replace("[", "").replace("]", ""));
            }
        }
        return true;
    }
}
