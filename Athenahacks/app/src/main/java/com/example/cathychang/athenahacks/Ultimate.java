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
        foundationLiquid = false;
        foundationPowder = false;
        foundationNone = false;

        primerFace = false;
        primerEyes = false;
        primerNone = false;

        contourYes = false;
        contourNo = false;

        blushYes = false;
        blushNo = false;

        eyelinerDaily = false;
        eyelinerCat = false;
        eyelinerNightOut = false;
        eyelinerNone = false;

        mascaraYes = false;
        mascaraNo = false;

        eyebrowsArc = false;
        eyebrowsGel = false;
        eyebrowsPencil = false;
        eyebrowsNone = false;

        shadowBlack = false;
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
        ultimateStats[0] = foundationPowder;
        ultimateStats[1] = foundationLiquid;
        ultimateStats[2] = foundationNone;
        ultimateStats[3] = primerFace;
        ultimateStats[4] = primerEyes;
        ultimateStats[5] = primerNone;
        ultimateStats[6] = contourYes;
        ultimateStats[7] = contourNo;
        ultimateStats[8] = blushYes;
        ultimateStats[9] = blushNo;
        ultimateStats[10] = eyelinerDaily;
        ultimateStats[11] = eyelinerCat;
        ultimateStats[12] = eyelinerNightOut;
        ultimateStats[13] = eyelinerNone;
        ultimateStats[14] = mascaraYes;
        ultimateStats[15] = mascaraNo;
        ultimateStats[16] = eyebrowsArc;
        ultimateStats[17] = eyebrowsGel;
        ultimateStats[18] = eyebrowsPencil;
        ultimateStats[19] = eyebrowsNone;
        ultimateStats[20] = shadowBlack;

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