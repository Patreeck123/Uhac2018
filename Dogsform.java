package com.example.marygraceangeles.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Dogsform extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
String hidden;
    EditText l1,l2;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogsform);

         spinner = findViewById(R.id.spinngender);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.gender, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        hidden=getIntent().getExtras().getString("hidden");
        l1=(EditText)findViewById(R.id.Dname);
        l2=(EditText)findViewById(R.id.Bdog);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        //FOR THE GENDER OF THE DOG

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
public void reg(View view)
{
    register();
}

    public void register()
    {
        StringRequest request=new StringRequest(Request.Method.POST, "https://codebreakers4444.000webhostapp.com/insertdog.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response.contains("4"))
                        {
                            Intent i = new Intent(Dogsform.this,Login.class);
                            startActivity(i);
                            finish();
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
                params.put("u1",l1.getText().toString());
                params.put("u2",l2.getText().toString());
                params.put("u3",spinner.getSelectedItem().toString());
                params.put("u4",hidden);
                return params;
            }
        };
        Volley.newRequestQueue(this).add(request);
    }
}
