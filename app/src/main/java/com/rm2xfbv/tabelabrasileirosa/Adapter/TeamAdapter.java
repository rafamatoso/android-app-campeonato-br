package com.rm2xfbv.tabelabrasileirosa.Adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.rm2xfbv.tabelabrasileirosa.Model.Team;
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

    // Adapter usado em casos de listView com grande complexidade de objetos

    /*public class TeamAdapter extends BaseAdapter {

    private Context mContext;
    private Team[] mTeams;

    public TeamAdapter(Context c, Team[] teams){
        mContext = c;
        mTeams = teams;
    }

    @Override
    public int getCount() {
        return (mTeams != null) ? mTeams.length : 0;
    }

    @Override
    public Object getItem(int i) {
        return mTeams[i];
    }

    @Override
    public long getItemId(int i) {
        return Long.parseLong(mTeams[i].getId());
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        Team team = mTeams[i];

        ViewHolder holder = null;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.activity_main, null);

            holder = new ViewHolder();
            holder.textName = (TextView) convertView.findViewById(R.id.textName);
            holder.textPoints = (TextView) convertView.findViewById(R.id.textPoints);

            convertView.setTag(holder);

        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        holder.textName.setText(team.getName());
        holder.textPoints.setText(team.getPoints());

        return convertView;
    }

    static class ViewHolder {
        TextView textName;
        TextView textPoints;
    }*/
}
