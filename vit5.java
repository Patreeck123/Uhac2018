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

public class vit5 extends AppCompatActivity {

    TextView description4,title4;
String hidden2,hidden3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vit5);
        hidden2=getIntent().getExtras().getString("hidden2");
        hidden3="575";
        description4 = (TextView) findViewById(R.id.desc4);
        description4.setMovementMethod(new ScrollingMovementMethod());
        description4.setText("- Fast acting\n" +
                "- Easy to use\n" +
                "- Calm anxious dogs\n" +
                "- Alleviate anxious behavior\n" +
                "- Helps promote good behavior\n\n"+"Sentry Good Behavior Calming Ointment for Anxious Dogs quickly helps to calm anxious dogs in stressful situations while promoting good behavior. This fast-acting ointment helps alleviate anxious behavior and is a short-term solution for environmentally induced fear or excitement in dogs and is applied directly on the dog's nose for optimal results.\n" +
                "\n" +
                "Directions for Use:\n" +
                "Apply a thin coat of ointment, sufficient to cover most pf the dog's nose. Entire nose doesn't need to be covered. Re-apply as needed. Following good hygiene practice, wash hands with soap and water after handling.\n" +
                "\n" +
                "Warnings: For use on dogs ONLY. Keep out of reach of children.");

        title4 = (TextView) findViewById(R.id.descrip4);
        title4.setText("SENTRY GOOD BEHAVIOR CALMING OINTMENT FOR ANXIOUS DOGS (43G)");
    }
    public void buyvit5(View view)
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
                            Toast.makeText(vit5.this,"Sold",Toast.LENGTH_SHORT).show();
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
