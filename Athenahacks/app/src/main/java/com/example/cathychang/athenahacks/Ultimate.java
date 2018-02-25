package com.example.cathychang.athenahacks;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by shriyanadgauda on 2/24/18.
 */

public class Ultimate extends AppCompatActivity {

    boolean foundationLiquid;
    boolean foundationPowder;
    boolean foundationNone;

    boolean primerFace;
    boolean primerEyes;
    boolean primerNone;

    boolean contourYes;
    boolean contourNo;

    boolean blushYes;
    boolean blushNo;

    boolean eyelinerDaily;
    boolean eyelinerCat;
    boolean eyelinerNightOut;
    boolean eyelinerNone;

    boolean mascaraYes;
    boolean mascaraNo;

    boolean eyebrowsArc;
    boolean eyebrowsGel;
    boolean eyebrowsPencil;
    boolean eyebrowsNone;

    boolean shadowBlack;
    boolean shadowPurple;
    boolean shadowBlue;
    boolean shadowGold;
    boolean shadowRed;
    boolean shadowYellow;
    boolean shadowWhite;

    Video [] videos;

    public Ultimate()
    {
        this.foundationLiquid = false;
        this.foundationPowder = false;
        this.foundationNone = false;

        this.primerFace = false;
        this.primerEyes = false;
        this.primerNone = false;

        this.contourYes = false;
        this.contourNo = false;

        this.blushYes = false;
        this.blushNo = false;

        this.eyelinerDaily = false;
        this.eyelinerCat = false;
        this.eyelinerNightOut = false;
        this.eyelinerNone = false;

        this.mascaraYes = false;
        this.mascaraNo = false;

        this.eyebrowsArc = false;
        this.eyebrowsGel = false;
        this.eyebrowsPencil = false;
        this.eyebrowsNone = false;

        this.shadowBlack = false;
        shadowPurple = false;
        shadowBlue = false;
        shadowGold = false;
        shadowRed = false;
        shadowYellow = false;
        shadowWhite = false;
    }

    public void makeVideos() {
        videos = new Video[6];
        boolean[] temp0 = {true, false, false, true, false,
                false, false, false, true, false, false, false,
                false, false, true, false, false, false,
                false, false, false, false, false, false, false, false, false} ;
        videos[0] = new Video( temp0, "https://www.youtube.com/watch?v=-WlqBjKC0C8");

        boolean[] temp1 = {true, false, false, true, false,
                false, true, false, true, false, true, false,
                false, false, true, false, true, true,
                true, true, false, false, false, false, false, false, false};

        videos[1] = new Video( temp1, "https://www.youtube.com/watch?v=-WlqBjKC0C8");

        boolean[] temp2 = {true, false, false, true, false,
                false, true, false, true, false, true, false,
                false, false, true, false, false, false,
                true, false, true, true, false, true, false, false, false};
        videos[2] = new Video(temp2, "https://www.youtube.com/watch?v=I_h_ssTeLPw");

        boolean[] temp3 = {false, false, false, false, false,
                false, true, false, true, false, false, true,
                false, false, true, false, false, false,
                false, false, false, true, false, true, false, false, false };

        videos[3] = new Video( temp3, "https://www.youtube.com/watch?v=2dcbxPN_OH0");

        boolean[] temp4 = {false, true, false, true, false,
                false, true, false, false, false, false, false,
                true, false, true, false, false, true,
                true, false, false, false, true, true, false, false, false};

            videos[4] = new Video(temp4, "https://www.youtube.com/watch?v=4xt-zjxVGNc");

        boolean[] temp5 = {true, false, false, true, false,
                false, true, false, true, false, false, false,
                false, false, false, false, false, false,
                true, false, false, false, false, true, false, false, false};

        videos[5] = new Video(temp5, "https://www.youtube.com/watch?v=uKR1_Npz87Q");


        }
    /*Finds the video in videos that matches with the current unltimate the most and then returns
        the url for that video*/
    public String bestVideo()
    {
        boolean[] ultimateStats = new boolean [21];
        ultimateStats[0] = this.foundationPowder;
        ultimateStats[1] = this.foundationLiquid;
        ultimateStats[2] = this.foundationNone;
        ultimateStats[3] = this.primerFace;
        ultimateStats[4] = this.primerEyes;
        ultimateStats[5] = this.primerNone;
        ultimateStats[6] = this.contourYes;
        ultimateStats[7] = this.contourNo;
        ultimateStats[8] = this.blushYes;
        ultimateStats[9] = this.blushNo;
        ultimateStats[10] = this.eyelinerDaily;
        ultimateStats[11] = this.eyelinerCat;
        ultimateStats[12] = this.eyelinerNightOut;
        ultimateStats[13] = this.eyelinerNone;
        ultimateStats[14] = mascaraYes;
        ultimateStats[15] = this.mascaraNo;
        ultimateStats[16] = this.eyebrowsArc;
        ultimateStats[17] = this.eyebrowsGel;
        ultimateStats[18] = this.eyebrowsPencil;
        ultimateStats[19] = this.eyebrowsNone;
        ultimateStats[20] = this.shadowBlack;

        int maxCompare = 0;
        int index = 0;
        for(int i = 0; i < videos.length; i++){
            int temp=  compare(videos[i].getVideo(), ultimateStats) ;
            if(temp > maxCompare)
            {
                maxCompare = temp;
                index = i;
            }
         }

        return videos[index].getUrl()  ;
    }

    /*
    Returns the number of matching elements of 2 boolean arrays
     */
    public int compare(boolean[] vid, boolean[] stats)
    {
        int compared = 0;
        for (int i = 0; i < vid.length; i++)
        {
            if(vid[i] == stats[i])
            {
                compared ++;
            }
        }
        return compared;
    }

}

    /*
    CODE FOR VIDEO PLAYING

    btnvideo.setOnClickListener(new OnClickListener() {

public void onClick(View v) {

    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(INSERT STRING URL HERE)));
    Log.i("Video", "Video Playing....");

    }
});
     */