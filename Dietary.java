package com.example.marygraceangeles.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Dietary extends AppCompatActivity {
EditText u1,u2,u3,u4,u5,u6;
    String hidden2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary);
        u1=(EditText)findViewById(R.id.Pname);
        u2=(EditText)findViewById(R.id.gen);
        u3=(EditText)findViewById(R.id.breed);
        u4=(EditText)findViewById(R.id.Mdiet);
        u5=(EditText)findViewById(R.id.Adiet);
        u6=(EditText)findViewById(R.id.Ediet);
        hidden2=getIntent().getExtras().getString("hidden2");
    }
    public void reg(View view)
    {
        register();
    }
    public void register()
    {
        StringRequest request=new StringRequest(Request.Method.POST, "https://codebreakers4444.000webhostapp.com/dog.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.contains("4"))
                        {
                            Toast.makeText(Dietary.this,"Dog Added",Toast.LENGTH_SHORT).show();

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
                params.put("u1",u1.getText().toString());
                params.put("u2",u2.getText().toString());
                params.put("u3",u3.getText().toString());
                params.put("u4",u4.getText().toString());
                params.put("u5",u5.getText().toString());
                params.put("u6",u6.getText().toString());
                params.put("u7",hidden2);
                return params;
            }
        };
        Volley.newRequestQueue(this).add(request);
    }
}
