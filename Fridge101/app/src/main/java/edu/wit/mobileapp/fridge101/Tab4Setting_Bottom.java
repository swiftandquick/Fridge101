package edu.wit.mobileapp.fridge101;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Tab4Setting_Bottom extends Fragment {

    // Maybe leave this here for now.

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab4setting_bottom, container, false);

        Button toMain = (Button) rootView.findViewById(R.id.b_to_main_page);
        toMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button toFreezer = (Button) rootView.findViewById(R.id.b_to_freezer);
        toFreezer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Refridgerator_Freezer.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}