package com.example.marygraceangeles.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class vitamins extends AppCompatActivity {

    String[] titles = {"NUTRI-VET SHED-DEFENSE MAX 60 CHEWABLES DOG SUPPLEMENT\n"+"PHP 905.00", "PROMO VIRBAC CANITONE TABLETS 30 TABLETS DOG SUPPLEMENT\n"+"PHP 325.00", "GIMDOG MULTI-VITAMIN PASTE 50G DOG SUPPLEMENT\n"+"PHP 270.00", "SENTRY GOOD BEHAVIOR CALMING OINTMENT FOR ANXIOUS DOGS (43G)\n"+"PHP 575.00","K9 POWER SUPER FUEL PERFORMANCE FORMULA 4LB (1814G) DOG SUPPLEMENT\n"+"PHP 2,550.00"};
    ListView lv;
String hidden2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamins);
        hidden2=getIntent().getExtras().getString("hidden2");

        lv = (ListView) findViewById(R.id.ListViewVita);
        ArrayAdapter<String> customAdapter = new ArrayAdapter<String>(this, R.layout.custom_listview, R.id.title, titles);
        lv.setAdapter(customAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), vit2.class);
                    myIntent.putExtra("hidden2",hidden2);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), vit3.class);
                    myIntent.putExtra("hidden2",hidden2);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), vit4.class);
                    myIntent.putExtra("hidden2",hidden2);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), vit5.class);
                    myIntent.putExtra("hidden2",hidden2);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), vit6.class);
                    myIntent.putExtra("hidden2",hidden2);
                    startActivityForResult(myIntent, 0);
                }
            }
        });


    }
    public void onBackPressed()
    {
        Intent i = new Intent(this,mainmenu.class);
        i.putExtra("hidden2",hidden2);
        startActivity(i);
        finish();


    }
}

