package com.rm2xfbv.tabelabrasileirosa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.rm2xfbv.tabelabrasileirosa.adapter.TableAdapter;
import com.rm2xfbv.tabelabrasileirosa.model.Table;
import com.rm2xfbv.tabelabrasileirosa.entities.TeamName;

import java.util.ArrayList;
import java.util.Arrays;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_table);

        ArrayList<Table> tables = initTableList();

        ListView tableList = (ListView) findViewById(R.id.activity2_main_id);

        TableAdapter adapter = new TableAdapter(tables, this);
        tableList.setAdapter(adapter);
    }

    private ArrayList<Table> initTableList() {
            return new ArrayList<>(Arrays.asList(
                    new Table(TeamName.GREMIO, TeamName.SANTOS,"27/04/2019","16:00"),
                    new Table(TeamName.CRUZEIRO, TeamName.BAHIA,"02/05/2019","22:00"),
                    new Table(TeamName.CORINTHIANS, TeamName.CEARA,"10/05/2019","16:00"),
                    new Table(TeamName.ATHLETICO, TeamName.BOTAFOGO,"17/05/2019","22:00"),
                    new Table(TeamName.ATLETICOMG, TeamName.AVAI,"22/05/2019","16:00"),
                    new Table(TeamName.CHAPECOENSE, TeamName.CSA,"27/05/2019","22:00"),
                    new Table(TeamName.FLAMENGO, TeamName.FLUMINENSE,"02/06/2019","16:00"),
                    new Table(TeamName.FORTALEZA, TeamName.GOIAS,"10/06/2019","22:00"),
                    new Table(TeamName.INTERNACIONAL, TeamName.PALMEIRAS,"17/06/2019","16:00"),
                    new Table(TeamName.SAOPAULO, TeamName.VASCO,"22/06/2019","22:00")));
    }
}
