package com.example.cathychang.athenahacks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class BringMeVideo extends Ultimate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bring_me_video);
        Button vid = (Button)findViewById(R.id.VideoBut);

        vid.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(bestVideo())));
                Log.i("Video", "Video Playing....");

            }
        });
    }
}
