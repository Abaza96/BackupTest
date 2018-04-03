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

public class ArrangementAdapter extends RecyclerView.Adapter<ArrangementAdapter.ViewHolder> {

    //Base class Attributes
    Context context;
    List<Arrangement> ArrangementList;

    //Nested Overridden class
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        //Overridden class' Attributes
        TextView id , cont , time;
        ImageView pp;

        /**
         *@param itemView = inspecting items
         */
        public ViewHolder(View itemView)
        {
            super(itemView);

            //initialize attributes

            pp = itemView.findViewById(R.id.ProfilePic);
            id = itemView.findViewById(R.id.Identity);
            cont = itemView.findViewById(R.id.Content);
            time = itemView.findViewById(R.id.DatenTime);
        }
    }

    //Base Class constructor
    public ArrangementAdapter(Context C , List<Arrangement> Arrs)
    {
        this.context = C;
        ArrangementList = Arrs;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.app_arrangement , parent , false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        Arrangement arrangement = ArrangementList.get(position);

        Long X = Long.valueOf(arrangement.getTime());
        String TimeFetch = X.toString();

        holder.cont.setText(arrangement.getContent());
        holder.id.setText(arrangement.getIdentity());
        holder.time.setText(TimeFetch);
        holder.pp.setImageResource(arrangement.getProfilePic());
    }
    @Override
    public int getItemCount()
    {
        return ArrangementList.size();
    }
}
