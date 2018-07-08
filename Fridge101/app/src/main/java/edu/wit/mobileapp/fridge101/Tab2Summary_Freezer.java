package edu.wit.mobileapp.fridge101;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Tab2Summary_Freezer extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2summary_freezer, container, false);

        // Check values -> string file for category.
        String [] values =
                {"All Items", "Vegetable", "Fruit", "Grain", "Meat",
                        "Drink", "Other Food", "Non-Food"};
        Spinner spinner = (Spinner) rootView.findViewById(R.id.s_category);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        return rootView;
    }

}