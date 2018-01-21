package com.example.android.newsapp;


import java.util.Date;

public class News {

    private String mTitle;

    private String mSection;

    private String mUrl;

    private String mDate;


    public  News (String title, String section, String url, String date){
        mTitle = title;
        mUrl = url;
        mDate = date;
        mSection = section;
    }




    public String getmUrl(){return mUrl;}

    public String getmTitle(){return mTitle;}

    public String getmSection(){return mSection;}

    public String getmDate(){return mDate;}

}
