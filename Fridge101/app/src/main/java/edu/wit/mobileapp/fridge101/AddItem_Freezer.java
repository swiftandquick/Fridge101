package edu.wit.mobileapp.fridge101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddItem_Freezer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item__freezer);

        Button go_back = (Button) findViewById(R.id.b_return);
        go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_back = new Intent(AddItem_Freezer.this, Refridgerator_Bottom.class);
                startActivity(go_back);
            }
        });

        Button add_item = (Button) findViewById(R.id.b_add);
        add_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add_item = new Intent(AddItem_Freezer.this, Refridgerator_Bottom.class);
                startActivity(add_item);
            }
        });

    }
}
