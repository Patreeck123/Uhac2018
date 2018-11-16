package com.example.marygraceangeles.myapplication;

import android.content.Intent;
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

public class vit3 extends AppCompatActivity {

    TextView description2,title2;
String hidden2,hidden3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vit3);
        hidden2=getIntent().getExtras().getString("hidden2");

        hidden3="325";
        description2 = (TextView) findViewById(R.id.desc2);
        description2.setMovementMethod(new ScrollingMovementMethod());
        description2.setText("- Excellent palatability\n" +
                "- For stronger bones\n" +
                "- Helps support higher nutritional requirement during pregnancy & lactation\n" +
                "- Organic minerals calcium, phosphorus, & magnesium along with vitamin D\n"+"- Virbac Canitone Tablets is a bone health supplement with excellent palatability for adult dogs.\n\n" +
                "\n" +
                " Each Tablet Contains:\n" +
                "Calcium - 700 mg\n" +
                "\n" +
                "Phosphorus - 400 mg\n" +
                "\n" +
                "Magnesium - 0.5 mg\n" +
                "\n" +
                "Vitamin D3 - 400 IU\n" +
                "\n" +
                "Dosage:\n" +
                "1 to 2 tablets daily to be mixed with food, for adult dogs, depending on their size, weight and special needs.\n" +
                "\n" +
                "Administration:\n" +
                "Crush tablet and top dressed on your dog's food.");

        title2 = (TextView) findViewById(R.id.descrip2);
        title2.setText("PROMO VIRBAC CANITONE TABLETS 30 TABLETS DOG SUPPLEMENT");
    }

    public void buyvit3(View view)
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
                            Toast.makeText(vit3.this,"Sold",Toast.LENGTH_SHORT).show();
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
