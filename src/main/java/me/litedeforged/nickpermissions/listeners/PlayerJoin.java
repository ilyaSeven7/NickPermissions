package me.litedeforged.nickpermissions.listeners;

import com.earth2me.essentials.Essentials;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;



public class PlayerJoin implements Listener {

    Essentials ess = (Essentials) Bukkit.getPluginManager().getPlugin("Essentials");

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        if (!ess.getUser(player).getNick().equalsIgnoreCase(player.getName()) && !player.hasPermission("nickpermission.keepnickname")) {
            ess.getUser(player).setNickname(player.getName());
        }
    }
}
