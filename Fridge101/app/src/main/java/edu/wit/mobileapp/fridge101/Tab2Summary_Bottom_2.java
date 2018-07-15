package edu.wit.mobileapp.fridge101;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Tab2Summary_Bottom_2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab2summary_bottom_2);

        List<String> categoryList = new ArrayList<>();
        categoryList.add("All Items");
        categoryList.add("Vegetable");
        categoryList.add("Fruit");
        categoryList.add("Grain");
        categoryList.add("Meat");
        categoryList.add("Drink");
        categoryList.add("Other Food");
        categoryList.add("Non-Food");
        Spinner spinner=findViewById(R.id.s_category);

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categoryList);
        listAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(listAdapter);       //setting adapter to spinner

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {    //on item select listener
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                        loadFragment(new FragmentAllItems());
                        break;
                    case 1:
                        loadFragment(new FragmentVegetable());
                        break;
                    case 2:
                        loadFragment(new FragmentFruit());
                        break;
                    case 3:
                        loadFragment(new FragmentGrain());
                        break;
                    case 4:
                        loadFragment(new FragmentMeat());
                        break;
                    case 5:
                        loadFragment(new FragmentDrink());
                        break;
                    case 6:
                        loadFragment(new FragmentOtherFood());
                        break;
                    case 7:
                        loadFragment(new FragmentNonFood());
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    // Load the fragment.
    private void loadFragment(Fragment fragment) {
        // Create a FragmentManager.
        FragmentManager fm = getFragmentManager();
        // Create a FragmentTransaction to begin the transaction and replace the Fragment.
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        // Replace the FrameLayout with new Fragment.
        fragmentTransaction.replace(R.id.fragment, fragment);
        fragmentTransaction.commit(); // Save the changes.
    }

}
