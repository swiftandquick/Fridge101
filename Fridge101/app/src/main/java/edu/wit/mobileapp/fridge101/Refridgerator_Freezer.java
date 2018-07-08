package edu.wit.mobileapp.fridge101;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;

public class Refridgerator_Freezer extends AppCompatActivity {

    private static final String TAG = "Freezer";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refridgerator__freezer);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Home_Freezer(), "Home");
        adapter.addFragment(new Tab2Summary_Freezer(), "Summary");
        adapter.addFragment(new Tab3ShoppingList_Freezer(), "Shopping List");
        adapter.addFragment(new Tab4Setting_Freezer(), "Navigation");
        viewPager.setAdapter(adapter);
    }
}
