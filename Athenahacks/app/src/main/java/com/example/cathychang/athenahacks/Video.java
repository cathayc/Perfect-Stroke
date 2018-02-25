package com.example.cathychang.athenahacks;

/**
 * Created by shriyanadgauda on 2/24/18.
 */

public class Video {

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

    String url;

    public Video(boolean fLiquid, boolean fPowder, boolean fNone, boolean pFace,
                 boolean pEyes, boolean pNone, boolean cYes, boolean cNo, boolean bYes, boolean bNo,
                 boolean eDaily, boolean eWing, boolean eNight, boolean eNone, boolean mYes,
                 boolean mNo, boolean ebArc, boolean ebGel, boolean ebPencil, boolean ebNone,
                 String link)
    {
        foundationLiquid = fLiquid;
        foundationPowder = fPowder;
        foundationNone = fNone;

        primerFace = pFace;
        primerEyes = pEyes;
        primerNone = pNone;

        contourYes = cYes;
        contourNo = cNo;

        blushYes = bYes;
        blushNo = bNo;

        eyelinerDaily = eDaily;
        eyelinerWing = eWing;
        eyelinerNightOut = eNight;
        eyelinerNone = ebNone;

        mascaraYes = mYes;
        mascaraNo = mNo;

        eyebrowsArc = ebArc;
        eyebrowsGel = ebGel;
        eyebrowsPencil = ebPencil;
        eyebrowsNone = ebNone;

        url = link;
    }

}
