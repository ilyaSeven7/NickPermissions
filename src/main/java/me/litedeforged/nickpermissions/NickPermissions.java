package me.litedeforged.nickpermissions;

import me.litedeforged.nickpermissions.listeners.PlayerJoin;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class NickPermissions extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getServer().getConsoleSender().sendMessage(component("<white>ily<light_purple>7even <dark_gray>» <aqua>Plugin Has Been Enabled!"));
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getServer().getConsoleSender().sendMessage(component("<white>ily<light_purple>7even <dark_gray>» <red>Plugin Has Been Disabled!"));
    }


    public Component component(String input) {
        String store = input;
        return MiniMessage.miniMessage().deserialize(store);
    }

}
