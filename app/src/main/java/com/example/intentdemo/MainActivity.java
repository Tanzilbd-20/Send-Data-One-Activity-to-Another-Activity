package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button submit_button;
    private EditText name_edit_text, age_edit_text, gender_edit_text, profession_edit_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit_button = findViewById(R.id.button);
       name_edit_text = findViewById(R.id.name_edit_text);
       age_edit_text = findViewById(R.id.age_edit_text);
       gender_edit_text = findViewById(R.id.gender_edit_text);
       profession_edit_text = findViewById(R.id.profession_edit_text);



       //Setting onClick Listener for our submit button..
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Collecting data from all the edittext fields.
                String name = name_edit_text.getText().toString().trim();
                String age = age_edit_text.getText().toString().trim();
                String gender =gender_edit_text.getText().toString().trim();
                String profession = profession_edit_text.getText().toString().trim();

                //Setting a condition so that no field is empty..
                if (!name.isEmpty() && !age.isEmpty() && !gender.isEmpty() && !profession.isEmpty()) {

                    //Setting our Intent to jump MainActivity to DataActivity..
                    Intent intent = new Intent(MainActivity.this, DataActivity.class);

                    //Setting our data for send to another Activity..
                    intent.putExtra("name", name);
                    intent.putExtra("age", age);
                    intent.putExtra("gender", gender);
                    intent.putExtra("profession", profession);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Please Fulfill All The Fields", Toast.LENGTH_SHORT).show();
                }
                
               
            }
        });
    }
}