package com.rm2xfbv.tabelabrasileirosa;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView buttonRanking, buttonCalendar, buttonTopScorer, buttonTopAssistant, buttonCardsTable, buttonNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRanking = findViewById(R.id.ranking_id);
        buttonCalendar = findViewById(R.id.calendar_id);
        buttonTopScorer = findViewById(R.id.top_scorer_id);
        buttonTopAssistant = findViewById(R.id.top_assistant_id);
        buttonCardsTable = findViewById(R.id.cards_table_id);
        buttonNews = findViewById(R.id.news_id);

        buttonRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, RankingActivity.class));

            }
        });

        buttonCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, CalendarActivity.class));

            }
        });

        buttonTopScorer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, TopScorerActivity.class));

            }
        });

        buttonTopAssistant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, TopAssistantActivity.class));

            }
        });

        buttonCardsTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, CardsTableActivity.class));

            }
        });

        buttonNews.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Uri webpage = Uri.parse("https://globoesporte.globo.com/");
                        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
        });
    }
}





