package com.example.cathychang.athenahacks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Eyeshadow extends Ultimate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eyeshadow);

        Button btnvideo = (Button)findViewById(R.id.btnVideo);

        btnvideo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

<<<<<<< HEAD
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(bestVideo())));
=======
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=uKR1_Npz87Q")));
>>>>>>> parent of 5d24a3c... update video ultimate
                Log.i("Video", "Video Playing....");

            }
        });
    }
}
