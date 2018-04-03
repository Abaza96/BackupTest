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
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class CommunityFragment extends Fragment {

    private RecyclerView CommunitySection;
    java.util.Date date = new java.util.Date();
    private SocialAdapter socialAdapter;
    private List<Socialization> socializationList;
    private Button b1;
    private Button b2;

    public CommunityFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_community, container, false);

        CommunitySection = (RecyclerView) v.findViewById(R.id.CommunitySection);
        socializationList = new ArrayList<>();
        b1 = getActivity().findViewById(R.id.Socialbtn1);
        b2 = getActivity().findViewById(R.id.Socialbtn2);

        for(int i = 0 ; i < 10 ; i++)
        {
            if(i % 2 == 0)
                socializationList.add(new Socialization(R.drawable.team3 , R.string.Male_name , date.getTime(), R.string.Description ,false));

            else if(i % 2 != 0)
                socializationList.add(new Socialization(R.drawable.team11 , R.string.Female_name , date.getTime() ,R.string.Description, false));
        }

        socialAdapter = new SocialAdapter(getActivity() , socializationList);

        CommunitySection.setLayoutManager(new LinearLayoutManager(getActivity()));

        CommunitySection.setAdapter(socialAdapter);

        return v;
    }


    //Dummy Method
    private View Button(View v)
    {
        return v;
    }

}
