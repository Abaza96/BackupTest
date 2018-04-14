package com.justgraduationproject.android.recommendations;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProfileFragment extends Fragment {

    public ProfileFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    public void Navigate(View v)
    {
        int X = v.getId();
        Fragment f;
        FragmentManager manager;
        FragmentTransaction transaction;

        if (X == R.id.Btn0)
        {
            f = new ProfileBooksFragment();

            manager = getFragmentManager();

            transaction = manager.beginTransaction();

            transaction.replace(R.id.fragment , f);

            transaction.commit();
        }

        if (X == R.id.Btn1)
        {
            f = new FollowersFragment();

            manager = getFragmentManager();

            transaction = manager.beginTransaction();

            transaction.replace(R.id.fragment , f);

            transaction.commit();
        }

        if (X == R.id.Btn2)
        {
            f = new ActivitiesFragment();

            manager = getFragmentManager();

            transaction = manager.beginTransaction();

            transaction.replace(R.id.fragment , f);

            transaction.commit();
        }

    }
}
