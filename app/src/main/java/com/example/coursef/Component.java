package com.example.coursef;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import android.view.View;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.widget.GridLayout;
import android.widget.Toast;

public class Component extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {
    GridLayout gridLayout;
    public static int i = 0;
    public static int choice=0;
    public int vj = Second.user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        gridLayout = (GridLayout) findViewById(R.id.mainGrid);

        setSingleEvent(gridLayout);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.component, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        if(vj==1) {
            int id = item.getItemId();

            if (id == R.id.nav_df) {
                // Handle the camera action
                choice = 1;
                Intent al = new Intent(Component.this, coursesdynamic.class);

                // Start the new activity
                startActivity(al);
            } else if (id == R.id.nav_ff) {
                choice = 2;
                Intent al = new Intent(Component.this, formalFeedback.class);

                // Start the new activity
                startActivity(al);

            } else if (id == R.id.nav_he) {
                choice = 3;
                Intent al = new Intent(Component.this, htEmoticons.class);

                // Start the new activity
                startActivity(al);

            } else if (id == R.id.nav_cr) {
                choice = 4;
                Intent al = new Intent(Component.this, CheckRatings.class);

                // Start the new activity
                startActivity(al);

            } else if (id == R.id.nav_faq) {
                Intent al = new Intent(Component.this, qaf.class);

                // Start the new activity
                startActivity(al);

            } else if (id == R.id.nav_share) {

            }
        }
        else if(vj==0)
        {
            int id = item.getItemId();

            if (id == R.id.nav_df) {
                // Handle the camera action
                choice = 1;
                Intent al = new Intent(Component.this,faccoursesdynamic.class);

                // Start the new activity
                startActivity(al);
            } else if (id == R.id.nav_ff) {
                choice = 2;
                Intent al = new Intent(Component.this, faccoursesdynamic.class);

                // Start the new activity
                startActivity(al);

            } else if (id == R.id.nav_he) {
                choice = 3;
                Toast.makeText(Component.this, "You dont have access to this section", Toast.LENGTH_SHORT).show();


            } else if (id == R.id.nav_cr) {
                choice = 4;
                Intent al = new Intent(Component.this, CheckRatings.class);

                // Start the new activity
                startActivity(al);

            } else if (id == R.id.nav_faq) {
                Intent al = new Intent(Component.this, qaf.class);

                // Start the new activity
                startActivity(al);

            } else if (id == R.id.nav_share) {

            }
        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }

    public void setSingleEvent(GridLayout gridLayout) {
        for (int i = 0; i < gridLayout.getChildCount(); i++) {
            CardView cardView = (CardView) gridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Toast.makeText(cv.this,"Clicked at index "+ finalI,
                    //Toast.LENGTH_SHORT).show();
                    if(vj==1){
                    if (finalI == 0) {
                        choice=1;
                        Intent log = new Intent(Component.this,coursesdynamic.class);

                        // Start the new activity
                        startActivity(log);
                    } else if (finalI == 1) {
                        choice=2;
                        Intent log = new Intent(Component.this, formalFeedback.class);

                        // Start the new activity
                        startActivity(log);
                    } else if (finalI == 2) {
                        choice=3;
                        Intent log = new Intent(Component.this, htEmoticons.class);

                        // Start the new activity
                        startActivity(log);
                    } else if (finalI == 3) {
                        choice=4;
                        Intent log = new Intent(Component.this, CheckRatings.class);

                        // Start the new activity
                        startActivity(log);
                    }

                }
                    else if (vj==0){
                        if (finalI == 0) {
                            choice=1;
                            Intent log = new Intent(Component.this,faccoursesdynamic.class);

                            // Start the new activity
                            startActivity(log);
                        } else if (finalI == 1) {
                            choice=2;
                            Intent log = new Intent(Component.this, formalFeedback.class);

                            // Start the new activity
                            startActivity(log);
                        } else if (finalI == 2) {
                            choice=3;
                            Toast.makeText(Component.this, "You dont have access to this section", Toast.LENGTH_SHORT).show();


                        } else if (finalI == 3) {
                            choice=4;
                            Intent log = new Intent(Component.this, htEmoticons.class);

                            // Start the new activity
                            startActivity(log);
                        }
                    }


                }
            });
        }
    }
}
