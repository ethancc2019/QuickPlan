package com.example.qp;

<<<<<<< HEAD
import android.support.v4.*;
=======
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
>>>>>>> eca593115dac218d585842ce4188fc5c9dbbb9ab
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateTask extends AppCompatActivity {

<<<<<<< HEAD
    protected void onCreate(Bundle savedInstanceState) {
=======
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
>>>>>>> eca593115dac218d585842ce4188fc5c9dbbb9ab
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task);


        Button saveTaskBtn = findViewById(R.id.saveTaskButton);

        saveTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Task newTask = new Task();
                goBackToHomepage();

//                EditText taskName = (EditText) findViewById(R.id.taskName);
//                EditText priority = (EditText) findViewById(R.id.priorityNum);
//                EditText taskNotes = (EditText) findViewById(R.id.taskNotes);
//                EditText dueDate = (EditText) findViewById(R.id.taskDueDate);
//
//                newTask.setTaskName(taskName.getText().toString());
//                newTask.setPriority(Integer.parseInt(priority.toString()));
//                newTask.setDescription(taskNotes.getText().toString());
//                //Need to be able to save the date object. Will keep as string for now
//                //newTask.setDueDate();
//                saveTask(newTask);

            }



        });

    }

    public void saveTask(Task newTask){
        //Save task in some sort of array list.
    }

    public void goBackToHomepage(){
        startActivity(new Intent(CreateTask.this, MainActivity.class));
    }

    public void Test()
    {
        //new methodssssss

    }
}
