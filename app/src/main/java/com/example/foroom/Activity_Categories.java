package com.example.foroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.json.JSONException;


public class Activity_Categories extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        Intent intent = new Intent(this, Activity_Topics.class);


        Button button = findViewById(R.id.buttonTopics);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        Category cat = new Category();

        try {
            Category category = cat.getCategory(this);
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }


}