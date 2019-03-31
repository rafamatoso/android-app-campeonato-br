package com.rm2xfbv.tabelabrasileirosa.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.rm2xfbv.tabelabrasileirosa.model.Table;
import com.rm2xfbv.tabelabrasileirosa.R;

import java.util.List;

public class TableAdapter extends BaseAdapter {

    private final List<Table> tables;
    private final Activity act;

    public TableAdapter(List<Table> tables, Activity act) {
        this.tables = tables;
        this.act = act;
    }

    @Override
    public int getCount() {
        return (tables.size());
    }

    @Override
    public Object getItem(int position) {
        return tables.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = act.getLayoutInflater().inflate(R.layout.list_table, parent, false);

        Table t = tables.get(position);

        TextView teamName1 = (TextView)
                view.findViewById(R.id.list_teamName1_id);
        TextView teamName2 = (TextView)
                view.findViewById(R.id.list_teamName2_id);
        TextView teamDate = (TextView)
                view.findViewById(R.id.list_date_id);
        TextView teamHour = (TextView)
                view.findViewById(R.id.list_hour_id);

        teamName1.setText(t.getTeamName1().name());
        teamName2.setText(t.getTeamName2().name());
        teamDate.setText(t.getGameDate());
        teamHour.setText(t.getGameHour());

        return view;
    }
}
