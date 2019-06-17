package com.rm2xfbv.tabelabrasileirosa.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.rm2xfbv.tabelabrasileirosa.R;

public class MainActivity extends AppCompatActivity {

    private ImageView buttonRanking, buttonCalendar, buttonTopScorer, buttonTopAssistant, buttonCardsTable, buttonNews, buttonMoreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.net.ConnectivityManager cm = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);

        android.net.NetworkInfo activeNetworkInfo = cm.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            Toast.makeText(MainActivity.this, "Internet - CONECTADO", Toast.LENGTH_SHORT).show();
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Internet - DESCONECTADO");
            builder.setMessage("Verifique sua conexão.");
            builder.setPositiveButton("Habilite a Internet", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(Settings.ACTION_SETTINGS);
                    startActivity(intent);
                }
            });
            builder.show();
        }

        buttonRanking = findViewById(R.id.ranking_id);
        buttonCalendar = findViewById(R.id.calendar_id);
        buttonTopScorer = findViewById(R.id.top_scorer_id);
        buttonTopAssistant = findViewById(R.id.top_assistant_id);
        buttonCardsTable = findViewById(R.id.cards_table_id);
        buttonNews = findViewById(R.id.news_id);
        buttonMoreInfo = findViewById(R.id.more_info_id);

        buttonRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, RankingActivity.class));

            }
        });

        buttonCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, TableActivity.class));

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

        buttonMoreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, MoreInfoActivity.class));
            }
        });
    }
}





