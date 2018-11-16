package com.example.marygraceangeles.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainmenu extends AppCompatActivity {
    private Button Btndiet,BtnVit,BtnAcc;
    String hidden2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        hidden2=getIntent().getExtras().getString("hidden2");


    }
    public void diet(View view)
    {
        Intent i= new Intent(mainmenu.this,Dietary.class);
        i.putExtra("hidden2",hidden2);
        startActivity(i);
        finish();
    }
    public void vitamins(View view)
    {
        Intent i= new Intent(mainmenu.this,vitamins.class);
        i.putExtra("hidden2",hidden2);
        startActivity(i);
        finish();
    }
    public void accessories(View view)
    {
        Intent i= new Intent(mainmenu.this,accessories.class);
        i.putExtra("hidden2",hidden2);
        startActivity(i);
        finish();
    }

    public void onBackPressed()
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(mainmenu.this);
        builder.setMessage("Do you want to logout?");
        builder.setCancelable(true);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();

            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();

            }
        });
        AlertDialog alert=builder.create();
        alert.show();


    }
}
