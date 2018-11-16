package com.paw.accessories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class access3 extends AppCompatActivity {

    TextView descaccess3,titleaccess3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access3);

        descaccess3 = (TextView) findViewById(R.id.descac3);
        descaccess3.setMovementMethod(new ScrollingMovementMethod());
        descaccess3.setText("- Dog Carrier for dogs\n" +
                "- Good for travelling with your dog");

        titleaccess3 = (TextView) findViewById(R.id.descripac3);
        titleaccess3.setText("DOGIT VOYAGEUR BROWN LARGE (24.3X16.7X14.5IN) PET CARRIER");
    }
}
