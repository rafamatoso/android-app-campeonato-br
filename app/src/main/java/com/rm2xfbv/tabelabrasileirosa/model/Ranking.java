package com.rm2xfbv.tabelabrasileirosa.model;

import com.rm2xfbv.tabelabrasileirosa.entities.TeamName;

import java.util.ArrayList;
import java.util.Arrays;

public class Ranking implements Comparable<Ranking>{

    private TeamName teamName;
    private int victory;
    private int draw;
    private int lose;
    private int proGoals;
    private int againstGoals;
    private String rankingFields[];

    public Ranking(TeamName teamName, int victory, int draw, int lose, int proGoals, int againstGoals, String[] rankingFields) {

        this.teamName = teamName;
        this.victory = victory;
        this.draw = draw;
        this.lose = lose;
        this.proGoals = proGoals;
        this.againstGoals = againstGoals;
        this.rankingFields = rankingFields;
    }

    public Ranking(String[] rankingFields) {
        this.rankingFields = rankingFields;
    }

    public TeamName getTeamName() {
        return teamName;
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

    public String[] getRankingFields() {
        return rankingFields;
    }

    @Override
    public int compareTo(Ranking o) {

        /*The Comparable interface presents this implementation due to a
        feature not yet treated in the best way during the instance of
        objects that will fill the Ranking screen. Since the first object of the
        instantiated Ranking type will be shown on the screen only as
        subtitles, the interface will not bother comparing them with other
        attributes of other objects.*/

        int points = this.victory*3+this.draw;
        int games = this.victory+this.draw+this.lose;
        int goalsSold = this.proGoals-this.againstGoals;
        int oPoints = (o.getVictory()*3+o.draw);
        int oGames = (o.getVictory()+o.getDraw()+o.getLose());
        int oGoalsSold = (o.getProGoals()-o.getAgainstGoals());

        boolean c1 = o.getRankingFields()[0].equals("      P") || points == oPoints ,
                c2 = o.getRankingFields()[1].equals("    J")   || games == oGames,
                c3 = o.getRankingFields()[2].equals("  V")     || this.victory == o.getVictory(),
                c4 = o.getRankingFields()[3].equals("   E")    || this.draw == o.getDraw(),
                c5 = o.getRankingFields()[4].equals("   D")    || this.lose == o.getLose(),
                c6 = o.getRankingFields()[5].equals("  GP")    || this.proGoals == o.getProGoals(),
                c7 = o.getRankingFields()[6].equals("GC")      || this.againstGoals == o.getAgainstGoals(),
                c8 = o.getRankingFields()[7].equals("SG")      || goalsSold == oGoalsSold,

                r1 = points > oPoints,
                r2 = games > oGames,
                r3 = this.victory > o.getVictory(),
                r4 = this.draw > o.getDraw(),
                r5 = this.lose > o.getLose(),
                r6 = this.proGoals > o.getProGoals(),
                r7 = this.againstGoals > o.getAgainstGoals(),
                r8 = goalsSold > oGoalsSold;

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

    public static ArrayList<Ranking> initTeamRankingList() {

        String[] s = new String[]{"      P", "    J", "  V", "   E", "   D", "  GP", "GC", "SG"};
        String[] s1 = new String[]{"", "", "", "", "", "", "", ""};

        return new ArrayList<>(Arrays.asList(
                new Ranking(s),
                new Ranking(TeamName.ATHLETICO, 3, 1, 5, 13, 12, s1),
                new Ranking(TeamName.ATLETICOMG, 5, 1, 3, 14, 11, s1),
                new Ranking(TeamName.AVAI, 0, 4, 5, 4, 11, s1),
                new Ranking(TeamName.BAHIA, 4, 2, 3, 11, 11, s1),
                new Ranking(TeamName.BOTAFOGO, 5, 0, 4, 8, 8, s1),
                new Ranking(TeamName.CEARA, 3, 1, 5, 10, 9, s1),
                new Ranking(TeamName.CHAPECOENSE, 2, 2, 5, 10, 14, s1),
                new Ranking(TeamName.CORINTHIANS, 3, 3, 2, 7, 5, s1),
                new Ranking(TeamName.CRUZEIRO, 2, 2, 5, 9, 16, s1),
                new Ranking(TeamName.CSA, 1, 3, 5, 3, 15, s1),
                new Ranking(TeamName.FLAMENGO, 5, 2, 2, 15, 9, s1),
                new Ranking(TeamName.FLUMINENSE, 2, 2, 5, 13, 16, s1),
                new Ranking(TeamName.FORTALEZA, 3, 1, 5, 8, 13, s1),
                new Ranking(TeamName.GOIAS, 5, 0, 3, 11, 8, s1),
                new Ranking(TeamName.GREMIO, 3, 2, 4, 10, 11, s1),
                new Ranking(TeamName.INTERNACIONAL, 5, 1, 3, 13, 8, s1),
                new Ranking(TeamName.PALMEIRAS, 8, 1, 0, 18, 2, s1),
                new Ranking(TeamName.SANTOS, 6, 2, 1, 12, 7, s1),
                new Ranking(TeamName.SAOPAULO, 3, 5, 1, 8, 5, s1),
                new Ranking(TeamName.VASCO, 2, 3, 4, 8, 14, s1)
        ));
    }
}