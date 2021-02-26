package com.codewithsurabhi.doccare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox Acidity, backPain, BP, coldCough, eyeCheck, earCheck, knee_Pain, Fever;
    Button DoctorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButtonClick();
    }

    private void addListenerOnButtonClick() {
        Acidity = (CheckBox) findViewById(R.id.Acidity);
        backPain = (CheckBox) findViewById(R.id.backPain);
        BP = (CheckBox) findViewById(R.id.BP);
        coldCough = (CheckBox) findViewById(R.id.coldCough);
        eyeCheck = (CheckBox) findViewById(R.id.eyeCheck);
        earCheck = (CheckBox) findViewById(R.id.earCheck);
        knee_Pain = (CheckBox) findViewById(R.id.knee_Pain);
        Fever = (CheckBox) findViewById(R.id.Fever);

        DoctorList = (Button) findViewById(R.id.doclist);

        //Applying the Listener on the Button click
        DoctorList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Acidity.isChecked() || backPain.isChecked() || BP.isChecked() || coldCough.isChecked() || knee_Pain.isChecked() || Fever.isChecked()) {

                    Intent intent = new Intent(MainActivity.this, Medicine.class);
                    startActivity(intent);
                }
                if (eyeCheck.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, Opthamologist.class);
                    startActivity(intent);
                } else if (earCheck.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, ENT.class);
                    startActivity(intent);
                }

            }
        });
    }


}