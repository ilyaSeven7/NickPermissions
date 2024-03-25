package me.litedeforged.nickpermissions;

import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class NickPermissions extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getServer().getConsoleSender().sendMessage(MiniMessage.miniMessage().deserialize("<green>Plugin Has Been Enable!"));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
