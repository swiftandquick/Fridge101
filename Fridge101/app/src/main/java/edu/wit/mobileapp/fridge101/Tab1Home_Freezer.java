package edu.wit.mobileapp.fridge101;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Tab1Home_Freezer extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1home_freezer, container, false);

        // Format to direct activity within a fragment.
        Button button = (Button) rootView.findViewById(R.id.btn_edit_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ItemCurrentList_Bottom.class);
                startActivity(intent);
            }
        });

        Button add = (Button) rootView.findViewById(R.id.btn_add_1);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AddItem_Freezer.class);
                startActivity(intent);
            }
        });

        // Place return at the end.
        return rootView;
    }

}