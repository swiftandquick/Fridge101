package edu.wit.mobileapp.tabintab;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MotherActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mother);

        MainFragment fragmenttab = new MainFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.item_detail_container, fragmenttab).commit();

    }
}