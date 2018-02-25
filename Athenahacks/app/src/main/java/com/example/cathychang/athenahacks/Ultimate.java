package com.example.cathychang.athenahacks;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

//package com.example.cathychang.athenahacks;
/**
 * Created by shriyanadgauda on 2/24/18.
 */

public class Ultimate  extends AppCompatActivity {

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

    ArrayList<Video> videos;

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
        this.shadowPurple = false;
        this.shadowBlue = false;
        this.shadowGold = false;
        this.shadowRed = false;
        this.shadowYellow = false;
        this.shadowWhite = false;

        makeVideos();

    }


    public void makeVideos() {

        videos = new ArrayList<Video> ();

        boolean[] temp0 = {true, false, false, true, false,
                false, false, false, true, false, false, false,
                false, false, true, false, false, false,
                false, false, false, false, false, false, false, false, false} ;
        Video vid = new Video( temp0, "https://www.youtube.com/watch?v=-WlqBjKC0C8");
        videos.add(vid)  ;

        boolean[] temp1 = {true, false, false, true, false,
                false, true, false, true, false, true, false,
                false, false, true, false, true, true,
                true, true, false, false, false, false, false, false, false};

        Video vid1 = new Video( temp1, "https://www.youtube.com/watch?v=-WlqBjKC0C8");
        videos.add( vid1)  ;

        boolean[] temp2 = {true, false, false, true, false,
                false, true, false, true, false, true, false,
                false, false, true, false, false, false,
                true, false, true, true, false, true, false, false, false};

        Video vid2 = new Video(temp2, "https://www.youtube.com/watch?v=I_h_ssTeLPw");
        videos.add(vid2)  ;

        boolean[] temp3 = {false, false, false, false, false,
                false, true, false, true, false, false, true,
                false, false, true, false, false, false,
                false, false, false, true, false, true, false, false, false };

        Video vid3 = new Video( temp3, "https://www.youtube.com/watch?v=2dcbxPN_OH0");
        videos.add( vid3)  ;

        boolean[] temp4 = {false, true, false, true, false,
                false, true, false, false, false, false, false,
                true, false, true, false, false, true,
                true, false, false, false, true, true, false, false, false};

        Video vid4 = new Video(temp4, "https://www.youtube.com/watch?v=4xt-zjxVGNc");
        videos.add(vid4)  ;

        boolean[] temp5 = {true, false, false, true, false,
                false, true, false, true, false, false, false,
                false, false, false, false, false, false,
                true, false, false, false, false, true, false, false, false};

        Video vid5 = new Video(temp4, "https://www.youtube.com/watch?v=uKR1_Npz87Q");
        videos.add( vid5)  ;


        boolean[] temp6 = {false, false, false, false, false,
                false, false, false, false, false, false, false,
                false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false};

        Video vid6 = new Video(temp6, "https://www.youtube.com/watch?v=ZoGe4m_W9_Y");
        videos.add( vid6)  ;


    }
    /*Finds the video in videos that matches with the current unltimate the most and then returns
        the url for that video*/
    public String bestVideo()
    {
        boolean[] ultimateStats = new boolean [27];
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
        ultimateStats[14] = this.mascaraYes;
        ultimateStats[15] = this.mascaraNo;
        ultimateStats[16] = this.eyebrowsArc;
        ultimateStats[17] = this.eyebrowsGel;
        ultimateStats[18] = this.eyebrowsPencil;
        ultimateStats[19] = this.eyebrowsNone;
        ultimateStats[20] = this.shadowBlack;
        ultimateStats[21] = this.shadowPurple;
        ultimateStats[22] = this.shadowBlue;
        ultimateStats[23] = this.shadowGold;
        ultimateStats[24] = this.shadowRed;
        ultimateStats[25] = this.shadowYellow;
        ultimateStats[26] = this.shadowWhite;

        int maxCompare = 0;
        int index = 0;
        for(int i = 0; i < videos.size(); i++){
            int temp=  compare(videos.get(i).getVideo(), ultimateStats) ;
            if(temp > maxCompare)
            {
                maxCompare = temp;
                index = i;
            }
        }

        return videos.get(index).getUrl()  ;
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

    public static void main(String[] args)
    {
        Ultimate test = new Ultimate ();
        String vid = test.bestVideo();
        System.out.println(vid);


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