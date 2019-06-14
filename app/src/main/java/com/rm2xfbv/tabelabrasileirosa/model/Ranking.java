package com.rm2xfbv.tabelabrasileirosa.model;

import com.rm2xfbv.tabelabrasileirosa.entities.TeamName;

import java.util.ArrayList;
import java.util.Arrays;

public class Ranking implements Comparable<Ranking> {

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

    public Ranking(TeamName teamName, int victory, int draw, int lose, int proGoals, int againstGoals, String[] rankingFields) {
        this.teamName = teamName;
        this.points = victory*3 + draw;
        this.games = victory + draw + lose;
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

    public static ArrayList<Ranking> initTeamRankingList() {

        String[] s = new String[]{"      P", "    J", "  V", "   E", "   D", "  GP", "GC", "SG"};
        String[] s1 = new String[]{"", "", "", "", "", "", "", ""};

        return new ArrayList<>(Arrays.asList(
                new Ranking(s),
                new Ranking(TeamName.ATHLETICO, 2, 1, 2, 7, 6, s1),
                new Ranking(TeamName.ATLETICOMG, 4, 0, 1, 8, 6, s1),
                new Ranking(TeamName.AVAI, 0, 3, 2, 3, 5, s1),
                new Ranking(TeamName.BAHIA, 2, 1, 2, 6, 6, s1),
                new Ranking(TeamName.BOTAFOGO, 3, 0, 2, 5, 5, s1),
                new Ranking(TeamName.CEARA, 2, 0, 3, 8, 6, s1),
                new Ranking(TeamName.CHAPECOENSE, 1, 1, 3, 5, 7, s1),
                new Ranking(TeamName.CORINTHIANS, 2, 2, 1, 6, 4, s1),
                new Ranking(TeamName.CRUZEIRO, 2, 0, 3, 6, 11, s1),
                new Ranking(TeamName.CSA, 0, 3, 2, 1, 7, s1),
                new Ranking(TeamName.FLAMENGO, 2, 1, 2, 8, 7, s1),
                new Ranking(TeamName.FLUMINENSE, 2, 0, 3, 10, 9, s1),
                new Ranking(TeamName.FORTALEZA, 2, 0, 3, 5, 8, s1),
                new Ranking(TeamName.GOIAS, 3, 0, 2, 6, 5, s1),
                new Ranking(TeamName.GREMIO, 0, 2, 3, 7, 10, s1),
                new Ranking(TeamName.INTERNACIONAL, 3, 0, 2, 7, 5, s1),
                new Ranking(TeamName.PALMEIRAS, 4, 1, 0, 12, 1, s1),
                new Ranking(TeamName.SANTOS, 3, 1, 1, 7, 6, s1),
                new Ranking(TeamName.SAOPAULO, 3, 2, 0, 6, 2, s1),
                new Ranking(TeamName.VASCO, 0, 2, 3, 4, 11, s1)
        ));
    }

    @Override
    public int compareTo(Ranking o) {

        /* The Comparable interface presents this implementation due to a
        feature not yet treated in the best way during the instance of
        objects that will fill the Ranking screen. Since the first object of the
        instantiated Ranking type will be shown on the screen only as
        subtitles, the interface will not bother comparing them with other
        attributes of other objects.
         */

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