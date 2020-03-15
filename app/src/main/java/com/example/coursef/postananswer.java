package com.example.coursef;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class postananswer extends AppCompatActivity {
    public static String name,choice,desc;
    public static String namee, service, phnum, emails,branch;
    public static String chosen="";
    public int hk=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postananswer);

    }



    public void login(View view)
    {
        EditText text2 = (EditText) findViewById(R.id.input_name);
        name = text2.getText().toString();

        if(name.length()==0)
        {
            Toast.makeText(this, "Please Enter the Answer!", Toast.LENGTH_SHORT).show();
        }

        else {
            postananswerresponse hu = new  postananswerresponse(this.getApplicationContext());
            hu.execute();
        }
    }
}
