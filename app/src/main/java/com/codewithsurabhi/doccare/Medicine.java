package com.codewithsurabhi.doccare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Medicine extends AppCompatActivity {

    Button book9, book10, book11, book12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);

        book9 = (Button) findViewById(R.id.Book9);
        book10 = (Button) findViewById(R.id.Book10);
        book11 = (Button) findViewById(R.id.Book11);
        book12 = (Button) findViewById(R.id.Book12);

        book9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Medicine.this, BookApointment.class);
                startActivity(intent);
            }
        });
        book10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Medicine.this, BookApointment.class);
                startActivity(in);
            }
        });
        book11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Medicine.this, BookApointment.class);
                startActivity(in);
            }
        });
        book12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Medicine.this, BookApointment.class);
                startActivity(in);
            }
        });
    }
}