package edu.wit.mobileapp.fridge101;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Tab2Summary_Bottom extends Fragment {

    Button CheckOutSummary;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2summary_bottom, container, false);

        Button COS = (Button) rootView.findViewById(R.id.b_COS);
        COS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Tab2Summary_Bottom_2.class);
                startActivity(intent);
            }
        });

        // Place return at the end.
        return rootView;
    }

}