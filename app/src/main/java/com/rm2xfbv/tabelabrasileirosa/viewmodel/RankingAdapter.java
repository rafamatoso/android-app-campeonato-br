package com.rm2xfbv.tabelabrasileirosa.viewmodel;

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

        RankingViewHolder rankingViewHolder;

        if (position > 0) {
            Collections.sort(rankings);
        }

        Ranking r = rankings.get(position);

        if (convertView == null) {

            rankingViewHolder = new RankingViewHolder();

            convertView = act.getLayoutInflater().inflate(R.layout.list_ranking, parent, false);

            rankingViewHolder.teamPosition = convertView.findViewById(R.id.list_pos_id);
            rankingViewHolder.teamName = convertView.findViewById(R.id.list_name_id);
            rankingViewHolder.teamPoint = convertView.findViewById(R.id.list_points_id);
            rankingViewHolder.teamGames = convertView.findViewById(R.id.list_games_id);
            rankingViewHolder.teamVictory = convertView.findViewById(R.id.list_victory_id);
            rankingViewHolder.teamDraw = convertView.findViewById(R.id.list_draw_id);
            rankingViewHolder.teamLose = convertView.findViewById(R.id.list_lose_id);
            rankingViewHolder.teamProGoals = convertView.findViewById(R.id.list_gp_id);
            rankingViewHolder.teamAgainstGoals = convertView.findViewById(R.id.list_gc_id);
            rankingViewHolder.teamGoalsSold = convertView.findViewById(R.id.list_sg_id);

            convertView.setTag(rankingViewHolder);
        } else {

            rankingViewHolder = (RankingViewHolder) convertView.getTag();
        }

        if (position == 0) {
            rankingViewHolder.teamPosition.setText("");
            rankingViewHolder.teamName.setText("");
            rankingViewHolder.teamPoint.setText("  P");
            rankingViewHolder.teamGames.setText(" J");
            rankingViewHolder.teamVictory.setText("  V");
            rankingViewHolder.teamDraw.setText("  E");
            rankingViewHolder.teamLose.setText("  D");
            rankingViewHolder.teamProGoals.setText(" GP");
            rankingViewHolder.teamAgainstGoals.setText("GC");
            rankingViewHolder.teamGoalsSold.setText("SG");
        } else {
            rankingViewHolder.teamPosition.setText(convertToString(position));
            rankingViewHolder.teamName.setText(r.getTeamName().name().substring(0, 3));
            rankingViewHolder.teamPoint.setText(convertToString(r.getVictory() * 3 + r.getDraw()));
            rankingViewHolder.teamGames.setText(convertToString(r.getVictory() + r.getDraw() + r.getLose()));
            rankingViewHolder.teamVictory.setText(convertToString(r.getVictory()));
            rankingViewHolder.teamDraw.setText(convertToString(r.getDraw()));
            rankingViewHolder.teamLose.setText(convertToString(r.getLose()));
            rankingViewHolder.teamProGoals.setText(convertToString(r.getProGoals()));
            rankingViewHolder.teamAgainstGoals.setText(convertToString(r.getAgainstGoals()));
            rankingViewHolder.teamGoalsSold.setText(convertToString(r.getProGoals() - r.getAgainstGoals()));
        }
        return convertView;
    }

    private class RankingViewHolder {

        TextView teamPosition;
        TextView teamName;
        TextView teamPoint;
        TextView teamGames;
        TextView teamVictory;
        TextView teamDraw;
        TextView teamLose;
        TextView teamProGoals;
        TextView teamAgainstGoals;
        TextView teamGoalsSold;
    }

    private String convertToString(int i) {
        if (i >= 0 && i < 10) {
            return String.format("  %s", Integer.toString(i));
        } else {
            return Integer.toString(i);
        }
    }
}
