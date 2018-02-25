package com.example.cathychang.athenahacks;

/**
 * Created by shriyanadgauda on 2/24/18.
 */

public class Video {

    private boolean[] videoStats;

    String url;

    public Video(boolean[] inputStats, String link)
    {
        boolean[] videoStats = new boolean [inputStats.length] ;
        for(int i = 0 ; i < inputStats.length; i++){
            this.videoStats[i] = inputStats[i] ;
        }
        url = link;
    }

    public boolean [] getVideo()
    {
        return this.videoStats;

    }

    public String getUrl()
    {
        return this.url;
    }

}
