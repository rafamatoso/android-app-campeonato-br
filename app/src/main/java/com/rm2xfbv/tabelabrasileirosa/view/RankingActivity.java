package com.rm2xfbv.tabelabrasileirosa.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.rm2xfbv.tabelabrasileirosa.R;
import com.rm2xfbv.tabelabrasileirosa.viewmodel.RankingAdapter;
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

    /*private void getRankings() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.myjson.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        iMyJsonAPI iMyJsonAPI = retrofit.create(iMyJsonAPI.class);

        Call<List<RankingJson>> call = iMyJsonAPI.getRankings();

        call.enqueue(new Callback<List<RankingJson>>() {
            @Override
            public void onResponse(Call<List<RankingJson>> call, Response<List<RankingJson>> response) {

                if (!response.isSuccessful()) {
                    Log.d("Response: ", String.valueOf(response.code()));
                    return;
                }

                List<RankingJson> rankingJsonList = response.body();

                for (RankingJson r : rankingJsonList) {
                    Log.d("TeamName: ", String.valueOf((r.getTeamName())));
                }
            }

            @Override
            public void onFailure(Call<List<RankingJson>> call, Throwable t) {
                Log.d("Failure: ", "error");
            }
        });
    }*/
}
