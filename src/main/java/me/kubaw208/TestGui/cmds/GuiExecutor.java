package me.kubaw208.TestGui.cmds;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GuiExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player))
            return false;
        Player p = (Player) sender;
        Inventory inv = Bukkit.createInventory(null, InventoryType.CHEST, Component.text("Twoje inventory byczku"));

        inv.setItem(getRandomNumber(0, inv.getSize()), new ItemStack(Material.DIAMOND_SWORD));
        inv.setItem(getRandomNumber(0, inv.getSize()), new ItemStack(Material.CHEST));
        inv.setItem(getRandomNumber(0, inv.getSize()), new ItemStack(Material.DIRT));

        p.openInventory(inv);
        return false;
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
