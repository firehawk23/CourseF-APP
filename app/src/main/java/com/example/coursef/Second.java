package com.example.coursef;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
import android.view.View;

import android.widget.RadioButton;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    public static int user=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void enter(View view){

        RadioButton stud = (RadioButton) findViewById(R.id.Student);
        boolean s = stud.isChecked();
        RadioButton fac = (RadioButton) findViewById(R.id.faculty);
        boolean f = fac.isChecked();

        if (s == true) {
            user=1;
            Intent log = new Intent(Second.this, loginscreen.class);

            // Start the new activity
            startActivity(log);

        } else if (f == true) {
            user=0;
            Intent log = new Intent(Second.this, loginscreen.class);

            // Start the new activity
            startActivity(log);
        }
        else
            Toast.makeText(this, "select either one", Toast.LENGTH_SHORT).show();
    }


}