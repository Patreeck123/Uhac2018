package com.example.marygraceangeles.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class vit4 extends AppCompatActivity {

    TextView description3,title3;
String hidden2,hidden3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vit4);
        hidden2=getIntent().getExtras().getString("hidden2");
hidden3="270";
        description3 = (TextView) findViewById(R.id.desc3);
        description3.setMovementMethod(new ScrollingMovementMethod());
        description3.setText("- Made in Germany\n" +
                "- Without added sugar\n" +
                "- Composed of 12 essential vitamins\n" +
                "- Supports & strengthen dog's immune system\n" +
                "- Helps prevent diet-related vitamin deficiencies\n\n"+"The high vitamin content of the GimDog Multi-Vitamin-Paste helps prevent dietary vitamin deficiencies and supports your dog’s performance. Vitamin E protects the cells and enhances the body’s defences.\n" +
                "\n" +
                "Ingredients:\n" +
                "Vegetable by-products, oils and fats, yeast.\n" +
                "\n" +
                "Nutritional Values:\n" +
                "Protein    6.0 %\n" +
                "\n" +
                "Fat content    37.5 %\n" +
                "\n" +
                "Crude ash    4.5 %\n" +
                "\n" +
                "Crude fiber    3.0 %\n" +
                "\n" +
                "Moisture    10.0 %\n" +
                "Additives:\n" +
                "Vit. A: 99.900 I.U. Vit. D3: 9.990 I.U. Vit. E: 1.900 mg Vit. B1: 20 mg Vit. B2: 20 mg Vit. B6: 16,7 mg Vit. B12: 299,7 mcg Vit. C: 333 mg pantothenic acid: 50 mg Niacin: 199,8 mg Biotin: 1665 mcg. Folic acid: 5,0 mg.\n" +
                "\n" +
                "Directions for Use:\n" +
                "Feed 1 cm (approx. 0.5 g) per 1 kg body weight daily. Mix the paste with food or feed directly from the tube.\n" +
                "\n" +
                "The proportion of vitamin D3 in this paste is greater than it is in complete foods. For this reason, the feeding quantity of the paste should not account for more than 10% of the daily amount of food.");

        title3 = (TextView) findViewById(R.id.descrip3);
        title3.setText("GIMDOG MULTI-VITAMIN PASTE 50G DOG SUPPLEMENT");
    }
    public void buyvit4(View view)
    {
        register();
    }
    public void register()
    {
        StringRequest request=new StringRequest(Request.Method.POST, "https://codebreakers4444.000webhostapp.com/buy.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        if(response.contains("4"))
                        {
                            Toast.makeText(vit4.this,"Sold",Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params=new HashMap<>();
                params.put("u1",hidden2);
                params.put("u2",hidden3);
                return params;
            }
        };
        Volley.newRequestQueue(this).add(request);
    }
}
