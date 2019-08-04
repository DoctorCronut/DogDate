package com.example.dogdate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends AppCompatActivity {
    private BottomNavigationView mBottomNavigationView;
    private ViewPager mViewPager;
    private List<Fragment> mFragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        initHome();
    }

    private void initHome() {
        mViewPager = findViewById(R.id.home_vpage);
        mBottomNavigationView = findViewById(R.id.b_nav);
        initFragments();
        setUpViewPager();
        setNavigation();
    }

    private void initFragments(){
        mFragments.add(ProfileFragment.newInstance());
        mFragments.add(HomeFragment.newInstance());
        mFragments.add(ContactsRVFragment.newInstance());
    }

    private void setUpViewPager(){
        HomePageVPAdapter mHomePageVPAdapter = new HomePageVPAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mHomePageVPAdapter);
    }

    private void setNavigation(){
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int menuItemId = menuItem.getItemId();
                switch (menuItemId){
                    case(R.id.item_1):
                        mViewPager.setCurrentItem(0);
                        break;
                    case(R.id.item_2):
                        mViewPager.setCurrentItem(1);
                        break;
                    case(R.id.item_3):
                        mViewPager.setCurrentItem(2);
                        break;
                }
                return true;
            }
        });
    }
}
