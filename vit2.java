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

public class vit2 extends AppCompatActivity {

    TextView description,title;
String hidden2,hidden3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vit2);
        hidden2=getIntent().getExtras().getString("hidden2");
        hidden3="905";
        description = (TextView) findViewById(R.id.desc1);
        description.setMovementMethod(new ScrollingMovementMethod());
        description.setText("- Liver flavor chewables\n" +
                "- Contains essential fatty acids to promote skin & coat health\n" +
                "- LA optimizes water permeability of skin\n" +
                "- Safflower oil is especially rich in the essential fatty acid & linoleic acid\n" +
                "- Sunflower oil provides high levels of the omega-6 fatty acid & linoleic acid (LA)\n\n"
        +"Shed-Defense Max liver flavor chewables contain essential fatty acids from natural source vegetable oils to promote skin and coat health and help support normal shedding.\n" +
                "\n" +
                "Flax seed oil contains the omega-3 fatty acid & linolenic acid that convert into EPA and DHA\n" +
                "\n" +
                "Sunflower oil provides high levels of the omega-6 fatty acid & linoleic acid (LA)\n" +
                "\n" +
                "Safflower oil is especially rich in the essential fatty acid & linoleic acid\n" +
                "\n" +
                "LA optimizes water permeability of skin\n" +
                "\n" +
                "Contain essential fatty acids from natural source vegetable oils to promote skin and coat health and help support normal shedding\n" +
                "\n" +
                "Ingredients:\n" +
                "Liver Meal, Dried Whey, Di-Calcium Phosphate, Stearic Acid, Cellulose, Dried Milk, Magnesium Stearate, Flaxseed Oil, Sunflower Oil, Safflower Oil, Magnesium Silicate, Silicon Dioxide.\n" +
                "\n" +
                "Guaranteed Analysis:\n" +
                "Crude Protein     35.0% min\n" +
                "\n" +
                "Crude Fat     5.0% min\n" +
                "\n" +
                "Crude Fiber     5.5% max\n" +
                "\n" +
                "Moisture     10.0% max\n" +
                "\n" +
                "Calcium     2% min\n" +
                "\n" +
                "Calcium     3.0% max\n" +
                "\n" +
                "Phosphorus     2% min\n" +
                "\n" +
                "Linoleic Acid (Omega-6)     0.5% min\n" +
                "\n" +
                "Linolenic Acid (Omega-3)     0.4% min\n" +
                "\n" +
                "Feeding Guide:\n" +
                "Use 1 chewable per 10 lbs of body weight daily. Allow 4 - 6 weeks for best results. Continue as needed.");

        title = (TextView) findViewById(R.id.descrip);
        title.setText("NUTRI-VET SHED-DEFENSE MAX 60 CHEWABLES DOG SUPPLEMENT");

    }
public void buyvit2(View view)
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
    Toast.makeText(vit2.this,"Sold",Toast.LENGTH_SHORT).show();
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
