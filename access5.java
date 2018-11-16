package com.paw.accessories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class access5 extends AppCompatActivity {

    TextView descaccess5,titleaccess5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access5);

        descaccess5 = (TextView) findViewById(R.id.descac5);
        descaccess5.setMovementMethod(new ScrollingMovementMethod());
        descaccess5.setText("SKARF! designs pet bandanas with a passion. With various designs and awesome prints, finest fabrics are used which are then sewn together seamlessly and throughly for durability.\n" +
                "\n" +
                "A wide selection of sizing categories are provided along with two snaps to provide 1\" - 2\" increments making sure that they fit any breed.\n" +
                "\n" +
                "Each bandana is meticulously inspected and carefully constructed to ensure you and your furbaby look on point!\n" +
                "\n" +
                "Measuring Guide:\n" +
                "We recommend you taking a loose measurement around your pet's neck for better fit (please include the fur).");

        titleaccess5 = (TextView) findViewById(R.id.descripac5);
        titleaccess5.setText("SKARF! DINOSAUR YELLOW PET BANDANA");
    }
}
