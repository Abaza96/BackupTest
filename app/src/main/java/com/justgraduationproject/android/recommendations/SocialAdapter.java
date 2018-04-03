package com.justgraduationproject.android.recommendations;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mahmoud Abaza on 4/3/2018.
 */

//Base Class inheriting the RecyclerView's Adapter

public class SocialAdapter extends RecyclerView.Adapter<SocialAdapter.ViewHolder> {

    //Nested Class inheriting the RecyclerView's ViewHolder (Required in Base Class)

    public static class ViewHolder extends RecyclerView.ViewHolder
    {

        //Nested Class Attributes

        ImageView PP;
        TextView id , time , content;
        Checkable Supp;
        Button Comm , Sha;

        //Nested Class Constructor

        public ViewHolder(View itemView)
        {
            super(itemView);

            PP = itemView.findViewById(R.id.SocialProfilePic);
            id = itemView.findViewById(R.id.SocialIdentity);
            time = itemView.findViewById(R.id.SocialDatenTime);
            content = itemView.findViewById(R.id.SocialContent);
            Supp = itemView.findViewById(R.id.Socialbtn0);
            Comm = itemView.findViewById(R.id.Socialbtn1);
            Sha = itemView.findViewById(R.id.Socialbtn2);
        }
    }

    //Base Class Attributes

    Context context;
    List<Socialization> socializationList;

    //Base Class Constructor


    public SocialAdapter() {}

    public SocialAdapter(Context c, List<Socialization> socializationList)
    {
        this.context = c;
        this.socializationList = socializationList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(context).inflate(R.layout.social_arrangement, parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Socialization S = socializationList.get(position);
        Long L = Long.valueOf(S.getTime());
        String TimeFetch = L.toString();

        holder.PP.setImageResource(S.getProfilePic());
        holder.id.setText(S.getIdentity());
        holder.time.setText(TimeFetch);
        holder.content.setText(S.getContent());
        holder.Supp.isChecked();
    }

    @Override
    public int getItemCount() {
        return socializationList.size();
    }

}