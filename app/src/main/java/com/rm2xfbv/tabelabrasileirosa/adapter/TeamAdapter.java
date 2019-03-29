package com.rm2xfbv.tabelabrasileirosa.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.rm2xfbv.tabelabrasileirosa.model.Team;
import com.rm2xfbv.tabelabrasileirosa.R;

import java.util.List;

public class TeamAdapter extends BaseAdapter {

    private final List<Team> teams;
    private final Activity act;

    public TeamAdapter(List<Team> teams, Activity act) {
        this.teams = teams;
        this.act = act;
    }

    @Override
    public int getCount() {
        return teams.size();
    }

    @Override
    public Object getItem(int position) {
        return teams.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = act.getLayoutInflater().inflate(R.layout.list_main, parent, false);

        Team t = teams.get(position);

        TextView teamName = (TextView)
                view.findViewById(R.id.list_name_id);
        TextView teamPoint = (TextView)
                view.findViewById(R.id.list_points_id);
        TextView teamGames = (TextView)
                view.findViewById(R.id.list_games_id);
        TextView teamVictory = (TextView)
                view.findViewById(R.id.list_victory_id);
        TextView teamDraw = (TextView)
                view.findViewById(R.id.list_draw_id);
        TextView teamLose = (TextView)
                view.findViewById(R.id.list_lose_id);
        TextView teamGp = (TextView)
                view.findViewById(R.id.list_gp_id);
        TextView teamGc = (TextView)
                view.findViewById(R.id.list_gc_id);
        TextView teamSg = (TextView)
                view.findViewById(R.id.list_sg_id);

        teamName.setText(t.getName());
        teamPoint.setText(String.valueOf(t.getPoints()));
        teamGames.setText(String.valueOf(t.getGames()));
        teamVictory.setText(String.valueOf(t.getVictory()));
        teamDraw.setText(String.valueOf(t.getDraw()));
        teamLose.setText(String.valueOf(t.getLose()));
        teamGp.setText(String.valueOf(t.getProGoals()));
        teamGc.setText(String.valueOf(t.getAgainstGoals()));
        teamSg.setText(String.valueOf(t.getGoalsSold()));

        return view;
    }
}
