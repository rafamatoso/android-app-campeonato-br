package com.rm2xfbv.tabelabrasileirosa.viewmodel;

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

        TableViewHolder tableViewHolder;

        Table t = tables.get(position);

        if (convertView == null) {

            tableViewHolder = new TableViewHolder();

            convertView = act.getLayoutInflater().inflate(R.layout.list_table, parent, false);

            tableViewHolder.teamName1 = convertView.findViewById(R.id.list_teamName1_id);
            tableViewHolder.teamName2 = convertView.findViewById(R.id.list_teamName2_id);
            tableViewHolder.gameDate = convertView.findViewById(R.id.list_date_id);
            tableViewHolder.gameHour = convertView.findViewById(R.id.list_hour_id);

            convertView.setTag(tableViewHolder);
        }
        else {

            tableViewHolder = (TableViewHolder) convertView.getTag();
        }

        tableViewHolder.teamName1.setText(t.getTeamName1().name());
        tableViewHolder.teamName2.setText(t.getTeamName2().name());
        tableViewHolder.gameDate.setText(t.getGameDate());
        tableViewHolder.gameHour.setText(t.getGameHour());

        return convertView;
    }

    private class TableViewHolder {

        TextView teamName1;
        TextView teamName2;
        TextView gameDate;
        TextView gameHour;
    }
}
