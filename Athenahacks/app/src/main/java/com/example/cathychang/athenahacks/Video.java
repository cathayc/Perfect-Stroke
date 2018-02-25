package com.example.cathychang.athenahacks;//package com.example.cathychang.athenahacks;

/**
 * Created by shriyanadgauda on 2/24/18.
 */

public class Video {

    private boolean[] videoStats;

    private String url;

    public Video(boolean[] inputStats, String link)
    {
        videoStats = new boolean [inputStats.length] ;
        for(int i = 0 ; i < inputStats.length; i++){
            videoStats[i] = inputStats[i] ;
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

    public String toString()
    {
        return "things";
    }

}