package com.anusha.teams;

import java.util.List;

public class Team {
    private String name;
    private String townName;
private List<Player> players;
    public Team(String name, String townName) {
        this.name = name;
        this.townName = townName;
    }

    public Team(String name, String townName, List<Player> players) {
        this.name = name;
        this.townName = townName;
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }
}
