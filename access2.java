package com.paw.accessories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class access2 extends AppCompatActivity {

    TextView descaccess2,titleaccess2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access2);

        descaccess2 = (TextView) findViewById(R.id.descac2);
        descaccess2.setMovementMethod(new ScrollingMovementMethod());
        descaccess2.setText("- Easy to clean & quick to dry\n" +
                "- Woven by local craftsmen from water hyacinth\n" +
                "- The cloth liner can easily be replaced by any other floor mat\n" +
                "- Made from indigenous materials using environmentally sustainable methods\n\n"+"Peaceful Pod is a cozy cocoon shaped basket, woven from water hyacinth vines, so our companion animals can also enjoy their privacy. Interior mat can be removed, washed, and replaced with any standard-sized foot rug or floor mat.\n" +
                "\n" +
                "Alaga PH is a lifestyle products handcrafted with care by Filipino craftsmen, so our animal companions feel even more at home.\n" +
                "\n" +
                "The Alaga water hyacinth series creatively removes the overgrowth which chokes waterways, causing floods and destroying other aquatic life.\n" +
                "\n" +
                "Product Measurements:\n" +
                "12\" x 12\" opening; 13\" x 15\" oval base; 18\" height");

        titleaccess2 = (TextView) findViewById(R.id.descripac2);
        titleaccess2.setText("ALAGA PH PEACEFUL POD PET BED");


    }
}
