package com.jiteshbhashwani.mediawikiapplication;

public class ArticleModel {
    int cover_id;
    String title;
    String subText;
    String text;

    public ArticleModel(int cover_id, String title, String subText, String text) {
        this.cover_id = cover_id;
        this.title = title;
        this.subText = subText;
        this.text = text;
    }

    public int getCover_id() {
        return cover_id;
    }

    public void setCover_id(int cover_id) {
        this.cover_id = cover_id;
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
