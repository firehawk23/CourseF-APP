package com.example.coursef;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Faq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        //TextView ans1 = (TextView) findViewById(R.id.ans);
        //TextView ans2 = (TextView) findViewById(R.id.ans2);
        //TextView ans3 = (TextView) findViewById(R.id.ans3);
       // TextView ans4 = (TextView) findViewById(R.id.ans4);
        TextView faq = (TextView) findViewById(R.id.faq);
        //TextView ans1 = (TextView) findViewById(R.id.ans);
        }
        public void ans(View view){
            TextView ans1 = (TextView) findViewById(R.id.ans);
            TextView ans2 = (TextView) findViewById(R.id.ans2);
            TextView ans3 = (TextView) findViewById(R.id.ans3);
            TextView ans4 = (TextView) findViewById(R.id.ans4);
            ans1.setVisibility(View.VISIBLE);
            ans2.setVisibility(View.GONE);
            ans3.setVisibility(View.GONE);
            ans4.setVisibility(View.GONE);
        }
    public void q1(View view){
        TextView ans1 = (TextView) findViewById(R.id.ans);
        TextView ans2 = (TextView) findViewById(R.id.ans2);
        TextView ans3 = (TextView) findViewById(R.id.ans3);
        TextView ans4 = (TextView) findViewById(R.id.ans4);
        ans2.setVisibility(View.VISIBLE);
        ans1.setVisibility(View.GONE);
        ans3.setVisibility(View.GONE);
        ans4.setVisibility(View.GONE);

    }
    public void q2(View view){
        TextView ans1 = (TextView) findViewById(R.id.ans);
        TextView ans2 = (TextView) findViewById(R.id.ans2);
        TextView ans3 = (TextView) findViewById(R.id.ans3);
        TextView ans4 = (TextView) findViewById(R.id.ans4);
        ans3.setVisibility(View.VISIBLE);
        ans2.setVisibility(View.GONE);
        ans1.setVisibility(View.GONE);
        ans4.setVisibility(View.GONE);
    }
    public void q3(View view){
        TextView ans1 = (TextView) findViewById(R.id.ans);
        TextView ans2 = (TextView) findViewById(R.id.ans2);
        TextView ans3 = (TextView) findViewById(R.id.ans3);
        TextView ans4 = (TextView) findViewById(R.id.ans4);
        ans4.setVisibility(View.VISIBLE);
        ans2.setVisibility(View.GONE);
        ans3.setVisibility(View.GONE);
        ans1.setVisibility(View.GONE);
    }
}



