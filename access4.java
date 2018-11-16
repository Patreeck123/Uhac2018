package com.paw.accessories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class access4 extends AppCompatActivity {

    TextView descaccess4,titleaccess4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access4);

        descaccess4 = (TextView) findViewById(R.id.descac4);
        descaccess4.setMovementMethod(new ScrollingMovementMethod());
        descaccess4.setText("SKARF! designs pet bandanas with a passion. With various designs and awesome prints, finest fabrics are used which are then sewn together seamlessly and throughly for durability.\n" +
                "\n" +
                "A wide selection of sizing categories are provided along with two snaps to provide 1\" - 2\" increments making sure that they fit any breed.\n" +
                "\n" +
                "Each bandana is meticulously inspected and carefully constructed to ensure you and your furbaby look on point!\n" +
                "\n" +
                "Measuring Guide:\n" +
                "We recommend you taking a loose measurement around your pet's neck for better fit (please include the fur).");

        titleaccess4 = (TextView) findViewById(R.id.descripac4);
        titleaccess4.setText("SKARF! APPLE NAVY BLUE PET BANDANA");
    }
}
