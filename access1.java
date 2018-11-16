package com.paw.accessories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class access1 extends AppCompatActivity {

    TextView descaccess1,titleaccess1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access1);
        descaccess1 = (TextView) findViewById(R.id.descac1);
        descaccess1.setMovementMethod(new ScrollingMovementMethod());
        descaccess1.setText("- Easy to clean & quick to dry\n" +
                "- Woven by local craftsmen from water hyacinth\n" +
                "- The cloth liner can easily be replaced by any other floor mat\n" +
                "- Made from indigenous materials using environmentally sustainable methods\n\n"+"Blissful Bed is an oval-shaped basket with opening in front for easy entry and exit, woven from water hyacinth vines. Interior mat can be removed, washed, and replaced with any standard-sized foot rug or floor mat.\n" +
                "\n" +
                "Alaga PH is a lifestyle products handcrafted with care by Filipino craftsmen, so our animal companions feel even more at home. The Alaga water hyacinth series creatively removes the overgrowth which chokes waterways, causing floods and destroying other aquatic life.\n" +
                "\n" +
                "Product Measurements:\n" +
                "13\" x 15\" oval base; 5\" height");

        titleaccess1 = (TextView) findViewById(R.id.descripac1);
        titleaccess1.setText("ALAGA PH BLISSFUL PET BED");
    }
}
