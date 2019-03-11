package com.example.qp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.design.widget.Snackbar;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
         implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Button createTaskButton = findViewById(R.id.createTaskBtn);
        createTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateTaskActivity();
            }
        });
    }

    public void openCreateTaskActivity(){
        startActivity(new Intent(MainActivity.this, CreateTask.class));
    }

    public void openCalendarView(){
        startActivity(new Intent(MainActivity.this, CalendarView.class));
    }

    public void openCompletedTasks(){
        startActivity(new Intent(MainActivity.this, CompletedTasks.class));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public boolean onNavigationItemSelected(MenuItem item) { // to be further implemented -keghvart hagopian.
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_calendar) {
            openCalendarView();
        } else if (id == R.id.nav_notes) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Implement me",
                    Toast.LENGTH_SHORT);
            toast.show();

        } else if (id == R.id.nav_completed_tasks) {
            openCompletedTasks();

        } else if (id == R.id.nav_tools) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Implement me",
                    Toast.LENGTH_SHORT);
            toast.show();
        } else if (id == R.id.nav_share) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Implement me",
                    Toast.LENGTH_SHORT);
            toast.show();

        } else if (id == R.id.nav_send) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Implement me",
                    Toast.LENGTH_SHORT);
            toast.show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
