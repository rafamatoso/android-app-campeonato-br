package com.rm2xfbv.tabelabrasileirosa.model;

import com.rm2xfbv.tabelabrasileirosa.entities.TeamName;

public class Ranking implements Comparable<Ranking> {

    private String position;
    private String points;
    private String games;
    private String victory;
    private String draw;
    private String lose;
    private String proGoals;
    private String againstGoals;
    private String goalsSold;

    private TeamName teamName;

    public Ranking(String position, TeamName teamName, String points, String games, String victory, String draw, String lose, String proGoals, String againstGoals, String goalsSold) {
        this.position = position;
        this.teamName = teamName;
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

    public TeamName getTeamName() {
        return teamName;
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

    @Override
    public int compareTo(Ranking o) {
        if (o.getPoints().equals("      P") || Integer.parseInt(this.points) == Integer.parseInt(o.getPoints())) {
            if (o.getGames().equals("    J") ||Integer.parseInt(this.games) == Integer.parseInt(o.getGames())) {
                if (o.getVictory().equals("  V") ||Integer.parseInt(this.victory) == Integer.parseInt(o.getVictory())) {
                    if (o.getDraw().equals("   E") ||Integer.parseInt(this.draw) == Integer.parseInt(o.getDraw())) {
                        if (o.getLose().equals("   D") ||Integer.parseInt(this.lose) == Integer.parseInt(o.getLose())) {
                            if (o.getProGoals().equals("  GP") ||Integer.parseInt(this.proGoals) == Integer.parseInt(o.getProGoals())) {
                                if (o.getAgainstGoals().equals("GC") ||Integer.parseInt(this.againstGoals) == Integer.parseInt(o.getAgainstGoals())) {
                                    if (o.getGoalsSold().equals("SG") ||Integer.parseInt(this.goalsSold) == Integer.parseInt(o.getGoalsSold())) {
                                        return 0;
                                    } else {
                                        if (Integer.parseInt(this.goalsSold) > Integer.parseInt(o.getGoalsSold())) {
                                            return -1;
                                        } else {
                                            return 1;
                                        }
                                    }
                                } else {
                                    if (Integer.parseInt(this.againstGoals) > Integer.parseInt(o.getAgainstGoals())) {
                                        return 1;
                                    } else {
                                        return -1;
                                    }
                                }
                            } else {
                                if (Integer.parseInt(this.proGoals) > Integer.parseInt(o.getProGoals())) {
                                    return -1;
                                } else {
                                    return 1;
                                }
                            }
                        } else {
                            if (Integer.parseInt(this.lose) > Integer.parseInt(o.getLose())) {
                                return 1;
                            } else {
                                return -1;
                            }
                        }
                    } else {
                        if (Integer.parseInt(this.draw) > Integer.parseInt(o.getDraw())) {
                            return -1;
                        } else {
                            return 1;
                        }
                    }
                } else {
                    if (Integer.parseInt(this.victory) > Integer.parseInt(o.getVictory())) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            } else {
                if (Integer.parseInt(this.games) > Integer.parseInt(o.getGames())) {
                    return -1;
                } else {
                    return 1;
                }
            }
        } else {
            if (Integer.parseInt(this.points) > Integer.parseInt(o.getPoints())) {
                return -1;
            } else {
                return  1;
            }
        }
    }
}