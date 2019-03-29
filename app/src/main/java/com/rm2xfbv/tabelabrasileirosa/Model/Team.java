package com.rm2xfbv.tabelabrasileirosa.Model;

import java.util.ArrayList;

public class Team {

    private String name;
    private String points;

    public Team(String name, String points) {
        this.name = name;
        this.points = points;
    }

    public Team() {
    }

    public String getName() {
        return name;
    }

    public String getPoints() {
        return points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(String points) {
        this.points = points;
    }
}