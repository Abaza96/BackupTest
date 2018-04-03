package com.justgraduationproject.android.recommendations;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MessagingFragment extends Fragment {

    RecyclerView MessagingSection;
    ArrangementAdapter arrangementAdapter;
    java.util.Date date = new java.util.Date();
    List<Arrangement> arrangementList;

    public MessagingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_messaging, container, false);

        MessagingSection = (RecyclerView) v.findViewById(R.id.MessagingSection);

        arrangementList = new ArrayList<>();

        for(int i = 0 ; i < 10 ; i++)
        {
            if(i % 2 == 0)
                arrangementList.add(new Arrangement(R.drawable.team3 , R.string.Male_name , date.getTime(), R.string.ExampleTextView));

            else if(i % 2 != 0)
                arrangementList.add(new Arrangement(R.drawable.team11 , R.string.Female_name , date.getTime() , R.string.ExampleTextView));
        }

        arrangementAdapter = new ArrangementAdapter(getActivity() , arrangementList);

        MessagingSection.setLayoutManager(new LinearLayoutManager(getActivity()));

        MessagingSection.setAdapter(arrangementAdapter);

        return v;

    }

}