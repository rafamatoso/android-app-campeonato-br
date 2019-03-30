package com.rm2xfbv.tabelabrasileirosa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.rm2xfbv.tabelabrasileirosa.adapter.TeamAdapter;
import com.rm2xfbv.tabelabrasileirosa.entities.Team;
import com.rm2xfbv.tabelabrasileirosa.model.Ranking;

import java.util.ArrayList;
import java.util.Arrays;

public class RankingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Ranking> rankings = initTeamRankingList();

        ListView teamList = (ListView) findViewById(R.id.activity_main_id);

        TeamAdapter adapter = new TeamAdapter(rankings, this);
        teamList.setAdapter(adapter);
    }

    private ArrayList<Ranking> initTeamRankingList() {
        return new ArrayList<>(Arrays.asList(
                new Ranking("Pos", Team.NOME, "P", "J", "V", "E","D", "GP", "GC", "SG"),
                new Ranking("1", Team.ATHLETICO,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.ATLETICOMG,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.AVAI,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.BAHIA,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.BOTAFOGO,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.CEARA,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.CHAPECOENSE,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.CORINTHIANS,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.CRUZEIRO,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.CSA,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.FLAMENGO,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.FLUMINENSE,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.FORTALEZA,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.GOIAS,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.GREMIO,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.INTERNACIONAL,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.PALMEIRAS,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.SANTOS,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.SAOPAULO,"0", "0", "0", "0","0", "0", "0", "0"),
                new Ranking("1", Team.VASCO,"0", "0", "0", "0","0", "0", "0", "0")));
    }
}
