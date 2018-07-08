package edu.wit.mobileapp.fridge101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditItem_Bottom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item__bottom);

        Button remove = (Button) findViewById(R.id.b_remove);
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent remove = new Intent(EditItem_Bottom.this, Refridgerator_Bottom.class);
                startActivity(remove);
            }
        });

        Button done = (Button) findViewById(R.id.b_add);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent done = new Intent(EditItem_Bottom.this, Refridgerator_Bottom.class);
                startActivity(done);
            }
        });
    }
}
