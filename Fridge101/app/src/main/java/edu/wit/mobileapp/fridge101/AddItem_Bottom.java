package edu.wit.mobileapp.fridge101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class AddItem_Bottom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item__bottom);

        Button go_back = (Button) findViewById(R.id.b_return);
        go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_back = new Intent(AddItem_Bottom.this, Refridgerator_Bottom.class);
                startActivity(go_back);
            }
        });

        Button add_item = (Button) findViewById(R.id.b_add);
        add_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add_item = new Intent(AddItem_Bottom.this, Refridgerator_Bottom.class);
                startActivity(add_item);
            }
        });

        String[] arraySpinner = new String[] {
                "All Items", "Vegetable", "Fruit", "Grain", "Meat",
                "Drink", "Other Food", "Non-Food" };
        Spinner s = (Spinner) findViewById(R.id.s_category);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        s.setAdapter(adapter);

    }

}
