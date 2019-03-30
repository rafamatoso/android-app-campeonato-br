package com.rm2xfbv.tabelabrasileirosa.model;

import com.rm2xfbv.tabelabrasileirosa.entities.Team;

public class Ranking {

    private String position;
    private String points;
    private String games;
    private String victory;
    private String draw;
    private String lose;
    private String proGoals;
    private String againstGoals;
    private String goalsSold;

    private Team team;

    public Ranking(String position, Team team, String points, String games, String victory, String draw, String lose, String proGoals, String againstGoals, String goalsSold) {
        this.position = position;
        this.team = team;
        this.points = points;
        this.games = games;
        this.victory = victory;
        this.draw = draw;
        this.lose = lose;
        this.proGoals = proGoals;
        this.againstGoals = againstGoals;
        this.goalsSold = goalsSold;
    }

    public Ranking(String points, String games, String victory, String draw, String lose, String proGoals, String againstGoals, String goalsSold) {
        this.points = points;
        this.games = games;
        this.victory = victory;
        this.draw = draw;
        this.lose = lose;
        this.proGoals = proGoals;
        this.againstGoals = againstGoals;
        this.goalsSold = goalsSold;
    }

    public Ranking() {
    }

    public String getPosition() {
        return position;
    }

    public Team getTeam() {
        return team;
    }

    public String getPoints() {
        return points;
    }

    public String getGames() {
        return games;
    }

    public String getVictory() {
        return victory;
    }

    public String getDraw() {
        return draw;
    }

    public String getLose() {
        return lose;
    }

    public String getProGoals() {
        return proGoals;
    }

    public String getAgainstGoals() {
        return againstGoals;
    }

    public String getGoalsSold() {
        return goalsSold;
    }
}