package com.example.cathychang.athenahacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Foundation extends AppCompatActivity {

    boolean foundationLiqud = false;
    boolean foundationPowder = false;
    boolean foundationNone = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foundation);

        Button primer = (Button)findViewById(R.id.nextPrimer);

        primer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(Foundation.this, Primer.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View view){
        boolean checked =((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id.liquid:
                if (checked)
                    foundationLiqud=true;
                break;
            case R.id.powder:
                if (checked)
                    foundationPowder=true;
                break;
            case R.id.none:
                if (checked){
                    foundationPowder=false;
                    foundationLiqud=false;
                    foundationNone=true;
                }
            
        }
        System.out.print(foundationLiqud);
    }


}
