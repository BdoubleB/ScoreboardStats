package com.github.games647.scoreboardstats.commands;

import com.github.games647.scoreboardstats.ScoreboardStats;
import com.github.games647.variables.Message;
import com.github.games647.variables.Permissions;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public final class ReloadCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, final String label, final String[] args) {
        if (!cs.hasPermission(Permissions.RELOAD_PERMISSION)) {
            cs.sendMessage(Message.PERMISSION_DENIED);
            return true;
        }

        ScoreboardStats.getInstance().onReload();
        cs.sendMessage(Message.RELOAD_SUCCESS);
        return true;
    }
}
