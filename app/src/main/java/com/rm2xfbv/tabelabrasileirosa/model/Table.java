package com.rm2xfbv.tabelabrasileirosa.model;

import com.rm2xfbv.tabelabrasileirosa.entities.TeamName;

public class Table {

    private TeamName teamName1;
    private TeamName teamName2;
    private String gameDate;
    private String gameHour;

    public Table(TeamName teamName1, TeamName teamName2, String gameDate, String gameHour) {
        this.teamName1 = teamName1;
        this.teamName2 = teamName2;
        this.gameDate = gameDate;
        this.gameHour = gameHour;
    }

    public TeamName getTeamName1() {
        return teamName1;
    }

    public TeamName getTeamName2() {
        return teamName2;
    }

    public String getGameDate() {
        return gameDate;
    }

    public String getGameHour() {
        return gameHour;
    }
}
