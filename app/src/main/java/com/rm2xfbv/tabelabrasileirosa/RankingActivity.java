package com.rm2xfbv.tabelabrasileirosa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.rm2xfbv.tabelabrasileirosa.adapter.TeamAdapter;
import com.rm2xfbv.tabelabrasileirosa.entities.TeamName;
import com.rm2xfbv.tabelabrasileirosa.model.Team;

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
                new Team(TeamName.ATHLETICO,10, 4, 3, 1,0, 10, 4, 6),
                new Team(TeamName.ATLETICOMG,7, 4, 2, 1,1, 10, 4, 6),
                new Team(TeamName.AVAI,0, 4, 0, 0,4, 0, 4, 6)));
    }
}
