package com.justgraduationproject.android.recommendations;

import android.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity
{
    private SectionsPagerAdapter sections;

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        sections = new SectionsPagerAdapter(getSupportFragmentManager());

        viewPager = (ViewPager) findViewById(R.id.vPager);

        setup(viewPager);

        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);

        tabs.setupWithViewPager(viewPager);

    }

    private void setup(ViewPager vp)
    {
        Integer tab0 = Integer.valueOf(R.string.Register_tab0);
        Integer tab1 = Integer.valueOf(R.string.Register_tab1);

        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new EnteringFragment() , tab0.toString());
        adapter.addFragment(new RegisterFragment() , tab0.toString());

    }
}