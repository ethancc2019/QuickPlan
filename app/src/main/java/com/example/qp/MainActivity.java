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
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Time;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Task> globalTaskList = new ArrayList<>();
    public ArrayList<Task> globalCompletedTaskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        displayTaskToCard();
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

    public void displayTaskToCard()
    {
        //Dummy task fields
        Time testTime = new Time(13,44,3);
        Task testTask = new Task("Task1", "03/14/19", testTime, 4, "I need to finish this task.", false);
        globalTaskList.add(testTask);
        if(!globalTaskList.isEmpty())
        {
            if(globalTaskList.get(0) != null)
            {
                EditText taskName =  findViewById(R.id.taskName02);
                taskName.setText(globalTaskList.get(0).getTaskName());

                EditText dueDate = findViewById(R.id.dueDateDesc02);
                dueDate.setText(globalTaskList.get(0).getDueDate());

                EditText description = findViewById(R.id.descriptionText02);
                description.setText(globalTaskList.get(0).getDescription());

                EditText priority = findViewById(R.id.numPriority02);
                priority.setText(String.format("%d", globalTaskList.get(0).getPriority()));

                //CheckBox completed = findViewById(R.id.checkBox6);
                //completed.setChecked(false);
                //if(completed.isChecked())
                //{
                    //move to completed tasks
                //}
            }

        }
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
