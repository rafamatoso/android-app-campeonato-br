package com.rm2xfbv.tabelabrasileirosa.model;

import com.rm2xfbv.tabelabrasileirosa.entities.Team;

public class Table {

    private Team team1;
    private Team team2;
    private String gameDate;
    private String gameHour;

    public Table(Team team1, Team team2, String gameDate, String gameHour) {
        this.team1 = team1;
        this.team2 = team2;
        this.gameDate = gameDate;
        this.gameHour = gameHour;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public String getGameDate() {
        return gameDate;
    }

    public String getGameHour() {
        return gameHour;
    }
}
