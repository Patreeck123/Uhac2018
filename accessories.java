package com.paw.accessories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class accessories extends AppCompatActivity {

    String[] title2 = {"ALAGA PH BLISSFUL PET BED\n" + "PHP 1,050.00", "ALAGA PH PEACEFUL POD PET BED\n" + "PHP 2,250.00", "DOGIT VOYAGEUR BROWN LARGE (24.3X16.7X14.5IN) PET CARRIER\n" + "PHP 2,880.00", "SKARF! APPLE NAVY BLUE PET BANDANA\n" + "PHP 295.00", "SKARF! DINOSAUR YELLOW PET BANDANA\n" + "PHP 295.00"};
    ListView lv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories);

        lv2 = (ListView) findViewById(R.id.listviewaccess);
        ArrayAdapter<String> customAdapter = new ArrayAdapter<String>(this, R.layout.custom_layout_access, R.id.titleaccess, title2);
        lv2.setAdapter(customAdapter);

        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), access1.class);
                    startActivityForResult(myIntent, 0);

                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), access2.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), access3.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), access4.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), access5.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });
    }
}
