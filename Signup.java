package com.example.marygraceangeles.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

public class Signup extends AppCompatActivity {
    EditText uh1,uh2,uh3,uh4,uh5,uh6,uh7;
    String b1,b2;
    private Button cancel,btnSign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

         uh1=(EditText)findViewById(R.id.p1);
        uh2=(EditText)findViewById(R.id.p2);
        uh3=(EditText)findViewById(R.id.p3);
        uh4=(EditText)findViewById(R.id.p4);
        uh5=(EditText)findViewById(R.id.p5);
        uh6=(EditText)findViewById(R.id.p6);
        uh7=(EditText)findViewById(R.id.p7);

        cancel = (Button)findViewById(R.id.cancel);
        btnSign = (Button)findViewById(R.id.signin);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Signup.this,Login.class);
                startActivity(i);
                finish();
            }
        });

        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(uh1.getText().toString().equals("") &&  uh2.getText().toString().equals("") && uh3.getText().toString().equals("") && uh4.getText().toString().equals("") && uh5.getText().toString().equals("") && uh6.getText().toString().equals("") && uh7.getText().toString().equals(""))
                {
                    Toast.makeText(Signup.this, "Fill up all", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (uh6.getText().toString().equals(uh7.getText().toString())) {

                        register();
                        Intent i = new Intent(Signup.this,Dogsform.class);
                        startActivity(i);
                        finish();
                    } else {
                        Toast.makeText(Signup.this, "Check your password and confirm password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }




    public void register()
    {
        StringRequest request=new StringRequest(Request.Method.POST, "https://codebreakers4444.000webhostapp.com/insertuser.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                       if(response.contains("1"))
                       {
                           Toast.makeText(Signup.this,"Account Already Exists",Toast.LENGTH_SHORT).show();
                       }
                        else if(response.contains("2"))
                        {
                            Toast.makeText(Signup.this,"Invalid Account Number",Toast.LENGTH_SHORT).show();
                        }
                        else if(response.contains("3"))
                        {
                            Toast.makeText(Signup.this,"Incorrect Pincode",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(Signup.this,"Register Success",Toast.LENGTH_SHORT).show();
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
                params.put("u1",uh1.getText().toString());
                params.put("u2",uh2.getText().toString());
                params.put("u3",uh3.getText().toString());
                params.put("u4",uh4.getText().toString());
                params.put("u5",uh5.getText().toString());
                params.put("u6",uh6.getText().toString());
                return params;
            }
        };
        Volley.newRequestQueue(this).add(request);
    }
}
