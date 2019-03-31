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

    private ArrayList<Ranking> initTeamRankingList() {
        return new ArrayList<>(Arrays.asList(
                new Ranking("      P", "    J", "  V", "   E","   D", "  GP", "GC", "SG"),
                new Ranking("1", TeamName.ATHLETICO,"0", "3", "0", "0","0", "0", "2", "1"),
                new Ranking("1", TeamName.ATLETICOMG,"0", "3", "0", "0","0", "0", "1", "1"),
                new Ranking("1", TeamName.AVAI,"0", "3", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.BAHIA,"5", "3", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.BOTAFOGO,"0", "4", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.CEARA,"7", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.CHAPECOENSE,"4", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.CORINTHIANS,"4", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.CRUZEIRO,"4", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.CSA,"4", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.FLAMENGO,"4", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.FLUMINENSE,"4", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.FORTALEZA,"4", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.GOIAS,"4", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.GREMIO,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.INTERNACIONAL,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.PALMEIRAS,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.SANTOS,"2", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.SAOPAULO,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", TeamName.VASCO,"0", "0", "0", "0","0", "0", "0", "0")));
    }
}
