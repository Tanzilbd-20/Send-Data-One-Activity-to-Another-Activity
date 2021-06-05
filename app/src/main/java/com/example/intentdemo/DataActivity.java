package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    private TextView getText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        getText = findViewById(R.id.textView);

        //Creating Bundle so that we can Collect any data from prev easily.
        Bundle extra = getIntent().getExtras();


        //Receiving data from prev activity..
        String name = extra.getString("name");
        String age = extra.getString("age");
        String gender = extra.getString("gender");
        String profession = extra.getString("profession");


        //Setting everything in our textView to Show on the screen.
        getText.setText("Name : " + name + "\nAge : " + age + "\nGender : " + gender + "\nProfession : " + profession);




    }
}