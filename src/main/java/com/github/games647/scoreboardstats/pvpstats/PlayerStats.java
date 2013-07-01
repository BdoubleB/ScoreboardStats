package com.github.games647.scoreboardstats.pvpstats;

import com.avaje.ebean.validation.NotEmpty;
import com.avaje.ebean.validation.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PlayerStats")
public class PlayerStats {

    @Id
    @NotEmpty
    @NotNull
    private String playername;

    private int kills;
    private int deaths;
    private int mobkills;
    private int killstreak;

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(final String paramplayername) {
        playername = paramplayername;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(final int paramkills) {
        kills = paramkills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(final int paramdeaths) {
        deaths = paramdeaths;
    }

    public int getMobkills() {
        return mobkills;
    }

    public void setMobkills(final int parammobkills) {
        mobkills = parammobkills;
    }

    public int getKillstreak() {
        return killstreak;
    }

    public void setKillstreak(final int paramkillstreak) {
        killstreak = paramkillstreak;
    }
}
