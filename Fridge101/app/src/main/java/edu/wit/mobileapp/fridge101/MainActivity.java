package edu.wit.mobileapp.fridge101;

import android.widget.TextView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView refridgerator_freezer_compartment = (ImageView) findViewById(R.id.refridgerator_freezer_compartment);
        refridgerator_freezer_compartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent refridgerator_freezer_compartment_open = new Intent(MainActivity.this, Refridgerator_Freezer.class);
                startActivity(refridgerator_freezer_compartment_open);
            }
        });

        ImageView refridgerator_bottom_compartment = (ImageView) findViewById(R.id.refridgerator_bottom_compartment);
        refridgerator_bottom_compartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent refridgerator_bottom_compartment_open = new Intent(MainActivity.this, Refridgerator_Bottom.class);
                startActivity(refridgerator_bottom_compartment_open);
            }
        });
    }
}