package com.example.cathychang.athenahacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Contour extends Ultimate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contour);
        Button contour = findViewById(R.id.nextContour);

        contour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(Contour.this, EyeMakeup.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View view){
        boolean checked =((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id.contourYes:
                if (checked)
                    contourYes=true;
                break;
            case R.id.contourNo:
                if (checked)
                    contourNo=true;
                break;
            case R.id.blushYes:
                if (checked)
                    blushYes=true;
                break;
            case R.id.blushNo:
                if (checked){
                    blushNo=true;
                }

        }
    }
}
