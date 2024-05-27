package me.litedeforged.nickpermissions.listeners;

import com.earth2me.essentials.Essentials;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;



public class PlayerJoin implements Listener {

    Essentials essentials = (Essentials) Bukkit.getPluginManager().getPlugin("Essentials");

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        if (!player.hasPermission("nickpermission.keepnickname")) return;

        assert essentials != null;
        if (!essentials.getUser(player.getUniqueId()).getNick().equalsIgnoreCase(player.getName())) {
            essentials.getUser(player).setNickname(player.getName());
        }
    }
}
