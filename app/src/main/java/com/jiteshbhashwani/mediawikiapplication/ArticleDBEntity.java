package com.jiteshbhashwani.mediawikiapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = ArticleDBHelper.DB_TABLE_NAME)
public class ArticleDBEntity {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "cover_url")
    String cover_url;
    @ColumnInfo(name = "title")
    String title;
    @ColumnInfo(name = "subText")
    String subText;
    @ColumnInfo(name = "text")
    String text;

    public ArticleDBEntity(String cover_url, String title, String subText, String text) {
        this.cover_url = cover_url;
        this.title = title;
        this.subText = subText;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
