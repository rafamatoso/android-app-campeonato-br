package com.rm2xfbv.tabelabrasileirosa.model;

import com.rm2xfbv.tabelabrasileirosa.entities.TeamName;

import java.util.ArrayList;
import java.util.Arrays;

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

    public static ArrayList<Table> initTableList() {
        return new ArrayList<>(Arrays.asList(
                new Table(TeamName.GREMIO, TeamName.SANTOS, "27/04/2019", "16:00"),
                new Table(TeamName.CRUZEIRO, TeamName.BAHIA, "02/05/2019", "22:00"),
                new Table(TeamName.CORINTHIANS, TeamName.CEARA, "10/05/2019", "16:00"),
                new Table(TeamName.ATHLETICO, TeamName.BOTAFOGO, "17/05/2019", "22:00"),
                new Table(TeamName.ATLETICOMG, TeamName.AVAI, "22/05/2019", "16:00"),
                new Table(TeamName.CHAPECOENSE, TeamName.CSA, "27/05/2019", "22:00"),
                new Table(TeamName.FLAMENGO, TeamName.FLUMINENSE, "02/06/2019", "16:00"),
                new Table(TeamName.FORTALEZA, TeamName.GOIAS, "10/06/2019", "22:00"),
                new Table(TeamName.INTERNACIONAL, TeamName.PALMEIRAS, "17/06/2019", "16:00"),
                new Table(TeamName.SAOPAULO, TeamName.VASCO, "22/06/2019", "22:00")));
    }
}
