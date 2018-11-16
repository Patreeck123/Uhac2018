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

public class vit6 extends AppCompatActivity {

    TextView description5,title5;
String hidden2,hidden3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vit6);
        hidden2=getIntent().getExtras().getString("hidden2");
hidden3="2550";
        description5 = (TextView) findViewById(R.id.desc5);
        description5.setMovementMethod(new ScrollingMovementMethod());
        description5.setText("- Supports muscle growth/repair, prevents break down\n" +
                "- Build lean muscle, burn fat, raise health & immunity\n" +
                "- Converts calories into lean muscle mass and more energy\n" +
                "- Extends endurance and improves recovery time, reduce over training & injury\n" +
                "- Improves overall quality of life and stress resistance, supports immune function\n\n"+"Dogs today are much more active.  Whether you have a service dog, a champion performer, or one that simply plays hard all day, they require more nutrients (fuel) than other dogs.  Super Fuel, was designed to meet the nutritional needs of today’s active dog with a performance formula that increases energy, promotes recovery and lean muscle formation.\n" +
                "\n" +
                "Super Fuel, is an advanced performance supplement designed to help maximize muscle efficiency and endurance, while also promoting a healthy recovery time.  Super Fuel's super octane strength fuel component helps generate exceptional muscle power with less fatigue. A combination of muscle fuels drives high intensity movements. Healthy ATP regeneration enables muscle fiber to fire even during anaerobic conditions. Power through the hardest workouts while others fade!\n" +
                "\n" +
                "Ingredients:\n" +
                "Chicken, Powdered Chicken fat, Stabilized Rice bran, Milk protein isolate, Silicon dioxide, Creatine*, Agave nectar, Maltodextrin, Camelina oil, Citrus meal, Safflower oil, Whole egg, Coconut oil, Methylsulfonylmethane (MSM)*, Salt, Potassium chloride, Chondroitin sulfate*, Cruciferous vegetable mix, Dried blueberry, Tart cherry powder, Cranberry fruit powder, L-Leucine*, L-Carnitine*, L-Arginine*, Taurine, L-Glutamine*, Sodium Citrate, Proprietary blend of dried: Lactobacillus acidophilus, Lactobacillus casei, Lactobacillus salivarius, Lactobacillus plantarum, Lactobacillus rhamnosus, Lactobacillus brevis, Bifidobacterium, bifidum, Bifidobacterium, longum, Streptococcus thermophilus, Potassium iodide, Choline bitartrate, Alpha tocopherol (Vitamin E), Pyridoxine HCL, Inositol, Di-Calcium phosphate, Copper gluconate, Zinc oxide, Folic acid, Thiamin monohydrate, Hyaluronic acid*.\n" +
                "\n" +
                "*Not recognized as an essential nutrient by the AAFCO Dog Food Nutrient Profiles\n" +
                "\n" +
                "Appearance: Dry powder\n" +
                "\n" +
                "Color: Brown\n" +
                "\n" +
                "Odor: Cooked chicken\n" +
                "\n" +
                "Flavor: Chicken\n" +
                "\n" +
                "Guaranteed Analysis:\n" +
                "Crude Protein (Min).....29%\n" +
                "\n" +
                "Crude Fat (Min.).....37%\n" +
                "\n" +
                "Crude Fiber (Max).....3%\n" +
                "\n" +
                "Moisture (Max).....8%\n" +
                "\n" +
                "Calorie Content (fed): Kcal ME / Kg).....5143, (Kcal ME / scoop).....180\n" +
                "\n" +
                "Feeding Guide:\n" +
                "With Meals: Feed recommended dosage at meal time(s). Goes great when mix with 1-2 cups of water.\n" +
                "\n" +
                "After Workouts: For optimal results feed within a half-hour after exercise to support recovery, Mix 1-2 scoops with 1 cup of water\n" +
                "\n" +
                "Exercise Level" + " and Daily Serving Size per 25-lbs body weight\n" +
                "Low (walks)                                                           ½ Scoop\n" +
                "\n" +
                "Moderate (Runs)                                                     1 Scoop\n" +
                "\n" +
                "High (Agility, IPO, Hunting, Sprinting)                      2 Scoops\n" +
                "\n" +
                "Safe Storage: Store shelf-stable supplement products in a cool, clean, dry place. Never put them above the stove, under the sink, in a damp garage or basement, or any place exposed to high or low temperature extremes.");

        title5 = (TextView) findViewById(R.id.descrip5);
        title5.setText("K9 POWER SUPER FUEL PERFORMANCE FORMULA 4LB (1814G) DOG SUPPLEMENT");
    }
    public void buyvit6(View view)
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
                            Toast.makeText(vit6.this,"Sold",Toast.LENGTH_SHORT).show();
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
