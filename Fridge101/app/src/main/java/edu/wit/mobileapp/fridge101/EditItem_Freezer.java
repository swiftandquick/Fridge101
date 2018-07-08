package edu.wit.mobileapp.fridge101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class EditItem_Freezer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refridgerator__freezer);

        Button remove = (Button) findViewById(R.id.b_remove);
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent remove = new Intent(EditItem_Freezer.this, Refridgerator_Freezer.class);
                startActivity(remove);
            }
        });

        Button done = (Button) findViewById(R.id.b_done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent done = new Intent(EditItem_Freezer.this, Refridgerator_Freezer.class);
                startActivity(done);
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
