package com.rm2xfbv.tabelabrasileirosa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.rm2xfbv.tabelabrasileirosa.Adapter.TeamAdapter;
import com.rm2xfbv.tabelabrasileirosa.Model.Team;

import java.util.ArrayList;
import java.util.Arrays;

public class RankingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        ArrayList<Team> teams = initTeamList();

        ListView teamList = (ListView) findViewById(R.id.activity_main_id);

        TeamAdapter adapter = new TeamAdapter(teams, this);
        teamList.setAdapter(adapter);
    }

    private ArrayList<Team> initTeamList() {
        return new ArrayList<>(Arrays.asList(
                new Team("Sport", "10"),
                new Team("Santa Cruz", "6"),
                new Team("Náutico", "2")));
    }
}
