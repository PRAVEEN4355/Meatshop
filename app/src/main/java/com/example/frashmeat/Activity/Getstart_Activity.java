package com.example.frashmeat.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.frashmeat.R;

public class Getstart_Activity extends AppCompatActivity {

    ConstraintLayout getstartbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstart);

        getstartbtn=findViewById(R.id.getstart_btn);
        getstartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Getstart_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}