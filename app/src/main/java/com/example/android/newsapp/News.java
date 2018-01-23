package com.example.android.newsapp;


public class News {

    private String mTitle;

    private String mSection;

    private String mUrl;

    private String mDate;

    private String mAuthor;


    public News(String title, String section, String url, String date, String author) {
        mTitle = title;
        mUrl = url;
        mDate = date;
        mSection = section;
        mAuthor = author;
    }


    public String getmUrl() {
        return mUrl;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmSection() {
        return mSection;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmAuthor() {
        return mAuthor;
    }

}
