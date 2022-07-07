package me.kubaw208.TestGui.main;

import org.bukkit.plugin.java.JavaPlugin;

public class TestGui extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("gui").setExecutor(new TestGui());
    }

}
