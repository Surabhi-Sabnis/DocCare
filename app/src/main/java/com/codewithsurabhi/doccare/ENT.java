package com.codewithsurabhi.doccare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codewithsurabhi.doccare.R;

public class ENT extends AppCompatActivity {
    Button book5, book6, book7, book8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_n_t);
        book5 = (Button) findViewById(R.id.Book5);
        book6 = (Button) findViewById(R.id.Book6);
        book7 = (Button) findViewById(R.id.Book7);
        book8 = (Button) findViewById(R.id.Book8);

        book5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ENT.this, BookApointment.class);
                startActivity(intent);
            }
        });
        book6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ENT.this, BookApointment.class);
                startActivity(in);
            }
        });
        book7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ENT.this, BookApointment.class);
                startActivity(in);
            }
        });
        book8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ENT.this, BookApointment.class);
                startActivity(in);
            }
        });
    }
}