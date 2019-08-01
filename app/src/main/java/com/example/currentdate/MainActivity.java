package com.example.currentdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDate = findViewById(R.id.btn_current_date);


        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date c = Calendar.getInstance().getTime();
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                String formatDate = df.format(c);

                Toast.makeText(MainActivity.this, formatDate, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("date", formatDate);
                startActivity(intent);
            }
        });
    }
}
