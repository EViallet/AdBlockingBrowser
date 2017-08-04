package com.gueg.browser;


import android.graphics.Bitmap;

class Bookmark {

    Bookmark(String name, String url, Bitmap pic) {
        mName = name;
        mUrl = url;
        mPic = pic;
    }

    Bookmark(String name, String url) {
        mName = name;
        mUrl = url;
    }

    private String mName;
    private String mUrl;
    private Bitmap mPic;

    String getName() {
        return mName;
    }

    String getUrl() {
        return mUrl;
    }

    Bitmap getPic() {
        return mPic;
    }

    @Override
    public String toString() {
        return mName;
    }

}