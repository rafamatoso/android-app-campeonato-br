package com.rm2xfbv.tabelabrasileirosa.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.rm2xfbv.tabelabrasileirosa.R;
import com.rm2xfbv.tabelabrasileirosa.viewmodel.TableAdapter;
import com.rm2xfbv.tabelabrasileirosa.model.Table;

import java.util.ArrayList;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_table);

        ArrayList<Table> tables = Table.initTableList();

        ListView tableList = findViewById(R.id.activity2_main_id);

        TableAdapter adapter = new TableAdapter(tables, this);
        tableList.setAdapter(adapter);
    }
}
