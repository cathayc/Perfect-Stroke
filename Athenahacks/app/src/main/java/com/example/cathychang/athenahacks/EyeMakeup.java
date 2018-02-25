package com.example.cathychang.athenahacks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


public class EyeMakeup extends Ultimate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_makeup);

        Button next = findViewById(R.id.nextEyeMakeup);

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(EyeMakeup.this, EyeShadowBrows.class);
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
                    eyelinerWing=true;
                break;
            case R.id.noEyeliner:
                if (checked){
                    eyelinerNightOut=false;
                    eyelinerDaily=false;
                    eyelinerWing=false;
                    eyelinerNone=true;
                }
        }
    }

}
