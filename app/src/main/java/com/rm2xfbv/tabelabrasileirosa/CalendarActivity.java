package com.rm2xfbv.tabelabrasileirosa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.rm2xfbv.tabelabrasileirosa.adapter.TableAdapter;
import com.rm2xfbv.tabelabrasileirosa.model.Table;
import com.rm2xfbv.tabelabrasileirosa.entities.Team;

import java.util.ArrayList;
import java.util.Arrays;

public class CalendarActivity extends AppCompatActivity {

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
                    new Table(Team.GREMIO, Team.SANTOS,"27/04/2019","16:00")));

    }
}
