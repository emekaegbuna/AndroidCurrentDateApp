package com.example.currentdate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView Tv_date = findViewById(R.id.Tv_current_date);

        String today_date = getIntent().getStringExtra("date");

        String head = "Todays date: " + today_date;
        Tv_date.setText( head);
    }
}
