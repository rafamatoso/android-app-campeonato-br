package com.rm2xfbv.tabelabrasileirosa.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.rm2xfbv.tabelabrasileirosa.model.Ranking;
import com.rm2xfbv.tabelabrasileirosa.R;

import java.util.List;

public class TeamAdapter extends BaseAdapter {

    private final List<Ranking> rankings;
    private final Activity act;

    public TeamAdapter(List<Ranking> rankings, Activity act) {
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

        Ranking t = rankings.get(position);

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
        TextView teamGp = (TextView)
                view.findViewById(R.id.list_gp_id);
        TextView teamGc = (TextView)
                view.findViewById(R.id.list_gc_id);
        TextView teamSg = (TextView)
                view.findViewById(R.id.list_sg_id);

        teamPosition.setText(t.getPosition());
        teamName.setText(t.getTeam().name().substring(0,3));
        teamPoint.setText(t.getPoints());
        teamGames.setText(t.getGames());
        teamVictory.setText(t.getVictory());
        teamDraw.setText(t.getDraw());
        teamLose.setText(t.getLose());
        teamGp.setText(t.getProGoals());
        teamGc.setText(t.getAgainstGoals());
        teamSg.setText(t.getGoalsSold());

        return view;
    }
}
