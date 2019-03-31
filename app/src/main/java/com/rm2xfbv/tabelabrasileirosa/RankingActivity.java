package com.rm2xfbv.tabelabrasileirosa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.rm2xfbv.tabelabrasileirosa.adapter.RankingAdapter;
import com.rm2xfbv.tabelabrasileirosa.entities.TeamName;
import com.rm2xfbv.tabelabrasileirosa.model.Ranking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RankingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ranking);

        List<Ranking> rankings = initTeamRankingList();

        ListView teamList = (ListView) findViewById(R.id.activity_main_id);

        RankingAdapter adapter = new RankingAdapter(rankings, this);
        teamList.setAdapter(adapter);
    }

    // Function that instantiates objects of type Ranking

    private ArrayList<Ranking> initTeamRankingList() {

        String[] s = new String[]{"      P", "    J", "  V", "   E","   D", "  GP", "GC", "SG"};
        String[] s1 = new String[]{"", "", "", "","", "", "", ""};

        return new ArrayList<>(Arrays.asList(

                new Ranking(s),
                new Ranking(TeamName.ATHLETICO,    r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.ATLETICOMG,   r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.AVAI,         r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.BAHIA,        r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.BOTAFOGO,     r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.CEARA,        r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.CHAPECOENSE,  r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.CORINTHIANS,  r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.CRUZEIRO,     r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.CSA,          r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.FLAMENGO,     r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.FLUMINENSE,   r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.FORTALEZA,    r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.GOIAS,        r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.GREMIO,       r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.INTERNACIONAL,r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.PALMEIRAS,    r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.SANTOS,       r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.SAOPAULO,     r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1),
                new Ranking(TeamName.VASCO,        r(100), r(39), r(13), r(13), r(12), r(100), r(100), s1)));
    }

    // Function to construct random integers (visual code cleanup only)

    private int r(int i) { // r = random
        Random r = new Random();
        return r.nextInt(i);
    }
}
