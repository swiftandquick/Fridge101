package edu.wit.mobileapp.fridge101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ItemCurrentList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_current_list);

        Button edit1 = (Button) findViewById(R.id.et_edit1);
        edit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent edit1 = new Intent(ItemCurrentList.this, EditItem.class);
                startActivity(edit1);
            }
        });

        Button edit2 = (Button) findViewById(R.id.et_edit2);
        edit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent edit2 = new Intent(ItemCurrentList.this, EditItem.class);
                startActivity(edit2);
            }
        });

        Button edit3 = (Button) findViewById(R.id.et_edit3);
        edit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent edit3 = new Intent(ItemCurrentList.this, EditItem.class);
                startActivity(edit3);
            }
        });

        Button edit4 = (Button) findViewById(R.id.et_edit4);
        edit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent edit4 = new Intent(ItemCurrentList.this, EditItem.class);
                startActivity(edit4);
            }
        });

        Button edit5 = (Button) findViewById(R.id.et_edit5);
        edit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent edit5 = new Intent(ItemCurrentList.this, EditItem.class);
                startActivity(edit5);
            }
        });

        Button done = (Button) findViewById(R.id.btn_done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent done = new Intent(ItemCurrentList.this, Refridgerator_Bottom.class);
                startActivity(done);
            }
        });

        Button remove = (Button) findViewById(R.id.btn_delete);
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent remove = new Intent(ItemCurrentList.this, Refridgerator_Bottom.class);
                startActivity(remove);
            }
        });
    }
}
