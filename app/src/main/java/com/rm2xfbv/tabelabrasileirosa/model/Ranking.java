package com.rm2xfbv.tabelabrasileirosa.model;

import com.rm2xfbv.tabelabrasileirosa.entities.TeamName;

public class Ranking implements Comparable<Ranking> {

    //private int position;
    private int points;
    private int games;
    private int victory;
    private int draw;
    private int lose;
    private int proGoals;
    private int againstGoals;
    private int goalsSold;
    private String[] rankingFields;

    private TeamName teamName;

    public Ranking(TeamName teamName, int points, int games, int victory, int draw, int lose, int proGoals, int againstGoals, String[] rankingFields) {
        this.teamName = teamName;
        this.points = points;
        this.games = games;
        this.victory = victory;
        this.draw = draw;
        this.lose = lose;
        this.proGoals = proGoals;
        this.againstGoals = againstGoals;
        this.goalsSold = proGoals - againstGoals;
        this.rankingFields = rankingFields;
    }

    public Ranking(String[] rankingFields) {
        this.rankingFields = rankingFields;
    }

    public Ranking() {
    }

    public TeamName getTeamName() {
        return teamName;
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

    public String[] getRankingFields() {
        return rankingFields;
    }

    @Override
    public int compareTo(Ranking o) {

        boolean c1 = o.getRankingFields()[0].equals("      P") || this.points == o.getPoints(),
                c2 = o.getRankingFields()[1].equals("    J")   || this.games == o.getGames(),
                c3 = o.getRankingFields()[2].equals("  V")     || this.victory == o.getVictory(),
                c4 = o.getRankingFields()[3].equals("   E")    || this.draw == o.getDraw(),
                c5 = o.getRankingFields()[4].equals("   D")    || this.lose == o.getLose(),
                c6 = o.getRankingFields()[5].equals("  GP")    || this.proGoals == o.getProGoals(),
                c7 = o.getRankingFields()[6].equals("GC")      || this.againstGoals == o.getAgainstGoals(),
                c8 = o.getRankingFields()[7].equals("SG")      || this.goalsSold == o.getGoalsSold(),
                r1 = this.points > o.getPoints(),
                r2 = this.games > o.getGames(),
                r3 = this.victory > o.getVictory(),
                r4 = this.draw > o.getDraw(),
                r5 = this.lose > o.getLose(),
                r6 = this.proGoals > o.getProGoals(),
                r7 = this.againstGoals > o.getAgainstGoals(),
                r8 = this.goalsSold > o.getGoalsSold();

        if (c1) {
            if (c2) {
                if (c3) {
                    if (c4) {
                        if (c5) {
                            if (c6) {
                                if (c7) {
                                    if (c8) {
                                        return 0;
                                    } else {
                                        return (r8) ? -1 : 1;
                                    }
                                } else {
                                    return (r7) ? 1 : -1;
                                }
                            } else {
                                return (r6) ? -1 : 1;
                            }
                        } else {
                            return (r5) ? 1 : -1;
                        }
                    } else {
                        return (r4) ? -1 : 1;
                    }
                } else {
                    return (r3) ? -1 : 1;
                }
            } else {
                return (r2) ? 1 : -1;
            }
        } else {
            return (r1) ? -1 : 1;
        }
    }
}