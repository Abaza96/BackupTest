package com.justgraduationproject.android.recommendations;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {

    private RecyclerView NotificationsSection;
    private NotificationsAdapter notificationsAdapter;
    java.util.Date date = new java.util.Date();
    private List<NotificationsArrangement> notificationsArrangementList ;

    public NotificationsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_notifications, container, false);

        NotificationsSection = (RecyclerView) v.findViewById(R.id.NotificationsSection);

        notificationsArrangementList = new ArrayList<>();

        for (int i = 0 ; i <= 10 ; i++)
        {
            if(i % 2 == 0)
                notificationsArrangementList.add(new NotificationsArrangement(R.drawable.team12 , R.string.Social_Notifications , date.getTime()));

            else if(i % 2 != 0)
                notificationsArrangementList.add(new NotificationsArrangement(R.drawable.team4 , R.string.Social_Notifications, date.getTime()));
        }

        notificationsAdapter = new NotificationsAdapter(getActivity() , notificationsArrangementList);

        NotificationsSection.setLayoutManager(new LinearLayoutManager(getActivity()));

        NotificationsSection.setAdapter(notificationsAdapter);

        return v;
    }
}