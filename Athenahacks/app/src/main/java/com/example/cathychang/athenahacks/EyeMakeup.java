package com.example.cathychang.athenahacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class EyeMakeup extends Ultimate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button primer = findViewById(R.id.nextPrimer);

        primer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EyeMakeup.this, Eyeshadow.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View view){
        boolean checked =((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id.nightOut:
                if (checked)
                    eyelinerNightOut=true;
                break;
            case R.id.daytimeEyeliner:
                if (checked)
                    eyelinerDaily=true;
                break;
            case R.id.winged:
                if (checked)
                    primerFace=true;
                break;
            case R.id.noEyeliner:
                if (checked)
                    eyelinerNone=true;
                break;
            case R.id.mascaraYes:
                if (checked)
                    mascaraYes=true;
                break;
            case R.id.mascaraNo:
                if (checked){
                    mascaraYes=false;
                    mascaraNo=true;
                }

        }
    }
}
