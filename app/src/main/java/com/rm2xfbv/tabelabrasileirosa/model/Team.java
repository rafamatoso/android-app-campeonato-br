package com.rm2xfbv.tabelabrasileirosa.model;

import com.rm2xfbv.tabelabrasileirosa.entities.TeamName;

public class Team {

    private String name;
    private int points;
    private int games;
    private int victory;
    private int draw;
    private int lose;
    private int proGoals;
    private int againstGoals;
    private int goalsSold;

    // Composição -> Enum
    private TeamName teamName;

    public Team(TeamName teamName, int points, int games, int victory, int draw, int lose, int proGoals, int againstGoals, int goalsSold) {
        this.teamName = teamName;
        this.name = teamName.name().substring(0,3);
        this.points = points;
        this.games = games;
        this.victory = victory;
        this.draw = draw;
        this.lose = lose;
        this.proGoals = proGoals;
        this.againstGoals = againstGoals;
        this.goalsSold = goalsSold;
    }

    public Team() {
    }

    public TeamName getTeamName() {
        return teamName;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }


    public int getGames() {
        return games;
    }


    public int getVictory() {
        return victory;
    }


    public int getDraw() {
        return draw;
    }


    public int getLose() {
        return lose;
    }


    public int getProGoals() {
        return proGoals;
    }


    public int getAgainstGoals() {
        return againstGoals;
    }


    public int getGoalsSold() {
        return goalsSold;
    }

}