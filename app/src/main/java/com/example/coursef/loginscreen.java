package com.example.coursef;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class loginscreen extends AppCompatActivity {
    public static String namee, service, phnum, emails, password;
    public int vj = Second.user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);

    }

    public void login(View view) {
        Log.isLoggable("po", vj);
        EditText text2 = (EditText) findViewById(R.id.input_email);
        emails = text2.getText().toString();
        EditText text3 = (EditText) findViewById(R.id.input_password);
        password = text3.getText().toString();
        if (vj == 0) {
            response hu = new response(this.getApplicationContext());
            hu.execute();
        } else if (vj == 1) {
            //Intent al = new Intent(loginscreen.this, Component.class);

            // Start the new activity
            //startActivity(al);
           response hu = new response(this.getApplicationContext());
            hu.execute();
        }


    }


    public void siggn(View view) {
        if (vj == 1) {
            Intent al = new Intent(loginscreen.this, Signup.class);

            // Start the new activity
            startActivity(al);
        } else if (vj == 0) {
            Intent al = new Intent(loginscreen.this,facsignup.class);
            startActivity(al);
        }
    }
    public static boolean isEmailValid(String email1) {
        boolean chk1 = false;

        String expression1 = "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$";
        CharSequence inputStr1 = email1;

        Pattern pattern = Pattern.compile(expression1, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr1);
        if (matcher.matches()) {
            chk1= true;
        }
        return chk1;
    }
    public static boolean isPassValid(String pass1){
        boolean pchk1=false;
        if(pass1.length()==0)
        {
            pchk1=false;
        }
        else if (pass1.length()<8){
            pchk1=false;
        }
        else
        {
            pchk1=true;
        }
        return pchk1;
    }
}
