package com.rm2xfbv.tabelabrasileirosa.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.rm2xfbv.tabelabrasileirosa.model.Ranking;
import com.rm2xfbv.tabelabrasileirosa.R;

import java.util.Collections;
import java.util.List;

public class RankingAdapter extends BaseAdapter {

    private final List<Ranking> rankings;
    private final Activity act;

    public RankingAdapter(List<Ranking> rankings, Activity act) {
        this.rankings = rankings;
        this.act = act;
    }

    @Override
    public int getCount() {
        return rankings.size();
    }

    @Override
    public Object getItem(int position) {
        return rankings.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = act.getLayoutInflater().inflate(R.layout.list_ranking, parent, false);

        if (position > 0) {
            Collections.sort(rankings);
        }

        Ranking r = rankings.get(position);

        TextView teamPosition = (TextView)
                view.findViewById(R.id.list_pos_id);
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
        TextView teamProGoals = (TextView)
                view.findViewById(R.id.list_gp_id);
        TextView teamAgainstGoals = (TextView)
                view.findViewById(R.id.list_gc_id);
        TextView teamGoalsSold = (TextView)
                view.findViewById(R.id.list_sg_id);

        if (position == 0) {
            teamPosition.setText("");
            teamName.setText("");
            teamPoint.setText("  P");
            teamGames.setText(" J");
            teamVictory.setText("  V");
            teamDraw.setText("  E");
            teamLose.setText("  D");
            teamProGoals.setText(" GP");
            teamAgainstGoals.setText("GC");
            teamGoalsSold.setText("SG");
        } else {
            teamPosition.setText(convertToString(position));
            teamName.setText(r.getTeamName().name().substring(0, 3));
            teamPoint.setText(convertToString(r.getPoints()));
            teamGames.setText(convertToString(r.getGames()));
            teamVictory.setText(convertToString(r.getVictory()));
            teamDraw.setText(convertToString(r.getDraw()));
            teamLose.setText(convertToString(r.getLose()));
            teamProGoals.setText(convertToString(r.getProGoals()));
            teamAgainstGoals.setText(convertToString(r.getAgainstGoals()));
            teamGoalsSold.setText(convertToString(r.getGoalsSold()));
        }
        return view;
    }

    private String convertToString(int i) {
        if (i >= 0 && i < 10) {
            return String.format("  %s", Integer.toString(i));
        } else {
            return Integer.toString(i);
        }
    }
}
