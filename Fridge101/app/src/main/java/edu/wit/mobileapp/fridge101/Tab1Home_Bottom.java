package edu.wit.mobileapp.fridge101;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Tab1Home_Bottom extends Fragment {

    Button mEditItemsBottom;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1home_bottom, container, false);

        // Format to direct activity within a fragment.
        Button edit = (Button) rootView.findViewById(R.id.btn_edit_2);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ItemCurrentList.class);
                startActivity(intent);
            }
        });

        Button add = (Button) rootView.findViewById(R.id.btn_add_2);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AddItem.class);
                startActivity(intent);
            }
        });

        // Place return at the end.
        return rootView;
    }

}