package com.github.games647.scoreboardstats.listener;

import com.github.games647.scoreboardstats.Settings;
import com.github.games647.scoreboardstats.pvpstats.Database;
import com.github.games647.scoreboardstats.pvpstats.PlayerCache;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public final class EntityListener implements Listener {

    @EventHandler
    public static void onMobDeath(EntityDeathEvent event) {
        final LivingEntity entity = event.getEntity();
        final Player killer = entity.getKiller();

        if (!Settings.isPvpStats()
                || Settings.isDisabledWorld(entity.getWorld().getName())
                || entity.getType() == EntityType.PLAYER
                || killer == null
                || !killer.isOnline()) {
            return;
        }

        final PlayerCache killercache = Database.getCache(killer.getName());
        if (killercache != null) {
            killercache.increaseMob();
        }
    }
}
