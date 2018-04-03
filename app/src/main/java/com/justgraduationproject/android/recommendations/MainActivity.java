package com.justgraduationproject.android.recommendations;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
{

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId())
            {
                case R.id.navigation_home:
                {
                    Navigation(R.id.navigation_home);
                    return true;
                }

                case R.id.navigation_community:
                {
                    Navigation(R.id.navigation_community);
                    return true;
                }

                case R.id.navigation_messaging:
                {
                    Navigation(R.id.navigation_messaging);
                    return true;
                }

                case R.id.navigation_notifications:
                {
                    Navigation(R.id.navigation_notifications);
                    return true;
                }

                case R.id.navigation_profile:
                {
                    Navigation(R.id.navigation_profile);
                    return true;
                }
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void Navigation(int ID)
    {
        Fragment F;

        switch (ID)
        {
            case R.id.navigation_profile:
            {
                F = new ProfileFragment();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frag, F);
                ft.addToBackStack(null);
                ft.commit();
                break;
            }

            case R.id.navigation_community:
            {
                F = new CommunityFragment();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frag, F);
                ft.addToBackStack(null);
                ft.commit();
                break;
            }

            case R.id.navigation_messaging:
            {
                F = new MessagingFragment();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frag, F);
                ft.addToBackStack(null);
                ft.commit();
                break;
            }

            case R.id.navigation_notifications:
            {
                F = new NotificationsFragment();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frag, F);
                ft.addToBackStack(null);
                ft.commit();
                break;
            }

            case R.id.navigation_home:
            {
                F = new HomeFragment();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frag, F);
                ft.commit();
                break;
            }

        }
    }
}