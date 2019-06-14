package com.rm2xfbv.tabelabrasileirosa.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.rm2xfbv.tabelabrasileirosa.R;
import com.rm2xfbv.tabelabrasileirosa.adapter.RankingAdapter;
import com.rm2xfbv.tabelabrasileirosa.model.Ranking;

import java.util.List;

public class RankingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ranking);

        List<Ranking> rankings = Ranking.initTeamRankingList();

        ListView teamList = findViewById(R.id.activity_main_id);

        RankingAdapter adapter = new RankingAdapter(rankings, this);
        teamList.setAdapter(adapter);
    }
}
