package com.jiteshbhashwani.mediawikiapplication;

import android.net.Uri;

public class ArticleModel {
    String cover_url;
    String title;
    String subText;
    String text;

    public ArticleModel(String cover_url, String title, String subText, String text) {
        this.cover_url = cover_url;
        this.title = title;
        this.subText = subText;
        this.text = text;
    }

    public String getCover_url() {
        return cover_url;
    }

    public void setCover_url(String cover_url) {
        this.cover_url = cover_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubText() {
        return subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
