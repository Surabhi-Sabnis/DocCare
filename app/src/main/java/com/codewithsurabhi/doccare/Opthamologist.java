package com.codewithsurabhi.doccare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Opthamologist extends AppCompatActivity {
    Button book1, book2, book3, book4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opthamologist);
        book1 = (Button) findViewById(R.id.Book1);
        book2 = (Button) findViewById(R.id.Book2);
        book3 = (Button) findViewById(R.id.Book3);
        book4 = (Button) findViewById(R.id.Book4);

        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Opthamologist.this, BookApointment.class);
                startActivity(intent);
            }
        });
        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Opthamologist.this, BookApointment.class);
                startActivity(in);
            }
        });
        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Opthamologist.this, BookApointment.class);
                startActivity(in);
            }
        });
        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Opthamologist.this, BookApointment.class);
                startActivity(in);
            }
        });
    }
}