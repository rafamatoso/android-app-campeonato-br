package com.rm2xfbv.tabelabrasileirosa.Model;

import java.util.ArrayList;

public class Team {

    private String name;
    private String points;
    private String games;
    private String victory;
    private String draw;
    private String lose;
    private String proGoals;
    private String againstGoals;
    private String goalsSold;

    public Team(String name, String points, String games, String victory, String draw, String lose, String proGoals, String againstGoals, String goalsSold) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getVictory() {
        return victory;
    }

    public void setVictory(String victory) {
        this.victory = victory;
    }

    public String getDraw() {
        return draw;
    }

    public void setDraw(String draw) {
        this.draw = draw;
    }

    public String getLose() {
        return lose;
    }

    public void setLose(String lose) {
        this.lose = lose;
    }

    public String getProGoals() {
        return proGoals;
    }

    public void setProGoals(String proGoals) {
        this.proGoals = proGoals;
    }

    public String getAgainstGoals() {
        return againstGoals;
    }

    public void setAgainstGoals(String againstGoals) {
        this.againstGoals = againstGoals;
    }

    public String getGoalsSold() {
        return goalsSold;
    }

    public void setGoalsSold(String goalsSold) {
        this.goalsSold = goalsSold;
    }
}