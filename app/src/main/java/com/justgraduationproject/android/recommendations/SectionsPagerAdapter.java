package com.justgraduationproject.android.recommendations;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahmoud Abaza on 4/14/2018.
 */

class SectionsPagerAdapter extends FragmentPagerAdapter {

    //Attributes

    private final List<android.app.Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentTitleList = new ArrayList<>();

    //Constructors

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //Behaviours

    public void addFragment(android.app.Fragment fragment , String title)
    {
        fragmentList.add(fragment);

        fragmentTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);
    }

    @Override
    public Fragment getItem(int position)
    {
        return null;
    }

    @Override
    public int getCount()
    {
        return fragmentList.size();
    }
}
