package com.example.qp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
<<<<<<< HEAD


    public static ArrayList<Task> globalTaskList = new ArrayList<>();
    public static ArrayList<Task> globalCompletedTaskList = new ArrayList<>();
=======
    public static ArrayList<Task> globalTaskList = new ArrayList<Task>();
    public static ArrayList<Task> globalCompletedTaskList = new ArrayList<Task>();
>>>>>>> b024ba1291e462eaf54102f394d13b015d544ca6

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        Button createTaskButton = findViewById(R.id.createTaskBtn);
        createTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //openCalendarViewActivity();
                openCreateTaskActivity();
            }
        });




    }


    public void openCreateTaskActivity(){
        startActivity(new Intent(MainActivity.this, CreateTask.class));
    }

    public void openViewTask(){
        startActivity(new Intent(this, ViewTask.class));
    }

    public void openCalendarViewActivity(){
        startActivity(new Intent(MainActivity.this, CalendarView.class));
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
}
