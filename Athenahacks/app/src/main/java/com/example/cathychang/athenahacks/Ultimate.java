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
    boolean eyelinerWing;
    boolean eyelinerNightOut;
    boolean eyelinerNone;

    boolean mascaraYes;
    boolean mascaraNo;

    boolean eyebrowsArc;
    boolean eyebrowsGel;
    boolean eyebrowsPencil;
    boolean eyebrowsNone;

    private Video [] videos;

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
        eyelinerWing = false;
        eyelinerNightOut = false;
        eyelinerNone = false;

        mascaraYes = false;
        mascaraNo = false;

        eyebrowsArc = false;
        eyebrowsGel = false;
        eyebrowsPencil = false;
        eyebrowsNone = false;
    }

    public void makeVideos() {
        videos = new Video [10] ;

    }




}
