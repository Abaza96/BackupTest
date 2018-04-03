package com.justgraduationproject.android.recommendations;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mahmoud Abaza on 4/3/2018.
 */

//Base Class

public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.ViewHolder>
{

    //Nested Class
    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView pic;
        TextView content , time;

        public ViewHolder(View itemView) {
            super(itemView);

            pic = itemView.findViewById(R.id.NotificationPic);
            content = itemView.findViewById(R.id.Recent);
            time = itemView.findViewById(R.id.time);
        }
    }

    //Base Class Attributes
    Context context;
    List<NotificationsArrangement> notificationsArrangements;

    //Constructors

    public NotificationsAdapter()
    {}

    public NotificationsAdapter(Context context, List<NotificationsArrangement> notificationsArrangements)
    {
        this.context = context;
        this.notificationsArrangements = notificationsArrangements;
    }

    //Behaviours
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(context).inflate(R.layout.notifications_arrangement , parent , false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        NotificationsArrangement NA = notificationsArrangements.get(position);
        Long Time = Long.valueOf(NA.getTime());
        String TimeFetch = Time.toString();
        holder.content.setText(NA.getContent());
        holder.pic.setImageResource(NA.getProfilePics());
        holder.time.setText(TimeFetch);
    }

    @Override
    public int getItemCount()
    {
        return notificationsArrangements.size();
    }

}