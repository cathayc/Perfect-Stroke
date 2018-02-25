package com.example.cathychang.athenahacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


public class Primer extends Ultimate {

    boolean primerFace;
    boolean primerEyes;
    boolean primerNone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer);
        Button primer = findViewById(R.id.nextPrimer);

        primer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(Primer.this, Contour.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View view){
        boolean checked =((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id.face:
                if (checked)
                    primerFace=true;
                break;
            case R.id.eyeshadow:
                if (checked)
                    primerEyes=true;
                break;
            case R.id.none:
                if (checked){
                    primerFace=false;
                    primerEyes=false;
                    primerNone=true;
                }

        }
    }
}
